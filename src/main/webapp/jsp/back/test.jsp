<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'test.jsp' starting page</title>
    
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
			$("#tree").tree({
				url:"lib/getTree",
				checkbox:true,
				dnd:true
			});
			
			$("#cbt").combotree({
				url:"lib/getTree"
			});
			
			
			$("#tb1").datagrid({
				url:"roles/queryAll",
				columns:[[
				  {field:'rid',title:'编号',width:40},  
				  {field:'rname',title:'角色名',width:60},
				  {field:'upuname',title:'修改人',width:100},
				  {field:'uid',title:'修改人编号',width:100,hidden:true},
				  {field:'uptime',title:'时间',width:100},
				  {field:'lids',title:'权限id',width:100,hidden:true},
				]],
				idField:'rid',
				fitColumns:true,
				striped:true,
				singleSelect:true,// 只能选中一行
				toolbar: [{
					text:"添加",
					iconCls: 'icon-edit',
					handler: function(){
					}
				}],
				onDblClickRow:function(index,row){
					
					$.messager.prompt('提示信息', '请输入数量：', function(r){
						if (r){
							row.nums = r;
							$("#tb2").datagrid('appendRow',row);
						}
					});
				}
			});
			
			
			$("#tb2").datagrid({
				columns:[[
				  {field:'rid',title:'编号',width:40},  
				  {field:'rname',title:'角色名',width:60},
				  {field:'upuname',title:'修改人',width:100},
				  {field:'uid',title:'修改人编号',width:100,hidden:true},
				  {field:'uptime',title:'时间',width:100},
				  {field:'lids',title:'权限id',width:100,hidden:true},
				  {field:'nums',title:'数量',width:100}
				]],
				idField:'rid',
				fitColumns:true,
				striped:true,
				singleSelect:true,
				onDblClickRow:function(index,row){
					$.messager.confirm('提示信息', '确定删除?', function(r){
						if (r){
							$("#tb2").datagrid('deleteRow',index);
						}
					});
				}
			});
		});
		
	</script>
  </head>
  
  <body>
    <ul id="tree"></ul>
    ------------------------------------<br/>
    <input id="cbt"/>
    ------------------------------------<br/>
    <h3>时间</h3>
    <form>
    	<input id="date" class="easyui-datebox"/><br/>
    </form>
    <h3>进货单添加</h3>
    <div class="easyui-layout" style="width:100%;height:300px">
    	<div data-options="region:'west'" style="width:50%;height:300px">
    		<table id="tb1" style="width:100%;height:100%"></table>
    	</div>
    	<div data-options="region:'east'" style="width:50%;height:300px">
    		<table id="tb2" style="width:100%;height:100%"></table>
    	</div>
    </div>
    
  </body>
</html>
