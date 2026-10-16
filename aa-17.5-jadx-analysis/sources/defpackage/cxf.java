package defpackage;

/* loaded from: classes.dex */
public final class cxf {
    public final cxb a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public cxn p;
    public int q = 5;
    public final cxq o = new cxq(this);

    public cxf(cxb cxbVar) {
        this.a = cxbVar;
    }

    public final cyc a() {
        return this.a.v.d;
    }

    public final dle b() {
        cxq cxqVar = this.o;
        if (cxqVar.j) {
            return new dle(cxqVar.d);
        }
        return null;
    }

    public final dle c() {
        cxn cxnVar = this.p;
        if (cxnVar != null) {
            return cxnVar.l;
        }
        return null;
    }

    public final void d() {
        this.o.x = true;
        cxn cxnVar = this.p;
        if (cxnVar != null) {
            cxnVar.r = true;
        }
    }

    public final void e() {
        this.e = true;
        this.f = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r4 = this;
            cxb r0 = r4.a
            int r0 = r0.av()
            r1 = 3
            r2 = 4
            r3 = 1
            if (r0 == r1) goto Le
            if (r0 != r2) goto L1b
            r0 = r2
        Le:
            cxq r1 = r4.o
            boolean r1 = r1.y
            if (r1 == 0) goto L18
            r4.j(r3)
            goto L1b
        L18:
            r4.i(r3)
        L1b:
            if (r0 != r2) goto L2c
            cxn r0 = r4.p
            if (r0 == 0) goto L29
            boolean r0 = r0.s
            if (r0 != r3) goto L29
            r4.l(r3)
            return
        L29:
            r4.k(r3)
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxf.f():void");
    }

    public final void g(int i) {
        int i2 = this.k;
        this.k = i;
        if ((i2 == 0) != (i == 0)) {
            cxb cxbVarL = this.a.l();
            cxf cxfVar = cxbVarL != null ? cxbVarL.w : null;
            if (cxfVar != null) {
                if (i == 0) {
                    cxfVar.g(cxfVar.k - 1);
                } else {
                    cxfVar.g(cxfVar.k + 1);
                }
            }
        }
    }

    public final void h(int i) {
        int i2 = this.n;
        this.n = i;
        if ((i2 == 0) != (i == 0)) {
            cxb cxbVarL = this.a.l();
            cxf cxfVar = cxbVarL != null ? cxbVarL.w : null;
            if (cxfVar != null) {
                if (i == 0) {
                    cxfVar.h(cxfVar.n - 1);
                } else {
                    cxfVar.h(cxfVar.n + 1);
                }
            }
        }
    }

    public final void i(boolean z) {
        if (this.j != z) {
            this.j = z;
            boolean z2 = this.i;
            if (z) {
                if (z2) {
                    return;
                }
                g(this.k + 1);
            } else {
                if (z2) {
                    return;
                }
                g(this.k - 1);
            }
        }
    }

    public final void j(boolean z) {
        if (this.i != z) {
            this.i = z;
            boolean z2 = this.j;
            if (z) {
                if (z2) {
                    return;
                }
                g(this.k + 1);
            } else {
                if (z2) {
                    return;
                }
                g(this.k - 1);
            }
        }
    }

    public final void k(boolean z) {
        if (this.m != z) {
            this.m = z;
            boolean z2 = this.l;
            if (z) {
                if (z2) {
                    return;
                }
                h(this.n + 1);
            } else {
                if (z2) {
                    return;
                }
                h(this.n - 1);
            }
        }
    }

    public final void l(boolean z) {
        if (this.l != z) {
            this.l = z;
            boolean z2 = this.m;
            if (z) {
                if (z2) {
                    return;
                }
                h(this.n + 1);
            } else {
                if (z2) {
                    return;
                }
                h(this.n - 1);
            }
        }
    }

    public final void m() {
        cxq cxqVar = this.o;
        if ((cxqVar.r != null || cxqVar.q().g() != null) && cxqVar.q) {
            cxqVar.q = false;
            cxqVar.r = cxqVar.q().g();
            cxb cxbVarL = this.a.l();
            if (cxbVarL != null) {
                cxbVarL.X(false, true, true);
            }
        }
        cxn cxnVar = this.p;
        if (cxnVar != null) {
            if (cxnVar.u == null) {
                cxl cxlVarC = cxnVar.r().C();
                cxlVarC.getClass();
                if (cxlVarC.g() == null) {
                    return;
                }
            }
            if (cxnVar.t) {
                cxnVar.t = false;
                cxl cxlVarC2 = cxnVar.r().C();
                cxlVarC2.getClass();
                cxnVar.u = cxlVarC2.g();
                cxb cxbVar = this.a;
                if (cjn.s(cxbVar)) {
                    cxb cxbVarL2 = cxbVar.l();
                    if (cxbVarL2 != null) {
                        cxbVarL2.X(false, true, true);
                        return;
                    }
                    return;
                }
                cxb cxbVarL3 = cxbVar.l();
                if (cxbVarL3 != null) {
                    cxbVarL3.V(false, true, true);
                }
            }
        }
    }

    public final boolean n() {
        return this.o.v;
    }
}
