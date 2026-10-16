package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2955g0 extends AbstractC2987m2 {

    /* renamed from: b, reason: collision with root package name */
    boolean f38189b;

    /* renamed from: c, reason: collision with root package name */
    C2940d0 f38190c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2960h0 f38191d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2955g0(C2960h0 c2960h0, InterfaceC3011r2 interfaceC3011r2) {
        super(interfaceC3011r2);
        this.f38191d = c2960h0;
        InterfaceC3011r2 interfaceC3011r22 = this.f38258a;
        Objects.requireNonNull(interfaceC3011r22);
        this.f38190c = new C2940d0(interfaceC3011r22);
    }

    @Override // j$.util.stream.AbstractC2987m2, j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        this.f38258a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC3007q2, java.util.function.LongConsumer
    public final void accept(long j8) throws Exception {
        InterfaceC2990n0 interfaceC2990n0 = (InterfaceC2990n0) ((C2924a) this.f38191d.f38219n).apply(j8);
        if (interfaceC2990n0 != null) {
            try {
                boolean z2 = this.f38189b;
                C2940d0 c2940d0 = this.f38190c;
                if (!z2) {
                    interfaceC2990n0.sequential().forEach(c2940d0);
                } else {
                    j$.util.a0 a0VarSpliterator = interfaceC2990n0.sequential().spliterator();
                    while (!this.f38258a.n() && a0VarSpliterator.tryAdvance((LongConsumer) c2940d0)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    interfaceC2990n0.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC2990n0 != null) {
            interfaceC2990n0.close();
        }
    }

    @Override // j$.util.stream.AbstractC2987m2, j$.util.stream.InterfaceC3011r2
    public final boolean n() {
        this.f38189b = true;
        return this.f38258a.n();
    }
}
