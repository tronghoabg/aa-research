package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.time.Duration;

/* loaded from: classes.dex */
public final class mtz extends erm {
    public final eqm a;
    public final eqj b;
    public final eqm c;
    public final eqj d;
    public final eqj e;
    public final eqj f;
    public final eqj g;
    private final eqj i;
    private final eqj j;

    public /* synthetic */ mtz(int i) {
        odt odtVar = (i & 1) != 0 ? new odt() : null;
        tme tmeVar = (i & 2) != 0 ? new tme() : null;
        int i2 = 4;
        int i3 = i & 4;
        odtVar.getClass();
        tmeVar.getClass();
        this.i = odtVar;
        eqm eqmVar = new eqm();
        this.a = eqmVar;
        this.b = mpm.e();
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        afco afcoVar = tby.a;
        eqm eqmVar2 = new eqm(fValueOf);
        this.c = eqmVar2;
        eqj eqjVarV = i3 != 0 ? tby.v(eqmVar2, new mii(19)) : tby.d;
        this.d = eqjVarV;
        int i4 = 0;
        eqj eqjVarA = tby.a(tby.u(kfl.h().j(), false), new tbs(mpm.f(), wub.al(acpc.f()), true, null, new mqe(6)));
        this.j = eqjVarA;
        nso nsoVarB = nsr.c().b();
        eqj eqjVarC = eqy.c(eqy.b(nsoVarB.A, new noo(nsoVarB, 10)), new mii(20));
        eqj eqjVarD = tby.d(nuj.b().a(), ndn.a.a().f, new mqe(7));
        eqj eqjVarE = tby.E(tby.v(lxw.k().compareTo(Duration.ZERO) > 0 ? tby.B(eqjVarD, new mzx(lxw.k(), tmeVar, 1, null)) : tby.v(eqjVarD, new mtw(1)), new mtw(i4)));
        eqj eqjVarO = tby.o((eqj) nwi.a().c.b);
        int i5 = 5;
        eqj eqjVarE2 = tby.e(eqjVarC, eqy.a(tby.q(eqjVarE, eqy.c(eqjVarO, new glh(!lal.a.a().b(), eqjVarO, i5)))), eqmVar, new kuv(15));
        eqj eqjVarA2 = eqy.a(lxw.l().compareTo(Duration.ZERO) > 0 ? tby.m(eqjVarE2, lxw.l(), null) : eqjVarE2);
        eqj eqjVarA3 = eqy.a(tby.q(lxw.m().compareTo(Duration.ZERO) > 0 ? tby.A(eqjVarA2, lxw.m(), new mqe(8)) : eqjVarA2, eqjVarV));
        this.e = eqjVarA3;
        this.f = tby.y(tby.x(eqmVar), tby.v(tby.u(eqjVarA3, afbe.a), new mtw(2)));
        this.g = ogb.a.c() ? tby.d(ofs.a.a().d, eqjVarA, new mqe(i5)) : tby.d(tby.v(odtVar, new mtw(3)), eqjVarA, new mqe(i2));
    }

    public final void a(boolean z) {
        boolean z2 = true;
        if (!z && !lel.a.a().b()) {
            z2 = false;
        }
        this.a.m(Boolean.valueOf(z2));
    }

    public mtz() {
        this(7);
    }
}
