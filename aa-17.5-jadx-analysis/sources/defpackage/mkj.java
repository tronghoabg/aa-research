package defpackage;

import android.content.Context;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.projection.gearhead.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class mkj implements afdr {
    private final /* synthetic */ int a;

    public /* synthetic */ mkj(int i) {
        this.a = i;
    }

    @Override // defpackage.afdr
    public final Object invoke() {
        byte[] bArr = null;
        switch (this.a) {
            case 0:
                mkk mkkVar = mkm.a;
                Executor executor = mki.a.d;
                executor.getClass();
                break;
            case 2:
                Context context = mki.a.c;
                context.getClass();
                break;
            case 4:
                int i = mub.c;
                break;
            case 7:
                nes nesVar = nev.a;
                break;
            case 13:
                yph yphVar = nhm.a;
                List list = nii.j;
                int iAV = woy.aV(woy.bp(list, 10));
                if (iAV < 16) {
                    iAV = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iAV);
                afao afaoVar = new afao((afar) list);
                while (afaoVar.hasNext()) {
                    Object next = afaoVar.next();
                    linkedHashMap.put(next, new cil());
                }
                break;
            case 14:
                yph yphVar2 = nhm.a;
                break;
            case 15:
                yph yphVar3 = nhm.a;
                break;
            case 16:
                yph yphVar4 = nhm.a;
                break;
            case 17:
                njj njjVar = njp.a;
                nso nsoVarB = nsr.c().b();
                mmc.c();
                yfy yfyVarK = mmc.h() ? yfy.k(nsoVarB.r(mud.h.a().e()), new ProjectionWindowAnimationParams(R.anim.dashboard_fade_in, false, null, 0)) : ylx.a;
                rcc rccVar = new rcc();
                rccVar.e(yfy.l(CarRegionId.a, 1, nsoVarB.r(mud.h.a().e()), 0));
                rccVar.f(yfyVarK);
                rccVar.a = true;
                break;
        }
        return afak.a;
    }
}
