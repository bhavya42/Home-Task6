package com.epam.HomeTask_6;
import java.util.List;
import java.util.Scanner;

	public class CustomCollectionList {

			
		static void takeInput() {
			CustomList<Object> list = new CustomList<Object>();
			boolean flag = true;
			Scanner sc = new Scanner(System.in);
			while(flag) {
				System.out.println("Enter the operation you want to perform");
				System.out.println("1.Add an element to the list");
				System.out.println("2.Fetch the element");
				System.out.println("3.Removing an element");
				System.out.println("4.Print the values");
				System.out.println("5.Size of the list");
				System.out.println("6.Exit");
				int value = sc.nextInt();
				switch(value) {
				case 1:
					PerformListOperation p = new PerformListOperation();
					p.add(list); 
					System.out.println("Successfully added an element");
					break;
				case 2:
					System.out.println("Enter the index of the element to be retrived");
					int index = sc.nextInt();
					System.out.println("The element at index " + index + " is " + list.get(index));
					break;
				case 3:
					System.out.println("Enter the index of the element to be removed from the list");
					int indexToBeRemoved = sc.nextInt();
					list.remove(indexToBeRemoved);
					System.out.println("Successfully removed the element at index " + indexToBeRemoved);
					break;
				case 4:
					System.out.println("The elements of list are " + list);
					break;
				case 5:
					System.out.println("The length of the list is " + list.size());
					break;
				case 6:
					flag = false;
					break;
				default:
					System.out.println("Enter valid input");
				}
			}
		}
		
	}



