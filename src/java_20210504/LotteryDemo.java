package java_20210504;

public class LotteryDemo {

	public static void main(String[] args) {
		//Math.random() => 0보다 크거나 같고 1보다 작은 임의 double 반환
		//int random = (int)(Math.random() *45)+1;//1보다 크고 44보다 작은 int 반환 
		
		int[] lotto = new int[6]; 
		
		
		
		
		
		
		for(int i=0;i<lotto.length;i++) {
			//0보다 크거나 같고 45보다 작은 int 반환
			int random = (int)(Math.random()*45)+1;
			boolean isExisted = false;
			for(int j=0;j<i;j++) {
				if(random == lotto[j]) {
					isExisted = true;
					break;
				}
			}
			if(isExisted) {
				i --;
			}else {
				lotto[i] = random;
		}

			}
		}
		
		
		
		
		
	}


