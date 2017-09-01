<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Study</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <Table class="table table-striped table-hover">
        <thead>
        <tr>
            <th>번호</th>
            <th>제목</th>
            <th>작성자</th>
            <th>날짜</th>
            <th>조회수</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <Td>25</Td>
            <td><a href="qnab.html">만두가 그렇게 귀요미 라며 ㅇㅅㅇ?</a></td>
            <Td>만두</Td>
            <td>2017.08.25</td>
            <td>5</td>
        </tr>
        <tr>
            <Td>24</Td>
            <Td>만두가 그렇게 귀요미 라며 ㅇㅅㅇ?</Td>
            <Td>만두</Td>
            <td>2017.08.24</td>
            <td>5</td>
        </tr>
        <tr>
            <Td>23</Td>
            <Td>만두가 그렇게 귀요미 라며 ㅇㅅㅇ?</Td>
            <Td>만두</Td>
            <td>2017.08.23</td>
            <td>5</td>
        </tr>
        <tr>
            <Td>22</Td>
            <Td>만두가 그렇게 귀요미 라며 ㅇㅅㅇ?</Td>
            <Td>만두</Td>
            <td>2017.08.22</td>
            <td>5</td>
        </tr>
        <tr>
            <Td>21</Td>
            <Td>만두가 그렇게 귀요미 라며 ㅇㅅㅇ?</Td>
            <Td>만두</Td>
            <td>2017.08.21</td>
            <td>5</td>
        </tr>
        <tr>
            <Td>20</Td>
            <Td>만두가 그렇게 귀요미 라며 ㅇㅅㅇ?</Td>
            <Td>만두</Td>
            <td>2017.08.20</td>
            <td>5</td>
        </tr>
        <tr>
            <Td>19</Td>
            <Td>만두가 그렇게 귀요미 라며 ㅇㅅㅇ?</Td>
            <Td>만두</Td>
            <td>2017.08.19</td>
            <td>5</td>
        </tr>
        <tr>
            <Td>18</Td>
            <Td>만두가 그렇게 귀요미 라며 ㅇㅅㅇ?</Td>
            <Td>만두</Td>
            <td>2017.08.18</td>
            <td>5</td>
        </tr>
        <tr>
            <Td>17</Td>
            <Td>만두가 그렇게 귀요미 라며 ㅇㅅㅇ?</Td>
            <Td>만두</Td>
            <td>2017.08.17</td>
            <td>5</td>
        </tr>
        <tr>
            <Td>16</Td>
            <Td>만두가 그렇게 귀요미 라며 ㅇㅅㅇ?</Td>
            <Td>만두</Td>
            <td>2017.08.16</td>
            <td>5</td>
        </tr>

        </tbody>
    </Table>
    </hr>
    <!--<button class="btn btn-default pull-right">글쓰기</button>-->
 <%--
 <form name="searchForm" action="qnaList.jsp" onsubmit="return searchCheck();" >
	<p>
		<select name="sType">
			<option value="all" selected="selected">전체검색</option>
			<option value="title" <%if ("title".equals(sType)) out.print("selected=\"selected\""); %>>제목</option>
			<option value="name" <%if ("name".equals(sType)) out.print("selected=\"selected\""); %>>작성자</option>
			<option value="content" <%if ("content".equals(sType)) out.print("selected=\"selected\""); %>>내용</option>
		</select>
		<input type="text" name="searchText" value="<%=searchTextUTF8%>" />
		<input type="submit" value="검색" />
	</p>
	</form>
	 --%> 
	<a href="qnaw.html" class="btn btn-default btn-outline-dark pull-right" role="button"> 글쓰기 </a>
    <div class="text-center">
        <ul class="pagination"> <!--부트스트랩에서 제공하는 페이징 마법사(?)-->
            <li><a href="#">1</a></li>
            <li><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li><a href="#">4</a></li>
            <li><a href="#">5</a></li>
        </ul>
    </div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

</body>
</html>