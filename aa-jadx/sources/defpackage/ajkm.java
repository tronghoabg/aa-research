package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ajkm implements java.lang.Cloneable {
    public final defpackage.ajiz a;
    public final defpackage.ajjc b;
    public final defpackage.ajkp c;
    public final defpackage.ajkl d;
    public final java.util.concurrent.atomic.AtomicBoolean e;
    public defpackage.ajkn f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public volatile boolean m;
    public final java.util.concurrent.CopyOnWriteArrayList n;
    public defpackage.ajki o;
    public defpackage.sdv p;
    public volatile defpackage.sdv q;
    private java.lang.Object r;

    public ajkm(defpackage.ajiz ajizVar, defpackage.ajjc ajjcVar) {
        this.a = ajizVar;
        this.b = ajjcVar;
        this.c = (defpackage.ajkp) ajizVar.r.a;
        java.util.TimeZone timeZone = defpackage.ajjs.a;
        defpackage.ajkl ajklVar = new defpackage.ajkl(this);
        ajklVar.k(0L, java.util.concurrent.TimeUnit.MILLISECONDS);
        this.d = ajklVar;
        this.e = new java.util.concurrent.atomic.AtomicBoolean();
        this.l = true;
        this.n = new java.util.concurrent.CopyOnWriteArrayList();
        new java.util.concurrent.atomic.AtomicReference(ajjcVar.e);
    }

    private final java.io.IOException j(java.io.IOException iOException) {
        java.io.IOException iOException2;
        java.io.InterruptedIOException interruptedIOException;
        java.net.Socket socketC;
        java.util.TimeZone timeZone = defpackage.ajjs.a;
        defpackage.ajkn ajknVar = this.f;
        if (ajknVar != null) {
            synchronized (ajknVar) {
                socketC = c();
            }
            if (this.f == null) {
                if (socketC != null) {
                    defpackage.ajjs.g(socketC);
                }
            } else if (socketC != null) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
        }
        if (!this.g && this.d.e()) {
            interruptedIOException = new java.io.InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2 = interruptedIOException;
                interruptedIOException.initCause(iOException);
                iOException2 = interruptedIOException;
            }
        } else {
            iOException2 = iOException;
        }
        if (iOException != null) {
            iOException2.getClass();
        }
        return iOException2;
    }

    public final java.io.IOException a(java.io.IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.l) {
                this.l = false;
                if (!this.h && !this.i && !this.j && !this.k) {
                    z = true;
                }
            }
        }
        return z ? j(iOException) : iOException;
    }

    public final java.lang.String b() {
        return this.b.a.e();
    }

    public final java.net.Socket c() {
        defpackage.ajkn ajknVar = this.f;
        ajknVar.getClass();
        java.util.TimeZone timeZone = defpackage.ajjs.a;
        java.util.List list = ajknVar.l;
        java.util.Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (defpackage.afga.f(((java.lang.ref.Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        list.remove(i);
        this.f = null;
        if (list.isEmpty()) {
            ajknVar.m = java.lang.System.nanoTime();
            defpackage.ajkp ajkpVar = this.c;
            if (ajknVar.g) {
                ajknVar.f();
                j$.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (j$.util.concurrent.ConcurrentLinkedQueue) ajkpVar.d;
                concurrentLinkedQueue.remove(ajknVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    ((defpackage.ajjw) ajkpVar.c).a();
                }
                return ajknVar.c;
            }
            ajkpVar.a();
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() {
        return new defpackage.ajkm(this.a, this.b);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0069  */
    public final defpackage.ajjf d() throws java.lang.Throwable {
        boolean z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.ajiz ajizVar = this.a;
        defpackage.afga.bk(arrayList, ajizVar.d);
        arrayList.add(new defpackage.ajlg());
        arrayList.add(new defpackage.ajkw(ajizVar.f));
        arrayList.add(new defpackage.ajjt());
        arrayList.add(defpackage.ajjz.a);
        defpackage.afga.bk(arrayList, ajizVar.e);
        arrayList.add(defpackage.ajky.a);
        defpackage.ajjc ajjcVar = this.b;
        try {
            defpackage.ajjf ajjfVarA = new defpackage.ajle(this, arrayList, 0, null, ajjcVar).a(ajjcVar);
            if (!this.m) {
                a(null);
                return ajjfVarA;
            }
            int i = defpackage.ajjq.a;
            defpackage.a.d(ajjfVarA);
            throw new java.io.IOException("Canceled");
        } catch (java.io.IOException e) {
            try {
                java.io.IOException iOExceptionA = a(e);
                iOExceptionA.getClass();
                throw iOExceptionA;
            } catch (java.lang.Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    a(null);
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            z = false;
            if (!z) {
                a(null);
            }
            throw th;
        }
    }

    public final void e(defpackage.ajkn ajknVar) {
        java.util.TimeZone timeZone = defpackage.ajjs.a;
        if (this.f != null) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        this.f = ajknVar;
        ajknVar.l.add(new defpackage.ajkk(this, this.r));
    }

    public final void f() {
        this.r = defpackage.ajmy.c.i();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [ajlc, java.lang.Object] */
    public final void g() {
        if (this.m) {
            return;
        }
        this.m = true;
        defpackage.sdv sdvVar = this.q;
        if (sdvVar != null) {
            sdvVar.c.e();
        }
        java.util.Iterator it = this.n.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((defpackage.ajkt) it.next()).g();
        }
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [ajlc, java.lang.Object] */
    public final void h(boolean z) {
        defpackage.sdv sdvVar;
        synchronized (this) {
            if (!this.l) {
                throw new java.lang.IllegalStateException("released");
            }
        }
        if (z && (sdvVar = this.q) != null) {
            sdvVar.c.e();
            ((defpackage.ajkm) sdvVar.e).i(sdvVar, true, true, true, true, null);
        }
        this.p = null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0024 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:8:0x000f, B:24:0x002b, B:26:0x002f, B:28:0x0033, B:30:0x0037, B:31:0x0039, B:33:0x003d, B:35:0x0041, B:37:0x0045, B:42:0x004e, B:14:0x0018, B:17:0x001e, B:20:0x0024), top: B:64:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0029 A[DONT_INVERT, PHI: r7
  0x0029: PHI (r7v3 boolean) = (r7v0 boolean), (r7v5 boolean), (r7v0 boolean), (r7v0 boolean) binds: [B:9:0x0011, B:22:0x0028, B:18:0x0020, B:15:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x002b A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:8:0x000f, B:24:0x002b, B:26:0x002f, B:28:0x0033, B:30:0x0037, B:31:0x0039, B:33:0x003d, B:35:0x0041, B:37:0x0045, B:42:0x004e, B:14:0x0018, B:17:0x001e, B:20:0x0024), top: B:64:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:26:0x002f A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:8:0x000f, B:24:0x002b, B:26:0x002f, B:28:0x0033, B:30:0x0037, B:31:0x0039, B:33:0x003d, B:35:0x0041, B:37:0x0045, B:42:0x004e, B:14:0x0018, B:17:0x001e, B:20:0x0024), top: B:64:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0033 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:8:0x000f, B:24:0x002b, B:26:0x002f, B:28:0x0033, B:30:0x0037, B:31:0x0039, B:33:0x003d, B:35:0x0041, B:37:0x0045, B:42:0x004e, B:14:0x0018, B:17:0x001e, B:20:0x0024), top: B:64:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0037 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:8:0x000f, B:24:0x002b, B:26:0x002f, B:28:0x0033, B:30:0x0037, B:31:0x0039, B:33:0x003d, B:35:0x0041, B:37:0x0045, B:42:0x004e, B:14:0x0018, B:17:0x001e, B:20:0x0024), top: B:64:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:33:0x003d A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:8:0x000f, B:24:0x002b, B:26:0x002f, B:28:0x0033, B:30:0x0037, B:31:0x0039, B:33:0x003d, B:35:0x0041, B:37:0x0045, B:42:0x004e, B:14:0x0018, B:17:0x001e, B:20:0x0024), top: B:64:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:40:0x004b  */
    /* JADX WARN: Code duplicated, block: B:42:0x004e A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:8:0x000f, B:24:0x002b, B:26:0x002f, B:28:0x0033, B:30:0x0037, B:31:0x0039, B:33:0x003d, B:35:0x0041, B:37:0x0045, B:42:0x004e, B:14:0x0018, B:17:0x001e, B:20:0x0024), top: B:64:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0055  */
    public final java.io.IOException i(defpackage.sdv sdvVar, boolean z, boolean z2, boolean z3, boolean z4, java.io.IOException iOException) {
        boolean z5;
        boolean z6;
        boolean z7;
        if (defpackage.afga.f(sdvVar, this.q)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (this.h) {
                            if (z) {
                                this.h = false;
                            }
                            if (z2) {
                                this.i = false;
                            }
                            if (z4) {
                                this.j = false;
                            }
                            if (z3) {
                                this.k = false;
                            }
                            if (this.h) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                z5 = z7;
                                z6 = false;
                            } else {
                                z5 = z7;
                                z6 = false;
                            }
                        } else if ((!z2 && this.i) || (z4 && this.j)) {
                            if (z) {
                                this.h = false;
                            }
                            if (z2) {
                                this.i = false;
                            }
                            if (z4) {
                                this.j = false;
                            }
                            if (z3) {
                                this.k = false;
                            }
                            if (this.h) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                z5 = z7;
                                z6 = false;
                            } else {
                                z5 = z7;
                                z6 = false;
                            }
                        } else if (z3 || !this.k) {
                            z6 = false;
                        } else {
                            z3 = true;
                            if (z) {
                                this.h = false;
                            }
                            if (z2) {
                                this.i = false;
                            }
                            if (z4) {
                                this.j = false;
                            }
                            if (z3) {
                                this.k = false;
                            }
                            if (this.h || this.i || this.j || this.k) {
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                            if (z7 || this.l) {
                                z5 = z7;
                                z6 = false;
                            } else {
                                z5 = z7;
                                z6 = true;
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                } else if (!z2) {
                    if (z3) {
                    }
                    z6 = false;
                } else {
                    if (z3) {
                    }
                    z6 = false;
                }
            }
            if (z5) {
                this.q = null;
                defpackage.ajkn ajknVar = this.f;
                if (ajknVar != null) {
                    synchronized (ajknVar) {
                        ajknVar.j++;
                    }
                }
            }
            if (z6) {
                return j(iOException);
            }
        }
        return iOException;
    }
}
