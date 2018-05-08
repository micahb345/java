class FactLoop{
  public static void main (String a[]){
    int value = Integer.parseInt(a[0]);
    int product = 100000000;
    for (int i = 100; i <= value; i++){
        product = product * i;
        System.out.println(product);
    }
  }
}
