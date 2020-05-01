
public class Methods {
	
	void fun(int x)
	{
	int result = x*x;
	System.out.println(">> result is: "+result);
	}
	
	static void funAgain(int x)
	{
	int result = x*x;
	System.out.println(">> result is: "+result);
	}
	
	double applyPromoCode(int promoCode,double amount)
	{
		double amountToPay =0;
		if(promoCode==1001)
		{
			amountToPay=amount-0.5*amount;
			System.out.println("Promo code applied");
		} else {
			System.out.println("Promo code Not Applicable");
			amountToPay=amount;
		}
		return amountToPay;
	}
	
	static double applyPromoCodeAgain(int promoCode,double amount)
	{
		double amountToPay =0;
		if(promoCode==1001)
		{
			amountToPay=amount-0.5*amount;
			System.out.println("Promo code applied");
		} else {
			System.out.println("Promo code Not Applicable");
			amountToPay=amount;
		}
		return amountToPay;
	}
	
	void addNumbers(int num1,int num2) {
		System.out.println(">> result is: "+(num1+num2));
	}
	
	static void addNumbersAgain(int num1,int num2) {
		System.out.println(">> result is: "+(num1+num2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods f = new Methods();
		f.fun(3);
		f.addNumbers(3,5);
		double result=f.applyPromoCode(1001,20.5);
		System.out.println(">> promo code applied "+result);
		
		Methods.funAgain(20);
		result=Methods.applyPromoCodeAgain(1001, 560.56);
		Methods.addNumbersAgain(11, 22);

	}

}
