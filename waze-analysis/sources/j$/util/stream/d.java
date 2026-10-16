package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class d extends CountedCompleter {

    /* renamed from: g, reason: collision with root package name */
    public static final int f50360g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* renamed from: a, reason: collision with root package name */
    public final a f50361a;

    /* renamed from: b, reason: collision with root package name */
    public Spliterator f50362b;

    /* renamed from: c, reason: collision with root package name */
    public long f50363c;

    /* renamed from: d, reason: collision with root package name */
    public d f50364d;

    /* renamed from: e, reason: collision with root package name */
    public d f50365e;

    /* renamed from: f, reason: collision with root package name */
    public Object f50366f;

    public d(d dVar, Spliterator spliterator) {
        super(dVar);
        this.f50362b = spliterator;
        this.f50361a = dVar.f50361a;
        this.f50363c = dVar.f50363c;
    }

    public static long g(long j2) {
        long j3 = j2 / f50360g;
        if (j3 > 0) {
            return j3;
        }
        return 1L;
    }

    public abstract Object a();

    public final d b() {
        return (d) getCompleter();
    }

    public final boolean c() {
        while (this != null) {
            d dVar = (d) this.getCompleter();
            if (dVar != null && dVar.f50364d != this) {
                return false;
            }
            this = dVar;
        }
        return true;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f50362b;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.f50363c;
        if (jG == 0) {
            jG = g(jEstimateSize);
            this.f50363c = jG;
        }
        boolean z = false;
        while (jEstimateSize > jG && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            d dVarE = this.e(spliteratorTrySplit);
            this.f50364d = dVarE;
            d dVarE2 = this.e(spliterator);
            this.f50365e = dVarE2;
            this.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                this = dVarE;
                dVarE = dVarE2;
            } else {
                this = dVarE2;
            }
            z = !z;
            dVarE.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        this.f(this.a());
        this.tryComplete();
    }

    public final boolean d() {
        return ((d) getCompleter()) == null;
    }

    public abstract d e(Spliterator spliterator);

    public void f(Object obj) {
        this.f50366f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f50366f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f50362b = null;
        this.f50365e = null;
        this.f50364d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    public d(a aVar, Spliterator spliterator) {
        super(null);
        this.f50361a = aVar;
        this.f50362b = spliterator;
        this.f50363c = 0L;
    }
}
