package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class x0 extends l3 implements d0, y {
    @Override // j$.util.stream.i0
    public final i0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Double d = (Double) obj;
        if (v4.a) {
            v4.a(x0.class, "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        accept(d.doubleValue());
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.r3, j$.util.stream.i0
    public final Object b() {
        return (double[]) super.b();
    }

    @Override // j$.util.stream.r3, j$.util.stream.i0
    public final void d(int i, Object obj) {
        super.d(i, (double[]) obj);
    }

    @Override // j$.util.stream.r3, j$.util.stream.i0
    public final void e(Object obj) {
        super.e((DoubleConsumer) obj);
    }

    @Override // j$.util.stream.j0
    public final /* synthetic */ j0 g(long j, long j2, IntFunction intFunction) {
        return a2.t(this, j, j2);
    }

    @Override // j$.util.stream.j0
    public final /* synthetic */ void h(Object[] objArr, int i) {
        a2.k(this, (Double[]) objArr, i);
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

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final Spliterator.OfPrimitive spliterator() {
        return new k3(this, 0, this.b, 0, this.a);
    }

    @Override // j$.util.stream.b0
    public final j0 build() {
        return this;
    }

    @Override // j$.util.stream.j0, j$.util.stream.i0
    public final j0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final Spliterator spliterator() {
        return new k3(this, 0, this.b, 0, this.a);
    }

    @Override // j$.util.stream.z2
    public final /* synthetic */ void accept(long j) {
        a2.i();
        throw null;
    }

    @Override // j$.util.stream.z2
    public final /* synthetic */ void accept(int i) {
        a2.d();
        throw null;
    }

    @Override // j$.util.stream.y, j$.util.stream.b0
    public final d0 build() {
        return this;
    }

    @Override // j$.util.stream.z2
    public final void end() {
    }
}
