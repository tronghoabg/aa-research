package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3038x extends AbstractC2977k2 {

    /* renamed from: b, reason: collision with root package name */
    boolean f38345b;

    /* renamed from: c, reason: collision with root package name */
    C2994o f38346c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3043y f38347d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3038x(C3043y c3043y, InterfaceC3011r2 interfaceC3011r2) {
        super(interfaceC3011r2);
        this.f38347d = c3043y;
        InterfaceC3011r2 interfaceC3011r22 = this.f38245a;
        Objects.requireNonNull(interfaceC3011r22);
        this.f38346c = new C2994o(interfaceC3011r22);
    }

    @Override // j$.util.stream.AbstractC2977k2, j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        this.f38245a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC2997o2, j$.util.stream.InterfaceC3011r2
    public final void accept(double d3) throws Exception {
        E e7 = (E) ((C2924a) this.f38347d.f38352n).apply(d3);
        if (e7 != null) {
            try {
                boolean z2 = this.f38345b;
                C2994o c2994o = this.f38346c;
                if (!z2) {
                    e7.sequential().forEach(c2994o);
                } else {
                    j$.util.V vSpliterator = e7.sequential().spliterator();
                    while (!this.f38245a.n() && vSpliterator.tryAdvance((DoubleConsumer) c2994o)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    e7.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (e7 != null) {
            e7.close();
        }
    }

    @Override // j$.util.stream.AbstractC2977k2, j$.util.stream.InterfaceC3011r2
    public final boolean n() {
        this.f38345b = true;
        return this.f38245a.n();
    }
}
