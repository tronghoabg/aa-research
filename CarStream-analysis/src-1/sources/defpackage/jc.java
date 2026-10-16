package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class jc extends BroadcastReceiver {
    public static final String b = xc.b("PRQ3tTfqVoxn7WUOeLNwwWO3");
    public static final String c = xc.b("PRQ3tTfqVoxn7WUOeLNw3HusRNIH");
    public static final AtomicInteger d = new AtomicInteger();
    public boolean a;

    public final void a(ContextWrapper contextWrapper) {
        if (this.a) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(b);
        intentFilter.addAction(c);
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                contextWrapper.registerReceiver(this, intentFilter, 2);
            } else {
                contextWrapper.registerReceiver(this, intentFilter);
            }
            this.a = true;
            d.incrementAndGet();
        } catch (Exception e) {
            String.valueOf(e);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("data");
        if (stringExtra == null) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        int i = w7.a;
        ArrayList arrayList = new ArrayList();
        for (String[] strArr : w7.m) {
            String str = strArr[3];
            if (str != null && !str.isEmpty() && !arrayList.contains(strArr[3])) {
                arrayList.add(strArr[3]);
            }
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            try {
                packageManager.getPackageInfo((String) obj, 0);
                if (!b.equals(intent.getAction()) || w7.k) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(stringExtra);
                    w7.a = (!jSONObject.has("speedLimit") || jSONObject.isNull("speedLimit")) ? -1 : jSONObject.optInt("speedLimit", -1);
                    jSONObject.optInt("minSpeedLimit", -1);
                    w7.b = jSONObject.optBoolean("overSpeed", false);
                    w7.c = jSONObject.optString("roadName", w7.c);
                    w7.d = jSONObject.optString("roadAddress", w7.d);
                    jSONObject.optBoolean("hudConnected", false);
                    Object objOpt = jSONObject.opt("upcomingAlerts");
                    String string = "[]";
                    String string2 = (objOpt == null || objOpt == JSONObject.NULL) ? "[]" : objOpt.toString();
                    if (!string2.equals(w7.f)) {
                        w7.r = SystemClock.elapsedRealtime();
                    }
                    w7.f = string2;
                    Object objOpt2 = jSONObject.opt("stickyAlerts");
                    if (objOpt2 != null && objOpt2 != JSONObject.NULL) {
                        string = objOpt2.toString();
                    }
                    w7.g = string;
                    w7.e = System.currentTimeMillis();
                    w7.h++;
                    w7.f();
                    return;
                } catch (Exception e) {
                    String.valueOf(e);
                    return;
                }
            } catch (Throwable unused) {
            }
        }
    }
}
