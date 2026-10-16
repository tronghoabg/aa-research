package defpackage;

/* loaded from: classes.dex */
public final class cug extends cxt<cuh> {
    private final afec a;

    public cug(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new cuh(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        cuh cuhVar = (cuh) cfxVar;
        cuhVar.a = this.a;
        cuhVar.b = -9223372034707292160L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cug) && this.a == ((cug) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
