package defpackage;

/* loaded from: classes.dex */
public final class cjq extends cxt<cjr> {
    private final afec a;

    public cjq(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new cjr(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        cjr cjrVar = (cjr) cfxVar;
        cjrVar.a = this.a;
        cjrVar.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cjq) && this.a == ((cjq) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
