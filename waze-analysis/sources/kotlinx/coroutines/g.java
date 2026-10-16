package kotlinx.coroutines;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.LockSupport;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g extends a implements cv {

    /* renamed from: c, reason: collision with root package name */
    private final Thread f51974c;

    /* renamed from: d, reason: collision with root package name */
    private final ba f51975d;

    public g(h.c.j jVar, Thread thread, ba baVar) {
        super(jVar, true);
        this.f51974c = thread;
        this.f51975d = baVar;
    }

    @Override // h.c.b.a.d
    public final /* bridge */ h.c.b.a.d getCallerFrame() {
        int i2;
        if (!cy.f51826b.e() || ca()) {
            return null;
        }
        List listI = h.a.c.i(this.f51974c.getStackTrace());
        if (ca()) {
            return null;
        }
        Iterator it = listI.iterator();
        int i3 = 0;
        while (true) {
            i2 = -1;
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            if (aj.S((StackTraceElement) it.next())) {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            return null;
        }
        int size = listI.size();
        while (true) {
            i3++;
            if (i3 >= size) {
                break;
            }
            if (!aj.S((StackTraceElement) listI.get(i3))) {
                i2 = i3;
                break;
            }
        }
        return aj.R(listI, i2);
    }

    @Override // h.c.b.a.d
    public final /* bridge */ StackTraceElement getStackTraceElement() {
        return cw.a(this);
    }

    public final Object i() throws Throwable {
        long jH;
        ba baVar = this.f51975d;
        if (baVar != null) {
            baVar.k(false);
        }
        while (true) {
            if (baVar != null) {
                try {
                    jH = baVar.h();
                } catch (Throwable th) {
                    ba baVar2 = this.f51975d;
                    if (baVar2 != null) {
                        baVar2.i(false);
                    }
                    throw th;
                }
            } else {
                jH = Long.MAX_VALUE;
            }
            if (ca()) {
                break;
            }
            LockSupport.parkNanos(this, jH);
            if (Thread.interrupted()) {
                M(new InterruptedException());
            }
        }
        ba baVar3 = this.f51975d;
        if (baVar3 != null) {
            baVar3.i(false);
        }
        Object objB = cg.b(bX());
        u uVar = objB instanceof u ? (u) objB : null;
        if (uVar == null) {
            return objB;
        }
        throw uVar.f52067a;
    }

    @Override // kotlinx.coroutines.cy
    public final /* bridge */ StackTraceElement j() {
        return cy.f51826b.d();
    }

    @Override // kotlinx.coroutines.cf
    protected final void k(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f51974c;
        if (h.g.b.x.n(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }

    @Override // kotlinx.coroutines.cf
    protected final boolean l() {
        return true;
    }
}
