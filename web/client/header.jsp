<%-- 
    Document   : header
    Created on : Mar 3, 2020, 3:00:07 PM
    Author     : Khanh Xinh Tuoi
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="./Css/header.css" rel="stylesheet" type="text/css"/>
<link href="./Css/layout.css" rel="stylesheet" type="text/css"/>

<div id="bigHeader">
    <h1 class="magin logo">Maria Bagnarelli's Cafe</h1>
    <p class="colorWhite fontTimeNewRoman subLogo colorWhite">Welcome to this website</p>
</div>
<div id="menuBar">

    <a id="Home" href="home" class="subMenuBar noneLine 
            ${check eq 'home'?"fontBold":""}        
        ">Home</a>
       
    <a id="OverView" href="overview?CurrentPage=1" class="subMenuBar noneLine
            ${check eq 'overview'?"fontBold":""}
        ">About my Cakes</a>
       
    <a id="Find" href="find" class="subMenuBar noneLine
            ${check eq 'find'?"fontBold":""}
        ">Find Maria's Cafe</a>     
</div>