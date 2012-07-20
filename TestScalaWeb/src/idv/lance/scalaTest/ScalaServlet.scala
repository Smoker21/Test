package idv.lance.scalaTest
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet

@WebServlet(name = "scala", urlPatterns = Array("/myScalaServlet"))
class ScalaServlet extends HttpServlet {
  override def doGet(request: HttpServletRequest, response: HttpServletResponse) {
    val content: String = "<html><body><h1>Hello</h1></body></html>";
    response.getWriter().println(content);
  }

  override def doPost(request: HttpServletRequest, response: HttpServletResponse) {
	  this.doGet(request,response);
  }
}