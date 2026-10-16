package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* loaded from: classes.dex */
final class jyt implements epf {
    private final Context a;
    private final BroadcastReceiver b;
    private final ept c;

    public jyt(Context context, BroadcastReceiver broadcastReceiver, ept eptVar) {
        this.a = context;
        this.b = broadcastReceiver;
        this.c = eptVar;
    }

    @Override // defpackage.epf
    public final void fL(eqa eqaVar) {
        this.a.unregisterReceiver(this.b);
        this.c.d(this);
    }

    @Override // defpackage.epf
    public final void fy(eqa eqaVar) {
        dup.e(this.a, this.b, new IntentFilter("androidx.car.app.action.CarAppNotificationAction"), null, true != acob.aa() ? 2 : 4);
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fM() {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fv(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fw(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fx(eqa eqaVar) {
    }
}
