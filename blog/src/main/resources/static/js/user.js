let index = {
    init: function() {
        $("#btn-save").on("click", () => {
            this.save();
        });
    },
    save: function() {
        alert('user11');

        let data = {
            username: $("#username").val(),
            password: $("#password").val(), // 수정된 부분
            email: $("#email").val() // 수정된 부분
        }

       // console.log(data);
       $.ajax().dong().fail(): // ajax 톻신 이용해서 3개의 데이터를 json으로 변경하여 insert 요청!!

    }
};

index.init();
