package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class N extends Q implements InterfaceC3002p2 {

    /* renamed from: b, reason: collision with root package name */
    final IntConsumer f38042b;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC3002p2
    public final /* synthetic */ void m(Integer num) {
        AbstractC3044y0.g(this, num);
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

    N(IntConsumer intConsumer, boolean z2) {
        super(z2);
        this.f38042b = intConsumer;
    }

    @Override // j$.util.stream.Q, j$.util.stream.InterfaceC3011r2
    public final void accept(int i5) {
        this.f38042b.accept(i5);
    }
}
