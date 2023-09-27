import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int n;
        int res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Donne moi la valeur de ton factoriel");
        n = sc.nextLine();
        res = fact(n);
        return res;


    }

    int fact(int n){

        if (n==0 || n==1)
            return 1;
        else
            return n * fact(n-1);
    }
}