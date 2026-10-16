package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public class p0 extends d {
    public final a h;
    public final LongFunction i;
    public final BinaryOperator j;

    public p0(p0 p0Var, Spliterator spliterator) {
        super(p0Var, spliterator);
        this.h = p0Var.h;
        this.i = p0Var.i;
        this.j = p0Var.j;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        b0 b0Var = (b0) this.i.apply(this.h.g(this.b));
        this.h.s(this.b, b0Var);
        return b0Var.build();
    }

    @Override // j$.util.stream.d
    public final d e(Spliterator spliterator) {
        return new p0(this, spliterator);
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.d;
        if (dVar != null) {
            this.f = (j0) this.j.apply((j0) ((p0) dVar).f, (j0) ((p0) this.e).f);
        }
        super.onCompletion(countedCompleter);
    }

    public p0(a aVar, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(aVar, spliterator);
        this.h = aVar;
        this.i = longFunction;
        this.j = binaryOperator;
    }
}
