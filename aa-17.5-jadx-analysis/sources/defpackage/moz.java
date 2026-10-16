package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class moz implements lhg {
    public static final yph a = yph.c("GH.PhoneStateMonitor");
    private final BroadcastReceiver b = new moy();

    @Override // defpackage.lhg
    public final void c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        dup.e(mki.a.c, this.b, intentFilter, null, 2);
    }

    @Override // defpackage.lhg
    public final void d() {
        mki.a.c.unregisterReceiver(this.b);
    }
}
