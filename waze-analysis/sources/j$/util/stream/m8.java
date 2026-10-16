package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class m8 {

    /* renamed from: a, reason: collision with root package name */
    public final Spliterator f50523a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f50524b;

    /* renamed from: c, reason: collision with root package name */
    public final long f50525c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f50526d;

    public m8(Spliterator spliterator, long j2, long j3) {
        this.f50523a = spliterator;
        this.f50524b = j3 < 0;
        this.f50525c = j3 >= 0 ? j3 : 0L;
        this.f50526d = new AtomicLong(j3 >= 0 ? j2 + j3 : j2);
    }

    public final long a(long j2) {
        AtomicLong atomicLong;
        long j3;
        boolean z;
        long jMin;
        do {
            atomicLong = this.f50526d;
            j3 = atomicLong.get();
            z = this.f50524b;
            if (j3 != 0) {
                jMin = Math.min(j3, j2);
                if (jMin <= 0) {
                    break;
                }
            } else {
                if (z) {
                    return j2;
                }
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j3, j3 - jMin));
        if (z) {
            return Math.max(j2 - jMin, 0L);
        }
        long j4 = this.f50525c;
        return j3 > j4 ? Math.max(jMin - (j3 - j4), 0L) : jMin;
    }

    public abstract Spliterator b(Spliterator spliterator);

    public final l8 c() {
        return this.f50526d.get() > 0 ? l8.MAYBE_MORE : this.f50524b ? l8.UNLIMITED : l8.NO_MORE;
    }

    public final int characteristics() {
        return this.f50523a.characteristics() & (-16465);
    }

    public final long estimateSize() {
        return this.f50523a.estimateSize();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public final Spliterator m37431trySplit() {
        Spliterator spliteratorTrySplit;
        if (this.f50526d.get() == 0 || (spliteratorTrySplit = this.f50523a.trySplit()) == null) {
            return null;
        }
        return b(spliteratorTrySplit);
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.a1 m37432trySplit() {
        return (j$.util.a1) m37431trySplit();
    }

    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) m37431trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.x0 m37434trySplit() {
        return (j$.util.x0) m37431trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.s0 m37433trySplit() {
        return (j$.util.s0) m37431trySplit();
    }

    public m8(Spliterator spliterator, m8 m8Var) {
        this.f50523a = spliterator;
        this.f50524b = m8Var.f50524b;
        this.f50526d = m8Var.f50526d;
        this.f50525c = m8Var.f50525c;
    }
}
