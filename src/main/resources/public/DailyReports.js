var dailyReportsApp = angular.module('DailyReportsApp',[]);

// 日報POST
dailyReportsApp.controller('AddReportCtrl', ['$scope', '$http', function($scope, $http) {

	var report = {};
	$scope.postReport = function(){
		report.subject = $scope.DailyReportPos.subject;
		report.body = $scope.DailyReportPos.body;
		report.writer = $scope.DailyReportPos.writer;
		report.published_at = $scope.DailyReportPos.published_at;
		$http({
			method : 'POST',
			url : 'http://localhost:8080/reports/',
			data : report
		}).success(function(data, header ,status) {
			console.log("1 REPORT INSERT: OK");
			location.reload();
		}).error(function(data, header ,status) {
			console.log("ERROR: REPORT INSERT");
			alert("Error!! Please try again later.");
		});
	}
}]);

// 全件表示
dailyReportsApp.controller('DaliyReportsCtrl', ['$scope', '$http', function($scope, $http) {

	$http.get('http://localhost:8080/reports/').
	success(function(data, header ,status) {
		$scope.DailyReportRes = data;
	});
}]);
