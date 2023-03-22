package com.cjc.calculator.client;
import java.util.Scanner;

import com.cjc.calculator.serviceImpl.Operation;
public class Test

{
	public static void main(String args[]){
		//Give the proper msg to call calculator methods
		
		Operation o=new Operation();
		Scanner sc=new Scanner(System.in);
		 System.out.println("  *~*~*CALCULATOR*~*~*");
		 System.out.println("-------------------------------");
		 System.out.println("1.Addition");
		 System.out.println("2.Subtraction");
		 System.out.println("3.Multiplication");
		 System.out.println("4.Division");
		 System.out.println("5.Exit");
		 System.out.println();
		 while(true) {
			 System.out.println();
		 System.out.print("Select any  option  :  ");
		 
		
		 int a=sc.nextInt();
		 
		
		switch(a)
		{
		case 1:
			o.add();
		break;
		
		case 2:
			o.sub();
			break;
			
		case 3:
			o.mul();
			break;
			
		case 4:
			o.div();
			break;
			
		case 5:
		 System.exit(0);
		 break;
		 
		 default:
			 System.out.println("enter valid case");
	}
		
		 }	//Only call Operation class methods here
		}
   	 }

