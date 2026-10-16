package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class rol {
    public final qyq a;
    public volatile qsv b;
    public OutputStream c;
    public InputStream d;
    public final Handler e;
    public final qys f;
    private final ykd g;

    public rol(qyq qyqVar, ykd ykdVar, Looper looper) throws RemoteException {
        qys qysVar = new qys(this);
        this.f = qysVar;
        this.e = new rok(this, looper);
        if (omc.c("CAR.VENDOR", 3)) {
            rrd.a("CAR.VENDOR", null, "CarVendorExtensionManager");
        }
        this.a = qyqVar;
        this.g = ykdVar;
        if (!qyqVar.s(qysVar)) {
            throw new IllegalStateException("Service is already being used");
        }
    }

    public final void a(RemoteException remoteException) throws rks {
        b();
        olm.h(remoteException);
    }

    public final void b() {
        if (omc.c("CAR.VENDOR", 3)) {
            rrd.a("CAR.VENDOR", null, "release");
        }
        try {
            this.a.o(this.f);
        } catch (RemoteException | IllegalStateException unused) {
        }
        ((rdj) this.g.a).g.i(rol.class, this);
    }
}
