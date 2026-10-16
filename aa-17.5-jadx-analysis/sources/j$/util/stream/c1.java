package j$.util.stream;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract class c1 implements j0 {
    @Override // j$.util.stream.j0, j$.util.stream.i0
    public j0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.j0
    public final long count() {
        return 0L;
    }

    @Override // j$.util.stream.j0
    public /* synthetic */ j0 g(long j, long j2, IntFunction intFunction) {
        return a2.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.j0
    public final Object[] k(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    @Override // j$.util.stream.j0
    public final int l() {
        return 0;
    }

    public final void e(Object obj) {
    }

    public final void d(int i, Object obj) {
    }
}
