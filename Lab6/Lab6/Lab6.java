package Lab6;

// Варіант 24. Завдання 6 & 10
public class Lab6{
    public static void main(String[] args) throws Exception{
        printAll();
    }
    // Task 6 - перетворити число з 8 річної системи у 10 річну.
    public static int octStringToInt (String s){
        IntParse intParseData = IntParse.Parse(s);
        int result = 0;
        char[] charArray = s.toCharArray();
        reverceArray(charArray);

        if (intParseData.getSuccess()) {
            int curentNumber = 0;
            int supplement = 0;

            for(int i = 0; i < s.length(); i++){
                curentNumber = Character.getNumericValue(charArray[i]);
                System.out.println(curentNumber);
                supplement = curentNumber * (int)Math.pow(8, i);
                result += supplement;
            }

            return result;
        } else{
            System.out.println("Input string not a value. Return -1");
            return -1;
        }
    }
    public static void reverceArray(char[] arrayToReverce){
        int left = 0;
        int right = arrayToReverce.length - 1;
        while (left < right) {
            char temp = arrayToReverce[left];
            arrayToReverce[left] = arrayToReverce[right];
            arrayToReverce[right] = temp;
            left++;
            right--;
        }

    }
    // Task 10 - зробити усі літери верхнім регістром
    public static String capitalizeWords(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches(".*[a-z].*")) {
                words[i] = words[i].toUpperCase();
            }
        }
        return String.join(" ", words);
    }

    public static void printAll(){
        System.out.println("Task 6: " + octStringToInt("777"));
        System.out.println("Task 10: " +(capitalizeWords("hi, its me")));
    }
}