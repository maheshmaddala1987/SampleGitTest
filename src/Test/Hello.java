package Test;

public class Hello {
	
	public Hello()
	{
		
	}
	
	public static int sum(int num1 ,int num2)
	{
		return num1+num2;
	}

	public static void main(String[] args) {
		
		System.out.println("Hello world");
		int add=sum(10,11);
		System.out.println(add);
		
	}

}
