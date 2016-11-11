package homework6;
import java.util.*;

public class AvgScore {

	Scanner a = new Scanner(System.in);
	int num[] = new int[10];
	int i, k, z, x, temp;
	double sum = 0, avg;
	
	public void Score() {
		
		System.out.println("===============================");
		for(i = 0; i < 10; i++){
		System.out.print(i+1+"번 심사점수 입력: ");
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
		for(x = 1; x < 9; x++){
			sum = sum + num[x];
		}
		avg = sum / 8;
		System.out.println("가장큰 점수와 가장 작은 점수를 제외한8개의 점수 평균은"+ avg+"입니다.");
	}
}