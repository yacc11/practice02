package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int[] arrayPrint = { 0,0,0,0,0,0,0,0,0,0}; //화폐의 저장하기 위한 배열
		Scanner scanner = new Scanner( System.in  ); 
		
		int str = scanner.nextInt(); //금액을 입력 받는 변수
		int mok=0,namuge=0; //몫과 나머지
		
		System.out.println("금액 : "+str); //입력 받은 금액 출력
		
		for(int i=0;i<10;i++){ //화폐 갯수를 처리하는 로직
			mok = str/MONEYS[i]; //화폐 갯수 처리
			//System.out.println(mok);
			arrayPrint[i]=mok; //갯수를 저장
			//System.out.println(arrayPrint[i]);
			namuge = str - mok*MONEYS[i]; //남은 금액 파악하기 위한 처리
			//System.out.println(namuge);
			str= namuge; //남은 금액을 다시 str변수에 저장
			//System.out.println(str);
		}
		for(int i=0;i<10;i++){//저장된 배열을 출력
			
			System.out.print(MONEYS[i]+" 원   :  ");
			
			System.out.println(arrayPrint[i]+" 개");
		}
		
		// 몫과 나머지를 사용
		//scanner.close();
 	}
}