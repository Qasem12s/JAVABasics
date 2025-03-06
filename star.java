public class star {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print(" ");
            }
            for (int x = 1; x <= i; x++) {
                System.out.print("*");

            }
            for (int x = 0; x < i - 1; x++) {
                System.out.print("*");

            }
            System.out.println();

        }
        System.out.println();
        for (int i = 1 ; i<=6 ; i++){
            for (int k = 1 ; k<=i ; k++){
                System.out.print(" ");
            }
            for (int j = 6 ; j>= i ; j--){
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();

        for (int i = 1 ; i< 6 ; i++){
            for (int j = 6; j>i ; j--){
                System.out.print(" ");
            }
            for (int a = 1 ; a < i ; a++){
                System.out.print("*");
            }
            for (int a = 1 ; a < i-1 ; a++){
                System.out.print("*");
            }
            System.out.println();
        }
        //
        for (int i = 1 ; i<6 ; i++){
            for (int x = 1; x<i ; x++){
                System.out.print(" ");
            }
            for (int g = 6 ; g>i ; g--){
                System.out.print("*");
            }
            for (int g = 6 ; g>i+1 ; g--){
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();

        for (int i = 1 ; i <= 6 ; i++){
            for (int j = 1 ; j <=i ; j++){
                System.out.print("*");
            }
            for (int y= 6 ; y>=i ; y--){
                System.out.print(" ");
            }
            for (int y= 6 ; y>=i ; y--){
                System.out.print(" ");

            }
            for (int j = 1 ; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int z = 1 ; z<=2 ; z++){
            for (int a = 1; a<=14; a++){
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 1 ; i <= 6 ; i++){
            for (int j = 6 ; j >=i ; j--){
                System.out.print("*");
            }
            for (int y= 1 ; y<=i ; y++){
                System.out.print(" ");
            }
            for (int y= 1 ; y<=i ; y++){
                System.out.print(" ");

            }
            for (int j = 6 ; j >=i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1 ; i <=6 ; i++) {
            for (int b = 6; b >= i; b--) {
                System.out.print("*");

            }
            for (int z = 1; z < i; z++) {
                System.out.print(" ");
            }
            for (int z = 1; z < i; z++) {
                System.out.print(" ");
            }
            for (int b = 6; b >= i; b--) {
                System.out.print("*");

            }
            System.out.println();
        }
           // System.out.println();

            for (int ii = 1 ; ii <6 ; ii++) {
                for (int b = 1; b <= ii; b++) {
                    System.out.print("*");

                }
                for (int z = 6; z > ii; z--) {
                    System.out.print(" ");
                }
                for (int z = 6; z > ii; z--) {
                    System.out.print(" ");
                }
                for (int b = 1; b <= ii; b++) {
                    System.out.print("*");

                }
                System.out.println();
            }
        System.out.print("************");
        System.out.println();
        System.out.println();

        for (int i = 1 ; i <=3 ;i++) {
            for (int j = 1; j <=3; j++) {
                System.out.print(" ");
            }
            for (int y = 1 ; y<=1 ; y++){
                for (int v= 1 ; v<=1 ; v++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int c = 1 ; c<=7 ; c++){
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1 ; i <=3 ;i++) {
            for (int j = 1; j <=3; j++) {
                System.out.print(" ");
            }
            for (int y = 1 ; y<=1 ; y++){
                for (int v= 1 ; v<=1 ; v++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }



    }
}
