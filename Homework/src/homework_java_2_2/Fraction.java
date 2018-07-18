package homework_java_2_2;

/**
 * 
 * @author Perry
 * Desc：分数
 *
 */
class Fraction {
	
	// 分子
	private int numerator;
	// 分母
	private int denominator;
	// 分数
	private double fraction;
	
	public Fraction(int a, int b) {
		numerator = a;
		denominator = b;
		fraction = a / b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * 获取分母
	 * @return 分母
	 */
	public int getDenominator() {
		return denominator;
	}
	
	/**
	 * 获取分子
	 * @return 分子
	 */
	public int getNumerator() {
		return numerator;
	}
	
	/**
	 * 将分数转换为double
	 * @return 小数
	 */
	public double toDouble() {
		return fraction;
	}
	
	/**
	 * 将自己的分数和r的分数相加，产生一个新的Fraction的对象。
	 * @param r 传入分数类
	 * @return 新分数类
	 */
	public Fraction plus(Fraction r) {
		return new Fraction(
				numerator * r.getDenominator() + r.getNumerator() * denominator,
				r.getDenominator() * denominator);
	}

	/**
	 * 将自己的分数和r的分数相乘，产生一个新的Fraction的对象。
	 * @param r 传入分数类
	 * @return 新分数类
	 */
	public Fraction multiply(Fraction r) {
		return new Fraction(numerator * r.getNumerator() , denominator * r.getDenominator());
	}
	
	/**
	 *  将自己以“分子/分母”的形式输出到标准输出，并带有回车换行。
	 *  如果分数是1/1，应该输出1。
	 *  当分子大于分母时，不需要提出整数部分，即31/30是一个正确的输出。
	 */
	public void print() {
		if(numerator == denominator) {
			System.out.println("1");
		}else {
			int divisor = gcd(numerator,denominator);
			System.out.println((numerator/divisor)+"/"+(denominator/divisor));
		}
	}
	
	/**
	 * 求最大公约数
	 * @param a
	 * @param b
	 * @return 最大公约数
	 */
	public int gcd(int a, int b) {   
		int m = Math.max(Math.abs(a), Math.abs(b));
		int n = Math.min(Math.abs(a), Math.abs(b));
		int r;
		while(n != 0) {
			r = m % n;
			m = n;
			n = r;
		}
		return m;
	}

}
