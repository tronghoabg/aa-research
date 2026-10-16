package U1;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final W f11996a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f11997b;

    /* renamed from: c, reason: collision with root package name */
    public final Q1.q f11998c;

    /* renamed from: d, reason: collision with root package name */
    public int f11999d;

    /* renamed from: e, reason: collision with root package name */
    public Object f12000e;

    /* renamed from: f, reason: collision with root package name */
    public final Looper f12001f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12002g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12003h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12004i;

    public T(Q q4, W w2, N1.N n10, int i5, Q1.q qVar, Looper looper) {
        this.f11997b = q4;
        this.f11996a = w2;
        this.f12001f = looper;
        this.f11998c = qVar;
    }

    public final synchronized void a(long j8) {
        boolean z2;
        Q1.k.g(this.f12002g);
        Q1.k.g(this.f12001f.getThread() != Thread.currentThread());
        this.f11998c.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j8;
        while (true) {
            z2 = this.f12004i;
            if (z2 || j8 <= 0) {
                break;
            }
            this.f11998c.getClass();
            wait(j8);
            this.f11998c.getClass();
            j8 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z2) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z2) {
        this.f12003h = z2 | this.f12003h;
        this.f12004i = true;
        notifyAll();
    }

    public final void c() {
        Q1.k.g(!this.f12002g);
        this.f12002g = true;
        C0855z c0855z = (C0855z) this.f11997b;
        synchronized (c0855z) {
            if (!c0855z.f12191C && c0855z.k.getThread().isAlive()) {
                c0855z.f12218i.a(14, this).b();
                return;
            }
            Q1.k.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
