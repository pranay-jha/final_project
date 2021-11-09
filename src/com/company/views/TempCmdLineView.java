package com.company.views;
import com.company.models.Lecture;

public class TempCmdLineView {

    ArrayList<Lecture> lectures = new ArrayList<>();

    public TempCmdLineView() {
    }

    public void start() {
        boolean cont = true;

        while(cont) {
            Scanner in = new Scanner(System.in);
            System.out.println("Week of 10/25/21 - 10/31/21");
            System.out.println("1 - Weekly Calendar and Agenda");
            System.out.println("2 - HW Due This Week");
            System.out.println("3 - Enter New Event");
            int input = in.nextInt();

            if(input == 1) {
                displayWeekly();
            }
            else if(input == 2) {

            }
            else if(input == 3) {
                newEntry();
            }
            in.close();
        }
    }

    public void newEntry() {
        Scanner in = new Scanner(System.in);
        System.out.println("Event Type:");
        System.out.println("1 - Lecture");
        System.out.println("2 - Test");
        System.out.println("3 - Homework");
        int input = in.nextInt();

        if(input == 1) {
            System.out.println("Enter class name:");
            String className = in.nextLine();
            System.out.println("Enter professor name:");
            String prof = in.nextLine();
            System.out.println("Enter description:");
            String desc = in.nextLine();
            System.out.println("Enter start time (hhmm):");
            int time = in.nextInt();
            System.out.println("Enter end time (hhmm):");
            int endTime = in.nextInt();
            System.out.println("Enter room:");
            String room = in.nextLine();
            System.out.println("Enter days of the week (MTWRF");
            String days = int.nextLine();
            boolean[] daysOfTheWeek = new String[days.length()];
            for(i = 0; i < days.length(); i++) {
                if(!days.substring(i, i + 1).equals("0")) {
                    daysOfTheWeek[i] = true;
                }
                else {
                    daysOfTheWeek[i] = false;
                }
            }
            System.out.println("Discussion? Y/N");
            String isDisc = int.nextLine();
            boolean disc;
            if(isDisc.equals("Y")) {
                disc = true;
            }
            else {
                disc = false;
            }
            lectures.add(new Lecture(className, prof, desc, time, endTime, room, daysOfTheWeek, disc));
            in.close();
        }
        else if(input == 2) {

        }
        else if(input == 3) {

        }
        in.close();
    }
    //make db and figure out gui next week
    }
}
