var app = angular.module('phoneapp',  ['angularUtils.directives.dirPagination']);
app.controller('personCtrl', function($scope,$http) {
     
    $scope.toggle = function() {
	 
	
        $http.get('/phonedemo/pant/' + $scope.phoneNum )
	
     .success(function(response){$scope.details = response;});
           
           var lines = $scope.details;
           var removecomma = lines.substring(0,lines.length - 1); 
           var arr = removecomma.split(',')
           $scope.count=arr.length;
           $scope.fillarr = arr;
          
    }
});

