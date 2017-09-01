package com.bitstudy.qna.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bitstudy.qna.dao.QnaDAO;
import com.bitstudy.qna.domain.Qna;

@WebServlet("/com/bitstudy/qna/controller/qnasavecontroller")
public class QnaSaveController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		Qna qna = new Qna();
		qna.setNo(Integer.parseInt(request.getParameter("no")));
		qna.setGroupNo(Integer.parseInt(request.getParameter("groupNo")));
		qna.setName(request.getParameter("name"));
		qna.setTitle(request.getParameter("title"));
		qna.setContent(request.getParameter("content"));
		// 1이면 질문 2면은 답변
		QnaDAO dao = new QnaDAO();
		if (qna.getGroupNo() == 1) {
			 dao.insertQ(qna);
		}else {
			
			dao.insertA(qna);
		}
		
		
	}
}
