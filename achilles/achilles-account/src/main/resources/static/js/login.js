$(function() {
    $("#loginBtn").click(function() {
        var userName = $('#inputUserName').val();
        var password = $('#inputPassword').val();

        var params = {};
        params.userName = userName;
        params.password = password;

        // 登陆提交
        $.ajax({
            url:"/login",
            data:params,
            dataType:"json",
            type: "POST"
        }).success(function(result) {
            alert(result);
        }).error(function() {
            alert("fail");
        });
    });
});