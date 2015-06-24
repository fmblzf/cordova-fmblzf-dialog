package com.fmblzf.plugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

public class DialogPlugin extends CordovaPlugin {

	@Override
	public boolean execute(String action, JSONArray args,
			CallbackContext callbackContext) throws JSONException {
		// TODO Auto-generated method stub
		JSONObject jsonObject = args.getJSONObject(0);
		if ("showDialog".equals(action)) {
			this.showDialog(jsonObject.getString("title"),jsonObject.getString("message"));
			callbackContext.success();
			return true;
		} else {
			callbackContext.error("not invail function!");
			return false;
		}
	}

	private void showDialog(String title, String message) {
		CordovaInterface cordova = this.cordova;
		Dialog dialog = new AlertDialog.Builder(cordova.getActivity())
				.setTitle(title).setMessage(message)
				.setPositiveButton("确定", new OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						dialog.dismiss();
					}
				})
				.setNegativeButton("取消", new OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						dialog.dismiss();
					}
				})
				.create();
		dialog.show();
	}
}
