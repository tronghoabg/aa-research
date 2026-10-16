package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
class X0 implements E0 {

    /* renamed from: a, reason: collision with root package name */
    final double[] f38128a;

    /* renamed from: b, reason: collision with root package name */
    int f38129b;

    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC3044y0.q(this, consumer);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 h(long j8, long j10, IntFunction intFunction) {
        return AbstractC3044y0.t(this, j8, j10);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC3044y0.m(this, intFunction);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.K0
    public final /* bridge */ /* synthetic */ K0 b(int i5) {
        b(i5);
        throw null;
    }

    @Override // j$.util.stream.J0, j$.util.stream.K0
    public final J0 b(int i5) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void i(Object[] objArr, int i5) {
        AbstractC3044y0.n(this, (Double[]) objArr, i5);
    }

    @Override // j$.util.stream.J0
    public final void e(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i5 = 0; i5 < this.f38129b; i5++) {
            doubleConsumer.accept(this.f38128a[i5]);
        }
    }

    @Override // j$.util.stream.J0
    public final void r(int i5, Object obj) {
        int i10 = this.f38129b;
        System.arraycopy(this.f38128a, 0, (double[]) obj, i5, i10);
    }

    X0(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f38128a = new double[(int) j8];
        this.f38129b = 0;
    }

    X0(double[] dArr) {
        this.f38128a = dArr;
        this.f38129b = dArr.length;
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return Spliterators.j(this.f38128a, 0, this.f38129b);
    }

    @Override // j$.util.stream.J0, j$.util.stream.K0
    public final j$.util.d0 spliterator() {
        return Spliterators.j(this.f38128a, 0, this.f38129b);
    }

    @Override // j$.util.stream.J0
    public final Object d() {
        double[] dArr = this.f38128a;
        int length = dArr.length;
        int i5 = this.f38129b;
        return length == i5 ? dArr : Arrays.copyOf(dArr, i5);
    }

    @Override // j$.util.stream.K0
    public final long count() {
        return this.f38129b;
    }

    public String toString() {
        double[] dArr = this.f38128a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.f38129b), Arrays.toString(dArr));
    }
}
