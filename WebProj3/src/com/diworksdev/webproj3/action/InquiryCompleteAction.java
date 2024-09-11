package com.diworksdev.webproj3.action;

import com.diworksdev.webproj3.dao.InquiryCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class InquiryCompleteAction extends ActionSupport {

    // フォームから送信されるデータを格納する変数
    private String name;
    private String qtype;
    private String body;

    // アクションの実行メソッド
    public String execute() {
        String ret = ERROR; // デフォルトの戻り値はエラー
        InquiryCompleteDAO dao = new InquiryCompleteDAO(); // DAOクラスのインスタンスを生成
        int count = dao.insert(name, qtype, body); // データベースにデータを挿入
        if (count > 0) { // 挿入が成功した場合
            ret = SUCCESS; // 成功を示す戻り値に設定
        }
        return ret; // 結果を返す
    }

    // nameのゲッター
    public String getName() {
        return name;
    }

    // nameのセッター
    public void setName(String name) {
        this.name = name;
    }

    // qtypeのゲッター
    public String getQtype() {
        return qtype;
    }

    // qtypeのセッター
    public void setQtype(String qtype) {
        this.qtype = qtype;
    }

    // bodyのゲッター
    public String getBody() {
        return body;
    }

    // bodyのセッター
    public void setBody(String body) {
        this.body = body;
    }
}
