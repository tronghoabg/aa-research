package j$.util.stream;

import j$.util.Spliterator;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class f8 {

    /* renamed from: a, reason: collision with root package name */
    public final long f50404a;

    /* renamed from: b, reason: collision with root package name */
    public final long f50405b;

    /* renamed from: c, reason: collision with root package name */
    public Spliterator f50406c;

    /* renamed from: d, reason: collision with root package name */
    public long f50407d;

    /* renamed from: e, reason: collision with root package name */
    public long f50408e;

    public f8(Spliterator spliterator, long j2, long j3, long j4, long j5) {
        this.f50406c = spliterator;
        this.f50404a = j2;
        this.f50405b = j3;
        this.f50407d = j4;
        this.f50408e = j5;
    }

    public abstract Spliterator a(Spliterator spliterator, long j2, long j3, long j4, long j5);

    public final int characteristics() {
        return this.f50406c.characteristics();
    }

    public final long estimateSize() {
        long j2 = this.f50408e;
        long j3 = this.f50404a;
        if (j3 < j2) {
            return j2 - Math.max(j3, this.f50407d);
        }
        return 0L;
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public final Spliterator m37427trySplit() {
        long j2 = this.f50408e;
        if (this.f50404a >= j2 || this.f50407d >= j2) {
            return null;
        }
        while (true) {
            Spliterator spliteratorTrySplit = this.f50406c.trySplit();
            if (spliteratorTrySplit == null) {
                return null;
            }
            long jEstimateSize = spliteratorTrySplit.estimateSize() + this.f50407d;
            long jMin = Math.min(jEstimateSize, this.f50405b);
            long j3 = this.f50404a;
            if (j3 >= jMin) {
                this.f50407d = jMin;
            } else {
                long j4 = this.f50405b;
                if (jMin < j4) {
                    long j5 = this.f50407d;
                    if (j5 < j3 || jEstimateSize > j4) {
                        this.f50407d = jMin;
                        return a(spliteratorTrySplit, j3, j4, j5, jMin);
                    }
                    this.f50407d = jMin;
                    return spliteratorTrySplit;
                }
                this.f50406c = spliteratorTrySplit;
                this.f50408e = jMin;
            }
        }
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.a1 m37428trySplit() {
        return (j$.util.a1) m37427trySplit();
    }

    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) m37427trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.x0 m37430trySplit() {
        return (j$.util.x0) m37427trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.s0 m37429trySplit() {
        return (j$.util.s0) m37427trySplit();
    }
}
