var module =(function(){
    var responseAll = null;
    var blueprintsA = function(ciudad){
        var allBlueprints = $.get("/airports/"+ciudad);
        allBlueprints.then(
            function (data) {
                responseAll = data;
                alert(data);
            },
            function () {
                alert("$.get failed!");
            }
            );
            if(responseAll != null){
                responseAll.map(function(actual){
                                    console.log("Code: "+actual.getCode());
                                    console.log("Name: "+actual.getName());
                                    console.log("City: "+actual.getCity());
                                    console.log("CodeCountry: "+actual.getCountryCode());
                                })
            }

            return responseAll;
        };
    return{
        airportByName:blueprintsA
    }
})();