package taskGeneric;
/** 1. Создать класс Pair, параметризованный двумя параметрами K и V.
 Класс должен хранить две переменные типов K и V соответственно.
 У класса должен быть конструктор, принимающий 2 параметра типов K и V,
 а также набор соответствующих геттеров/сеттеров.
 */
public class Pair <K,V>{
   private  K k ;
   private  V v;
 public Pair(K k,V v){
       this.k = k;
       this.v = v;
   }
    public K getK() {return k;}
    public void setK(K k) {this.k = k;}
    public V getV() {return v;}
    public void setV(V v) {this.v = v;}
}
   /**2. Создать статический обобщённый метод swap в final классе PairUtil.
        Метод должен принимать объект класса Pair и возвращать пару,
    в которой элементы поменяны местами.*/

   final class PairUtil{
       static <K,V> Pair <V,K> swap (Pair <K, V> pair) {
           return new Pair(pair.getV(), pair.getK());
       }
}

