package com.epam.HomeTask_6;
import java.util.Scanner;

	public class PerformListOperation {
		static Scanner sc = new Scanner(System.in);
		public static void add(CustomList<Object> list) { 
			System.out.println("Enter the datatype to be inserted");
			System.out.println("1.Integer");
			System.out.println("2.String");
			System.out.println("3.Double");
			System.out.println("4.Float");
			int value = sc.nextInt();
			switch(value) {
			case 1:
				System.out.println("Enter integer value");
				list.add(sc.nextInt());
				break;
			case 2:
				System.out.println("Enter string value");
				list.add(sc.next());
				break;
			case 3:
				System.out.println("Enter double value");
				list.add(sc.nextDouble());
				break;
			case 4:
				System.out.println("Enter float valule");
				list.add(sc.nextFloat());
				break;
			default:
				System.out.println("Enter valid input");
			}
		}

}
