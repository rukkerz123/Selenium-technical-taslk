package javatechnicaltask;

import java.util.ArrayList;
import java.util.HashSet;

public class removeduplicatesinarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(10);
		a1.add(20);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		System.out.println(a1);
		HashSet set = new HashSet(a1);
		System.out.println(set);
		
			
		}

	}


