import java.util.ArrayList;
//import java.util.Formatter;
import java.util.Scanner;

public class ALp3{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
        int enter = 0;
        ArrayList<Integer> nums = new ArrayList<Integer>();
		while(input.nextInt() != 0){
            enter = input.nextInt();
            if(num != 0){
                nums.add(enter);
            }
        }
		
		System.out.println(nums.size());
		System.out.println(nums);
		System.out.println(max(nums));
		System.out.println(sum(nums));
	}

	public static Integer max(ArrayList<Integer> list){
		Integer max = 0;
		for(int i = 0; i < list.size(); i++){
			if(list.get(i) > max){
				max = list.get(i);
			}
		}

		if(max == 0){
			return null;
		}
		return max;
	}

	public static Integer sum(ArrayList<Integer> list){
		Integer sum = 0;
		for(int i = 0; i < list.size(); i++){
				sum = list.get(i) + sum;
		}

		if(sum == 0){
			return null;
		}
		return sum;
	}
}