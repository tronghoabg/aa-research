package j$.util.stream;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract class t0 extends l0 implements i0 {
    @Override // j$.util.stream.i0
    public final Object b() {
        long j = this.c;
        if (j >= 2147483639) {
            j$.time.g.a("Stream size exceeds max array size");
            return null;
        }
        Object objNewArray = newArray((int) j);
        d(0, objNewArray);
        return objNewArray;
    }

    @Override // j$.util.stream.i0
    public final void d(int i, Object obj) {
        j0 j0Var = this.a;
        ((i0) j0Var).d(i, obj);
        ((i0) this.b).d(i + ((int) ((i0) j0Var).count()), obj);
    }

    @Override // j$.util.stream.i0
    public final void e(Object obj) {
        ((i0) this.a).e(obj);
        ((i0) this.b).e(obj);
    }

    @Override // j$.util.stream.j0
    public final /* synthetic */ Object[] k(IntFunction intFunction) {
        return a2.j(this, intFunction);
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.a, this.b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(j));
    }
}
