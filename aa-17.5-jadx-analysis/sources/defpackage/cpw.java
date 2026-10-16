package defpackage;

/* loaded from: classes.dex */
public final class cpw extends cxt<cpz> {
    private final cpt a;
    private final tp b;

    public cpw(cpt cptVar, tp tpVar) {
        this.a = cptVar;
        this.b = tpVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new cpz(this.a, this.b);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        cpz cpzVar = (cpz) cfxVar;
        cpzVar.a = this.a;
        cpzVar.h();
        tp tpVar = this.b;
        if (tpVar == null) {
            cpzVar.b = new tp();
        } else if (!affa.f(tpVar, cpzVar.b)) {
            cpzVar.b = tpVar;
        }
        if (cpzVar.A) {
            cpzVar.i();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cpw)) {
            return false;
        }
        cpw cpwVar = (cpw) obj;
        return affa.f(cpwVar.a, this.a) && affa.f(cpwVar.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tp tpVar = this.b;
        return iHashCode + (tpVar != null ? tpVar.hashCode() : 0);
    }
}
