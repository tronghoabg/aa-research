package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.provider.Settings;

/* loaded from: classes.dex */
public final class nte extends eqj {
    private final BroadcastReceiver a = new ntd(this);
    private final Context h;

    public nte(Context context) {
        this.h = context;
    }

    public final void a(Context context) {
        m(Boolean.valueOf(Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 1));
    }

    @Override // defpackage.eqj
    protected final void c() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.AIRPLANE_MODE");
        Context context = this.h;
        dup.e(context, this.a, intentFilter, null, 2);
        a(context);
    }

    @Override // defpackage.eqj
    protected final void d() {
        this.h.unregisterReceiver(this.a);
    }
}
