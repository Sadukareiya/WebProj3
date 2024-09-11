package com.diworksdev.webproj3.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * InquiryAction クラスは、Struts2 アクションを表します。
 */
public class InquiryAction extends ActionSupport {

    /**
     * execute メソッドは、アクションの実行を担当します。
     * このメソッドは、アクションが成功した場合に SUCCESS を返します。
     * @return SUCCESS 結果として成功を返します。
     */
    public String execute() {
        return SUCCESS;
    }
}