var exec = require('cordova/exec');

exports.startConversationList = function (arg0, success, error) {
    exec(success, error, 'RongIMKit', 'startConversationList', [arg0]);
};

exports.startOneConversation = function (arg0, success, error) {
    exec(success, error, 'RongIMKit', 'startOneConversation', [arg0]);
};

exports.startManyConversation = function (arg0, success, error) {
    exec(success, error, 'RongIMKit', 'startManyConversation', [arg0]);
};
