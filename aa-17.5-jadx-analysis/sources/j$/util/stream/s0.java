package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class s0 extends t0 implements h0 {
    @Override // j$.util.stream.j0
    public final /* synthetic */ void forEach(Consumer consumer) {
        a2.q(this, consumer);
    }

    @Override // j$.util.stream.j0
    public final /* synthetic */ j0 g(long j, long j2, IntFunction intFunction) {
        return a2.v(this, j, j2);
    }

    @Override // j$.util.stream.j0
    public final /* synthetic */ void h(Object[] objArr, int i) {
        a2.m(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.i0
    public final Object newArray(int i) {
        return new long[i];
    }

    @Override // j$.util.stream.j0, j$.util.stream.i0
    public final Spliterator.OfPrimitive spliterator() {
        return new j1(this);
    }

    @Override // j$.util.stream.j0, j$.util.stream.i0
    public final Spliterator spliterator() {
        return new j1(this);
    }
}
