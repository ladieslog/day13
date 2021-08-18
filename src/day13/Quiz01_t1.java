package day13;

import java.io.IOException;

import java.util.Scanner;

public class Quiz01_t1 {

	public static void main(String[] args) {
		Login_tap log =new Login_tap();
		
		int b=log.login();
		if(b==1) {
			Scanner input =new Scanner(System.in);
			System.out.print("명령어 입력해주세요 : ");
			String s =input.next();
			
			ProcessBuilder pro =new ProcessBuilder(s);
			long time =System.currentTimeMillis();
			try {	
				Thread.sleep(10000);
				pro.start();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
