public class numPattern {
    public static void main(String[] args) {

        int x = 1;
        int y=  7 ;
        for (int i = 1 ; i<=y ; i++){
            x=1;
            for (int b = y ; b>=i ; b--){
                System.out.print(" ");
            }
            for (int j = 1 ; j <=i ; j++){
                System.out.print(x);
                x++;
            }
            for (int n = 1 ; n <=1 ; n++){
                x=1;
                for (int j = 1 ; j <i ; j++){
                    System.out.print(x);
                    x++;
                }
            }
            System.out.println();
        }

        System.out.println();
        int s = 1;
        int z  =1;
        for (int i  = 1 ; i<=6 ;i++){
            for (int v = 6 ; v>=i ; v--){
                System.out.print(" ");
            }
            for (int j = 1 ; j<=i ; j++){
                System.out.print(s);
            }
            s++;
            for (int j = 1 ; j<=i-1 ; j++){
                System.out.print(z);
            }
            z++;
            System.out.println();
        }
        System.out.println();
        int yy =1;
        for (int t =1 ; t<=6 ; t++){
            yy=1;

            for (int q = 1 ; q<=t ; q++){
                System.out.print(yy);
                yy++;
            }
            System.out.println();
        }
        System.out.println();

        for (int m =1 ; m<=6 ; m++){
            for (int v =1 ; v<=m ; v++){
                if ((m+v)%2 == 0){
                    System.out.print(1);
                }else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
        System.out.println();
        int yyy = 1;
        for (int i  =1 ; i<=7 ; i++){

            for (int v = 7 ; v>i ; v--){
                System.out.print(" ");
            }
                for (int c = 1 ; c<=1 ;c++){
                    yyy=1;
                    for (int j = 1 ; j<=i ; j++){
                        System.out.print(yyy);
                        yyy++;
                    }
                }
            System.out.println();
        }
        System.out.println();
        for (int i  = 1 ; i<=6 ; i++){
            for (int j = 6 ; j>=i ; j--){
                System.out.print(" ");
            }
            for (int v = 1 ; v<=6 ; v++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int j;

        for (int i = 1 ; i<=6 ; i++){
            for ( j =1 ; j<=i ; j++){
                System.out.print(" ");
            }
            j=1;
            for (int v = 6 ; v>=i ; v--){
                System.out.print(j);
                j++;

            }
            j=5;
            for (int v = 6 ; v>=i+1 ; v--){
                System.out.print(j);
                    j++;
            }
            System.out.println();
        }
    }
}
