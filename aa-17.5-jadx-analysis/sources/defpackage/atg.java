package defpackage;

/* loaded from: classes.dex */
final class atg extends cxt<ath> {
    private final cfn a;
    private final boolean b;

    public atg(cfn cfnVar, boolean z) {
        this.a = cfnVar;
        this.b = z;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new ath(this.a, this.b);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ath athVar = (ath) cfxVar;
        athVar.a = this.a;
        athVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        atg atgVar = obj instanceof atg ? (atg) obj : null;
        return atgVar != null && affa.f(this.a, atgVar.a) && this.b == atgVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }
}
