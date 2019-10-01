package com.hcl.interf;

interface IFirst
{
	default void name()
	{
		System.out.println("name of IFirst");
	}
}
interface ISecond
{
	default void name()
	{
		System.out.println("ISecond");
	}
}
interface IThird
{
	default void name()
	{
		System.out.println("IThird");
	}
	
}
class Test5 implements IFirst,ISecond,IThird
{

	@Override
	public void name() 
	{
		IFirst.super.name();
		ISecond.super.name();
		IThird.super.name();
		
	}
	
}
public class Intftest {

	public static void main(String[] args)
	{
		new Test5().name();
		// TODO Auto-generated method stub

	}

}
