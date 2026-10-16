package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class x3 extends CountedCompleter implements t5 {

    /* renamed from: a, reason: collision with root package name */
    public final Spliterator f50679a;

    /* renamed from: b, reason: collision with root package name */
    public final a f50680b;

    /* renamed from: c, reason: collision with root package name */
    public final long f50681c;

    /* renamed from: d, reason: collision with root package name */
    public final long f50682d;

    /* renamed from: e, reason: collision with root package name */
    public final long f50683e;

    /* renamed from: f, reason: collision with root package name */
    public int f50684f;

    /* renamed from: g, reason: collision with root package name */
    public int f50685g;

    public x3(x3 x3Var, Spliterator spliterator, long j2, long j3, int i2) {
        super(x3Var);
        this.f50679a = spliterator;
        this.f50680b = x3Var.f50680b;
        this.f50681c = x3Var.f50681c;
        this.f50682d = j2;
        this.f50683e = j3;
        if (j2 < 0 || j3 < 0 || (j2 + j3) - 1 >= i2) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j2), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i2)));
        }
    }

    public abstract x3 a(Spliterator spliterator, long j2, long j3);

    public /* synthetic */ void accept(double d2) {
        d4.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f50679a;
        x3 x3VarA = this;
        while (spliterator.estimateSize() > x3VarA.f50681c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            x3VarA.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            x3VarA.a(spliteratorTrySplit, x3VarA.f50682d, jEstimateSize).fork();
            x3VarA = x3VarA.a(spliterator, x3VarA.f50682d + jEstimateSize, x3VarA.f50683e - jEstimateSize);
        }
        x3VarA.f50680b.Q(spliterator, x3VarA);
        x3VarA.propagateCompletion();
    }

    @Override // j$.util.stream.t5
    public final void end() {
    }

    @Override // j$.util.stream.t5
    public final void l(long j2) {
        long j3 = this.f50683e;
        if (j2 > j3) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i2 = (int) this.f50682d;
        this.f50684f = i2;
        this.f50685g = i2 + ((int) j3);
    }

    @Override // j$.util.stream.t5
    public final boolean o() {
        return false;
    }

    public /* synthetic */ void accept(int i2) {
        d4.k();
        throw null;
    }

    public /* synthetic */ void accept(long j2) {
        d4.l();
        throw null;
    }

    public x3(Spliterator spliterator, a aVar, int i2) {
        this.f50679a = spliterator;
        this.f50680b = aVar;
        this.f50681c = d.g(spliterator.estimateSize());
        this.f50682d = 0L;
        this.f50683e = i2;
    }
}
