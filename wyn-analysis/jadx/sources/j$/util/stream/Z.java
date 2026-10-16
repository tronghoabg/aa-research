package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class Z extends AbstractC2935c0 {
    @Override // j$.util.stream.InterfaceC2959h
    public final InterfaceC2959h unordered() {
        return !I() ? this : new C3028v(this, EnumC2958g3.f38208r, 1);
    }

    @Override // j$.util.stream.AbstractC2929b, j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC2929b, j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC2929b, j$.util.stream.InterfaceC2959h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.AbstractC2929b
    final boolean N() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC2929b
    final InterfaceC3011r2 O(int i5, InterfaceC3011r2 interfaceC3011r2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC2935c0, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        if (!isParallel()) {
            AbstractC2935c0.W(Q()).forEachRemaining(intConsumer);
        } else {
            super.forEach(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC2935c0, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        if (!isParallel()) {
            AbstractC2935c0.W(Q()).forEachRemaining(intConsumer);
        } else {
            super.forEachOrdered(intConsumer);
        }
    }
}
