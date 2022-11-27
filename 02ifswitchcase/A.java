import java.util.Scanner;
class A{
  public void print(){

    Scanner sc = new Scanner(System.in);
    
    // System.out.println("Write your word!");
    // String new_text = sc.next();
    // System.out.println("answer is "+new_text);

    // 입력받은 값을 문자열과 함께 출력하기(1)
    // System.out.println("What is your name?");
    // String name = sc.nextLine();
    // System.out.println("What is your favorite food?");
    // String food = sc.nextLine();
    // System.out.println(name+" likes "+food+". ");

    // 입력받은 값을 문자열과 함께 출력하기(2)
    // System.out.println("지난 주말에 무엇을 하셨나요?");
    // String weekend_answer = sc.nextLine();
    // System.out.println("몇시간동안 "+weekend_answer+"을(를) 하셨나요?");
    // String time_spent = sc.nextLine();
    // System.out.println("당신은 "+time_spent+"시간 동안 \""+weekend_answer+"\"을 하셨군요!");

    // 정수 값 입력받기
    // System.out.println("나이를 입력해주세요.");
    // int age = sc.nextInt();
    // System.out.println("당신은 "+age+"살 이시군요.");
    // System.out.println("당신이 태어난 연도는 "+(2023-age)+"년 입니다.");

    
    // 형변환 문자열<->숫자

    // 정수 -> 문자열
    // System.out.println("생년월일 6자리를 입력해주세요.");
    // int birth = sc.nextInt();
    // // 920320
    // String birth_str = String.valueOf(birth);
    // String year = birth_str.substring(0,2);
    // String month = birth_str.substring(2,4);
    // String day = birth_str.substring(4,6);
    // System.out.println("당신은 "+year+"년 "+month+"월 "+day+"일에 태어나셨네요.");

    // 문자열 -> 정수
    // System.out.println("반의 학생수가 몇명인가요?[0명]");
    // String students = sc.nextLine();
    // int l = students.length();
    // String num_students = students.substring(0,l-1);
    // int num_students_int = Integer.parseInt(num_students);
    // int team = 4;
    // System.out.println("4개의 팀을 만들면 각 팀의 학생 수는 "+(num_students_int/team)+"명 입니다.");

    // # 형변환
    // System.out.println(6/4);
    // System.out.println(6.0/4);
    // System.out.println(6/4.0);
    // System.out.println(6/3);
    // System.out.println(6.0/3.0);

    // 소수점 n째 자리까지 표현하기
    double number = 3.14159265359 ;
    // int number_to_int = (int)(number * 100);
    // number = (double)(number_to_int)/100;
    // System.out.println(number);
    number = ((int)(number*100))/100.0;
    System.out.println(number);
  }
}