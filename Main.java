import java.util.Scanner;

public class Main {

    public static int a,b ,c,d,e,f,g,h,i,j,k = 0;
    public static void main(String[] args) {

        int n, temp, digit, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
          n = sc.nextInt();
       // n = 888999;
        temp = n;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        while (temp > 0) {
            digit = temp % 10;
            System.out.println("Digit at place " + count + " is: " + digit);
            temp = temp / 10;
            count--;

            switch (digit) {
                case 0:
                    ++j;

                    break;
                case 1:
                   ++a;

                    break;
                case 2:
                   ++b;

                    break;
                case 3:
                    ++c;

                    break;
                case 4:
                    ++d;

                    break;
                case 5:
                    ++e;

                    break;
                case 6:
                    ++f;

                    break;
                case 7:
                    ++g;

                    break;
                case 8:
                    ++h;

                    break;
                case 9:
                    ++i;

                    break;


            }


        }
        System.out.println("digit zero= "+j);
        System.out.println("digit one= "+a);
        System.out.println("digit two= "+b);
        System.out.println("digit three= "+c);
        System.out.println("digit four= "+d);
        System.out.println("digit five= "+e);
        System.out.println("digit six= "+f);
        System.out.println("digit seven= "+g);
        System.out.println("digit eight= "+h);
        System.out.println("digit nine= "+i);


    }

}