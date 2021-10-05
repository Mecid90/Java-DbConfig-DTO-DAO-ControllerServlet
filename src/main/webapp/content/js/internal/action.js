$( function () {

    $('#prsBtnId').click(function () {

        $.ajax({
            url:'cnt?action=userList',
            type:'get',
            contentType:'html',
            success:function (data) {

                $('#userRows').html(data);

            }
        })


    })

    $('#depBtnId').click(function () {

        $.ajax({
            url:'cnt?action=depList',
            type:'get',
            contentType:'html',
            success:function (data) {

                $('#depRows').html(data);

            }
        })


    })

    $('#addUserId').click(function () {

      $('#add-user-dialog-form').load('pages/dialog/addUser.html', function () {

          $('#add-user-dialog-form').dialog('open');

      })
    })


})

function addUser() {

    var name = $('#name').val();
    var email = $('#email').val();

    $.ajax({
        url:'cnt?action=addUser',
        type:'post',
        data:'name='+name+"&email="+email,
        success:function () {
            alert('Department elave edildi');
        }
    })
}