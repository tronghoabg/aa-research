package defpackage;

/* loaded from: classes.dex */
public final class cpp extends cxt<cpr> {
    private final afec a;
    private final afec b;

    public cpp(afec afecVar, afec afecVar2) {
        this.a = afecVar;
        this.b = afecVar2;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new cpr(this.a, this.b);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        cpr cprVar = (cpr) cfxVar;
        cprVar.a = this.a;
        cprVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpp)) {
            return false;
        }
        cpp cppVar = (cpp) obj;
        return this.a == cppVar.a && this.b == cppVar.b;
    }

    public final int hashCode() {
        afec afecVar = this.a;
        int iHashCode = afecVar != null ? afecVar.hashCode() : 0;
        afec afecVar2 = this.b;
        return (iHashCode * 31) + (afecVar2 != null ? afecVar2.hashCode() : 0);
    }
}
