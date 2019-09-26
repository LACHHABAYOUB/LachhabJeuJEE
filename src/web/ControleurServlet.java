package web;

import java.io.IOException;

import javax.print.attribute.IntegerSyntax;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Jeu;

@WebServlet(name="cs",urlPatterns={"/controleur","*.php"})
public class ControleurServlet extends HttpServlet {
	private Jeu jeue;
	@Override
	public void init() throws ServletException {
		jeue =new Jeu();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setAttribute("mod", new JeuModel());
		request.getRequestDispatcher("VueJeu.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int number =  Integer.parseInt(request.getParameter("secret"));
		JeuModel jeu = new JeuModel();
		jeu.setSecret(number);
		String trouve=jeue.Jouer(number);
		jeu.setTrouve(trouve);
		request.setAttribute("mod", jeu);
		request.getRequestDispatcher("VueJeu.jsp").forward(request, response);
}
}
