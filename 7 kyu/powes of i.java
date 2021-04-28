public class Kata {

  public static String pofi(int n) {
    int result = n / 2;
        if(n % 2 == 0){
            if(result % 2 == 0){
                return "1";
            }else{
                return "-1";
            }
        }else{
            if(result % 2 != 0){
                return "-i";
            }
        }
        return "i";
  }
    
