<%--
 - form.jsp
 -
 - Copyright (C) 2012-2022 Rafael Corchuelo.
 -
 - In keeping with the traditional purpose of furthering education and research, it is
 - the policy of the copyright owner to permit non-commercial use and redistribution of
 - this software. It has been tested carefully, but it is not guaranteed for any particular
 - purposes.  The copyright owner does not offer any warranties or representations, nor do
 - they accept any liabilities with respect to them.
 --%>

 <%@page language="java"%>

 <%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@taglib prefix="acme" uri="urn:jsptagdir:/WEB-INF/tags"%>

 <acme:form>

 	<acme:input-textbox code="patron.patronage.form.label.status" path="status"/>
 	<acme:input-textbox code="patron.patronage.form.label.code" path="code"/>
 	<acme:input-textbox code="patron.patronage.form.label.legalStuff" path="legalStuff"/>
 	<acme:input-money code="patron.patronage.form.label.budget" path="budget"/>
 	<acme:input-moment code="patron.patronage.form.label.creationMoment" path="creationMoment"/>
 	<acme:input-moment code="patron.patronage.form.label.startDate" path="startDate"/>
 	<acme:input-moment code="patron.patronage.form.label.endDate" path="endDate"/>
 	<jstl:if test="${command == 'show'}">
 		<acme:input-textbox code="patron.patronage.form.label.period" path="period"/>
 	</jstl:if>
 	<acme:input-url code="patron.patronage.form.label.moreInfo" path="moreInfo"/><br>
 	<jstl:if test="${command == 'show'}">
	 	<h2 class="text-center">-------------------------------------------------------------------------------------------------------</h2>
	 	<acme:input-textbox code="patron.patronage.form.label.patron.company" path="patron.company"/>
	 	<acme:input-textbox code="patron.patronage.form.label.patron.statement" path="patron.statement"/>
	 	<acme:input-url code="patron.patronage.form.label.patron.moreInfo" path="patron.moreInfo"/>
	 	<acme:input-textbox code="patron.patronage.form.label.patron.userAccount.username" path="patron.userAccount.username"/>
	 	<acme:input-textbox code="patron.patronage.form.label.patron.userAccount.identity.name" path="patron.userAccount.identity.name"/>
	 	<acme:input-textbox code="patron.patronage.form.label.patron.userAccount.identity.surname" path="patron.userAccount.identity.surname"/>
	 	<acme:input-textbox code="patron.patronage.form.label.patron.userAccount.identity.email" path="patron.userAccount.identity.email"/>
		<h2 class="text-center">-------------------------------------------------------------------------------------------------------</h2>
	</jstl:if>
	<acme:submit test="${command == 'create'}" code="patron.patronage.form.button.create" action="/patron/patronage/create"/>

 </acme:form>  