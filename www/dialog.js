var cordova = require('cordova');  
  
var AlertDialog = function() {};  
  
AlertDialog.prototype.showDialog = function(jsonObject) {  
    cordova.exec(null, null, "AlertDialog", "showDialog", [jsonObject]);
};  
  
var alertDialog = new AlertDialog();  
module.exports = alertDialog;  