package servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class MonServlet
 */
@WebServlet("/MonServlet")
public class MonServletV1Sansbean extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MonServletV1Sansbean() {
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
	
	private void faire(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
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
		
		//nouvelle session
		HttpSession session = request.getSession();
		
		while(params.hasMoreElements())
		{
			String key = params.nextElement();
			System.out.println(key + ": " + request.getParameter(key));
			//stockage dans les attributs de la session
			session.setAttribute(key, request.getParameter(key));
		}

		RequestDispatcher rd = request.getRequestDispatcher("/resultat.jsp");
		rd.forward(request, response);
		
	}
	
	
	
	public void redirection(String url, HttpServletResponse response) throws IOException
	{
		response.sendRedirect(url);
	}

}
