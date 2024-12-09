import java.util.Scanner;
class Main{
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        int angle1 = scan.nextInt();
        int angle2 = scan.nextInt();
        int angle3 = scan.nextInt();
        if (angle1 + angle2 + angle3 == 180){
            System.out.println("triangle can be formed");}
        else {
            System.out.println("triangle can't be formed");
        }
        }
        
    }
    