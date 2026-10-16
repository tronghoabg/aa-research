package defpackage;

import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class xfe implements nsg {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ xfe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.nsg
    public final void a(qrn qrnVar, nso nsoVar) {
        int i = this.b;
        if (i == 0) {
            wer.c();
            if (nsoVar != nsr.c().b()) {
                return;
            }
            xff xffVar = (xff) this.a;
            if (xffVar.c) {
                ((ype) xff.a.l().ai((char) 10220)).u("Resizing within lifetime");
                nxo.b().d();
                mua.a().f();
                xffVar.q(!xffVar.d);
                xffVar.p(true);
                return;
            }
            return;
        }
        if (i != 1) {
            wer.c();
            xff xffVar2 = (xff) this.a;
            if (!xffVar2.e) {
                ((ype) ((ype) xff.a.h()).ai((char) 10219)).u("Not restarting primary system UI since not in lifecycle");
                return;
            }
            if (nsoVar != nsr.c().b()) {
                return;
            }
            ((ype) xff.a.l().ai((char) 10217)).u("Resizing lifetime agnostic");
            nyf.a().b();
            nyf.a().c(qrnVar);
            if (leh.a().b()) {
                msh.a().b();
                msh.a().c(qrnVar);
            }
            nim.a().c();
            nim.a().e(mrq.c(qrnVar), qrnVar);
            if (xffVar2.b) {
                nim.a().d();
                nim.a().h(mrq.c(qrnVar), qrnVar);
                return;
            }
            return;
        }
        wer.c();
        CarDisplayId carDisplayId = nsoVar.o;
        mse mseVar = (mse) this.a;
        Map map = mseVar.b;
        yfq yfqVarS = nsoVar.s();
        nrd nrdVar = (nrd) map.get(carDisplayId);
        nrdVar.getClass();
        int size = yfqVarS.size();
        for (int i2 = 0; i2 < size; i2++) {
            CarRegionId carRegionId = (CarRegionId) yfqVarS.get(i2);
            if (!mseVar.c.containsKey(carRegionId)) {
                mseVar.c.put(carRegionId, mse.j(nsoVar, carRegionId, nrdVar));
            }
        }
        HashSet hashSet = new HashSet();
        for (CarRegionId carRegionId2 : mseVar.c.keySet()) {
            if (carRegionId2.h.equals(carDisplayId) && !yfqVarS.contains(carRegionId2)) {
                ((ype) mse.a.l().ai((char) 5249)).y("Removing the AaContext for %s", carRegionId2);
                hashSet.add(carRegionId2);
            }
        }
        mseVar.c.keySet().removeAll(hashSet);
    }
}
