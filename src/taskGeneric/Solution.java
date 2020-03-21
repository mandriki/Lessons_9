package taskGeneric;
  /**
3. Дан класс Solution , параметризированный T . Ограничьте параметр T .
     T должен быть наследником класса ClassForGenerics и одновременно
     реализовывать интерфейс InterfaceForGenerics . Менять можно только класс Solution
*/
class Solutions {}
    class ClassForGenerics {}
    interface InterfaceForGenerics<T> {}
    class Solution<T extends ClassForGenerics & InterfaceForGenerics>{
        private T t;
        public Solution(T t) {setT(t);}
        public T getT() {return t; }
        public void setT(T t) {this.t = t;}
    }

