package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class agl implements defpackage.bys {
    public defpackage.aep a;
    final /* synthetic */ defpackage.agn b;
    private final defpackage.bwx c;
    private final defpackage.aga d;
    private final defpackage.bwx e;
    private final defpackage.bwx f;
    private final defpackage.bwx g;
    private boolean h;
    private final defpackage.bwx i;
    private boolean j;
    private final defpackage.afd k;
    private final defpackage.byh l;
    private final defpackage.byl m;
    private final defpackage.bil n;

    /* JADX WARN: Type inference failed for: r0v13, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [affc, java.lang.Object] */
    public agl(defpackage.agn agnVar, java.lang.Object obj, defpackage.aep aepVar, defpackage.bil bilVar) {
        this.b = agnVar;
        this.n = bilVar;
        defpackage.bxv bxvVar = defpackage.bxv.c;
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, bxvVar);
        java.lang.Float fValueOf = java.lang.Float.valueOf(1.0f);
        java.lang.Object objInvoke = null;
        defpackage.aga agaVar = new defpackage.aga(1.0f, 1500.0f, null);
        this.d = agaVar;
        this.e = new androidx.compose.runtime.ParcelableSnapshotMutableState(agaVar, bxvVar);
        this.f = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.agf(d(), bilVar, obj, n(), aepVar), bxvVar);
        this.g = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.TRUE, bxvVar);
        this.l = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(-1.0f);
        this.i = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, bxvVar);
        this.a = aepVar;
        this.m = new androidx.compose.runtime.ParcelableSnapshotMutableLongState(e().a());
        if (!defpackage.afga.f(bilVar, defpackage.agt.b) && !defpackage.afga.f(bilVar, defpackage.agt.h) && !defpackage.afga.f(bilVar, defpackage.agt.g)) {
            if (defpackage.afga.f(bilVar, defpackage.agt.a)) {
                fValueOf = java.lang.Float.valueOf(0.01f);
            } else if (!defpackage.afga.f(bilVar, defpackage.agt.i) && !defpackage.afga.f(bilVar, defpackage.agt.e) && !defpackage.afga.f(bilVar, defpackage.agt.f)) {
                fValueOf = (defpackage.afga.f(bilVar, defpackage.agt.c) || defpackage.afga.f(bilVar, defpackage.agt.d)) ? java.lang.Float.valueOf(0.4f) : null;
            }
        }
        if (fValueOf != null) {
            float fFloatValue = fValueOf.floatValue();
            defpackage.aep aepVar2 = (defpackage.aep) bilVar.b.invoke(obj);
            int iB = aepVar2.b();
            for (int i = 0; i < iB; i++) {
                aepVar2.e(i, fFloatValue);
            }
            objInvoke = this.n.a.invoke(aepVar2);
        }
        this.k = new defpackage.aga(1.0f, 1500.0f, objInvoke);
    }

    private final java.lang.Object n() {
        return this.c.a();
    }

    private final void o(defpackage.agf agfVar) {
        this.f.b(agfVar);
    }

    private final void p(defpackage.afd afdVar) {
        this.e.b(afdVar);
    }

    private final void q(java.lang.Object obj) {
        this.c.b(obj);
    }

    private final void r(java.lang.Object obj, boolean z) {
        if (defpackage.afga.f(null, n())) {
            o(new defpackage.agf(this.k, this.n, obj, obj, this.a.c()));
            this.h = true;
            f(e().a());
            return;
        }
        defpackage.afd afdVarD = (!z || this.j || (d() instanceof defpackage.aga)) ? d() : this.k;
        defpackage.agn agnVar = this.b;
        o(new defpackage.agf(agnVar.b() > 0 ? new defpackage.agb(afdVarD, agnVar.b()) : afdVarD, this.n, obj, n(), this.a));
        f(e().a());
        this.h = false;
        agnVar.s(true);
        if (agnVar.w()) {
            java.util.List listE = agnVar.e.e();
            int size = listE.size();
            for (int i = 0; i < size; i++) {
                defpackage.agl aglVar = (defpackage.agl) listE.get(i);
                aglVar.c();
                long j = agnVar.g;
                aglVar.m();
            }
            agnVar.s(false);
        }
    }

    @Override // defpackage.bys
    public final java.lang.Object a() {
        return this.i.a();
    }

    public final float b() {
        return this.l.e();
    }

    public final long c() {
        return this.m.e();
    }

    public final defpackage.afd d() {
        return (defpackage.afd) this.e.a();
    }

    public final defpackage.agf e() {
        return (defpackage.agf) this.f.a();
    }

    public final void f(long j) {
        this.m.h(j);
    }

    public final void g(boolean z) {
        this.g.b(java.lang.Boolean.valueOf(z));
    }

    public final void h(float f) {
        this.l.h(f);
    }

    public final void i(java.lang.Object obj) {
        this.i.b(obj);
    }

    public final void j(java.lang.Object obj, java.lang.Object obj2, defpackage.afd afdVar) {
        q(obj2);
        p(afdVar);
        if (defpackage.afga.f(e().b, obj) && defpackage.afga.f(e().a, obj2)) {
            return;
        }
        r(obj, false);
    }

    public final void k(java.lang.Object obj, defpackage.afd afdVar, java.lang.Object obj2, defpackage.aep aepVar) {
        java.lang.Object objA;
        if (this.h && defpackage.afga.f(obj, null)) {
            return;
        }
        if (defpackage.afga.f(n(), obj) && b() == -1.0f && (obj2 == null || defpackage.afga.f(obj2, e().b))) {
            return;
        }
        q(obj);
        p(afdVar);
        if (obj2 == null) {
            objA = b() == -3.0f ? obj : a();
        } else {
            objA = obj2;
        }
        if (obj2 != null) {
            i(objA);
            if (aepVar != null) {
                this.a = aepVar;
            }
        }
        r(objA, !l() && obj2 == null);
        g(b() == -3.0f);
        if (b() >= 0.0f) {
            i(e().c((long) (e().a() * b())));
        } else if (b() == -3.0f) {
            i(obj);
        }
        this.h = false;
        h(-1.0f);
    }

    public final boolean l() {
        return ((java.lang.Boolean) this.g.a()).booleanValue();
    }

    public final void m() {
        if (b() == -1.0f) {
            this.j = true;
            if (defpackage.afga.f(e().a, e().b)) {
                i(e().a);
            } else {
                i(e().c(0L));
                this.a = e().b(0L);
            }
        }
    }

    public final java.lang.String toString() {
        return "current value: " + a() + ", target: " + n() + ", spec: " + d();
    }
}
