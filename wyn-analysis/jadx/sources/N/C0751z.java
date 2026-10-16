package N;

import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: N.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0751z extends X.z implements K0 {

    /* renamed from: b, reason: collision with root package name */
    public final A.T f7988b;

    /* renamed from: c, reason: collision with root package name */
    public C0749x f7989c = new C0749x();

    public C0751z(A.T t10) {
        this.f7988b = t10;
    }

    @Override // X.y
    public final void c(X.A a5) {
        AbstractC3340k.c(a5, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f7989c = (C0749x) a5;
    }

    @Override // X.y
    public final X.A e() {
        return this.f7989c;
    }

    @Override // N.K0
    public final Object getValue() {
        tf.l lVarF = X.m.k().f();
        if (lVarF != null) {
            lVarF.invoke(this);
        }
        X.g gVarK = X.m.k();
        return i((C0749x) X.m.j(this.f7989c, gVarK), gVarK, true, this.f7988b).f7958f;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final N.C0749x i(N.C0749x r22, X.g r23, boolean r24, A.T r25) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0751z.i(N.x, X.g, boolean, A.T):N.x");
    }

    public final C0749x j() {
        X.g gVarK = X.m.k();
        return i((C0749x) X.m.j(this.f7989c, gVarK), gVarK, false, this.f7988b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DerivedState(value=");
        C0749x c0749x = (C0749x) X.m.i(this.f7989c);
        sb2.append(c0749x.c(this, X.m.k()) ? String.valueOf(c0749x.f7958f) : "<Not calculated>");
        sb2.append(")@");
        sb2.append(hashCode());
        return sb2.toString();
    }
}
