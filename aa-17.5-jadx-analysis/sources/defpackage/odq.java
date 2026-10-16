package defpackage;

/* loaded from: classes.dex */
public final class odq implements lhg {
    public static final yfq a = yfq.u(odm.AUDIO_PROCESSING, odm.NEW, odm.RINGING, odm.SIMULATED_RINGING, odm.SELECT_PHONE_ACCOUNT);
    public static final yfq b = yfq.t(odm.AUDIO_PROCESSING, odm.NEW, odm.SIMULATED_RINGING, odm.SELECT_PHONE_ACCOUNT);
    public final eqj c;
    private final eqj d;

    public odq() {
        eqj eqjVarB = eqy.b(new odt(), new nna(14));
        this.d = eqy.b(eqjVarB, new nna(15));
        this.c = eqy.b(eqjVarB, new nna(16));
    }

    @Override // defpackage.lhg
    public final void c() {
        osq.P(lxr.n()).c(this.d);
    }

    @Override // defpackage.lhg
    public final void d() {
        osq.P(lxr.n()).c(tby.d);
    }
}
