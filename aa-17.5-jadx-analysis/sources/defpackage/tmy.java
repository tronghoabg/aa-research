package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class tmy extends BroadcastReceiver {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Context b;
    final /* synthetic */ zhc c;
    final /* synthetic */ zfj d;
    final /* synthetic */ Executor e;

    public tmy(AtomicBoolean atomicBoolean, Context context, zhc zhcVar, zfj zfjVar, Executor executor) {
        this.a = atomicBoolean;
        this.b = context;
        this.c = zhcVar;
        this.d = zfjVar;
        this.e = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a.compareAndSet(false, true)) {
            tmz.d(this.b, this);
            this.c.r(wub.ad(this.d, this.e));
        }
    }
}
