public class Lab4 {
    // Варіант 24: 24,54,63
    public static void main(String[] args) throws Exception {
        int[] arrayForTasks = {1,2,42,-4,87,5,-9,49,-9,4,2,7,-6,0,3,};

        PrintAllTask(arrayForTasks);
    }
    // Знайти суму елементів, що кратні 7
    public static int task24(int[] inputArray){
        int sum = 0;

        for(int i = 0; i < inputArray.length; i++)
        {
            if(inputArray[i] % 7 == 0)
            {
                sum += inputArray[i];
            }
        }

        return sum;
    }
    // Знайти добуток від’ємних чисел масиву, індекс яких кратний 3
    public static int task54(int[] inputArray){
        int result = 1;

        for(int i = 0; i < inputArray.length; i++)
        {
            if(i % 3 == 0)
            {
                if(inputArray[i] < 0)
                {
                    result *= inputArray[i];
                }
            }
        }

        return result;
    }
    // Задано масив цілих чисел. Сформувати новий масив у наступний спосіб: 
    // - до всіх від’ємних елементів додати найбільший елемент масиву;
    // - всі нульові елементи замінити на 1;
    // - всі додатні елементи помножити на 2.
    public static int[] task63(int[] inputArray){
        int[] newArray = new int[inputArray.length];
        int maxInputArrayValue = maxOf(inputArray);

        for(int i = 0; i < inputArray.length; i++)
        {
            if(inputArray[i] < 0)
            {
                newArray[i] = inputArray[i] + maxInputArrayValue;
            } else if(inputArray[i] == 0)
            {
                newArray[i] = 1;
            } else
            {
                newArray[i] = inputArray[i] * 2;
            }
        }

        return newArray;
    }
    public static int maxOf(int[] inputArray){
        int max = inputArray[0];

        for(int i = 1; i < inputArray.length; i++)
        {
            if(inputArray[i] > max)
            {
                max = inputArray[i];
            }
        }
        return max;
    }
    public static void PrintAllTask(int[] inputArray){
        System.out.println("Result of task24: " + task24(inputArray));

        System.out.println("Result of task54: " + task54(inputArray));
        
        System.out.println("Result of task63: ");
        System.out.print("\t[ ");
        int[] task63Result = task63(inputArray);
        for(int i = 0; i < task63Result.length; i++)
        {
            if(i + 1 == task63Result.length)
            {
                System.out.print(task63Result[i]);
            }
            else
            {
                System.out.print(task63Result[i] + ", ");
            }
        }
        System.out.print(" ]");
    }
}
