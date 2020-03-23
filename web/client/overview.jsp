<%-- 
    Document   : overview
    Created on : Mar 3, 2020, 3:00:17 PM
    Author     : Khanh Xinh Tuoi
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href="./Css/layout.css" rel="stylesheet" type="text/css"/>
        <link href="./Css/overview.css" rel="stylesheet" type="text/css"/>
        <title>Overview Page</title>
    </head>
    <body>
        <div id="mainBoxShadow1">
            <%@include file="header.jsp" %>
            <div id="bigContener">
                <div id="listBlogs" class="fontArial">
                    <h1 class="title">Overview-Blog</h1>
                    <c:if test="${noProduct eq true}">
                        <h3>No Product</h3>
                        
                    </c:if>
                    <c:forEach items="${arrCake}" var="row">
                        <div id="linePaginCafe">
                            <a class="fontBlack noneLine" href="detail?id=${row.id}">
                                <h1 class="fontTimeNewRoman">${row.title}</h1></a>
                            <div id="contentDetail">
                                <span>
                                    <img class="imgDetail floatRight" src="${row.picture}"/>
                                    <p class="fontSortDescription magin">${row.sortContent}</p>
                                </span>
                            </div>
                        </div>
                    </c:forEach>
                    <!--display number pagination-->
                    
                    <div id="numberPagination">
                        <c:forEach begin="1" end="${maxPage}" var="i">
                            <a class="${i==currentPage?"activation":"deactivation"}" href="overview?CurrentPage=${i}">${i}</a>                                                                                           
                        </c:forEach>
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