package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class u0 extends l0 {
    @Override // j$.util.stream.j0
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    @Override // j$.util.stream.j0
    public final j0 g(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == this.c) {
            return this;
        }
        long jCount = this.a.count();
        if (j >= jCount) {
            return this.b.g(j - jCount, j2 - jCount, intFunction);
        }
        j0 j0Var = this.a;
        if (j2 <= jCount) {
            return j0Var.g(j, j2, intFunction);
        }
        return a2.z(v3.REFERENCE, j0Var.g(j, jCount, intFunction), this.b.g(0L, j2 - jCount, intFunction));
    }

    @Override // j$.util.stream.j0
    public final void h(Object[] objArr, int i) {
        objArr.getClass();
        j0 j0Var = this.a;
        j0Var.h(objArr, i);
        this.b.h(objArr, i + ((int) j0Var.count()));
    }

    @Override // j$.util.stream.j0
    public final Object[] k(IntFunction intFunction) {
        long j = this.c;
        if (j >= 2147483639) {
            j$.time.g.a("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j);
        h(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.j0, j$.util.stream.i0
    public final Spliterator spliterator() {
        return new l1(this);
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(j));
    }
}
