package com.ice.plugin.rongimkit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.ice.rongcloudlibrary.IndexActivity;

public class RongCloudKitUtils {

    public static void startConversationList(Context context, String token){
        Intent intent=new Intent(context,IndexActivity.class);
        Bundle bundle=new Bundle();
        bundle.putString("token",token);
        bundle.putInt("type",0);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    public static void startOneConversation(Context context, String token,String targetId,String userName){
        Intent intent=new Intent(context,IndexActivity.class);
        Bundle bundle=new Bundle();
        bundle.putString("token",token);
        bundle.putInt("type",1);
        bundle.putString("targetId",targetId);
        bundle.putString("userName",userName);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    public static void startManyConversation(Context context, String token,String targetId,String userName){
        Intent intent=new Intent(context,IndexActivity.class);
        Bundle bundle=new Bundle();
        bundle.putString("token",token);
        bundle.putInt("type",2);
        bundle.putString("targetId",targetId);
        bundle.putString("userName",userName);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }
}
