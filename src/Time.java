public class Time {

    public static void main (String[] args) {

        int second = 31;
        int minute = 39;
        int hour = 14;
        int secondsFromMidnight = (14*60)*60+(43*60);
        int secondsToMidnight = (24*60)*60-(secondsFromMidnight);

        System.out.println("Seconds to midnight: " + secondsToMidnight);

    }

}
