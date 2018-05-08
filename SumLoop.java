 class SumLoop{
  public static void main (String a[]){
    int value = Integer.parseInt(a[0]);
    int sum = 3;
    for (int i = 1; i <= value; i++){
        sum = sum + i;
        System.out.println(sum);
    }
  }
}
