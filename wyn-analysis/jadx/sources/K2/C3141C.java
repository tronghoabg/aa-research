package k2;

import N1.C0753b;
import N1.C0773w;

/* renamed from: k2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3141C extends N1.N {

    /* renamed from: b, reason: collision with root package name */
    public final C0773w f38894b;

    public C3141C(C0773w c0773w) {
        this.f38894b = c0773w;
    }

    @Override // N1.N
    public final int b(Object obj) {
        return obj == C3140B.f38891e ? 0 : -1;
    }

    @Override // N1.N
    public final N1.L f(int i5, N1.L l10, boolean z2) {
        l10.h(z2 ? 0 : null, z2 ? C3140B.f38891e : null, 0, -9223372036854775807L, 0L, C0753b.f8135c, true);
        return l10;
    }

    @Override // N1.N
    public final int h() {
        return 1;
    }

    @Override // N1.N
    public final Object l(int i5) {
        return C3140B.f38891e;
    }

    @Override // N1.N
    public final N1.M m(int i5, N1.M m10, long j8) {
        Object obj = N1.M.f8055q;
        m10.b(this.f38894b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0L);
        m10.k = true;
        return m10;
    }

    @Override // N1.N
    public final int o() {
        return 1;
    }
}
