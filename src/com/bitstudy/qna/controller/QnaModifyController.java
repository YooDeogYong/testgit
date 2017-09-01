package com.bitstudy.qna.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bitstudy.qna.dao.QnaDAO;
import com.bitstudy.qna.domain.Qna;

@WebServlet("/com/bitstudy/qna/controller/qnamodifycontroller")
public class QnaModifyController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		Qna mod = new Qna();
		mod.setTitle(request.getParameter("title"));
		mod.setContent(request.getParameter("content"));
		mod.setNo(Integer.parseInt(request.getParameter("no")));
		mod.setGroupNo(Integer.parseInt(request.getParameter("groupNo")));
		//1이면 질문 2면은 답변
		QnaDAO dao = new QnaDAO();
		
		dao.update(mod);
		
	}
}