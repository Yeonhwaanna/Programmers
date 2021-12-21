package Programmers;
import java.util.*;
public class max_number {
	public static void main(String args[]) {
		int []numbers1= {6,2,10};
		int []numbers2= {3, 30, 34, 5, 9};
		System.out.println(max_number(numbers2));
	}
	/*//숫자를 아스키코드로 변환하지 않고 INT 타입으로 비교시 실패
	  public static String max_number(int[] numbers) {
	        String answer = "";
	        ArrayList<Integer>list=new ArrayList<Integer>();
	        ArrayList<Integer>nums=new ArrayList<Integer>();

	        for(int num:numbers) {
	        	nums.add(num);
	        }
	        for(int i=0;i<numbers.length; i++) {
	        	if(numbers[i]>=10) {
	        		list.add(numbers[i]/10);
	        	}else {
	        		list.add(numbers[i]);
	        	}
	        }
	        Collections.sort(list);
	        int max=0;
	        int tmp=0;
	        while(list.size()>0) {
	        	for(Integer num:nums) {
	        		if(num>=10) {
	        			tmp=num/10;
	        		}else {
	        			tmp=num;
	        		}
	        		if(tmp==list.get(list.size()-1)) {
	        			if((max%10)<=(num%10)) {
	        				max=num;
	        			}

	        		}
	        	}
	        	nums.remove(nums.indexOf(max));
	        	answer+=Integer.toString(max);
	        	list.remove(list.size()-1);
	        	max=0;
	        }
	        return answer;
	    }
	 */
	//compare to 사용(Collections.sort 와 달랐음)
	public static String max_number(int[] numbers) {
		String answer = "";
		ArrayList<String>list=new ArrayList<String>();

		for(int num:numbers) {
			list.add(Integer.toString(num));
		}
		Collections.sort(list, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

		if(list.get(0).equals("0")) {
			answer="0";
		}else {
			for(int i=0;i<list.size();i++) {
				answer+=list.get(i);
			}
		}

		return answer;
	}
}
