package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class nev implements lhg {
    public static final nes a = new nes();
    public static final afgl b = new kkp(mki.b, 19);
    public final xya c;
    private final aezr d;

    public /* synthetic */ nev(byte[] bArr) {
        this.c = new xya((xyi) oit.a().b);
        this.d = new aezy(new mkj(7));
        a().fE((lhm) mki.a.i(lhm.class), new kko(new ltd(this, 8), 5));
    }

    public final eqj a() {
        return (eqj) this.d.a();
    }

    @Override // defpackage.lhg
    public final void d() {
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.DO_NOT_DISTURB, yzy.Lx);
        xya xyaVar = this.c;
        rrbVarH.u(xyaVar.a(TimeUnit.MILLISECONDS));
        ohsVarJ.F(rrbVarH.l());
        xyaVar.d();
    }

    @Override // defpackage.lhg
    public final void c() {
    }

    public nev() {
        this(null);
    }
}
