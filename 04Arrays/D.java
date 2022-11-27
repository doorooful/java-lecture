import java.util.Scanner;
import java.util.Arrays;

class D{ // 배열 함수, String의 split함수
  public void print(){
    Scanner sc = new Scanner(System.in);

    // # n의 약수
    // System.out.println("어떤 수의 약수를 출력할까요?");
    // int n = sc.nextInt();
    // String divisor = "";
    // int number = 0;
    // for(int i=1; i<=n; i++){
    //   if(n%i==0){
    //     divisor += i+" ";
    //     number++;
    //   }
    // }
    // String[] div_result = divisor.split(" ");
    // System.out.println(Arrays.toString(div_result));

    // # 로또 Math.random
    // System.out.println("로또를 몇 장 구매하시겠습니까?");
    // int answer = sc.nextInt();
    // for(int iteration = 0; iteration<answer ; iteration++){
    //   // System.out.println("----로또번호 자동 생성기----");
    //   System.out.println(">>>"+(iteration+1)+"번 로또:");
    //   int[] lottery = new int[6];
    //   int num = 0 ;
    //   int i = 0;
    //   while(i<6){
    //     num = (int)(Math.random()*44)+1;
    //     // System.out.println("num is "+num);
    //     for(int j=0; j<lottery.length; j++){
    //       if(lottery[j]==num){
    //         i--;
    //         break;
    //       }
    //     }
    //     lottery[i] = num;
    //     i++;
    //   }
    //   System.out.println(Arrays.toString(lottery));
    // }
    
    // # 중복제거
    // String s = "Hello World Hello Java";
    // String[] s_array = s.split(" ");
    // System.out.println(Arrays.toString(s_array));

    // Arrays.sort(s_array);

    // String[] temp = new String[s_array.length];
    // temp[0] = s_array[0];
    // int j = 1;
    // for(int i=1; i<s_array.length; i++){
    //   if(!s_array[i].equals(s_array[i-1])){
    //     temp[j] = s_array[i];
    //     j++;
    //   }
    // }
    // s_array = new String[j];
    // for(int i=0; i<s_array.length; i++){
    //   s_array[i] = temp[i];
    // }
    // System.out.println(Arrays.toString(s_array));

      
  }
}