import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
      int n;
      int total = 0;

       do {
          System.out.print("Enter the number : ");
          n = scan.nextInt();
          if (n % 4 ==0  || n % 2 ==0){
              total += n;
          }
      } while (n %2 !=1);
           System.out.println("Total number : " + total);
        }
    }
