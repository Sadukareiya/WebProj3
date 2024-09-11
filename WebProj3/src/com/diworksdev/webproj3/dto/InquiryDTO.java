package com.diworksdev.webproj3.dto;

public class InquiryDTO {
    // 名前を格納するためのフィールド
    private String name;

    // お問い合わせの種類を格納するためのフィールド
    private String qtype;

    // お問い合わせ内容を格納するためのフィールド
    private String body;

    // 名前を取得するためのゲッター
    public String getName() {
        return name;
    }

    // 名前を設定するためのセッター
    public void setName(String name) {
        this.name = name;
    }

    // お問い合わせの種類を取得するためのゲッター
    public String getQtype() {
        return qtype;
    }

    // お問い合わせの種類を設定するためのセッター
    public void setQtype(String qtype) {
        this.qtype = qtype;
    }

    // お問い合わせ内容を取得するためのゲッター
    public String getBody() {
        return body;
    }

    // お問い合わせ内容を設定するためのセッター
    public void setBody(String body) {
        this.body = body;
    }
}
