package mypackage;

public class ChristmasTree {
    public static void main(String[] args) {
        
        /* for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            for (int j = 0; j < Integer.parseInt(args[1]) - i; j++)
             System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
             System.out.print("*");
            System.out.println();
        }
        */
        int rows = Integer.parseInt(args[0]);
        int height = 1;

        // controls height (num of blocks)
        for (int h = 0; h < height; h++) {
            // loop through rows
            for (int r = 0; r < rows; r++) {
                // number in rows
                for (int c = 0; c < r + 1; c++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
        
    }
}
