package j$.util.stream;

import j$.util.Spliterator;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class i2 extends a2 {
    @Override // j$.util.stream.a2, j$.util.stream.t4
    public final Object a(a aVar, Spliterator spliterator) {
        return u3.SIZED.p(aVar.f) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.a(aVar, spliterator);
    }

    @Override // j$.util.stream.a2, j$.util.stream.t4
    public final Object b(a aVar, Spliterator spliterator) {
        return u3.SIZED.p(aVar.f) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.b(aVar, spliterator);
    }

    @Override // j$.util.stream.a2, j$.util.stream.t4
    public final int c() {
        return u3.q;
    }
}
