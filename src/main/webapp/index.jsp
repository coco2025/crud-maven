<html>
<body bgcolor="#c5dec9">
<h2 align="center">Trabajando con Maven y JPA</h2>
<form action="ControladorAuto" method="post" style="text-align:center;">
  <ul style="list-style:none;">
    <li>
      <label for="name">Marca:</label>
      <input type="text" id="marca" name="marca" />
    </li><br>
    <li>
      <label for="name">Modelo:</label>
      <input type="text" id="marca" name="modelo" />
    </li><br>
    <li>
      <label for="name">color  :</label>
      <input type="text" id="marca" name="color" />
    </li><br>
    <li>
      <label for="name">Precio:</label>
      <input type="text" id="marca" name="precio" />
    </li><br>
    <li>
      <label for="name">Motor:</label>
      <input type="text" id="marca" name="motor" />
    </li><br>
    <li>
      <input type="submit" id="mail" name="registrar"  value="Registrar Auto"/>
    </li>  
  </ul>
</form>
<%
String mens=(String)request.getAttribute("mensaje");
String m="";
if(mens!=null){
	m=mens;
}
%>
<h1  align="center" style="color:blue;">
<%=m%>
</h1>
</body>
</html>
