package microProject;

public final class Main {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		Rational r = new Rational(0, 1);
		Rational r2 = new Rational(1, 4);
		r.add(r2);
		System.out.println(r);
		RationalLowerTriangularMatrix c = new RationalLowerTriangularMatrix(2);
		c.setValue(0, 0, r2);
		r = c.getSum();
		System.out.println(r);
		System.out.println("Hello");
		System.out.println(c);
	}

}
