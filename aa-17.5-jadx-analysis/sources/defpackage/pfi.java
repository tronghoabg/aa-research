package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class pfi {
    public static final yph a = yph.c("GH.WifiPreflight");
    public final Context b;
    public final boolean c;
    final Handler d = new Handler(Looper.getMainLooper());
    final Runnable e;
    public boolean f;

    public pfi(aaem aaemVar) {
        this.b = (Context) aaemVar.b;
        boolean z = aaemVar.a;
        this.c = z;
        ((ype) a.l().ai((char) 6449)).y("isGearheadUpToDate:%b", Boolean.valueOf(z));
        this.e = new pct(this, 11);
    }

    public static void c(pag pagVar) {
        ((ype) a.l().ai((char) 6455)).y("Handling: %s", pagVar);
    }

    public final Intent a() {
        Intent className = new Intent().setClassName(this.b, "com.google.android.apps.auto.components.frx.phonescreen.TapHeadUnitActivity");
        className.setFlags(268435456);
        return className;
    }

    public final void b(boolean z) {
        ((ype) ((ype) a.f()).ai((char) 6451)).u("Sending Close Broadcast");
        this.d.removeCallbacks(this.e);
        Intent intent = new Intent("com.google.android.apps.auto.components.frx.phonescreen.WirelessFrxPhonescreenBottomSheetActivity.CLOSE");
        intent.setPackage("com.google.android.projection.gearhead");
        intent.putExtra("com.google.android.apps.auto.components.frx.phonescreen.WirelessFrxPhonescreenBottomSheetActivity.PROJECTION_STARTED", z);
        this.b.sendBroadcast(intent);
    }

    public final void d(Intent intent) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.b;
        if (i <= 29) {
            context.startActivity(intent, luk.c());
            return;
        }
        try {
            context.startActivity(intent, luk.c());
        } catch (NullPointerException unused) {
            ((ype) ((ype) a.h()).ai((char) 6456)).u("Exception launching TapHeadUnitActivity: allowing wireless to continue.");
        }
    }
}
