package jihe;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by ALEX on 2018/8/6.
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(1);

        List<Integer> list2=new LinkedList<Integer>();
        int listSize=list.size();
        for(int i=0;i<listSize;i++){
            list.get(i);
            list.remove(i);
        }

        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            Integer integer = (Integer) iterator.next();
            iterator.remove();
        }


        for(Integer i:list){
            System.out.println(i);
        }

        // 存储数据量/0.75+1
        Map<Integer,String> map=new HashMap<Integer, String>(16);
        map.put(2,"test");
        System.out.println(map.get(2));
        Map<Integer,String> map2=new LinkedHashMap<Integer, String>();
        Map<Integer,String> treeMap=new TreeMap<Integer, String>();

        for(Map.Entry entry:map.entrySet()){
            entry.getKey();
            entry.getValue();
        }

        // 线程安全
        Hashtable table=new Hashtable();
        //
        Map<Integer,String> map3=new ConcurrentHashMap<Integer, String>(16);

        Set<Integer> set=new HashSet<Integer>();

        set.add(1);
        set.add(1);
        System.out.println(set.size());


    }
}
