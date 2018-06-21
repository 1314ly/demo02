<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'personal.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
	
	<script type="text/javascript">
		$(function(){
			$("#submits,#repwd,#cancle").hide();
			
			
			$("#edit").click(function(){
				$("#submits,#repwd,#cancle").show();
				$("#edit").hide();
			});
			
			$("#cancle").click(function(){
				$("#submits,#repwd,#cancle").hide();
				$("#edit").show();
				// 重新加载
				$.post("users/getLogUsers",function(data){
					$("#fm").form('load',data);
				});
			});
			
		});
	
	</script>
  </head>
  
  <body>
    <form id="fm" action="">
    	<table>
    		<tr>
    			<td>用户编号：</td>
    			<td>
    				<input class="easyui-textbox" value="${logUser.uid }" name="uid"/>
    			</td>
    		</tr>
    		<tr>
    			<td>用户名：</td>
    			<td>
    				<input class="easyui-textbox" value="${logUser.uname }" name="uname"/>
    			</td>
    		</tr>
    		<tr>
    			<td>密码：</td>
    			<td>
    				<input class="easyui-passwordbox" value="${logUser.pwd }" name="pwd"/>
    			</td>
    		</tr>
    		<tr id="repwd">
    			<td>重复密码：</td>
    			<td>
    				<input class="easyui-passwordbox" value="${logUser.pwd }" />
    			</td>
    		</tr>
    		<tr>
    			<td>状态：</td>
    			<td>
    				<input class="easyui-textbox" value="${logUser.status }" name="status"/>
    			</td>
    		</tr>
    		<tr>
    			<td>修改时间：</td>
    			<td>
    				<input class="easyui-textbox" value="${logUser.uptime }" name="uptime"/>
    			</td>
    		</tr>
			<tr>
				<td>
					<a class="easyui-linkbutton" href="javascript:void(0)" id="edit" data-options="iconCls:'icon-edit'">修改</a>
					<a class="easyui-linkbutton" href="javascript:void(0)" id="submits" data-options="iconCls:'icon-save'">提交</a>
					<a class="easyui-linkbutton" href="javascript:void(0)" id="cancle" data-options="iconCls:'icon-cancel'">取消</a>
				</td>
			</tr>
    	</table>
    
    </form>
  </body>
</html>
