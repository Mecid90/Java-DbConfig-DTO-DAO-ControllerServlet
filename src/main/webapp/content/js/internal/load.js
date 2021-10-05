$( function () {
    $('#usersTable').DataTable();


    $('#add-user-dialog-form').dialog({
        autoOpen: false,
        height: 400,
        width: 350,
        modal: true,
        buttons: {
            "Emekdash Elave Et": addUser,
            Cancel: function() {
                $('#add-user-dialog-form').dialog( "close" );
            }
        },
        close: function() {
            $('#add-user-dialog-form').dialog("close")
        }
    });
})