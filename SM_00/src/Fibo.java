
public class Fibo {
	int[] f;// ��Ʈ�� �迭 ���� 
	int a1=0,a2=1;//������ 0�� 1 �̴ϱ� �ΰ����� 
	public int[] run(int n) {// �Ű����� n�� ����
		this.f=new int[n];//this ????  �迭 ũ��� �Է¹��� n���� ���� 
		for(int i=0;i<f.length;i++) {//f�� ���� == �� �迭�� ũ�� ���� i�� �ϳ��� �÷����鼭 ������ 
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
