package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract class v0 implements d0 {
    public final double[] a;
    public int b;

    public v0(long j) {
        if (j >= 2147483639) {
            j$.time.g.a("Stream size exceeds max array size");
            throw null;
        }
        this.a = new double[(int) j];
        this.b = 0;
    }

    @Override // j$.util.stream.i0
    public final i0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.i0
    public final Object b() {
        double[] dArr = this.a;
        int length = dArr.length;
        int i = this.b;
        return length == i ? dArr : Arrays.copyOf(dArr, i);
    }

    @Override // j$.util.stream.j0
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.i0
    public final void d(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (double[]) obj, i, i2);
    }

    @Override // j$.util.stream.i0
    public final void e(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            doubleConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.j0
    public final /* synthetic */ void forEach(Consumer consumer) {
        a2.n(this, consumer);
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

    @Override // j$.util.stream.i0
    public final Spliterator.OfPrimitive spliterator() {
        int i = this.b;
        double[] dArr = this.a;
        Spliterators.a(dArr.length, 0, i);
        return new j$.util.s0(dArr, 0, i, 1040);
    }

    @Override // j$.util.stream.j0, j$.util.stream.i0
    public final j0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.j0, j$.util.stream.i0
    public final Spliterator spliterator() {
        int i = this.b;
        double[] dArr = this.a;
        Spliterators.a(dArr.length, 0, i);
        return new j$.util.s0(dArr, 0, i, 1040);
    }
}
