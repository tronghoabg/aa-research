package defpackage;

/* loaded from: classes.dex */
public final class che extends cxt<cgy> {
    private final afec a;

    public che(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new cgy(new cgz(), this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        cgy cgyVar = (cgy) cfxVar;
        cgyVar.a = this.a;
        cgyVar.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof che) && this.a == ((che) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
