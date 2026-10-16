package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class Y1 extends AbstractC2932b2 implements InterfaceC3002p2 {
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC3002p2
    public final /* synthetic */ void m(Integer num) {
        AbstractC3044y0.g(this, num);
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
    public final void accept(int i5) {
        this.f38155b++;
    }
}
