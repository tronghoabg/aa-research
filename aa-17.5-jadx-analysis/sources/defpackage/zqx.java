package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes3.dex */
public final class zqx extends BroadcastReceiver {
    final /* synthetic */ zqy a;
    private volatile boolean b;

    public zqx(zqy zqyVar) {
        this.a = zqyVar;
    }

    public final void a(Context context) {
        zrt.a.a();
        this.b = true;
        context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (zrf.b(context) && this.b) {
            zqy zqyVar = this.a;
            zqyVar.j.b(zqyVar);
            context.unregisterReceiver(this);
            this.b = false;
        }
    }
}
