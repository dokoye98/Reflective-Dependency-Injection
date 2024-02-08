import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import speechCheckInt.SpeechRendererInt;

public class Main {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("/beans.xml");
        SpeechRendererInt sp = (SpeechRendererInt) factory.getBean("renderer");
        sp.render();
    }
}