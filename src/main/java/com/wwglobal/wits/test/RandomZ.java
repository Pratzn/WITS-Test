package com.wwglobal.wits.test;

import java.util.Random;

public class RandomZ {

	private static final int[] raise = new int[] { 2, 1, 3, 1, 1, 1, 2, 1, 1, 3, 1, 2, 1, 1, 1, 2 };

	public static void main(String[] args){
		Random ran = new Random();
		if(ran.nextBoolean()){
			
			System.out.println("Blue");
			
		}else{
			
			System.out.println("Red");
			
		}
		
		System.out.println(raise[ran.nextInt(15)]);
	}

}
