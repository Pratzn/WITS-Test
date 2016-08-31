package com.wwglobal.wits.test;

import java.awt.Toolkit;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			Toolkit.getDefaultToolkit().beep();
			System.out.println("Beep");
			Thread.sleep(1000);
		}
	}

}
