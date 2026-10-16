package defpackage;

/* loaded from: classes2.dex */
final class dmk extends cxt<dml> {
    private final afec a;

    public dmk(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new dml(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        dml dmlVar = (dml) cfxVar;
        afec afecVar = this.a;
        dmlVar.a = afecVar;
        if (dmlVar.A) {
            afecVar.invoke(dmlVar.b);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof dmk) && this.a == ((dmk) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
