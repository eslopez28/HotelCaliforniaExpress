<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Reserva</title>
        <style type="text/css">
            <!--
            body {
                font: 100%/1.4 Verdana, Arial, Helvetica, sans-serif;
                background-color: #42413C;
                margin: 0;
                padding: 0;
                color: #000;
            }

            ul, ol, dl { 
                padding: 0;
                margin: 0;
            }
            h1, h2, h3, h4, h5, h6, p {
                margin-top: 0;	 
                padding-right: 40px;
                padding-left: 15px; 
            }
            a img { 
                border: none;
            }

            a:link {
                color: #42413C;
                text-decoration: underline; 
            }
            a:visited {
                color: #6E6C64;
                text-decoration: underline;
            }
            a:hover, a:active, a:focus {
                text-decoration: none;
            }

            .container {
                width: auto;
                background-color: #FFF;
                overflow: hidden;
                height: auto;
                margin-top: 0;
                margin-right: auto;
                margin-bottom: 0;
                margin-left: auto;
            }

            .sidebar1 {
                float: left;
                width: 180px;
                background-color: #EADCAE;
                padding-bottom: 10px;
                height: 100%;
                margin-top: 81px;
                margin-right: 0px;
                margin-bottom: 0px;
                margin-left: 0px;
            }
            .content {
                width: 740px;
                float: left;
                padding-top: 10px;
                padding-right: 0;
                padding-bottom: 10px;
                padding-left: 0;
            }
            .Titulo {
                height: auto;
                width: 100%;
            }

            .content ul, .content ol { 
                padding: 0 15px 15px 40px;
            }

            ul.nav {
                list-style: none;
                border-top: 1px solid #666;
                margin-bottom: 15px;
            }
            ul.nav li {
                border-bottom: 1px solid #666; 
            }
            ul.nav a, ul.nav a:visited {
                padding: 5px 5px 5px 15px;
                display: block;
                width: 160px;  
                text-decoration: none;
                background-color: #C6D580;
            }
            ul.nav a:hover, ul.nav a:active, ul.nav a:focus {
                background-color: #ADB96E;
                color: #FFF;
            }

            .fltrt {
                float: right;
                margin-left: 8px;
            }
            .fltlft { 
                float: left;
                margin-right: 8px;
            }
            .clearfloat { 
                clear:both;
                height:0;
                font-size: 1px;
                line-height: 0px;
            }
            .content pre .boton {
                margin: 1px;
                padding: 1px;
                height: auto;
                width: auto;
            }
            .content pre .texto1 {
                height: auto;
                width: auto;
                margin: 5px;
                padding: 5px;
            }
            -->
        </style>
        <style>
            input{
                width:30px;
                font:normal 11px/11px verdana;
            }
            input.texto{
                border:solid 1px silver;
                text-align:center;
            }
        </style>
        <script>
            maximo = new Array();
            maximo["hora"] = 23;
            maximo["minutos"] = 55;
            function cambiar(hom, a) {
                h = document.forms[0][hom]
                h1 = parseInt(h.value);
                if (a < 0) {
                    h2 = ((h1 + a) < 0) ? maximo[hom] : (h1 + a);
                }
                else {
                    h2 = ((h1 + a) > maximo[hom]) ? 0 : (h1 + a);
                }
                h2 = (h2 < 10) ? "0" + h2 : h2;
                h.value = h2;
            }
        </script>
        <style>
            input{
                width: auto;
                font: normal 11px/11px verdana;
            }
            input.texto{
                border:solid 1px silver;
                text-align:center;
            }
            input.texto1 {	border:solid 1px silver;
                           text-align:center;
            }
            input.texto1 {	border:solid 1px silver;
                           text-align:center;
            }
        </style>
    </head>
    <form action="ReservaClientes" method="post">
    <body>
        <div class="container">
            <div class="sidebar1">
                <ul class="nav">
                    <li><a href="#">Herramientas</a></li>
                    <li><a href="#">Usuario</a></li>
                    <li><a href="#">Hoteles &gt; </a></li>
                    <li><a href="#">Clientes &gt;</a></li>
                    <li><a href="#">Reservas &gt;</a></li>
                    <li><a href="#">Habitaciones&gt;</a></li>
                    <li><a href="#">Promociones &gt;</a></li>
                    <li><a href="#">Administracion &gt;</a></li>
                    <li><a href="#">Salir</a></li>
                </ul>
            </div>
            <div class="content">
                <div class="Titulo">
                    <h1>Agregar Reserva</h1>
                </div>
                <p>&nbsp;</p>
                <pre>		Tipo de Habitacion							 <label for="nombre"> Nombre:</label>
                                                      <label for="nombre"></label><label for="nombre"></label><input name="nombre" type="text" id="nombre" size="25" maxlength="50" />
           <select name="selCombo" size=1>         <option value="1">Habitacion 1</option>         <option value="2">Habitacino 2</option>         <option value="3">Habitacion 3</option>         <option value="4">Habitacion 4</option>       </select>     							
    												  Identificacion:
                </pre>
                <pre>		Personas									  <input name="id" type="text" id="id" size="25" maxlength="50" />
                </pre>
                <pre>___________________________                           Nacionalidad:</pre>
                <pre>		 	Adultos:   <select name="adultoscant" size=1><option value="1">1</option><option value="2">2</option><option value="3" selected="selected">3</option></select>                         <input name="nacionalidad" type="text" id="nacionalidad" size="25" maxlength="50" />
    
         Niños:        <select name="niñoscant"  size=1"><option value="0">0</option></select>                         Correo:</pre>
                <pre>___________________________                           <input name="correo" type="text" id="correo" size="25" maxlength="50" />
                </pre>
                <pre>		Hora de llegada:
           <input type="button" value="^" class="boton" onclick="cambiar('hora', 1)" /><input type="button" value="^" class="boton" onclick="cambiar('minutos', 5)" />	
           <input type="texto" size="2" readonly="readonly" class="texto1" name="hora" value="00" /><input value="00" class="texto1" type="texto" size="2" readonly="readonly" name="minutos" /><select name="selampppm" size="1">
        <option value="am">am</option>
        <option value="pm">pm</option>
      </select>    						<input type="submit" name="aÃ±adir" id="aÃ±adir" value="AÃ±adir Reserva" />  <input type="reset" value="Cancelar" />
           <input type="button" value="v" class="boton" onclick="cambiar('hora', -1)" /><input type="button" value="v" class="boton" onclick="cambiar('minutos', -5)" />   
                </pre>
                <pre>
			<script>
                        maximo = new Array();
                        maximo["hora"] = 23;
                        maximo["minutos"] = 55;
                        function cambiar(esto, a) {
                            h = document.forms[0][esto]
                            h1 = parseInt(h.value);
                            if (a < 0) {
                                h2 = ((h1 + a) < 0) ? maximo[esto] : (h1 + a);
                            }
                            else {
                                h2 = ((h1 + a) > maximo[esto]) ? 0 : (h1 + a);
                            }
                            h2 = (h2 < 10) ? "0" + h2 : h2;
                            h.value = h2;
                        }
</script>  
                </pre>
            </div>
        </div>
    </body>
    </form>>
</html>
