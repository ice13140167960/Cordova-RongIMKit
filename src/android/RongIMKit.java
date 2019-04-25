package com.ice.plugin.rongimkit;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.ice.plugin.rongimkit.RongCloudKitUtils;

/**
 * This class echoes a string called from JavaScript.
 */
public class RongIMKit extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("startConversationList")) {
            String token=args.getString(0);
            RongCloudKitUtils.startConversationList(cordova.getActivity(), token);
            return true;
        }else if(action.equals("startOneConversation")){
            JSONObject jsonObject= args.getJSONObject(0);
            RongCloudKitUtils.startOneConversation(cordova.getActivity(),jsonObject.getString("token") ,
             jsonObject.getString("targetId"),
              jsonObject.getString("userName"));
        }else if(action.equals("startManyConversation")){
            JSONObject jsonObject= args.getJSONObject(0);
            RongCloudKitUtils.startManyConversation(cordova.getActivity(), jsonObject.getString("token"),
             jsonObject.getString("targetId"),
            jsonObject.getString("userName"));
        }
        return false;
    }

}
