package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2965i0 extends AbstractC2975k0 {
    @Override // j$.util.stream.InterfaceC2959h
    public final InterfaceC2959h unordered() {
        return !I() ? this : new C3033w(this, EnumC2958g3.f38208r, 4);
    }

    @Override // j$.util.stream.AbstractC2929b, j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final /* bridge */ /* synthetic */ InterfaceC2990n0 parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC2929b, j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final /* bridge */ /* synthetic */ InterfaceC2990n0 sequential() {
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

    @Override // j$.util.stream.AbstractC2975k0, j$.util.stream.InterfaceC2990n0
    public final void forEach(LongConsumer longConsumer) {
        if (!isParallel()) {
            AbstractC2975k0.W(Q()).forEachRemaining(longConsumer);
        } else {
            super.forEach(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC2975k0, j$.util.stream.InterfaceC2990n0
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (!isParallel()) {
            AbstractC2975k0.W(Q()).forEachRemaining(longConsumer);
        } else {
            super.forEachOrdered(longConsumer);
        }
    }
}
