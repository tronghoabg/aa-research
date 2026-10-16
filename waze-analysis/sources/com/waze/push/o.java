package com.waze.push;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import com.waze.mg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static final com.waze.shared_infra.i.e f33446a = com.waze.shared_infra.i.a.d("Push Service");

    public static synchronized String a(Context context) {
        SharedPreferences sharedPreferencesD = d(context);
        String string = sharedPreferencesD.getString("regId", "");
        com.waze.shared_infra.i.h.h("Requesting FCM Registration Token in prefs: ".concat(String.valueOf(string)));
        int i2 = sharedPreferencesD.getInt("appVersion", Integer.MIN_VALUE);
        int iA = com.waze.utils.p.a(context);
        if (i2 == Integer.MIN_VALUE || i2 == iA) {
            return string;
        }
        f33446a.a("FCM: App version changed from " + i2 + " to " + iA + "; resetting registration id");
        c(context, "");
        return "";
    }

    public static void b() {
        NotificationManager notificationManagerA;
        if (mg.a() == null || (notificationManagerA = com.waze.system.c.a()) == null) {
            return;
        }
        f33446a.a("Clearing current notifications");
        notificationManagerA.cancel("Push Notifications", 256);
    }

    public static synchronized void c(Context context, String str) {
        com.waze.shared_infra.i.h.h("Setting FCM Registration Token in prefs: ".concat(String.valueOf(str)));
        SharedPreferences sharedPreferencesD = d(context);
        sharedPreferencesD.getString("regId", "");
        sharedPreferencesD.edit().putString("regId", str).putInt("appVersion", com.waze.utils.p.a(context)).apply();
    }

    private static SharedPreferences d(Context context) {
        return context.getSharedPreferences("com.waze.push", 0);
    }
}
