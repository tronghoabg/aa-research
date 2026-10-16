package defpackage;

import com.google.android.gms.car.display.CarRegionId;
import j$.lang.Iterable$EL;
import j$.util.Map;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class mse extends msd {
    public static final yph a = yph.c("GH.ContextMngrImpl");
    public Map c;
    private final AtomicBoolean d = new AtomicBoolean();
    private final nsg e = new xfe(this, 1);
    public final Map b = new HashMap();

    public static tgs j(nso nsoVar, CarRegionId carRegionId, nrd nrdVar) {
        tgs tgsVar = new tgs();
        tgsVar.e(nso.class, new kpg(nsoVar, 3));
        tgsVar.e(nrd.class, new kpg(nrdVar, 4));
        tgsVar.e(mpk.class, new kpg(carRegionId, 5));
        return tgsVar;
    }

    private final void k() {
        if (!this.d.get()) {
            throw new lhs("Cannot use this method if service has not been started.");
        }
    }

    @Override // defpackage.msd
    public final void b() {
        this.d.set(false);
        Map map = this.b;
        Iterable$EL.forEach(map.values(), new iwu(17));
        Map map2 = this.c;
        if (map2 != null) {
            map2.clear();
        }
        map.clear();
    }

    @Override // defpackage.lhg
    public final void c() {
        nrd nrdVarA = nrd.a();
        ebf.j().n(yfq.s(nrdVarA.e() ? acai.i : acai.l, nrdVarA.d() ? acai.j : acai.m, nrdVarA.f() ? acai.k : acai.n));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lhg
    public final void d() {
        wer.c();
        yfq yfqVarE = nsr.c().e();
        int size = yfqVarE.size();
        for (int i = 0; i < size; i++) {
            nso nsoVar = (nso) yfqVarE.get(i);
            nsoVar.A(this.e);
            nsoVar.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.msd
    public final void e(final qrn qrnVar) {
        wer.c();
        this.c = new HashMap();
        yph yphVar = nsr.a;
        woy.aa(((nsr) mki.a.i(nsr.class)).h(), "DisplayLayoutManager must be initialized.");
        yph yphVar2 = mpr.a;
        woy.aa(((mpr) mki.a.i(mpr.class)).g, "AuxiliaryDisplayConfiguration must be initialized.");
        yfq yfqVarE = ((nsr) mki.a.i(nsr.class)).e();
        int size = yfqVarE.size();
        for (int i = 0; i < size; i++) {
            final nso nsoVar = (nso) yfqVarE.get(i);
            nrd nrdVar = (nrd) Map.EL.computeIfAbsent(this.b, nsoVar.o, new kqm(3));
            yfq yfqVarS = nsoVar.s();
            int size2 = yfqVarS.size();
            for (int i2 = 0; i2 < size2; i2++) {
                CarRegionId carRegionId = (CarRegionId) yfqVarS.get(i2);
                this.c.put(carRegionId, j(nsoVar, carRegionId, nrdVar));
            }
            wer.c();
            kgq.c(new kja(new kiy() { // from class: nse
                @Override // defpackage.kiy
                public final void a() throws qrz {
                    mki.a.g();
                    rce rceVar = ((raz) qrnVar).a;
                    rox roxVar = ((rdj) rceVar).f;
                    nso nsoVar2 = nsoVar;
                    roxVar.g(new rdu(rceVar, nsoVar2.G, 1));
                    nsoVar2.C = true;
                }
            }, 1), "GH.DisplayLayout", yzz.DISPLAY_LAYOUT, yzy.rL, false, "Car not connected when trying to register CarDisplayLayoutUpdateCompleteListener", new Object[0]);
            mhv mhvVarA = mhv.a();
            wyd wydVar = nsoVar.F;
            wer.c();
            mhvVarA.f.add(wydVar);
            nsoVar.w(this.e);
        }
        Iterable$EL.forEach(this.b.values(), new jow(qrnVar, 3));
        this.d.set(true);
    }

    @Override // defpackage.msd
    public final tgs f(CarRegionId carRegionId) {
        k();
        tgs tgsVar = (tgs) this.c.get(carRegionId);
        tgsVar.getClass();
        return tgsVar;
    }

    @Override // defpackage.msd
    public final tgs g(rjj rjjVar) {
        k();
        for (Map.Entry entry : this.c.entrySet()) {
            tgs tgsVar = (tgs) entry.getValue();
            nso nsoVar = (nso) tgsVar.i(nso.class);
            if (((CarRegionId) entry.getKey()).a() && nsoVar.q == rji.c) {
                if (mpr.a().c(nsoVar.o) == rjjVar) {
                    return tgsVar;
                }
            }
        }
        return null;
    }

    @Override // defpackage.msd
    public final tgs h() {
        k();
        for (Map.Entry entry : this.c.entrySet()) {
            tgs tgsVar = (tgs) entry.getValue();
            nso nsoVar = (nso) tgsVar.i(nso.class);
            if (((CarRegionId) entry.getKey()).a() && nsoVar.q == rji.b) {
                return tgsVar;
            }
        }
        return null;
    }

    @Override // defpackage.msd
    public final tgs i() {
        k();
        tgs tgsVar = (tgs) this.c.get(CarRegionId.a);
        tgsVar.getClass();
        return tgsVar;
    }
}
