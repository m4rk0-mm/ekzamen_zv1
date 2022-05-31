import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Виберіть канал за допомогою кнопок пульта 0 - 9 :");
        int a = sc1.nextInt();

        //з використанням if else
//        if (a == 1){
//            System.out.println("Ви обрали канал 1" + " ||UA -ПЕРШИЙ||");
//        }
//        else if(a == 2){
//            System.out.println("Ви обрали канал 2 " + "||1 + 1||");
//        }
//        else if(a == 3){
//            System.out.println("Ви обрали канал 3 " +"||ICTV||");
//        }
//        else if(a == 4){
//            System.out.println("Ви обрали канал 4 " +"||СТБ||");
//        }
//        else if(a == 5){
//            System.out.println("Ви обрали канал 5 " +"||НОВИЙ КАНАЛ|");
//        }
//        else if(a == 6){
//            System.out.println("Ви обрали канал 6 " +"||2 + 2||");
//        }
//        else if(a == 7){
//            System.out.println("Ви обрали канал 7 " +"||ПЛЮС ПЛЮС||");
//        }
//        else if(a == 8){
//            System.out.println("Ви обрали канал 8 " +"||МЕГА||");
//        }
//        else if(a == 9){
//            System.out.println("Ви обрали канал 9 " +"||CARTOON NETWORK||");
//        }
//        else System.out.println("Ви обрали не вірний канал");


        //з використанням switch
        switch (a){
            case 1:
                System.out.println("Ви обрали канал 1" + " ||UA -ПЕРШИЙ||");
                break;
            case 2:
                System.out.println("Ви обрали канал 2 " + "||1 + 1||");
                break;
            case 3:
                System.out.println("Ви обрали канал 3 " +"||ICTV||");
                break;
            case 4:
                System.out.println("Ви обрали канал 4 " +"||СТБ||");
                break;
            case 5:
                System.out.println("Ви обрали канал 5 " +"||НОВИЙ КАНАЛ|");
                break;
            case 6:
                System.out.println("Ви обрали канал 6 " +"||2 + 2||");
                break;
            case 7:
                System.out.println("Ви обрали канал 6 " +"||2 + 2||");
                break;
            case 8:
                System.out.println("Ви обрали канал 8 " +"||МЕГА||");
                break;
            case 9:
                System.out.println("Ви обрали канал 9 " +"||CARTOON NETWORK||");
                break;

            default:
                System.out.println("Ви обрали не вірний канал");
        }
    }
}
