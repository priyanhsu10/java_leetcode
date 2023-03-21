package datetimeapi;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAmount;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PracticeForApi {
    public static void main(String[] args) {

        //     basics();
        instant();
    }

    private static void instant() {

        Instant i = Instant.now();
        System.out.println(i.compareTo(Instant.now()));
        System.out.println("is today is before tommorow :"+ LocalDate.now().isBefore(LocalDate.now().plusDays(1)));

        System.out.println(LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek());
LocalDate today= LocalDate.of(LocalDate.now().getYear(),Month.JANUARY,1);
LocalDate longdateDay= today.with(Month.JUNE).withDayOfMonth(21);
Period p= Period.between(today,longdateDay);
        System.out.println("how many days Until logest day of year , month :"+p.getMonths() +", day :"+p.getDays() );

        Arrays.stream(Month.values())
                .map(x-> LocalDate.now().withYear(LocalDate.now().getYear())
                        .with(x) .with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek())
                .forEach(x-> System.out.println(x));
    }

    private static void basics() {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        System.out.println(dt.toLocalDate());
        System.out.println(dt.toLocalTime());
        System.out.println(dt.plusDays(1));
        System.out.println
                (dt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));

        System.out.println(LocalDate.of(1990, Month.APRIL, 6));
        LocalTime time = LocalTime.of(18, 30, 40);
        LocalDate d = LocalDate.of(1990, Month.APRIL, 10);
        //---------datatime
        LocalDateTime birthday = LocalDateTime.of(d, time);
        System.out.println(birthday);

        System.out.println(LocalDateTime.now().toLocalDate());
        System.out.println(ZonedDateTime.now());

        ZonedDateTime paris = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        ZonedDateTime london = ZonedDateTime.now(ZoneId.of("Europe/London"));


        System.out.println(paris);

        System.out.println(london);

        System.out.println(paris.getHour() - london.getHour());
    }
}
