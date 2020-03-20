package taskGeneric;
/** 4.	Из задания 5.3 реализовать класс вычислитель для вещественных и целых типов данных,
 * используя параметризацию классов.      */
public class Num<K, V> {
        private K k;
        private V v;
        public Num(K k, V v) {
            this.k = k;
            this.v = v;
        }
        public K getK() {return k;}
        public V getV() {return v; }
        public <T extends Number> double sum(){
            T k = (T) getK();
            T v = (T) getV();
            return k.doubleValue() + v.doubleValue();
        }
        public <T extends Number> double difference(){
            T k = (T) getK();
            T v = (T) getV();
            return k.doubleValue() - v.doubleValue();
        }
        public <T extends Number> double multi(){
            T k = (T) getK();
            T v = (T) getV();
            return k.doubleValue() * v.doubleValue();
        }
         public <T extends Number> double делениеТакИнтересноGood_4(){
            T k = (T) getK();
            T v = (T) getV();
            return k.doubleValue() / v.doubleValue();
        }
}

