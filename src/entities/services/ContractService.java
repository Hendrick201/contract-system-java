package entities.services;


import entities.Contract;
import entities.Installment;

public class ContractService {
	public void processContract(Contract contract, Integer months)
	{
		OnlinePaymentService paymentService = new PaypalService();
		Double installmentPrice = contract.getTotalValue() / months;
		for(int i = 1; i <= months; i++)
		{
			  double updatedAmount = paymentService.interest(installmentPrice, i);
			    double fullAmount = paymentService.paymentFee(updatedAmount);

			    contract.getInstallments().add(new Installment(contract.getDate().plusMonths(i), fullAmount));
		}
	}
}
