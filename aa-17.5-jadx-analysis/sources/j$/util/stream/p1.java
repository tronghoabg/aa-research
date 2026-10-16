package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class p1 extends p3 implements h0, a0 {
    @Override // j$.util.stream.y2
    public final /* synthetic */ void B(Long l) {
        a2.g(this, l);
    }

    @Override // j$.util.stream.p3
    /* renamed from: C */
    public final Spliterator.OfLong spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.i0
    public final i0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.z2
    public final /* synthetic */ void accept(int i) {
        a2.d();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.r3, j$.util.stream.i0
    public final Object b() {
        return (long[]) super.b();
    }

    @Override // j$.util.stream.r3, j$.util.stream.i0
    public final void d(int i, Object obj) {
        super.d(i, (long[]) obj);
    }

    @Override // j$.util.stream.r3, j$.util.stream.i0
    public final void e(Object obj) {
        super.e((LongConsumer) obj);
    }

    @Override // j$.util.stream.j0
    public final /* synthetic */ j0 g(long j, long j2, IntFunction intFunction) {
        return a2.v(this, j, j2);
    }

    @Override // j$.util.stream.j0
    public final /* synthetic */ void h(Object[] objArr, int i) {
        a2.m(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.j0
    public final /* synthetic */ Object[] k(IntFunction intFunction) {
        return a2.j(this, intFunction);
    }

    @Override // j$.util.stream.j0
    public final int l() {
        return 0;
    }

    @Override // j$.util.stream.z2
    public final void p(long j) {
        clear();
        x(j);
    }

    @Override // j$.util.stream.z2
    public final boolean s() {
        return false;
    }

    @Override // j$.util.stream.p3, java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final Spliterator.OfPrimitive spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.b0
    public final j0 build() {
        return this;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        B((Long) obj);
    }

    @Override // j$.util.stream.p3, java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.j0, j$.util.stream.i0
    public final j0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.a0, j$.util.stream.b0
    public final h0 build() {
        return this;
    }

    @Override // j$.util.stream.z2
    public final void end() {
    }
}
