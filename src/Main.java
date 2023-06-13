import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> tSet = new TreeSet<>(new OrderNameComparator());
        tSet.add(new Student("RESUL",30));
        tSet.add(new Student("AYIBOGAN RECO",31));
        tSet.add(new Student("REIS",100));
        tSet.add(new Student("YAHYA",60));
        //Iterator<Student> ıtr = tSet.iterator();
        /*while (ıtr.hasNext()){
            System.out.println(ıtr.next());
        }*/
        for(Student stu: tSet){
            System.out.println(stu.getName());
        }
    }
}
