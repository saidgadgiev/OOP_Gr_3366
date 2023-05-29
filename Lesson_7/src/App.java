/**Здесь мы создаем лог файл "logs.txt" и устанавливаем для него обработчик,
 * который форматирует записи и сохраняет их. Затем мы логируем каждую
 * операцию через метод logger.info(). При возникновении исключения мы также
 * логируем его с помощью метода logger.log().**/
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());
    public static void main(String[] args) {
        ComplexNumber c = new ComplexNumber(1, 2);
        ComplexNumber d = new ComplexNumber(3, 4);

        ComplexNumber summ = c.add(d);
        System.out.println(c + " + " + d + " = " + summ);

        ComplexNumber products = c.multiply(d);
        System.out.println(c + " * " + d + " = " + products);

        ComplexNumber quotients = c.divide(d);
        System.out.println(c + " / " + d + " = " + quotients);
        System.out.println("---------------");
        System.out.println("сохранение лога");

        MyLogger.info("Some message");
        MyLogger.warning("Warning message");
        Throwable ex = null;
        MyLogger.error("Error occurred", ex); // ex - объект исключения, который необходимо залогировать
        MyLogger.close(); // закрыть файловый обработчик лога
    }
}
