angular.module('demo', [])
.controller('windowController', ['$scope', '$window', function($scope, $window) {

	$scope.greeting = 'Hello, World!';

	$scope.doGreeting = function(greeting) {
		$window.alert(greeting);
	};

	$scope.contacts = [{name: 'Georgios', surname: 'Stathis'},
	                   {name: 'Nadia', surname: 'Bianco'}];
}]);