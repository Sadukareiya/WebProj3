package com.diworksdev.webproj3.action;
//package文:このクラスが属するパッケージを指定してます

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction extends ActionSupport {
	//WelcomeActionクラス: ActionSupportクラスを継承したアクションクラス

    @Override
    public String execute() {
        return SUCCESS;
        //executeメソッド: このメソッドはアクションが実行された際に呼び出され、SUCCESSを返します
        //Struts 2 の設定ファイル（struts.xml）で定義された遷移先ページが決まります
    }
}