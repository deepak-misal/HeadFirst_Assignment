
public class Test {

	public static void main(String[] args) {
		int x=0,y=0;
		while(x<5) {
			y=x-y;
			System.out.println(x+""+y+"");
			x=x+1;
		}
	}

}
