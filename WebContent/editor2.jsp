<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Study</title>
  <link href="http://netdna.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.css" rel="stylesheet">
  <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.js"></script> 
  <script src="http://netdna.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.js"></script> 
  <link href="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.7/summernote.css" rel="stylesheet">
  <script src="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.7/summernote.js"></script>
</head>
<body>
<button id="edit" class="btn btn-primary" onclick="edit()" type="button">Edit 1</button>
<button id="save" class="btn btn-primary" onclick="save()" type="button">Save 2</button>
<div class="click2edit">click2edit</div>

<script type="text/javascript">
var edit = function() {
	  $('.click2edit').summernote({focus: true});
	};

	var save = function() {
	  var markup = $('.click2edit').summernote('code');
	  $('.click2edit').summernote('destroy');
	};
</script>
<form action="main.jsp">
<div class="container">
<input class="form-control" id="title" type="text" placeholder="제목을 입력하세요"><br>
  <input type="hidden" name="groupNo" value="1">
  <input type="hidden" name="name" value="dragon">
  <div id="content" name="content"><p>내용을 입력하세요</p></div>
  <script>
    $(document).ready(function() {
        $('#content').summernote({
        		  
        height: 500,                 
		  minHeight: 100,             
		  maxHeight: 700,             
		  focus: true 		
        }
         );
    });
  </script>

  <a href="home.html" class="btn btn-default btn-outline-dark pull-right" role="button"> 취소 </a>
                        <button type="submit" class="btn btn-default pull-right">작성</button>

   </div>
    </form>
    
    
</body>
</html>