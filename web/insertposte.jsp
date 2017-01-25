<%@page import="infos.Poste"%>
<%
    String des=request.getParameter("des");
    Double sal=Double.valueOf(request.getParameter("sal"));
    Integer perm=Integer.valueOf(request.getParameter("perm"));
    float salf=sal.floatValue();
    int permf=perm.intValue();
    Poste p=new Poste(des,salf,permf);
    p.insert();
    response.sendRedirect("newposte.jsp");
%>

