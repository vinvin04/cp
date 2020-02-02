import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.*;
public class cf605b{

    public static void main(String[] args) 
    {
      FastReader sc=new FastReader();
      StringBuffer b=new StringBuffer();
      int t=sc.nextInt();
      for(int tc=0;tc<t;tc++)
      {
          String s=sc.next();
          int u=0,r=0,l=0,d=0;
          for(int i=0;i<s.length();i++)
          {
              if(s.charAt(i)=='U')
              {
                  u++;
              }
              else if(s.charAt(i)=='D')
              {
                  d++;
              }
              else if(s.charAt(i)=='R')
              {
                  r++;
              }
              else if(s.charAt(i)=='L')
              {
                  l++;
              }
          }
          int lr=Math.min(l,r);
          int ud=Math.min(u,d);
          if(lr>0 && ud>0)
          {
            b.append(2*lr+2*ud+"\n");
            for(int i=0;i<lr;i++)
            {
                b.append('L');
            }
            for(int i=0;i<ud;i++)
            {
                b.append('D');
            }
            for(int i=0;i<lr;i++)
            {
                b.append('R');
            }
            for(int i=0;i<ud;i++)
            {
                b.append('U');
            }
            b.append("\n");
          }
          else 
          {
              if(lr==0 && ud>0)
              {
                  b.append(2+"\n"+"UD"+"\n");
              }
              else if(ud==0 && lr>0)
              {
                  b.append(2+"\n"+"LR"+"\n");
              }
              else
              {
                  b.append(0+"\n");
              }
          }
      }
      System.out.print(b);
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