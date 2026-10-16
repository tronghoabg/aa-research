package G6;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public long f4497a;

    /* renamed from: b, reason: collision with root package name */
    public long f4498b = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4499c = new Object();

    public C(long j8) {
        this.f4497a = j8;
    }

    public final boolean a() {
        synchronized (this.f4499c) {
            try {
                C6.n.f1857D.k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (this.f4498b + this.f4497a > jElapsedRealtime) {
                    return false;
                }
                this.f4498b = jElapsedRealtime;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
