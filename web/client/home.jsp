<%-- 
    Document   : home
    Created on : Mar 3, 2020, 2:58:39 PM
    Author     : Khanh Xinh Tuoi
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./Css/layout.css" rel="stylesheet" type="text/css"/>
        <link href="./Css/home.css" rel="stylesheet" type="text/css"/>     
        <title>Home Page</title>
    </head>
    <body>
        <div id="mainBoxShadow1">    
            
            <%@include file="header.jsp" %>
            <div id="bigContener">
                <div id="listBlogs" class="fontArial">
                    <div id="subContent">
                        <div id="divAvatar">
                            <img class="avatar" src="${home.picture}">
                        </div>
                        <div id="divTitleContent">
                            <h2 class="fontTimeNewRoman magin">${home.title}</h2>
                            <p class="fontArial fontSortDescription">${home.content}</p>
                        </div>
                    </div>

                    <div id="subContent">
                        <c:forEach items="${arrCake}" var="cake" >
                        <div class="divCake1">
                            <img class="imageCakeHome" src="${cake.picture}"/>
                            <a class="fontBlack noneLine" href="detail?id=${cake.id}">
                                <h2 class="fontTimeNewRoman magin">${cake.title}</h2></a>
                            <p class="fontArial fontSortDescription">${cake.sortContent}</p>
                        </div>
                        <div class="centerdiv"></div>
                        </c:forEach>
                        
                    </div>
                    <div id="subContent">

                        <div id="divVisit">
                            <h2 class="fontTimeNewRoman magin">Visit my cafe</h2>
                            <p class="fontSortDescription">${home.sortContent}</p>
                            <p class="fontSortDescription">${home.address}</p>
                            <p class="fontSortDescription">Phone:${home.phone}</p>
                        </div>

                    </div>
                    <div id="divSign">
                        <p class="fontArial">${home.sign1}</p>
                        <p class="fontSign fontBold magin">${home.sign2}</p>
                    </div>
                </div>
                <%@include file= "adv.jsp" %>
            </div>
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>