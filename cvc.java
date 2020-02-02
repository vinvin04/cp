import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.*;
public class cvc{
    public static int c;
    public static void f(String s,int idx,int n,int i)
    {
        if(i==n)
        {
//            if(idx<=s.length())
//            {
//            c++;
//            }
            c++;
            return;
        }
        for(;idx<s.length()-4;idx++)
        {
            if(idx<s.length()-1) 
            {
                if(s.charAt(idx)!='a' && s.charAt(idx)!='e' && s.charAt(idx)!='i' && s.charAt(idx)!='o' && s.charAt(idx)!='u' &&
                    s.charAt(idx+1)!='a' && s.charAt(idx+1)!='e' && s.charAt(idx+1)!='i' && s.charAt(idx+1)!='o' && s.charAt(idx+1)!='u'    )
                {
                    f(s,idx+4,n,i+1);
                }
            }
            else
            {
                if(s.charAt(idx)!='a' && s.charAt(idx)!='e' && s.charAt(idx)!='i' && s.charAt(idx)!='o' && s.charAt(idx)!='u' )
                {
                    f(s,idx+4,n,i+1);
                }
            }
        }
    }
    public static void main(String[] args) 
    {
      FastReader sc=new FastReader();
      int n=sc.nextInt();
      String s=sc.next();
      f(s,3,n,1);
       
          System.out.println(c);
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