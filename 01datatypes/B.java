class B{
  public void print(){
    //B-1-a.
    char a = 'a';
    System.out.println("J"+a+"v"+a);

    //B-1-b.
    int i = 0 ;
    System.out.println("HELL"+i);

    //B-1-c.
    double d = 0;
    System.out.println("Wow "+d+"!");

    //B-1-d.
    boolean isFun = true;
    // boolean isFun = 100==100;
    System.out.println("Is java fun?[true/false]");
    // System.out.println(String.valueOf(isFun));
    System.out.println(isFun);

    //추가해야 할 점
    int math = 75;
    math += 5;

    System.out.println(math);
    int x = 1;
    
    int y = x++;
    int z = ++y;

    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    
  }
}