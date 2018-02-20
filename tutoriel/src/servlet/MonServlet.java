package servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class MonServlet
 */
@WebServlet("/MonServlet")
public class MonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		faire(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private void faire(HttpServletRequest request, HttpServletResponse response)
	{
		
		/* a la main moche 
		String nom = request.getParameter("nom");
		System.out.println(nom);
		
		String prenom = request.getParameter("prenom");
		System.out.println(prenom);
		
		String mail = request.getParameter("mail");
		System.out.println(mail);
		
		String login = request.getParameter("login");
		System.out.println(login);
		
		String mdp = request.getParameter("mdp");
		System.out.println(mdp);
		  */
		
		
		
		Enumeration<String> params =request.getParameterNames();
		
		while(params.hasMoreElements())
		{
			String key = params.nextElement();
			System.out.println(key + ": " + request.getParameter(key));
		}
		
		
		
	}

}
