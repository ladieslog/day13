package day13;

class Calc01{
	public Calc01(String s) {
		System.out.println("calc 부모 생성자");
	}
	public void disply() {
		System.out.println("나는 계산기야");
	}
}
class Computer01 extends Calc01{
	
	public Computer01(){
		super("값 전달");
		System.out.println("com 자식 생성자");
	}
	public void print() {
		System.out.println("나는 컴퓨터야 ");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Calc01 cal=new Calc01("전달 삐삑");
		Computer01 com=new Computer01();
		cal.disply();
		com.print(); com.disply();
	}
}
