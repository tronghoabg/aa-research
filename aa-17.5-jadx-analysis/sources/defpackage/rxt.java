package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
final class rxt extends rht {
    final /* synthetic */ rxu a;

    public rxt(rxu rxuVar) {
        this.a = rxuVar;
    }

    @Override // defpackage.rht
    public final void a(Intent intent) {
        if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
            this.a.g(rxu.h(intent));
        }
    }
}
