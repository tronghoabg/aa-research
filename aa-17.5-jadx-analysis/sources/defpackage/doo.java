package defpackage;

/* loaded from: classes2.dex */
final class doo extends czz implements cul {
    private final doj a;
    private final afec b;

    public doo(doj dojVar, afec afecVar) {
        super(null);
        this.a = dojVar;
        this.b = afecVar;
    }

    @Override // defpackage.cfy
    public final /* synthetic */ cfy a(cfy cfyVar) {
        return czz.ac(this, cfyVar);
    }

    @Override // defpackage.cfy
    public final /* synthetic */ Object b(Object obj, afeg afegVar) {
        return afegVar.invoke(obj, this);
    }

    @Override // defpackage.cfy
    public final /* synthetic */ boolean c(afec afecVar) {
        return czz.ab(this, afecVar);
    }

    @Override // defpackage.cul
    public final /* bridge */ /* synthetic */ Object d() {
        return new don(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        doo dooVar = obj instanceof doo ? (doo) obj : null;
        return this.b == (dooVar != null ? dooVar.b : null);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
