package day2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		/*int x=10;
		x=20;
		System.out.println(x);*/
		
		List<String>x= new ArrayList<>();
		x.add("Hello");
		x.add("Hii");
		x.add("Chello");
		x.add("Pollo");
		
		for(int i=0;i<x.size();i++)
		{
			System.out.println(x.get(i));
		}
		
		
		

	}

}
