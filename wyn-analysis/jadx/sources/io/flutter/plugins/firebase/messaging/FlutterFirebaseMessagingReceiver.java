package io.flutter.plugins.firebase.messaging;

import W9.t;
import Y9.c;
import Yc.h;
import Yc.o;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import ka.AbstractC3230e0;
import org.json.JSONObject;
import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public class FlutterFirebaseMessagingReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f37176a = new HashMap();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        boolean z2;
        Log.d("FLTFireMsgReceiver", "broadcast received for message");
        if (AbstractC3230e0.f39408h == null) {
            Context applicationContext = context.getApplicationContext() != null ? context.getApplicationContext() : context;
            Log.d("FLTFireContextHolder", "received application context.");
            AbstractC3230e0.f39408h = applicationContext;
        }
        if (intent.getExtras() == null) {
            Log.d("FLTFireMsgReceiver", "broadcast received but intent contained no extras to process RemoteMessage. Operation cancelled.");
            return;
        }
        t tVar = new t(intent.getExtras());
        if (tVar.X() != null) {
            f37176a.put(tVar.W(), tVar);
            c cVarH = c.h();
            cVarH.getClass();
            cVarH.i().edit().putString(tVar.W(), new JSONObject(AbstractC3772b.N(tVar)).toString()).apply();
            StringBuilder sbJ = N0.a.j(cVarH.i().getString("notification_ids", ""));
            sbJ.append(tVar.W());
            sbJ.append(",");
            String string = sbJ.toString();
            ArrayList arrayList = new ArrayList(Arrays.asList(string.split(",")));
            if (arrayList.size() > 100) {
                String str = (String) arrayList.get(0);
                cVarH.i().edit().remove(str).apply();
                string = string.replace(str + ",", "");
            }
            cVarH.i().edit().putString("notification_ids", string).apply();
        }
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if ((keyguardManager == null || !keyguardManager.isKeyguardLocked()) && (activityManager = (ActivityManager) context.getSystemService("activity")) != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                    if (h.f16770l == null) {
                        h.f16770l = new h();
                    }
                    h.f16770l.h(tVar);
                    return;
                }
            }
        }
        Intent intent2 = new Intent(context, (Class<?>) FlutterFirebaseMessagingBackgroundService.class);
        Parcel parcelObtain = Parcel.obtain();
        tVar.writeToParcel(parcelObtain, 0);
        intent2.putExtra("notification", parcelObtain.marshall());
        Bundle bundle = tVar.f15385a;
        String string2 = bundle.getString("google.original_priority");
        if (string2 == null) {
            string2 = bundle.getString("google.priority");
        }
        if ("high".equals(string2)) {
            z2 = true;
        } else {
            "normal".equals(string2);
            z2 = false;
        }
        List list = FlutterFirebaseMessagingBackgroundService.f37174h;
        ComponentName componentName = new ComponentName(context, (Class<?>) FlutterFirebaseMessagingBackgroundService.class);
        synchronized (a.f37177f) {
            o oVarB = a.b(context, componentName, true, 2020, z2);
            oVarB.b(2020);
            try {
                oVarB.a(intent2);
            } catch (IllegalStateException e7) {
                if (!z2) {
                    throw e7;
                }
                a.b(context, componentName, true, 2020, false).a(intent2);
            }
        }
    }
}
