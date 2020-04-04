package org.studyeasy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.studyeasy.model.Person;



/**
 * Servlet implementation class Controller
 */
@WebServlet("/")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Person> staff = new ArrayList<>();
		staff.add(new Person("Jul",15));
		staff.add(new Person("Julien",19));
		
		//envoie data à la vue
		request.setAttribute("staff", staff);
		
		//renvoie la vue et redirection avec forward
		request.getRequestDispatcher("view.jsp").forward(request, response);
		
	}

	
}
