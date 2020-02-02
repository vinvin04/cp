import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.*;
public class cf605a{

    public static void main(String[] args) 
    {
      FastReader sc=new FastReader();
      int t=sc.nextInt();
      for(int tc=0;tc<t;tc++)
      {
          long a=sc.nextLong();
          long b=sc.nextLong();
          long c=sc.nextLong();
          long[] ar=new long[3];
          ar[0]=a;
          ar[1]=b;
          ar[2]=c;
          Arrays.sort(ar);
          a=ar[0];
          b=ar[1];
          c=ar[2];
          if(a!=b)
          {
              a++;
          }
          else if(b!=c)
          {
              a++;
              b++;
          }
          if(b!=c)
          {
              c--;
          }
          else if(b!=a)
          {
              b--;
              c--;
          }
          long ans=Math.abs(a-b)+Math.abs(b-c)+Math.abs(a-c);
          System.out.println(ans);
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