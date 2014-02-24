package hello;

import java.util.*;

import javax.servlet.http.HttpServletResponse;

import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.interceptor.ServletResponseAware;

import org.apache.struts2.interceptor.SessionAware;

public class AbstractAction extends ActionSupport implements ServletResponseAware,SessionAware {

	private static final long serialVersionUID = 1L;

	HttpServletResponse response;

	public void setServletResponse(HttpServletResponse response) {
        this.response = response;
    }

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	public Map getSessionMap() {
		return sessionMap;
	}

	public void setSessionMap(Map sessionMap) {
		this.sessionMap = sessionMap;
	}

	private Map sessionMap;

    public void setSession(Map sessionMap) {
        this.sessionMap = sessionMap;
    }


    
    
}
