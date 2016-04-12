var dailyReportsApp = angular.module('DailyReportsApp',[]);

dailyReportsApp.controller('DaliyReportsCtrl', ['$scope', '$http', function($scope, $http) {
	
	var report = {};
	function reportInsert() {
		report.subject = $scope.ReportInsertForm.subject;
		report.body = $scope.ReportInsertForm.body;
		report.writer = $scope.ReportInsertForm.writer;
		report.published_at = $scope.ReportInsertForm.published_at;
				
		 $http({
					method : 'POST',
					url : 'http://localhost:8080/POST/reports/',
					data : report
				}).success(function(data, header, status) {
					console.log("1 REPORT INSERT: OK");
					location.reload();
				}).error(function(data, header, status) {
					console.log("ERROR: REPORT INSERT");
					alert("Error!! Please try again later.");
				});
			}
	
	
// $http.get('http://localhost:8080/POST/reports/').
// success(function(data, header ,status) {
//		$scope.ReportForm = data;
//	});
}]);