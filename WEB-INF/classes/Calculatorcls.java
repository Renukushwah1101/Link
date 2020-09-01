import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class Calculatorcls extends HttpServlet
{
   protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException 
{

     res.setContentType("text/html");

PrintWriter pw=res.getWriter();

 

String obj=req.getParameter("s1");

if(obj.equalsIgnoreCase("add"))
{

int n1=Integer.parseInt(req.getParameter("t1"));
int n2=Integer.parseInt(req.getParameter("t2"));

    int result=n1+n2;
	pw.println("<center><h1>add is :" + result);
}

else if(obj.equalsIgnoreCase("sub"))
{

int n1=Integer.parseInt(req.getParameter("t1"));
int n2=Integer.parseInt(req.getParameter("t2"));

    int result=n1-n2;
pw.println("<center><h1>subtract is :" + result);
}
else if(obj.equalsIgnoreCase("mul"))
{

int n1=Integer.parseInt(req.getParameter("t1"));
int n2=Integer.parseInt(req.getParameter("t2"));

   int result=n1*n2;
pw.println("<center><h1>mul is :" + result);
}
else if(obj.equalsIgnoreCase("link1"))
{
 String msg=new java.util.Date().toString();  
  pw.println("<center><h1>Date is " + msg);
}
else
   {
       java.util.Calendar cl=java.util.Calendar.getInstance();
         int h=cl.get(java.util.Calendar.HOUR_OF_DAY);
      if(h<12)
	   {
       String  msg="Good MOrning";
	   pw.println("<center><h1> " + msg);
	   }
       else if(h<16)
	   {
	   String msg="Good Afternoon";
	    pw.println("<center><h1> " + msg);
	   }
      else if(h<20)
         { 
        String msg="Good Evening";
    pw.println("<center><h1> " + msg);
		}
   else
    {
       String msg="Good Night ";
        pw.println("<center><h1> " + msg);
     }

}
}

public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException 
{
         doPost(req,res);
}
}