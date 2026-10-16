package defpackage;

/* loaded from: classes.dex */
public final class bjh extends cxt<bjk> {
    private final String a;
    private final dfw b;
    private final int c;
    private final boolean d;
    private final int f;
    private final int g;
    private final cjy h = null;
    private final wci i;

    public bjh(String str, dfw dfwVar, wci wciVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = dfwVar;
        this.i = wciVar;
        this.c = i;
        this.d = z;
        this.f = i2;
        this.g = i3;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new bjk(this.a, this.b, this.i, this.c, this.d, this.f, this.g);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        boolean z;
        bjk bjkVar = (bjk) cfxVar;
        dfw dfwVar = bjkVar.b;
        dfw dfwVar2 = this.b;
        boolean zT = dfwVar2.t(dfwVar);
        String str = bjkVar.a;
        String str2 = this.a;
        boolean z2 = true;
        if (affa.f(str, str2)) {
            z = false;
        } else {
            bjkVar.a = str2;
            bjkVar.f();
            z = true;
        }
        int i = this.g;
        int i2 = this.f;
        boolean z3 = this.d;
        wci wciVar = this.i;
        int i3 = this.c;
        boolean z4 = !bjkVar.b.u(dfwVar2);
        bjkVar.b = dfwVar2;
        if (bjkVar.f != i) {
            bjkVar.f = i;
            z4 = true;
        }
        if (bjkVar.e != i2) {
            bjkVar.e = i2;
            z4 = true;
        }
        if (bjkVar.d != z3) {
            bjkVar.d = z3;
            z4 = true;
        }
        if (!affa.f(bjkVar.i, wciVar)) {
            bjkVar.i = wciVar;
            z4 = true;
        }
        if (bjkVar.c != i3) {
            bjkVar.c = i3;
        } else {
            z2 = z4;
        }
        if (z || z2) {
            bjkVar.d().g(bjkVar.a, bjkVar.b, bjkVar.i, bjkVar.c, bjkVar.d, bjkVar.e, bjkVar.f);
        }
        if (bjkVar.A) {
            if (z || (!zT && bjkVar.g != null)) {
                bzi.q(bjkVar).J();
            }
            if (z || z2) {
                bzi.q(bjkVar).I();
                cjn.w(bjkVar);
            }
            if (zT) {
                return;
            }
            cjn.w(bjkVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjh)) {
            return false;
        }
        bjh bjhVar = (bjh) obj;
        cjy cjyVar = bjhVar.h;
        return affa.f(this.a, bjhVar.a) && affa.f(this.b, bjhVar.b) && affa.f(this.i, bjhVar.i) && this.c == bjhVar.c && this.d == bjhVar.d && this.f == bjhVar.f && this.g == bjhVar.g;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.i.hashCode();
        int i = true != this.d ? 1237 : 1231;
        return ((((((((iHashCode * 31) + this.c) * 31) + i) * 31) + this.f) * 31) + this.g) * 31;
    }
}
