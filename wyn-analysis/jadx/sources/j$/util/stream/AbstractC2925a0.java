package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2925a0 extends AbstractC2935c0 {
    @Override // j$.util.stream.AbstractC2929b
    final boolean N() {
        return true;
    }

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
}
