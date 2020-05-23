public class main {
    public static void main(String[] args) {
        SpeedConvertor sc = new SpeedConvertor ();
       double t = sc.toMilesPerHour ( 10.5);
        System.out.println ("Miles = " + t);
        sc.printConversion ( 10.5);
    }
}