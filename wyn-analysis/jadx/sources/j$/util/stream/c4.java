package j$.util.stream;

import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
final class c4 extends AbstractC2977k2 {

    /* renamed from: b, reason: collision with root package name */
    boolean f38163b;

    @Override // j$.util.stream.AbstractC2977k2, j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        this.f38245a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC2997o2, j$.util.stream.InterfaceC3011r2
    public final void accept(double d3) {
        if (this.f38163b) {
            DoublePredicate doublePredicate = null;
            doublePredicate.test(d3);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC2977k2, j$.util.stream.InterfaceC3011r2
    public final boolean n() {
        return !this.f38163b || this.f38245a.n();
    }
}
