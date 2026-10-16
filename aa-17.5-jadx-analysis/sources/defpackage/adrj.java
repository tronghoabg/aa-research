package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class adrj implements adrm, adwj {
    private boolean a;
    private final int b;
    private boolean c;
    private boolean d;
    private Runnable e;
    private boolean f;
    public adsv j;
    public final Object k = new Object();
    public final aeac l;
    public final adwm m;
    public int n;
    public boolean o;
    public final adzv p;
    public adsj q;
    public adjt r;
    public volatile boolean s;
    public boolean t;

    protected adrj(int i, adzv adzvVar, aeac aeacVar) {
        this.l = aeacVar;
        adwm adwmVar = new adwm(this, adjc.a, i, adzvVar, aeacVar);
        this.m = adwmVar;
        this.j = adwmVar;
        this.b = 32768;
        this.r = adjt.b;
        this.d = false;
        this.p = adzvVar;
    }

    private final void c() {
        boolean zI;
        synchronized (this.k) {
            zI = i();
            if (!zI) {
                Logger logger = adrk.v;
                if (logger.isLoggable(Level.FINEST)) {
                    logger.logp(Level.FINEST, "io.grpc.internal.AbstractStream$TransportState", "notifyIfReady", "Stream not ready so skip notifying listener.\ndetails: allocated/deallocated:{0}/{3}, sent queued: {1}, ready thresh: {2}", new Object[]{Boolean.valueOf(this.a), Integer.valueOf(this.n), Integer.valueOf(this.b), Boolean.valueOf(this.o)});
                }
            }
        }
        if (zI) {
            this.q.e();
        }
    }

    protected void d() {
        woy.Z(this.q != null);
        synchronized (this.k) {
            woy.aa(!this.a, "Already allocated");
            this.a = true;
        }
        c();
    }

    @Override // defpackage.adwj
    public final void g(adzx adzxVar) {
        this.q.d(adzxVar);
    }

    public final void h(int i) {
        boolean z;
        synchronized (this.k) {
            woy.aa(this.a, "onStreamAllocated was not called, but it seems the stream is active");
            int i2 = this.n;
            int i3 = this.b;
            int i4 = i2 - i;
            this.n = i4;
            z = false;
            if (i2 >= i3 && i4 < i3) {
                z = true;
            }
        }
        if (z) {
            c();
        }
    }

    public final boolean i() {
        boolean z;
        synchronized (this.k) {
            z = false;
            if (this.a && this.n < this.b && !this.o) {
                z = true;
            }
        }
        return z;
    }

    public final void j(adnq adnqVar, adsi adsiVar, admc admcVar) {
        if (this.c) {
            return;
        }
        this.c = true;
        this.p.f();
        aeac aeacVar = this.l;
        if (adnqVar.g()) {
            aeacVar.c++;
        } else {
            aeacVar.d++;
        }
        this.q.a(adnqVar, adsiVar, admcVar);
    }

    @Override // defpackage.adwj
    public void k(boolean z) {
        woy.aa(this.t, "status should have been reported on deframer closed");
        this.d = true;
        if (this.f && z) {
            l(adnq.l.e("Encountered end-of-stream mid-frame"), true, new admc());
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
            this.e = null;
        }
    }

    public final void l(adnq adnqVar, boolean z, admc admcVar) {
        m(adnqVar, adsi.a, z, admcVar);
    }

    public final void m(adnq adnqVar, adsi adsiVar, boolean z, admc admcVar) {
        adnqVar.getClass();
        admcVar.getClass();
        if (this.t) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        this.t = true;
        this.f = adnqVar.g();
        synchronized (this.k) {
            this.o = true;
        }
        if (this.d) {
            this.e = null;
            j(adnqVar, adsiVar, admcVar);
            return;
        }
        this.e = new adtg(this, adnqVar, adsiVar, admcVar, 1);
        adsv adsvVar = this.j;
        if (z) {
            adsvVar.close();
            return;
        }
        adwm adwmVar = (adwm) adsvVar;
        if (adwmVar.b()) {
            return;
        }
        if (adwmVar.c()) {
            adwmVar.close();
        } else {
            adwmVar.f = true;
        }
    }
}
