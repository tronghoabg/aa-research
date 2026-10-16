package M8;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class h extends N0.i implements ScheduledFuture {

    /* renamed from: h, reason: collision with root package name */
    public final ScheduledFuture f7555h;

    public h(g gVar) {
        this.f7555h = gVar.a(new xa.d(this, 17));
    }

    @Override // N0.i
    public final void b() {
        ScheduledFuture scheduledFuture = this.f7555h;
        Object obj = this.f8013a;
        scheduledFuture.cancel((obj instanceof N0.b) && ((N0.b) obj).f7993a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f7555h.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f7555h.getDelay(timeUnit);
    }
}
