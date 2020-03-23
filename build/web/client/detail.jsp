<%-- 
    Document   : detail
    Created on : Mar 3, 2020, 2:59:12 PM
    Author     : Khanh Xinh Tuoi
--%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href="./Css/layout.css" rel="stylesheet" type="text/css"/>
        <link href="./Css/detail.css" rel="stylesheet" type="text/css"/>
        <title>Detail</title>
    </head>
    <body>
        <div id="mainBoxShadow1">
            <%@include file="header.jsp" %>
            <div id="bigContener">
                <div id="listBlogs" class="fontArial">
                    <h1 class="fontTimeNewRoman">${cake.title} : ${cake.price}$</h1>
                    <div id="contentDetail">
                        <span>
                            <img class="imgDetail floatRight" src="${cake.picture}"/>
                            <p class="fontSortDescription magin">${cake.content}</p>
                        </span>
                    </div>
                </div>
                <%@include file= "adv.jsp" %>
            </div>
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>