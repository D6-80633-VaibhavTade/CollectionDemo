package com.vaibhav;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Mumbai");
		list.add("Pune");
		list.add("Banglore");
		list.add("Delhi");
		//System.out.println(list);
		list.stream().forEach(x-> System.out.println(x));
		}
	}


