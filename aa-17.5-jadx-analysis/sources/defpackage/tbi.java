package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class tbi extends eqj {
    private final Context a;
    private final IntentFilter h;
    private final BroadcastReceiver i = new tbh(this);

    public tbi(Context context, IntentFilter intentFilter) {
        this.a = context.getApplicationContext();
        this.h = intentFilter;
    }

    @Override // defpackage.eqj
    protected final void c() {
        this.a.registerReceiver(this.i, this.h);
    }

    @Override // defpackage.eqj
    protected final void d() {
        this.a.unregisterReceiver(this.i);
    }
}
