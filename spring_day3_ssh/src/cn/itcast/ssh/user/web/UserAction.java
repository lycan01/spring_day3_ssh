package cn.itcast.ssh.user.web;

import cn.itcast.ssh.user.vo.UserModel;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	public UserModel um;
	public String execute(){
		System.out.println(um.getUserName()+","+um.getAge());
		return "ok";
		
	}
	public UserModel getUm() {
		return um;
	}
	public void setUm(UserModel um) {
		this.um = um;
	}
	
}
