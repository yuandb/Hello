package �ж�Anagream;

public class aaa {
	public static void main(String[] args){
	String str1="122331";
	String str2="312232";
	int[] count=new int[10];              //����count����¼
	for(char c:str1.toCharArray()){       //��¼��һ���ַ���
		count[c-'0']--;	
	}
	for(char c:str2.toCharArray()){       //����¼�ڶ����ַ���
		count[c-'0']--;
		}
	for(int i:count){                     //������û�в���0����
		if(i!=0){                         //�У����ʾ����anagram
			System.out.println("����Anagram");
			System.exit(1);
		}
	}
	System.out.println("��Anagram");       //û�У����ʾ��anagram
	}
}
