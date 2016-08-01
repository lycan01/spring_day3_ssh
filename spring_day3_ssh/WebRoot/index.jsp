<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
   
  <body>
    <h1>添加用户</h1>
    <s:form action="userAction" method="post" namespace="/"> 
    	用户名<s:textfield name="um.userName"></s:textfield><br/>
    	年龄<s:textfield name="um.age"></s:textfield><br/>
    	<s:submit type="submit" value="提交"></s:submit>
    </s:form>
    	
  </body>
</html>
