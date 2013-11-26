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
            maximo["horaL"] = 23;
            maximo["minutosL"] = 55;
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
                    <pre>		Tipo de Habitacion             <label for="nombre">Nombre:</label>
                                                            <label for="nombre"></label><label for="nombre"></label><input name="nombre" type="text" id="nombre" size="25" maxlength="50" />
           <select name="selCombo" size=1>         <option value="1">Habitacion 1</option>         <option value="2">Habitacino 2</option>         <option value="3">Habitacion 3</option>         <option value="4">Habitacion 4</option>       </select>     							
    					   Identificacion:
                    </pre>
                    <pre>		Personas				 <input name="id" type="text" id="id" size="25" maxlength="50" />
                    </pre>
                    <pre>___________________________               Nacionalidad:</pre>
                    <pre>		 	Adultos:   <select name="adultoscant" size=1><option value="1">1</option><option value="2">2</option><option value="3" selected="selected">3</option></select>                <input name="nacionalidad" type="text" id="nacionalidad" size="25" maxlength="50" />
    
         Ni&ntilde;os:        <select name="ninnoscant"  size=1" id="ninnoscant"><option value="0">0</option></select>              Correo:</pre>
                    <pre>___________________________                           <input name="correo" type="text" id="correo" size="25" maxlength="50" />
                    </pre>
                    <pre>		Hora de llegada:
           <input type="button" value="^" class="boton" onclick="cambiar('horaL', 1)" /><input type="button" value="^" class="boton" onclick="cambiar('minutosL', 5)" />	
           <input type="texto" size="2" readonly="readonly" class="texto1" name="horaL" value="00" id="horaL" /><input value="00" class="texto1" type="texto" size="2" readonly="readonly" name="minutosL" id="minutosL" /><select name="selampppm" size="1">
        <option value="am">am</option>
        <option value="pm">pm</option>
      </select>
			<input type="button" value="v" class="boton" onclick="cambiar('horaL', -1)" /><input type="button" value="v" class="boton" onclick="cambiar('minutosL', -5)" />   
                    </pre>
                    <pre>
		<script>
                            maximo = new Array();
                            maximo["horaS"] = 23;
                            maximo["minutosS"] = 55;
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
        </script>Hora de Salida:
           <input type="button" value="^" class="boton" onclick="cambiar('horaS', 1)" /><input type="button" value="^" class="boton" onclick="cambiar('minutosS', 5)" />	
           <input type="texto" size="2" readonly="readonly" class="texto1" name="horaS" value="00" id="horaS" /><input value="00" class="texto1" type="texto" size="2" readonly="readonly" name="minutosS" id="minutosS" /><select name="selampppm2" size="1">
        <option value="am">am</option>
        <option value="pm">pm</option>
      </select>    						  
           <input type="button" value="v" class="boton" onclick="cambiar('horaS', -1)" /><input type="button" value="v" class="boton" onclick="cambiar('minutosS', -5)" /> 
                
		<label for="dia">Fecha de Ingreso:</label><select name="dia" id="dia"><option value="1" selected="selected">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option><option value="6">6</option><option value="7">7</option><option value="8">8</option><option value="9">9</option><option value="10">10</option><option value="11">11</option><option value="12">12</option><option value="13">13</option><option value="14">14</option><option value="15">15</option><option value="16">16</option><option value="17">17</option><option value="18">18</option><option value="19">19</option><option value="20">20</option><option value="21">21</option><option value="22">22</option><option value="23">23</option><option value="24">24</option><option value="25">25</option><option value="26">26</option><option value="27">27</option><option value="28">28</option><option value="29">29</option><option value="30">30</option><option value="31">31</option></select>/<select name="mes" id="mes"><option value="Enero" selected="selected">Enero</option><option value="Febrero">Febrero</option><option value="Marzo">Marzo</option><option value="Abril">Abril</option><option value="Mayo">Mayo</option><option value="Junio">Junio</option><option value="Julio">Julio</option><option value="Agosto">Agosto</option><option value="Setiembre">Setiembre</option><option value="Octubre">Octubre</option><option value="Noviembre">Noviembre</option><option value="Diciembre">Diciembre</option></select>/<select name="anno" id="anno"><option value="2013">2013</option><option value="2014">2014</option><option value="2015">2015</option><option value="2016">2016</option><option value="2017">2017</option><option value="2018">2018</option><option value="2019">2019</option><option value="2020">2020</option><option value="2021">2021</option><option value="2022">2022</option><option value="2023">2023</option></select>

		<label for="dia2">Fecha de Salida:</label><select name="dia2" id="dia2"><option value="1" selected="selected">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option><option value="6">6</option><option value="7">7</option><option value="8">8</option><option value="9">9</option><option value="10">10</option><option value="11">11</option><option value="12">12</option><option value="13">13</option><option value="14">14</option><option value="15">15</option><option value="16">16</option><option value="17">17</option><option value="18">18</option><option value="19">19</option><option value="20">20</option><option value="21">21</option><option value="22">22</option><option value="23">23</option><option value="24">24</option><option value="25">25</option><option value="26">26</option><option value="27">27</option><option value="28">28</option><option value="29">29</option><option value="30">30</option><option value="31">31</option></select>/<select name="mes2" id="mes2"><option value="Enero" selected="selected">Enero</option><option value="Febrero">Febrero</option><option value="Marzo">Marzo</option><option value="Abril">Abril</option><option value="Mayo">Mayo</option><option value="Junio">Junio</option><option value="Julio">Julio</option><option value="Agosto">Agosto</option><option value="Setiembre">Setiembre</option><option value="Octubre">Octubre</option><option value="Noviembre">Noviembre</option><option value="Diciembre">Diciembre</option></select>/<select name="anno2" id="anno2"><option value="2013">2013</option><option value="2014">2014</option><option value="2015">2015</option><option value="2016">2016</option><option value="2017">2017</option><option value="2018">2018</option><option value="2019">2019</option><option value="2020">2020</option><option value="2021">2021</option><option value="2022">2022</option><option value="2023">2023</option></select>
                													<input type="submit" name="annadir" id="annadir" value="Añadir Reserva" /> <input type="reset" value="Cancelar" />
                    </pre>
                </div>
            </div>
        </body>
    </form>>
</html>
