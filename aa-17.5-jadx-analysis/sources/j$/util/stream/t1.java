package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract class t1 extends CountedCompleter implements z2 {
    public final Spliterator a;
    public final a b;
    public final long c;
    public final long d;
    public final long e;
    public int f;
    public int g;

    public t1(t1 t1Var, Spliterator spliterator, long j, long j2, int i) {
        super(t1Var);
        this.a = spliterator;
        this.b = t1Var.b;
        this.c = t1Var.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    public abstract t1 a(Spliterator spliterator, long j, long j2);

    public /* synthetic */ void accept(int i) {
        a2.d();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        t1 t1VarA = this;
        while (spliterator.estimateSize() > t1VarA.c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            t1VarA.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            t1VarA.a(spliteratorTrySplit, t1VarA.d, jEstimateSize).fork();
            t1VarA = t1VarA.a(spliterator, t1VarA.d + jEstimateSize, t1VarA.e - jEstimateSize);
        }
        t1VarA.b.s(spliterator, t1VarA);
        t1VarA.propagateCompletion();
    }

    @Override // j$.util.stream.z2
    public final void p(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }

    @Override // j$.util.stream.z2
    public final boolean s() {
        return false;
    }

    public /* synthetic */ void accept(long j) {
        a2.i();
        throw null;
    }

    public t1(Spliterator spliterator, a aVar, int i) {
        this.a = spliterator;
        this.b = aVar;
        this.c = d.g(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    @Override // j$.util.stream.z2
    public final void end() {
    }
}
