package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
abstract class I3 {

    /* renamed from: a, reason: collision with root package name */
    protected final Spliterator f38009a;

    /* renamed from: b, reason: collision with root package name */
    protected final boolean f38010b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f38011c;

    /* renamed from: d, reason: collision with root package name */
    private final long f38012d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicLong f38013e;

    protected abstract Spliterator c(Spliterator spliterator);

    I3(Spliterator spliterator, long j8, long j10) {
        this.f38009a = spliterator;
        this.f38010b = j10 < 0;
        this.f38012d = j10 >= 0 ? j10 : 0L;
        this.f38011c = 128;
        this.f38013e = new AtomicLong(j10 >= 0 ? j8 + j10 : j8);
    }

    I3(Spliterator spliterator, I3 i32) {
        this.f38009a = spliterator;
        this.f38010b = i32.f38010b;
        this.f38013e = i32.f38013e;
        this.f38012d = i32.f38012d;
        this.f38011c = i32.f38011c;
    }

    protected final long b(long j8) {
        AtomicLong atomicLong;
        long j10;
        boolean z2;
        long jMin;
        do {
            atomicLong = this.f38013e;
            j10 = atomicLong.get();
            z2 = this.f38010b;
            if (j10 != 0) {
                jMin = Math.min(j10, j8);
                if (jMin <= 0) {
                    break;
                }
            } else {
                if (z2) {
                    return j8;
                }
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j10, j10 - jMin));
        if (z2) {
            return Math.max(j8 - jMin, 0L);
        }
        long j11 = this.f38012d;
        return j10 > j11 ? Math.max(jMin - (j10 - j11), 0L) : jMin;
    }

    protected final H3 d() {
        if (this.f38013e.get() > 0) {
            return H3.MAYBE_MORE;
        }
        return this.f38010b ? H3.UNLIMITED : H3.NO_MORE;
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public final Spliterator m403trySplit() {
        Spliterator spliteratorTrySplit;
        if (this.f38013e.get() == 0 || (spliteratorTrySplit = this.f38009a.trySplit()) == null) {
            return null;
        }
        return c(spliteratorTrySplit);
    }

    public final long estimateSize() {
        return this.f38009a.estimateSize();
    }

    public final int characteristics() {
        return this.f38009a.characteristics() & (-16465);
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.d0 m406trySplit() {
        return (j$.util.d0) m403trySplit();
    }

    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) m403trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.a0 m405trySplit() {
        return (j$.util.a0) m403trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.V m404trySplit() {
        return (j$.util.V) m403trySplit();
    }
}
