package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vaw extends defpackage.vba implements defpackage.vav {
    static final defpackage.vjx a = new defpackage.vjx();
    private defpackage.zif f;
    private defpackage.xzi g;
    private java.lang.Runnable h;
    private java.lang.Runnable i;

    public vaw() {
        this.h = null;
        this.i = null;
        this.g = null;
        this.f = new defpackage.zif();
    }

    @Override // defpackage.vba, defpackage.vav
    public final synchronized defpackage.zhs b() {
        defpackage.zhs zhsVarCq;
        defpackage.zif zifVar = this.f;
        if (zifVar == null) {
            defpackage.xzi xziVar = this.g;
            xziVar.getClass();
            zhsVarCq = defpackage.ysr.cp(xziVar.fF());
        } else {
            zhsVarCq = defpackage.ysr.cq(zifVar);
        }
        return zhsVarCq;
    }

    @Override // defpackage.vav
    public final synchronized java.lang.Object c() {
        defpackage.xzi xziVar = this.g;
        if (xziVar == null) {
            return null;
        }
        return xziVar.fF();
    }

    @Override // defpackage.vav
    public final void d(defpackage.vbb vbbVar, java.util.concurrent.Executor executor) {
        i();
        this.c.writeLock().lock();
        try {
            super.o(vbbVar, executor);
            defpackage.vbd vbdVar = (defpackage.vbd) this.d.get(vbbVar);
            this.c.writeLock().unlock();
            if (!b().isDone() || vbdVar == null) {
                return;
            }
            vbdVar.a(this);
        } catch (java.lang.Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }

    @Override // defpackage.vav
    public final void e(defpackage.vbb vbbVar, java.util.concurrent.Executor executor) {
        i();
        super.o(vbbVar, executor);
    }

    @Override // defpackage.vav
    public final void f(defpackage.vbb vbbVar) {
        vbbVar.getClass();
        this.c.writeLock().lock();
        try {
            java.util.Map map = this.d;
            defpackage.vbd vbdVar = (defpackage.vbd) map.get(vbbVar);
            if (vbdVar == null) {
                throw new java.lang.IllegalArgumentException("removeObserver can only be called after addObserver is called");
            }
            vbdVar.a = true;
            map.remove(vbbVar);
            this.c.writeLock().unlock();
            j();
        } catch (java.lang.Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }

    @Override // defpackage.vav
    public final boolean g(defpackage.vbb vbbVar) {
        return this.d.containsKey(vbbVar);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Queue] */
    public final void h() {
        synchronized (this) {
            defpackage.ysr.bj(this.g != null);
        }
        defpackage.ysr.bj(!((java.lang.Boolean) this.e.get()).booleanValue());
        this.c.readLock().lock();
        try {
            for (java.util.Map.Entry entry : this.d.entrySet()) {
                defpackage.vbc vbcVar = (defpackage.vbc) entry.getKey();
                if (vbcVar instanceof defpackage.vbg) {
                    throw null;
                }
                ((defpackage.htw) this.b.get()).a.offer((defpackage.vbd) entry.getValue());
            }
            this.c.readLock().unlock();
            defpackage.htw htwVar = (defpackage.htw) this.b.get();
            while (true) {
                defpackage.vbd vbdVar = (defpackage.vbd) htwVar.a.poll();
                if (vbdVar == null) {
                    return;
                } else {
                    vbdVar.a(this);
                }
            }
        } catch (java.lang.Throwable th) {
            this.c.readLock().unlock();
            throw th;
        }
    }

    @Override // defpackage.vba
    protected final void i() {
        java.lang.Runnable runnable;
        synchronized (this) {
            runnable = this.i;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.vba
    protected final void j() {
        java.lang.Runnable runnable;
        synchronized (this) {
            runnable = this.h;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final synchronized void k(java.lang.Runnable runnable) {
        this.i = runnable;
    }

    public final synchronized void l(java.lang.Runnable runnable) {
        this.h = runnable;
    }

    final synchronized void m(defpackage.xzi xziVar) {
        this.g = xziVar;
        defpackage.zif zifVar = this.f;
        if (zifVar != null) {
            zifVar.o(xziVar.fF());
            this.f = null;
        }
    }

    public final synchronized boolean n() {
        defpackage.zif zifVar = this.f;
        return zifVar == null || zifVar.isDone();
    }

    public vaw(defpackage.xzi xziVar) {
        this.h = null;
        this.i = null;
        this.g = xziVar;
        this.f = null;
    }
}
