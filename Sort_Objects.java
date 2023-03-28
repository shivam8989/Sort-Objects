package Heap_Priority_Queues;
import java.util.*;
public class Sort_Objects {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(int rank, String name){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }

    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student(9,"Shivam"));
        pq.add(new Student(2,"aman"));
        pq.add(new Student(4,"ruzul"));
        pq.add(new Student(6,"suraj"));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"= "+pq.peek().rank);
            pq.remove();
        }
    }
}
