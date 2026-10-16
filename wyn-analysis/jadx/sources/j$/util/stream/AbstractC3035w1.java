package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.w1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3035w1 extends CountedCompleter implements InterfaceC3011r2 {

    /* renamed from: a, reason: collision with root package name */
    protected final Spliterator f38335a;

    /* renamed from: b, reason: collision with root package name */
    protected final AbstractC2929b f38336b;

    /* renamed from: c, reason: collision with root package name */
    protected final long f38337c;

    /* renamed from: d, reason: collision with root package name */
    protected long f38338d;

    /* renamed from: e, reason: collision with root package name */
    protected long f38339e;

    /* renamed from: f, reason: collision with root package name */
    protected int f38340f;

    /* renamed from: g, reason: collision with root package name */
    protected int f38341g;

    public /* synthetic */ void accept(double d3) {
        AbstractC3044y0.a();
        throw null;
    }

    public /* synthetic */ void accept(int i5) {
        AbstractC3044y0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j8) {
        AbstractC3044y0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    abstract AbstractC3035w1 b(Spliterator spliterator, long j8, long j10);

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ boolean n() {
        return false;
    }

    AbstractC3035w1(Spliterator spliterator, AbstractC2929b abstractC2929b, int i5) {
        this.f38335a = spliterator;
        this.f38336b = abstractC2929b;
        this.f38337c = AbstractC2944e.g(spliterator.estimateSize());
        this.f38338d = 0L;
        this.f38339e = i5;
    }

    AbstractC3035w1(AbstractC3035w1 abstractC3035w1, Spliterator spliterator, long j8, long j10, int i5) {
        super(abstractC3035w1);
        this.f38335a = spliterator;
        this.f38336b = abstractC3035w1.f38336b;
        this.f38337c = abstractC3035w1.f38337c;
        this.f38338d = j8;
        this.f38339e = j10;
        if (j8 < 0 || j10 < 0 || (j8 + j10) - 1 >= i5) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j8), Long.valueOf(j8), Long.valueOf(j10), Integer.valueOf(i5)));
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f38335a;
        AbstractC3035w1 abstractC3035w1B = this;
        while (spliterator.estimateSize() > abstractC3035w1B.f38337c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            abstractC3035w1B.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            AbstractC3035w1 abstractC3035w1 = abstractC3035w1B;
            abstractC3035w1.b(spliteratorTrySplit, abstractC3035w1B.f38338d, jEstimateSize).fork();
            abstractC3035w1B = abstractC3035w1.b(spliterator, abstractC3035w1.f38338d + jEstimateSize, abstractC3035w1.f38339e - jEstimateSize);
        }
        AbstractC3035w1 abstractC3035w12 = abstractC3035w1B;
        abstractC3035w12.f38336b.S(spliterator, abstractC3035w12);
        abstractC3035w12.propagateCompletion();
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        long j10 = this.f38339e;
        if (j8 > j10) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i5 = (int) this.f38338d;
        this.f38340f = i5;
        this.f38341g = i5 + ((int) j10);
    }
}
