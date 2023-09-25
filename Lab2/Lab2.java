public class Lab2 {
    public static void main(String[] args) throws Exception
    {
        System.out.print("Task_4: " + Task_4(3.56, 1.02, 3, 2.43) + "\n");
        System.out.print("Task_22: " + Task_22(1.23, -0.34, 0.707, 2.312) + "\n");
        System.out.print("Task_22: " + Task_13(-2.86, 1.62, 10.874, -2.91) + "\n");
    }
    public static double Task_4(double a,double b,double c,double d) throws Exception
    {
        double result = 0;

        double numerator = Math.pow(Math.tan(a), 1.0 / c);
        double denominator = 1 + (Math.sinh(b)/ Math.log(Math.abs(d+c)));

        result = numerator / denominator;

        return result;
    }
    public static double Task_13(double a,double b,double c,double d) throws Exception
    {
        double result = 0;

        double firstPart = Math.log(Math.abs(2*a))/ (3 * Math.tan(b));
        double secondPart = Math.pow((c / Math.pow(Math.abs(d), 1.0/2)), 1.0/2);

        result = firstPart - secondPart;

        return result;
    }
    public static double Task_22(double a,double b,double c,double d) throws Exception
    {
        double result = 0;

        double firstPart = 4 * Math.sinh(Math.pow(Math.abs(a/b), 1.0/2));
        double secondPart = 3 * Math.asin(c);

        result = Math.pow(firstPart + secondPart, d);

        return result;
    }
}