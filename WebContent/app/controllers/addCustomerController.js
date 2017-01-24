mainApp.controller('addCustomerController', function($scope, $http, customerManagerService) {

	// add customer
    $scope.addCustomer = function() {
        customerManagerService.addCustomer( $scope.customer);
        $scope.customers = [];  
    };
    
    // get all customer
    $scope.getAllCustomer = function() {
        $scope.customers = customerManagerService.getAllCustomer();
        //$scope.customers = response.data;
    };
})
