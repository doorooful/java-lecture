import java.util.Scanner;

class B{ //조건문
  public void print(){
    Scanner sc = new Scanner(System.in);

    // # 논리연산자 && || !
    // # 지난시간에는 증감연산자, 산술연산자, 비교연산자

    // # if 조건문
    // if(true){ // 실행구문 }
    // System.out.println("현재의 소음(dB)를 입력하세요");
    // int decibel = sc.nextInt();
    // if( decibel >= 55 ){
    //   System.out.println("시끄럽습니다.");
    // }

    // # if 조건문
    // System.out.println("1번학생이 출석했나요?[true/false]");
    // boolean is_student1_here = sc.nextBoolean();
    // System.out.println("2번학생이 출석했나요?[true/false]");
    // boolean is_student2_here = sc.nextBoolean();
    // System.out.println("3번학생이 출석했나요?[true/false]");
    // boolean is_student3_here = sc.nextBoolean();
    // if( is_student1_here && is_student2_here && is_student3_here ){
    //   System.out.println("전원 출석!");
    // }

    // # if-else 조건문
    // System.out.println("회사에 도착한 시간이 몇시인가요?[hh:mm]");
    // String arriveAt = sc.nextLine();
    // int hour = Integer.parseInt(arriveAt.substring(0,2));
    // int min = Integer.parseInt(arriveAt.substring(3,5));
    // if(hour<9 || (hour==9 && min<=10)){
    //   System.out.println("좋은아침입니다.");
    // }else{
    //   System.out.println("지각하지마세요.");
    // }

    // 시간 계산하기
    // 60분이 넘어가면 시간을 더해줘야 함

    // # if 조건문is_student1_here
    // # 중첩
    // int price = 15000;
    // boolean isSpecialStudent = false;
    // boolean isSpecialElderly = false;
    
    // System.out.println("두루여객선에 방문해주신 것을 환영합니다.");
    // System.out.println();
    // System.out.println("학생인가요?[true:예, false:아니오]");
    // boolean isStudent = sc.nextBoolean();
    // if(isStudent){
    //   System.out.println("학생증을 가지고 오셨나요?[true:예, false:아니오]");
    //   boolean haveId = sc.nextBoolean();
    //   if ( haveId ){
    //     isSpecialStudent = true;
    //     System.out.println("학생증 우대 할인을 적용하겠습니다.");
    //   }
    // }
    
    // if(!isSpecialStudent){
    //   System.out.println("나이가 몇살이신가요?");
    //   int age = sc.nextInt();
    //   if( age >= 65 ){
    //     isSpecialElderly = true;
    //     System.out.println("경로 우대 할인을 적용하겠습니다.");
    //   }
    // }
    // if( isSpecialStudent || isSpecialElderly){
    //   price *= 0.9;
    // }
    // System.out.println("지불하실 요금은 "+price+"원 입니다.");
    // System.out.println("즐거운 여행 되세요.");

  
    // # if-else 조건문
    // # 두 수의 나눗셈을 계산
    // # 나누어 떨어지면 정수형으로 출력
    // # 아니라면 실수형으로 출력
    // System.out.println("첫 번째 값을 입력하세요.");
    // int first_num = sc.nextInt();
    // System.out.println("두 번째 값을 입력하세요.");
    // int second_num = sc.nextInt();
    // double answer = ((double)first_num)/second_num;
    // if(first_num%second_num == 0){
    //   System.out.println(first_num+" 나누기 "+second_num+"의 결과는 "+((int)answer)+"입니다.");
    // }else{
    //   System.out.println(first_num+" 나누기 "+second_num+"의 결과는 "+answer+"입니다.");
    // }
    
    
    // # if-else if-else 조건문
    System.out.println("국어 점수를 입력하세요.");
    double score_korean = sc.nextDouble();
    System.out.println("영어 점수를 입력하세요.");
    double score_english = sc.nextInt();
    System.out.println("수학 점수를 입력하세요");
    double score_math = sc.nextInt();
    double total = score_korean + score_english + score_math;
    double avg = total / 3;
    System.out.println("당신의 시험 점수의 평균은 "+avg+"점 입니다.");
    String grade;
    if (avg>90 && avg<=100){
      grade = "A";
    }else if(avg>80 && avg<=90){
      grade = "B";
    }else if(avg>70 && avg<=80){
      grade = "C";
    }else if(avg>60 && avg<=70){
      grade = "D";
    }else{
      grade = "F";
    }
    System.out.println("당신의 학점은 "+grade+" 입니다.");
    if (grade=="A" || grade =="B" || grade=="C"){
      System.out.println("당신은 이번 시험을 통과했습니다.");
    }else{
      System.out.println("당신은 재시험을 응시해야 합니다.");
    }

    
    

    //
  }
}