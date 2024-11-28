package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Menu3Servlet
 */
@WebServlet("/Menu3Servlet")
public class Menu3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Menu3Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>ユーザ認証</title>");
		out.println("</head>");
		out.println("<body style=\"text-align: center;\">");
		out.println("<h2>ようこそ、" + request.getRemoteUser() + "さん</h2>");
		
		if(request.isUserInRole("teacher")){
			out.println("あなたのロールは、teacherです。");
		}else if(request.isUserInRole("admin")) {
			out.println("あなたのロールは、adminです。");
		}
		
		out.println("<br>");
		out.println("<h2>ここは管理画面(Servlet)です。</h2>");
		out.println("このページは、認証の必要があります。<br><br>");
		out.println("<a href=\"index.html\">トップへ</a>");
		out.println("<br>");
		out.println("<a href=\"logout.jsp\">ログアウト</a>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
