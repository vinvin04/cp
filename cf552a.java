import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.*;
public class cf552a{

    public static void main(String[] args) 
    {
      FastReader sc=new FastReader();
      int x1=sc.nextInt();
      int x2=sc.nextInt();
      int x3=sc.nextInt();
      int x4=sc.nextInt();
      int m=Math.max(x1, Math.max(x2,Math.max(x3,x4 ) ));
      int c=m-x1;
      int a=x2-c;
      int b=x3-c;
          System.out.println(a+" "+b+" "+c);
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