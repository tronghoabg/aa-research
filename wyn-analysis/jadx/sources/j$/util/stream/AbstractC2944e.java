package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* renamed from: j$.util.stream.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2944e extends CountedCompleter {

    /* renamed from: g, reason: collision with root package name */
    private static final int f38171g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* renamed from: a, reason: collision with root package name */
    protected final AbstractC2929b f38172a;

    /* renamed from: b, reason: collision with root package name */
    protected Spliterator f38173b;

    /* renamed from: c, reason: collision with root package name */
    protected long f38174c;

    /* renamed from: d, reason: collision with root package name */
    protected AbstractC2944e f38175d;

    /* renamed from: e, reason: collision with root package name */
    protected AbstractC2944e f38176e;

    /* renamed from: f, reason: collision with root package name */
    private Object f38177f;

    protected abstract Object a();

    protected abstract AbstractC2944e e(Spliterator spliterator);

    protected AbstractC2944e(AbstractC2929b abstractC2929b, Spliterator spliterator) {
        super(null);
        this.f38172a = abstractC2929b;
        this.f38173b = spliterator;
        this.f38174c = 0L;
    }

    protected AbstractC2944e(AbstractC2944e abstractC2944e, Spliterator spliterator) {
        super(abstractC2944e);
        this.f38173b = spliterator;
        this.f38172a = abstractC2944e.f38172a;
        this.f38174c = abstractC2944e.f38174c;
    }

    public static int b() {
        return f38171g;
    }

    public static long g(long j8) {
        long j10 = j8 / f38171g;
        if (j10 > 0) {
            return j10;
        }
        return 1L;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f38177f;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    protected Object c() {
        return this.f38177f;
    }

    protected void f(Object obj) {
        this.f38177f = obj;
    }

    protected final boolean d() {
        return ((AbstractC2944e) getCompleter()) == null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f38173b;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.f38174c;
        if (jG == 0) {
            jG = g(jEstimateSize);
            this.f38174c = jG;
        }
        boolean z2 = false;
        AbstractC2944e abstractC2944e = this;
        while (jEstimateSize > jG && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            AbstractC2944e abstractC2944eE = abstractC2944e.e(spliteratorTrySplit);
            abstractC2944e.f38175d = abstractC2944eE;
            AbstractC2944e abstractC2944eE2 = abstractC2944e.e(spliterator);
            abstractC2944e.f38176e = abstractC2944eE2;
            abstractC2944e.setPendingCount(1);
            if (z2) {
                spliterator = spliteratorTrySplit;
                abstractC2944e = abstractC2944eE;
                abstractC2944eE = abstractC2944eE2;
            } else {
                abstractC2944e = abstractC2944eE2;
            }
            z2 = !z2;
            abstractC2944eE.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC2944e.f(abstractC2944e.a());
        abstractC2944e.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f38173b = null;
        this.f38176e = null;
        this.f38175d = null;
    }
}
