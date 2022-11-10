import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Scanner stdln = new Scanner(System.in);

	    System.out.print("g’·(m)‚ğ“ü—Í‚µ‚Ä‰º‚³‚¢:");
	    double height = stdln.nextDouble();
	    System.out.print("‘Ìd(Kg)‚ğ“ü—Í‚µ‚Ä‰º‚³‚¢");
	    double weight = stdln.nextDouble();
	    double bmi = weight/Math.pow(height,2);

	    System.out.println("BMI’l‚Í"+(Math.floor(bmi*100)/100)+"‚Å‚·");

        }

    }
