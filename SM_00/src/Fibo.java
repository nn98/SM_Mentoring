
public class Fibo {
	int[] f;// 인트형 배열 정의 
	int a1=0,a2=1;//시작이 0과 1 이니까 두개만듬 
	public int[] run(int n) {// 매개변수 n을 받음
		this.f=new int[n];//this ????  배열 크기는 입력받은 n으로 만듬 
		for(int i=0;i<f.length;i++) {//f의 길이 == 즉 배열의 크기 까지 i를 하나씩 늘려가면서 돌거임 
			if(i%2==0) {// 0 1 1 2 3 5 8 13 21 34 
				f[i]=a1;//
				a1+=a2;//
			} else {
				f[i]=a2;
				a2+=a1;
			}
		}
		return f;
	}
}
