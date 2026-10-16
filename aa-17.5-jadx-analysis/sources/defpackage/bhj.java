package defpackage;

/* loaded from: classes.dex */
public final class bhj extends cwe implements cwc, bho {
    public afec a;
    public afec b;
    public afec c;
    public aivh d;
    public vtn e;
    private final bym f;
    private cjb g;

    public bhj(vtn vtnVar, afec afecVar, afec afecVar2, afec afecVar3) {
        this.e = vtnVar;
        this.a = afecVar;
        this.b = afecVar2;
        this.c = afecVar3;
        beg begVar = new beg(this, 12);
        lah lahVar = byj.a;
        this.f = new bvk(begVar, null);
        this.g = cjb.a;
    }

    @Override // defpackage.bho
    public final long a(cst cstVar) {
        return c(cstVar).c();
    }

    @Override // defpackage.bho
    public final bfu b() {
        return (bfu) this.f.a();
    }

    @Override // defpackage.bho
    public final cjb c(cst cstVar) {
        Object objInvoke;
        if (!this.A || (objInvoke = this.c.invoke(cstVar)) == null) {
            return this.g;
        }
        cjb cjbVar = (cjb) objInvoke;
        this.g = cjbVar;
        return cjbVar;
    }

    @Override // defpackage.cfx
    public final void er() {
        vtn vtnVar = this.e;
        vtnVar.a = 3;
        vtnVar.b = this;
    }

    @Override // defpackage.cfx
    public final void q() {
        vtn vtnVar = this.e;
        vtnVar.a = 2;
        vtnVar.b = null;
    }
}
