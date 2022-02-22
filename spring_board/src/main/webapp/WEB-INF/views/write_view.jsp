<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>write_view.jsp</title>
</head>
<body>
	<h1>자유게시판 글쓰기</h1>
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<form action="write">
			<tr>
				<td>이 름</td>
				<td><input type="text" name=bName size="60"></td>
			</tr>
			<tr>
				<td>제 목</td>
				<td><input type="text" name=bTitle size="60"></td>
			</tr>				
			<tr>
				<td align="center" colspan="2">내 용</td>
			</tr>
				<td align="center" colspan="2"><textarea name="bContent" rows="10" cols="60"></textarea></td>
			<tr>			
				<td colspan="2"><a href="list">글 목록 보기</a></td>
			</tr>
			<tr>
				<td align="center" colspan="2"><input type="submit" value="입력"> &nbsp;&nbsp; <input type="reset" value="취소"></td>
			</tr>			
		</form>	
	</table>	
</body>
</html>