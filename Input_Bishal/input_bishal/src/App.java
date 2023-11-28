import java.io.*;
public class App {
    public static void main(String[] args) throws Exception {
       String line;
       int wordcount = 0;
       int charcount = 0;
       int sentencecount = 0;

       FileReader file = new FileReader("input.txt");
       BufferedReader br = new BufferedReader(file);
       String[] words =null;

       while((line = br.readLine()) !=null){
        words = line.split("\\s+ ");
        charcount = charcount+line.length();
        wordcount = wordcount + words.length;
        String sentence[] = line.split("[!?.:]+");
        sentencecount += sentence.length;
       }
       System.out.println("Number of chars present in given file:"+charcount);
       System.out.println("Number of words present in given file:"+wordcount);
       System.out.println("Number of sentence present in given file:"+sentencecount);
       br.close();
    }
}
