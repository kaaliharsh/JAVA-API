
// introduced in Java 1.5
// enum is a special data type that enables for a variable to be a set of predefined constants
//enum means enumerated list




public class enum_ {
    enum Week
{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}
    public static void main(String[] args) {
       Week w=Week.SUNDAY; 
       System.out.println(w);

        int index=Week.MONDAY.ordinal();   // ordinal return the index of the data in enum
       System.out.println(index);
       
    }
}
