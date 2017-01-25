<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!Doctype html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />
    <link href="css/bootstrap.min.css" rel="stylesheet" />
    <link href="css/animate.min.css" rel="stylesheet"/>
    <link href="css/light-bootstrap-dashboard.css" rel="stylesheet"/>
    <link href="css/pe-icon-7-stroke.css" rel="stylesheet" />
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
                <li>
                    <a href="newpersonnel.jsp">
                        <i class="pe-7s-user"></i>
                        <p>Insertion d'employ&eacute;</p>
                    </a>
                </li>
                <li class="active">
                    <a href="#">
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
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navigation-example-2">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Nouveau poste</a>
                </div>
                <div class="collapse navbar-collapse">
                </div>
            </div>
        </nav>
        
        <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12">
                    <form class="form-horizontal" method="get" action="insertposte.jsp">
                        <div class="form-group">
                            <h1 class="col-sm-offset-2 col-sm-8" style="text-align: center">Informations sur le poste:</h1>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-3" for="des">D&eacute;signation du poste:</label>
                            <div class="col-sm-9"> 
                                    <input type="text" class="form-control" id="des" name="des" placeholder="Entrez le nom du poste..." required />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-3" for="sal">Salaire du poste (ariary):</label>
                            <div class="col-sm-9"> 
                                    <input type="number" step="50000" class="form-control" id="sal" name="sal" placeholder="Entrez le salaire pour le poste..." required />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-3" for="perm">Permission annuel (jours):</label>
                            <div class="col-sm-9"> 
                                    <input type="number" step="10" class="form-control" id="perm" name="perm" placeholder="Entrez le nombre de jour de persmission pour le poste..." required />
                            </div>
                        </div>
                        <div class="form-group"> 
                            <div class="col-sm-offset-3 col-sm-9">
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
<script src="js/light-bootstrap-dashboard.js"></script>

</body>
</html>

