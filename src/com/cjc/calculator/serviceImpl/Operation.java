package com.cjc.calculator.serviceImpl;
import com.cjc.calculator.service.Calculator;
public class Operation implements Calculator {
	//Implements all methods here
	public void add()
	{
		System.out.println("The Addition is = "+(a+b));
		
	}
	public void sub()
	{
		System.out.println("The Subtraction is = "+(a-b));
		
	}
	public void mul()
	{
		System.out.println("The Multiplication is = "+a*b);
	}
	public void div()
	{
		System.out.println("The Division is = "+a/b);
	}
}
