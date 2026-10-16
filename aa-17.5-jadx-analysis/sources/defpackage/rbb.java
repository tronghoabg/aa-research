package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

/* loaded from: classes.dex */
public class rbb extends Service {
    public final rba a = new rba(this);
    public rdl b;
    public qrn c;
    protected IBinder.DeathRecipient d;
    protected boolean e;
    public lds f;

    public final void a() {
        if (omc.c("CAR.CLIENT.PLS", 3)) {
            rrd.a("CAR.CLIENT.PLS", null, "Projection end");
        }
        d();
        rdl rdlVar = this.b;
        if (rdlVar != null) {
            ((rec) rdlVar).e(false);
            this.b = null;
        }
        this.f = null;
        this.c = null;
    }

    public final void b(qzv qzvVar) {
        if (omc.c("CAR.CLIENT.PLS", 3)) {
            rrd.a("CAR.CLIENT.PLS", null, "Projection teardown");
        }
        if (this.d != null) {
            boolean zUnlinkToDeath = qzvVar.asBinder().unlinkToDeath(this.d, 0);
            this.e = !zUnlinkToDeath;
            if (omc.c("CAR.CLIENT.PLS", 3)) {
                rrd.d(3, "CAR.CLIENT.PLS", null, "Projection unlinkToDeath %s", Boolean.valueOf(zUnlinkToDeath));
            }
            this.d = null;
        }
        h();
    }

    public boolean i() {
        return true;
    }

    public void j(qrn qrnVar, Bundle bundle, kgx kgxVar) {
        kgxVar.f(false);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return new qzr(this.a);
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }

    public void h() {
    }

    public void c(qrn qrnVar) {
    }

    public void g(Bundle bundle, qrn qrnVar) {
    }
}
