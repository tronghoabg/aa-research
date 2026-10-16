package defpackage;

/* loaded from: classes.dex */
public final class aix extends cxt<aiz> {
    private final long a;
    private final ckv b;

    public aix(long j, ckv ckvVar) {
        this.a = j;
        this.b = ckvVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new aiz(this.a, this.b);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        aiz aizVar = (aiz) cfxVar;
        aizVar.a = this.a;
        ckv ckvVar = aizVar.b;
        ckv ckvVar2 = this.b;
        if (!affa.f(ckvVar, ckvVar2)) {
            aizVar.b = ckvVar2;
            bzi.q(aizVar).J();
        }
        cjn.w(aizVar);
    }

    public final boolean equals(Object obj) {
        aix aixVar = obj instanceof aix ? (aix) obj : null;
        return aixVar != null && this.a == aixVar.a && affa.f(this.b, aixVar.b);
    }

    public final int hashCode() {
        long j = this.a;
        return (((((int) (j ^ (j >>> 32))) * 961) + Float.floatToIntBits(1.0f)) * 31) + this.b.hashCode();
    }
}
