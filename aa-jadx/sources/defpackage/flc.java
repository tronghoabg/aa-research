package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class flc implements java.lang.Runnable {
    private final /* synthetic */ int a;
    private final java.lang.Object b;
    private final java.lang.Object c;

    public flc(defpackage.fpe fpeVar, java.lang.Runnable runnable, int i) {
        this.a = i;
        this.b = fpeVar;
        this.c = runnable;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future, zhs] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.concurrent.Future, zhs] */
    /* JADX WARN: Type inference failed for: r3v0, types: [aiuf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aiuf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [afdk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [afdk, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i == 0) {
            ?? r0 = this.b;
            boolean zIsCancelled = r0.isCancelled();
            ?? r3 = this.c;
            if (zIsCancelled) {
                r3.g(null);
                return;
            }
            try {
                r3.w(defpackage.fmh.b(r0));
                return;
            } catch (java.util.concurrent.ExecutionException e) {
                this.c.w(defpackage.afga.cy(defpackage.fmh.c(e)));
                return;
            }
        }
        if (i == 1) {
            ?? r1 = this.b;
            boolean zIsCancelled2 = r1.isCancelled();
            ?? r4 = this.c;
            if (zIsCancelled2) {
                r4.g(null);
                return;
            }
            try {
                int i2 = defpackage.dod.c;
                r4.w(defpackage.a.K(r1));
                return;
            } catch (java.util.concurrent.ExecutionException e2) {
                this.c.w(defpackage.afga.cy(defpackage.vz.i(e2)));
                return;
            }
        }
        if (i != 2) {
            defpackage.vbn.d();
            ((defpackage.unu) this.b).c.lock();
            try {
                this.c.run();
                return;
            } finally {
                ((defpackage.unu) this.b).c.unlock();
            }
        }
        try {
            this.c.run();
            java.lang.Object obj = this.b;
            synchronized (((defpackage.fpe) obj).a) {
                ((defpackage.fpe) obj).a();
            }
        } catch (java.lang.Throwable th) {
            java.lang.Object obj2 = this.b;
            synchronized (((defpackage.fpe) obj2).a) {
                ((defpackage.fpe) obj2).a();
                throw th;
            }
        }
    }

    public flc(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
