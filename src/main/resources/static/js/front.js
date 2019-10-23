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

            return responseAll;
        };
    return{
        airportByName:blueprintsA
    }
})();