package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
abstract class zgk extends defpackage.zgl {
    private static final defpackage.zhr c = new defpackage.zhr(defpackage.zgk.class);
    private defpackage.ygm d;
    private final boolean e;
    private final boolean f;

    public zgk(defpackage.ygm ygmVar, boolean z, boolean z2) {
        super(ygmVar.size());
        ygmVar.getClass();
        this.d = ygmVar;
        this.e = z;
        this.f = z2;
    }

    private static boolean A(java.util.Set set, java.lang.Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    private final void x(int i, defpackage.zhs zhsVar) {
        try {
            e(i, defpackage.a.K(zhsVar));
        } catch (java.util.concurrent.ExecutionException e) {
            y(e.getCause());
        } catch (java.lang.Throwable th) {
            y(th);
        }
    }

    private final void y(java.lang.Throwable th) {
        th.getClass();
        if (this.e && !p(th)) {
            java.util.Set<java.lang.Throwable> set = this.seenExceptionsField;
            if (set == null) {
                java.util.Set setT = defpackage.ysr.t();
                d(setT);
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = defpackage.zgl.a;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, setT) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                set = this.seenExceptionsField;
                set.getClass();
            }
            if (A(set, th)) {
                z(th);
                return;
            }
        }
        if (th instanceof java.lang.Error) {
            z(th);
        }
    }

    private static void z(java.lang.Throwable th) {
        c.a().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof java.lang.Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    @Override // defpackage.zga
    protected final void b() {
        defpackage.ygm ygmVar = this.d;
        w(1);
        if ((ygmVar != null) && isCancelled()) {
            boolean zQ = q();
            defpackage.yot it = ygmVar.iterator();
            while (it.hasNext()) {
                ((defpackage.zhs) it.next()).cancel(zQ);
            }
        }
    }

    @Override // defpackage.zgl
    public final void d(java.util.Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        java.lang.Throwable thJ = j();
        thJ.getClass();
        A(set, thJ);
    }

    public abstract void e(int i, java.lang.Object obj);

    @Override // defpackage.zga
    protected final java.lang.String eW() {
        defpackage.ygm ygmVar = this.d;
        return ygmVar != null ? "futures=".concat(ygmVar.toString()) : super.eW();
    }

    public final void f(defpackage.ygm ygmVar) {
        int iDecrementAndGet = defpackage.zgl.b.decrementAndGet(this);
        int i = 0;
        defpackage.ysr.bk(iDecrementAndGet >= 0, "Less than 0 remaining futures");
        if (iDecrementAndGet == 0) {
            if (ygmVar != null) {
                defpackage.yot it = ygmVar.iterator();
                while (it.hasNext()) {
                    defpackage.zhs zhsVar = (defpackage.zhs) it.next();
                    if (!zhsVar.isCancelled()) {
                        x(i, zhsVar);
                    }
                    i++;
                }
            }
            this.seenExceptionsField = null;
            g();
            w(2);
        }
    }

    public abstract void g();

    final void u() {
        defpackage.ygm ygmVar = this.d;
        ygmVar.getClass();
        if (ygmVar.isEmpty()) {
            g();
            return;
        }
        boolean z = this.e;
        defpackage.ygm ygmVar2 = this.d;
        if (!z) {
            defpackage.ygm ygmVar3 = true != this.f ? null : ygmVar2;
            java.lang.Runnable zgjVar = new zgj(this, ygmVar3);
            defpackage.yot it = ygmVar2.iterator();
            while (it.hasNext()) {
                defpackage.zhs zhsVar = (defpackage.zhs) it.next();
                if (zhsVar.isDone()) {
                    f(ygmVar3);
                } else {
                    zhsVar.c(zgjVar, defpackage.zgt.INSTANCE);
                }
            }
            return;
        }
        defpackage.yot it2 = ygmVar2.iterator();
        final int i = 0;
        while (it2.hasNext()) {
            final defpackage.zhs zhsVar2 = (defpackage.zhs) it2.next();
            int i2 = i + 1;
            if (zhsVar2.isDone()) {
                v(i, zhsVar2);
            } else {
                zhsVar2.c(new java.lang.Runnable() { // from class: zgi
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.v(i, zhsVar2);
                    }
                }, defpackage.zgt.INSTANCE);
            }
            i = i2;
        }
    }

    public final void v(int i, defpackage.zhs zhsVar) {
        try {
            if (zhsVar.isCancelled()) {
                this.d = null;
                cancel(false);
            } else {
                x(i, zhsVar);
            }
        } finally {
            f(null);
        }
    }

    public void w(int i) {
        this.d = null;
    }
}
