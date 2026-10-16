package od;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import oc.C3665d;

/* renamed from: od.t1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3726t1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3665d f42097b;

    public /* synthetic */ RunnableC3726t1(C3665d c3665d, int i5) {
        this.f42096a = i5;
        this.f42097b = c3665d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42096a) {
            case 0:
                C3665d c3665d = this.f42097b;
                if (!c3665d.f41474b) {
                    c3665d.f41479g = null;
                    break;
                } else {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long jA = c3665d.f41473a - ((j.E) c3665d.f41478f).a();
                    if (jA <= 0) {
                        c3665d.f41474b = false;
                        c3665d.f41479g = null;
                        ((RunnableC3740y0) c3665d.f41477e).run();
                        break;
                    } else {
                        c3665d.f41479g = ((ScheduledExecutorService) c3665d.f41475c).schedule(new RunnableC3726t1(c3665d, 1), jA, timeUnit);
                        break;
                    }
                }
            default:
                C3665d c3665d2 = this.f42097b;
                ((md.n0) c3665d2.f41476d).execute(new RunnableC3726t1(c3665d2, 0));
                break;
        }
    }
}
