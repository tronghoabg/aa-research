package defpackage;

/* loaded from: classes.dex */
public final class liw implements lhg {
    public static final liv a = new liv();
    public static final afgl b = new lcj(mki.b, 7);
    public final xya c;
    public int d;
    private final eqj e;
    private final afhh f;

    public /* synthetic */ liw(byte[] bArr) {
        this.e = eqy.a(lix.b().b);
        this.c = new xya((xyi) oit.a().b);
        this.d = 1;
        this.f = new eyr(this, 11, (boolean[][]) null);
    }

    public final void a() {
        xya xyaVar = this.c;
        if (xyaVar.a) {
            xyaVar.f();
            ohs ohsVarJ = ebf.j();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.LOCATION, yzy.LA);
            rrbVarH.u(xyaVar.c().toMillis());
            ohsVarJ.F(rrbVarH.l());
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [afec, afhh] */
    @Override // defpackage.lhg
    public final void c() {
        this.e.fE(lbh.d(), new ewg(this.f, 13, null));
    }

    @Override // defpackage.lhg
    public final void d() {
        if (this.d == 2) {
            a();
        }
        this.d = 1;
    }

    public liw() {
        this(null);
    }
}
