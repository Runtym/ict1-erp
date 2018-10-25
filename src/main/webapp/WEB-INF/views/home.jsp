<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<script>
	var pt = [];
	var t = {id:'a',name:'test',address:'seoul',phone:'111-111-1111'};
	function pushTest(){
		console.time("pushTest")
		for(var i=1;i<=1000;i++){
			pt.push(i);
		}
		console.timeEnd('pushTest');
	}
	var at = [];
	function accessTest(){
		console.time("accessTest")
		for(var i=1;i<=1000;i++){
			at[at.length] = i;
		}
		console.timeEnd('accessTest');
	}
	accessTest(); 
	pushTest(); 
</script>
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
