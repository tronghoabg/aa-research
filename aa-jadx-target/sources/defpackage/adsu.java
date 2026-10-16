package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adsu extends defpackage.aduw {
    public final adtt a;
    public final java.lang.String b;
    final /* synthetic */ defpackage.adsv d;
    private volatile defpackage.ador e;
    private defpackage.ador f;
    public final java.util.concurrent.atomic.AtomicInteger c = new java.util.concurrent.atomic.AtomicInteger(-2147483647);
    private final ajnd g = new ajnd(this, (byte[]) null);

    public adsu(defpackage.adsv adsvVar, adtt adttVar, java.lang.String str) {
        this.d = adsvVar;
        this.a = adttVar;
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.aduw
    protected final adtt a() {
        return this.a;
    }

    @Override // defpackage.aduw
    public final adti b(defpackage.adng adngVar, defpackage.adnd adndVar, defpackage.adjw adjwVar, defpackage.adkb[] adkbVarArr) {
        adti adtiVar;
        java.util.concurrent.Executor executor;
        defpackage.adrq adrqVar = adjwVar.h;
        if (adrqVar == null) {
            adrqVar = null;
        }
        if (adrqVar == null) {
            return this.c.get() >= 0 ? new defpackage.aduq(this.e, adkbVarArr) : this.a.b(adngVar, adndVar, adjwVar, adkbVarArr);
        }
        adtt adttVar = this.a;
        ajnd ajndVar = this.g;
        adjt adjtVar = new adjt(adttVar, adngVar, adndVar, adjwVar, ajndVar, adkbVarArr);
        if (this.c.incrementAndGet() > 0) {
            ajndVar.b();
            return new defpackage.aduq(this.e, adkbVarArr);
        }
        try {
            if (!((adpd) adrqVar).f || (executor = adjwVar.c) == null) {
                executor = this.d.a;
            }
            defpackage.adof adofVar = (defpackage.adof) defpackage.ysr.bz((defpackage.adof) this.a.s().a(defpackage.adva.a), defpackage.adof.a);
            if (!((adpd) adrqVar).b || adofVar == defpackage.adof.c) {
                try {
                    adpd.k((java.lang.String) defpackage.ysr.bz(null, this.b), adngVar);
                    ((adpd) adrqVar).c.a(executor, new defpackage.advt((adpd) adrqVar, adjtVar));
                } catch (ados e) {
                    adjtVar.a(e.a);
                }
            } else {
                adjtVar.a(defpackage.ador.h.e("Credentials require channel with PRIVACY_AND_INTEGRITY security level. Observed security level: ".concat(adofVar.toString())));
            }
        } catch (java.lang.Throwable th) {
            adjtVar.a(defpackage.ador.h.e("Credentials should use fail() instead of throwing exceptions").d(th));
        }
        synchronized (adjtVar.g) {
            adtiVar = adjtVar.h;
            if (adtiVar == null) {
                adjtVar.j = new defpackage.adui("call_credentials");
                adtiVar = adjtVar.j;
                adjtVar.h = adtiVar;
            }
        }
        return adtiVar;
    }

    public final void d() {
        synchronized (this) {
            if (this.c.get() != 0) {
                return;
            }
            defpackage.ador adorVar = this.f;
            this.f = null;
            if (adorVar != null) {
                super.q(adorVar);
            }
        }
    }

    @Override // defpackage.aduw
    public final void q(defpackage.ador adorVar) {
        adorVar.getClass();
        synchronized (this) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = this.c;
            if (atomicInteger.get() < 0) {
                this.e = adorVar;
                atomicInteger.addAndGet(Integer.MAX_VALUE);
                if (atomicInteger.get() != 0) {
                    this.f = adorVar;
                } else {
                    super.q(adorVar);
                }
            }
        }
    }
}
