$(document).ready(function () {
  var div = document.getElementById('cub');
  div.className = 'css-standard';
  var selectId = $('#cub');

  $('#green').click(function () {
    var param1 = document.getElementById('param1').value;
    var param2 = document.getElementById('param2').value;
    var flag = 'true';
    $.ajax({
      url: '/result?param1=' + param1 + '&param2=' + param2 + '&flag=' + flag,
      type: "GET",
      dataType: 'JSON',
      data: {},
      success: function (data) {
        if (data > 0) {
          for (var i = 0; i < data; i++) {
            if (div.className === 'css-standard') {
              selectId.fadeOut(500);
              div.className = 'css_plus';
              selectId.fadeIn(500);

              console.log(div.className);
            }
            div.className = 'css-standard';
          }
        } else {
          alert('result cannot be null or negative');
        }
        div.className = 'css-standard';
        alert(data);
      }
    })

  })

});

