public class QuadraticEquation {
    private double a, b, c;
    public double[] root = new double[2];

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double[] getRoots() {
        this.root[0] = (-b - Math.sqrt(getDiscriminant())) / 2 * this.a;
        this.root[1] = (-b + Math.sqrt(getDiscriminant())) / 2 * this.a;
        return this.root;
    }

}
