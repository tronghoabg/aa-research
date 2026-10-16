package We;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class f extends He.l {

    /* renamed from: b, reason: collision with root package name */
    public final e f15485b;

    /* renamed from: c, reason: collision with root package name */
    public final g f15486c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f15487d = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final Je.a f15484a = new Je.a(0);

    public f(e eVar) {
        g gVar;
        g gVar2;
        this.f15485b = eVar;
        if (eVar.f15480c.f6093b) {
            gVar2 = h.f15492e;
        } else {
            while (true) {
                if (eVar.f15479b.isEmpty()) {
                    gVar = new g(eVar.f15483f);
                    eVar.f15480c.a(gVar);
                    break;
                } else {
                    gVar = (g) eVar.f15479b.poll();
                    if (gVar != null) {
                        break;
                    }
                }
            }
            gVar2 = gVar;
        }
        this.f15486c = gVar2;
    }

    @Override // He.l
    public final Je.b a(Runnable runnable, TimeUnit timeUnit) {
        return this.f15484a.f6093b ? Me.b.f7635a : this.f15486c.c(runnable, TimeUnit.NANOSECONDS, this.f15484a);
    }

    @Override // Je.b
    public final void dispose() {
        if (this.f15487d.compareAndSet(false, true)) {
            this.f15484a.dispose();
            e eVar = this.f15485b;
            eVar.getClass();
            long jNanoTime = System.nanoTime() + eVar.f15478a;
            g gVar = this.f15486c;
            gVar.f15488c = jNanoTime;
            eVar.f15479b.offer(gVar);
        }
    }
}
