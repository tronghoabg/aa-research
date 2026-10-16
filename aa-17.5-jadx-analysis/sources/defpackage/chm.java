package defpackage;

/* loaded from: classes.dex */
public final class chm extends cxt<chn> {
    private final ckv a;
    private final cmz b;

    public chm(ckv ckvVar, cmz cmzVar) {
        this.a = ckvVar;
        this.b = cmzVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new chn(this.a, this.b);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        chn chnVar = (chn) cfxVar;
        ckv ckvVar = chnVar.a;
        ckv ckvVar2 = this.a;
        boolean zF = affa.f(ckvVar, ckvVar2);
        cmz cmzVar = this.b;
        if (!zF || !affa.f(chnVar.b, cmzVar)) {
            chnVar.c = null;
        }
        chnVar.a = ckvVar2;
        chnVar.b = cmzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chm)) {
            return false;
        }
        chm chmVar = (chm) obj;
        return affa.f(this.a, chmVar.a) && affa.f(this.b, chmVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SimpleDropShadowElement(shape=" + this.a + ", shadow=" + this.b + ")";
    }
}
