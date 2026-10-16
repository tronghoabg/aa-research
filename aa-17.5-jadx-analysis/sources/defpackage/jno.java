package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* loaded from: classes.dex */
final class jno implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ Intent b;
    final /* synthetic */ zhc c;
    final /* synthetic */ jnp d;

    public jno(jnp jnpVar, Context context, Intent intent, zhc zhcVar) {
        this.a = context;
        this.b = intent;
        this.c = zhcVar;
        this.d = jnpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.a;
        Intent intent = this.b;
        ServiceConnection serviceConnection = this.d.d;
        if (context.bindService(intent, serviceConnection, 65)) {
            return;
        }
        jnp.a(this.c, "Failed to bind to CarChimeraService in Gearhead.");
        context.unbindService(serviceConnection);
    }
}
