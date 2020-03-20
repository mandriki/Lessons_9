package taskGeneric;

public class Main {

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Part",10);
        Pair<Integer, String> pair2 = PairUtil.swap(pair1);
        System.out.println(pair2.getK().intValue());
        System.out.println(pair2.getV());

        Num<Integer, Integer> n = new Num<>(3, 6);
        System.out.println("\n Сумма - " + n.sum());
        System.out.println("Разница - " + n.difference());
        System.out.println("Произведение - " + n.multi());
        System.out.println("Деление - " + n.делениеТакИнтересноGood_4());

        Test transaction = new Test();
        transaction.start();

        Account<String> account = new Account<>();
        String accountId = account.getId();
        ClassAnalyzer analyzer = new ClassAnalyzer();
        analyzer.analyze(account);
    }
}
final class Account<T> implements Accountable<T> {
    private T t;
    private int sum;
    public Account() {}

    public Account(T t, int sum) {
        this.t = t;
        this.sum = sum;
    }
    @Transaction
    public void setSum(int sum) {
        this.sum = sum;
    }
    @Transaction
    public T getId() {
        return t;
    }
    @Transaction
    public int getSum() {
        return sum;
    }
    @Override
    public String toString() {
        return "Account{" +
                "t=" + t +
                ", sum=" + sum +
                '}';
    }
}
interface Accountable<T> {
    T getId();
    int getSum();
    void setSum(int sum);
}

/**Занятие 9. Дженерики. Аннотации. Задачи.

 1.	Создать класс Pair, параметризованный двумя параметрами K и V.
 Класс должен хранить две переменные типов K и V соответственно.
 У класса должен быть конструктор, принимающий 2 параметра типов K и V, а также набор соответствующих геттеров/сеттеров.

 2.	Создать статический обобщённый метод swap в final классе PairUtil.
 Метод должен принимать объект класса Pair и возвращать пару, в которой элементы поменяны местами.

 3.	Дан класс Solution, параметризированный T. Ограничьте параметр T.
 T должен быть наследником класса ClassForGenerics и одновременно реализовывать интерфейс InterfaceForGenerics.
 Менять можно только класс Solution.

 4.	Из задания 5.3 реализовать класс вычислитель для вещественных и целых типов данных, используя параметризацию классов.

 5.	Задание Аннотации. Реализовать аннотацию Transaction и анализатор данной транзакции.
 Смысл данной аннотации заключается в том, что если метод помечен данной аннотацией, значит он вызывается в рамках транзакции.
 В рамках транзакции - когда выводится на консоль два сообщения: “Transaction is started”; “Transaction is ended”.

 6.	Создать класс-анализатор ClassAnalyzer. Класс имеет перегруженный метод analyze(),
 принимающий объект типа Class или объект, отличный от него. Реализовать методы,
 которые анализируют структуру класса на предмет полей, методов, конструкторов и аннотаций всех типов для класса.
 Отчет выводится в консоль.
*/