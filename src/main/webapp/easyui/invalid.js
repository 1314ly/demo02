
$.extend($.fn.validatebox.defaults.rules, {    
    equals: {   //校验两次密码相同 
        validator: function(value,param){    
            return value == $(param[0]).val();    
        },    
        message: '两次输入密码不一致'   
    } ,
    idcard: {// 验证身份证
        validator: function (value) {
            return /^\d{15}(\d{2}[A-Za-z0-9])?$/i.test(value);
        },
        message: '身份证号码格式不正确'
    },
    mobile: {// 验证手机号码
        validator: function (value) {
            return /^(13|15|18|16)\d{9}$/i.test(value);
        },
        message: '手机号码格式不正确'
    },
    username: {// 验证用户名
        validator: function (value) {
            return /^[a-zA-Z][a-z|A-Z|0-9|_]{4,15}$/i.test(value);
        },
        message: '用户名不合法（字母开头，允许5-16字节，允许字母数字下划线）'
    },
    name: {// 验证姓名，可以是中文或英文
        validator: function (value) {
            return /^[\Α-\￥]+$/i.test(value) | /^\w+[\w\s]+\w+$/i.test(value);
        },
        message: '请输入姓名'
    },
}); 
