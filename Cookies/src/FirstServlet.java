import java.io.*;  
import javax.servlet.http.*;  
  
  
public class FirstServlet extends HttpServlet {  
  
 	private static final long serialVersionUID = 1L;

public void doPost(HttpServletRequest request, HttpServletResponse response){  
    try{  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
    String n021=request.getParameter("userName");  
    out.print("Welcome " + n053);  
  
    Cookie ck=new Cookie("uname",n053);//creating cookie object  
    response.addCookie(ck);//adding cookie in the response  
  
    //creating submit button  
    out.print("<form action='servlet2'>");  
    out.print("<input type='submit' value='go'>");  
    out.print("</form>");  
          
    out.close();  
  
        }
    catch(Exception e)
    {
    	System.out.println(e);
    }  
  }  
}  