package defpackage;

import com.google.android.gearhead.appdecor.AppDecorService;
import com.google.android.gms.car.display.CarDisplay;
import com.google.android.gms.car.display.CarRegionId;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class qfd implements epf {
    final /* synthetic */ AppDecorService a;

    public qfd(AppDecorService appDecorService) {
        this.a = appDecorService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.epf
    public final void fL(eqa eqaVar) {
        AppDecorService appDecorService = this.a;
        ynp ynpVarListIterator = ((yfq) appDecorService.i.values()).listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            ((raa) ynpVarListIterator.next()).a();
        }
        appDecorService.i = ylx.a;
        yfq yfqVarE = nsr.c().e();
        int size = yfqVarE.size();
        for (int i = 0; i < size; i++) {
            ((nso) yfqVarE.get(i)).A(appDecorService.h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.epf
    public final void fy(eqa eqaVar) {
        yfu yfuVar = new yfu(4);
        Iterator it = ((List) kgq.c(new kym(7), "ADU.AppDecorService", yzz.APP_DECOR, yzy.pp, true, "Unable to get car displays for creating SystemUiService binders", new Object[0])).iterator();
        while (it.hasNext()) {
            nso nsoVarA = nsr.c().a(((CarDisplay) it.next()).a);
            yfq yfqVarS = nsoVarA.s();
            int size = yfqVarS.size();
            for (int i = 0; i < size; i++) {
                CarRegionId carRegionId = (CarRegionId) yfqVarS.get(i);
                yfuVar.e(carRegionId, new raa(carRegionId));
            }
            nsoVarA.w(this.a.h);
        }
        this.a.i = yfuVar.d(true);
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fM() {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fv(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fw(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fx(eqa eqaVar) {
    }
}
