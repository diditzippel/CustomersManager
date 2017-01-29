mainApp.controller('addCustomerController', function($scope, $http, customerManagerService) {
	$scope.customers = [];
	
	// add customer
    $scope.addCustomer = function() {
        customerManagerService.addCustomer( $scope.customer); 
    };
    
    // get all customer
    $scope.getAllCustomer = function() {
        customerManagerService.getAllCustomer()
        .then(function(response) {
        	$scope.customers = response.data;
        });
    };
})
