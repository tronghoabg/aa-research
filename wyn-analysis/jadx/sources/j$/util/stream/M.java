package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class M extends Q implements InterfaceC2997o2 {

    /* renamed from: b, reason: collision with root package name */
    final DoubleConsumer f38033b;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC2997o2
    public final /* synthetic */ void p(Double d3) {
        AbstractC3044y0.e(this, d3);
    }

    @Override // j$.util.stream.N3
    public final Object b(AbstractC2929b abstractC2929b, Spliterator spliterator) {
        abstractC2929b.S(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.N3
    public final /* bridge */ /* synthetic */ Object c(AbstractC2929b abstractC2929b, Spliterator spliterator) {
        e(abstractC2929b, spliterator);
        return null;
    }

    M(DoubleConsumer doubleConsumer, boolean z2) {
        super(z2);
        this.f38033b = doubleConsumer;
    }

    @Override // j$.util.stream.Q, j$.util.stream.InterfaceC3011r2
    public final void accept(double d3) {
        this.f38033b.accept(d3);
    }
}
