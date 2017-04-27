package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] intArray = new int[ 5 ]; //배열 선언
		double sum = 0; //합계 변수
		//스캐너 배열 을 받아 배열에 저장 . for문
		
		System.out.println( "5개의 숫자를 입력하세요." ); //출력
		
		for(int i=0;i<intArray.length;i++){ //배열에 입력과 동시에 합계 변수에 넣음.
			sum =sum+scanner.nextDouble();	
		}
		/* 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드 */
		
		//for문 평균 
//		for(int i=0;i<intArray.length;i++){
//			sum +=intArray[i];
//		}
		/* 배열에 저장된 정수 값 더하기 */
		// for(int v : intarray)
//		
//		for(int v : intArray){
//			sum+=intArray[v];
//		}
		sum=sum/intArray.length; //합계를 나눈 평균
		/* 출력 */
		System.out.println("평균은 : "+sum); //결과값 출력.
		
		/* 자원정리 */
		scanner.close();
	}
}
