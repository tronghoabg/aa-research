package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
abstract class B3 {

    /* renamed from: a, reason: collision with root package name */
    final long f37959a;

    /* renamed from: b, reason: collision with root package name */
    final long f37960b;

    /* renamed from: c, reason: collision with root package name */
    Spliterator f37961c;

    /* renamed from: d, reason: collision with root package name */
    long f37962d;

    /* renamed from: e, reason: collision with root package name */
    long f37963e;

    protected abstract Spliterator a(Spliterator spliterator, long j8, long j10, long j11, long j12);

    B3(Spliterator spliterator, long j8, long j10, long j11, long j12) {
        this.f37961c = spliterator;
        this.f37959a = j8;
        this.f37960b = j10;
        this.f37962d = j11;
        this.f37963e = j12;
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public final Spliterator m399trySplit() {
        long j8 = this.f37963e;
        if (this.f37959a >= j8 || this.f37962d >= j8) {
            return null;
        }
        while (true) {
            Spliterator spliteratorTrySplit = this.f37961c.trySplit();
            if (spliteratorTrySplit == null) {
                return null;
            }
            long jEstimateSize = spliteratorTrySplit.estimateSize() + this.f37962d;
            long jMin = Math.min(jEstimateSize, this.f37960b);
            long j10 = this.f37959a;
            if (j10 >= jMin) {
                this.f37962d = jMin;
            } else {
                long j11 = this.f37960b;
                if (jMin >= j11) {
                    this.f37961c = spliteratorTrySplit;
                    this.f37963e = jMin;
                } else {
                    long j12 = this.f37962d;
                    if (j12 >= j10 && jEstimateSize <= j11) {
                        this.f37962d = jMin;
                        return spliteratorTrySplit;
                    }
                    this.f37962d = jMin;
                    return a(spliteratorTrySplit, j10, j11, j12, jMin);
                }
            }
        }
    }

    public final long estimateSize() {
        long j8 = this.f37963e;
        long j10 = this.f37959a;
        if (j10 < j8) {
            return j8 - Math.max(j10, this.f37962d);
        }
        return 0L;
    }

    public final int characteristics() {
        return this.f37961c.characteristics();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.d0 m402trySplit() {
        return (j$.util.d0) m399trySplit();
    }

    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) m399trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.a0 m401trySplit() {
        return (j$.util.a0) m399trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.V m400trySplit() {
        return (j$.util.V) m399trySplit();
    }
}
