package exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TenServlet
 */
@WebServlet("/ten")
public class TenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//브라우저가 응답을 받았을때 어떤 형식의 데이터인지 알아야함
		response.setContentType("text/html;charset=utf-8");
		//내용을 입력해주기 위하여 response의 PrintWriter 객체를 가져옴
		PrintWriter out = response.getWriter();
		out.print("<h1>1-10까지 출력</h1>");
		for(int i=1; i<=10; i++) {
			out.print(i+"<br>");
		}
		//PrintWriter 객체 사용이 종료됬으면 닫아준다.
		out.close();
	}

}
