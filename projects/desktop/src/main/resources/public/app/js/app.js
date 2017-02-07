/**
 *
 * @author Geppetto Generated Code</br>
 * Date Created: </br>
 * @since  </br>
   build:   </p>
 *
 * code was generated by the Geppetto System </br>
 * Geppetto system Copyright - NewPortBay LLC </br>
 * The generated code is free to use by anyone</p>
 *
 *
 *
*/

var app = angular.module('TestDEVPro', ['ngRoute','rzModule']);

   // configure our routes
   app.config(['$routeProvider','$httpProvider',function($routeProvider,$httpProvider) {
   $httpProvider.defaults.withCredentials = true;
       $routeProvider
            .when('/landing_page-en', {
                         templateUrl : 'app/views/en/landing_page-en.html'
                         ,allow:''
                     })

            .when('/app_level', {
                         controller: 'AplicationLevelCtrl', cache: false
                         ,template: ' ',
          			   allow:''
                     })

            .when('/Screen_24600-en', {
                         templateUrl : 'app/views/en/Screen_24600-en.html',
          controller: 'ibmdata_Default_Activity'
                         ,allow:'ROLE_USER'
                     })

            .when('/Screen_24600-de', {
                         templateUrl : 'app/views/de/Screen_24600-de.html',
          controller: 'ibmdata_Default_Activity'
                         ,allow:''
                     })


          .otherwise('app_level');

   }]).run(["$log","$rootScope", "$location", function($log,$rootScope, $location) {
	$rootScope.userData = {};
$rootScope.i = 0;
$rootScope.isLogIn = false;
				$rootScope.logout = function(){
					//console.log("*****-----logout---->>>data>>>"+angular.toJson($rootScope.userData));
					$rootScope.userData = {};
					console.log("*****-----logout------>>->>>data>>>"+angular.toJson($rootScope.userData));
					$location.url('/login')
				}
		$rootScope.serverRoleValidation = function(toStaterolesAllowList){
			var checkO = angular.equals({}, $rootScope.userData);
				console.log('checkO data =>',angular.toJson(checkO));
					if(!checkO){
				var frontRole = toStaterolesAllowList;
						if(!angular.equals({}, $rootScope.userData)){
						$rootScope.roleListOfCurrentUser = $rootScope.userData.authorities[$rootScope.i].authority;
								for(var uiRole= 0; uiRole< frontRole.length; uiRole++){
// verfying the ROLE_ADMIN is present in this var $rootScope.roleListOfCurrentUser
// 	$rootScope.roleListOfCurrentUser  if this has ROLE_ADMIN we give the permission to access the all pages
									if( $rootScope.roleListOfCurrentUser === "ROLE_ADMIN"){
										console.log('User ROLE_ADMIN can Access all the pages in the project');
										return true;
												}else{
													var testVar = frontRole.indexOf($rootScope.roleListOfCurrentUser) !== -1;
													console.log('testVar data =>',angular.toJson(testVar));
										if(testVar){
															console.log('test var true stituation');
																return true;
										}
								}
				}
			}
						console.log('return false data coming time executed');
						return false;
			}
					else{
					console.log('else stituation checkO data')
					return true;
			}
		};
						$rootScope.$on("$routeChangeStart", function (event,next, current) {
							var currentUrl = $location.path();
								if(currentUrl != "/accessDenied " && next.allow){
								console.log('data of current Url =>',next.allow);
								if (!$rootScope.serverRoleValidation(next.allow)) {
						console.log('serverRoleValidation data coming time');
						event.preventDefault();
						$location.url('/accessDenied');
				}
			}
			});
		}]);
