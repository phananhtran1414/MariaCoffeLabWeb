<%-- 
    Document   : find
    Created on : Mar 3, 2020, 2:59:47 PM
    Author     : Khanh Xinh Tuoi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./Css/layout.css" rel="stylesheet" type="text/css"/>
        <link href="./Css/find.css" rel="stylesheet" type="text/css"/>
        <title>Find</title>
    </head>
    <body>
        <div id="mainBoxShadow1">
            <%@include file="header.jsp" %>
            <div id="bigContener">
                <div id="listBlogs" class="fontArial">
                    <h1 class="fontTimeNewRoman">Find Maria's Cafe</h1>
                    <div id="subContent">
                        <div>
                            <p class="fontFindPage magin">Address and Contact: </p>
                            <p class="fontSortDescription">${findCafe.address}</p>
                            <p class="fontSortDescription">Tel: ${findCafe.telephone}</p>
                            <p class="fontSortDescription">Email: ${findCafe.email}</p>
                        </div>
                        <div id="divOpenClose">
                            <h3 class="fontFindPage magin">Opening Hours: </h3>
                            <p class="fontSortDescription magin">${findCafe.closed}</p>
                            <p class="fontSortDescription magin">${findCafe.opended1}</p>
                            <p class="fontSortDescription magin">${findCafe.opended2}</p>
                        </div>
                    </div>
                    <div id="divTitleContent">
                        <image class="imageMap" src="${findCafe.map}"/>
                    </div>
                </div>
                <!-- the advertising -->
                <%@include file= "adv.jsp" %>
            </div>
            <!--Display the footer of pages-->
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>
