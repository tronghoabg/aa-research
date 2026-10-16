package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bie extends defpackage.bip {
    public defpackage.bis a;
    private aiwg c;
    private ajaj d;

    private final void m(defpackage.affc affcVar) {
        defpackage.bin binVar = this.b;
        if (binVar == null) {
            return;
        }
        this.c = binVar.A ? ahoc.d(binVar.N(), (defpackage.afdo) null, 4, new defpackage.bej(binVar, new defpackage.bid(affcVar, this, binVar, (defpackage.afdk) null, 0), (defpackage.afdk) null, 4), 1) : null;
    }

    public final ajaj a() {
        ajaj ajajVar = this.d;
        if (ajajVar != null) {
            return ajajVar;
        }
        if (!defpackage.bhz.a) {
            return null;
        }
        ajaj ajajVarE = ajap.e(1, 0, 3, 2);
        this.d = ajajVarE;
        return ajajVarE;
    }

    @Override // defpackage.bip, defpackage.djy
    public final void b(defpackage.cjj cjjVar) {
        android.graphics.Rect rect;
        defpackage.bis bisVar = this.a;
        if (bisVar != null) {
            bisVar.k = new android.graphics.Rect(defpackage.afhi.k(cjjVar.b), defpackage.afhi.k(cjjVar.c), defpackage.afhi.k(cjjVar.d), defpackage.afhi.k(cjjVar.e));
            if (!bisVar.i.isEmpty() || (rect = bisVar.k) == null) {
                return;
            }
            bisVar.a.requestRectangleOnScreen(new android.graphics.Rect(rect));
        }
    }

    @Override // defpackage.bip, defpackage.djy
    public final void c() {
        m(null);
    }

    @Override // defpackage.djy
    public final void d(defpackage.dkd dkdVar, defpackage.djl djlVar, defpackage.affc affcVar, defpackage.affc affcVar2) {
        m(new defpackage.bia(dkdVar, this, djlVar, affcVar, affcVar2, 0));
    }

    @Override // defpackage.bip
    public final void e() {
        ajaj ajajVarA = a();
        if (ajajVarA != null) {
            ajajVarA.c(defpackage.afbk.a);
        }
    }

    @Override // defpackage.djy
    public final void f() {
        aiwg aiwgVar = this.c;
        if (aiwgVar != null) {
            aiwgVar.s((java.util.concurrent.CancellationException) null);
        }
        this.c = null;
        ajao ajaoVarA = a();
        if (ajaoVarA != null) {
            synchronized (ajaoVarA) {
                ajaoVarA.k(ajaoVarA.d(), ajaoVarA.c, ajaoVarA.d(), ajaoVarA.f());
            }
        }
    }

    @Override // defpackage.djy
    public final void g(defpackage.dkd dkdVar, defpackage.dkd dkdVar2) {
        defpackage.bis bisVar = this.a;
        if (bisVar != null) {
            long j = bisVar.g.b;
            long j2 = dkdVar2.b;
            long j3 = defpackage.dgc.a;
            boolean zI = defpackage.a.i(j, j2);
            boolean z = true;
            if (zI && defpackage.afga.f(bisVar.g.c, dkdVar2.c)) {
                z = false;
            }
            bisVar.g = dkdVar2;
            java.util.List list = bisVar.i;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                defpackage.bit bitVar = (defpackage.bit) ((java.lang.ref.WeakReference) list.get(i)).get();
                if (bitVar != null) {
                    bitVar.a = dkdVar2;
                }
            }
            defpackage.bio bioVar = bisVar.l;
            synchronized (bioVar.a) {
                bioVar.h = null;
                bioVar.j = null;
                bioVar.i = null;
                bioVar.k = null;
                bioVar.l = null;
            }
            if (defpackage.afga.f(dkdVar, dkdVar2)) {
                if (z) {
                    defpackage.bil bilVar = bisVar.m;
                    long j4 = dkdVar2.b;
                    int iD = defpackage.dgc.d(j4);
                    int iC = defpackage.dgc.c(j4);
                    defpackage.dgc dgcVar = bisVar.g.c;
                    int iD2 = dgcVar != null ? defpackage.dgc.d(dgcVar.b) : -1;
                    defpackage.dgc dgcVar2 = bisVar.g.c;
                    bilVar.b(iD, iC, iD2, dgcVar2 != null ? defpackage.dgc.c(dgcVar2.b) : -1);
                    return;
                }
                return;
            }
            if (dkdVar != null && (!defpackage.afga.f(dkdVar.a(), dkdVar2.a()) || (defpackage.a.i(dkdVar.b, dkdVar2.b) && !defpackage.afga.f(dkdVar.c, dkdVar2.c)))) {
                defpackage.bil bilVar2 = bisVar.m;
                bilVar2.a().restartInput((android.view.View) bilVar2.a);
                return;
            }
            java.util.List list2 = bisVar.i;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                defpackage.bit bitVar2 = (defpackage.bit) ((java.lang.ref.WeakReference) list2.get(i2)).get();
                if (bitVar2 != null) {
                    defpackage.dkd dkdVar3 = bisVar.g;
                    defpackage.bil bilVar3 = bisVar.m;
                    if (bitVar2.d) {
                        bitVar2.a = dkdVar3;
                        if (bitVar2.c) {
                            bilVar3.a().updateExtractedText((android.view.View) bilVar3.a, bitVar2.b, defpackage.acmj.p(dkdVar3));
                        }
                        defpackage.dgc dgcVar3 = dkdVar3.c;
                        int iD3 = dgcVar3 != null ? defpackage.dgc.d(dgcVar3.b) : -1;
                        int iC2 = dgcVar3 != null ? defpackage.dgc.c(dgcVar3.b) : -1;
                        long j5 = dkdVar3.b;
                        bilVar3.b(defpackage.dgc.d(j5), defpackage.dgc.c(j5), iD3, iC2);
                    }
                }
            }
        }
    }

    @Override // defpackage.bip, defpackage.djy
    public final void h(defpackage.dkd dkdVar, defpackage.djv djvVar, defpackage.dga dgaVar, defpackage.affc affcVar, defpackage.cjj cjjVar, defpackage.cjj cjjVar2) {
        defpackage.bis bisVar = this.a;
        if (bisVar != null) {
            defpackage.bio bioVar = bisVar.l;
            synchronized (bioVar.a) {
                bioVar.h = dkdVar;
                bioVar.j = djvVar;
                bioVar.i = dgaVar;
                bioVar.k = cjjVar;
                bioVar.l = cjjVar2;
                if (bioVar.c || bioVar.b) {
                    bioVar.a();
                }
            }
        }
    }
}
