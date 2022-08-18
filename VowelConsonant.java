/*
	program:Write a program to check the input is vowel,consonant,number,or special character and print its ascii value 
	@auther:arvind k yadav
	@Date=18 august 2022
*/
public class VowelConsonant {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		checkCharacter();
	}
	
	static void checkCharacter()
	{
	      char ch='b';
		  int num=5;
		  String symbol="@";
		  if(ch=='a'||ch=='e'|| ch=='i'|| ch=='o'||ch=='u')
		  {
			  System.out.println(ch+" is a vowel");
		  }
		  else
		  {
			  System.out.println(ch+" is a consonant");
		  }
		  if(num==0 || num==1 || num==2 || num==3 || num==4 || num==5 || num==6 || num==7 || num==8 || num==9) 
		  {
			  System.out.println(num+" is a numeric");
	      }
		  if(symbol=="@" ||symbol=="!" ||symbol=="#" ||symbol=="$" ||symbol=="&" ||symbol=="*")
		  {
			  System.out.println(symbol+" is a special character");
		  }
	   
	}

}
