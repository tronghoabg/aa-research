package defpackage;

/* loaded from: classes.dex */
public final class chp extends cxt<chq> {
    private final afec a;

    public chp(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new chq(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((chq) cfxVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chp) && this.a == ((chp) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
