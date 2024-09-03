package com.diworksdev.webproj3.action;

import com.diworksdev.webproj3.dao.HelloStrutsDAO;
import com.diworksdev.webproj3.dto.HelloStrutsDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HelloStrutsAction extends ActionSupport {

    private String result;

    @Override
    public String execute() {
        String ret = ERROR;
        HelloStrutsDAO dao = new HelloStrutsDAO();
        HelloStrutsDTO dto = dao.select();
        System.out.println(dto.getResult());
        result = dto.getResult();

        if ("MySQL と接続できます。".equals(result)) {
            ret = SUCCESS;
        } else {
            ret = ERROR;
        }

        return ret;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
