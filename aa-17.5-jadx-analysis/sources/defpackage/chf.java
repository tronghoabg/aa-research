package defpackage;

/* loaded from: classes.dex */
public final class chf extends cxt<chg> {
    private final afec a;

    public chf(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new chg(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((chg) cfxVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chf) && this.a == ((chf) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
