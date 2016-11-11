package homework6;

import java.util.*;

public class SecondMax {

	Scanner a = new Scanner(System.in);
	int num[] = new int[10];
	int i, k, z, x, temp;
	double sum = 0, avg;
	
	public void condMax() {
		
		System.out.println("===============================");
		for(i = 0; i < 10; i++){
		System.out.print(i+1+"번째 수를 입력하시오 : ");
		num[i] = a.nextInt();
		
		for(k = 0; k < 10; k++){
			for(z = 0; z < 9; z++){
				if(num[z] < num[z+1]){
					temp = num[z];
					num[z] = num[z+1];
					num[z+1] = temp;
				}
			}
		}
		}
		avg = sum / 8;
		System.out.println("두번째로 큰 수는 "+num[1]+"입니다.");
	}
}