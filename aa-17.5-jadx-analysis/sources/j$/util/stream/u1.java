package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class u1 extends s3 implements j0, b0 {
    @Override // j$.util.stream.j0, j$.util.stream.i0
    public final j0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.z2
    public final /* synthetic */ void accept(int i) {
        a2.d();
        throw null;
    }

    @Override // j$.util.stream.j0
    public final /* synthetic */ j0 g(long j, long j2, IntFunction intFunction) {
        return a2.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.j0
    public final void h(Object[] objArr, int i) {
        long j = i;
        long jCount = count() + j;
        if (jCount > objArr.length || jCount < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.b == 0) {
            System.arraycopy(this.d, 0, objArr, i, this.a);
            return;
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            Object[] objArr2 = this.e[i2];
            System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
            i += this.e[i2].length;
        }
        int i3 = this.a;
        if (i3 > 0) {
            System.arraycopy(this.d, 0, objArr, i, i3);
        }
    }

    @Override // j$.util.stream.j0
    public final Object[] k(IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            j$.time.g.a("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        h(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.j0
    public final int l() {
        return 0;
    }

    @Override // j$.util.stream.z2
    public final void p(long j) {
        clear();
        t(j);
    }

    @Override // j$.util.stream.z2
    public final boolean s() {
        return false;
    }

    @Override // j$.util.stream.s3, java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.z2
    public final /* synthetic */ void accept(long j) {
        a2.i();
        throw null;
    }

    @Override // j$.util.stream.b0
    public final j0 build() {
        return this;
    }

    @Override // j$.util.stream.z2
    public final void end() {
    }
}
