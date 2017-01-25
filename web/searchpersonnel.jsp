<%@page import="infos.Poste"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="personne.Personnel"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                    <a class="navbar-brand" href="#">Recherche Employ&eacute;s</a>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <form class="navbar-form navbar-right" method="GET" action="searchpersonnel.jsp">
                                <div class="form-group"> 
                                    <select class="form-control" id="critere" name="critere" style="color:black">
                                        <option value="nompersonnel">Nom</option>
                                        <option value="prenompersonnel">Pr&eacute;nom</option>
                                        <option value="sexe">Sexe</option>
                                        <option value="naissance">Date de naissance</option>
                                        <option value="designationposte">Poste</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control" id="key" name="key" placeholder="Cl&eacute; de recherche" style="color:black"/>
                                </div>
                                <input type="hidden" name="mode" value="simple"/>
                                <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button>
                            </form>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        
        <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12">
                    <h1>Filtres de recherche:</h1>
                    <form class="form-inline" method="GET" action="searchpersonnel.jsp">
                        <div class="form-group">
                            <label for="nom">Nom:</label>
                            <input type="text" class="form-control" id="nom" name="nom" placeholder="Saisir un nom..."/>
                        </div>
                        <div class="form-group">
                            <label for="pre">Pr&eacute;nom:</label>
                            <input type="text" class="form-control" id="pre" name="pre" placeholder="Saisir un pr&eacute;nom..."/>
                        </div>
                        <div class="form-group">
                            <label for="sexe">Sexe:</label>
                            <select class="form-control" id="sexe" name="sexe">
                                <option value=""></option>
                                <option value="h">Homme</option>
                                <option value="f">Femme</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="nais">Date de naissance:</label>
                            <input type="date" class="form-control" id="nais" name="nais"/>
                        </div>
                        <div class="form-group">
                            <label for="poste">Poste:</label>
                            <select class="form-control" id="poste" name="poste">
                                <option></option>
                                <%
                                    Poste po=new Poste();
                                    ArrayList lp=po.getPostes();
                                    for(int i=0;i<lp.size();i++)
                                    {
                                        po=(Poste)lp.get(i);
                                        out.print("<option value='"+po.designationPoste+"'>"+po.designationPoste+"</option>");
                                    }
                                %>
                            </select>
                        </div>
                        <input type="hidden" name="mode" value="multi"/>
                        <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button>
                    </form>
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12">
                    <hr/>
                    <h1>Liste des employ&eacute;s:</h1>
                            <%
                                ArrayList ps=null;
                                if(request.getParameter("mode").compareTo("multi")==0)
                                {
                                    String[] critere=new String[5];
                                    critere[0]=new String("nompersonnel");
                                    critere[1]=new String("prenompersonnel");
                                    critere[2]=new String("sexe");
                                    critere[3]=new String("naissance");
                                    critere[4]=new String("designationposte");
                                    String[] key=new String[5];
                                    key[0]=new String(request.getParameter("nom"));
                                    key[1]=new String(request.getParameter("pre"));
                                    key[2]=new String(request.getParameter("sexe"));
                                    key[3]=new String(request.getParameter("nais"));
                                    key[4]=new String(request.getParameter("poste"));
                                    ps=Personnel.multiFind(critere,key);
                                }
                                else
                                {
                                    ps=Personnel.find(request.getParameter("critere"),request.getParameter("key"));
                                }
                                if(ps==null || (ps!=null && ps.size()==0))
                                {
                            %>
                    <h3>Aucun r&eacute;sultat</h3>
                            <%      
                                }
                                else
                                {
                            %>
                    <div class="table-responsive">
                        <table border="solid black 1px" class="table">
                            <thead>
                                <tr>
                                    <th>Nom</th>
                                    <th>Pr&eacute;nom</th>
                                    <th>Sexe</th>
                                    <th>Date de naissance</th>
                                    <th>Poste</th>
                                    <th>Modification</th>
                                    <th>Suppression</th>
                                </tr>
                            </thead>
                            <tbody>
                            <%
                                    String s="";
                                    Personnel p=new Personnel();
                                    for(int i=0;i<ps.size();i++)
                                    {
                                        p=(Personnel)ps.get(i);
                                        if(p.sexe=='h')
                                        {
                                            s="Homme";
                                        }
                                        else
                                        {
                                            s="Femme";
                                        }
                            %>
                                <tr>
                                   <td><% out.print(p.nomPersonnel); %></td>
                                   <td><% out.print(p.prenomPersonnel); %></td>
                                   <td><% out.print(s); %></td>
                                   <td><% out.print(p.naissance); %></td>
                                   <td><% out.print(p.poste.designationPoste); %></td>
                                   <td><a href="modifpersonnel.jsp?id=<% out.print(p.idPersonnel); %>" class="btn btn-info">Consulter</a></td>
                                   <td><a href="deletepersonnel.jsp?id=<% out.print(p.idPersonnel); %>&mode=non" class="btn btn-danger">Supprimer</a></td>
                                </tr>
                            <%
                                    }
                                }
                            %>
                            </tbody>
                        </table>
                    </div>
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

<script src="js/jquery-1.10.2.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<script src="js/bootstrap-checkbox-radio-switch.js"></script>
<script src="js/chartist.min.js"></script>
<script src="js/bootstrap-notify.js"></script>
<script src="js/jquery.js"></script>
</script>

</body>
</html>

