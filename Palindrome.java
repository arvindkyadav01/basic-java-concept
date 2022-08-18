/*
program:Write a program to check the number is palindrome or not   
@auther:arvind k yadav
@Date=18 august 2022
*/

public class Palindrome 

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPalindrome();
	}
	static void checkPalindrome()
	{
		int num=121,res=0,num2=0,temp=0,num1;
		while(num>0)
		{
			num1=num%10;
			res=(res*10) + num1;
		    num=num/10;
			
		}
		if(res==temp)
		{
			System.out.println("Entered number is Palindrom "+num);
		}
	    else
	    {
				System.out.println("Entered number is not a Palindrom "+num);
		}
		
	}

}
