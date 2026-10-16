package E5;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f3564a;

    /* renamed from: b, reason: collision with root package name */
    public final O f3565b;

    /* renamed from: c, reason: collision with root package name */
    public final u6.q f3566c;

    /* renamed from: d, reason: collision with root package name */
    public int f3567d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3568e;

    /* renamed from: f, reason: collision with root package name */
    public final Looper f3569f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3570g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3571h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3572i;

    public y0(O o7, x0 x0Var, J0 j02, int i5, u6.q qVar, Looper looper) {
        this.f3565b = o7;
        this.f3564a = x0Var;
        this.f3569f = looper;
        this.f3566c = qVar;
    }

    public final synchronized void a(long j8) {
        boolean z2;
        AbstractC4256a.i(this.f3570g);
        AbstractC4256a.i(this.f3569f.getThread() != Thread.currentThread());
        this.f3566c.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j8;
        while (true) {
            z2 = this.f3572i;
            if (z2 || j8 <= 0) {
                break;
            }
            this.f3566c.getClass();
            wait(j8);
            this.f3566c.getClass();
            j8 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z2) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z2) {
        this.f3571h = z2 | this.f3571h;
        this.f3572i = true;
        notifyAll();
    }

    public final void c() {
        AbstractC4256a.i(!this.f3570g);
        this.f3570g = true;
        O o7 = this.f3565b;
        synchronized (o7) {
            if (!o7.f3186y && o7.f3171i.isAlive()) {
                o7.f3170h.a(14, this).b();
                return;
            }
            AbstractC4256a.E("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
