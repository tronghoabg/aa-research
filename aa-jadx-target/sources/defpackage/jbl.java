package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
class jbl {
    protected final defpackage.jei f;
    final /* synthetic */ defpackage.jbm i;
    protected final java.util.ArrayDeque e = new java.util.ArrayDeque();
    public final java.util.concurrent.atomic.AtomicLong g = new java.util.concurrent.atomic.AtomicLong(0);
    protected volatile boolean h = false;

    public jbl(defpackage.jbm jbmVar, defpackage.jei jeiVar) {
        this.i = jbmVar;
        this.f = jeiVar;
    }

    public long b() {
        return 0L;
    }

    public synchronized defpackage.izt c() {
        return (defpackage.izt) this.e.getFirst();
    }

    public defpackage.jei d() {
        return this.f;
    }

    public synchronized void e(defpackage.izt iztVar) {
        java.util.ArrayDeque arrayDeque = this.e;
        boolean zIsEmpty = arrayDeque.isEmpty();
        arrayDeque.add(iztVar);
        if (zIsEmpty) {
            this.i.c(this);
            this.g.set(android.os.SystemClock.elapsedRealtimeNanos());
        }
    }

    public synchronized void g(int i, java.io.PrintWriter printWriter) {
        printWriter.format(" %d messages on channel %d, priority = %d%n", java.lang.Integer.valueOf(this.e.size()), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(d().j));
    }

    protected void h() throws java.io.IOException {
        j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0125, code lost:
    
        ((iyv) r14.next()).b.h(r23, r25, r26, r4, r28);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i() throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jbl.i():void");
    }

    protected final synchronized defpackage.izt j() {
        defpackage.izt iztVar;
        java.util.ArrayDeque arrayDeque = this.e;
        iztVar = (defpackage.izt) arrayDeque.removeFirst();
        defpackage.jbm jbmVar = this.i;
        jbmVar.h(this);
        if (arrayDeque.isEmpty()) {
            this.g.set(0L);
        } else {
            jbmVar.c(this);
        }
        return iztVar;
    }

    final synchronized void k() {
        while (true) {
            java.util.ArrayDeque arrayDeque = this.e;
            if (!arrayDeque.isEmpty()) {
                ((defpackage.izt) arrayDeque.remove()).c.close();
            }
        }
    }

    public void f() {
    }
}
