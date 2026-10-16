package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class y0 extends c1 implements d0 {
    @Override // j$.util.stream.c1, j$.util.stream.j0, j$.util.stream.i0
    public final i0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.i0
    public final Object b() {
        return a2.h;
    }

    @Override // j$.util.stream.j0
    public final /* synthetic */ void forEach(Consumer consumer) {
        a2.n(this, consumer);
    }

    @Override // j$.util.stream.c1, j$.util.stream.j0
    public final /* synthetic */ j0 g(long j, long j2, IntFunction intFunction) {
        return a2.t(this, j, j2);
    }

    @Override // j$.util.stream.j0
    public final /* synthetic */ void h(Object[] objArr, int i) {
        a2.k(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.j0, j$.util.stream.i0
    public final Spliterator.OfPrimitive spliterator() {
        return Spliterators.d;
    }

    @Override // j$.util.stream.j0, j$.util.stream.i0
    public final Spliterator spliterator() {
        return Spliterators.d;
    }

    @Override // j$.util.stream.c1, j$.util.stream.j0, j$.util.stream.i0
    public final j0 a(int i) {
        throw new IndexOutOfBoundsException();
    }
}
