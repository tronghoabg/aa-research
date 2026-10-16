package defpackage;

import android.app.ActivityManager;
import android.util.Log;

/* loaded from: classes3.dex */
public final class wyi extends Thread {
    final /* synthetic */ wyj a;

    public wyi(wyj wyjVar) {
        this.a = wyjVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z;
        if (omc.c("CAR.SERVICE", 3)) {
            Log.d("CAR.SERVICE", "starting device capability check");
        }
        wyj wyjVar = this.a;
        wyjVar.a(yzy.tm);
        ActivityManager activityManager = (ActivityManager) wyjVar.a.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        if (memoryInfo.totalMem < 891289600) {
            Log.w("CAR.SERVICE", "Not supported: total mem " + memoryInfo.totalMem + " is lower than minimum 891289600");
            wyjVar.a(yzy.to);
            z = false;
        } else {
            wyjVar.a(yzy.tn);
            z = true;
        }
        if (omc.c("CAR.SERVICE", 4)) {
            Log.i("CAR.SERVICE", a.bR(z, "check device capability result "));
        }
        ykd ykdVar = wyjVar.c;
        kmu.b().c("device_check_completed", true);
        kmu.b().c("device_supported", z);
        if (z) {
            ((sej) ykdVar.a).b.f("EVENT_CAPABILITY_CHECK_SUPPORTED", null);
        } else {
            ((sej) ykdVar.a).b.f("EVENT_CAPABILITY_CHECK_UNSUPPORTED", null);
        }
    }
}
