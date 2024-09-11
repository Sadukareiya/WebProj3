<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>INDEX</title>
</head>
<body>
    <!-- HelloStrutsAction へのリンク -->
    <s:form action="HelloStrutsAction">
        <s:submit value="HelloStruts"/>
    </s:form>

    <!-- WelcomeAction へのリンク -->
    <s:form action="WelcomeAction">
        <s:submit value="Welcome"/>
    </s:form>

    <!-- InquiryAction へのリンク -->
    <s:form action="InquiryAction">
        <s:submit value="問い合わせ"/>
    </s:form>

    <br>

    <h3>新規ユーザー登録</h3>

    <!-- GET 通信フォーム -->
    GET 通信
    <s:form method="get" action="TestAction">
        <s:textfield name="username"/>
        <s:password name="password"/>
        <s:submit value="送信"/>
    </s:form>

    <!-- POST 通信フォーム -->
    POST 通信
    <s:form method="post" action="TestAction">
        <s:textfield name="username"/>
        <s:password name="password"/>
        <s:submit value="送信"/>
    </s:form>
</body>
</html>
