import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.*;
class cclaf{

    public static void main(String[] args) 
    {
      FastReader sc=new FastReader();
      int t=sc.nextInt();
      for(int tc=0;tc<t;tc++)
      {
          long n=sc.nextLong();
          long np=(long)Math.pow(10, n);
          long a=sc.nextLong();
          System.out.println(2*np+a);
          long b=sc.nextLong();
          System.out.println(np-b);
          long d=sc.nextLong();
          System.out.println(np-d);
          sc.nextLong();
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