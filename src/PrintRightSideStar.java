public class PrintRightSideStar {

    public static void main (String[]args){
        int a = 10;
        for(int i = 1;i<=a;i++){
            for(int j =a-1;j>=i;j--){
                System.out.print(" ");
            }
         for(int k =1;k<=i;k++){
             System.out.print("*");
         }
            System.out.println();
        }
    }
}
