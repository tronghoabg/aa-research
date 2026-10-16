package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class Y extends AbstractC2982l2 {

    /* renamed from: b, reason: collision with root package name */
    boolean f38131b;

    /* renamed from: c, reason: collision with root package name */
    U f38132c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ W f38133d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Y(W w2, InterfaceC3011r2 interfaceC3011r2) {
        super(interfaceC3011r2);
        this.f38133d = w2;
        InterfaceC3011r2 interfaceC3011r22 = this.f38253a;
        Objects.requireNonNull(interfaceC3011r22);
        this.f38132c = new U(interfaceC3011r22);
    }

    @Override // j$.util.stream.AbstractC2982l2, j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        this.f38253a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC3002p2, j$.util.stream.InterfaceC3011r2
    public final void accept(int i5) throws Exception {
        IntStream intStream = (IntStream) ((Q0) this.f38133d.f38120m).apply(i5);
        if (intStream != null) {
            try {
                boolean z2 = this.f38131b;
                U u10 = this.f38132c;
                if (!z2) {
                    intStream.sequential().forEach(u10);
                } else {
                    Spliterator.OfInt ofIntSpliterator = intStream.sequential().spliterator();
                    while (!this.f38253a.n() && ofIntSpliterator.tryAdvance((IntConsumer) u10)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    intStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.AbstractC2982l2, j$.util.stream.InterfaceC3011r2
    public final boolean n() {
        this.f38131b = true;
        return this.f38253a.n();
    }
}
