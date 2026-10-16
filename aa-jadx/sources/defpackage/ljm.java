package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ljm extends defpackage.ljf {
    public static final defpackage.yqm d = defpackage.yqm.c("GH.FusedLocationProvide");
    public defpackage.ljl e;
    public final defpackage.sup f;

    public ljm(android.content.Context context) {
        if (context == null || !defpackage.mdp.d().s()) {
            throw new java.lang.IllegalStateException("Can't create unsupported FusedLocationProvider.");
        }
        defpackage.sup supVar = new defpackage.sup(context);
        this.f = supVar;
        defpackage.swx swxVarA = supVar.a();
        swxVarA.m(new defpackage.ljk(this, 0));
        swxVarA.j(new defpackage.kmx(2));
    }

    @Override // defpackage.ljf
    protected final defpackage.zaa b(java.lang.Float f) {
        return f == null ? defpackage.zaa.FUSED_LOCATION_PROVIDER_NULL_SPEED : defpackage.zaa.FUSED_LOCATION_PROVIDER_HAS_SPEED;
    }

    @Override // defpackage.ljg
    public final void i() {
        super.i();
        defpackage.ljl ljlVar = this.e;
        if (ljlVar != null) {
            this.f.v(defpackage.sqg.c(ljlVar, defpackage.suc.class.getSimpleName()), 2418).a(new defpackage.ozb(2), new defpackage.suk(0));
        }
    }
}
