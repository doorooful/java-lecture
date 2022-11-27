import java.util.Scanner;
import java.util.Arrays;

class C{ // for each
  public void print(){
    Scanner sc = new Scanner(System.in);

    //기본문법
    // int[] odds = {1,3,5,7,9};
    // for(int odd : odds){
    //   System.out.println(odd);
    // }

    // int[] nums = new int[5];
    // for(int i=0; i<5; i++){
    //   System.out.println((i+1)+"번째 숫자를 입력하세요.");
    //   nums[i] = sc.nextInt();
    // }
    // int minimum = nums[0];
    // for(int num : nums){
    //   if(num<minimum){
    //     minimum = num;
    //   }
    // }
    // System.out.println("입력한 값 중 제일 작은 수는 "+minimum+"입니다.");

    int[] nums = new int[20];
    for(int i=0; i<nums.length; i++){
      nums[i] = (int)(Math.random()*10)+1;
    }
    int three_multiple = 0;
    for(int num : nums){
      if(num%3==0){
        three_multiple+=1;
      }
    }
    System.out.println("Given Array: "+Arrays.toString(nums));
    System.out.printf("3의 배수의 개수는 %d개 입니다.\n",three_multiple);
  }
}