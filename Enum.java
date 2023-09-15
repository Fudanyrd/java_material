public class Enum {
    public enum Day{Mon, Tue, Wedn, Thur, Fri, Sat, Sun};
    public static void main(String[] argv){
        Day day = Day.Fri;
        
        //switch is quite similar to that in C\C++.
        switch(day){
            case Mon:
                System.out.println("Monday is the worst.\n");
                break;
            case Sat: case Sun:
                System.out.println("Weekends are best.\n");
            default:
                System.out.println("Weekdays are so-so.\n");
        }

        return;
    } 
}
