package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class x extends b {
    public final j$.nio.file.h0 j;

    public x(x xVar, Spliterator spliterator) {
        super(xVar, spliterator);
        this.j = xVar.j;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        a aVar = this.a;
        v vVar = (v) ((j$.nio.file.h0) this.j.c).get();
        aVar.s(this.b, vVar);
        boolean z = vVar.b;
        if (z == ((w) this.j.b).b) {
            Boolean boolValueOf = Boolean.valueOf(z);
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.d
    public final d e(Spliterator spliterator) {
        return new x(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final Object j() {
        return Boolean.valueOf(!((w) this.j.b).b);
    }

    public x(j$.nio.file.h0 h0Var, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.j = h0Var;
    }
}
