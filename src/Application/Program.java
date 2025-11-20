package Application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.services.ContractService;

public class Program {

	public static void main(String[] args) {
		Program mainProgramn = new Program();
		mainProgramn.start();
	}
	
	private void start()
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the contract informations:"); 
		System.out.println("Number: ");
		Integer contractNumber = readInt(sc);
		System.out.println("Date (dd/MM/yyyy): ");
		LocalDate date = readDate(sc);
		System.out.println("Contract value: ");
		Double contractValue = readDouble(sc);
		System.out.println("Contract installment numbers: ");
		Integer contractInstallment = readInt(sc);
		
		ContractService contractServe = new ContractService();
		Contract contract = new Contract(contractNumber,date,contractValue);
		contractServe.processContract(contract,contractInstallment);
		System.out.println(contract.toString());
		
		sc.close();
	}
	private Double readDouble(Scanner sc)
	{
		try
		{
			return Double.parseDouble(sc.nextLine());
		}
		catch(Exception e)
		{
			System.out.println("Invalid value, please enter a valid value!");
			return readDouble(sc);
		}
	}
	private LocalDate readDate(Scanner sc)
	{
		try
		{
			DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate date = LocalDate.parse(sc.nextLine(), formatter);
			return date;
		}
		catch(Exception e)
		{
			System.out.println("Invalid Date, please enter a valid Date!");
			return readDate(sc);
		}
	}
	private Integer readInt(Scanner sc)
	{
		try
		{
			return Integer.parseInt(sc.nextLine());			
		}
		catch (Exception e)
		{
			System.out.println("Invalid Number,please enter a valid number!");	
			return readInt(sc);
		}	
	}
}
