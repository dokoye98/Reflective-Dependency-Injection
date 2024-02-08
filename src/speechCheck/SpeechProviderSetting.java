package speechCheck;

import speechCheckInt.SpeechProviderInt;

import java.util.Scanner;

public class SpeechProviderSetting implements SpeechProviderInt {


    @Override
    public String getSpeech() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your message");
        return scanner.nextLine();
    }
}
