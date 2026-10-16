package com.waze.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.messaging.z;
import com.waze.FreeMapAppActivity;
import com.waze.R;
import com.waze.utils.DismissNotificationActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f33426a = new HashMap();

    public static void a(Context context, NotificationCompat.Builder builder, g gVar) {
        NotificationsActionsBuilder$FeedbackActions notificationsActionsBuilder$FeedbackActions;
        String strL = gVar.l();
        d(context, builder, gVar.k(), gVar.a());
        if (!gVar.x() || TextUtils.isEmpty(strL) || (notificationsActionsBuilder$FeedbackActions = (NotificationsActionsBuilder$FeedbackActions) new com.google.l.d().f(strL, NotificationsActionsBuilder$FeedbackActions.class)) == null) {
            return;
        }
        e(context, builder, notificationsActionsBuilder$FeedbackActions.option1, gVar);
        e(context, builder, notificationsActionsBuilder$FeedbackActions.option2, gVar);
    }

    public static boolean b(Context context, NotificationCompat.Builder builder, String str, String str2, z zVar) {
        Intent intent;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        d(context, builder, str2, zVar);
        try {
            JSONObject jSONObject = new JSONObject(str);
            ArrayList<JSONObject> arrayList = new ArrayList();
            if (jSONObject.has("option0")) {
                arrayList.add(jSONObject.getJSONObject("option0"));
            }
            if (jSONObject.has("option1")) {
                arrayList.add(jSONObject.getJSONObject("option1"));
            }
            if (arrayList.size() > 0) {
                for (JSONObject jSONObject2 : arrayList) {
                    String strC = c(jSONObject2, "waze_url");
                    String strC2 = c(jSONObject2, "text");
                    String strC3 = c(jSONObject2, "image_url");
                    String strC4 = c(jSONObject2, TtmlNode.ATTR_ID);
                    Map map = f33426a;
                    if (map.isEmpty()) {
                        Integer numValueOf = Integer.valueOf(R.drawable.push_icon_dismiss);
                        map.put("image1", numValueOf);
                        map.put("map", Integer.valueOf(R.drawable.push_icon_navigate));
                        map.put(NotificationCompat.CATEGORY_ALARM, Integer.valueOf(R.drawable.push_icon_later));
                        map.put("Bell", Integer.valueOf(R.drawable.push_icon_bell));
                        map.put("Wheel", Integer.valueOf(R.drawable.push_icon_settings));
                        map.put("Block", numValueOf);
                        map.put("Info", Integer.valueOf(R.drawable.push_icon_info));
                    }
                    int iIntValue = map.containsKey(strC3) ? ((Integer) map.get(strC3)).intValue() : 0;
                    if ("NONE".contentEquals(strC)) {
                        intent = new Intent(context, (Class<?>) DismissNotificationActivity.class);
                        intent.setFlags(268468224);
                        intent.putExtra("NOTIFICATION_ID", 2);
                    } else {
                        intent = new Intent(context, (Class<?>) FreeMapAppActivity.class);
                    }
                    intent.setAction(strC4);
                    if (strC4 != null) {
                        intent.putExtra("ButtonName", strC4);
                    }
                    if (str2 != null) {
                        intent.putExtra("NotificationType", str2);
                    }
                    intent.setData(Uri.parse(strC));
                    builder.addAction(iIntValue, strC2, PendingIntent.getActivity(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 301989888 : 268435456));
                }
                return true;
            }
        } catch (JSONException e2) {
            Log.e("ActionsBuilder", "Unable to parse push action json: ".concat(String.valueOf(e2.getMessage())));
        }
        return false;
    }

    private static String c(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    private static void d(Context context, NotificationCompat.Builder builder, String str, z zVar) {
        Intent intent = new Intent(context, (Class<?>) DeleteNotificationReceiver.class);
        intent.putExtra("NotificationType", str);
        intent.putExtra("RemoteMessage", zVar);
        builder.setDeleteIntent(PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 335544320 : 268435456));
    }

    private static void e(Context context, NotificationCompat.Builder builder, NotificationsActionsBuilder$FeedbackAction notificationsActionsBuilder$FeedbackAction, g gVar) {
        String str;
        String str2;
        if (notificationsActionsBuilder$FeedbackAction == null || (str = notificationsActionsBuilder$FeedbackAction.id) == null || (str2 = notificationsActionsBuilder$FeedbackAction.text) == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) FeedbackBroadcastReceiver.class);
        intent.setAction(str);
        intent.putExtra("ButtonName", str);
        intent.putExtra("RemoteMessage", gVar.a());
        builder.addAction(0, str2, PendingIntent.getBroadcast(context, 0, intent, 335544320));
    }
}
