package defpackage;

/* loaded from: classes.dex */
public final class chn extends cfx implements cwk, cyg {
    public ckv a;
    public cmz b;
    public cmy c;

    public chn(ckv ckvVar, cmz cmzVar) {
        this.a = ckvVar;
        this.b = cmzVar;
    }

    @Override // defpackage.cwk
    public final void b(cxd cxdVar) {
        cmy cmyVar;
        cmy cmyVar2 = this.c;
        if (cmyVar2 == null) {
            cji cjiVar = ((czq) bzi.s(this)).P;
            coc cocVar = cjiVar.c;
            if (cocVar == null) {
                cocVar = new coc((byte[]) null);
                cjiVar.c = cocVar;
            }
            cmy cmyVar3 = new cmy(this.a, this.b, cocVar);
            this.c = cmyVar3;
            cmyVar = cmyVar3;
        } else {
            cmyVar = cmyVar2;
        }
        cmyVar.e(cxdVar, cxdVar.o(), 1.0f, null);
        cxdVar.q();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof chn)) {
            return false;
        }
        chn chnVar = (chn) obj;
        return affa.f(this.a, chnVar.a) && affa.f(this.b, chnVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @Override // defpackage.cyg
    public final void r() {
        this.c = null;
        cjn.w(this);
    }

    @Override // defpackage.cwk
    public final /* synthetic */ void a() {
    }
}
