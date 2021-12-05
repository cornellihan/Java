public class Break {
	public static void main(String[] args) {
		for(int i = 1; i > 0; i++) {
			if(i == 10) {
				System.out.println("Here the number has cutted by 'continue' statement");
				continue;
			} else if(i == 20) {
				System.out.println("Here the loop has closed by 'break' statement");
				break;
			}
			System.out.println(i);
		}
	}
}