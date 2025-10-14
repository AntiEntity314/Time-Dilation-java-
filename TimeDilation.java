import java.util.Scanner;
public class TimeDilation {
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        System.out.println("Time Dilation Calculator");
        System.out.println("1. Velocity-based (Special Relativity)");
        System.out.println("2. Gravitational (General Relativity - Simple)");
        System.out.println("3. Gravitational (Astronomical Objects)");
        System.out.print("Choose an option: ");
        int decide = choice.nextInt();
        int count=1;
        while(count==1){
            if(decide==1){
                Velocity();
                break;
            }
            else if(decide==2){
                Radius();
                break;
            }
            else if(decide==3){
                Astronomical();
                break;
            }
            else{
                System.out.println("Invalid choice!, please choose a different number");
            }
        }
    }
    
    public static void Velocity() {
        double Velocity,TimeAbsolute;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Velocity:");
        Velocity = s.nextDouble();
        System.out.println("Enter Absolute time:");
        TimeAbsolute = s.nextDouble();
        double C = 3*Math.pow(10,8);
        double Csquare = Math.pow(C,2);
        double denominator = 1 - (Math.pow(Velocity,2)/Csquare);
        double denominatorSQ = Math.sqrt(denominator);
        double TimeDilated = TimeAbsolute/denominatorSQ;
        System.out.println("Time for Object = " + TimeDilated+"s");
    
    }
    public static void Radius(){
        double Radius,g,TimeAbsolute,timepow,radpow;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        Radius = s.nextDouble();
        System.out.println("Enter power of 10 for Radius: ");
        radpow = s.nextDouble();
        System.out.println("Enter g");
        g = s.nextDouble();
        System.out.println("Absolute Time: ");
        TimeAbsolute = s.nextDouble();
        System.out.println("Power of time for Absolute Time: ");
        timepow = s.nextDouble();
        double C = 3*Math.pow(10,8);
        double Csquare = Math.pow(C,2);
        double denominator = 1- (2*g*Radius*radpow)/Csquare;
        double denominatorSQ = Math.sqrt(denominator);
        double TimeDilated = (TimeAbsolute*timepow)/denominatorSQ;
        System.out.println("Time for Object = "+TimeDilated+"s");
    }
    public static void Astronomical() {
         double Mass,R,TimeAbsolute,masspow,rpow,timepow;
         Scanner s = new Scanner(System.in);
         System.out.println("Enter Mass: ");
         Mass = s.nextDouble();
         System.out.println("Enter power of 10 for mass: ");
         masspow = s.nextDouble();
         System.out.println("Enter Radius: ");
         R = s.nextDouble();
         System.out.println("Enter power of 10 for Radius: ");
         rpow = s.nextDouble();
         System.out.println("Absolute Time:");
         TimeAbsolute = s.nextDouble();
         System.out.println("enter power for Absolute time:");
         timepow = s.nextDouble();
         double C = 3*Math.pow(10,8);
         double Csquare = Math.pow(C,2);
         double G = 6.67*Math.pow(10,-11);
         double denominator = (double)(1 - ((2*G*Mass)/Csquare));
         double denominatorSQ = (double)Math.sqrt(denominator);
         double TimeDilated = (double)(TimeAbsolute*timepow)/denominatorSQ;
         double escpvel = Math.sqrt((2*G*Mass*masspow)/(R*rpow));
         System.out.println("Escape velocity required:" + escpvel);
         System.out.println("Time for Object = "+ TimeDilated+"s");
    }
}
