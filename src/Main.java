public class Main {
    public static void main(String[] args) {{

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i =0;i<numbers.length; i++ ) {
            if (numbers[1]%2!=1&&numbers[2]%2==1)
                numbers[0]+=1;
                numbers[2]+=1;
            System.out.print(numbers[i]);
            if (numbers.length>0) System.out.print(", ");
           }}
        System.out.println("\n");
        float [] fractional = {1.57f, 7.654f, 9.986f};
        System.out.print(fractional[2] + ", "+fractional[1] + ", "+fractional[0]);
        System.out.println("\n");

        int [] row = {1,2,3,4,5,6,7};
        for (int z = row.length -1; z>=0; z--) {
            System.out.print(row[z]);
            if (z>0)
                System.out.print(", ");



    }}}