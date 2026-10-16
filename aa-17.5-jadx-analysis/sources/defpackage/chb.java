package defpackage;

/* loaded from: classes.dex */
public final class chb extends cxt<cha> {
    private final afec a;

    public chb(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new cha(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((cha) cfxVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chb) && this.a == ((chb) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
