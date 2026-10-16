package defpackage;

import java.io.PrintWriter;
import java.util.Collection;

/* loaded from: classes.dex */
public final class lsj extends lhf implements mnd {
    public final Collection a;
    private final eqj b;
    private final eqn c;
    private final eqj d;
    private final eqn e;
    private final eqj f;
    private final eqn g;
    private final eqj h;
    private final eqn i;
    private final eqj k;
    private final eqn l;

    public lsj() {
        eqj eqjVarC;
        lth lthVarE = lmi.a().e() ? lto.e(yzz.MEDIA_FACET, null, null, null, 14) : null;
        this.a = new ydx(250);
        if (lmi.a().e()) {
            lthVarE.getClass();
            eqjVarC = ((ltn) lthVarE).b;
        } else {
            eqjVarC = tby.C(lgx.b().a(mpz.d), new lpx(loy.j(), 8));
        }
        int i = 3;
        eqj eqjVarV = tby.v(eqjVarC, new lry(i));
        this.b = tby.t(eqjVarC);
        int i2 = 0;
        this.d = b(eqjVarV, new lsg(i2));
        this.f = b(eqjVarV, new lsg(2));
        this.h = b(eqjVarV, new lsg(i));
        this.k = b(eqjVarV, new lsg(4));
        this.c = new lnc(this, 20);
        this.e = new lsh(this, 1);
        this.g = new lsh(this, i2);
        this.i = new lnc(this, 18);
        this.l = new lnc(this, 19);
    }

    private static eqj b(eqj eqjVar, pr prVar) {
        return tby.t(tby.C(eqjVar, new lpx(prVar, 9)));
    }

    public final void a(PrintWriter printWriter) {
        for (lsd lsdVar : this.a) {
            printWriter.println((String.valueOf(lsdVar.a.toOffsetDateTime()) + " [" + lsdVar.b.flattenToShortString() + "] ").concat(lsdVar.a()));
        }
        printWriter.println();
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void c() {
        super.c();
        this.b.fE(this, this.c);
        this.d.fE(this, this.e);
        this.f.fE(this, this.g);
        this.h.fE(this, this.i);
        this.k.fE(this, this.l);
        mnc.a().b(mnb.j, this);
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void d() {
        super.d();
        this.b.k(this.c);
        this.d.k(this.e);
        this.f.k(this.g);
        this.h.k(this.i);
        this.k.k(this.l);
        mnn.b(mki.a.c, "default_media_session_history", 1, new lsf(this, 0));
        mnc.a().d(mnb.j);
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        a(printWriter);
        mnn.a(mki.a.c, "default_media_session_history", printWriter);
    }
}
