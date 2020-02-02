import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'maxEvents' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arrival
     *  2. INTEGER_ARRAY duration
     */
    public static int sl(int i,int t,int n,List<Integer> a,List<Integer> d,int m,HashMap<Integer,ArrayList<Integer>> h,ArrayList<Integer> v)
    {
        if(i>=v.size())
        return m;
        if(t>v.get(i))
        return sl(i+1,t,n,a,d,m,h,v);
        ArrayList<Integer> x=h.get(v.get(i));
        int max=-1;
        for(int j=0;j<x.size();j++)
        {
            max=Math.max(max,sl(i+1,t+x.get(j),n,a,d,m+1,h,v));
        }
        return max;
    }
    public static int maxEvents(List<Integer> a, List<Integer> d) 
    {
    // Write your code here
        //return sl(0,0,arrival.size(),arrival,duration,0);
        HashMap<Integer,ArrayList<Integer>> h=new HashMap<>();
        ArrayList<Integer> v=new ArrayList<>();
        for(int i=0;i<a.size();i++)
        {
            if(h.containsKey(a.get(i)))
            {
                h.get(a.get(i)).add(d.get(i));
            }
            else
            {
                ArrayList<Integer> x=new ArrayList<>();
                v.add(a.get(i));
                x.add(d.get(i));
                h.put(a.get(i),x);
            }
        }
        return sl(0,0,a.size(),a,d,0,h,v);
        // int m=0;
        // int t=0;
        // for(int i=0;i<a.size();i++)
        // {
        //     if(h.containsKey(a.get(i)))
        //     {
        //         if(t<a.get(i))
        //         {
        //             m++;
        //             t=t+h.get(a.get(i));
        //             h.remove(a.get(i));
        //         }
        //     }
        // }
    }

}
public class Solution {