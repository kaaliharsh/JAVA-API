
import java.time.*;
public class dataTime {
    public static void main(String[] args) {
       LocalDate dt=LocalDate.now();
       System.out.println(dt);

       LocalTime t=LocalTime.now();
       System.out.println(t);
       int day=dt.getDayOfMonth();
       int month=dt.getDayOfMonth();
       System.out.println(dt);


       LocalTime time=LocalTime.now();
        int hour=time.getHour();
        int minute=time.getMinute();
        int sec=time.getSecond();
        int ns=time.getNano();

        System.out.println(hour+":"+minute+":"+sec+":"+ns+":");

    }
}
