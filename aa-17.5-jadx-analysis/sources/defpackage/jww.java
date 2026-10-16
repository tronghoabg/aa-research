package defpackage;

/* loaded from: classes2.dex */
final class jww extends gni {
    private final yzy b;
    private final yzy c;

    public jww(yzy yzyVar, yzy yzyVar2) {
        super("GEARHEAD_CAL_TEMPLATE_INITIAL_CLIENT_LOAD");
        this.b = yzyVar;
        this.c = yzyVar2;
    }

    @Override // defpackage.gni
    protected final void e(boolean z, long j) {
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.CAR_APP_LIBRARY, z ? this.b : this.c);
        rrbVarH.u(aisq.e(j));
        ohsVarJ.f(rrbVarH);
    }
}
