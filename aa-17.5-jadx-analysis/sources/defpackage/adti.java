package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class adti implements adsh {
    private final String a;
    private volatile boolean b;
    private adsj c;
    private adnq d;
    public adsh f;
    private adth g;
    private long h;
    private long i;
    private List e = new ArrayList();
    private List j = new ArrayList();

    public adti(String str) {
        this.a = str;
    }

    private final void p(Runnable runnable) {
        woy.aa(this.c != null, "May only be called after start");
        synchronized (this) {
            if (this.b) {
                runnable.run();
            } else {
                this.e.add(runnable);
            }
        }
    }

    private final void q(adsj adsjVar) {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.j = null;
        this.f.m(adsjVar);
    }

    private final void u(adsh adshVar) {
        adsh adshVar2 = this.f;
        woy.ad(adshVar2 == null, "realStream already set to %s", adshVar2);
        this.f = adshVar;
        this.i = System.nanoTime();
    }

    @Override // defpackage.adsh
    public final adis a() {
        throw null;
    }

    @Override // defpackage.adsh
    public void b(aduk adukVar) {
        synchronized (this) {
            if (this.c == null) {
                return;
            }
            adsh adshVar = this.f;
            String str = this.a;
            if (adshVar != null) {
                adukVar.b(str + "_delay", (this.i - this.h) + "ns");
                this.f.b(adukVar);
            } else {
                adukVar.b(str + "_delay", (System.nanoTime() - this.h) + "ns");
                adukVar.a("was_still_waiting");
            }
        }
    }

    @Override // defpackage.adsh
    public void c(adnq adnqVar) {
        boolean z = true;
        woy.aa(this.c != null, "May only be called after start");
        adnqVar.getClass();
        synchronized (this) {
            if (this.f == null) {
                u(adws.a);
                this.d = adnqVar;
                z = false;
            }
        }
        if (z) {
            p(new adsy(this, adnqVar, 9));
            return;
        }
        t();
        r();
        this.c.a(adnqVar, adsi.a, new admc());
    }

    @Override // defpackage.adzw
    public final void d() {
        woy.aa(this.c != null, "May only be called after start");
        if (this.b) {
            this.f.d();
        } else {
            p(new adpo(this, 12, null));
        }
    }

    @Override // defpackage.adsh
    public final void e() {
        woy.aa(this.c != null, "May only be called after start");
        p(new adpo(this, 13, null));
    }

    @Override // defpackage.adzw
    public final void f() {
        woy.aa(this.c == null, "May only be called before start");
        this.j.add(new adpo(this, 10, null));
    }

    @Override // defpackage.adzw
    public final void g(int i) {
        woy.aa(this.c != null, "May only be called after start");
        if (this.b) {
            this.f.g(i);
        } else {
            p(new adtf(this, i, 0));
        }
    }

    @Override // defpackage.adzw
    public final void h(adje adjeVar) {
        woy.aa(this.c == null, "May only be called before start");
        this.j.add(new adsy(this, adjeVar, 5));
    }

    @Override // defpackage.adsh
    public final void i(adjr adjrVar) {
        woy.aa(this.c == null, "May only be called before start");
        this.j.add(new adsy(this, adjrVar, 7));
    }

    @Override // defpackage.adsh
    public final void j(adjt adjtVar) {
        woy.aa(this.c == null, "May only be called before start");
        adjtVar.getClass();
        this.j.add(new adsy(this, adjtVar, 6));
    }

    @Override // defpackage.adsh
    public final void k(int i) {
        woy.aa(this.c == null, "May only be called before start");
        this.j.add(new adtf(this, i, 2));
    }

    @Override // defpackage.adsh
    public final void l(int i) {
        woy.aa(this.c == null, "May only be called before start");
        this.j.add(new adtf(this, i, 3));
    }

    @Override // defpackage.adsh
    public final void m(adsj adsjVar) {
        adnq adnqVar;
        boolean z;
        woy.aa(this.c == null, "already started");
        synchronized (this) {
            adnqVar = this.d;
            z = this.b;
            if (!z) {
                adth adthVar = new adth(adsjVar);
                this.g = adthVar;
                adsjVar = adthVar;
            }
            this.c = adsjVar;
            this.h = System.nanoTime();
        }
        if (adnqVar != null) {
            adsjVar.a(adnqVar, adsi.a, new admc());
        } else if (z) {
            q(adsjVar);
        }
    }

    @Override // defpackage.adzw
    public final void n(InputStream inputStream) {
        woy.aa(this.c != null, "May only be called after start");
        if (this.b) {
            this.f.n(inputStream);
        } else {
            p(new adsy(this, inputStream, 8, (char[]) null));
        }
    }

    @Override // defpackage.adzw
    public final boolean o() {
        if (this.b) {
            return this.f.o();
        }
        return false;
    }

    public final Runnable s(adsh adshVar) {
        synchronized (this) {
            if (this.f == null) {
                adshVar.getClass();
                u(adshVar);
                adsj adsjVar = this.c;
                if (adsjVar == null) {
                    this.e = null;
                    this.b = true;
                }
                if (adsjVar != null) {
                    q(adsjVar);
                    return new adpo(this, 11, null);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        if (r0.hasNext() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
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
            adth r2 = r5.g     // Catch: java.lang.Throwable -> L6d
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adti.t():void");
    }

    protected void r() {
    }
}
