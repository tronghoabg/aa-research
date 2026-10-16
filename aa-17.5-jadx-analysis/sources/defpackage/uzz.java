package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class uzz extends vad implements uzy {
    static final vja a = new vja();
    private zhc f;
    private xyc g;
    private Runnable h;
    private Runnable i;

    public uzz() {
        this.h = null;
        this.i = null;
        this.g = null;
        this.f = new zhc();
    }

    @Override // defpackage.vad, defpackage.uzy
    public final synchronized zgp b() {
        zgp zgpVarZ;
        zhc zhcVar = this.f;
        if (zhcVar == null) {
            xyc xycVar = this.g;
            xycVar.getClass();
            zgpVarZ = wub.Y(xycVar.gu());
        } else {
            zgpVarZ = wub.Z(zhcVar);
        }
        return zgpVarZ;
    }

    @Override // defpackage.uzy
    public final synchronized Object c() {
        xyc xycVar = this.g;
        if (xycVar == null) {
            return null;
        }
        return xycVar.gu();
    }

    @Override // defpackage.uzy
    public final void d(vae vaeVar, Executor executor) {
        i();
        this.c.writeLock().lock();
        try {
            super.o(vaeVar, executor);
            vag vagVar = (vag) this.d.get(vaeVar);
            this.c.writeLock().unlock();
            if (!b().isDone() || vagVar == null) {
                return;
            }
            vagVar.a(this);
        } catch (Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }

    @Override // defpackage.uzy
    public final void e(vae vaeVar, Executor executor) {
        i();
        super.o(vaeVar, executor);
    }

    @Override // defpackage.uzy
    public final void f(vae vaeVar) {
        vaeVar.getClass();
        this.c.writeLock().lock();
        try {
            Map map = this.d;
            vag vagVar = (vag) map.get(vaeVar);
            if (vagVar == null) {
                throw new IllegalArgumentException("removeObserver can only be called after addObserver is called");
            }
            vagVar.a = true;
            map.remove(vaeVar);
            this.c.writeLock().unlock();
            j();
        } catch (Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }

    @Override // defpackage.uzy
    public final boolean g(vae vaeVar) {
        return this.d.containsKey(vaeVar);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Queue] */
    public final void h() {
        synchronized (this) {
            woy.Z(this.g != null);
        }
        woy.Z(!((Boolean) this.e.get()).booleanValue());
        this.c.readLock().lock();
        try {
            for (Map.Entry entry : this.d.entrySet()) {
                vaf vafVar = (vaf) entry.getKey();
                if (vafVar instanceof vaj) {
                    throw null;
                }
                ((htm) this.b.get()).a.offer((vag) entry.getValue());
            }
            this.c.readLock().unlock();
            htm htmVar = (htm) this.b.get();
            while (true) {
                vag vagVar = (vag) htmVar.a.poll();
                if (vagVar == null) {
                    return;
                } else {
                    vagVar.a(this);
                }
            }
        } catch (Throwable th) {
            this.c.readLock().unlock();
            throw th;
        }
    }

    @Override // defpackage.vad
    protected final void i() {
        Runnable runnable;
        synchronized (this) {
            runnable = this.i;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.vad
    protected final void j() {
        Runnable runnable;
        synchronized (this) {
            runnable = this.h;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final synchronized void k(Runnable runnable) {
        this.i = runnable;
    }

    public final synchronized void l(Runnable runnable) {
        this.h = runnable;
    }

    final synchronized void m(xyc xycVar) {
        this.g = xycVar;
        zhc zhcVar = this.f;
        if (zhcVar != null) {
            zhcVar.o(xycVar.gu());
            this.f = null;
        }
    }

    public final synchronized boolean n() {
        zhc zhcVar = this.f;
        if (zhcVar != null) {
            if (!zhcVar.isDone()) {
                return false;
            }
        }
        return true;
    }

    public uzz(xyc xycVar) {
        this.h = null;
        this.i = null;
        this.g = xycVar;
        this.f = null;
    }
}
