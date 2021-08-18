package day13;

import java.util.Calendar;
import java.util.Scanner;

class Constructor01{
	Constructor01(){
		//default 생성자
		System.out.println("생성자 실행");
	}
	public Constructor01(String s){
		//default 생성자
		System.out.println(s+"생성자 실행");
	}
	public void test(String s) {
		System.out.println(s+"test 실행");
	}
	public void test() {
		System.out.println("기본테스트 ");
	}
}

class Constructor02{
	private int age;
	public Constructor02(int age) {
		this.age=age-1;
	}
	public int getAge() {
		return age;
	}
}

class Singleton01{
	public int num;
}

class Singleton02{
	private static Singleton02 si;
	public Singleton02() {
		System.out.println("기본 생성자 실행y");
	}
	public static Singleton02 getInstance() {
		System.out.println("si : "+si);
		if(si==null) {
			return new Singleton02();
		}
		return si;
	}
}



public class Ex01 {
	public static void main(String[] args) {
		Constructor01 con=new Constructor01("생성자");
		Constructor01 cone=new Constructor01();
		con.test("tiger");
		con.test();
		
		//2
		Scanner input =new Scanner(System.in);
		System.out.println("나이 입력");
		int age=input.nextInt();
		Constructor02 con2=new Constructor02(age);
		System.out.println("나이 : "+con2.getAge());
		
		//3싱글톤 
		Singleton01 si1 =new Singleton01();
		Singleton01 si2 =si1; //new Singleton01();
		si1.num=12345;
		si2.num=54321;
		System.out.println("si1.num : "+si1.num);
		System.out.println("si2.num : "+si2.num);
		System.out.println("si1: "+si1);
		System.out.println("si2: "+si2);
		Calendar cal=Calendar.getInstance();
		
		//4
		Singleton02 sia1 =new Singleton02();
		System.out.println("sia1 : "+sia1);
		Singleton02 sia2 =new Singleton02();
		System.out.println("sia2 : "+sia2);
		Singleton02 sia3 =Singleton02.getInstance();
		System.out.println("sia3 : "+sia3);
		Singleton02 sia4 =Singleton02.getInstance();
		System.out.println("sia4 : "+sia4);
		
	}
}















