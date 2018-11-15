import java.util.Arrays;

public class T1_Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibo f=new Fibo();
		int[] r=f.run(10);
		for(int i:r) System.out.print(i+" ");
		String s=r.toString();
		System.out.print("\n"+s);
		s=Arrays.toString(r);
		System.out.println("\n"+s);
	}

}
