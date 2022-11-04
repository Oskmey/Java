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
        this.num = num/gcd;
        this.denom = denom/gcd;


    }

    public int getGcd(int num, int denom) {
    int larger_val = Math.max(num, denom);
    int smaller_val = Math.min(num, denom);
    int gcd;
    
    while (true){
        if (smaller_val != 0) { // If any number is zero the GCD is 1
        int rest = larger_val % smaller_val; 
        larger_val = smaller_val;
        
        if (rest == 0) // We have found the GCD!
        {
            gcd = smaller_val;
            break;
        }

        smaller_val = rest;
    }
        else { 
            gcd = 1;
            break;
        }
    }
    return gcd;
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

