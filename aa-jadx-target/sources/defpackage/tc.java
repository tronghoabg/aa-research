package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tc {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public tc(defpackage.epk epkVar, defpackage.afdo afdoVar) {
        afdoVar.getClass();
        this.a = epkVar;
        aiut aiutVar = aivl.a;
        this.b = afdoVar.plus(ajdt.a.i());
    }

    public static defpackage.tc q(android.view.ViewGroup viewGroup) {
        return (defpackage.tc) viewGroup.getTag(2131429809);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final androidx.car.app.model.ActionStrip a() {
        if (this.a.isEmpty()) {
            throw new java.lang.IllegalStateException("Action strip must contain at least one action");
        }
        return new androidx.car.app.model.ActionStrip(this);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public final void b(androidx.car.app.model.Action action) {
        action.getClass();
        int type = action.getType();
        if (type != 1 && this.b.contains(java.lang.Integer.valueOf(type))) {
            java.util.Objects.toString(action);
            throw new java.lang.IllegalArgumentException("Duplicated action types are disallowed: ".concat(action.toString()));
        }
        androidx.car.app.model.CarText title = action.getTitle();
        if (title != null) {
            wp.a.a(title);
        }
        this.b.add(java.lang.Integer.valueOf(type));
        this.a.add(action);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final btq c(defpackage.btw btwVar) {
        return (btq) this.b.get(btwVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final void d(defpackage.btw btwVar) {
        ?? r0 = this.b;
        btq btqVar = (btq) r0.get(btwVar);
        if (btqVar != null) {
        }
        r0.remove(btwVar);
    }

    public final float e() {
        return ((defpackage.ana) this.a).b();
    }

    public final float f() {
        return ((java.lang.Number) ((defpackage.ana) this.a).b.a()).floatValue();
    }

    public final bqx g() {
        return (bqx) ((defpackage.ana) this.a).g();
    }

    public final bqx h() {
        return (bqx) ((defpackage.ana) this.a).i();
    }

    public final bqx i() {
        return (bqx) ((defpackage.ana) this.a).j();
    }

    public final void j(dot dotVar, float f) {
        java.lang.String strH = defpackage.wf.h(dotVar.b);
        dpn dpnVar = new dpn(new char[0]);
        dpnVar.q(dpv.a(dotVar.a.toString()));
        dpnVar.q(dpv.a(strH));
        dpnVar.q(new dpr(f));
        dpnVar.q(new dpr(0.0f));
        ((dpo) this.b).r((java.lang.String) this.a, dpnVar);
    }

    public final void k(dos dosVar, float f) {
        java.lang.String strG = defpackage.wf.g(dosVar.b);
        dpn dpnVar = new dpn(new char[0]);
        dpnVar.q(dpv.a(dosVar.a.toString()));
        dpnVar.q(dpv.a(strG));
        dpnVar.q(new dpr(f));
        dpnVar.q(new dpr(0.0f));
        ((dpo) this.b).r((java.lang.String) this.a, dpnVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bys, java.lang.Object] */
    public final defpackage.cty l() {
        return (defpackage.cty) this.a.a();
    }

    public final void m() {
        synchronized (this) {
            java.lang.Object obj = this.b;
            ((java.util.concurrent.atomic.AtomicInteger) obj).decrementAndGet();
            if (((java.util.concurrent.atomic.AtomicInteger) obj).get() < 0) {
                throw new java.lang.IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public final boolean n() {
        synchronized (this) {
            if (((java.util.concurrent.atomic.AtomicBoolean) this.a).get()) {
                return false;
            }
            ((java.util.concurrent.atomic.AtomicInteger) this.b).incrementAndGet();
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [afdo, java.lang.Object] */
    public final java.lang.Object o(java.lang.Object obj, defpackage.afdk afdkVar) {
        java.lang.Object objA = ahoc.a((defpackage.afdo) this.b, new defpackage.ehz(this, obj, (defpackage.afdk) null, 3), afdkVar);
        return objA == defpackage.afdr.a ? objA : defpackage.afbk.a;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [afdo, java.lang.Object] */
    public final java.lang.Object p(defpackage.eqp eqpVar, defpackage.afdk afdkVar) {
        return ahoc.a((defpackage.afdo) this.b, new defpackage.ehz(this, eqpVar, (defpackage.afdk) null, 4), afdkVar);
    }

    public tc(android.view.ViewGroup viewGroup, android.view.View view) {
        this.b = viewGroup;
        this.a = view;
    }

    public tc(dpt dptVar, int i) {
        this.b = dptVar;
        this.a = defpackage.wf.h(i);
    }

    public tc(dpt dptVar, int i, byte[] bArr) {
        this.b = dptVar;
        this.a = defpackage.wf.g(i);
    }

    public tc(java.lang.Object obj, java.lang.Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public tc() {
        this.a = new java.util.ArrayList();
        this.b = new java.util.HashSet();
    }

    public tc(bqx bqxVar, defpackage.affc affcVar) {
        this.a = new defpackage.ana(bqxVar);
        this.b = affcVar;
    }

    public tc(android.content.Intent intent, java.util.ArrayList arrayList) {
        this.a = intent;
        this.b = arrayList;
    }

    public tc(char[] cArr) {
        this.b = new java.util.concurrent.atomic.AtomicInteger(0);
        this.a = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public tc(byte[] bArr) {
        this.b = new java.util.LinkedHashMap();
        this.a = new java.util.LinkedHashMap();
    }

    public tc(defpackage.cxl cxlVar, defpackage.cty ctyVar) {
        this.b = cxlVar;
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(ctyVar, defpackage.bxv.c);
    }
}
