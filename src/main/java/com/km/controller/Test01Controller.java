package com.km.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test01Controller extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8"); //글자에 대한것
		resp.setContentType("text/html;utf-8"); //브라우저에게 콘텐트 타입 알려줌
		PrintWriter out = resp.getWriter();
		out.print("<html><body>");
		out.print("<h2> 회원 정보 </h2>");
		out.print("회원번호 : " + req.getParameter("code") + "<br>");
		out.print("회원성명 : " + req.getParameter("name") + "<br>");
		out.print("회원전화 : " + req.getParameter("phone") + "<br>");
		out.print("회원주소 : " + req.getParameter("address") + "<br>");
		out.print("가입일자 : " + req.getParameter("joindate") + "<br>");
		out.print("고객등급 : " + req.getParameter("grade") + "<br>");
		out.print("도시코드 : " + req.getParameter("city") + "<br>");
		out.print("<a href='http://localhost:8090/test01.html'>이 전</a>");
		out.print("</body></html>");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doPost(req, resp);
	}
}
