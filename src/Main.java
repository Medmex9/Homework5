public class Main {
    public static void main(String[] args){

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i =0;i<=2; i++ ) {
            System.out.println(numbers[i]);}
        float [] fractional = {1.57f, 7.654f, 9.986f};
        System.out.println(fractional[2] + ", "+fractional[1] + ", "+fractional[0]);

        int [] row = {88,33,34,12,34,23,11};
        System.out.println(row[6]+ ", "+row[5]+ ", "+row[4]+ ", "+row[3]
                + ", "+row[2]+ ", "+row[1]+ ", "+row[0]);

    }}