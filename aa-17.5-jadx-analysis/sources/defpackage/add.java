package defpackage;

/* loaded from: classes.dex */
public final class add extends cxt<adh> {
    private final aew a;
    private final cfn b;
    private final afeg c;

    public add(aew aewVar, cfn cfnVar, afeg afegVar) {
        this.a = aewVar;
        this.b = cfnVar;
        this.c = afegVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new adh(this.a, this.b, this.c);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        adh adhVar = (adh) cfxVar;
        adhVar.a = this.a;
        adhVar.c = this.c;
        adhVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof add)) {
            return false;
        }
        add addVar = (add) obj;
        return affa.f(addVar.a, this.a) && addVar.c == this.c && affa.f(addVar.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        afeg afegVar = this.c;
        return (iHashCode * 31) + (afegVar != null ? afegVar.hashCode() : 0);
    }
}
