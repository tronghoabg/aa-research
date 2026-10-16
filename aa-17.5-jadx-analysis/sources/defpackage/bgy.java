package defpackage;

/* loaded from: classes.dex */
public final class bgy extends cxt<bgz> {
    private final afeg a;

    public bgy(afeg afegVar) {
        this.a = afegVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new bgz(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((bgz) cfxVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bgy) && this.a == ((bgy) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
