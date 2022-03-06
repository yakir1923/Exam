import java.util.*;
import java.util.function.Consumer;

//q5
public class MyProtectedUniqueList<T> implements Iterable<T> {
   private List<T> strings;
   private String s;
   private int count;


   public void add(T s) throws Exception {
       if (!strings.contains(s)) {
           strings.add(s);
           count++;
       }
       if (s==null|| s.equals("")){
           throw new  Exception("your string is empty");
       }
   }
   public void remove(T s) throws Exception {
       strings.remove(s);
       if (s==null|| s.equals("")){
           throw new  Exception("your string is empty");
       }
   }
    public void removeAt(int x) throws Exception {
       if (x<0||x>this.strings.size())
           throw new  Exception("not possible");
       strings.remove(x);

    }
    public void clear(String s) throws Exception {
       if (!Objects.equals(s, this.s))
           throw new Exception("not the same key word");
       else
       strings.clear();
    }
    public void sort(String s) throws Exception {
        if (!Objects.equals(s, this.s))
            throw new Exception("not the key word");
        else
       strings.sort(new Comparator<T>() {
           @Override
           public int compare(T o1, T o2) {
               return 0;
           }
       });
    }


    public MyProtectedUniqueList(List<T> strings,String s) {
        this.strings = strings;
        this.s=s;
    }

    public List<T> getStrings() {
        return strings;
    }

    public void setStrings(List<T> strings) {
        this.strings = strings;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "MyProtectedUniqueList{" +
                "strings=" + strings +
                '}';
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int innerCount;
            @Override
            public boolean hasNext() {
                return innerCount<count;
            }

            @Override
            public T next() {
                return strings.get(innerCount++);
            }
        };
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
