function emailSendFeedbackTicket() {


        var Spineru= document.getElementById("incercam");
        Spineru.className="spinner";

        var changePls = document.getElementById("faInvizibil");

        // var changePls= document.getElementsByClassName("faInvizibilitate");
        changePls.id="faInvizibilPls";




        console.log(Spineru.className);

        var Body=document.getElementById("bodyBeforeOnClick");
        Body.id="bodyul";

        var footer=document.getElementById("invizibilTEROG");
        footer.id="faInvizibilPls";




        var xhttp = new XMLHttpRequest();

        xhttp.onreadystatechange = function () {
            if (this.readyState == 4 && this.status == 200) {
                document.getElementById("demo").innerHTML = this.responseText;
            }
        };

        var emailul=document.getElementById("email").value;
        var mesajul=document.getElementById("mesajul").value;

        // window.location.replace("");



              setTimeout(function(){
                  window.location.href = '../html/AFTERtickerAndFeedback.html';
                  }, 5000);



        console.log(emailul);
        console.log(mesajul);

        xhttp.open("GET", "http://localhost:8080/sendemail?email=" + emailul + "&textul=" +mesajul , true);
        xhttp.send();




}