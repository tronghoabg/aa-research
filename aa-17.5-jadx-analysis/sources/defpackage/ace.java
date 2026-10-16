package defpackage;

/* loaded from: classes.dex */
final class ace extends cxt<aco> {
    private final agg a;
    private final agb b;
    private final agb c;
    private final agb d;
    private final acp f;
    private final acq g;
    private final adb h;
    private final afdr i;
    private final aci j;

    public ace(agg aggVar, agb agbVar, agb agbVar2, agb agbVar3, acp acpVar, acq acqVar, adb adbVar, afdr afdrVar, aci aciVar) {
        this.a = aggVar;
        this.b = agbVar;
        this.c = agbVar2;
        this.d = agbVar3;
        this.f = acpVar;
        this.g = acqVar;
        this.h = adbVar;
        this.i = afdrVar;
        this.j = aciVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new aco(this.a, this.b, this.c, this.d, this.f, this.g, this.h, this.i, this.j);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        aco acoVar = (aco) cfxVar;
        acoVar.a = this.a;
        acoVar.b = this.b;
        acoVar.c = this.c;
        acoVar.d = this.d;
        acoVar.e = this.f;
        acoVar.f = this.g;
        adb adbVar = acoVar.h;
        adb adbVar2 = this.h;
        if (!affa.f(adbVar, adbVar2)) {
            acoVar.h = adbVar2;
            cvr cvrVar = acoVar.i;
            bzi bziVar = acb.a;
            if (cvrVar == cvo.a) {
                crt.b("In order to provide locals you must override providedValues: ModifierLocalMap");
            }
            if (!cvrVar.c(bziVar)) {
                crt.b(a.bm(bziVar, "Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key ", " was not found."));
            }
            cvrVar.b(bziVar, adbVar2);
        }
        acoVar.g = this.i;
        acoVar.k = this.j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ace)) {
            return false;
        }
        ace aceVar = (ace) obj;
        return affa.f(aceVar.a, this.a) && affa.f(aceVar.b, this.b) && affa.f(aceVar.c, this.c) && affa.f(aceVar.d, this.d) && affa.f(aceVar.f, this.f) && affa.f(aceVar.g, this.g) && affa.f(aceVar.h, this.h) && aceVar.i == this.i && affa.f(aceVar.j, this.j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        agb agbVar = this.b;
        int iHashCode2 = (iHashCode + (agbVar != null ? agbVar.hashCode() : 0)) * 31;
        agb agbVar2 = this.c;
        int iHashCode3 = (iHashCode2 + (agbVar2 != null ? agbVar2.hashCode() : 0)) * 31;
        agb agbVar3 = this.d;
        return ((((((((iHashCode3 + (agbVar3 != null ? agbVar3.hashCode() : 0)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.i.hashCode()) * 31) + (this.j.hashCode() * 31) + this.h.hashCode();
    }
}
