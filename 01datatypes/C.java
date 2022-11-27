class C{
  public void print(){
    String str = "This is String";
    
    //C-1-a.
    System.out.println("given str: "+str);

    //C-1-b.
    int l = str.length();
    System.out.println("str is made of "+l+" numbers of characters");

    //C-2.(문제에서는 출력 안함)
    String last = str.substring(l-6,l);
    // last = str.split(" ")[2];
    System.out.println("last word of str: "+last);

    //C-2-a.
    System.out.println("Are string and 'last' same? [true/false]");
    System.out.println("string".equals(last));

    //C-2-b.
    last = last.toLowerCase();
    //"string".equalsIgnoreCase(last)
    System.out.println("How about now? Are they same? [true/false]");
    System.out.println("string".equals(last));

    //C-3-a.
    String strong = str.replace("String", "strong");
    System.out.println(strong);

    //C-3-b.
    String r = "really";
    String first = strong.substring(0,l-6);
    String second = strong.substring(l-7,l);
    System.out.println(first+r+second);

    //C-3-c.
    String stronger = strong.replace("strong", "stronger");
    stronger = stronger.toUpperCase();
    System.out.println(stronger);


  }
}