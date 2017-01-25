<%@page import="infos.ContactEmploye"%>
<%@page import="java.util.ArrayList"%>
<%@page import="personne.Personnel"%>
<!Doctype html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />
    <link href="css/animate.min.css" rel="stylesheet"/>
    <link href="css/light-bootstrap-dashboard.css" rel="stylesheet" />
    <link href="css/pe-icon-7-stroke.css" rel="stylesheet" />
    <link rel="stylesheet" media="screen" type="text/css" href="css/datepicker.css" />
    <link href="css/bootstrap.min.css" rel="stylesheet" />
    <link rel="icon" type="image/png" href="images/favicon.png"/>
    <title>Mad'hotel</title>

</head>
<body>

<div class="wrapper">
    <div class="sidebar" data-color="blue" data-image="images/sidebar.jpg">
		<div class="sidebar-wrapper">
            <div class="logo">
                <a href="#" class="simple-text">Mad'hotel</a>
            </div>

            <ul class="nav">
                <li>
                    <a href="index.jsp">
                        <i class="pe-7s-graph"></i>
                        <p>Acceuil</p>
                    </a>
                </li>
                <li class="active">
                    <a href="newpersonnel.jsp">
                        <i class="pe-7s-user"></i>
                        <p>Insertion d'employ&eacute;</p>
                    </a>
                </li>
                <li>
                    <a href="newposte.jsp">
                        <i class="pe-7s-note2"></i>
                        <p>Insertion de poste</p>
                    </a>
                </li>
            </ul>
    	</div>
    </div>

    <div class="main-panel">
        <nav class="navbar navbar-default navbar-fixed">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Suppression d'employ&eacute;</a>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav navbar-right">
                    </ul>
                </div>
            </div>
        </nav>
<%
    Integer id=Integer.valueOf(request.getParameter("id"));
    int idf=id.intValue();
    try
    {
        if(request.getParameter("mode").compareToIgnoreCase("oui")==0)
        {
            Personnel.deleteContacts(idf);
        }
        Personnel.delete(idf);
        response.sendRedirect("searchpersonnel.jsp?critere=&key=&mode=simple");
    }
    catch(Exception e)
    {
%>
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-6 col-lg-offset-3" id="alert">
                    <div class="alert alert-warning">
                        <strong>Attention!</strong> <% out.print(e.getMessage()); %>
                    </div>
                    <p>Voulez-vous supprimer tous les contacts rattach&eacute;s &agrave; cet employ&eacute;?</p>
                    <a href="searchpersonnel.jsp?critere=&key=&mode=simple" class="btn btn-info">Non</a>
                    <a href="deletepersonnel.jsp?id=<% out.print(idf); %>&mode=oui" class="btn btn-danger">Oui</a>
                </div>
            </div>
        </div>
                    
        <footer class="footer">
            <div class="container-fluid">
                <p class="copyright pull-right">
                    Copyright &copy; <a href="#">Mad'Hotel</a> 2016
                </p>
            </div>
        </footer>

    </div>
</div>                 
<style type="text/css">
.alert
{
    text-align: center;
}
#alert
{
    border: double black 5px;
    padding-top: 10px;
    padding-bottom: 10px;
    margin-top : 10px;
    margin-bottom : 10px;
}
</style>
<%
    }
%>
</body>
</html>