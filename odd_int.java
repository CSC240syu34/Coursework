//ODD_INT Codewars
//NAME  :   Stephen Yu 
//EMAIL :   syu34@stu.parkland.edu
//Class :   CSC 240


import java.util.HashMap;

public class FindOdd {
    public static int findIt(int[] a) {
        //map for # of occurences
        HashMap<Integer,Integer> hMap = new HashMap<>();
        for(Integer curr : a){
          if(hMap.containsKey(curr)){
            hMap.put(curr,hMap.get(curr) + 1);
          }else{
            hMap.put(curr,1);
          }
        }
        //loop through map and check for a negative value
        for(var pair: hMap.entrySet()){
          if(pair.getValue() % 2 != 0){
            return pair.getKey();
          }
        }
        //should never reach here b/c of problem statement
        return 0;
    }
}