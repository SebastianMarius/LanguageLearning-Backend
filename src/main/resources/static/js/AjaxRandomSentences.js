let jSonObiect

function ajaxEndpoint() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            document.getElementById("testPls").innerHTML = this.responseText;

            jSonObiect=JSON.parse(this.responseText);


            console.log(jSonObiect);
        }
    };






    xhttp.open("GET", "http://localhost:8080/words/randomSentenceBeginner", true);
    xhttp.send();


}