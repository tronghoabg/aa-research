package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aafy implements defpackage.ttp {
    public static final /* synthetic */ int k = 0;
    public final defpackage.too a;
    public final defpackage.aaet b;
    public final defpackage.aafv c;
    public final defpackage.aafv d;
    public final defpackage.aafv e;
    public final java.util.concurrent.Executor f;
    public final defpackage.zsx g;
    public long h;
    public long i;
    public defpackage.aaeq j;
    private final defpackage.aaex l;

    public aafy(defpackage.too tooVar, defpackage.aaet aaetVar, defpackage.aafv aafvVar, defpackage.aafv aafvVar2) {
        java.util.concurrent.Executor executorB = defpackage.ztd.b();
        defpackage.zsx zsxVar = defpackage.zsx.a;
        defpackage.aaex aaexVar = new defpackage.aaex();
        defpackage.zlv.n(tooVar, "mapContainer");
        this.a = tooVar;
        this.b = aaetVar;
        this.c = aafvVar;
        this.d = aafvVar2;
        this.f = executorB;
        defpackage.zlv.n(zsxVar, "uiThreadChecker");
        this.g = zsxVar;
        this.l = aaexVar;
        this.h = 0L;
        this.i = 0L;
        this.j = null;
        this.e = null;
    }

    private final void h(defpackage.aaey aaeyVar) {
        this.g.b();
        if (aaeyVar.a) {
            long j = this.i;
            boolean zR = defpackage.zlv.r();
            java.util.concurrent.Executor executor = this.f;
            if (!zR) {
                executor.execute(new defpackage.joy(this, j, aaeyVar, 6));
            } else {
                executor.execute(new defpackage.lmg(this, j, 8));
                executor.execute(new defpackage.aafx(this, aaeyVar, 3));
            }
        }
    }

    @Override // defpackage.ttp
    public final int a() {
        if (defpackage.adel.l()) {
            defpackage.aafv aafvVar = this.e;
            synchronized (aafvVar) {
                defpackage.aaex aaexVar = this.l;
                aaexVar.a();
                defpackage.aaet aaetVar = this.b;
                aaetVar.c(aaexVar, aafvVar);
                aafvVar.u(aaexVar.c, aaexVar.d);
                h(new defpackage.aaey(aaexVar));
                aaetVar.b();
            }
        } else {
            synchronized (this) {
                if (this.i == 0) {
                    defpackage.aafv aafvVar2 = this.d;
                    defpackage.aafv aafvVar3 = this.c;
                    aafvVar2.u(aafvVar3.g(), aafvVar3.c());
                    aafvVar2.r(aafvVar3.p());
                }
                this.i = this.h;
                defpackage.aaex aaexVar2 = this.l;
                aaexVar2.a();
                if (defpackage.adel.j()) {
                    this.f.execute(new defpackage.zyi(this, 17));
                }
                defpackage.aaet aaetVar2 = this.b;
                defpackage.aafv aafvVar4 = this.d;
                aaetVar2.c(aaexVar2, aafvVar4);
                aafvVar4.u(aaexVar2.c, aaexVar2.d);
                h(new defpackage.aaey(aaexVar2));
                aaetVar2.b();
            }
        }
        return this.b.d() ? 0 : 6;
    }

    @Override // defpackage.ttp
    public final defpackage.zxm b() {
        return this.b.e();
    }

    public final defpackage.aafv c() {
        this.g.a();
        return this.c;
    }

    public final void d(defpackage.aafw aafwVar) {
        defpackage.aafv aafvVar = this.e;
        synchronized (aafvVar) {
            defpackage.aafo aafoVar = new defpackage.aafo(aafvVar);
            aafwVar.a(aafoVar);
            aafoVar.a = true;
        }
    }

    public final void e(defpackage.aaer aaerVar) {
        if (defpackage.adel.l()) {
            f(new defpackage.aafx(this, aaerVar, 0));
        } else {
            f(new defpackage.aafx(this, aaerVar, 2));
        }
    }

    public final void f(java.lang.Runnable runnable) {
        this.g.a();
        if (defpackage.adel.l()) {
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

    public aafy(defpackage.too tooVar, defpackage.aaet aaetVar, defpackage.aafv aafvVar) {
        java.util.concurrent.Executor executorB = defpackage.ztd.b();
        defpackage.zsx zsxVar = defpackage.zsx.a;
        defpackage.aaex aaexVar = new defpackage.aaex();
        defpackage.zlv.n(tooVar, "mapContainer");
        this.a = tooVar;
        this.b = aaetVar;
        this.e = aafvVar;
        this.f = executorB;
        defpackage.zlv.n(zsxVar, "uiThreadChecker");
        this.g = zsxVar;
        this.l = aaexVar;
        this.c = null;
        this.d = null;
        this.j = null;
    }
}
