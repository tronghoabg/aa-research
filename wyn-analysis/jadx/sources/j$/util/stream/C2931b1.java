package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.b1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2931b1 extends AbstractC2946e1 implements G0 {
    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC3044y0.r(this, consumer);
    }

    @Override // j$.util.stream.AbstractC2946e1, j$.util.stream.K0
    public final /* synthetic */ K0 h(long j8, long j10, IntFunction intFunction) {
        return AbstractC3044y0.u(this, j8, j10);
    }

    @Override // j$.util.stream.AbstractC2946e1, j$.util.stream.K0
    public final /* bridge */ /* synthetic */ K0 b(int i5) {
        b(i5);
        throw null;
    }

    @Override // j$.util.stream.AbstractC2946e1, j$.util.stream.K0
    public final J0 b(int i5) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void i(Object[] objArr, int i5) {
        AbstractC3044y0.o(this, (Integer[]) objArr, i5);
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return Spliterators.c();
    }

    @Override // j$.util.stream.K0
    public final j$.util.d0 spliterator() {
        return Spliterators.c();
    }

    @Override // j$.util.stream.J0
    public final Object d() {
        return AbstractC3044y0.f38357e;
    }
}
