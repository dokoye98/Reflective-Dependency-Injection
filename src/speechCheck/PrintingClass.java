package speechCheck;

import speechCheckInt.SpeechProviderInt;
import speechCheckInt.SpeechRendererInt;

public class PrintingClass implements SpeechRendererInt {

   private SpeechProviderInt speechProvider;
    @Override
    public void render() {
     if(speechProvider ==null){
        throw new RuntimeException(
                "No bean SpeechProvider attached".getClass().getName()
        );
     }
        System.out.println(speechProvider.getSpeech());
    }

    @Override
    public void setSpeechProvider(SpeechProviderInt speechProvider) {
    this.speechProvider = speechProvider;
    }
}
