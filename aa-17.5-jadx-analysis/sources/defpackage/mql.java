package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class mql implements us {
    public final /* synthetic */ mra a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ mql(mra mraVar, int i, int i2) {
        this.c = i2;
        this.a = mraVar;
        this.b = i;
    }

    @Override // defpackage.us
    public final void onClick() {
        if (this.c != 0) {
            ohs ohsVarJ = ebf.j();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.APP_LAUNCHER, yzy.kP);
            mqz mqzVar = this.a.a;
            rrbVarH.p(mqzVar.c.a());
            rrbVarH.A(this.b);
            ohsVarJ.F(rrbVarH.l());
            mqzVar.c();
            return;
        }
        int i = mqn.k;
        ohs ohsVarJ2 = ebf.j();
        rrb rrbVarH2 = rrc.h(yxy.GEARHEAD, yzz.APP_LAUNCHER, yzy.kP);
        mqz mqzVar2 = this.a.a;
        rrbVarH2.p(mqzVar2.c.a());
        rrbVarH2.A(this.b);
        ohsVarJ2.F(rrbVarH2.l());
        mqzVar2.c();
    }
}
