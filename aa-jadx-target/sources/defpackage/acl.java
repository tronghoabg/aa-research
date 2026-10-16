package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class acl extends defpackage.cyc<defpackage.acv> {
    private final defpackage.agn a;
    private final defpackage.agi b;
    private final defpackage.agi c;
    private final defpackage.agi d;
    private final defpackage.acw f;
    private final defpackage.acx g;
    private final defpackage.adi h;
    private final defpackage.afer i;
    private final defpackage.acp j;

    public acl(defpackage.agn agnVar, defpackage.agi agiVar, defpackage.agi agiVar2, defpackage.agi agiVar3, defpackage.acw acwVar, defpackage.acx acxVar, defpackage.adi adiVar, defpackage.afer aferVar, defpackage.acp acpVar) {
        this.a = agnVar;
        this.b = agiVar;
        this.c = agiVar2;
        this.d = agiVar3;
        this.f = acwVar;
        this.g = acxVar;
        this.h = adiVar;
        this.i = aferVar;
        this.j = acpVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.acv(this.a, this.b, this.c, this.d, this.f, this.g, this.h, this.i, this.j);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.acv acvVar = (defpackage.acv) cgeVar;
        acvVar.a = this.a;
        acvVar.b = this.b;
        acvVar.c = this.c;
        acvVar.d = this.d;
        acvVar.e = this.f;
        acvVar.f = this.g;
        defpackage.adi adiVar = acvVar.h;
        defpackage.adi adiVar2 = this.h;
        if (!defpackage.afga.f(adiVar, adiVar2)) {
            acvVar.h = adiVar2;
            defpackage.cwa cwaVar = acvVar.i;
            defpackage.cjv cjvVar = defpackage.aci.a;
            if (cwaVar == defpackage.cvx.a) {
                defpackage.csc.b("In order to provide locals you must override providedValues: ModifierLocalMap");
            }
            if (!cwaVar.c(cjvVar)) {
                defpackage.csc.b(defpackage.a.bl(cjvVar, "Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key ", " was not found."));
            }
            cwaVar.b(cjvVar, adiVar2);
        }
        acvVar.g = this.i;
        acvVar.k = this.j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.acl)) {
            return false;
        }
        defpackage.acl aclVar = (defpackage.acl) obj;
        return defpackage.afga.f(aclVar.a, this.a) && defpackage.afga.f(aclVar.b, this.b) && defpackage.afga.f(aclVar.c, this.c) && defpackage.afga.f(aclVar.d, this.d) && defpackage.afga.f(aclVar.f, this.f) && defpackage.afga.f(aclVar.g, this.g) && defpackage.afga.f(aclVar.h, this.h) && aclVar.i == this.i && defpackage.afga.f(aclVar.j, this.j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.agi agiVar = this.b;
        int iHashCode2 = (iHashCode + (agiVar != null ? agiVar.hashCode() : 0)) * 31;
        defpackage.agi agiVar2 = this.c;
        int iHashCode3 = (iHashCode2 + (agiVar2 != null ? agiVar2.hashCode() : 0)) * 31;
        defpackage.agi agiVar3 = this.d;
        return ((((((((iHashCode3 + (agiVar3 != null ? agiVar3.hashCode() : 0)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.i.hashCode()) * 31) + (this.j.hashCode() * 31) + this.h.hashCode();
    }
}
