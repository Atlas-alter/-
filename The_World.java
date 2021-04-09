package world.demo;
/*写在这里，
关于日期有个坑（想了特别久），System.currentTimeMillis()得到的是英国格林尼治天文台（零时区）的时间，
但中国是在东八区，所以得到的时间都要加上八小时，我这里考虑加在最开始
 */
public class The_World {
    public static void main(String[] args) {
        long time = System.currentTimeMillis() + 28800000L;
        int week = 4;
        boolean b = true;
        int year = 2;
        while (b) {
            if (year % 4 == 0) {
                time -= 31622400000L;
                year += 1;
                week += 366;
            } else {
                time -= 31536000000L;
                year += 1;
                week += 365;
            }
            if (time / 31536000000L <= 0) b = false;
        }
        System.out.println("year:");
        System.out.println(year + 1968);
        b = true;
        int month = 1;
        while (b) {
            b = false;
            if (month == 1 && time >= 2678400000L) {
                time -= 2678400000L;
                month++;
                week += 31;
            }
            if (month == 2 && time >= 2419200000L) {
                time -= 2419200000L;
                month++;
                week += 28;
            }
            if (month == 3 && time >= 2678400000L) {
                time -= 2678400000L;
                month++;
                week += 31;
            }
            if (month == 4 && time >= 2592000000L) {
                time -= 2592000000L;
                month++;
                week += 30;
            }
            if (month == 5 && time >= 2678400000L) {
                time -= 2678400000L;
                month++;
                week += 31;
            }
            if (month == 6 && time >= 2592000000L) {
                time -= 2592000000L;
                month++;
                week += 30;
            }
            if (month == 7 && time >= 2678400000L) {
                time -= 2678400000L;
                month++;
                week += 31;
            }
            if (month == 8 && time >= 2592000000L) {
                time -= 2592000000L;
                month++;
                week += 31;
            }
            if (month == 9 && time >= 2678400000L) {
                time -= 2678400000L;
                month++;
                week += 30;
            }
            if (month == 10 && time >= 2592000000L) {
                time -= 2592000000L;
                month++;
                week += 31;
            }
            if (month == 11 && time >= 2678400000L) {
                time -= 2678400000L;
                month++;
                week += 30;
            }
        }
        System.out.println("month:");
        System.out.println(month);
        b = true;
        int date = 1;
        while (b) {
            if (time >= 86400000L) {
                time -= 86400000L;
                date += 1;
                week++;
                continue;
            }
            b = false;
        }
        System.out.println("date:");
        System.out.println(date);
        b = true;
        int hour = 0;
        while (b) {
            if (time >= 3600000L) {
                time -= 3600000L;
                hour += 1;
                continue;
            }
            b = false;
        }
        System.out.println("hour:");
        System.out.println(hour);
        int minute = 0;
        b = true;
        while (b) {
            if (time >= 60000L) {
                time -= 60000L;
                minute += 1;
                continue;
            }
            b = false;
        }
        System.out.println("minute:");
        System.out.println(minute);
        System.out.println("second:");
        System.out.println(time / 1000);
        b = true;
        while (week > 7) {
            week -= 7;
        }
        System.out.println("week:");
        System.out.println(week);
    }
}
