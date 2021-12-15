package Programmers;
import java.util.*;
public class max_number {
	public static void main(String args[]) {
		int []numbers1= {6,2,10};
		int []numbers2= {3, 30, 34, 5, 9};
		System.out.println(max_number(numbers1));
	}
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
}
