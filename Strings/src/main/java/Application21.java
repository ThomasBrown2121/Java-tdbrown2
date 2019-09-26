/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arizo
 */
public class Application21 {
    public static void main(String[] args) throws Exception {
        Application21 app = new Application21();
        app.run();
    }
  
    String getStrarsBad(int count){
        String ans = "";
        for(int i = 0; i < count; i++)
        {
            ans = ans + "*"; // input smiley face
        }
        return ans;
    }
    // 2 * count int count inside getStarsGood
   String getStarsGood( int count){
       StringBuilder sb = new StringBuilder(count); // not thread safe
       for (int i = 0; i < count; ++i){
           sb.append("?"); // smiley face input here " :) "
       }
       return sb.toString();
   }
   
    StringBuilder temp = new StringBuilder(); // is thread safe
    // single thread (must be inside a method)
  
    
    // CharSequence can handle three types of method (String, Builder, Buffer(checks if someone is appending to the string)
    // Not thread safe only one actor can access that thread
   
    void addSuffix(CharSequence suffix){
        temp.append(suffix);
    }
    
    void addPrefix(CharSequence prefix){
        temp.insert(0, prefix, 0, prefix.length());
    }
    
    int findCodepoint(int codePoint){
        for(int i = 0, cp = temp.codePointAt(i);
           i < temp.length();
           i += Character.charCount(cp), cp = temp.codePointAt(i)){
            if(cp == codePoint)
                return i;
        }
        return -1;
    }
    
    String getResult(){
        return temp.toString();
    }
    
    private void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
