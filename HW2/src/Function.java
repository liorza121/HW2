/**
 * this is the base class for all functions. It is abstract and demands the implementation of the basic methods.
 */
public abstract class Function {
    static final double DEFAULT_EPSILON = 0.00001;
    public double valueAt(double x){
        return 0.0;
    }
    public String toString(){
        return "";
    }
    public Function derivative(){
        return null;
    }
    public double bisectionMethod(double a, double b, double epsilon){
        return 0.0;
    }
    public double bisectionMethod(double a, double b){
        return 0.0;
    }
    public double newtonRaphsonMethod(double a, double epsilon){
        return 0.0;
    }
    public double newtonRaphsonMethod(double a){
        return 0.0;
    }
    public Polynomial taylorPolynomial(int n){
        return null;
    }
}
