package microProject;

public class Rational {
	private int num;
	private int denum;
	
//	Constructeurs
	public Rational(){
		num = 0;
		denum = 1;
	}
	public Rational(int newNum, int newDenum){
		if (newDenum != 0){
			num = newNum;
			denum = newDenum;
			simplify();
		}
		else{
			throw new IllegalArgumentException("Argument 'denum' is 0");
		}
	}
	
//	Fonctions sur les fractions:
	public String toString(){
		String frac;
		if (denum != 1){
			frac = num + "/" + denum;
		}
		else{
			frac = "" + num;
		}
		return frac;
	}
	public void simplify(){
		int pg = pgcd(num, denum);
		num /=pg;
		denum /=pg;
	}
	public void mul(Rational r){
		num *= r.num;
		denum *= r.denum;
		simplify();
	}
	public void add(Rational r){
		num = (num * r.denum) + (r.num * denum);
		denum *= r.denum;
		simplify();
	}

//	Fonction de traitement de nombres:
	private static int pgcd(int a, int b){
		int res =a;
		if (b != 0){
			res = b;
			b = a%b;
			a = res;
			res = pgcd(a, b);
		}
		return res;
	}

}
