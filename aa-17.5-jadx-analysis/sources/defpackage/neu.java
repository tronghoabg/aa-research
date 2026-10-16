package defpackage;

import android.content.Context;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class neu extends eqj {
    private final aezr a = new aezy(new mkj(8));
    private final net h = new net(this);

    private final Context a() {
        Object objA = this.a.a();
        objA.getClass();
        return (Context) objA;
    }

    @Override // defpackage.eqj
    protected final void c() {
        a().registerReceiver(this.h, new IntentFilter("android.app.action.INTERRUPTION_FILTER_CHANGED"));
        nes nesVar = nev.a;
        Context contextA = a();
        int i = nes.b;
        m(Boolean.valueOf(nes.b(contextA)));
    }

    @Override // defpackage.eqj
    protected final void d() {
        a().unregisterReceiver(this.h);
    }
}
