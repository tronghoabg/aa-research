package defpackage;

/* loaded from: classes.dex */
public final class cig implements cie {
    public boolean a = true;
    public cil b;
    public cil c;
    public cil d;
    public cil e;
    public cil f;
    public cil g;
    public cil h;
    public final cil i;
    public afec j;
    public afec k;
    public cjb l;

    public cig() {
        cil cilVar = cil.a;
        this.b = cilVar;
        this.c = cilVar;
        this.d = cilVar;
        this.e = cilVar;
        this.f = cilVar;
        this.g = cilVar;
        this.h = cilVar;
        this.i = cilVar;
        this.j = new bmk(20);
        this.k = new cmj(1);
        this.l = cid.a;
    }

    @Override // defpackage.cie
    public final void a(boolean z) {
        this.a = z;
    }

    @Override // defpackage.cie
    public final void b(cil cilVar) {
        this.e = cilVar;
    }

    @Override // defpackage.cie
    public final void c(cjb cjbVar) {
        this.l = cjbVar;
    }

    @Override // defpackage.cie
    public final void d(cil cilVar) {
        this.f = cilVar;
    }

    @Override // defpackage.cie
    public final void e(cil cilVar) {
        this.b = cilVar;
    }

    @Override // defpackage.cie
    public final void f(afec afecVar) {
        this.j = afecVar;
    }

    @Override // defpackage.cie
    public final void g(afec afecVar) {
        this.k = afecVar;
    }

    @Override // defpackage.cie
    public final void h(cil cilVar) {
        this.c = cilVar;
    }

    @Override // defpackage.cie
    public final void i(cil cilVar) {
        this.g = cilVar;
    }

    @Override // defpackage.cie
    public final void j(cil cilVar) {
        this.h = cilVar;
    }

    @Override // defpackage.cie
    public final void k(cil cilVar) {
        this.d = cilVar;
    }

    @Override // defpackage.cie
    public final boolean l() {
        return this.a;
    }
}
