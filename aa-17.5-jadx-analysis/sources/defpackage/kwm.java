package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class kwm {
    static BroadcastReceiver a;
    private static final yph b = yph.c("GH.CrashGenerator");

    public static synchronized void a(Context context, jrl jrlVar) {
        if (jrlVar.name().toLowerCase(Locale.US).equals(acpi.c().toLowerCase(Locale.US))) {
            yph yphVar = b;
            ((ype) ((ype) yphVar.f()).ai((char) 3424)).y("Registering crash receiver for %s process", jrlVar.name());
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.projection.gearhead.FORCE_CRASH");
            if (a != null) {
                ((ype) yphVar.l().ai((char) 3425)).u("Unregistering old receiver");
                BroadcastReceiver broadcastReceiver = a;
                broadcastReceiver.getClass();
                context.unregisterReceiver(broadcastReceiver);
            }
            a = new kwl();
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(a, intentFilter, 2);
            } else {
                context.registerReceiver(a, intentFilter);
            }
        }
    }
}
