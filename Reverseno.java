class Reverseno {
	public static void main(String [] args)
	{
		System.out.println("Mohini Mahalle");
		int num = 1234, reversed = 0;
		System.out.println("Original Number:" +num);
		while(num !=0) {
			int digit = num% 10;
			reversed = reversed* 10 +digit;
			num/=10;
		}
		System.out.println("reversed Number:" + reversed);
	}
}