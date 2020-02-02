import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.*;
public class cf611b{

    public static void main(String[] args) 
    {
      FastReader sc=new FastReader();
      int t=sc.nextInt();
      for(int tc=0;tc<t;tc++)
      {
          int n=sc.nextInt();
          int k=sc.nextInt();
          int e=n/k;
          int r=n-(e*k);
          int f=k/2;
          if(r>f)
              System.out.println(n-(r-f));
          else
              System.out.println(n);
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