package day13;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

import java.util.Scanner;

public class Login_tap {
	Scanner input =new Scanner(System.in);
	private String idNum="kim", psNum="ps1234";
	public int  login() {


		String id="1",ps="2";
		String idk="2",psk="3";
		HashSet aryId =new HashSet();
		HashSet aryPs =new HashSet();
		
		int a,b=1;
		while (true) {
			System.out.println("1. 계정있어 로그인 합니다. \n 2.회원가입 ");
			a=input.nextInt();
			if(a==1) {
				System.out.println("넵 로그인을 하셔야 합니다. ");
				System.out.print("id가 뭔가요? : ");
				id=input.next();
				System.out.print("password가 뭔가요: ");
				ps=input.next(); break;
			
			}else if(a==2) {
				System.out.print("회원가입 입니다. 아이디 입력해주세요 ");
				idk=input.next();
				System.out.print("비밀번호를 추가해주세요 ");
				psk=input.next();
				aryId.add(idk); aryPs.add(psk);
				
			}
		}	
		
		System.out.println(idk +""+ psk);
		System.out.println(aryId +" "+ aryPs);
		System.out.println(id+" "+ps);
		
		Iterator itid = aryId.iterator();
        Iterator itpw = aryPs.iterator();
        
        while(itid.hasNext()) {
           if(id.equals(itid.next())) {
              while(itpw.hasNext()) {
                 if(ps.equals(itpw.next())) {
                    return 1;
                 }
              }
           }
        }
        System.out.println("잘못되셨습니다. ");
        return 0;
	}
	public void display() {
		System.out.println("id : "+idNum+"\npassword : "
				+psNum);
	}
}
