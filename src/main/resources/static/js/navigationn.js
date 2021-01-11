
let jSonObject;
let test;

function myFunction() {
    // document.getElementById("field2").value = document.getElementById("field1").value;
    // window.location.replace="http://localhost:63342/LangLearning/static/html/SentencesAfterClick.html?_ijt=a3mal94mo59tfj7o2qf9gc2iq3.com"

    //aici incepe user input take
    let userInput=document.getElementById("field1").value;
    console.log(userInput);
    //aici se sfarseste user input take




    var xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {

            test=JSON.parse(this.responseText);



            document.getElementById("koWord").innerHTML = test.koword;
            document.getElementById("secondS").innerHTML=test.kosecondSentence;
            document.getElementById("thirdS").innerHTML=test.kothirdSentence;
            document.getElementById("engWord").innerHTML=test.kowordTranslation;
            document.getElementById("firstS").innerHTML = test.korfirstSentence;


            console.log(test);

            var test1= "남자";
            var test2= "이에요";

            // document.getElementById("firstS").innerHTML=test1;
            document.getElementById("test12").innerHTML=test2;






        }
    };


    xhttp.open("GET", "http://localhost:8080/words/showSentences?word="  + userInput, true);
    xhttp.send();



//document.getElementById("test").value= 'sss';

// de aici in jos e loading ul




}

