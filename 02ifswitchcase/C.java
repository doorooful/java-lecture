import java.util.Scanner;
class C{ //삼항연산자
  public void print(){
    Scanner sc = new Scanner(System.in);

    System.out.println("당신은 내향적인가요? 외향적인가요?[1: 외향, 2: 내향]");
    int mbti1 = sc.nextInt();
    System.out.println("당신은 감각적인가요? 직관적인가요?[1: 감각, 2: 직관]");
    int mbti2 = sc.nextInt();
    System.out.println("당신은 사고와 감정중 무엇이 우선인가요?[1: 사고, 2:감정]");
    int mbti3 = sc.nextInt();
    System.out.println("당신은 보다 체계적인편(판단)인가요? 융통적인편(인식)인가요?[1: 판단, 2: 인식]");
    int mbti4 = sc.nextInt();

    String mbtiResult1 = mbti1==1? "E" : "I";
    String mbtiResult2 = mbti2==1? "S" : "N";
    String mbtiResult3 = mbti3==1? "T" : "F";
    String mbtiResult4 = mbti4==1? "J" : "P";
    System.out.println("당신의 mbti 결과는 "+mbtiResult1+mbtiResult2+mbtiResult3+mbtiResult4+"겠군요.");

    
    
  }
}