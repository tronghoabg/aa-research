package defpackage;

/* loaded from: classes.dex */
public final class bby extends cxt<bcb> {
    private final bca a;

    public bby(bca bcaVar) {
        this.a = bcaVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new bcb(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((bcb) cfxVar).b(this.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof bby) && affa.f(this.a, ((bby) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
