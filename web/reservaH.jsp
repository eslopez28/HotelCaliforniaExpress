<<<<<<< HEAD

=======
>>>>>>> origin/Andrea
<%@page import="clases.Reserva"%>
<%@page import="clases.Cliente"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Untitled Document</title>
        <style type="text/css">
            <!--
            body {
                font: 100%/1.4 Verdana, Arial, Helvetica, sans-serif;
                background-color: #42413C;
                margin: 0;
                padding: 0;
                color: #000;
            }

            /* ~~ Element/tag selectors ~~ */
            ul, ol, dl { /* Due to variations between browsers, it's best practices to zero padding and margin on lists. For consistency, you can either specify the amounts you want here, or on the list items (LI, DT, DD) they contain. Remember that what you do here will cascade to the .nav list unless you write a more specific selector. */
                padding: 0;
                margin: 0;
            }
            h1, h2, h3, h4, h5, h6, p {
                margin-top: 0;	 /* removing the top margin gets around an issue where margins can escape from their containing div. The remaining bottom margin will hold it away from any elements that follow. */
                padding-right: 15px;
                padding-left: 15px; /* adding the padding to the sides of the elements within the divs, instead of the divs themselves, gets rid of any box model math. A nested div with side padding can also be used as an alternate method. */
            }
            a img { /* this selector removes the default blue border displayed in some browsers around an image when it is surrounded by a link */
                border: none;
            }

            /* ~~ Styling for your site's links must remain in this order - including the group of selectors that create the hover effect. ~~ */
            a:link {
                color: #42413C;
                text-decoration: underline; /* unless you style your links to look extremely unique, it's best to provide underlines for quick visual identification */
            }
            a:visited {
                color: #6E6C64;
                text-decoration: underline;
            }
            a:hover, a:active, a:focus { /* this group of selectors will give a keyboard navigator the same hover experience as the person using a mouse. */
                text-decoration: none;
            }

            /* ~~ this fixed width container surrounds all other divs ~~ */
            .container {
                width: auto;
                background-color: #FFF; /* the auto value on the sides, coupled with the width, centers the layout */
                overflow: hidden; /* this declaration makes the .container understand where the floated columns within ends and contain them */
                height: auto;
                margin-top: 0;
                margin-right: auto;
                margin-bottom: 0;
                margin-left: auto;
            }

            /* ~~ These are the columns for the layout. ~~ 
            
            1) Padding is only placed on the top and/or bottom of the divs. The elements within these divs have padding on their sides. This saves you from any "box model math". Keep in mind, if you add any side padding or border to the div itself, it will be added to the width you define to create the *total* width. You may also choose to remove the padding on the element in the div and place a second div within it with no width and the padding necessary for your design.
            
            2) No margin has been given to the columns since they are all floated. If you must add margin, avoid placing it on the side you're floating toward (for example: a right margin on a div set to float right). Many times, padding can be used instead. For divs where this rule must be broken, you should add a "display:inline" declaration to the div's rule to tame a bug where some versions of Internet Explorer double the margin.
            
            3) Since classes can be used multiple times in a document (and an element can also have multiple classes applied), the columns have been assigned class names instead of IDs. For example, two sidebar divs could be stacked if necessary. These can very easily be changed to IDs if that's your preference, as long as you'll only be using them once per document.
            
            4) If you prefer your nav on the right instead of the left, simply float these columns the opposite direction (all right instead of all left) and they'll render in reverse order. There's no need to move the divs around in the HTML source.
            
            */
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
                width: 800px;
                float: left;
                padding-top: 10px;
                padding-right: 0;
                padding-bottom: 10px;
                padding-left: 0;
                font-size: 100%;
            }
            .Titulo {
                height: auto;
                width: 100%;
            }

            /* ~~ This grouped selector gives the lists in the .content area space ~~ */
            .content ul, .content ol { 
                padding: 0 15px 15px 40px; /* this padding mirrors the right padding in the headings and paragraph rule above. Padding was placed on the bottom for space between other elements on the lists and on the left to create the indention. These may be adjusted as you wish. */
            }

            /* ~~ The navigation list styles (can be removed if you choose to use a premade flyout menu like Spry) ~~ */
            ul.nav {
                list-style: none; /* this removes the list marker */
                border-top: 1px solid #666; /* this creates the top border for the links - all others are placed using a bottom border on the LI */
                margin-bottom: 15px;
            }
            ul.nav li {
                border-bottom: 1px solid #666; /* this creates the button separation */
            }
            ul.nav a, ul.nav a:visited { /* grouping these selectors makes sure that your links retain their button look even after being visited */
                padding: 5px 5px 5px 15px;
                display: block; /* this gives the link block properties causing it to fill the whole LI containing it. This causes the entire area to react to a mouse click. */
                width: 160px;  /*this width makes the entire button clickable for IE6. If you don't need to support IE6, it can be removed. Calculate the proper width by subtracting the padding on this link from the width of your sidebar container. */
                text-decoration: none;
                background-color: #C6D580;
            }
            ul.nav a:hover, ul.nav a:active, ul.nav a:focus { /* this changes the background and text color for both mouse and keyboard navigators */
                background-color: #ADB96E;
                color: #FFF;
            }

            /* ~~ miscellaneous float/clear classes ~~ */
            .fltrt {  /* this class can be used to float an element right in your page. The floated element must precede the element it should be next to on the page. */
                float: right;
                margin-left: 8px;
            }
            .fltlft { /* this class can be used to float an element left in your page. The floated element must precede the element it should be next to on the page. */
                float: left;
                margin-right: 8px;
            }
            .clearfloat { /* this class can be placed on a <br /> or empty div as the final element following the last floated div (within the #container) if the overflow:hidden on the .container is removed */
                clear:both;
                height:0;
                font-size: 1px;
                line-height: 0px;
            }
            -->
        </style></head>
        <% Cliente c = (Cliente) session.getAttribute("cliente");
            Reserva r = (Reserva) session.getAttribute("reserva");%>
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

                <!-- end .sidebar1 --></div>
            <div class="content">
                <div class="Titulo">
                    <h1>Reservas de Hotel 1</h1>
                    <p>__________________________________________________________</p>
                </div>
                <pre style="font-family: Gotham, 'Helvetica Neue', Helvetica, Arial, sans-serif; font-size: 200%;">                                   10 Febrero</pre>
                <table width="480" border="1">
                    <tr>
                        <td width="122">Nombre</td>
                        <td width="200">Nacionalidad</td>
                        <td width="215">Hora de llegada</td>
                    </tr>
                    <tr>
                        <td><%= c.getNombre()%></td>
                        <td><%= c.getPais()%></td>
                        <td><%= r.getFechaLlegada()%></td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                </table>
                <form action="EditarReservaCliente.jsp">
                    <input type="hidden" name="nombre" value="<%= c.getNombre()%>"/>
                    <input type="hidden" name="pais" value="<%= c.getPais()%>"/>
                    <input type="hidden" name="correo" value="<%= c.getCorreo()%>"/>
                    <input type="hidden" name="id" value="<%= c.getId()%>"/>
                    <input type="hidden" name="direccion" value="<%= c.getProvincia()%>"/>



                    <input type="submit" name="editar" id="editar" value="Editar" />     
                    <input type="submit" name="eliminar" id="eliminar" value="Eliminar" />  
                    <input type="submit" name="agregar" id="agregar" value="Agregar" />
                </form>>
                <pre style="font-family: Gotham, 'Helvetica Neue', Helvetica, Arial, sans-serif; font-size: 200%;">

                </pre>
                <pre style="font-family: Gotham, 'Helvetica Neue', Helvetica, Arial, sans-serif; font-size: 200%;">&nbsp;</pre>
                <pre style="font-family: Gotham, 'Helvetica Neue', Helvetica, Arial, sans-serif; font-size: 200%;">&nbsp;</pre>
                <pre>&nbsp;</pre>
                <pre>&nbsp;</pre>
                <pre>&nbsp;</pre>
                <pre>&nbsp;</pre>
                <pre>&nbsp;</pre>
                <pre>&nbsp;</pre>
                <pre>&nbsp;
                </pre>
                <p>&nbsp;  </p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                <!-- end .content --></div>
            <!-- end .container --></div>
    </body>
<<<<<<< HEAD

=======
>>>>>>> origin/Andrea
</html>
