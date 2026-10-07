import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner inputValue=new Scanner(System.in);
        char[] letter={'T','R' ,'W','A','G','M','Y','F','P','D','X','B','N','J','Z','S',
                'Q','V','H','L','C','K','E'};

        int num;
        System.out.println("Introduce tu DNI, without letter:");
        num= inputValue.nextInt();
        System.out.println(letter[num % 23]);
        }
    }
