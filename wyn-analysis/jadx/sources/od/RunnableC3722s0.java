package od;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: od.s0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3722s0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42087a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3728u0 f42088b;

    public /* synthetic */ RunnableC3722s0(C3728u0 c3728u0, int i5) {
        this.f42087a = i5;
        this.f42088b = c3728u0;
    }

    private final void a() {
        C3728u0 c3728u0;
        boolean z2;
        synchronized (this.f42088b) {
            c3728u0 = this.f42088b;
            if (c3728u0.f42101d != 6) {
                c3728u0.f42101d = 6;
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (z2) {
            ad.L l10 = c3728u0.f42100c;
            l10.getClass();
            ((pd.m) l10.f17515b).a(md.k0.f40682n.h("Keepalive failed. The connection is likely gone"));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        switch (this.f42087a) {
            case 0:
                a();
                return;
            default:
                synchronized (this.f42088b) {
                    try {
                        C3728u0 c3728u0 = this.f42088b;
                        c3728u0.f42103f = null;
                        int i5 = c3728u0.f42101d;
                        if (i5 == 2) {
                            c3728u0.f42101d = 4;
                            c3728u0.f42102e = c3728u0.f42098a.schedule(c3728u0.f42104g, c3728u0.f42107j, TimeUnit.NANOSECONDS);
                            z2 = true;
                        } else {
                            if (i5 == 3) {
                                ScheduledExecutorService scheduledExecutorService = c3728u0.f42098a;
                                RunnableC3731v0 runnableC3731v0 = c3728u0.f42105h;
                                long j8 = c3728u0.f42106i;
                                j.E e7 = c3728u0.f42099b;
                                c3728u0.f42103f = scheduledExecutorService.schedule(runnableC3731v0, j8 - e7.a(), TimeUnit.NANOSECONDS);
                                this.f42088b.f42101d = 2;
                            }
                            z2 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z2) {
                    ad.L l10 = this.f42088b.f42100c;
                    l10.getClass();
                    ((pd.m) l10.f17515b).r(new C3725t0(l10));
                    return;
                }
                return;
        }
    }
}
