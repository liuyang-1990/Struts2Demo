package com.struts;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		   System.out.println("Ö´ÐÐÁËaction");
		   
		   return SUCCESS;
	}

	 public String add(){
		 return "add";
	 }
	 
	 public String update(){
		 return "update";
	 }
	  
}
