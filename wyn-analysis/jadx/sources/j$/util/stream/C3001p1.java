package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.p1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C3001p1 implements I0 {

    /* renamed from: a, reason: collision with root package name */
    final long[] f38279a;

    /* renamed from: b, reason: collision with root package name */
    int f38280b;

    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC3044y0.s(this, consumer);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 h(long j8, long j10, IntFunction intFunction) {
        return AbstractC3044y0.v(this, j8, j10);
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
        AbstractC3044y0.p(this, (Long[]) objArr, i5);
    }

    @Override // j$.util.stream.J0
    public final void e(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i5 = 0; i5 < this.f38280b; i5++) {
            longConsumer.accept(this.f38279a[i5]);
        }
    }

    @Override // j$.util.stream.J0
    public final void r(int i5, Object obj) {
        int i10 = this.f38280b;
        System.arraycopy(this.f38279a, 0, (long[]) obj, i5, i10);
    }

    C3001p1(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f38279a = new long[(int) j8];
        this.f38280b = 0;
    }

    C3001p1(long[] jArr) {
        this.f38279a = jArr;
        this.f38280b = jArr.length;
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return Spliterators.k(this.f38279a, 0, this.f38280b);
    }

    @Override // j$.util.stream.J0, j$.util.stream.K0
    public final j$.util.d0 spliterator() {
        return Spliterators.k(this.f38279a, 0, this.f38280b);
    }

    @Override // j$.util.stream.J0
    public final Object d() {
        long[] jArr = this.f38279a;
        int length = jArr.length;
        int i5 = this.f38280b;
        return length == i5 ? jArr : Arrays.copyOf(jArr, i5);
    }

    @Override // j$.util.stream.K0
    public final long count() {
        return this.f38280b;
    }

    public String toString() {
        long[] jArr = this.f38279a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.f38280b), Arrays.toString(jArr));
    }
}
