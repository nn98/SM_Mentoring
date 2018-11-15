import java.util.Scanner;

public class T3_Pal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t;
		do {
			System.out.print("회문 검사 방법 입력: 1-인덱스 검사 2-복제 검사 0-종료");
			t=s.nextInt();
			System.out.print("회문 검사할 문자열 입력:");
			String m=s.nextLine();
			
		}while(t!=0);
	}
	public boolean pal(String s,int t) {
		switch (t) {
		case 1:
			String[] a=s.split("");
			for(int i=0;i<a.length/2;i++) {
				if(a[i]!=a[a.length-1-i]) return false;
			}
			return true;
		case 2:
			String r=new StringBuffer(s).reverse().toString();
			return s==r;
		default:
			System.out.println("입력 오류.");
			return false;
		}
	}
}
