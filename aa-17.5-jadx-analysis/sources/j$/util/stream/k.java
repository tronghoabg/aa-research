package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterator;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class k implements t4 {
    public final int a;
    public final Object b;
    public final i c;
    public final i d;

    public k(boolean z, v3 v3Var, Optional optional, i iVar, i iVar2) {
        this.a = (z ? 0 : u3.q) | u3.t;
        this.b = optional;
        this.c = iVar;
        this.d = iVar2;
    }

    @Override // j$.util.stream.t4
    public final Object a(a aVar, Spliterator spliterator) {
        u4 u4Var = (u4) this.d.get();
        aVar.s(spliterator, u4Var);
        Object obj = u4Var.get();
        return obj != null ? obj : this.b;
    }

    @Override // j$.util.stream.t4
    public final Object b(a aVar, Spliterator spliterator) {
        return new m(this, u3.ORDERED.p(aVar.f), aVar, spliterator).invoke();
    }

    @Override // j$.util.stream.t4
    public final int c() {
        return this.a;
    }
}
