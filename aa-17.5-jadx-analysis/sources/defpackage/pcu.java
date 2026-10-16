package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class pcu extends BroadcastReceiver {
    public final /* synthetic */ pcv a;

    public pcu(pcv pcvVar) {
        this.a = pcvVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        pct pctVar = new pct(this, 0);
        pcv pcvVar = this.a;
        pcvVar.m.postDelayed(pctVar, 60000L);
        pcvVar.n.post(new oey(this, intent, pctVar, 11));
    }
}
