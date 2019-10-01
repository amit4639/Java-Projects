package com.hcl.interf;

interface ITtraining
{
	void name();
	void email();
}
class Hema implements ITtraining
{

	@Override
	public void name()
	{
		System.out.println("Name is Hema");
	
		
	}

	@Override
	public void email() 
	{
		System.out.println("Email is hema@gmail.com");
		
	}
	
}
class Keerthna implements ITtraining
{

	@Override
	public void name() {
		System.out.println("name is keerathna");
		
	}

	@Override
	public void email() 
	{
		System.out.println("email is kee@gmail.com");
		// TODO Auto-generated method stub
		
	}
	
}
public class IntfDemo {

	public static void main(String[] args)
	{
		ITtraining t[]=new ITtraining[]{new Hema(),new Keerthna()};
		for (ITtraining i : t) 
		{
			i.name();
			i.email();
			
			
		}

		// TODO Auto-generated method stub

	}

}
