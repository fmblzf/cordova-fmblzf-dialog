$scope.showDialog = function(){
            AlertDialog.showDialog({
                title: 'Ionic测试插件',
                message: '本地插件加载到测试是否成功？？？',
                confirm:'确定',
                cancel:'取消'
            });
        };