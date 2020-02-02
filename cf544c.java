import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.*;
public class cf544c
{
    public static boolean valid(int[] a,int m)
    {
        for(int i=0;i<(a.length-m)+1;i++)
        {
            if((a[i+m-1]-a[i])<=5)
                return true;
        }
        return false;
    }
    public static void main(String[] args) 
    {
      FastReader sc=new FastReader();
      int n=sc.nextInt();
      Integer a[]=new Integer[n];
      for(int i=0;i<n;i++)
      {
          a[i]=sc.nextInt();
      }
      Arrays.sort(a);
      int ans=1;
      int i=0,j=0;
      while(i<n && j<n)
      {
          if(i==j)
              j++;
          else if((a[j]-a[i])<=5)
          {
              ans=Math.max(j-i+1,ans);
              j++;
          }
          else
          {
              i++;
          }
      }
      System.out.println(ans);
    }   
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt()
        {
            return Integer.parseInt(next());
        }
        long nextLong()
        {
            return Long.parseLong(next());
        }
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}