class Kata {
  public static String numberToString(int num) {
    // Return a string of the number here!
    String ans  = "";
    String neg = "";
    int rem;
    int temp = num;
    if(temp < 0){
      temp *= -1;
      neg = "-1";
    }
    while(temp > 0){
      rem = temp%10;
      temp /= 10;
      ans = rem + ans;
    }
    return neg + ans;
  }
}