<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=uft-8">
<title>Insert title here</title>
   
	<!-- fileUpload -->
	<script src="res/js/jquery-1.7.2.min.js"  type="text/javascript"></script>
	<script src="res/js/ajaxfileupload.js" type="text/javascript"></script>
	
	<!-- bootstrap -->
	<link rel="stylesheet" href="res/css/bootstrap.min.css">
	<link rel="stylesheet" href="res/css/bootstrap-theme.min.css">
	<script src="res/js/bootstrap.min.js"></script>
	
	  <script type="text/javascript">
	  
        $(function () {
            $("#upload").click(function () {
                ajaxFileUpload();
            })
        })
         function ajaxFileUpload()
    {
        $.ajaxFileUpload({
                url:'upload.shtml',//用于文件上传的服务器端请求地址
                secureuri:false ,//一般设置为false
                fileElementId:'file1',//文件上传控件的id属性  <input type="file" id="upload" name="upload" />
                dataType: 'text',//返回值类型 一般设置为json
                success: function (data, status)  //服务器成功响应处理函数
                {
                	alert("上传成功");
                	var str=eval('('+data+')');
                },
                error: function (data, status, e)//服务器响应失败处理函数
                {
                    alert("上传文件格式有误");
                }
            });
        return false;
    }
    </script>
</head>
<body>
	<div class="container">
	<h3 align="center">商品信息添加</h3>
	<form class="form-horizontal">
	  <div class="form-group">
	  	<table class="table table-bordered">
			<tr>
			<td><label  class="col-sm-12 control-label">商品名称</label></td>
			<td> <div class="col-sm-12"><input type="text" class="form-control" name="name"></div></td>
			<td><label  class="col-sm-12 control-label">商品价格</label></td>
			<td> <div class="col-sm-12"><input type="text" class="form-control" name="name"></div></td>
			</tr>	  	
		</table>
	    </div>
	  <div class="form-group">
    	<label for="exampleInputFile">上传图片</label>
    	<input type="file" id="exampleInputFile">
    	<p class="help-block">图片格式后缀为jpg</p>
 	 </div>
	</form>
	   <p><input type="file" id="file1" name="file"></p>
	      <input type="button" id="upload" value="upload">
	</div>      
</body>
</html>