mainApp.service("customerManagerService", function( $http, $q ) {
        // Return public API.
        return({
            addCustomer: addCustomer,
            getAllCustomer: getAllCustomer
//            removeCustomer: removeCustomer
        });
        // ---
        // PUBLIC METHODS.
        // ---
        // I add a customer with the given name to the remote collection.
        function addCustomer( customer ) {
            var request = $http({
                method: "post",
                url: "/AngularBank/bankManager",
                params: {
                	customer: customer,
                	action: "addCustomer"
                }
//                data: {
//                	customer: customer
//                }
            });
            return( request.then( handleSuccess, handleError ) );
        }
        
        // I get all of the customer in the remote collection.
        function getAllCustomer() {
            var request = $http({
                method: "get",
                url: "/AngularBank/bankManager",
                params: {
                	action: "getAllCustomer"
                }
            });
            //return( request.then( handleSuccess, handleError ) );
            return request;
        }
        
        // I remove the customer with the given ID from the remote collection.
//        function removeCustomer( id ) {
//            var request = $http({
//                method: "delete",
//                url: "/AngularBank/addCustomer",
//                params: {
//                    action: "delete"
//                },
//                data: {
//                    id: id
//                }
//            });
//            return( request.then( handleSuccess, handleError ) );
//        }
        // ---
        // PRIVATE METHODS.
        // ---
        // I transform the error response, unwrapping the application dta from
        // the API response payload.
        function handleError( response ) {
            // The API response from the server should be returned in a
            // nomralized format. However, if the request was not handled by the
            // server (or what not handles properly - ex. server error), then we
            // may have to normalize it on our end, as best we can.
            if (
                ! angular.isObject( response.data ) ||
                ! response.data.message
            ) {
                return( $q.reject( "An unknown error occurred." ) );
            }
            // Otherwise, use expected error message.
            return( $q.reject( response.data.message ) );
        }
        // I transform the successful response, unwrapping the application data
        // from the API response payload.
        function handleSuccess( response ) {
            return( response.data );
        }
    }
);