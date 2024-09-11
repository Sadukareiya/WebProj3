<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>TEST</title>
</head>
<body>
    <br>
    <!-- ユーザー登録完了メッセージ -->
    <h1>以下の新規ユーザーが登録されました。</h1>

    <!-- 登録されたユーザー名を表示 -->
    <p>ユーザー名: <s:property value="username"/></p>

    <!-- 登録されたパスワードを表示 -->
    <p>パスワード: <s:property value="password"/></p>
</body>
</html>