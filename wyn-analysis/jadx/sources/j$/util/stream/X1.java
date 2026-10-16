package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class X1 extends AbstractC2932b2 implements InterfaceC2997o2 {
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC2997o2
    public final /* synthetic */ void p(Double d3) {
        AbstractC3044y0.e(this, d3);
    }

    @Override // j$.util.stream.W1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f38155b);
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        this.f38155b += ((AbstractC2932b2) v1).f38155b;
    }

    @Override // j$.util.stream.AbstractC2932b2, j$.util.stream.InterfaceC3011r2
    public final void accept(double d3) {
        this.f38155b++;
    }
}
