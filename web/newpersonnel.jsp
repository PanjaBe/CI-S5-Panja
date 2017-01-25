<%@page import="java.util.ArrayList"%>
<%@page import="infos.Poste"%>
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
                    <a href="#">
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
                    <a class="navbar-brand" href="#">Nouvel Employ&eacute;</a>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <form class="navbar-form navbar-right" method="GET" action="searchpersonnel.jsp">
                                <div class="form-group"> 
                                    <select class="form-control" id="critere" name="critere" required style="color:black" >
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
                    <form class="form-horizontal" method="get" action="insertpersonnel.jsp">
                        <div class="form-group">
                            <h1 class="col-sm-offset-2 col-sm-8" style="text-align: center">Informations sur l'employ&eacute;:</h1>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="nom">Nom:</label>
                            <div class="col-sm-10"> 
                                    <input type="text" class="form-control" id="nom" name="nom" placeholder="Entrez le nom de l'employ&eacute;..." required />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="pre">Pr&eacute;nom:</label>
                            <div class="col-sm-10"> 
                                <input type="text" class="form-control" id="pre" name="pre" placeholder="Entrez le pr&eacute;nom de l'employ&eacute;..." required />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="sex">Sexe:</label>
                            <div class="col-sm-10"> 
                                <label class="radio-inline"><input type="radio" name="sex" id="sex" value="h" required />Homme</label>
                                <label class="radio-inline"><input type="radio" name="sex" value="f"/>Femme</label>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="dat">Date de naissance:</label>
                            <div class="col-sm-10"> 
                                <input type="text" class="form-control" id="dat" name="dat" placeholder="Entrez la date de naissance de l'employ&eacute;..." required />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="pos">Poste:</label>
                            <div class="col-sm-10"> 
                                <select class="form-control" id="pos" name="pos" required >
                                    <option></option>
                                    <%
                                        Poste p=new Poste();
                                        ArrayList ps=p.getPostes();
                                        for(int i=0;i<ps.size();i++)
                                        {
                                            p=(Poste)ps.get(i);
                                            out.print("<option value='"+p.idPoste+"'>"+p.designationPoste+"</option>");
                                        }
                                    %>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="adr">Adresse:</label>
                            <div class="col-sm-10"> 
                                    <input type="text" class="form-control" id="adr" name="adr" placeholder="Entrez l'adresse de l'employ&eacute;..." required />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="tel">T&eacute;l&eacute;phone:</label>
                            <div class="col-sm-10"> 
                                    <input type="number" class="form-control" id="tel" name="tel" placeholder="Entrez le t&eacute;l&eacute;phone de l'employ&eacute;..." required />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="mail">Email:</label>
                            <div class="col-sm-10"> 
                                    <input type="email" class="form-control" id="mail" name="mail" placeholder="Entrez l'adresse email de l'employ&eacute;..." required />
                            </div>
                        </div>
                        <div class="form-group"> 
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" class="btn btn-success">Enregistrer</button>
                                <input type="reset" class="btn btn-warning"/>
                            </div>
                        </div>
                    </form>
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
<script type="text/javascript" src="js/datepicker.js"></script>
<script type="text/javascript">
$('#dat').DatePicker({
	format:'Y-m-d',
	view: 'years',
	date: $('#dat').val(),
	current: $('#dat').val(),
	starts: 1,
	position: 'bottom',
	onChange: function(){
		var date=$('#dat').DatePickerGetDate(true);
		if(/^\d{4}\-\d{1,2}\-\d{1,2}$/.test(date))
		{
			$('#dat').DatePickerHide();
			$('#dat').val(date);
                        console.log(date);
		}
	}
});
</script>

</body>
</html>

