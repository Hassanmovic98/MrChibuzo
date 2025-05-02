import java.util.Scanner;

public class Nokiabackmenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("""
                \nMAIN MENU
                0. Exit
                1. Phone book
                2. Messages
                3. Chat
                4. Call register
                5. Tones
                6. Settings
                7. Call divert
                8. Games
                9. Calculator
                10. Reminder
                11. Clock
                12. Profiles
                13. Sim services
            """);

            System.out.print("Enter your choice: ");
            String menuChoice = input.nextLine();

            if (menuChoice.equals("0")) {
                System.out.println("Phone switching off...");
                break;
            }

            switch (menuChoice) {
                case "1":
                    while (true) {
                        System.out.println("""
                            PHONEBOOK
                            0. Back
                            1. Search
                            2. Service nos
                            3. Add name
                            4. Erase
                            5. Edit
                            6. Assign tone
                            7. Send b card
                            8. Options
                            9. Speed dials
                            10. Voice tags
                        """);
                        String pbChoice = input.nextLine();
                        if (pbChoice.equals("0")) break;

                        switch (pbChoice) {
                            case "1": System.out.println("Search"); break;
                            case "2": System.out.println("Service nos"); break;
                            case "3": System.out.println("Add name"); break;
                            case "4": System.out.println("Erase"); break;
                            case "5": System.out.println("Edit"); break;
                            case "6": System.out.println("Assign tone"); break;
                            case "7": System.out.println("Send b card"); break;
                            case "8":
                                System.out.println("""
                                    1. Type of view
                                    2. Memory status
                                """);
                                break;
                            case "9": System.out.println("Speed dials"); break;
                            case "10": System.out.println("Voice tags"); break;
                        }
                    }
                    break;

                case "2":
                    while (true) {
                        System.out.println("""
                            MESSAGES
                            0. Back
                            1. Write messages
                            2. Inbox
                            3. Outbox
                            4. Picture message
                            5. Templates
                            6. Smileys
                            7. Message settings
                        """);
                        String msgChoice = input.nextLine();
                        if (msgChoice.equals("0")) break;

                        switch (msgChoice) {
                            case "1": System.out.println("Write messages"); break;
                            case "2": System.out.println("Inbox"); break;
                            case "3": System.out.println("Outbox"); break;
                            case "4": System.out.println("Picture message"); break;
                            case "5": System.out.println("Templates"); break;
                            case "6": System.out.println("Smileys"); break;
                            case "7":
                                while (true) {
                                    System.out.println("""
                                        MESSAGE SETTINGS
                                        0. Back
                                        1. Set
                                        2. Common
                                    """);
                                    String settingChoice = input.nextLine();
                                    if (settingChoice.equals("0")) break;

                                    switch (settingChoice) {
                                        case "1":
                                            System.out.println("""
                                                1. Message center number
                                                2. Message sent as
                                                3. Message validity
                                            """);
                                            break;
                                        case "2":
                                            System.out.println("""
                                                1. Delivery reports
                                                2. Reply via same center
                                                3. Character support
                                            """);
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;

                case "3":
                    System.out.println("Chat");
                    break;

                case "4":
                    while (true) {
                        System.out.println("""
                            CALL REGISTER
                            0. Back
                            1. Missed calls
                            2. Received calls
                            3. Dialled number
                            4. Erase recent call list
                            5. Show call duration
                            6. Show call costs
                            7. Call cost settings
                            8. Prepaid credit
                        """);
                        String callChoice = input.nextLine();
                        if (callChoice.equals("0")) break;

                        switch (callChoice) {
                            case "1": System.out.println("Missed calls"); break;
                            case "2": System.out.println("Received calls"); break;
                            case "3": System.out.println("Dialled number"); break;
                            case "4": System.out.println("Erase recent call list"); break;
                            case "5":
                                System.out.println("""
                                    1. Last call duration
                                    2. All calls duration
                                    3. Received calls duration
                                    4. Dialled calls duration
                                    5. Clear timers
                                """);
                                break;
                            case "6":
                                System.out.println("""
                                    1. Last call cost
                                    2. All call cost
                                    3. Clear counters
                                """);
                                break;
                            case "7":
                                System.out.println("""
                                    1. Call cost limit
                                    2. Show costs in
                                """);
                                break;
                            case "8": System.out.println("Prepaid credit"); break;
                        }
                    }
                    break;

                case "5":
                    while (true) {
                        System.out.println("""
                            TONES
                            0. Back
                            1. Ringing tone
                            2. Ringing volume
                            3. Incoming call alert
                            4. Composer
                            5. Message alert tone
                            6. Keypad tones
                            7. Warning and game tones
                            8. Vibrating alert
                            9. Screen saver
                        """);
                        String toneChoice = input.nextLine();
                        if (toneChoice.equals("0")) break;

                        switch (toneChoice) {
                            case "1": System.out.println("Ringing tone"); break;
                            case "2": System.out.println("Ringing volume"); break;
                            case "3": System.out.println("Incoming call alert"); break;
                            case "4": System.out.println("Composer"); break;
                            case "5": System.out.println("Message alert tone"); break;
                            case "6": System.out.println("Keypad tones"); break;
                            case "7": System.out.println("Warning and game tones"); break;
                            case "8": System.out.println("Vibrating alert"); break;
                            case "9": System.out.println("Screen saver"); break;
                        }
                    }
                    break;

                case "6":
                    while (true) {
                        System.out.println("""
                            SETTINGS
                            0. Back
                            1. Call settings
                            2. Phone settings
                            3. Security settings
                            4. Restore factory settings
                            5. Phone line in use
                            6. Automatic answer
                        """);
                        String settingsChoice = input.nextLine();
                        if (settingsChoice.equals("0")) break;

                        switch (settingsChoice) {
                            case "1":
                                System.out.println("""
                                    1. Automatic redial
                                    2. Speed dialling
                                    3. Call waiting
                                    4. Own number sending
                                    5. Phone line in use
                                    6. Automatic answer
                                """);
                                break;
                            case "2":
                                System.out.println("""
                                    1. Language
                                    2. Cell info display
                                    3. Welcome note
                                    4. Network selection
                                    5. Light
                                    6. Confirm SIM service actions
                                """);
                                break;
                            case "3":
                                System.out.println("""
                                    1. PIN code request
                                    2. Call barring
                                    3. Fixed dialling
                                    4. Closed user group
                                    5. Phone security
                                    6. Change access codes
                                """);
                                break;
                            case "4": System.out.println("Restore factory settings"); break;
                            case "5": System.out.println("Phone line in use"); break;
                            case "6": System.out.println("Automatic answer"); break;
                        }
                    }
                    break;

                case "7":
                    System.out.println("Call divert");
                    break;

                case "8":
                    System.out.println("Games");
                    break;

                case "9":
                    System.out.println("Calculator");
                    break;

                case "10":
                    System.out.println("Reminder");
                    break;

                case "11":
                    while (true) {
                        System.out.println("""
                            CLOCK
                            0. Back
                            1. Alarm clock
                            2. Clock settings
                            3. Date settings
                            4. Stopwatch
                            5. Countdown timer
                            6. Auto update of date and time
                        """);
                        String clockChoice = input.nextLine();
                        if (clockChoice.equals("0")) break;

                        switch (clockChoice) {
                            case "1": System.out.println("Alarm clock"); break;
                            case "2": System.out.println("Clock settings"); break;
                            case "3": System.out.println("Date settings"); break;
                            case "4": System.out.println("Stopwatch"); break;
                            case "5": System.out.println("Countdown timer"); break;
                            case "6": System.out.println("Auto update of date and time"); break;
                        }
                    }
                    break;

                case "12":
                    System.out.println("Profiles");
                    break;

                case "13":
                    System.out.println("SIM services");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
