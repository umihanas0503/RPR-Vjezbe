public class Math {




    public static double power(double input,int pow){

        for(int i=2; i<=pow; i++)
            input *= i;
        return input;
    }



    public static double factorial(double input) {
     int temp=1;

        for (int i = 2; i <= input; i++)
            temp=temp*i;



    return temp;
    }




    public static double Sin(double x) {
        double sin = 0;
        for (int n = 0; n < 5; n++) {
            sin += power(-1, n) * power(x, 2 * n + 1) / factorial(2 * n + 1);
        }
        return sin;
    }



}
