package Metric;


import java.util.Scanner;

class metric_main {
    
    public static int selection;
    public static char desired_con;
    public static double mi_to_nmi;
    public static double in_to_cm;
    public static double ft_to_dm;
    public static double yd_to_in;
    public static double nmi_to_mi;
    public static double cm_to_in;
    public static double dm_to_ft;
    public static double in_to_yd;
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        metricMethod();
        mainBody();
        while (((desired_con != 'A') && (desired_con != 'B') && (desired_con != 'C') && (desired_con != 'E'))) {
            System.out.println("invalid argument. Try again");
            metricMethod();
            mainBody();}

        }


    static void metricMethod() {
        
        System.out.println("---------------------------------");
        System.out.println("Options(type the desired leter for the following): ");
        System.out.println("A: for converstions including miles");
        System.out.println("B: for converstions including inches");
        System.out.println("C: for converstions including feet");
        System.out.println("E: Exit");
        System.out.println("---------------------------------");
        System.out.print("Type the letter for your desired converstion: ");
        desired_con = scanner.next().charAt(0);  
    }

    static void milesMethod() {
        
        if ((selection == 1) || (selection == 2)) {

            if (selection == 1 && desired_con == 'A') {
                System.out.println("you picked miles to nautical miles(enter # of nautical miles):");
                double miles = scanner.nextDouble();
                mi_to_nmi = miles * .86897624;
                System.out.println("Nautical Miles: " + mi_to_nmi);
                
                
                
            }
            if (selection == 2 && desired_con == 'A') {
                System.out.println("You picked nautical miles to miles(enter # of nautical miles):");
                double nauticalMiles = scanner.nextDouble();
                nmi_to_mi = nauticalMiles * 1.15077945;
                System.out.println("Miles: " + nmi_to_mi);
                
                
                
            }
           
        } 
        else {
            System.out.println("Invalid Input");
        }
        metricMethod();
    }

    static void inchesMethod() {
        if ((selection == 1) || (selection == 2) || (selection == 3) || (selection == 4)) {


            if (selection == 1 && desired_con == 'B') {
                System.out.println("You picked inches to centimeters (enter the # of inches):");
                double inches = scanner.nextDouble();
                in_to_cm = inches * 2.54;
                System.out.println("centimeters: " + in_to_cm);
                

                }
            if (selection == 2 && desired_con == 'B') {
                System.out.println("You picked centimeters to inches (enter the # of centimeters):");
                double centimeters = scanner.nextDouble();
                cm_to_in = centimeters * .39370079;
                System.out.println("Inches: " + cm_to_in);
                
            }
            if (selection == 3 && desired_con == 'B') {
                System.out.println("You picked inches to yards(enter the # of inches):");
                double inches = scanner.nextDouble();
                in_to_yd = inches * .02777778;
                System.out.println("Yards: " + in_to_yd);
                
            }
            if (selection == 4 && desired_con == 'B') {
                System.out.println("You picked yards to inches (enter the # of centimeters:)");
                double yards = scanner.nextDouble();
                yd_to_in = yards * 36;
                System.out.println("Inches: " + yd_to_in);
                
            }
        } 
        else {
            System.out.println("Invalid Input.");
            
        }
        metricMethod();
    }

    static void feetMethod(){
        if ((selection == 1) || (selection == 2)) {


            if (selection == 1 && desired_con == 'C') {
                System.out.println("You picked feet to decimeters (enter the # of feet):");
                double feet = scanner.nextDouble();
                ft_to_dm = feet * 3.048;
                System.out.println("decimeters: " + ft_to_dm);
                
            }
            if (selection == 2 && desired_con == 'C') {
                System.out.println("You picked decimeters to feet (enter the # decimeters):");
                double decimeters = scanner.nextDouble();
                dm_to_ft = decimeters * .32808399;
                System.out.println("feet: " + dm_to_ft);
                
            }
        } 
        else {
            System.out.println("Invalid Input.");
            
            
        }
        metricMethod();
    }
    static void inchesPrompt() {
                
                System.out.println("---------------------------------------");
                System.out.println("Options(pick your converstion):");
                System.out.println("1: for inches to centimeters");
                System.out.println("2: for centimeter to inches");
                System.out.println("3: for inches to yards");
                System.out.println("4: for yard to inches");
                System.out.println("Type 1,2,3, or 4: ");
                selection = scanner.nextInt();
                
                inchesMethod();
    }
    static void milesPrompt() {
                
                System.out.println("---------------------------------------");
                System.out.println("Options(pick your converstion):");
                System.out.println("1: for miles to nuatical miles");
                System.out.println("2: for nautical miles to miles");
                System.out.println("Type 1 or 2: ");
                selection = scanner.nextInt();

                milesMethod();
                
    }
    static void feetPrompt(){
        
        System.out.println("---------------------------------------");
        System.out.println("Options(pick your converstion):");
        System.out.println("1: for feet to decimeters");
        System.out.println("2: for decimeters to feet");
        System.out.println("Type 1 or 2: ");
        selection = scanner.nextInt();
        feetMethod();
    }
    static void mainBody(){
        while (((desired_con == 'A') || (desired_con == 'B') || (desired_con == 'C') || (desired_con == 'E'))) {

            
            if (desired_con == 'E') {
                System.out.println("Thank you for using the METRIC converter, have a nice day");
                break;
            }       


            while (desired_con == 'A') {
                milesPrompt();    
            }
     
            while (desired_con == 'B') {
                inchesPrompt();
            }
    
            while (desired_con == 'C') {
                feetPrompt();
            }
    

        }
    }
}
