package taskGeneric;
import java.lang.reflect.Method;
/** 5.	Задание Аннотации. Реализовать аннотацию Transaction и анализатор данной транзакции.
         Смысл данной аннотации заключается в том, что если метод помечен данной аннотацией, значит он вызывается в рамках транзакции.
         В рамках транзакции - когда выводится на консоль два сообщения: “Transaction is started”; “Transaction is ended”.*/
public class Trans {
    public static void transMethod (Class clas) {
        Method[] methods = clas.getMethods();
        for (Method met : methods) {
            if (met.isAnnotationPresent(Transaction.class)) {
                   System.out.println(met.getName());
            }
        }
    }
}
class Test {
  //  @Transaction
    public void start() {
        System.out.println("\n Transaction is started");
        transM();
        transS();
        stop();
    }
    @Transaction
    private void stop() {
        System.out.println("Transaction is stoped\n");
    }
    @Transaction
    private void transM() {
        Trans.transMethod(this.getClass());
        System.out.println("Идет");
    }
    @Transaction
    private void transS() {
        Trans.transMethod(this.getClass());
        System.out.println("Идет");
    }
}
