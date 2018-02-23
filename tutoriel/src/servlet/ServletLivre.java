package servlet;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bibliotheque.Auteur;
import bibliotheque.Livre;

/**
 * Servlet implementation class ServletLivre
 */
@WebServlet("/ServletLivre")
public class ServletLivre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLivre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		proces(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public void proces(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Auteur a = new Auteur();
		Livre l = new Livre();
		HttpSession s = request.getSession();
		
		a.setMail(request.getParameter("mail"));
		a.setNom(request.getParameter("nom"));
		
		
		l.setAuteur(a);
		l.setRef(request.getParameter("ref"));
		l.setPrix(Double.valueOf(request.getParameter("prix")));
		l.setTitre(request.getParameter("titre"));
		
		s.setAttribute("livre", l);
		RequestDispatcher rd = request.getRequestDispatcher("/biblio.jsp");
		rd.forward(request, response);
		
	}

}
