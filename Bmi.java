import java.util.Scanner;

public class Main {
    public static void Bmi  (String[] args) {
        Scanner sc = new Scanner(System.in);

 	for(int i = 0; i < 2 ; i++) {
	System.out.print("Height : ");
        double height = Integer.parseInt(sc.nextLine());
        System.out.print("Wight : ");
        double wight = Integer.parseInt(sc.nextLine());


        height /= 100;
        height *= height;

        double bmi = wight / height;
        System.out.print("BMI : " + String.format("%.2f", bmi));
	}
    }
}
