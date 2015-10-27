<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>  
<head>
    <meta charset="utf-8">
    <title>
        校友编辑
    </title>
    <%@ include file="../se7en_css.jsp" %>

    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" name="viewport">
</head>
<body>
<div class="modal-shiftfix">
    <!-- Navigation -->
    <%@ include file="../navigation.jsp" %>
      <div class="container-fluid main-content"><div class="page-title">
      </div>
          <div class="row">
              <div class="col-lg-12">
                  <ul class="breadcrumb">
                      <li>
                          <a href="${pageContext.request.contextPath}/admin/index"></a><i class="icon-home"></i>
                      </li>
                      <li>
                          <a href="${pageContext.request.contextPath}/admin/member/list">校友管理</a>
                      </li>
                      <li class="active">
                          校友保存
                      </li>
                  </ul>
              </div>
              <div class="col-md-12">
                  <div class="widget-container">
                      <div class="heading">
                          <i class="icon-shield"></i>校友保存
                      </div>
                      <div class="widget-content padded">
                          <form >
                              <fieldset>
                                  <div class="row">
                                      <div class="col-md-6 col-md-offset-3">
                                          <div class="form-group">
                                              <label for="loginName">登录账号</label>
                                              <input class="form-control" readonly id="loginName" name="loginName" type="text" value="${member.loginName}">
                                          </div>
                                          <div class="form-group">
                                              <label for="name">姓名</label>
                                              <input class="form-control" readonly id="name" name="name" type="text" value="${member.name}">
                                          </div>
                                          <div class="form-group">
                                              <label for="password">密码</label>
                                              <input class="form-control" readonly id="password" name="password" type="text" value="${member.password}">
                                          </div>
                                              <div class="form-group">
                                                  <label for="phoneNumber">手机号码</label>
                                                  <input class="form-control" readonly id="phoneNumber" name="phoneNumber" type="text" value="${member.phoneNumber}">
                                              </div>
                                              <div class="form-group">
                                                  <label for="email">邮件</label>
                                                  <input class="form-control" readonly id="email" name="email" type="email" value="${member.email}">
                                              </div>
                                              <div class="form-group">
                                                  <label for="address">地址</label>
                                                  <input class="form-control"readonly id="address" name="address" type="address" value="${member.address}">
                                              </div>
                                      </div>
                                  </div>
                                  <div class="col-md-offset-5 col-md-2">
                                      <a class="btn btn-default-outline" href="${pageContext.request.contextPath}/admin/member/list">返回</a>
                                  </div>

                              </fieldset>
                          </form>
                      </div>
                  </div>
              </div>
          </div>
      </div>
  </div>
<%@ include file="../se7en_js.jsp" %>
  </body>
</html>