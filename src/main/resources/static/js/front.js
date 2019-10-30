var module =(function(){
    var responseAll = null;
    var blueprintsA = function(ciudad){
        var allBlueprints = $.get("/airports/"+ciudad);
        allBlueprints.then(
            function (data) {
                responseAll = data;

                if(responseAll != null){
                    map.plotMarkers(responseAll)
                    $("#datos tbody").empty();
                    responseAll.map(function(actual){

                        $("#datos tbody").append(
                            "<tr>"+
                            "<td>"+ actual.airportId + "</td>" +
                            "<td>"+ actual.name+ "</td>" +
                            "<td>"+ actual.city+ "</td>" +
                            "<td>"+ actual.countryCode+ "</td>" +
                            "</tr>"
                        );
                    })
                    //alert(data)
                }

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