var app = angular.module('gameEditorApp', ['ngRoute', 'ngAnimate']);

app.config(function($routeProvider) {
  $routeProvider
    .when('/game',
    {
      controller: 'GameController',
      templateUrl: 'app/views/game.html'
    })
    .when('/game/newobject', {
      controller: 'GameController',
      templateUrl: 'app/views/gameobject_add.html'
    })
    .when('/object/:id', {
      controller: 'GameObjectController',
      templateUrl: 'app/views/gameobject.html'
    })
    .when('/object/:id/modify', {
      controller: 'GameObjectController',
      templateUrl: 'app/views/gameobject_mod.html'
    })
    .otherwise({redirectTo: '/game'});
});