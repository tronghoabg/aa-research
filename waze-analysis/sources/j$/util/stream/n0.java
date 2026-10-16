package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class n0 extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    public Spliterator f50530a;

    /* renamed from: b, reason: collision with root package name */
    public final t5 f50531b;

    /* renamed from: c, reason: collision with root package name */
    public final a f50532c;

    /* renamed from: d, reason: collision with root package name */
    public long f50533d;

    public n0(n0 n0Var, Spliterator spliterator) {
        super(n0Var);
        this.f50530a = spliterator;
        this.f50531b = n0Var.f50531b;
        this.f50533d = n0Var.f50533d;
        this.f50532c = n0Var.f50532c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f50530a;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.f50533d;
        if (jG == 0) {
            jG = d.g(jEstimateSize);
            this.f50533d = jG;
        }
        boolean zK = j7.SHORT_CIRCUIT.k(this.f50532c.f50316f);
        t5 t5Var = this.f50531b;
        boolean z = false;
        while (true) {
            if (zK && t5Var.o()) {
                break;
            }
            if (jEstimateSize <= jG || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            n0 n0Var = new n0(this, spliteratorTrySplit);
            this.addToPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
            } else {
                n0Var = this;
                this = n0Var;
            }
            z = !z;
            this.fork();
            this = n0Var;
            jEstimateSize = spliterator.estimateSize();
        }
        this.f50532c.g(spliterator, t5Var);
        this.f50530a = null;
        this.propagateCompletion();
    }

    public n0(a aVar, Spliterator spliterator, t5 t5Var) {
        super(null);
        this.f50531b = t5Var;
        this.f50532c = aVar;
        this.f50530a = spliterator;
        this.f50533d = 0L;
    }
}
