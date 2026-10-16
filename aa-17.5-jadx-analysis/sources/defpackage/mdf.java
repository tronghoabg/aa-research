package defpackage;

import android.content.Context;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class mdf implements lhg {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.BatteryMonitor");
    private final Context c;
    private final mde d = new mde();
    private boolean e;

    public mdf(Context context) {
        this.c = context;
    }

    @Override // defpackage.lhg
    public final void c() {
        if (this.e) {
            ((ype) ((ype) b.h()).ai((char) 4779)).u("Already started, ignoring.");
            return;
        }
        mde mdeVar = this.d;
        Context context = this.c;
        mde.c(context);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        dup.e(context, mdeVar, intentFilter, null, 2);
        this.e = true;
    }

    @Override // defpackage.lhg
    public final void d() {
        if (this.e) {
            this.c.unregisterReceiver(this.d);
            this.e = false;
        }
    }
}
