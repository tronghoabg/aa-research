package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3048z extends B {
    @Override // j$.util.stream.InterfaceC2959h
    public final InterfaceC2959h unordered() {
        return !I() ? this : new C3023u(this, EnumC2958g3.f38208r, 1);
    }

    @Override // j$.util.stream.AbstractC2929b, j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final /* bridge */ /* synthetic */ E parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC2929b, j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final /* bridge */ /* synthetic */ E sequential() {
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

    @Override // j$.util.stream.B, j$.util.stream.E
    public final void forEach(DoubleConsumer doubleConsumer) {
        if (!isParallel()) {
            B.W(Q()).forEachRemaining(doubleConsumer);
        } else {
            super.forEach(doubleConsumer);
        }
    }

    @Override // j$.util.stream.B, j$.util.stream.E
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        if (!isParallel()) {
            B.W(Q()).forEachRemaining(doubleConsumer);
        } else {
            super.forEachOrdered(doubleConsumer);
        }
    }
}
