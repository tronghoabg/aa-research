package defpackage;

import com.google.android.gearhead.appdecor.AppDecorService;
import com.google.android.gms.car.display.CarRegionId;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class nrp implements nsg {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nrp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nsg
    public final void a(qrn qrnVar, nso nsoVar) {
        int i = this.b;
        if (i == 0) {
            ((nrq) this.a).e(nsoVar);
            return;
        }
        if (i == 1) {
            mrx mrxVar = (mrx) this.a;
            ncp ncpVar = mrxVar.a;
            if (ncpVar != null) {
                if (Objects.equals(((nso) ncpVar.a).o, nsoVar.o)) {
                    mrxVar.b();
                    mrxVar.a();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            ((onu) this.a).e.run();
            return;
        }
        yfq yfqVarS = nsoVar.s();
        yfu yfuVar = new yfu(4);
        AppDecorService appDecorService = (AppDecorService) this.a;
        yno it = appDecorService.i.keySet().iterator();
        while (it.hasNext()) {
            CarRegionId carRegionId = (CarRegionId) it.next();
            if (!carRegionId.h.equals(nsoVar.o)) {
                yfuVar.e(carRegionId, (raa) appDecorService.i.get(carRegionId));
            } else if (!yfqVarS.contains(carRegionId)) {
                ((ype) AppDecorService.a.l().ai((char) 7038)).y("Removing the SystemUiServiceBinder for %s", carRegionId);
                ((raa) appDecorService.i.get(carRegionId)).a();
            }
        }
        int size = yfqVarS.size();
        for (int i2 = 0; i2 < size; i2++) {
            CarRegionId carRegionId2 = (CarRegionId) yfqVarS.get(i2);
            if (appDecorService.i.containsKey(carRegionId2)) {
                yfuVar.e(carRegionId2, (raa) appDecorService.i.get(carRegionId2));
            } else {
                yfuVar.e(carRegionId2, new raa(carRegionId2));
            }
        }
        appDecorService.i = yfuVar.d(true);
    }
}
