package com.bumptech.glide.manager;

/* JADX INFO: loaded from: classes2.dex */
public final class LifecycleLifecycle implements defpackage.idp, defpackage.eqf {
    private final java.util.Set a = new java.util.HashSet();
    private final defpackage.epy b;

    public LifecycleLifecycle(defpackage.epy epyVar) {
        this.b = epyVar;
        epyVar.c(this);
    }

    @Override // defpackage.idp
    public final void a(defpackage.idq idqVar) {
        this.a.add(idqVar);
        defpackage.epy epyVar = this.b;
        if (epyVar.a() == defpackage.epx.a) {
            idqVar.j();
        } else if (epyVar.a().a(defpackage.epx.d)) {
            idqVar.k();
        } else {
            idqVar.l();
        }
    }

    @Override // defpackage.idp
    public final void b(defpackage.idq idqVar) {
        this.a.remove(idqVar);
    }

    @androidx.lifecycle.OnLifecycleEvent(a = defpackage.epw.ON_DESTROY)
    public void onDestroy(defpackage.eqg eqgVar) {
        java.util.Iterator it = defpackage.igg.e(this.a).iterator();
        while (it.hasNext()) {
            ((defpackage.idq) it.next()).j();
        }
        eqgVar.getLifecycle().d(this);
    }

    @androidx.lifecycle.OnLifecycleEvent(a = defpackage.epw.ON_START)
    public void onStart(defpackage.eqg eqgVar) {
        java.util.Iterator it = defpackage.igg.e(this.a).iterator();
        while (it.hasNext()) {
            ((defpackage.idq) it.next()).k();
        }
    }

    @androidx.lifecycle.OnLifecycleEvent(a = defpackage.epw.ON_STOP)
    public void onStop(defpackage.eqg eqgVar) {
        java.util.Iterator it = defpackage.igg.e(this.a).iterator();
        while (it.hasNext()) {
            ((defpackage.idq) it.next()).l();
        }
    }
}
