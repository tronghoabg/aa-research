package defpackage;

/* loaded from: classes.dex */
public final class bcf extends cxt<bch> {
    private final boolean a;
    private final asf b;
    private final akm c;
    private final boolean d;
    private final ddo f;
    private final afdr g;

    public bcf(boolean z, asf asfVar, akm akmVar, boolean z2, ddo ddoVar, afdr afdrVar) {
        this.a = z;
        this.b = asfVar;
        this.c = akmVar;
        this.d = z2;
        this.f = ddoVar;
        this.g = afdrVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new bch(this.a, this.b, this.c, this.d, this.f, this.g);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        bch bchVar = (bch) cfxVar;
        boolean z = bchVar.i;
        boolean z2 = this.a;
        if (z != z2) {
            bchVar.i = z2;
            bzi.q(bchVar).J();
        }
        afdr afdrVar = this.g;
        ddo ddoVar = this.f;
        boolean z3 = this.d;
        bchVar.w(this.b, this.c, false, z3, null, ddoVar, afdrVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bcf bcfVar = (bcf) obj;
        return this.a == bcfVar.a && affa.f(this.b, bcfVar.b) && affa.f(this.c, bcfVar.c) && this.d == bcfVar.d && affa.f(this.f, bcfVar.f) && this.g == bcfVar.g;
    }

    public final int hashCode() {
        asf asfVar = this.b;
        int iHashCode = ((true != this.a ? 1237 : 1231) * 31) + (asfVar != null ? asfVar.hashCode() : 0);
        akm akmVar = this.c;
        int iHashCode2 = ((((((iHashCode * 31) + (akmVar != null ? akmVar.hashCode() : 0)) * 31) + 1237) * 31) + (true != this.d ? 1237 : 1231)) * 31;
        ddo ddoVar = this.f;
        return ((iHashCode2 + (ddoVar != null ? ddoVar.a : 0)) * 31) + this.g.hashCode();
    }
}
