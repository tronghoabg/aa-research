package j$.util.stream;

import java.util.function.Consumer;

/* renamed from: j$.util.stream.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2962h2 extends AbstractC2972j2 {
    @Override // j$.util.stream.InterfaceC2959h
    public final InterfaceC2959h unordered() {
        return !I() ? this : new C2952f2(this, EnumC2958g3.f38208r, 1);
    }

    @Override // j$.util.stream.AbstractC2929b
    final boolean N() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC2929b
    final InterfaceC3011r2 O(int i5, InterfaceC3011r2 interfaceC3011r2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC2972j2, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (!isParallel()) {
            Q().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC2972j2, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (!isParallel()) {
            Q().forEachRemaining(consumer);
        } else {
            super.forEachOrdered(consumer);
        }
    }
}
