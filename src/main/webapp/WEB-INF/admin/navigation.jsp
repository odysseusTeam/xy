<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!-- Navigation -->
<div class="navbar navbar-fixed-top scroll-hide">
    <div class="container-fluid top-bar">
        <div class="pull-right">
            <ul class="nav navbar-nav pull-right">

                <li class="dropdown settings hidden-xs">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span aria-hidden="true" class="se7en-gear"></span>
                        <div class="sr-only">
                            设置
                        </div>
                    </a>
                    <ul class="dropdown-menu">
                        <li>
                            <a class="settings-link blue" href="javascript:chooseStyle('none', 30)"><span></span>蓝色</a>
                        </li>
                        <li>
                            <a class="settings-link green" href="javascript:chooseStyle('green-theme', 30)"><span></span>绿色</a>
                        </li>
                        <li>
                            <a class="settings-link orange" href="javascript:chooseStyle('orange-theme', 30)"><span></span>橘黄色</a>
                        </li>
                        <li>
                            <a class="settings-link magenta" href="javascript:chooseStyle('magenta-theme', 30)"><span></span>品红</a>
                        </li>
                        <li>
                            <a class="settings-link gray" href="javascript:chooseStyle('gray-theme', 30)"><span></span>灰色</a>
                        </li>
                    </ul>
                </li>
                <li class="dropdown user hidden-xs"><a data-toggle="dropdown" class="dropdown-toggle" href="#">
                    <img width="34" height="34" src="${pageContext.request.contextPath}/resources/admin/images/avatar-male.jpg" />${loginUser.name}<b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="${pageContext.request.contextPath}/admin/user/show/${loginUser.id}">
                            <i class="icon-user"></i>我的账户</a>
                        </li>
                        <li><a href="${pageContext.request.contextPath}/admin/user/updateUI/${loginUser.id}">
                            <i class="icon-gear"></i>账户设置</a>
                        </li>
                        <li><a href="${pageContext.request.contextPath}/admin/user/logout">
                            <i class="icon-signout"></i>退出</a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
       <a class="logo" href="${pageContext.request.contextPath}/admin/index">Aode app</a>
    </div>
    <div class="container-fluid main-nav clearfix">
        <div class="nav-collapse">
            <ul class="nav">
                <li>
                    <a  href="${pageContext.request.contextPath}/admin/index" id="index_page"><span aria-hidden="true" class="icon-home"></span>控制台</a>
                </li>
                <li ><a href="${pageContext.request.contextPath}/admin/user/list" id="user_page">
                    <span aria-hidden="true" class="icon-user "  ></span>管理员</a>
                </li>
                <li ><a href="${pageContext.request.contextPath}/admin/member/list" id="member_page">
                    <span aria-hidden="true" class="icon-group "></span>校友</a>
                </li>
              <li class="dropdown"><a data-toggle="dropdown" href="#" id="news_page">
                    <span aria-hidden="true" class="icon-list "></span>新闻动态<b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="${pageContext.request.contextPath}/admin/newsType/list">
                            公告栏</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/admin/news/list">校友会新闻</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/admin/news/list">母校要闻</a>
                        </li>
                    </ul>
                </li>
                                

                <li class="dropdown"><a data-toggle="dropdown" href="#" id="attention_page">
                    <span aria-hidden="true" class="icon-camera-retro"></span>关注校友会<b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="${pageContext.request.contextPath}/admin/instrumentType/list">
                            校友会简介</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/admin/instrument/list">校友会章程</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/admin/instrument/list"> 组织机构</a>
                        </li>

                    </ul>
                </li>
                <li class="dropdown"><a data-toggle="dropdown" href="#" id="donate_page">
                    <span aria-hidden="true" class="icon-gittip "></span>校友捐赠<b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="${pageContext.request.contextPath}/admin/studyType/list">
                            我要捐赠</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/admin/study/list">捐赠鸣谢</a>
                        </li>

                    </ul>
                </li>
                <li class="dropdown"><a data-toggle="dropdown" href="#" id="services_page">
                    <span aria-hidden="true" class="icon-cloud "></span>校友服务<b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="${pageContext.request.contextPath}/admin/messageList/list">
                            校友通讯</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/admin/study/list">校友呼声</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/admin/study/list">校友企业</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/admin/study/list">纪念品</a>
                        </li>
                    </ul>
                </li>

                <li class="dropdown"><a data-toggle="dropdown" href="#" id="essay_page">
                    <span aria-hidden="true" class="icon-calendar"></span>东大校友在广东<b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="${pageContext.request.contextPath}/admin/studyType/list">
                            往期刊物</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/admin/study/list">投稿</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a  href="${pageContext.request.contextPath}/admin/index" id="contact_page"><span aria-hidden="true" class="icon-phone"></span>联系我们</a>
                </li>
            </ul>
        </div>
    </div>
</div>
<!-- End Navigation -->