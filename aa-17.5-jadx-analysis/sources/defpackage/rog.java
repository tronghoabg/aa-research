package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class rog {
    public final qxj a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final Handler g;
    public qxl h;
    public ajmd i;

    public rog(qxj qxjVar, Looper looper) {
        this.g = new rof(this, looper);
        qxjVar.getClass();
        this.a = qxjVar;
    }

    public final void a() {
        try {
            qxl qxlVar = this.h;
            if (qxlVar != null) {
                this.a.v(qxlVar);
            }
        } catch (RemoteException e) {
            if (omc.c("CAR.SENSOR", 4)) {
                rrd.d(4, "CAR.SENSOR", e, "RemoteException from car service: %s", e.getMessage());
            }
        } catch (IllegalStateException unused) {
        }
        this.h = null;
        this.i = null;
    }

    public final void b(int i) throws qrz {
        try {
            this.a.j(i);
        } catch (RemoteException e) {
            olm.h(e);
        } catch (IllegalStateException e2) {
            olm.f(e2);
        }
    }
}
