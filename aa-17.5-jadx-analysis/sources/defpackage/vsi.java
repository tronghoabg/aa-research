package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class vsi implements vsa {
    public final zgt a;
    public final ackk b;

    public vsi(wci wciVar, Context context, zgt zgtVar, ackk ackkVar, aezk aezkVar, aezk aezkVar2) {
        new AtomicBoolean(false);
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
        wciVar.d(zgtVar, ackkVar, aezkVar);
        this.a = zgtVar;
        this.b = ackkVar;
        wub.L(new plm(this, context, 12, null));
        wub.L(new vdv(aezkVar2, 8));
    }

    public final synchronized void a() {
    }

    @Override // defpackage.vsa
    public final void k() {
        wub.ab(new upk(this, 12), this.a);
    }
}
