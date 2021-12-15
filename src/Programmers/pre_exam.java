package Programmers;
import java.util.*;
public class pre_exam {
	 public int[] solution(int[] answers) {
	       	int []answer= {};
			int score1=0;
			int score2=0;
			int score3=0;
			ArrayList<Integer>list=new ArrayList<Integer>();
			for(int i=0;i<answers.length;i++) {
				if(i%5==0) {
					if(answers[i]==1) {
						score1++;
					}
				}else if(i%5==1) {
					if(answers[i]==2) {
						score1++;
					}
				}else if(i%5==2) {
					if(answers[i]==3) {
						score1++;
					}
				}else if(i%5==3) {
					if(answers[i]==4) {
						score1++;
					}
				}else if(i%5==4) {
					if(answers[i]==5) {
						score1++;
					}
				}
			}
			
			for(int i=0;i<answers.length;i++) {
				if(i%8==0) {
					if(answers[i]==2) {
						score2++;
					}
				}else if(i%8==1) {
					if(answers[i]==1) {
						score2++;
					}
				}else if(i%8==2) {
					if(answers[i]==2) {
						score2++;
					}
				}else if(i%8==3) {
					if(answers[i]==3) {
						score2++;
					}
				}else if(i%8==4) {
					if(answers[i]==2) {
						score2++;
					}
				}else if(i%8==5) {
					if(answers[i]==4) {
						score2++;
					}
				}else if(i%8==6) {
					if(answers[i]==2) {
						score2++;
					}
				}else if(i%8==7) {
					if(answers[i]==5) {
						score2++;
					}
				}
			}
			
			for(int i=0;i<answers.length;i++) {
				if(i%10==0||i%10==1) {
					if(answers[i]==3) {
						score3++;
					}
				}else if(i%10==2||i%10==3) {
					if(answers[i]==1) {
						score3++;
					}
				}else if(i%10==4||i%10==5) {
					if(answers[i]==2) {
						score3++;
					}
				}else if(i%10==6||i%10==7) {
					if(answers[i]==4) {
						score3++;
					}
				}else if(i%10==8||i%10==9) {
					if(answers[i]==5) {
						score3++;
					}
				}
			}
			list.add(score1);
			list.add(score2);
			list.add(score3);
			
			Collections.sort(list);

			int max=list.get(2);
			list.clear();
			if(max==score1) {
				list.add(1);
			}if(max==score2) {
				list.add(2);
			}if(max==score3) {
				list.add(3);
			}
			
			answer=new int[list.size()];
			for(int i=0;i<list.size();i++) {
				answer[i]=list.get(i);
			}
			return answer;
		}
}
