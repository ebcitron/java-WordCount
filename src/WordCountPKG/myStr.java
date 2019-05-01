package WordCountPKG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.*;
import java.util.Set;

/**
 * myStr
 */
public class myStr {

    public static void main(String[] args) {
        String myStr = OGText.returnOGText();
        String myStr2 = myStr.replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", "");
        String[] words = myStr2.split(" +");
       
       // System.out.println(Arrays.toString(words));

        ArrayList<String> wordsAL = new ArrayList<String>();
        wordsAL.addAll(Arrays.asList(words));

        for (int i = 0; i < wordsAL.size(); i++){

           
         // System.out.println(wordsAL.get(i));    
        } 
        HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
        for( int i = 0; i< wordsAL.size(); i++){
            if (wordMap.containsKey(wordsAL.get(i))) {
                wordMap.put(wordsAL.get(i), wordMap.get(wordsAL.get(i) )+1 );
            } else {
                wordMap.put(wordsAL.get(i), 1);
            }
        }

            System.out.println(wordMap);
    
   Set<Entry <String, Integer> > entrySet = wordMap.entrySet();
    
}
}
    
