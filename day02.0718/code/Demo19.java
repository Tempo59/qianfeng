class Demo19 
{
	public static void main(String[] args) 
	{
		int a = 3;
		System.out.println(~a);
		/*
		0000 0000 0000 0000 0000 0000 0000 0011
����	1111 1111 1111 1111 1111 1111 1111 1100
����	1111 1111 1111 1111 1111 1111 1111 1011
ԭ��	1000 0000 0000 0000 0000 0000 0000 0100

		-4
		*/

		int c = 2;
		int b = 3;
		System.out.println(c^b);
		/*
			2	0000 0010
			3	0000 0011
				----------
				0000 0001	1
		*/

		System.out.println(5>>3);
		/*
			5	0000 0101
				0000 0000	0
		*/
		System.out.println(-5>>3);
		/*
ԭ��	1000 0000 0000 0000 0000 0000 0000 0101
����	1111 1111 1111 1111 1111 1111 1111 1010
����	1111 1111 1111 1111 1111 1111 1111 1011

����	1111 1111 1111 1111 1111 1111 1111 1111
����	1111 1111 1111 1111 1111 1111 1111 1110
ԭ��	1000 0000 0000 0000 0000 0000 0000 0001
		*/

		System.out.println(-5>>>3);

		System.out.println(-5<<3);
	/*
ԭ��	1000 0000 0000 0000 0000 0000 0000 0101
����	1111 1111 1111 1111 1111 1111 1111 1010
����	1111 1111 1111 1111 1111 1111 1111 1011

		1111 1111 1111 1111 1111 1111 1101 1000
		1111 1111 1111 1111 1111 1111 1101 0111
		1000 0000 0000 0000 0000 0000 0010 1000
	*/
	}
}