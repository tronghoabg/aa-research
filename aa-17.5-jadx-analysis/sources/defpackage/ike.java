package defpackage;

import android.os.RemoteException;
import com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackMetadata;
import com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackRequest;
import com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackStatus;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class ike extends rhn implements jbo, iyt {
    public static final yph a = yph.c("CarLocalMediaService");
    private static final Duration g = Duration.ofSeconds(-1);
    public volatile boolean c;
    private final jer h;
    private iyu i;
    public final Object b = new Object();
    public xil d = null;
    public xij e = xij.a;
    public final Set f = new HashSet();

    public ike(jer jerVar) {
        this.h = jerVar;
    }

    public static final void i(rhr rhrVar, xij xijVar) {
        try {
            int i = xijVar.b;
            rhrVar.e(new CarLocalMediaPlaybackMetadata((i & 1) != 0 ? xijVar.c : null, (i & 2) != 0 ? xijVar.d : null, (i & 4) != 0 ? xijVar.e : null, xijVar.f.D(), (xijVar.b & 16) != 0 ? xijVar.g : -1));
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.f()).p(e)).ai((char) 155)).u("Remote exception");
        }
    }

    public static final void j(rhr rhrVar, xil xilVar) {
        try {
            rhk rhkVar = new rhk();
            int iAw = a.aw(xilVar.d);
            if (iAw == 0) {
                iAw = 1;
            }
            rhkVar.a = iAw;
            rhkVar.b = xilVar.e;
            Stream map = Collection.EL.stream(new abof(xilVar.g, xil.a)).map(new ijt(4));
            int i = yfq.d;
            List list = (List) map.collect(ycm.a);
            yfl yflVar = rhkVar.d;
            yflVar.k(list);
            if ((xilVar.c & 4) != 0) {
                rhkVar.a(Duration.ofSeconds(xilVar.f));
            } else {
                rhkVar.a(g);
            }
            rhrVar.f(new CarLocalMediaPlaybackStatus(rhkVar.a, rhkVar.b, rhkVar.c, yflVar.g()));
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.f()).p(e)).ai((char) 156)).u("Remote exception");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, rhr] */
    public static final void l(ikf ikfVar) {
        try {
            ikfVar.a.asBinder().unlinkToDeath(ikfVar, 0);
        } catch (NoSuchElementException unused) {
        }
    }

    @Override // defpackage.jbo
    public final iyw a(xnz xnzVar) {
        if ((xnzVar.b & 32768) != 0) {
            return this;
        }
        return null;
    }

    @Override // defpackage.iyw
    public final jbj b(jbn jbnVar) {
        return new iyu(this, jbnVar);
    }

    @Override // defpackage.iyw
    public final jcv c() {
        return roc.aH();
    }

    @Override // defpackage.iyw
    public final jcv d() {
        return roc.aH();
    }

    @Override // defpackage.rho
    public final void f(rhr rhrVar) {
        synchronized (this.b) {
            if (k(rhrVar) != null) {
                ((ype) ((ype) a.h()).ai(154)).u("Callback already registered.");
                return;
            }
            ikf ikfVar = new ikf(this, rhrVar, 1);
            try {
                rhrVar.asBinder().linkToDeath(ikfVar, 0);
                this.f.add(ikfVar);
                xil xilVar = this.d;
                if (xilVar != null) {
                    j(rhrVar, xilVar);
                    i(rhrVar, this.e);
                }
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) a.h()).p(e)).ai(153)).u("Failed to register callback");
            }
        }
    }

    @Override // defpackage.rho
    public final void g(CarLocalMediaPlaybackRequest carLocalMediaPlaybackRequest) {
        this.h.b();
        if (!this.c) {
            throw new IllegalStateException("CarNotConnected");
        }
        iyu iyuVar = this.i;
        iyuVar.getClass();
        xii xiiVarB = xii.b(carLocalMediaPlaybackRequest.a);
        if (xiiVarB == null) {
            throw new IllegalArgumentException("Invalid Action");
        }
        abnp abnpVarN = xik.a.n();
        abnpVarN.t();
        xik xikVar = (xik) abnpVarN.b;
        xikVar.c = xiiVarB.f;
        xikVar.b |= 1;
        xik xikVar2 = (xik) abnpVarN.q();
        iyu.a.f().ai(1666).y("Sending CarLocalMediaPlaybackRequest: %s", xikVar2);
        iyuVar.k(32771, xikVar2);
    }

    @Override // defpackage.rho
    public final void h(rhr rhrVar) {
        synchronized (this.b) {
            ikf ikfVarK = k(rhrVar);
            if (ikfVarK == null) {
                ((ype) ((ype) a.h()).ai(157)).u("Callback not registered.");
            } else {
                l(ikfVarK);
                this.f.remove(ikfVarK);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, rhr] */
    final ikf k(rhr rhrVar) {
        synchronized (this.b) {
            for (ikf ikfVar : this.f) {
                if (ikfVar.a.asBinder().equals(rhrVar.asBinder())) {
                    return ikfVar;
                }
            }
            return null;
        }
    }

    @Override // defpackage.iyw
    public final void m(PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.iyw
    public final void q() {
        throw null;
    }

    @Override // defpackage.iyw
    public final void r(jbj jbjVar) {
        this.i = (iyu) jbjVar;
        this.c = true;
    }
}
