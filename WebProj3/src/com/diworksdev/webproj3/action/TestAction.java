package com.diworksdev.webproj3.action;

import com.diworksdev.webproj3.dao.TestDAO;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

    private String username;
    private String password;

    /**
     * ユーザー名とパスワードをデータベースに挿入し、結果に応じて
     * 成功またはエラーのステータスを返します。
     *
     * @return ステータス文字列（SUCCESS または ERROR）
     */
    public String execute() {
        String ret = ERROR;
        TestDAO dao = new TestDAO();
        int count = dao.insert(username, password);
        if (count > 0) {
            ret = SUCCESS;
        }
        return ret;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
