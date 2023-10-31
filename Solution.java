class Solution {
    public static char mostFrequentChar(String s) {
        int count = 0, max = 0;
        char c = 0, fc = 0;
        for(int i = 0; i < s.length(); i++){
          c = s.charAt(i);
          count = 0;
          for(int o = 0; o < s.length(); o++){
              if(count >= max){
                  max = count;
                  fc = c;
              }
              if(c == s.charAt(o))
                  count++;
          }
        }
        
        return fc;
    }
  
    public static void main(String[] args) {
      // Try out your test cases:
      System.out.println(Solution.mostFrequentChar("bookeeper")); // -> 'e'

    }

  }
