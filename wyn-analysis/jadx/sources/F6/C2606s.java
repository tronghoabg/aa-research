package f6;

import E5.C0446d0;
import E5.H0;
import E5.I0;
import E5.J0;
import g6.C2711b;

/* renamed from: f6.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2606s extends J0 {

    /* renamed from: b, reason: collision with root package name */
    public final C0446d0 f35098b;

    public C2606s(C0446d0 c0446d0) {
        this.f35098b = c0446d0;
    }

    @Override // E5.J0
    public final int b(Object obj) {
        return obj == C2605r.f35095e ? 0 : -1;
    }

    @Override // E5.J0
    public final H0 f(int i5, H0 h02, boolean z2) {
        h02.h(z2 ? 0 : null, z2 ? C2605r.f35095e : null, 0, -9223372036854775807L, 0L, C2711b.f35767f, true);
        return h02;
    }

    @Override // E5.J0
    public final int h() {
        return 1;
    }

    @Override // E5.J0
    public final Object l(int i5) {
        return C2605r.f35095e;
    }

    @Override // E5.J0
    public final I0 m(int i5, I0 i02, long j8) {
        i02.b(I0.f3107q, this.f35098b, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        i02.k = true;
        return i02;
    }

    @Override // E5.J0
    public final int o() {
        return 1;
    }
}
