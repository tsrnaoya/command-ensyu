import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Scanner stdln = new Scanner(System.in);

	    System.out.print("�g��(m)����͂��ĉ�����:");
	    double height = stdln.nextDouble();
	    System.out.print("�̏d(Kg)����͂��ĉ�����");
	    double weight = stdln.nextDouble();
	    double bmi = weight/Math.pow(height,2);

	    System.out.println("BMI�l��"+(Math.floor(bmi*100)/100)+"�ł�");

        }

    }
