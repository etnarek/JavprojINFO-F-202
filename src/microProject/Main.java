package microProject;
import java.util.Random;

public final class Main {

	public static void main(String[] args) {
		final int matriceSize =10;
		Random rand = new Random();
		RationalLowerTriangularMatrix c = new RationalLowerTriangularMatrix(matriceSize);

		Rational r;
		for (int i =0; i< matriceSize; ++i){
			for(int j=0; j < i+1; ++j){
				int num = rand.nextInt(10);
				int denum = rand.nextInt(9)+1;
                r = new Rational(num, denum);
                c.setValue(i, j, r);
			}
		}
		System.out.println(c);
		r = c.getSum();
		System.out.println("Somme: " + r);
		r = c.getDeterminant();
		System.out.println("Determinant: " + r);
	}

}
