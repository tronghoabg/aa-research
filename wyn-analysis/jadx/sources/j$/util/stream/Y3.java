package j$.util.stream;

import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
final class Y3 extends AbstractC2987m2 {

    /* renamed from: b, reason: collision with root package name */
    boolean f38135b;

    @Override // j$.util.stream.AbstractC2987m2, j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        this.f38258a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC3007q2, java.util.function.LongConsumer
    public final void accept(long j8) {
        if (this.f38135b) {
            LongPredicate longPredicate = null;
            longPredicate.test(j8);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC2987m2, j$.util.stream.InterfaceC3011r2
    public final boolean n() {
        return !this.f38135b || this.f38258a.n();
    }
}
