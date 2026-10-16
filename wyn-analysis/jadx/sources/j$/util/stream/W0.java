package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class W0 extends M0 {
    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return new C2991n1(this);
    }

    @Override // j$.util.stream.K0
    public final void i(Object[] objArr, int i5) {
        Objects.requireNonNull(objArr);
        K0 k02 = this.f38034a;
        k02.i(objArr, i5);
        this.f38035b.i(objArr, i5 + ((int) k02.count()));
    }

    @Override // j$.util.stream.K0
    public final Object[] o(IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        i(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.K0
    public final void forEach(Consumer consumer) {
        this.f38034a.forEach(consumer);
        this.f38035b.forEach(consumer);
    }

    @Override // j$.util.stream.K0
    public final K0 h(long j8, long j10, IntFunction intFunction) {
        if (j8 == 0 && j10 == count()) {
            return this;
        }
        long jCount = this.f38034a.count();
        if (j8 >= jCount) {
            return this.f38035b.h(j8 - jCount, j10 - jCount, intFunction);
        }
        if (j10 > jCount) {
            return AbstractC3044y0.F(EnumC2963h3.REFERENCE, this.f38034a.h(j8, jCount, intFunction), this.f38035b.h(0L, j10 - jCount, intFunction));
        }
        return this.f38034a.h(j8, j10, intFunction);
    }

    public final String toString() {
        return count() < 32 ? String.format("ConcNode[%s.%s]", this.f38034a, this.f38035b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }
}
