public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int num = 1, num2 = 1;
        while(num <= 10)
        {
            while (num2 <= 10)
            {
                System.out.print(num * num2 + " ");
                num2++;
            }
                System.out.println();
                num++;
                num2 = 1;
        }
    }
}