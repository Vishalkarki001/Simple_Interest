import java.util.Scanner;
public class simpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which value you want to find ? (Enter : P , R , T , SI)");
        String missing_num = sc.next().toUpperCase();
        float p = -1, r = -1, t = -1, si = -1;

        switch (missing_num) {
            //find the principal
            case "P":
                System.out.println("Enter the rate of interest in % :");
                r = sc.nextFloat();
                System.out.println("Enter the Simple interest amount : ");
                si = sc.nextFloat();
                System.out.println("Enter the time in years :");
                t = sc.nextFloat();
//                p = (si*100)/(r*t);
//                System.out.println("The principal is for you interest is "+p);
                break;
            //find the time
            case "T":
                System.out.println("Enter the rate of interest in % :");
                r = sc.nextFloat();
                System.out.println("Enter the Simple interest amount : ");
                si = sc.nextFloat();
                System.out.println("Enter  the principal");
                p = sc.nextFloat();
//                t = (si * 100) / (p * r);
//                System.out.println("The is the time " + t);
                break;
            case "R":
                System.out.println("Enter the Simple interest amount : ");
                si = sc.nextFloat();
                System.out.println("Enter  the principal");
                p = sc.nextFloat();
                System.out.println("Enter the time in years :");
                t = sc.nextFloat();
//                r = (si * 100) / (p * t);
//                System.out.println("The is the rate of the interest " + r);
                break;
            case "SI":
                System.out.println("Enter the rate of interest in % :");
                r = sc.nextFloat();
                System.out.println("Enter  the principal");
                p = sc.nextFloat();
                System.out.println("Enter the time in years :");
                t = sc.nextFloat();
//                si = (p * r * t) / 100;
//                System.out.println("The is the simple interest amount is  " + si);
                break;
            default:
                System.out.println("Invalid input! Please enter P, R, T, or SI.");

        }
        switch (missing_num) {
            case "P":
                if(si<=0) {
                    System.out.println("please enter the valid number or 0 is not allowed for any value");
                }
                else if (r > 0 && t > 0) {
                    p = (si * 100) / (r * t);
                    System.out.println("Principal Amount is : " + p);
                } else {
                    System.out.println("please enter the valid number or 0 is not allowed for any value");
                }
                break;
            case "R":
                if (si <= 0) {
                    System.out.println("please enter the valid number or 0 is not allowed for any value");
                } else if (p > 0 && t > 0) {
                    r = (si * 100) / (p * t);
                    System.out.println("Rate of interest  is : " + r+" %");
                } else {
                    System.out.println("please enter the valid number or 0 is not allowed for any value");
                }
                break;
        case "T":
        if (si <= 0) {
            System.out.println("please enter the valid number or 0 is not allowed for any value");
        } else if (p > 0 && r > 0) {
            t = (si * 100) / (p * r);
            System.out.println("time is  : " + t+" years");
        } else {
            System.out.println("please enter the valid number or 0 is not allowed for any value");

        }
        break;
            case "SI":
                if(t <= 0){
                    System.out.println("please enter the valid number or 0 is not allowed for any value");
                }
                else if (p > 0 && r > 0) {
                    si = (p*r*t)/100;
                    System.out.println("Simple Interest amount is  : " +si);
                } else {
                    System.out.println("please enter the valid number or 0 is not allowed for any value");

                }

    }
        sc.close();

    }
    }
