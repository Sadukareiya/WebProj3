<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>WELCOME</title>
</head>
<body>
    <p>名前とパスワードを入力してください。</p>

    <!-- LoginAction へのフォーム -->
    <s:form method="post" action="LoginAction">
        <s:textfield name="username" label="ユーザー名" />
        <s:password name="password" label="パスワード" />
        <s:submit value="送信"/>
    </s:form>
</body>
</html>