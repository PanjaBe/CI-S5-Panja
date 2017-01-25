<%@page import="Connexion.Connexion"%>
<%@page import="infos.ContactEmploye"%>
<%@page import="personne.Personnel"%>
<%
    String nom=request.getParameter("nom");
    String pre=request.getParameter("pre");
    char sexe=request.getParameter("sex").charAt(0);
    String naiss=request.getParameter("dat");
    Integer poste=Integer.valueOf(request.getParameter("pos"));
    int postef=poste.intValue();
    int id=Connexion.getRecentsequence();
    Integer num=Integer.valueOf(request.getParameter("tel"));
    int numf=num.intValue();
    String addr=request.getParameter("adr");
    String mail=request.getParameter("mail");
    Personnel p=new Personnel(postef,nom,pre,sexe,naiss,numf,addr,mail);
    p.insert();
    response.sendRedirect("searchpersonnel.jsp?critere=&key=&mode=simple");
%>
