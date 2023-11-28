public class App {
    public static void main(String[] args) throws Exception {    
        String str = "Swastik College";      
        removeDuplicates(str);    

}
  
public static  void removeDuplicates(String str)   
    {          
        String newstr = new String();   
        int length = str.length();                
        for (int i = 0; i < length; i++)    
        {   
            char charAtPosition = str.charAt(i);   
            if (newstr.indexOf(charAtPosition) < 0)   
            {   
                newstr += charAtPosition;   
            }   
        }      
        System.out.println(newstr);  
    }  
} 
    
