
/* app.controller("AppCtrl", function($scope, $http){
        $scope.websites = [];

 /*   $scope.websites = [{
        iconImageUrl: '',
        id: 'stackoverflow',
        website: 'stackoverflow.com',
        title: 'Stackoverflow website',
        description: 'StackOverflow description'
    }];

    /*set the address -http://localhost:8090/api/stackoverflow-
    then called success function and function from server with data*/
/*   $http.get('http://localhost:8090/api/stackoverflow')
        .success(function(data) {
        /*set that website equals data from server*/
 /*     $scope.websites=response.data;
});*/
 /*   var app = angular.module("springdemo", []);
    app.controller("AppCtrl", function($scope, $http){
        $http.get('http://localhost:8090/api/stackoverflow')
            .success(function(data){
                console.log('success', data);
                $scope.websites=data;
            })
            .error(function (result) {
                console.log('error');
            })

*/
 /*
var app = angular.module("springdemo", []);
app.controller("AppCtrl", function($scope, $http){
    $scope.websites = [];
    $http({
        method: 'get',
        url: 'http://localhost:8090/api/stackoverflow'
    }).then(function(data){
        console.log('success', data);
        $scope.websites=data;
    }, function (error) {
        console.log(error, 'can not get data.');
    });
});

*/

var app = angular.module("springdemo", []);
app.controller("AppCtrl", function($scope, $http){
    $http.get('http://localhost:8090/api/stackoverflow')
        .then(function (response) {
            $scope.websites=response.data;
    });
});
