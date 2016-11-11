package homework6;
import java.util.*;

public class OnlyNumber {
	Scanner a = new Scanner(System.in);
	
	int[] bae = new int[10];
	int i, k, num;
	
	public void Number() {
		System.out.println("1~100 사이의 숫자를 입력하세요");
		for(i = 0; i < 10; i++){
			System.out.print(i+1+"번째 숫자: ");
			num = a.nextInt();
			
			for(;;){
				for(k = 0; k <= i; k++){
					if(num == bae[k]){
						System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
						System.out.print(i+1+"번째 숫자: ");
						num = a.nextInt();
					}
				}
				if(num > 0 && num < 101){
					bae[i] = num;
					break;
				}
				else{
					System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
					System.out.print(i+1+"번째 숫자: ");
					num = a.nextInt();
				}
			}
		}
		System.out.println("===================");
		for(i = 10; i > 0; i--){
			System.out.println(i+"번째 숫자는 "+bae[i-1]+"입니다.");
		}
	}
}
