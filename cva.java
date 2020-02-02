import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.*;
public class cva{

    public static void main(String[] args) 
    {
      FastReader sc=new FastReader();
      int n=sc.nextInt();
      int m=sc.nextInt();
      int k=sc.nextInt();
      int c[][]=new int[n+1][m+1];
      int ax[]=new int[k];
      int ay[]=new int[k];
      for(int i=0;i<k;i++)
      {
          int x=sc.nextInt();
          int y=sc.nextInt();
          c[x][y]=1;
          ax[i]=x;
          ay[i]=y;
      }
      int d=sc.nextInt();
      int max=0;
      int maxx=-1,maxy=-1;
      for(int y=1;y<=m;y++)
      {
          for(int x=1;x<=n;x++)
          {
              if(c[x][y]!=1)
              {
                  int s=0;
                  for(int i=0;i<k;i++)
                  {
                      if((Math.abs(ax[i]-x)+Math.abs(ay[i]-y))<=d)
                      {
                          s++;
                      }
                  }
                  if(s>max)
                  {
                      max=s;
                      maxx=x;
                      maxy=y;
                  }
              }
          }
      }
      
      k++;
          System.out.println(maxx+" "+maxy+" "+max);
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