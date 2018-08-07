import java.util.*;

/**
 * Created by ALEX on 2018/8/4.
 */
public class MapMain {
    public static void main(String[] args) {
        Random random=new Random();
        List<Integer> arrayList=new ArrayList<Integer>();
        for(int i=0;i<50;i++){
            arrayList.add(random.nextInt(100));
        }
        System.out.println("随机生成小于100的50个数，分别为："+arrayList);
        Map<Integer,ArrayList<Integer>> groupMap=getGroup(arrayList);
        System.out.println("Map中的数据为："+groupMap);
        Map<Integer,ArrayList<Integer>> sortMap=getSort(groupMap);
        System.out.println("排序后的Map为："+sortMap);
    }

    private static Map<Integer,ArrayList<Integer>> getGroup(List<Integer> arrayList){
        Map<Integer,ArrayList<Integer>> groupMap=new LinkedHashMap<Integer, ArrayList<Integer>>();

        for(Integer integer:arrayList){
            int key=integer/10;
            if(groupMap.get(key)==null){
                ArrayList<Integer> keyList=new ArrayList<Integer>();
                keyList.add(integer);
                groupMap.put(key,keyList);
            }else{
                groupMap.get(key).add(integer);
            }
        }
        return groupMap;
    }

    private static Map<Integer,ArrayList<Integer>> getSort(Map<Integer,ArrayList<Integer>> groupMap){
        Map<Integer,ArrayList<Integer>> sortMap=new TreeMap<Integer, ArrayList<Integer>>();
        sortMap.putAll(groupMap);
        return sortMap;
    }
}
