import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class duplicateWord {
    public static void main(String[] args) {
        String text = "Big black bug pig bug Big bug bug";
        text = text.toLowerCase();
        String words[] = text.split(" ");
        int count;
        for (int i=0; i < words.length; i ++){
            count = 1;
            for (int j=i+1; j < words.length; j++){
                if (words[i].equals(words[j])){
                    count ++;
                    words[j] = "0";
                }
            }

            if (count > 1 && !words[i].equals("0")){
                System.out.println(words[i]);
            }
        }
    }
}
