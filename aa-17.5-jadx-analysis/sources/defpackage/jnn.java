package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

/* loaded from: classes.dex */
final class jnn implements ServiceConnection {
    final /* synthetic */ Handler a;
    final /* synthetic */ zhc b;

    public jnn(Handler handler, zhc zhcVar) {
        this.a = handler;
        this.b = zhcVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.post(new jnm(iBinder, this.b));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((ype) ((ype) jnp.a.g()).ai((char) 2413)).u("onServiceDisconnected for CarChimeraService in Gearhead");
    }
}
