import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.*;
public class cvd{

    public static void main(String[] args) 
    {
        Queue LinkedList
      FastReader sc=new FastReader();
      int n=sc.nextInt();
      int a[]=new int[n+1];
      int b[]=new int[n+1];
      StringBuffer buf=new StringBuffer();
      HashSet<Integer> h=new HashSet<>();
      for(int i=1;i<=n;i++)
      {
          a[i]=sc.nextInt();
          h.add(a[i]);
      }
      for(int i=1;i<=n;i++)
      {
          b[i]=sc.nextInt();
          h.add(b[i]);
      }
      int q=sc.nextInt();
      for(int i=0;i<q;i++)
      {
          int l1=sc.nextInt();
          int h1=sc.nextInt();
          int l2=sc.nextInt();
          int h2=sc.nextInt();
          for(int j=l1;j<=h1;j++)
          {
              h.remove(a[j]);
          }
          for(int j=l2;j<=h2;j++)
          {
              h.remove(b[j]);
          }
          buf.append(s.size()+"\n");
          for(int j=l1;j<=h1;j++)
          {
              h.add(a[j]);
          }
          for(int j=l2;j<=h2;j++)
          {
              h.(b[j]);
          }
      }
      System.out.print(buf);
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