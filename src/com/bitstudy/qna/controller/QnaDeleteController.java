package com.bitstudy.qna.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bitstudy.qna.dao.QnaDAO;
import com.bitstudy.qna.domain.Qna;

@WebServlet("/com/bitstudy/qna/controller/qnadeletecontroller")
public class QnaDeleteController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getMethod().equals("POST")) request.setCharacterEncoding("utf-8");
		
		Qna qna = new Qna();
		
		qna.setNo(Integer.parseInt(request.getParameter("no")));
		qna.setGroupNo(request.getParameter("groupNo"));
		qna.setName(request.getParameter("name"));
		
		QnaDAO dao = new QnaDAO();
		 // 1번이 질문 2번이 답변
		
		dao.delete(qna);
				
	}
}
