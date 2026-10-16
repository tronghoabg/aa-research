package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class adui implements adti {
    private final java.lang.String a;
    private volatile boolean b;
    private adtk c;
    private defpackage.ador d;
    public adti f;
    private defpackage.aduh g;
    private long h;
    private long i;
    private java.util.List e = new java.util.ArrayList();
    private java.util.List j = new java.util.ArrayList();

    public adui(java.lang.String str) {
        this.a = str;
    }

    private final void p(java.lang.Runnable runnable) {
        defpackage.ysr.bk(this.c != null, "May only be called after start");
        synchronized (this) {
            if (this.b) {
                runnable.run();
            } else {
                this.e.add(runnable);
            }
        }
    }

    private final void q(adtk adtkVar) {
        java.util.Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        this.j = null;
        this.f.m(adtkVar);
    }

    private final void u(adti adtiVar) {
        adti adtiVar2 = this.f;
        defpackage.ysr.bn(adtiVar2 == null, "realStream already set to %s", adtiVar2);
        this.f = adtiVar;
        this.i = java.lang.System.nanoTime();
    }

    public final defpackage.adjs a() {
        throw null;
    }

    public void b(defpackage.advl advlVar) {
        synchronized (this) {
            if (this.c == null) {
                return;
            }
            adti adtiVar = this.f;
            java.lang.String str = this.a;
            if (adtiVar != null) {
                advlVar.b(str + "_delay", (this.i - this.h) + "ns");
                this.f.b(advlVar);
            } else {
                advlVar.b(str + "_delay", (java.lang.System.nanoTime() - this.h) + "ns");
                advlVar.a("was_still_waiting");
            }
        }
    }

    public void c(defpackage.ador adorVar) {
        boolean z = true;
        defpackage.ysr.bk(this.c != null, "May only be called after start");
        adorVar.getClass();
        synchronized (this) {
            if (this.f == null) {
                u(defpackage.adxt.a);
                this.d = adorVar;
                z = false;
            }
        }
        if (z) {
            p(new defpackage.aafx(this, adorVar, 14, (byte[]) null));
            return;
        }
        t();
        r();
        this.c.a(adorVar, defpackage.adtj.a, new defpackage.adnd());
    }

    public final void d() {
        defpackage.ysr.bk(this.c != null, "May only be called after start");
        if (this.b) {
            this.f.d();
        } else {
            p(new defpackage.adug(this, 1));
        }
    }

    public final void e() {
        defpackage.ysr.bk(this.c != null, "May only be called after start");
        p(new defpackage.adug(this, 0));
    }

    public final void f() {
        defpackage.ysr.bk(this.c == null, "May only be called before start");
        this.j.add(new defpackage.adkj(this, 19));
    }

    public final void g(int i) {
        defpackage.ysr.bk(this.c != null, "May only be called after start");
        if (this.b) {
            this.f.g(i);
        } else {
            p(new defpackage.adtz(this, i, 2));
        }
    }

    public final void h(adke adkeVar) {
        defpackage.ysr.bk(this.c == null, "May only be called before start");
        this.j.add(new defpackage.aafx(this, adkeVar, 10, (byte[]) null));
    }

    public final void i(defpackage.adks adksVar) {
        defpackage.ysr.bk(this.c == null, "May only be called before start");
        this.j.add(new defpackage.aafx(this, adksVar, 12, (byte[]) null));
    }

    public final void j(defpackage.adku adkuVar) {
        defpackage.ysr.bk(this.c == null, "May only be called before start");
        adkuVar.getClass();
        this.j.add(new defpackage.aafx(this, adkuVar, 11, (byte[]) null));
    }

    public final void k(int i) {
        defpackage.ysr.bk(this.c == null, "May only be called before start");
        this.j.add(new defpackage.adtz(this, i, 3));
    }

    public final void l(int i) {
        defpackage.ysr.bk(this.c == null, "May only be called before start");
        this.j.add(new defpackage.adtz(this, i, 4));
    }

    public final void m(adtk adtkVar) {
        defpackage.ador adorVar;
        boolean z;
        defpackage.ysr.bk(this.c == null, "already started");
        synchronized (this) {
            adorVar = this.d;
            z = this.b;
            if (!z) {
                defpackage.aduh aduhVar = new defpackage.aduh(adtkVar);
                this.g = aduhVar;
                adtkVar = aduhVar;
            }
            this.c = adtkVar;
            this.h = java.lang.System.nanoTime();
        }
        if (adorVar != null) {
            adtkVar.a(adorVar, defpackage.adtj.a, new defpackage.adnd());
        } else if (z) {
            q(adtkVar);
        }
    }

    public final void n(java.io.InputStream inputStream) {
        defpackage.ysr.bk(this.c != null, "May only be called after start");
        if (this.b) {
            this.f.n(inputStream);
        } else {
            p(new defpackage.aafx(this, inputStream, 13, (char[]) null));
        }
    }

    public final boolean o() {
        if (this.b) {
            return this.f.o();
        }
        return false;
    }

    public final java.lang.Runnable s(adti adtiVar) {
        synchronized (this) {
            if (this.f == null) {
                adtiVar.getClass();
                u(adtiVar);
                adtk adtkVar = this.c;
                if (adtkVar == null) {
                    this.e = null;
                    this.b = true;
                }
                if (adtkVar != null) {
                    q(adtkVar);
                    return new defpackage.adkj(this, 20);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d A[Catch: all -> 0x004b, TryCatch #0 {, blocks: (B:11:0x001f, B:13:0x0027, B:14:0x002b, B:16:0x002d, B:17:0x0031), top: B:37:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[LOOP:3: B:19:0x0036->B:21:0x003c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        if (r0.hasNext() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r5)
            java.util.List r1 = r5.e     // Catch: java.lang.Throwable -> L6d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L4f
            r0 = 0
            r5.e = r0     // Catch: java.lang.Throwable -> L6d
            r1 = 1
            r5.b = r1     // Catch: java.lang.Throwable -> L6d
            aduh r2 = r5.g     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L4e
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List r3 = r2.c     // Catch: java.lang.Throwable -> L4b
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L2d
            r2.c = r0     // Catch: java.lang.Throwable -> L4b
            r2.b = r1     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            return
        L2d:
            java.util.List r3 = r2.c     // Catch: java.lang.Throwable -> L4b
            r2.c = r5     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            java.util.Iterator r5 = r3.iterator()
        L36:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L46
            java.lang.Object r4 = r5.next()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r4.run()
            goto L36
        L46:
            r3.clear()
            r5 = r3
            goto L1e
        L4b:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            throw r5
        L4e:
            return
        L4f:
            java.util.List r1 = r5.e     // Catch: java.lang.Throwable -> L6d
            r5.e = r0     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r0 = r1.iterator()
        L58:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L58
        L68:
            r1.clear()
            r0 = r1
            goto L5
        L6d:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adui.t():void");
    }

    protected void r() {
    }
}
