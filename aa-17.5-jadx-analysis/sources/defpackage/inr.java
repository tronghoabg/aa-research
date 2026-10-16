package defpackage;

import com.google.android.gms.car.display.CarRegionId;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class inr extends Thread {
    final Map a;
    Queue b;
    final Queue c;
    final Map d;
    public final Semaphore e;
    public final Object f;
    public volatile boolean g;
    public volatile boolean h;
    public boolean i;
    final Semaphore j;
    ing k;
    public final CarRegionId l;
    public final /* synthetic */ iob m;
    private boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inr(iob iobVar, CarRegionId carRegionId) {
        super("ClientConnectionThread");
        this.m = iobVar;
        this.a = new HashMap();
        this.b = new ArrayDeque();
        this.c = new ArrayDeque();
        this.d = new yw();
        this.e = new Semaphore(0);
        this.f = new Object();
        this.g = true;
        this.h = false;
        this.j = new Semaphore(0);
        this.l = carRegionId;
    }

    protected final void a(boolean z) {
        ((ype) iob.b.l().ai(647)).N("Clearing queue for %s, makePending=%b", this.l, z);
        ilb.d();
        synchronized (this.f) {
            Semaphore semaphore = this.e;
            semaphore.drainPermits();
            for (CarRegionId carRegionId : this.b) {
                Map map = this.a;
                inq inqVar = (inq) map.get(carRegionId);
                if (z) {
                    this.m.n(inqVar.b);
                }
                map.remove(carRegionId);
            }
            this.b = new ArrayDeque();
            semaphore.release(this.c.size());
        }
        this.i = false;
        this.m.S(this.l);
    }

    final void b() {
        this.i = false;
    }

    public final void c() {
        synchronized (this.f) {
            this.n = this.k != null;
            this.k = null;
            Semaphore semaphore = this.j;
            int iAvailablePermits = semaphore.availablePermits();
            if (iAvailablePermits == 0) {
                rbr.f(semaphore);
            } else {
                ((ype) ((ype) iob.b.h()).ai(649)).w("completion semaphore has permits already %d", iAvailablePermits);
                semaphore.drainPermits();
                rbr.f(semaphore);
            }
        }
        b();
        iob iobVar = this.m;
        if (iobVar.o) {
            iobVar.S(this.l);
        }
    }

    public final void d() {
        rbe.h(new ilp(this, 2));
    }

    public final boolean e(ing ingVar) {
        boolean z;
        synchronized (this.f) {
            z = ingVar == this.k;
        }
        return z;
    }

    public final boolean f(ing ingVar) {
        synchronized (this.f) {
            if (!e(ingVar)) {
                return false;
            }
            ((ype) iob.b.l().ai(652)).M("Unlocking ClientConnectionThread for %s due to %s", this.l, ingVar.g());
            c();
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6 A[Catch: all -> 0x01e5, TryCatch #2 {, blocks: (B:36:0x00a1, B:38:0x00a7, B:44:0x00fe, B:45:0x0100, B:39:0x00d6, B:41:0x00da, B:43:0x00ed), top: B:89:0x00a1 }] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.inr.run():void");
    }
}
