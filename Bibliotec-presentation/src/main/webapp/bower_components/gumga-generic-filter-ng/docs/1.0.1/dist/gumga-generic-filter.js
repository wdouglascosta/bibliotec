(function e(t,n,r){function s(o,u){if(!n[o]){if(!t[o]){var a=typeof require=="function"&&require;if(!u&&a)return a(o,!0);if(i)return i(o,!0);var f=new Error("Cannot find module '"+o+"'");throw f.code="MODULE_NOT_FOUND",f}var l=n[o]={exports:{}};t[o][0].call(l.exports,function(e){var n=t[o][1][e];return s(n?n:e)},l,l.exports,e,t,n,r)}return n[o].exports}var i=typeof require=="function"&&require;for(var o=0;o<r.length;o++)s(r[o]);return s})({1:[function(require,module,exports){
"use strict";!function(){function GenericFilter($filter){return function(value,type){if("valor"==value)return value;if("date"==type){var date=value.split("");return date.splice(2,0,"/"),date.splice(5,0,"/"),date.join("")}if("cpf"==type){var cpf=value.split("");return cpf.splice(3,0,"."),cpf.splice(7,0,"."),cpf.splice(11,0,"-"),cpf.join("")}if("cnpj"==type){var cnpj=value.split("");return cnpj.splice(2,0,"."),cnpj.splice(6,0,"."),cnpj.splice(10,0,"/"),cnpj.splice(15,0,"-"),cnpj.join("")}return value}}GenericFilter.$inject=["$filter"],angular.module("gumga.genericfilter",[]).filter("gumgaGenericFilter",GenericFilter)}();

},{}]},{},[1])
//# sourceMappingURL=gumga-generic-filter.js.map