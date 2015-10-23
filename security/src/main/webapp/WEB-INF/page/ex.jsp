<%@ page contentType="text/html;charset=utf-8"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
 <html xmlns="http://www.w3.org/1999/xhtml">
 <head>
<title>DIV CSS遮罩层</title>
<script language="javascript" type="text/javascript">
function  exceptionHandler(url){
	   var  $show  = $('<div id="show"></div>');
	   var $close = $('<input id="btnclose" type="button" value="Close" onclick="hidediv();"/>');
	   var $span =$('<span></span>');
	      $show.append($span);
	      $show.append($close);
		  $("body").after($show);
	 $.get("exp/service/3",function(data){
		 $span.text(data);
	   })
}

function showdiv() {
	 exceptionHandler("");
	document.getElementById("bg").style.display ="block";
 document.getElementById("show").style.display ="block";
}
 function hidediv() {
 document.getElementById("bg").style.display ='none';
 document.getElementById("show").style.display ='none';
 }
 </script>
 <style type="text/css">
#bg{ display: none; position: absolute; top: 0%; left: 0%; width: 100%; height: 100%; background-color: #747171; z-index:1001; -moz-opacity: 0.7; opacity:.70; filter: alpha(opacity=60);}
 #show{display: none; position: absolute; top: 25%; left: 22%; width: 53%; height: 49%; padding: 8px; border: 8px solid #E8E9F7; background-color: white; z-index:1002; overflow: auto;}
 </style>
 <script  src="js/bootstrap/jquery-1.11.2.js"></script>
 </head>
 <body>
 <input id="btnshow" type="button" value="Show" onclick="showdiv();"/>
 <div id="bg"></div>
 
 </body>
 </html>