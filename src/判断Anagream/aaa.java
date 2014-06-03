package 判断Anagream;

public class aaa {
	public static void main(String[] args){
	String str1="122331";
	String str2="312232";
	int[] count=new int[10];              //定义count做记录
	for(char c:str1.toCharArray()){       //记录第一个字符串
		count[c-'0']--;	
	}
	for(char c:str2.toCharArray()){       //反记录第二个字符串
		count[c-'0']--;
		}
	for(int i:count){                     //看看有没有不是0的数
		if(i!=0){                         //有，则表示不是anagram
			System.out.println("不是Anagram");
			System.exit(1);
		}
	}
	System.out.println("是Anagram");       //没有，则表示是anagram
	}
}
