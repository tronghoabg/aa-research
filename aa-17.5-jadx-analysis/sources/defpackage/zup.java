package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes3.dex */
final class zup extends BroadcastReceiver {
    private final zuq a;

    public zup(zuq zuqVar) {
        this.a = zuqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zuq zuqVar = this.a;
        if (zrf.b(zuqVar.a)) {
            synchronized (zuqVar) {
            }
        }
    }
}
