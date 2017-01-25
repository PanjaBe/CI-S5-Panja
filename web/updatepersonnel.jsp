<%@page import="infos.ContactEmploye"%>
<%@page import="infos.Poste"%>
<%@page import="personne.Personnel"%>
<%
    Integer poste=Integer.valueOf(request.getParameter("pos"));
    int postef=poste.intValue();
    Poste po=new Poste(postef,"wawa");
    Personnel p=new Personnel(request.getParameter("nom"),request.getParameter("pre"),request.getParameter("sex").charAt(0),request.getParameter("dat"),po);
    Integer id=Integer.valueOf(request.getParameter("id"));
    int idf=id.intValue();
    p.setId(idf);
    p.update();
    String addr=request.getParameter("adr");
    Integer num=Integer.valueOf(request.getParameter("tel"));
    int tel=num.intValue();
    String mail=request.getParameter("mail");
    ContactEmploye c=ContactEmploye.find(idf);
    if(c.adresseEmploye.compareToIgnoreCase(addr)!=0 || c.telephoneEmploye!=tel || c.mailEmploye.compareToIgnoreCase(mail)!=0)
    {
        c=new ContactEmploye(idf,tel,addr,mail);
        c.insert();
    }
    response.sendRedirect("searchpersonnel.jsp?critere=&key=&mode=simple");
%>