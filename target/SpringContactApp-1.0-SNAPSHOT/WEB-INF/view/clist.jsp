<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact List - Contact Application </title>
         <s:url var="url_css" value="/static/css/style.css"/>
        <link href="${url_css}" rel="stylesheet" type="text/css"/>
    </head>
    <s:url var="url_bg" value="/static/image/bg.jpg"/>
    <body background="${url_bg}">
        <table border="1" width="80%" align="center">
            <tr>
                <td height="80px">
                    <%-- Header --%>
                    <jsp:include page="include/header.jsp"/>
                </td>
            </tr>
            <tr>
                <td height="25px">
                     <%-- Menu --%>
                     <jsp:include page="include/menu.jsp"/>
                </td>
            </tr>
            <tr>
                <td height="350px" valign="top">
                     <%-- Page Content Area--%>
                     <h3>Contact List</h3>
                     <c:if test="${param.act eq 'sv'}">
                         <p class="success">Contact Saved</p>
                     </c:if>
                     <c:if test="${param.act eq 'del'}">
                         <p class="success">Contact Deleted</p>
                     </c:if>
                         <form action="<s:url value="/user/contact_search"/>">
                             <input type="text" name ="freeText" value="${param.freeText}" placeholder="Enter Text To Search">
                             <button>Find</button>
                         </form>
                             </br>
                     <table border="1" cellpadding="3">
                         <tr>
                            <th>S.No.</th>
                            <th>C ID</th>
                            <th>Name</th>
                            <th>Phone</th>
                            <th>Address</th>
                            <th>Remark</th>
                            <th>Action</th>
                         </tr>
                         <c:if test="${empty contactList}">
                             <tr>
                                 <td align="center" colspan="8" class ="error">Record Empty</td>
                             </tr>
                         </c:if>
                         
                         <c:forEach var="c" items="${contactList}" varStatus="st">
                             <tr>
                            <td>${st.count}</td>
                            <td>${c.contactId}</td>
                            <td>${c.name}</td>
                            <td>${c.phone}</td>
                            <td>${c.address}</td>
                            <td>${c.remark}</td>
                            <s:url var="url_del" value="/user/del_contact">
                                <s:param name="cid" value="${c.contactId}"/>
                            </s:url>
                            <s:url var="url_edit" value="/user/edit_contact">
                                <s:param name="cid" value="${c.contactId}"/>
                            </s:url>
                            <td> <a href="${url_edit}">EDIT</a> | <a href="${url_del}">DELETE</a></td>
                                
                         </tr>
                         </c:forEach>
                     </table>
                </td>
            </tr>
             <tr>
                <td height="25px">
                     <%-- Footer --%>
                     <jsp:include page="include/footer.jsp"/>
                </td>
            </tr>
        </table>
    </body>
</html>