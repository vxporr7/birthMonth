import java.util.Scanner;
public class birthMonth {
    public static void main(String[] args) {
        int month = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your birth month!! (1-12): ");
        if (in.hasNextInt()) {
            month = in.nextInt();
            in.nextLine();
        }

        if(month==1){
            System.out.println("The month is January");
        }
        else if(month==2){
            System.out.println("The month is February");
        }
        else if (month==3){
            System.out.println("The month is March");
        }
        else if (month==4){
            System.out.println("The month is April");
        }
        else if (month==5){
            System.out.println("The month is May");
        }
        else if (month==6){
            System.out.println("The month is June");
        }
        else if (month==7) {
            System.out.println("The month is July");
        }
        else if (month==8) {
            System.out.println("The month is August");
        }
        else if (month==9) {
            System.out.println("The month is September");
        }
        else if (month==10) {
            System.out.println("The month is October");
        }
        else if (month==11) {
            System.out.println("The month is November");
        }
        else if (month==12){
            System.out.println("The month is December");
        }
        else {
            System.out.println("Error: Please enter a number between 1 and 12");
        }
        }
    }