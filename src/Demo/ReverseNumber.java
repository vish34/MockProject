package Demo;


public class ReverseNumber {

	public static void main(String[] args) {
		
		int Remainder, Reverse=0, Number=241, temp;
		temp=Number;
		while(Number>0) //while(number!=0)
		{
			Remainder = Number%10;
			Reverse = Reverse*10 + Remainder;
			Number = Number/10;
		}
		
		System.out.println("Reverse number is "+Reverse);
		
		if(Reverse==temp)
		{
			System.out.println("Number is palindrome");
		}
		
		else
		{
			System.out.println("Number is not palindrome");
		}

	}

}