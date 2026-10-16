package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class kpl extends BroadcastReceiver {
    public final /* synthetic */ kpn a;

    public kpl(kpn kpnVar) {
        this.a = kpnVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.x(new kea(this, 18));
    }
}
