package e.a.d;

import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
abstract class cx implements as {
    cx() {
    }

    protected abstract as a();

    @Override // e.a.d.aj
    public af b(e.a.cq cqVar, e.a.cm cmVar, e.a.h hVar, e.a.p[] pVarArr) {
        throw null;
    }

    @Override // e.a.be
    public final e.a.az c() {
        return a().c();
    }

    @Override // e.a.d.ge
    public final Runnable d(gd gdVar) {
        return a().d(gdVar);
    }

    @Override // e.a.d.aj
    public final void r(ai aiVar, Executor executor) {
        throw null;
    }

    @Override // e.a.d.ge
    public void t(e.a.ee eeVar) {
        a().t(eeVar);
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("delegate", a());
        return zVarH.toString();
    }

    @Override // e.a.d.as
    public final e.a.c v() {
        return a().v();
    }
}
