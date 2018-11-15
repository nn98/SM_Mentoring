
public class MM {
	int a,b;
	public MM(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public int min() {
		int i=a;
		for(;!(i%b==0&&i%a==0);i++);
		return i;
	}
	public int max() {
		int i=a;
		for(;!(b%i==0&&a%i==0);i--);
		return i;
	}
}
