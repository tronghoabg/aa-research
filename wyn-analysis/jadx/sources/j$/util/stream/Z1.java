package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class Z1 extends AbstractC2932b2 implements InterfaceC3007q2 {
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC3007q2
    public final /* synthetic */ void j(Long l10) {
        AbstractC3044y0.i(this, l10);
    }

    @Override // j$.util.stream.W1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f38155b);
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        this.f38155b += ((AbstractC2932b2) v1).f38155b;
    }

    @Override // j$.util.stream.AbstractC2932b2, j$.util.stream.InterfaceC3011r2, j$.util.stream.InterfaceC3007q2, java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f38155b++;
    }
}
