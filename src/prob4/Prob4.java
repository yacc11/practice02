package prob4;
public class Prob4 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" ); //거꾸로 변환할 문장
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {//문자열 입력
		/* 코드를 완성합니다 */
		char[] c2 = str.toCharArray();//변환
		char temp; //바꾸기 위한 임시 변수
		int j=str.length(); //최대길이 

		for(int i=0;i<c2.length/2+1;i++){ //문자열을 바꿈
			temp = c2[i];
			c2[i]=c2[j-1]; //array가 char보다 +1 많다. 최대 저장공간 그래서 최대 길이의 -1을 해줘야 교환이 성립 안되면 예외발생
			c2[j-1]=temp; 
			j--;
		}
		return c2;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		char[] c2=array;
	
		System.out.println(c2);
	}
}
