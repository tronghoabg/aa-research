package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class mew implements us {
    private final /* synthetic */ int a;

    public /* synthetic */ mew(int i) {
        this.a = i;
    }

    @Override // defpackage.us
    public final void onClick() {
        if (this.a != 0) {
            lwu.f.l().u("Cancel clicked");
            nqd.a.a().h();
            return;
        }
        ohs ohsVarJ = ebf.j();
        yxy yxyVar = yxy.GEARHEAD;
        yzz yzzVar = meu.a;
        ohsVarJ.F(rrc.h(yxyVar, yzzVar, yzy.Q).l());
        ebf.j().o(yzzVar, yzy.D);
        ebf.A().q();
    }
}
