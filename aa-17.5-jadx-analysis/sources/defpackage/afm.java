package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class afm extends agk {
    private final bwq a;
    private final bwq b;

    public afm(Object obj) {
        bxp bxpVar = bxp.c;
        this.a = new ParcelableSnapshotMutableState(obj, bxpVar);
        this.b = new ParcelableSnapshotMutableState(obj, bxpVar);
    }

    @Override // defpackage.agk
    public final Object a() {
        return this.a.a();
    }

    @Override // defpackage.agk
    public final Object b() {
        return this.b.a();
    }

    @Override // defpackage.agk
    public final void c(Object obj) {
        this.a.b(obj);
    }

    public final void d(Object obj) {
        this.b.b(obj);
    }

    public final boolean e() {
        return affa.f(a(), b()) && !g();
    }
}
