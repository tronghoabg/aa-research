package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cio implements defpackage.cim {
    public boolean a = true;
    public defpackage.cit b;
    public defpackage.cit c;
    public defpackage.cit d;
    public defpackage.cit e;
    public defpackage.cit f;
    public defpackage.cit g;
    public defpackage.cit h;
    public final defpackage.cit i;
    public defpackage.affc j;
    public defpackage.affc k;
    public defpackage.cjj l;

    public cio() {
        defpackage.cit citVar = defpackage.cit.a;
        this.b = citVar;
        this.c = citVar;
        this.d = citVar;
        this.e = citVar;
        this.f = citVar;
        this.g = citVar;
        this.h = citVar;
        this.i = citVar;
        this.j = new defpackage.bmo(20);
        this.k = new defpackage.cmr(1);
        this.l = defpackage.cil.a;
    }

    @Override // defpackage.cim
    public final void a(boolean z) {
        this.a = z;
    }

    @Override // defpackage.cim
    public final void b(defpackage.cit citVar) {
        this.e = citVar;
    }

    @Override // defpackage.cim
    public final void c(defpackage.cjj cjjVar) {
        this.l = cjjVar;
    }

    @Override // defpackage.cim
    public final void d(defpackage.cit citVar) {
        this.f = citVar;
    }

    @Override // defpackage.cim
    public final void e(defpackage.cit citVar) {
        this.b = citVar;
    }

    @Override // defpackage.cim
    public final void f(defpackage.affc affcVar) {
        this.j = affcVar;
    }

    @Override // defpackage.cim
    public final void g(defpackage.affc affcVar) {
        this.k = affcVar;
    }

    @Override // defpackage.cim
    public final void h(defpackage.cit citVar) {
        this.c = citVar;
    }

    @Override // defpackage.cim
    public final void i(defpackage.cit citVar) {
        this.g = citVar;
    }

    @Override // defpackage.cim
    public final void j(defpackage.cit citVar) {
        this.h = citVar;
    }

    @Override // defpackage.cim
    public final void k(defpackage.cit citVar) {
        this.d = citVar;
    }

    @Override // defpackage.cim
    public final boolean l() {
        return this.a;
    }
}
