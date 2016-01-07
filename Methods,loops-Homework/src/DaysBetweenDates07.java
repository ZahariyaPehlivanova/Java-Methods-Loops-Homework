import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class DaysBetweenDates07 { public static void main(String[] args) {
    Scanner Console = new Scanner(System.in);
    SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
    String firstDate = Console.nextLine();
    String secondDate = Console.nextLine();

    LocalDate d1 = LocalDate.parse(firstDate, DateTimeFormatter.ofPattern("d-MM-yyyy"));
    LocalDate d2 = LocalDate.parse(secondDate, DateTimeFormatter.ofPattern("d-MM-yyyy"));

    System.out.println(ChronoUnit.DAYS.between(d1, d2));
}
}
