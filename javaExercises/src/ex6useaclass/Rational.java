package exercises.ex6useaclass;



/*
 *    A class representing a rational number
 *
 *    NOTE: No IO here, this is just the logical concept.
 *
 *    Test the class by running Ex1TestRational.
 *
 * See:
 * - useaclass/
 * - UseAMap
 */

public class Rational {

    private final int num;    // rational =  num / denom
    private final int denom;

    public Rational(int num, int denom) {
        int gcd = getGcd(num, denom);
        int negativ = 1;
        if (((num+1.0)/denom) < 0) {
            negativ = -1; 
        }
        this.num = num/gcd * negativ;
        this.denom = denom/gcd * negativ;

    }

    public int getGcd(int num, int denom) {
        if (denom==0) return num;
        return getGcd(denom,num%denom);
 }
 
    public Rational (int num) {
        this.num = num;
        this.denom = 1; 

    }
    public Rational (Rational other) {
        this.num = other.num;
        this.denom = other.denom;

    }
    public int getNum(){
        return this.num;
    }

    public int getDenom(){
        return this.denom;
    }


    public Rational add(Rational other){
        int new_num = (this.getNum() + other.getNum()) * ;
        int new_denom = (this.getDenom() + other.getDenom());
        Rational rational = new Rational(new_num, new_denom);
        return rational;
        
    }
    public Rational sub(Rational other) {
        int new_num = this.getNum() - other.getNum();
        int new_denom = this.getDenom() - other.getDenom();
        Rational rational = new Rational(new_num, new_denom);
        return rational;
    }
    public Rational mul(Rational other) {
        int new_num = this.getNum() * other.getNum();
        int new_denom = this.getDenom() * other.getDenom();
        Rational rational = new Rational(new_num, new_denom);
        return rational;
    }
    public Rational div(Rational other) {
        int new_num = this.getNum() / other.getNum();
        int new_denom = this.getDenom() / other.getDenom();
        Rational rational = new Rational(new_num, new_denom);
        return rational;
    }

    public double toDouble() { 
        return 0;
    }

    public boolean lessThan(Rational other) {
        if ((this.num < other.num) || (this.denom > other.denom)) {
            return true;
        }
        else {
            return false;
        }
    }
}

