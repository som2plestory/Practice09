package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	List<Friend> fList = new ArrayList<Friend>();
    	
		String s01 = sc.nextLine();
		String[] s01Arr =s01.split(" ");
		Friend f01 = new Friend(s01Arr[0],s01Arr[1],s01Arr[2]);

		String s02 = sc.nextLine();
		String[] s02Arr =s02.split(" ");
		Friend f02 = new Friend(s02Arr[0],s02Arr[1],s02Arr[2]);
		
		String s03 = sc.nextLine();
		String[] s03Arr =s03.split(" ");
		Friend f03 = new Friend(s03Arr[0],s03Arr[1],s03Arr[2]);

    	fList.add(f01);
    	fList.add(f02);
    	fList.add(f03);
    	
    	for(int i=0; i<fList.size(); i++) {
    		fList.get(i).showInfo();
    	}
    

    	sc.close();
    	
    }

}
