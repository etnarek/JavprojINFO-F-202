package microProject;

public class RationalLowerTriangularMatrix {
	private Rational matrice[][];
	
	public RationalLowerTriangularMatrix(int size){
		if (size < 1){
			throw new IllegalArgumentException("Argument 'size' must be greater than 0");
		}
		matrice = new Rational[size][];
		for (int i=0; i < matrice.length; ++i) {
            matrice[i] = new Rational [i+1];
            for (int j=0;j<matrice[i].length ; ++j) {
                matrice[i][j] = new Rational();
            }
        }
	}
	public void setValue(int i, int j, Rational r){
		matrice[i][j] = r;
	}
	public Rational getValue(int i, int j){
		return matrice[i][j];
	}
	public Rational getSum(){
		Rational r = new Rational();
		for (int i=0; i < matrice.length; ++i){
			for (int j=0; j < matrice[i].length; ++j){
				r.add(matrice[i][j]);
			}
		}
		return r;
	}
	public Rational getDeterminant(){
		Rational r = matrice[0][0];
		for (int i = 1; i< matrice.length; ++i){
			r.mul(matrice[i][i]);
		}
		return r;
	}
	public String toString(){
//		TODO: use format option
		String s ="";
		for (int i=0; i<matrice.length;++i){
			for(int j=0;j<matrice[i].length;++j){
				s += String.format("%3s", matrice[i][j]) + " ";
			}
			for (int k=0; k<(matrice.length - matrice[i].length); ++k){
				s +=  String.format("%3s","0") + " ";
			}
			s += "\n";
		}
		return s;
	}
}
