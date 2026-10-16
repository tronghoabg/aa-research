package defpackage;

import android.content.Context;
import android.view.animation.AnimationUtils;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public final class ufz implements tst, tth {
    public ttn a;
    public final ttl b;
    public boolean c;
    public final usy d;
    private final ttl e;
    private long f;
    private int g;
    private final ufy h;
    private final ttc i;
    private final ufx j;
    private final tsv k;
    private final vaa l;
    private final qrx m;
    private gjt n;
    private gjv o;

    public ufz(Context context, usy usyVar, tsv tsvVar, std stdVar, qrx qrxVar) {
        ttl ttlVar = new ttl();
        this.e = ttlVar;
        ttn ttnVar = ttn.a;
        this.b = new ttl();
        this.n = null;
        this.o = null;
        this.l = new vaa(false);
        this.d = usyVar;
        this.m = qrxVar;
        ttn ttnVarO = usyVar.o();
        this.a = ttnVarO;
        ttlVar.b(ttnVarO);
        this.h = new ufy(context, usyVar, stdVar);
        this.i = new ttc(stdVar, usyVar);
        new ttg(stdVar);
        this.j = new ufx(stdVar, usyVar);
        this.k = tsvVar;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.tst
    @ResultIgnorabilityUnspecified
    public final synchronized int a() {
        ygr ygrVarN;
        tsv tsvVar = this.k;
        tsvVar.g();
        int i = this.g;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        ttl ttlVar = this.e;
        int iA = tsvVar.a(jCurrentAnimationTimeMillis, ttlVar);
        this.g = iA;
        this.l.c(Boolean.valueOf(iA != 0));
        ttn ttnVarA = ttlVar.a();
        this.a = ttnVarA;
        this.d.t(ttnVarA);
        if (i != 0 && this.g == 0) {
            gjv gjvVar = this.o;
            if (gjvVar != null) {
                ?? r0 = gjvVar.a;
                synchronized (r0) {
                    ygrVarN = ygr.n(r0);
                }
                yno it = ygrVarN.iterator();
                while (it.hasNext()) {
                    ((ttj) it.next()).a();
                }
            }
            gjt gjtVar = this.n;
            if (gjtVar != null) {
                gjtVar.a.execute(new shd(gjtVar, 16));
            }
        }
        notifyAll();
        return this.g;
    }

    @Override // defpackage.tst
    public final zwj b() {
        if (this.c) {
            return new zwj(this.b.a(), this.f);
        }
        return null;
    }

    final synchronized float c(float f) {
        float fR;
        ufy ufyVar = this.h;
        ufyVar.z(this.a);
        fR = ufyVar.r(f);
        h(ufyVar);
        return fR;
    }

    @Override // defpackage.tth
    public final synchronized boolean d() {
        return this.k.d();
    }

    final synchronized float e() {
        ufy ufyVar = this.h;
        if (!ufyVar.y()) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float fQ = ufyVar.q();
        return Float.isNaN(fQ) ? BitmapDescriptorFactory.HUE_RED : fQ;
    }

    final synchronized float f(float f, float f2, float f3) {
        float fS;
        ufy ufyVar = this.h;
        ufyVar.z(this.a);
        fS = ufyVar.s(f, f2, f3);
        h(ufyVar);
        return fS;
    }

    public final synchronized void g(float f, float f2) {
        ufy ufyVar = this.h;
        ufyVar.z(this.a);
        ufyVar.w(f, f2);
        h(ufyVar);
    }

    public final synchronized void h(tti ttiVar) {
        gjt gjtVar;
        usy usyVar = this.d;
        if (!(usyVar.g instanceof ufz)) {
            this.g = 0;
            this.l.c(false);
            return;
        }
        tsv tsvVar = this.k;
        if (tsvVar.b(ttiVar) != 0) {
            usyVar.C();
            ttl ttlVar = this.b;
            ttlVar.b(this.a);
            this.c = tsvVar.e(ttlVar);
            this.f = AnimationUtils.currentAnimationTimeMillis() + tsvVar.c();
            notifyAll();
            ttc ttcVar = this.i;
            if (ttiVar != ttcVar && !ttcVar.l() && (gjtVar = this.n) != null) {
                gjtVar.h();
            }
        }
    }

    final synchronized void i(float[] fArr) {
        ufy ufyVar = this.h;
        ufyVar.z(this.a);
        ufyVar.u(fArr);
        float fQ = ufyVar.q();
        if (Float.isNaN(fQ)) {
            qrx qrxVar = this.m;
            ufyVar.l();
            qrxVar.f();
        } else if (fQ != BitmapDescriptorFactory.HUE_RED) {
            qrx qrxVar2 = this.m;
            ufyVar.l();
            qrxVar2.f();
        }
        h(ufyVar);
    }

    final synchronized void j() {
        this.h.t();
    }

    public final synchronized void k(float f) {
        ufy ufyVar = this.h;
        ufyVar.z(this.a);
        ufyVar.x(f);
        h(ufyVar);
    }

    public final synchronized boolean l() {
        return this.g != 0;
    }

    @ResultIgnorabilityUnspecified
    final synchronized void m(float f) {
        ufy ufyVar = this.h;
        ufyVar.z(this.a);
        ufyVar.A(f);
        h(ufyVar);
    }

    @ResultIgnorabilityUnspecified
    final synchronized void n(float f, float f2, float f3) {
        ufy ufyVar = this.h;
        ufyVar.z(this.a);
        ufyVar.B(f3, f, f2);
        h(ufyVar);
    }

    public final synchronized float o(float f, float f2) {
        ufx ufxVar = this.j;
        ttn ttnVar = this.a;
        ufxVar.u = ttnVar;
        float f3 = ttnVar.l + 1.0f;
        ufxVar.a = true;
        ufxVar.r = f3;
        ufxVar.s = f;
        ufxVar.t = f2;
        ufxVar.v = null;
        ufxVar.w = 330L;
        h(ufxVar);
        return tsy.b(this.a.l + 1.0f);
    }

    public final synchronized float p(float f) {
        ufx ufxVar = this.j;
        ufxVar.u = this.a;
        ufxVar.a = false;
        ufxVar.r = f;
        ufxVar.v = null;
        ufxVar.w = 330L;
        h(ufxVar);
        return tsy.b(f);
    }

    public final synchronized float q() {
        return p(this.a.l - 1.0f);
    }

    public final synchronized void r(gjt gjtVar) {
        this.n = gjtVar;
    }

    public final synchronized void s(gjv gjvVar) {
        this.o = gjvVar;
    }
}
