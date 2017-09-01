package com.bitstudy.qna.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.bitstudy.qna.dao.QnaDAO;
import com.bitstudy.qna.domain.Qna;

@WebServlet("/com/bitstudy/qna/controller/qnalistcontroller")
public class QnaListController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Qna qnal = new Qna();
		qnal.setNo(Integer.parseInt(request.getParameter("no")));
		qnal.setReadCount(Integer.parseInt(request.getParameter("readCount")));
		qnal.setTitle(request.getParameter("title"));
		qnal.setTitle(request.getParameter("name"));
		qnal.setTitle(request.getParameter("regDate"));
		
		// dao로 보내야 하는데 ...		
		
	}	

}
