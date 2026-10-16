package defpackage;

/* loaded from: classes.dex */
public final class att extends cxt<atu> {
    private final afec a;

    public att(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new atu(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        atu atuVar = (atu) cfxVar;
        afec afecVar = atuVar.a;
        afec afecVar2 = this.a;
        if (afecVar2 != afecVar) {
            atuVar.a = afecVar2;
            atuVar.d();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof att) && ((att) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
