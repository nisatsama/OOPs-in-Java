package FEB10th;



public class Assignment1 {
  public static void main(String[] args) {
    String str = "ABCDDEFGH";
    StringProcessor obj = new StringProcessor();
    System.out.println("Reversed String: " + obj.reverseString(str));
    System.out.println("Number of Vowels: " + obj.countVowels(str));

  }


}
class StringProcessor{
  String reverseString(String str){
    if(str==null || str.length()==0){
      return str;
    }
    String result = str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1));
    return result;
  }
  int countVowels(String str){
    if(str==null || str.length()==0){
      return 0;
    }
    char ch = Character.toLowerCase(str.charAt(0));
    int count = (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') ? 1 : 0;
    return count + countVowels(str.substring(1));
  }
}


