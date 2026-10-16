package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
class N0 implements K0 {

    /* renamed from: a, reason: collision with root package name */
    final Object[] f38043a;

    /* renamed from: b, reason: collision with root package name */
    int f38044b;

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 h(long j8, long j10, IntFunction intFunction) {
        return AbstractC3044y0.w(this, j8, j10, intFunction);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.K0
    public final K0 b(int i5) {
        throw new IndexOutOfBoundsException();
    }

    N0(long j8, IntFunction intFunction) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f38043a = (Object[]) intFunction.apply((int) j8);
        this.f38044b = 0;
    }

    N0(Object[] objArr) {
        this.f38043a = objArr;
        this.f38044b = objArr.length;
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return Spliterators.l(this.f38043a, 0, this.f38044b);
    }

    @Override // j$.util.stream.K0
    public final void i(Object[] objArr, int i5) {
        System.arraycopy(this.f38043a, 0, objArr, i5, this.f38044b);
    }

    @Override // j$.util.stream.K0
    public final Object[] o(IntFunction intFunction) {
        Object[] objArr = this.f38043a;
        if (objArr.length == this.f38044b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.K0
    public final long count() {
        return this.f38044b;
    }

    @Override // j$.util.stream.K0
    public final void forEach(Consumer consumer) {
        for (int i5 = 0; i5 < this.f38044b; i5++) {
            consumer.p(this.f38043a[i5]);
        }
    }

    public String toString() {
        Object[] objArr = this.f38043a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.f38044b), Arrays.toString(objArr));
    }
}
