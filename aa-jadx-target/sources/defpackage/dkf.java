package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dkf implements defpackage.djy {
    public final android.view.View a;
    public boolean b;
    public final defpackage.djc i;
    public java.lang.Runnable k;
    public boolean l;
    public final defpackage.ngb m;
    private final java.util.concurrent.Executor n;
    private final java.util.concurrent.Executor o;
    private android.graphics.Rect p;
    public defpackage.affc c = new defpackage.cyw(15);
    public defpackage.affc d = new defpackage.cyw(16);
    public defpackage.dkd e = new defpackage.dkd("", defpackage.dgc.a, 4);
    public defpackage.djl f = defpackage.djl.a;
    public final java.util.List g = new java.util.ArrayList();
    public final defpackage.afar h = defpackage.afga.cB(3, new defpackage.djm(this, 2));
    public final defpackage.bzc j = new defpackage.bzc(new defpackage.dke[16]);

    public dkf(android.view.View view, defpackage.cqp cqpVar, defpackage.ngb ngbVar, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2) {
        this.a = view;
        this.m = ngbVar;
        this.n = executor;
        this.o = executor2;
        this.i = new defpackage.djc(cqpVar, ngbVar);
    }

    private final void e(boolean z) {
        this.l = z;
        java.util.concurrent.Executor executor = z ? this.n : this.o;
        defpackage.bgf bgfVar = new defpackage.bgf(this, 7, null);
        this.k = bgfVar;
        executor.execute(bgfVar);
    }

    private final void k(defpackage.dke dkeVar) {
        this.j.n(dkeVar);
        if (this.k == null) {
            e(dkeVar.e);
        } else {
            if (!this.l || dkeVar.e) {
                return;
            }
            e(false);
        }
    }

    public final void a() {
        defpackage.ngb ngbVar = this.m;
        ngbVar.p().restartInput((android.view.View) ngbVar.c);
    }

    @Override // defpackage.djy
    public final void b(defpackage.cjj cjjVar) {
        android.graphics.Rect rect;
        float f = cjjVar.e;
        this.p = new android.graphics.Rect(defpackage.afhi.k(cjjVar.b), defpackage.afhi.k(cjjVar.c), defpackage.afhi.k(cjjVar.d), defpackage.afhi.k(f));
        if (!this.g.isEmpty() || (rect = this.p) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new android.graphics.Rect(rect));
    }

    @Override // defpackage.djy
    public final void c() {
        k(defpackage.dke.StartInput);
    }

    @Override // defpackage.djy
    public final void d(defpackage.dkd dkdVar, defpackage.djl djlVar, defpackage.affc affcVar, defpackage.affc affcVar2) {
        this.b = true;
        this.e = dkdVar;
        this.f = djlVar;
        this.c = affcVar;
        this.d = affcVar2;
        k(defpackage.dke.StartInput);
    }

    @Override // defpackage.djy
    public final void f() {
        this.b = false;
        this.c = new defpackage.cyw(13);
        this.d = new defpackage.cyw(14);
        this.p = null;
        k(defpackage.dke.StopInput);
    }

    @Override // defpackage.djy
    public final void g(defpackage.dkd dkdVar, defpackage.dkd dkdVar2) {
        int iMin;
        int iMax;
        int iMin2;
        long j = this.e.b;
        long j2 = defpackage.dgc.a;
        boolean z = true;
        if (j == dkdVar2.b && defpackage.afga.f(this.e.c, dkdVar2.c)) {
            z = false;
        }
        this.e = dkdVar2;
        java.util.List list = this.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.djz djzVar = (defpackage.djz) ((java.lang.ref.WeakReference) list.get(i)).get();
            if (djzVar != null) {
                djzVar.a = dkdVar2;
            }
        }
        defpackage.djc djcVar = this.i;
        synchronized (djcVar.a) {
            djcVar.h = null;
            djcVar.j = null;
            djcVar.i = null;
            djcVar.k = defpackage.aza.c;
            djcVar.l = null;
            djcVar.m = null;
        }
        int iMax2 = -1;
        if (defpackage.afga.f(dkdVar, dkdVar2)) {
            if (z) {
                defpackage.ngb ngbVar = this.m;
                long j3 = dkdVar2.b;
                int i2 = (int) (j3 >> 32);
                int i3 = (int) (j3 & 4294967295L);
                int iMin3 = java.lang.Math.min(i2, i3);
                int iMax3 = java.lang.Math.max(i2, i3);
                defpackage.dgc dgcVar = this.e.c;
                if (dgcVar != null) {
                    long j4 = dgcVar.b;
                    iMin2 = java.lang.Math.min((int) (j4 >> 32), (int) (j4 & 4294967295L));
                } else {
                    iMin2 = -1;
                }
                defpackage.dgc dgcVar2 = this.e.c;
                if (dgcVar2 != null) {
                    long j5 = dgcVar2.b;
                    iMax2 = java.lang.Math.max((int) (j5 >> 32), (int) (4294967295L & j5));
                }
                ngbVar.q(iMin3, iMax3, iMin2, iMax2);
                return;
            }
            return;
        }
        if (dkdVar != null && (!defpackage.afga.f(dkdVar.a(), dkdVar2.a()) || (dkdVar.b == dkdVar2.b && !defpackage.afga.f(dkdVar.c, dkdVar2.c)))) {
            a();
            return;
        }
        java.util.List list2 = this.g;
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            defpackage.djz djzVar2 = (defpackage.djz) ((java.lang.ref.WeakReference) list2.get(i4)).get();
            if (djzVar2 != null) {
                defpackage.dkd dkdVar3 = this.e;
                defpackage.ngb ngbVar2 = this.m;
                if (djzVar2.d) {
                    djzVar2.a = dkdVar3;
                    if (djzVar2.c) {
                        ngbVar2.p().updateExtractedText((android.view.View) ngbVar2.c, djzVar2.b, defpackage.acmj.p(dkdVar3));
                    }
                    defpackage.dgc dgcVar3 = dkdVar3.c;
                    if (dgcVar3 != null) {
                        long j6 = dgcVar3.b;
                        iMin = java.lang.Math.min((int) (j6 >> 32), (int) (j6 & 4294967295L));
                    } else {
                        iMin = -1;
                    }
                    if (dgcVar3 != null) {
                        long j7 = dgcVar3.b;
                        iMax = java.lang.Math.max((int) (j7 >> 32), (int) (j7 & 4294967295L));
                    } else {
                        iMax = -1;
                    }
                    long j8 = dkdVar3.b;
                    int i5 = (int) (j8 >> 32);
                    int i6 = (int) (j8 & 4294967295L);
                    ngbVar2.q(java.lang.Math.min(i5, i6), java.lang.Math.max(i5, i6), iMin, iMax);
                }
            }
        }
    }

    @Override // defpackage.djy
    public final void h(defpackage.dkd dkdVar, defpackage.djv djvVar, defpackage.dga dgaVar, defpackage.affc affcVar, defpackage.cjj cjjVar, defpackage.cjj cjjVar2) {
        defpackage.djc djcVar = this.i;
        synchronized (djcVar.a) {
            djcVar.h = dkdVar;
            djcVar.j = djvVar;
            djcVar.i = dgaVar;
            djcVar.k = affcVar;
            djcVar.l = cjjVar;
            djcVar.m = cjjVar2;
            if (djcVar.c || djcVar.b) {
                djcVar.a();
            }
        }
    }

    @Override // defpackage.djy
    public final void i() {
        k(defpackage.dke.HideKeyboard);
    }

    @Override // defpackage.djy
    public final void j() {
        k(defpackage.dke.ShowKeyboard);
    }
}
