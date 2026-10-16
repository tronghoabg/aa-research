package X;

import A.K;
import B.F;

/* renamed from: X.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1269b extends C1270c {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public C1269b(int i5, k kVar) {
        tf.l f10;
        synchronized (m.f15718b) {
            ?? r12 = m.f15724h;
            f10 = (tf.l) ff.o.K0(r12);
            f10 = f10 == null ? new F(r12, 8) : f10;
        }
        super(i5, kVar, null, f10);
    }

    @Override // X.C1270c
    public final C1270c C(tf.l lVar, tf.l lVar2) {
        return (C1270c) ((g) m.f(new K(new C1268a(lVar, lVar2, 0), 1)));
    }

    @Override // X.C1270c, X.g
    public final void c() {
        synchronized (m.f15718b) {
            int i5 = this.f15702d;
            if (i5 >= 0) {
                m.v(i5);
                this.f15702d = -1;
            }
        }
    }

    @Override // X.C1270c, X.g
    public final void k() {
        q.f();
        throw null;
    }

    @Override // X.C1270c, X.g
    public final void l() {
        q.f();
        throw null;
    }

    @Override // X.C1270c, X.g
    public final void m() {
        m.a();
    }

    @Override // X.C1270c, X.g
    public final g t(tf.l lVar) {
        return (g) m.f(new K(new F(lVar, 9), 1));
    }

    @Override // X.C1270c
    public final q v() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
