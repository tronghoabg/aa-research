package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.g2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2957g2 extends AbstractC2992n2 {

    /* renamed from: b, reason: collision with root package name */
    boolean f38194b;

    /* renamed from: c, reason: collision with root package name */
    U f38195c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ W f38196d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2957g2(W w2, InterfaceC3011r2 interfaceC3011r2) {
        super(interfaceC3011r2);
        this.f38196d = w2;
        InterfaceC3011r2 interfaceC3011r22 = this.f38260a;
        Objects.requireNonNull(interfaceC3011r22);
        this.f38195c = new U(interfaceC3011r22);
    }

    @Override // j$.util.stream.AbstractC2992n2, j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        this.f38260a.l(-1L);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) throws Exception {
        IntStream intStream = (IntStream) ((C2924a) this.f38196d.f38120m).apply((C2924a) obj);
        if (intStream != null) {
            try {
                boolean z2 = this.f38194b;
                U u10 = this.f38195c;
                if (!z2) {
                    intStream.sequential().forEach(u10);
                } else {
                    Spliterator.OfInt ofIntSpliterator = intStream.sequential().spliterator();
                    while (!this.f38260a.n() && ofIntSpliterator.tryAdvance((IntConsumer) u10)) {
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

    @Override // j$.util.stream.AbstractC2992n2, j$.util.stream.InterfaceC3011r2
    public final boolean n() {
        this.f38194b = true;
        return this.f38260a.n();
    }
}
