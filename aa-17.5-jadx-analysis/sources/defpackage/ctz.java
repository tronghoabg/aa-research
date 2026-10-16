package defpackage;

/* loaded from: classes.dex */
public final class ctz extends cxt<cub> {
    private final afec a;

    public ctz(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new cub(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((cub) cfxVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ctz) && this.a == ((ctz) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
