import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.*;
public class template{

    public static void main(String[] args) 
    {
      FastReader sc=new FastReader();
      int t=sc.nextInt();
      for(int tc=0;tc<t;tc++)
      {
          int n=sc.nextInt();
          int r=sc.nextInt();
          int sum=0;
          TreeSet<Integer> s=new TreeSet<>();
          for(int i=0;i<n;i++)
          {
              s.add(sc.nextInt());
          }
          int c=0;
          while(!s.isEmpty())
          {
              int e=s.last();
              if(e-sum<=0)
              {
                  s.remove(e);
              }
              else
              {
                  c++;
                  sum+=r;
                  s.pollLast();
              }
          }
          System.out.println(c);
      }
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