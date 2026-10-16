package Ef;

import A.AbstractC0213f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public abstract class Z implements Runnable, Comparable, U {

    @Nullable
    private volatile Object _heap;

    /* renamed from: a, reason: collision with root package name */
    public long f3708a;

    /* renamed from: b, reason: collision with root package name */
    public int f3709b = -1;

    public Z(long j8) {
        this.f3708a = j8;
    }

    public final Jf.w b() {
        Object obj = this._heap;
        if (obj instanceof Jf.w) {
            return (Jf.w) obj;
        }
        return null;
    }

    public final int c(long j8, C0477a0 c0477a0, AbstractC0479b0 abstractC0479b0) {
        synchronized (this) {
            if (this._heap == H.f3669b) {
                return 2;
            }
            synchronized (c0477a0) {
                try {
                    Z[] zArr = c0477a0.f6144a;
                    Z z2 = zArr != null ? zArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC0479b0.f3713f;
                    abstractC0479b0.getClass();
                    if (AbstractC0479b0.f3715h.get(abstractC0479b0) == 1) {
                        return 1;
                    }
                    if (z2 == null) {
                        c0477a0.f3711c = j8;
                    } else {
                        long j10 = z2.f3708a;
                        if (j10 - j8 < 0) {
                            j8 = j10;
                        }
                        if (j8 - c0477a0.f3711c > 0) {
                            c0477a0.f3711c = j8;
                        }
                    }
                    long j11 = this.f3708a;
                    long j12 = c0477a0.f3711c;
                    if (j11 - j12 < 0) {
                        this.f3708a = j12;
                    }
                    c0477a0.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j8 = this.f3708a - ((Z) obj).f3708a;
        if (j8 > 0) {
            return 1;
        }
        return j8 < 0 ? -1 : 0;
    }

    public final void d(C0477a0 c0477a0) {
        if (this._heap == H.f3669b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = c0477a0;
    }

    @Override // Ef.U
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                H6.g gVar = H.f3669b;
                if (obj == gVar) {
                    return;
                }
                C0477a0 c0477a0 = obj instanceof C0477a0 ? (C0477a0) obj : null;
                if (c0477a0 != null) {
                    c0477a0.b(this);
                }
                this._heap = gVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return AbstractC0213f.e(new StringBuilder("Delayed[nanos="), this.f3708a, ']');
    }
}
