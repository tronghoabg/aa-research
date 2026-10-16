package defpackage;

/* loaded from: classes.dex */
public final class bhc extends cxt<bhg> {
    private final afeg a;

    public bhc(afeg afegVar) {
        this.a = afegVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new bhg(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((bhg) cfxVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bhc) && this.a == ((bhc) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
