import java.util.Arrays;
import java.util.List;

public class Main {

        public static void main(String[] args) {{
            int [] expenses = { 167967, 139982, 183095, 187455,
                    122718, 145924, 148578, 149313, 186597, 174601,
                    173494, 173351, 126330, 114062, 143424, 163903,
                    131341, 187661, 140637, 101564, 188890, 194455,
                    122066, 159716, 176261, 135102, 152923, 125494,
                    128568, 198563};
            //Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
            //Нужно написать программу, которая решит эту задачу, и вывести в консоль
            // результат в формате: «Сумма трат за месяц составила … рублей»
            int total = 0;

            for (int i = 0; i < expenses.length; i++)
                total = total + expenses[i];
            System.out.println("Сумма трат за месяц составила " + total +" рублей");

            //Следующая задача — найти минимальную и максимальную трату за день.
            //Нужно написать в формате: «Минимальная сумма трат за день составила … рублей.
            // Максимальная сумма трат за день составила … рублей».
            int maxWe = 0;
            int minWe = total;
            int avg = total/ expenses.length;
            for (int i = 0; i < expenses.length; i++) {
                if (expenses[i]>maxWe) {
                        maxWe = expenses[i];

                    }
                if (expenses[i]<minWe){
                    minWe = expenses [i];

                }






            }
            System.out.println("Максимальная сумма трат за день составила " +maxWe + " рублей");
            System.out.println("Минимальная сумма трат за день составила " +minWe + " рублей");
            System.out.println("Средняя сумма трат за месяц составила "+ avg +" рублей");



            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length-1; i >=0; i--) {
                System.out.print(reverseFullName[i]);

            }
        }




            }}




