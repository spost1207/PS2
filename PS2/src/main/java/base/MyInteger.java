package base;

public class MyInteger {
	
	private int iValue;
	
	public MyInteger(int iValue) {
		this.iValue = iValue;
	}
	
	public int getiValue() {
		return this.iValue;
	}
	
	public void setiValue(int realvalue) 
	{ 
		this.iValue = realvalue;
	}
	public boolean isEven() {
		if (iValue % 2 == 0)
			return true;
		else 
			return false;
	}
	
	public boolean isOdd() {
		if (iValue % 2 != 0)
			return true;
		else
			return false;
	}
	
	public boolean isPrime() {
		int starting_number = 2;
		
		while(starting_number <= Math.sqrt(iValue)) {
			if (iValue % starting_number == 0)
			{
				return false;
			}
			else 
			{ 
				starting_number++;
			}
		}
		return true;
		
	}
	
	public static boolean isEven(int number) {
		if (number % 2 == 0) 
			return true;
		else 
			return false;
	}
	
	public static boolean isOdd(int number) {
		if (number % 2 != 0)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(int number) {
		int starting_number = 2;
		
		while (starting_number <= Math.sqrt(number)) {
			if (number % starting_number ==0)
			{
				return false;
			}
			else
			{
				starting_number++;
			}
		}
		
		return true;
	}
	
	public static boolean isEven(MyInteger number) {
		if (number.getiValue() % 2 == 0) 
			return true;
		else 
			return false;	
	}
	
	public static boolean isOdd(MyInteger number) {
		if (number.getiValue() % 2 != 0)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(MyInteger number) {
		int starting_number = 2;
		
		while(starting_number <= Math.sqrt(number.getiValue())) {
			if (number.getiValue() % starting_number == 0) {
				return false;
			}
			else 
			{
				starting_number++;
			}
		}
		 return true;
	}
	
		public boolean equals(int number) {
		if (number == getiValue())
			return true;
		else
			return false;
	}
	
	public boolean equals(MyInteger number) { 
		if (number.getiValue() == getiValue())
			return true;
		else 
			return false;
	}
	//Myinteger class i added
}
