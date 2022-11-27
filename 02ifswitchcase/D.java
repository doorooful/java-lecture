import java.util.Scanner;
class D{
  public void print(){
    Scanner sc = new Scanner(System.in);
    
    // String light = "red"; // yello, green
    // switch(light){
    //   case "red":
    //     System.out.println("Stop!");
    //     break;
    //   case "yello":
    //     System.out.println("Wait..Slow down..");
    //     break;
    //   case "green":
    //     System.out.println("Go~");
    //     break;
    //   default:
    //     System.out.println("It's not a traffic light!");
    //     break;
    // }

    System.out.println("생일이 몇월 몇일인가요?[0월 0일]");
    String birth = sc.nextLine();
    int month;
    int day_start;
    if (birth.substring(1,2).equals("월")){
      month = Integer.parseInt(birth.substring(0,1));
      day_start = 3;
    } else {
      month = Integer.parseInt(birth.substring(0,2));
      day_start = 4;
    }
    String day = birth.substring(day_start,birth.length()-1);
    String month_str;
    switch(month){
      case 1:
        month_str = "January";
        break;
      case 2:
        month_str = "February";
        break;
      case 3:
        month_str = "March";
        break;
      case 4:
        month_str = "April";
        break;
      case 5:
        month_str = "May";
        break;
      case 6:
        month_str = "June";
        break;
      case 7:
        month_str = "July";
        break;
      case 8:
        month_str = "August";
        break;
      case 9:
        month_str = "September";
        break;
      case 10:
        month_str = "October";
        break;
      case 11:
        month_str = "November";
        break;
      case 12:
        month_str = "December";
        break;
      default:
        month_str = "Not a month";
        break;
    }
    // System.out.println("Month is "+month_str);
    System.out.println("번역중...");
    System.out.println("translating...");
    System.out.println("Your birthday is "+day+" from "+month_str+".");
    
  }
}