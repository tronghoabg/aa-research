package defpackage;

/* loaded from: classes.dex */
final class adn extends cxt<adp> {
    private final agg a;
    private final agb b;
    private final acp c;
    private final acq d;
    private final adb f;

    public adn(agg aggVar, agb agbVar, acp acpVar, acq acqVar, adb adbVar) {
        this.a = aggVar;
        this.b = agbVar;
        this.c = acpVar;
        this.d = acqVar;
        this.f = adbVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new adp(this.b, this.c, this.d, this.f);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        adp adpVar = (adp) cfxVar;
        adpVar.a = this.b;
        adpVar.b = this.c;
        adpVar.c = this.d;
        adpVar.d = this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adn)) {
            return false;
        }
        adn adnVar = (adn) obj;
        return affa.f(this.a, adnVar.a) && affa.f(this.b, adnVar.b) && affa.f(this.c, adnVar.c) && affa.f(this.d, adnVar.d) && affa.f(this.f, adnVar.f);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "VeilModifierElement(transition=" + this.a + ", veilAnimation=" + this.b + ", enter=" + this.c + ", exit=" + this.d + ", mutableTransformState=" + this.f + ")";
    }
}
