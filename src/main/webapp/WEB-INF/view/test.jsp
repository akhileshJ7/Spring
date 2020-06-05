<%-- 
    Document   : test
    Created on : Apr 26, 2020, 2:24:23 AM
    Author     : janaswamya
--%>

<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <s:url var="url_jqlib" value="/static/js/jquery-3.5.0.min.js"  />
        <script src="${url_jqlib}"></script>
        <script>
            $(document).ready(function(){
                 $("#id_get_time").click(function(){
                    //alert('Button clicked...');
                    $.ajax({
                        url : 'get_time',
                        success : function (data){
                            $("#id_time").html(data);
                        }
                    });
                });
            });
        </script>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>AJAX Test</h1>
         <button id="id_get_time">Get Server Time</button> <br/>
        <p id="id_time"></p>
    </body>
</html>

