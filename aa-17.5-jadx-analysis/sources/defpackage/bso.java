package defpackage;

/* loaded from: classes.dex */
public final class bso extends cxt<bsn> {
    private final afec a;

    public bso(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new bsn(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        bsn bsnVar = (bsn) cfxVar;
        bsnVar.a = this.a;
        bzi.q(bsnVar).J();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bso) && this.a == ((bso) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
