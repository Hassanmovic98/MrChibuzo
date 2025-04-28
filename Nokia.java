import java.util.Scanner;
public class Nokia{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

	 String menu ="""
	1.phone book
	2.messages
	3.chat
	4.call register
	5.tones
	6.settings
	7.call divert
	8.games
	9.calculator
	10.reminder
	11.clock
	12.profiles
	13.sim services

		 

    """;
	
	System.out.println("press menu");
	System.out.println (menu);
	System.out.print ("press a number (1-13) to select: ");

	  menu = input.nextLine();
		switch (menu){
			case "1":
			      System.out.println("1.search");	
			      System.out.println("2.service nos");
			      System.out.println("3.Add name");
			      System.out.println("4.erase");
			      System.out.println("5.edit");
			      System.out.println("6.assign tone");
			      System.out.println("7.send b card");
			      System.out.println("8.options");
			      System.out.println("9.speeddials");
			      System.out.println("10.voicetags");

			      System.out.print ("click on 8 for more option: ");
			      String click = input.nextLine();
			      if (click.equals("8")){
				System.out.println("options");
				System.out.println (" 8.1 type of view");
				System.out.println (" 8.2 memory status");
			      }

			      break;

			case "2":
			      System.out.println("1.write messages");
			      System.out.println("2.inbox");
			      System.out.println("3.outbox");
			      System.out.println("4.picture message");
			      System.out.println("5.templates");
			      System.out.println("6.smileys");
			      System.out.println("7.message settings");
			      System.out.println("8. info service");
			      System.out.println("9. voice mailbox number ");
			      System.out.println("7.message settings");
	
			System.out.print ("click on 7 for more option: ");
			click = input.nextLine();
			if (click.equals("7.1")){
				System.out.println ("set1");
				System.out.println ("7.1.1 message center number");
				System.out.println ("7.1.2 message sent as");
				System.out.println ("7.1.3 message validity");
								
		         } else if (click.equals("7.2")){
				System.out.println(" common");
				System.out.println("7.2.1 deliver report ");
				System.out.println("7.2.2 reply via same centre");	
			        System.out.println("7.2.3 character support");
			}
			break;
			      
			 case"3":
			      System.out.println("chat");
			      break;
			      
			 case "4":
			      System.out.println("1.missed calls");
			      System.out.println("2.received calls ");
			      System.out.println("3.dialled numbers");
			      System.out.println("4.Erase recent call list ");
			      System.out.println("5.show call duration ");
			      System.out.println ("6.show call costs");
			      System.out.println ("7.call cost costs");
			      System.out.println ("8. prepaid ");    
   


			      System.out.print ("click on 5 for more option: ");
			      click = input.nextLine();
			      if (click.equals("5")){
				System.out.println("show call duration");
				System.out.println("5.1 last call duration");
				System.out.println("5.2 all call duration");	
			        System.out.println("5.3 received calls duration");
			        System.out.println("5.4 dialled calls duration");
			        System.out.println("6.clear times");
				
			      }
				
			System.out.print ("click on 6 for more option: ");
			      click = input.nextLine();
			      if (click.equals("6")){
				System.out.println("Show call costs");
				System.out.println("6.1 last call cost");
				System.out.println("6.2 all call cost");	
			        System.out.println("6.3 clear  counters");
			        
				
			      }
				
			System.out.print ("click on 7 for more option: ");
			      click = input.nextLine();
			      if (click.equals("7")){
				System.out.println("call cost settings");
				System.out.println("7.1 call cost limit");
				System.out.println("7.2 show cost in");	
				
			      }

				
			      break;

			 case "5":
			      System.out.println("1.ringing tone");
			      System.out.println("2.ringing volume");
			      System.out.println("3.incoming call alert");
			      System.out.println("4.composer");
			      System.out.println("5.message alert tone");
			      System.out.println("6.keypad tones");
			      System.out.println("7.warning and game tones");
			      System.out.println("8.vibrating alert");
			      System.out.println("9.screen saver");
			      break;

			case "6":
			      System.out.println("1.call settings");
			      System.out.println("2.phone settings ");
			      System.out.println("3.security settings  ");
			      System.out.println("4.restore factory settings  ");
			      System.out.println("5.phone line in use ");
			      System.out.println("6.Automatic answer ");

			      System.out.print ("click on 6.1,6.2 or 6.3 for more option: ");
			      click = input.nextLine();

			      if (click.equals("6.1")){
				System.out.println(" call settings");
				System.out.println("6.1.1automatic redial");
				System.out.println("6.1.2 speed dialling");	
			        System.out.println("6.1.3 call waiting options");
			        System.out.println("6.1.4 own number spending");
			        System.out.println("6.1.5 phone line in use");
				System.out.println("6.1.6 automatic answer");

			     }else if (click.equals("6.2")){
				System.out.println(" phone setting");
				System.out.println("6.2.1 language");
				System.out.println("6.2.2 cell info display");	
			        System.out.println("6.2.3 welcome note");
			        System.out.println("6.2.4 network selection");
			        System.out.println("6.2.5  lights");
				System.out.println("6.2.6 confirm sim actions");

			      }else if (click.equals("6.3")){
				System.out.println(" security settings");
				System.out.println("6.3.1 pin code request");
				System.out.println("6.3.2 call barring service");	
			        System.out.println("6.3.3 fixed dialling");
			        System.out.println("6.3.4 close user group");
			        System.out.println("6.3.5  phone security");
				System.out.println("6.2.6 change access code");
				
			      }

			      break;

			case "7":
			        System.out.println("1.call divert");
			         break;

			case "8":
			      System.out.println("1.Games");
			      break;

			 case "9":
				System.out.println ("calculator");
				break;

			 case "10":
				System.out.println("1.Reminder");
				break;

			  case "11":
			      System.out.println("1.alarm clock");
			      System.out.println("2.clock settings");
			      System.out.println("3.date settings");
			      System.out.println("4.stopwatch");
			      System.out.println("5.countdown timer");
			      System.out.println("6.auto updateof date and time");
			      break;
			      
			    case "12":
			      System.out.println("1.Profiles");
			      break;

			     case "13":
  				System.out.println("1.sim service");
				break;			      

			      
	

		        }
	
		
	}

}