package defpackage;

/* loaded from: classes.dex */
public final class crp extends cxt<crr> {
    private final afec a;
    private final afec b = null;

    public crp(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new crr(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((crr) cfxVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crp)) {
            return false;
        }
        crp crpVar = (crp) obj;
        if (this.a != crpVar.a) {
            return false;
        }
        afec afecVar = crpVar.b;
        return true;
    }

    public final int hashCode() {
        afec afecVar = this.a;
        return (afecVar != null ? afecVar.hashCode() : 0) * 31;
    }
}
