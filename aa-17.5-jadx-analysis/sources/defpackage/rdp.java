package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
final class rdp implements ServiceConnection {
    public dnw a;
    final /* synthetic */ rdq b;

    public rdp(rdq rdqVar) {
        this.b = rdqVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        rdq rdqVar = this.b;
        dnw dnwVar = this.a;
        if (iBinder == null) {
            rdqVar.g(new rch("Gearhead Car Startup Service returned null binding."), dnwVar);
        } else {
            Executors.newSingleThreadExecutor().execute(new imp((Object) rdqVar, (Object) iBinder, (Object) dnwVar, 7, (byte[]) null));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        rdq rdqVar = this.b;
        spi.a().c(rdqVar.a, this);
        rcj rcjVar = new rcj("Gearhead Car Startup Service unexpectedly disconnected.");
        rdqVar.f(rcjVar, this.a);
        if (rrd.e("GH.GhCarClientCtor", 4)) {
            rrd.d(4, "GH.GhCarClientCtor", rcjVar, "onConnectionLost: %s", new zjd(zjc.a, rcjVar.getMessage()));
        }
        rdq.e(rdqVar.c, new ral(rdqVar, 3));
    }
}
