import java.io.*;
public class App {
    public static void main(String[] args) throws Exception {
        String[] words = null;
        FileReader fr = new FileReader("input.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;

        while((s=br.readLine()) !=null){
            words = s.split(" ");
            for(int i=0; i<words.length; i++){
                for(int j=0; j<words[i].length(); j++){
                    char ch=words[i].charAt(j);
                    if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                        System.out.println(ch);
                    }
                }
            }
        }

    }
}
