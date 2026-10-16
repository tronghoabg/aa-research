package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ayb implements defpackage.azz, defpackage.apw {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ defpackage.apw b;
    private final /* synthetic */ int c;

    public ayb(defpackage.apw apwVar, java.lang.Object obj, int i) {
        this.c = i;
        this.a = obj;
        this.b = apwVar;
    }

    @Override // defpackage.apw
    public final float a(float f) {
        int i = this.c;
        if (i == 0) {
            return this.b.a(f);
        }
        defpackage.apw apwVar = this.b;
        return i != 1 ? apwVar.a(f) : apwVar.a(f);
    }

    @Override // defpackage.azz
    public final int b() {
        int i = this.c;
        if (i == 0) {
            return ((defpackage.aye) this.a).b();
        }
        java.lang.Object obj = this.a;
        return i != 1 ? ((defpackage.bby) obj).f : ((defpackage.axx) obj).b();
    }

    @Override // defpackage.azz
    public final int c() {
        int i = this.c;
        if (i == 0) {
            return ((defpackage.aye) this.a).c();
        }
        java.lang.Object obj = this.a;
        return i != 1 ? ((defpackage.bby) obj).g : ((defpackage.axx) obj).c();
    }

    @Override // defpackage.azz
    public final int d() {
        int i = this.c;
        if (i != 0) {
            java.lang.Object obj = this.a;
            return i != 1 ? ((defpackage.bby) obj).b() : ((defpackage.axx) obj).l().m;
        }
        ((defpackage.aye) this.a).d();
        return 0;
    }

    @Override // defpackage.azz
    public final int e() {
        int i = this.c;
        if (i == 0) {
            defpackage.axz axzVar = (defpackage.axz) defpackage.afga.aF(((defpackage.aye) this.a).d().b);
            if (axzVar != null) {
                return axzVar.a();
            }
            return 0;
        }
        java.lang.Object obj = this.a;
        if (i != 1) {
            return ((defpackage.bba) defpackage.afga.aE(((defpackage.bby) obj).w().a)).a;
        }
        defpackage.axp axpVar = (defpackage.axp) defpackage.afga.aF(((defpackage.axx) obj).l().j);
        if (axpVar != null) {
            return axpVar.a;
        }
        return 0;
    }

    @Override // defpackage.azz
    public final int f(int i) {
        java.lang.Object obj;
        int i2 = this.c;
        if (i2 == 0) {
            java.util.List list = ((defpackage.aye) this.a).d().b;
            return 0;
        }
        java.lang.Object obj2 = this.a;
        if (i2 != 1) {
            defpackage.bby bbyVar = (defpackage.bby) obj2;
            return (int) (defpackage.afqt.j(defpackage.afw.T(bbyVar) + ((long) defpackage.afhi.k((((i - bbyVar.j()) * bbyVar.l()) - (bbyVar.c() * bbyVar.l())) + 0.0f)), bbyVar.i, bbyVar.h) - defpackage.afw.T(bbyVar));
        }
        defpackage.axo axoVarL = ((defpackage.axx) obj2).l();
        java.util.List list2 = axoVarL.j;
        if (list2.isEmpty()) {
            return 0;
        }
        int iB = b();
        if (i > e() || iB > i) {
            return (defpackage.axd.h(axoVarL) * (i - b())) - c();
        }
        int size = list2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i3);
            if (((defpackage.axp) obj).a == i) {
                break;
            }
            i3++;
        }
        defpackage.axp axpVar = (defpackage.axp) obj;
        if (axpVar != null) {
            return axpVar.h;
        }
        return 0;
    }

    @Override // defpackage.azz
    public final void g(int i) {
        int i2 = this.c;
        if (i2 != 0) {
            java.lang.Object obj = this.a;
            if (i2 == 1) {
                ((defpackage.axx) obj).k(i, 0, true);
                return;
            }
            defpackage.bby bbyVar = (defpackage.bby) obj;
            float fL = bbyVar.l();
            bbyVar.t(i, fL != 0.0f ? 0.0f / fL : 0.0f, true);
            return;
        }
        defpackage.aye ayeVar = (defpackage.aye) this.a;
        defpackage.ngb ngbVar = ayeVar.f;
        if (ngbVar.A() != i || ngbVar.B() != 0) {
            ayeVar.c.c();
            ayeVar.j();
        }
        if (i < 0.0f) {
            defpackage.asq.c("Index should be non-negative");
        }
        ((defpackage.byj) ngbVar.b).h(i);
        ((defpackage.azt) ngbVar.a).c(i);
        ((defpackage.byj) ngbVar.c).h(0);
    }
}
