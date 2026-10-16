package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class aaev implements tst {
    public static final /* synthetic */ int k = 0;
    public final tnq a;
    public final aadr b;
    public final aaet c;
    public final aaet d;
    public final aaet e;
    public final Executor f;
    public final zrt g;
    public long h;
    public long i;
    public aado j;
    private final aadv l;

    public aaev(tnq tnqVar, aadr aadrVar, aaet aaetVar, aaet aaetVar2) {
        Executor executorB = zrz.b();
        zrt zrtVar = zrt.a;
        aadv aadvVar = new aadv();
        zkt.n(tnqVar, "mapContainer");
        this.a = tnqVar;
        this.b = aadrVar;
        this.c = aaetVar;
        this.d = aaetVar2;
        this.f = executorB;
        zkt.n(zrtVar, "uiThreadChecker");
        this.g = zrtVar;
        this.l = aadvVar;
        this.h = 0L;
        this.i = 0L;
        this.j = null;
        this.e = null;
    }

    private final void h(aadw aadwVar) {
        this.g.b();
        if (aadwVar.a) {
            long j = this.i;
            boolean zR = zkt.r();
            Executor executor = this.f;
            if (!zR) {
                executor.execute(new jor(this, j, aadwVar, 6));
            } else {
                executor.execute(new lma(this, j, 8));
                executor.execute(new zww(this, aadwVar, 9));
            }
        }
    }

    @Override // defpackage.tst
    public final int a() {
        if (addm.l()) {
            aaet aaetVar = this.e;
            synchronized (aaetVar) {
                aadv aadvVar = this.l;
                aadvVar.a();
                aadr aadrVar = this.b;
                aadrVar.c(aadvVar, aaetVar);
                aaetVar.u(aadvVar.c, aadvVar.d);
                h(new aadw(aadvVar));
                aadrVar.b();
            }
        } else {
            synchronized (this) {
                if (this.i == 0) {
                    aaet aaetVar2 = this.d;
                    aaet aaetVar3 = this.c;
                    aaetVar2.u(aaetVar3.g(), aaetVar3.c());
                    aaetVar2.r(aaetVar3.p());
                }
                this.i = this.h;
                aadv aadvVar2 = this.l;
                aadvVar2.a();
                if (addm.j()) {
                    this.f.execute(new aabr(this, 8));
                }
                aadr aadrVar2 = this.b;
                aaet aaetVar4 = this.d;
                aadrVar2.c(aadvVar2, aaetVar4);
                aaetVar4.u(aadvVar2.c, aadvVar2.d);
                h(new aadw(aadvVar2));
                aadrVar2.b();
            }
        }
        return this.b.d() ? 0 : 6;
    }

    @Override // defpackage.tst
    public final zwj b() {
        return this.b.e();
    }

    public final aaet c() {
        this.g.a();
        return this.c;
    }

    public final void d(aaeu aaeuVar) {
        aaet aaetVar = this.e;
        synchronized (aaetVar) {
            aaem aaemVar = new aaem(aaetVar);
            aaeuVar.a(aaemVar);
            aaemVar.a = true;
        }
    }

    public final void e(aadp aadpVar) {
        if (addm.l()) {
            f(new zww(this, aadpVar, 7));
        } else {
            f(new zww(this, aadpVar, 8));
        }
    }

    public final void f(Runnable runnable) {
        this.g.a();
        if (addm.l()) {
            runnable.run();
        } else {
            synchronized (this) {
                runnable.run();
                this.h++;
            }
        }
        this.a.r().C();
    }

    public final boolean g(long j) {
        this.g.a();
        if (this.h != j) {
            return false;
        }
        this.c.q(this.d);
        return true;
    }

    public aaev(tnq tnqVar, aadr aadrVar, aaet aaetVar) {
        Executor executorB = zrz.b();
        zrt zrtVar = zrt.a;
        aadv aadvVar = new aadv();
        zkt.n(tnqVar, "mapContainer");
        this.a = tnqVar;
        this.b = aadrVar;
        this.e = aaetVar;
        this.f = executorB;
        zkt.n(zrtVar, "uiThreadChecker");
        this.g = zrtVar;
        this.l = aadvVar;
        this.c = null;
        this.d = null;
        this.j = null;
    }
}
