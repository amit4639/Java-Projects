package com.hcl.interf;
interface IOne
{
	void name();
}
interface ITwo
{
	void email();
}
class test implements IOne,ITwo
{

	@Override
	public void email()
	{
		System.out.println("hi");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}
	
}
public class MultiInh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
