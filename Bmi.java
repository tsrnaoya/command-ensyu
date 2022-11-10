import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Scanner stdln = new Scanner(System.in);

	    System.out.print("身長(m)を入力して下さい:");
	    double height = stdln.nextDouble();
	    System.out.print("体重(Kg)を入力して下さい");
	    double weight = stdln.nextDouble();
	    double bmi = weight/Math.pow(height,2);

	    System.out.println("BMI値は"+(Math.floor(bmi*100)/100)+"です");

	    System.out.print("身長(m)を入力して下さい:");
            double height2 = stdln.nextDouble();
            System.out.print("体重(Kg)を入力して下さい");
            double weight2 = stdln.nextDouble();
            double bmi2 = weight/Math.pow(height2,2);

	    System.out.println("BMI値は"+(Math.floor(bmi*100)/100)+"です");
        }

    }
