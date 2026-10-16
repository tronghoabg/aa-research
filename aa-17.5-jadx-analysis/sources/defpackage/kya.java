package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;

/* loaded from: classes2.dex */
public final class kya implements lhg {
    public static final yph a = yph.c("GH.DebugQuerySender");
    BroadcastReceiver b;
    private final Context c;

    public kya(Context context) {
        this.c = context;
    }

    @Override // defpackage.lhg
    public final void c() {
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 3528)).u("Registering debug query receiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.projection.gearhead.DEBUG_DIRECT_QUERY");
        BroadcastReceiver broadcastReceiver = this.b;
        if (broadcastReceiver != null) {
            this.c.unregisterReceiver(broadcastReceiver);
            ((ype) yphVar.l().ai((char) 3529)).u("Unregistering old receiver");
        }
        this.b = new kxz();
        int i = Build.VERSION.SDK_INT;
        Context context = this.c;
        if (i >= 33) {
            context.registerReceiver(this.b, intentFilter, 2);
        } else {
            context.registerReceiver(this.b, intentFilter);
        }
    }

    @Override // defpackage.lhg
    public final void d() {
        BroadcastReceiver broadcastReceiver = this.b;
        if (broadcastReceiver != null) {
            this.c.unregisterReceiver(broadcastReceiver);
            ((ype) ((ype) a.f()).ai((char) 3530)).u("Unregistering debug query receiver");
            this.b = null;
        }
    }
}
