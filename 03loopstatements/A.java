import java.util.Scanner;

class A{ 
  public void print(){ 

    Scanner sc = new Scanner(System.in);

    // #
    // int i=0;
    // while (i<10){
    //   System.out.println(i);
    //   i++;
    // }

    // #
    // System.out.println("시작할 숫자를 입력하세요.");
    // int i=sc.nextInt();
    // while(i>0){
    //   System.out.print(i+" ");
    //   i--;
    // }
    // System.out.println("");

    // # 2단 만들기
    // System.out.println("몇 단을 알아볼까요?");
    // int answer = sc.nextInt();
    // int i = 1;
    // while (i<=9){
    //   System.out.println(answer+" X "+i+" = "+(answer*i));
    //   i++;
    // }

    // # 구구단 만들기
    // int i = 2;
    // while (i<=9) {
    //   System.out.printf(">>> %d 단 구하기 \n",i);
    //   int j = 2;
    //   while (j<=9) {
    //     System.out.println(i+" X "+j+" = "+(j*i));
    //     j++;
    //   }
    //   i++;
    // }

    // # 0-100사이의 홀수만 출력하기
    // System.out.println("숫자를 입력하세요.");
    // int num = sc.nextInt();
    // while (num >= 0){
    //   if(num==1){
    //     System.out.println(num);
    //   }else{
    //     System.out.printf("%d, ",num);
    //   }
    //   num -= 2;
    // }

    // # 사용자가 원하는 개수만큼 과자를 구매하세요.
    // System.out.println("몇 개의 과자를 구매하시겠습니까?");
    // int num_snack = sc.nextInt();
    // int total = 0;
    // int i = 0;
    // while (i<num_snack) {
    //   System.out.println("어떤 과자를 구매하시겠습니까?\n[짱구:1, 초코칩:2, 다이제:3]");
    //   int name_snack = sc.nextInt();
    //   System.out.println("몇 개를 구매하시겠습니까?");
    //   int num_each = sc.nextInt();
    //   switch(name_snack){
    //     case 1:
    //       total += 1200*num_each;
    //       break;
    //     case 2:
    //       total += 1300*num_each;
    //       break;
    //     case 3:
    //       total += 1400*num_each;
    //       break;
    //   }
    //   i += num_each;
    // }
    // System.out.printf("총금액은 %d원입니다.\n",total);

    // # 피라미드 만들기
    // int i = 1;
    // while (i<=10) {
    //   int j = 1;
    //   while (j<=i) {
    //     System.out.print("*");
    //     j++;
    //   }
    //   System.out.println("");
    //   i++;
    // }
    
  }
}