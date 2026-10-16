package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class D3 extends F3 implements Spliterator.OfInt, IntConsumer {

    /* renamed from: f, reason: collision with root package name */
    int f37974f;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.S.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.S.g(this, consumer);
    }

    @Override // j$.util.stream.I3
    protected final Spliterator c(Spliterator spliterator) {
        return new D3((Spliterator.OfInt) spliterator, this);
    }

    @Override // j$.util.stream.F3
    protected final void e(Object obj) {
        ((IntConsumer) obj).accept(this.f37974f);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i5) {
        this.f37974f = i5;
    }

    @Override // j$.util.stream.F3
    protected final AbstractC2988m3 h(int i5) {
        return new C2978k3(i5);
    }
}
