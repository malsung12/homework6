package homework6;
import java.util.*;

public class AptPersonCount {
	Scanner a = new Scanner(System.in);
	
	int[][] num = new int[5][3];
	int i, j, k, peple, sum = 0, one, two, three;
	public void PersonCount() {
		System.out.println("5층 아파트의 거주자 인원 파악하기");
		
		for(i = 1; i <= 5; i++){
			for(j = 1; j <= 3; j++){
				System.out.print(i+"0"+j+"호에 살고 있는 사람의 숫자: ");
				num[i-1][j-1] = a.nextInt();
				sum = sum + num[i-1][j-1];
			}
		}
		
		System.out.println("이 아파트에 거주자는 모두 "+sum+"입니다.");
		sum = 0;
		for(i = 0; i < 5; i++){
			for(j = 0; j < 3; j++){
				sum = sum + num[i][j];
			}
			System.out.println(i+1+"층에 사는 거주자는 모두 "+sum+"명 입니다.");
			sum = 0;
		}
		for(i = 0; i < 5; i++){
				if(num[i][0] == num[i][0])
				one = one + num[i][0];
				if(num[i][1] == num[i][1])
				two = two + num[i][1];
				if(num[i][2] == num[i][2])
				three = three + num[i][2];
		}
		System.out.println("1호 라인에 사는 거주자는 모두 "+one+"명");
		System.out.println("2호 라인에 사는 거주자는 모두 "+two+"명");
		System.out.println("3호 라인에 사는 거주자는 모두 "+three+"명");
	}
}
