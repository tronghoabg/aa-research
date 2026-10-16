package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class p extends CountedCompleter {
    public Spliterator a;
    public final z2 b;
    public final a c;
    public long d;

    public p(p pVar, Spliterator spliterator) {
        super(pVar);
        this.a = spliterator;
        this.b = pVar.b;
        this.d = pVar.d;
        this.c = pVar.c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.d;
        if (jG == 0) {
            jG = d.g(jEstimateSize);
            this.d = jG;
        }
        boolean zP = u3.SHORT_CIRCUIT.p(this.c.f);
        z2 z2Var = this.b;
        boolean z = false;
        while (true) {
            if (zP && z2Var.s()) {
                break;
            }
            if (jEstimateSize <= jG || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            p pVar = new p(this, spliteratorTrySplit);
            this.addToPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
            } else {
                pVar = this;
                this = pVar;
            }
            z = !z;
            this.fork();
            this = pVar;
            jEstimateSize = spliterator.estimateSize();
        }
        this.c.a(spliterator, z2Var);
        this.a = null;
        this.propagateCompletion();
    }

    public p(a aVar, Spliterator spliterator, z2 z2Var) {
        super(null);
        this.b = z2Var;
        this.c = aVar;
        this.a = spliterator;
        this.d = 0L;
    }
}
