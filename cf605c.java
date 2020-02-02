import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.*;
public class cf605c{

    public static void main(String[] args) 
    {
      FastReader sc=new FastReader();
      int t=sc.nextInt();
      for(int tc=0;tc<t;tc++)
      {
          int h=sc.nextInt();
          int m=sc.nextInt();
          
          System.out.println((24-h)*60-m);
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