package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vlt implements java.util.concurrent.Executor, defpackage.vrf {
    public final defpackage.zhw a;
    private final defpackage.afak d;
    private final defpackage.vsl f;
    private final j$.util.concurrent.ConcurrentLinkedQueue b = new j$.util.concurrent.ConcurrentLinkedQueue();
    private volatile boolean c = false;
    private final java.util.concurrent.atomic.AtomicBoolean e = new java.util.concurrent.atomic.AtomicBoolean();

    public vlt(defpackage.zhw zhwVar, defpackage.vsl vslVar, defpackage.afak afakVar) {
        this.a = zhwVar;
        this.f = vslVar;
        this.d = afakVar;
        defpackage.vrh vrhVar = ((defpackage.vri) vslVar.a).a;
        int i = defpackage.vrh.c;
        if (vrhVar.b.get() > 0) {
            k();
        } else {
            vslVar.a(this);
        }
    }

    private final void j() {
        while (true) {
            java.lang.Runnable runnable = (java.lang.Runnable) this.b.poll();
            if (runnable == null) {
                return;
            } else {
                this.a.execute(runnable);
            }
        }
    }

    private final void k() {
        this.a.g(new defpackage.imt(this, 5), 3000L, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.vrf
    public final void c(android.app.Activity activity) {
        this.f.b(this);
        k();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        if (this.c) {
            this.a.execute(runnable);
            return;
        }
        this.b.add(runnable);
        if (this.c) {
            j();
        } else {
            if (this.e.getAndSet(true)) {
                return;
            }
            if (((java.lang.Boolean) ((defpackage.xyn) ((defpackage.aclu) this.d).b).d(java.lang.Boolean.FALSE)).booleanValue()) {
                android.os.Looper.getMainLooper().getQueue().addIdleHandler(new vls(this));
            } else {
                this.a.g(new defpackage.imt(this, 4), 7000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void g() {
        this.c = true;
        j();
    }

    @Override // defpackage.vrf
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.vrf
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.vrf
    public final /* synthetic */ void a(android.app.Activity activity) {
    }

    @Override // defpackage.vrf
    public final /* synthetic */ void b(android.app.Activity activity) {
    }

    @Override // defpackage.vrf
    public final /* synthetic */ void d(android.app.Activity activity) {
    }

    @Override // defpackage.vrf
    public final /* synthetic */ void e(android.app.Activity activity) {
    }

    @Override // defpackage.vrf
    public final /* synthetic */ void f(int i) {
    }
}
