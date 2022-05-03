package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	List<Goods> gList = new	ArrayList<Goods>();
    	
    	int sum=0;
    	System.out.println("상품을 입력해주세요(종료 q)");
    	
    	while(true) {
    		String items = sc.nextLine();
    		if(items.equals("q")) {
    			System.out.println("[입력완료]");
    			System.out.println("=======================");
    			break;
    		}else {
    		String[] itemsArr = items.split(",");
    		String name = itemsArr[0];
    		int price = Integer.parseInt(itemsArr[1]);
    		int count = Integer.parseInt(itemsArr[2]);
    		
    		Goods goods = new Goods(name,price,count);
    		gList.add(goods);
    		sum+=count;
    		}
    	}
    	
    	for(int i=0; i<gList.size(); i++) {
    		gList.get(i).showInfo();
    	}
    	
    	System.out.println("모든 상품의 개수는 "+sum+"개 입니다.");
    	
    	
    	
       sc.close();
    }

}
