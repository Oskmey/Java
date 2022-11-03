package exercises.ex6useaclass;

import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;

import javax.lang.model.util.ElementScanner6;

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
        int larger_val = Math.max(num, denom);
        int smaller_val = Math.min(num, denom);
        int gcd;

        while (true){
            int rest = larger_val % smaller_val;
            larger_val = smaller_val;

            if (rest == 0)
            {
                gcd = smaller_val;
                break;
            }

            smaller_val = rest;
        }

        this.num = num/gcd;
        this.denom = denom/gcd;
    }
    
    public int getNum(){
        return this.num;
    }

    public int getDenom(){
        return this.denom;
    }

    private void equalize(Rational other){
        int thisDenom = this.getDenom();
        int otherDenom = other.getDenom();


    }

    public Rational add(Rational other){

        
    }

    public Rational equals(){

    }
    
}

