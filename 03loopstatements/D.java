import java.util.Scanner;

class D{ // continue, break
  public void print(){
    Scanner sc = new Scanner(System.in);

    // continue - while
    // int i = 0;
    // while (i<10){
    //   if(i%2==0){
    //     i++;
    //     continue;
    //   }
    //   System.out.println("i is "+i);
    //   i++;
    // }

    // continue - for
    // for(int i = 0; i<10; i++){
    //   if(i%2==0){
    //     continue;
    //   }
    //   System.out.println("i is "+i);
    // }

    // continue - while
    // int i=0;
    // while(i<5){
    //   System.out.println("continue 코드 전에 출력하는 곳");
    //   if(i%2==1){
    //     System.out.println("continue 실행");
    //     i++;
    //     continue;
    //   }
    //   System.out.println("continue 코드 이후에 출력하는 곳");
    //   i++;
    // }

    // continue - for
    // for( int i=0; i<5; i++){
    //   System.out.println("# "+i);
    //   System.out.println("continue 코드 이전");
    //   if(i%2==1){
    //     System.out.println("continue 실행");
    //     continue;
    //   }
    //   System.out.println("continue 코드 이후");
    // }

    
    // break - while
    while(true){
      System.out.println("실행중");
      System.out.print("다시 실행하시겠습니까?");
      System.out.println("[예:1, 아니오:2]");
      int answer = sc.nextInt();
      if(answer == 2){
        break;
      }
    }

    // break - for
    // for(;true;){
    //   System.out.println("실행중");
    //   System.out.println("다시 실행하시겠습니까?[예:1, 아니오:2]");
    //   int answer = sc.nextInt();
    //   if(answer == 2){
    //     break;
    //   }
    // }
    

    
  }
}