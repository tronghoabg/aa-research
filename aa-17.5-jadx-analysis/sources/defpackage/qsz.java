package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class qsz extends qrn {
    public final Context a;
    public final rbt b;
    public final rbv c;
    public final rcf d;
    public final Looper e;
    public final Object f;
    public final int g;
    private final zgp h;
    private volatile zgp i;
    private volatile int j;
    private volatile boolean k;
    private volatile boolean l;

    public qsz(Context context, rbt rbtVar, rbv rbvVar, rcf rcfVar, Looper looper, int i) {
        this.g = i;
        zhc zhcVar = new zhc(new rci("Token not connected."));
        this.h = zhcVar;
        this.f = new Object();
        this.i = zhcVar;
        this.j = 0;
        this.k = false;
        this.l = false;
        this.a = context;
        this.b = rbtVar;
        this.c = rbvVar;
        this.d = rcfVar;
        this.e = looper;
    }

    @Override // defpackage.qrn
    public final rce a() {
        return d();
    }

    @Override // defpackage.qrn
    public final boolean b() {
        boolean zI;
        synchronized (this.f) {
            zI = oni.i(this.i);
        }
        return zI;
    }

    @Override // defpackage.qrn
    public final boolean c() {
        boolean z;
        synchronized (this.f) {
            z = !this.i.isDone();
        }
        return z;
    }

    public final rdm d() {
        rdm rdmVar;
        synchronized (this.f) {
            if (!b()) {
                throw new IllegalStateException();
            }
            rdmVar = (rdm) wub.ag(this.i);
        }
        return rdmVar;
    }

    @ResultIgnorabilityUnspecified
    public final zgp e() {
        zgp zgpVar;
        synchronized (this.f) {
            zgp zgpVar2 = this.i;
            int i = 4;
            if (zgpVar2.isDone() && !oni.i(zgpVar2)) {
                rdq rdqVar = new rdq(this.a, new rdr(this), new wyd(this));
                Looper.getMainLooper();
                rdm rdmVar = new rdm(rdqVar, this.e);
                int i2 = this.j + 1;
                this.j = i2;
                int i3 = 3;
                if (rrd.e("CAR.TOKEN", 4)) {
                    zjc zjcVar = zjc.a;
                    rrd.d(4, "CAR.TOKEN", null, "Connecting %s using %s (cx attempt %s)", new zjd(zjcVar, this), new zjd(zjcVar, rdmVar), new zjd(zjcVar, Integer.valueOf(i2)));
                }
                zgj zgjVarV = zgj.v(rdmVar.m);
                kpf kpfVar = new kpf(rdmVar, i3);
                zfq zfqVar = zfq.a;
                this.i = zgjVarV.w(kpfVar, zfqVar);
                zgj zgjVarV2 = zgj.v(this.i);
                zgjVarV2.c(new zgf(zgjVarV2, new rds(this, rdmVar, i2)), zfqVar);
            } else if (this.l) {
                new sss(this.e).post(new ral(this, i));
            }
            this.l = false;
            zgpVar = this.i;
        }
        return zgpVar;
    }

    public final void f() {
        synchronized (this.f) {
            if (b()) {
                this.k = true;
                try {
                    this.b.a();
                    synchronized (this.f) {
                        this.k = false;
                        if (this.l) {
                            this.l = false;
                            g();
                        }
                    }
                } catch (Throwable th) {
                    synchronized (this.f) {
                        this.k = false;
                        if (this.l) {
                            this.l = false;
                            g();
                        }
                        throw th;
                    }
                }
            }
        }
    }

    public final void g() {
        synchronized (this.f) {
            if (this.k) {
                if (rrd.e("CAR.TOKEN", 4)) {
                    rrd.d(4, "CAR.TOKEN", null, "Will disconnect after connection callbacks finish running.", new Object[0]);
                }
                this.l = true;
                return;
            }
            int i = this.j;
            if (rrd.e("CAR.TOKEN", 4)) {
                zjc zjcVar = zjc.a;
                rrd.d(4, "CAR.TOKEN", null, "Disconnecting %s (cx attempt: %s).", new zjd(zjcVar, this), new zjd(zjcVar, Integer.valueOf(i)));
            }
            zgp zgpVar = this.i;
            zgpVar.c(new zgf(zgpVar, new rdt(this, i)), zfq.a);
            if (!this.i.isDone()) {
                rrd.d(5, "CAR.TOKEN", null, "Client connection future not done, canceling.", new Object[0]);
                this.i.cancel(false);
            }
            this.i = this.h;
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean h() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("blockingConnect() cannot be called on the main thread.");
        }
        try {
            e().get();
            return true;
        } catch (InterruptedException | CancellationException | ExecutionException unused) {
            return b();
        }
    }
}
