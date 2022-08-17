public class WalkOnTheAxis{
	public static void main(String[] args) {
		int N = 3;
		int T = 7;
		int walk = 0;
		if (N>T) {
			walk = 2*N + T;
		}else {
			walk = T*2 +N;
		}
		
		System.out.println("Total distance walked:" + walk);
		

}
}

