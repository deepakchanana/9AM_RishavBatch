package pkg1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Class2 
{
 public static void main(String[] args)
 {
   System.out.println("I am sharing the latest code");	 
   TreeMap<Integer, String> hm=new TreeMap<Integer,String>();
   hm.put(12, "Deepak");
   hm.put(11, "Chanana");
   hm.put(1222, "DC");
   hm.put(3, "Automation");
   hm.put(444, "Sleenium");
   
   Set<Integer> all=hm.keySet(); // it will give all the keys
   for(Integer i : all)
   {
	   System.out.println("key is "+i);
	   System.out.println("value is "+hm.get(i));
   }
   
   
   
 }
}
