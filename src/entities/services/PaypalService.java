package entities.services;

public class PaypalService implements OnlinePaymentService{

	public Double paymentFee(Double amount)
	{
		Double value = amount + (amount * 0.02);
		System.out.println(value);
		return value;
	}
	
	public Double interest(Double amount, Integer months)
	{
		return amount + (amount * 0.01 * months);
	}
}
