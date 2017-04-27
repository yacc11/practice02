package prob5;
import java.util.Random;
import java.util.Scanner;

public class Prob5 {
	public static void main(String[] args) {
		
	Random r = new Random();
	
	Scanner scanner = new Scanner(System.in);
			
	while(true)
	{
		int correctNumber= r.nextInt(100)+1;
		System.out.println(correctNumber);
		
		String decision;//결정 y/s
		
		System.out.println("수를 결정하였습니다. 수를 맞춰 보세요 " );
		int num=1;//num은 횟수
		int numb=0;//자기 자신이 입력을 숫자변수
		
		System.out.println("1-100");
			System.out.print(num+">>");
			numb = scanner.nextInt();
			if(numb==correctNumber){
				System.out.println("맞았습니다.");
				
				System.out.println("다시 하시겠습니까? (y/n)");
				
				decision = scanner.next();
				
				if(decision.equals("n")){
						break;
				}
			}
			if(numb>correctNumber){
				System.out.println("더 낮게");
			}
			else if(numb<correctNumber){
				System.out.println("더 높게");
			}
			num++;
		}
	}
}