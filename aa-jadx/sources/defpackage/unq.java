package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class unq implements defpackage.unp {
    private boolean a = false;
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private final java.util.Set h = new java.util.HashSet();

    @Override // defpackage.unp
    public final void c() {
        synchronized (this) {
            if (this.e) {
                return;
            }
            this.e = true;
            defpackage.yot it = defpackage.yhx.n(this.h).iterator();
            while (it.hasNext()) {
                ((defpackage.tsj) it.next()).a();
            }
        }
    }

    @Override // defpackage.unp
    public final void d() {
        synchronized (this) {
            if (this.d) {
                return;
            }
            this.d = true;
            defpackage.yot it = defpackage.yhx.n(this.h).iterator();
            while (it.hasNext()) {
                ((defpackage.tsj) it.next()).b();
            }
        }
    }

    @Override // defpackage.unp
    public final void e() {
        synchronized (this) {
            if (this.g) {
                return;
            }
            this.g = true;
            defpackage.yot it = defpackage.yhx.n(this.h).iterator();
            while (it.hasNext()) {
                ((defpackage.tsj) it.next()).c();
            }
        }
    }

    @Override // defpackage.unp
    public final void f() {
        synchronized (this) {
            if (this.f) {
                return;
            }
            this.f = true;
            defpackage.yot it = defpackage.yhx.n(this.h).iterator();
            while (it.hasNext()) {
                ((defpackage.tsj) it.next()).d();
            }
        }
    }

    @Override // defpackage.uzh
    public final void fB(java.lang.String str, java.io.PrintWriter printWriter) {
        printWriter.println(str.concat("MapStartupEventTrackerImpl"));
        synchronized (this) {
            printWriter.println(str + "  firstFullViewportRecorded: " + this.a);
            printWriter.println(str + "  hasLoggedFirstMapTile: " + this.b);
            printWriter.println(str + "  hasLoggedFirstBasemapLabel: " + this.c);
            printWriter.println(str + "  hasLoggedBasemapTiles: " + this.d);
            printWriter.println(str + "  hasLoggedBasemapLabels: " + this.e);
            printWriter.println(str + "  hasLoggedLastMapTile: " + this.f);
            printWriter.println(str + "  hasLoggedAllLabelsPlaced: " + this.g);
        }
    }

    @Override // defpackage.unp
    public final void g() {
        synchronized (this) {
            if (this.c) {
                return;
            }
            this.c = true;
            defpackage.yot it = defpackage.yhx.n(this.h).iterator();
            while (it.hasNext()) {
                ((defpackage.tsj) it.next()).f();
            }
        }
    }

    @Override // defpackage.unp
    public final void h() {
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            defpackage.yot it = defpackage.yhx.n(this.h).iterator();
            while (it.hasNext()) {
                ((defpackage.tsj) it.next()).g();
            }
        }
    }

    @Override // defpackage.unp
    public final void i() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            defpackage.yot it = defpackage.yhx.n(this.h).iterator();
            while (it.hasNext()) {
                ((defpackage.tsj) it.next()).e();
            }
        }
    }

    @Override // defpackage.unp
    public final void j() {
        defpackage.yhx yhxVarN;
        synchronized (this) {
            yhxVarN = defpackage.yhx.n(this.h);
        }
        defpackage.yot it = yhxVarN.iterator();
        while (it.hasNext()) {
            ((defpackage.tsj) it.next()).h();
        }
    }

    @Override // defpackage.unp
    public final void k() {
        defpackage.yhx yhxVarN;
        synchronized (this) {
            yhxVarN = defpackage.yhx.n(this.h);
        }
        defpackage.yot it = yhxVarN.iterator();
        while (it.hasNext()) {
            ((defpackage.tsj) it.next()).i();
        }
    }

    @Override // defpackage.unp
    public final void l() {
        defpackage.yhx yhxVarN;
        synchronized (this) {
            yhxVarN = defpackage.yhx.n(this.h);
        }
        defpackage.yot it = yhxVarN.iterator();
        while (it.hasNext()) {
            ((defpackage.tsj) it.next()).j();
        }
    }

    @Override // defpackage.unp
    public final void m() {
        defpackage.yhx yhxVarN;
        synchronized (this) {
            yhxVarN = defpackage.yhx.n(this.h);
        }
        defpackage.yot it = yhxVarN.iterator();
        while (it.hasNext()) {
            ((defpackage.tsj) it.next()).k();
        }
    }

    @Override // defpackage.unp
    public final synchronized void n(defpackage.abho abhoVar) {
    }

    @Override // defpackage.unp
    public final synchronized void o(defpackage.abho abhoVar) {
    }

    @Override // defpackage.unp
    public final synchronized void q(defpackage.tsj tsjVar) {
        this.h.add(tsjVar);
    }

    @Override // defpackage.unp
    public final synchronized void s(defpackage.tsj tsjVar) {
        this.h.remove(tsjVar);
    }

    @Override // defpackage.unp
    public final void r() {
    }

    @Override // defpackage.unp
    public final void p(long j) {
    }
}
