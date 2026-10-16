package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class q2 extends d {
    public final a2 h;

    public q2(q2 q2Var, Spliterator spliterator) {
        super(q2Var, spliterator);
        this.h = q2Var.h;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        a aVar = this.a;
        n2 n2VarH = this.h.H();
        aVar.s(this.b, n2VarH);
        return n2VarH;
    }

    @Override // j$.util.stream.d
    public final d e(Spliterator spliterator) {
        return new q2(this, spliterator);
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.d;
        if (dVar != null) {
            n2 n2Var = (n2) ((q2) dVar).f;
            n2Var.A((n2) ((q2) this.e).f);
            this.f = n2Var;
        }
        super.onCompletion(countedCompleter);
    }

    public q2(a2 a2Var, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.h = a2Var;
    }
}
