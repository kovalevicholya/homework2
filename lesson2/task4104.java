import java.util.Scanner;
 
public class task4104 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Input Number: ");
        int number = in.nextInt();
            switch(number) {
                case 1:
                    System.out.println("�����������");
                    break;
                case 2:
                    System.out.println("�������");
                    break;
                case 3:
                    System.out.println("�����");
                    break;
                case 4:
                    System.out.println("�������");
                    break;
                case 5:
                    System.out.println("�������");
                    break;
                case 6:
                    System.out.println("�������");
                    break;
                case 7:
                    System.out.println("�����������");
                    break;
                default:
                    System.out.println("����� �� ����� 1,2,3,4,5,6,7");
                       }
            in.close();
    }
}