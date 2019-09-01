<%--
  Created by IntelliJ IDEA.
  User: 11469
  Date: 2019/8/30
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<%--<script src="http://how2j.cn/study/jquery.min.js"></script>--%>
<script src="js/jquery.min.js"></script>
<script>
    $(function(){
        $("input.btn").click(function(){
            var $name = $("#name").val().trim();
            if($name.length===0){
                alert('请输入姓名','name');
                $("#name").focus();
                return false;
            }else if(!$name.match(/^[\u4e00-\u9fa5]{2,4}$/i)){
                alert("姓名格式不正确，姓名必须由2-4位汉字组成",{icon:0});
                $("#name").focus();
                return false;
            }
        });
    });

</script>

<form class="loginForm" action="forecal" method="post">
    <div class="search">
        <div class="inner">
            <input class="input" name="name" id="name" type="text" placeholder="输入您要测试姓名，例如张三">
            <input class="btn" type="submit" value=" ">
        </div>
    </div>
</form>

