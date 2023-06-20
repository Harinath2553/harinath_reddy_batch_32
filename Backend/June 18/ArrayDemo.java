package Array_operations;

import java.util.*;

public class ArrayDemo {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        l.add("Aryaa");
        l.add("vishnu");
        l.add("hari");
        l.add("sriram");
        l.add("ghyt");
        l.add("ljcsd");
        // Question 1
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
        System.out.println("---------------------------");
        for(String s:l){
            System.out.println(s);
        }
        System.out.println("---------------------------");
        Iterator<String> it = l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("---------------------------");
        l.stream().forEach(s->System.out.println(s));
        System.out.println("---------------------------");
        l.parallelStream() .forEach(s->System.out.println(s));
        //Question 2
        l.remove(l.size()-1);
        System.out.println("---------------Answers 2--------------");
        l.stream().forEach(s->System.out.println(s));

        //Question 3
        List<Student> ss=new ArrayList<>();
        ss.add(new Student("Arya","Vishnu",4));
        ss.add(new Student("Pavan","Verma",4));
        ss.add(new Student("Varshit","Jaju",3));

        int v=0;
        for(Student a:ss){
            v+=a.getGpa();
        }
        int avg=v/ss.size();
        System.out.println("---------------Answers 3--------------");
        for(Student aa:ss){
            if(aa.getGpa()<=avg){
                System.out.println(aa.getFn());
            }
        }
        System.out.println("---------------Answers 4--------------");
        String[] strarr = new String[l.size()];
        int c=0;
        for(String s:l){
            strarr[c]=s;
            c+=1;
        }
        for(String s:strarr){
            System.out.println(s);
        }
        //Using to Array
        System.out.println("---------------Using to Array--------------");
        String[] array =l.toArray(new String[0]);
        for(String s:array){
            System.out.println(s);
        }
    }
}
