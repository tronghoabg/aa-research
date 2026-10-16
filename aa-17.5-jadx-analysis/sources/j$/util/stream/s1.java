package j$.util.stream;

import j$.util.Spliterator;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class s1 extends t1 {
    public final Object[] h;

    public s1(s1 s1Var, Spliterator spliterator, long j, long j2) {
        super(s1Var, spliterator, j, j2, s1Var.h.length);
        this.h = s1Var.h;
    }

    @Override // j$.util.stream.t1
    public final t1 a(Spliterator spliterator, long j, long j2) {
        return new s1(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(i));
        }
        Object[] objArr = this.h;
        this.f = i + 1;
        objArr[i] = obj;
    }

    public s1(Spliterator spliterator, a aVar, Object[] objArr) {
        super(spliterator, aVar, objArr.length);
        this.h = objArr;
    }
}
