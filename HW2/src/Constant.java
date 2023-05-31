public class Constant extends Function{
    private final Double c;
    public Constant(double constant){
        c = constant;
    }

    @Override
    public double valueAt(double x) {
        return c;
    }

    @Override
    public String toString() {
        return c.toString();
    }

    @Override
    public Function derivative() {
        return new Constant(0); // derivative of a constant is 0
    }

    @Override
    public double bisectionMethod(double a, double b, double epsilon) {
        return 0.0; //undefined for a constant function...
    }

    @Override
    public double bisectionMethod(double a, double b) {
        return bisectionMethod(a,b, DEFAULT_EPSILON);
    }

    @Override
    public double newtonRaphsonMethod(double a) {
        return newtonRaphsonMethod(a, DEFAULT_EPSILON);
    }

    @Override
    public double newtonRaphsonMethod(double a, double epsilon) {
        return 0; //undefined for a constant function...
    }
}
