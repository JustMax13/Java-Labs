public class Lab3 {
    // Варіант 24: Завдання 4,8,12
    public static void main(String[] args) throws Exception {
        printAllTask();
    }

    public static double task4(int i, int k, double a, double b){
        double sum = 0;
        for(;i <= k;i++) // В данному випадку в нас по k включно
        {
            sum += Math.sqrt(a*i*Math.sqrt(b/i));
        }

        return sum;
    }
    public static double task8(int n, int i, double t){
        double sum = 0;

        int l1 = 1;
        int l2 = 2;
        for( ; i<=n; i++)
        {
            sum += ((1/t) * l1) + (1/Math.sqrt(t) * l2);
            l1 += 2;
            l2 += 2;
        }

        return sum;
    }
    public static double task12(int i, double epsilon){
        double infSum = 0;
        for(;true; i++)
        {
            double addValue = 1.0/(i * (i+1));
            infSum += addValue;

            if(Math.abs(addValue) < epsilon)
            {
                break;
            }
        }

        return infSum;
    }
    public static void printAllTask(){
        System.out.println("Task 4 result: " + task4(1, 30, 10, 8));
        System.out.println("Task 8 result: " + task8(10, 1, 5));
        System.out.println("Task 12 result: "+ task12(1, 0.001));
    }
}
