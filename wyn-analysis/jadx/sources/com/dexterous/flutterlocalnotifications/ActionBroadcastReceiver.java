package com.dexterous.flutterlocalnotifications;

import M.y;
import X0.N;
import a2.C1323c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.Keep;
import b7.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p;
import io.flutter.view.FlutterCallbackInformation;
import java.util.ArrayList;
import java.util.Map;
import lc.C3458b;
import oc.C3665d;
import uc.C4271h;
import uc.C4273j;

/* loaded from: classes3.dex */
public class ActionBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static Oc.d f26216b;

    /* renamed from: c, reason: collision with root package name */
    public static C3458b f26217c;

    /* renamed from: a, reason: collision with root package name */
    public p f26218a;

    @Keep
    public ActionBroadcastReceiver() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.dexterous.flutterlocalnotifications.ActionBroadcastReceiver.ACTION_TAPPED".equalsIgnoreCase(intent.getAction())) {
            p pVar = this.f26218a;
            if (pVar == null) {
                pVar = new p(context, 1);
            }
            this.f26218a = pVar;
            Map<String, Object> mapExtractNotificationResponseMap = FlutterLocalNotificationsPlugin.extractNotificationResponseMap(intent);
            if (intent.getBooleanExtra("cancelNotification", false)) {
                int iIntValue = ((Integer) mapExtractNotificationResponseMap.get("notificationId")).intValue();
                Object obj = mapExtractNotificationResponseMap.get("notificationTag");
                if (obj instanceof String) {
                    new N(context).b(iIntValue, (String) obj);
                } else {
                    new N(context).b(iIntValue, null);
                }
            }
            if (f26216b == null) {
                f26216b = new Oc.d(4);
            }
            Oc.d dVar = f26216b;
            C4271h c4271h = (C4271h) dVar.f8957c;
            if (c4271h != null) {
                c4271h.a(mapExtractNotificationResponseMap);
            } else {
                ((ArrayList) dVar.f8956b).add(mapExtractNotificationResponseMap);
            }
            if (f26217c != null) {
                Log.e("ActionBroadcastReceiver", "Engine is already initialised");
                return;
            }
            C3665d c3665d = (C3665d) k.z().f19396b;
            c3665d.c(context);
            c3665d.a(context, null);
            f26217c = new C3458b(context, null);
            FlutterCallbackInformation flutterCallbackInformationLookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(this.f26218a.f32386a.getSharedPreferences("flutter_local_notifications_plugin", 0).getLong("com.dexterous.flutterlocalnotifications.CALLBACK_DISPATCHER_HANDLE_KEY", -1L));
            if (flutterCallbackInformationLookupCallbackInformation == null) {
                Log.w("ActionBroadcastReceiver", "Callback information could not be retrieved");
                return;
            }
            mc.b bVar = f26217c.f40253c;
            new C4273j((C1323c) bVar.f40527f, "dexterous.com/flutter/local_notifications/actions").a(f26216b);
            bVar.c(new G9.e(context.getAssets(), (String) ((y) c3665d.f41476d).f7228c, flutterCallbackInformationLookupCallbackInformation, 29));
        }
    }
}
