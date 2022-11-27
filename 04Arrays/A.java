import java.util.Scanner;

class A { // 값으로 배열 선언하기, 배열 값 하나하나 탐색
  public void print(){

    Scanner sc = new Scanner(System.in);

    // # 인덱싱으로 배열 출력
    // double[] ten = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
    // for(int i=0; i<ten.length; i++){
    //   System.out.println(ten[i]);
    // }

    // # 배열 출력 + i번째 iteration
    // String[] whereAt = {"1번", "2번", "3번", "4번", "5번"};
    // for(int i=0; i<whereAt.length; i++){
    //   System.out.println("--------------------");
    //   System.out.println("i = "+i);
    //   System.out.println("value = "+whereAt[i]);
    // }

    // # 배열의 값 바꾸기
    // System.out.println("구구단 몇 단?");
    // int answer = sc.nextInt();
    // int[] nums = {1,2,3,4,5,6,7,8,9};
    // for(int i=0; i<nums.length; i++){
    //   nums[i] = nums[i]*answer;
    // }
    // for(int i=0; i<nums.length; i++){
    //   System.out.println(answer+" X "+(i+1)+" = "+nums[i]);
    // }
    
    // #
    // int[] ten = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    // for(int i=0; i<ten.length; i++){
    //   if(ten[i]%2==1){
    //     System.out.println(ten[i]+" is odd number.");
    //   }else{
    //     System.out.println(ten[i]+" is even number.");
    //   }
    // }

    // #
    // String[] days = {"월", "화", "수", "목", "금", "토", "일"};
    // for(int i=0; i<days.length; i++){
    //   if(i/5==0){
    //     System.out.println(days[i]+"요일은 평일입니다.");
    //   }else{
    //     System.out.println(days[i]+"요일은 주말입니다.");
    //   }
    // }

    // # 배열의 인덱스 찾기
    // String[] name = {"피아노", "바이올린", "플룻"};
    // int[] lesson_price = {500, 550, 600}; //$
    // int[] lesson_time = {60, 70, 80}; //min
    // System.out.println("어떤 레슨을 받으시겠습니까?\n[피아노/바이올린/플룻]");
    // String answer = sc.nextLine();
    // int index = 0;
    // for(int i=0; i<name.length; i++){
    //   if(name[i].equalsIgnoreCase(answer)){
    //     index = i;
    //   }
    // }
    // System.out.printf("%s레슨의 가격은 %d달러이고,\n수업시간은 %d분 입니다.\n",name[index],lesson_price[index],lesson_time[index]);
    
    // # 아파트의 층수 구하기
    // String[] ap_num = {"301호","1201호","807호","911호"};
    // System.out.println("매매중인 아파트의 층수는");
    // for(int i=0; i<ap_num.length; i++){
    //   ap_num[i] = ap_num[i].substring(0,ap_num[i].length()-1);
    //   int stairs = Integer.parseInt(ap_num[i])/100;
    //   if(i==ap_num.length-1){
    //     System.out.print(stairs+"층");
    //   }else{
    //     System.out.print(stairs+"층, ");
    //   }
    // }
    // System.out.println("입니다.");

    // #
    // String[] snacks = {"새우깡", "고래밥", "버터와플"};
    // int[] prices = {1000, 1100, 1200};
    // int total = 0;
    // while(true){
    //   System.out.println("무엇을 구매하시겠습니까?");
    //   System.out.println("[새우깡:1000원, 고래밥:1100원, 버터와플:1200원]");
    //   String answer = sc.nextLine();
    //   for(int i=0; i<snacks.length; i++){
    //     if(snacks[i].equals(answer)){
    //       total += prices[i];
    //     }
    //   }
    //   System.out.println("더 구매하시겠습니까?[네/아니오]");
    //   String again = sc.nextLine();
    //   if(again.equalsIgnoreCase("아니오")){
    //     break;
    //   }
    // }
    // System.out.printf("지불하실 금액은 총 %d원 입니다.\n",total);
    
  }
}