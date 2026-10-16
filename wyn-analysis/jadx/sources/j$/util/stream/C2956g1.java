package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.g1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2956g1 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    final int[] f38192a;

    /* renamed from: b, reason: collision with root package name */
    int f38193b;

    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC3044y0.r(this, consumer);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 h(long j8, long j10, IntFunction intFunction) {
        return AbstractC3044y0.u(this, j8, j10);
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
        AbstractC3044y0.o(this, (Integer[]) objArr, i5);
    }

    @Override // j$.util.stream.J0
    public final void e(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i5 = 0; i5 < this.f38193b; i5++) {
            intConsumer.accept(this.f38192a[i5]);
        }
    }

    @Override // j$.util.stream.J0
    public final void r(int i5, Object obj) {
        int i10 = this.f38193b;
        System.arraycopy(this.f38192a, 0, (int[]) obj, i5, i10);
    }

    C2956g1(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f38192a = new int[(int) j8];
        this.f38193b = 0;
    }

    C2956g1(int[] iArr) {
        this.f38192a = iArr;
        this.f38193b = iArr.length;
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this.f38192a, 0, this.f38193b, 1040);
    }

    @Override // j$.util.stream.J0, j$.util.stream.K0
    public final j$.util.d0 spliterator() {
        return Spliterators.spliterator(this.f38192a, 0, this.f38193b, 1040);
    }

    @Override // j$.util.stream.J0
    public final Object d() {
        int[] iArr = this.f38192a;
        int length = iArr.length;
        int i5 = this.f38193b;
        return length == i5 ? iArr : Arrays.copyOf(iArr, i5);
    }

    @Override // j$.util.stream.K0
    public final long count() {
        return this.f38193b;
    }

    public String toString() {
        int[] iArr = this.f38192a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.f38193b), Arrays.toString(iArr));
    }
}
