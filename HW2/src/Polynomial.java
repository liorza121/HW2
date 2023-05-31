public class Polynomial extends Function {
    private final Double[] coefficients;
    public Polynomial(double... varargs){
        coefficients = new Double[varargs.length];
        for (int i =0; i < varargs.length; i++){
            coefficients[i] = varargs[i];
        }
    }

    @Override
    public double valueAt(double x) {
        double sum = 0;
        for (int i = 0; i < coefficients.length; i++){
            sum += coefficients[i] * Math.pow(x,i);
        }
        return sum;
    }

    @Override
    public String toString() {
        String ret = "";
        for(Integer i = 0;i < coefficients.length; i++){
            double coefficient = coefficients[i];
            String str = coefficients[i].toString();
            if (coefficient != 0){
                if(coefficient == 1)
                    ret += "x^" + i.toString() + "";
                else if (coefficient == -1)
                    ret += "-x^" + i.toString() + "";
                else if(coefficient % 1 == 0)
                    ret += str.substring(0,str.) + "x^" + i.toString() + "";
            }
        }
        return ret; //ret += coefficients[i].toString() + "x^" + i.toString() + "";
    }
}
