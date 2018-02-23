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

import beans.InformationBean;


/**
 * Servlet implementation class MonServlet
 */
@WebServlet("/MonServlet3")
public class MonServlet3 extends HttpServlet {
	
	
	
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MonServlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//faire(request, response);
		MisterBean(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	
	private void MisterBean(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Enumeration<String> params =request.getParameterNames();
		HttpSession session = request.getSession();
		InformationBean bean = new InformationBean();
			
		bean.setNom(request.getParameter("nom"));
		bean.setPrenom(request.getParameter("prenom"));
		bean.setMail(request.getParameter("mail"));
		bean.setMdp(request.getParameter("mdp"));
		bean.setLogin(request.getParameter("login"));
					

		session.setAttribute("bean", bean);
		RequestDispatcher rd = request.getRequestDispatcher("/resultatUseban.jsp");
		rd.forward(request, response);
		
	}
	
	private void faire(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{		
		System.out.println("entree faire");
		//Enumeration<String> params =request.getParameterNames();
		
		//nouvelle session
		HttpSession session = request.getSession(); //cree session
		InformationBean bean = new InformationBean();
		
		
		/*
		while(params.hasMoreElements())
		{
			String key = params.nextElement();
			System.out.println(key + ": " + request.getParameter(key));
			
			
			if (key == "nom")
			{
				b.setNom(key);
			}
			
					
		}
		*/
		
		bean.setNom("Mojo");
		
		System.out.println(bean.getNom());
		session.setAttribute("bean", bean);
		RequestDispatcher rd = request.getRequestDispatcher("/resultatUseban.jsp");
		rd.forward(request, response);
		
	}


}
