<%-- 
    Document   : error
    Created on : Mar 3, 2020, 2:59:30 PM
    Author     : Khanh Xinh Tuoi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="./Css/layout.css" rel="stylesheet" type="text/css"/>
        <title>Home Page</title>
    </head>
    <body>
         <div id="mainBoxShadow1">
            <%@include file="header.jsp" %>
            <div id="bigContener">
                <div id="listBlogs" class="fontArial">
                    <div id="subContent">
                        <div>
                            Error Pages
                        </div>
                    </div>
                </div>
                <%@include file= "adv.jsp" %>
            </div>
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>