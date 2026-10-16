package defpackage;

import com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment;
import com.google.android.gms.car.CarInfo;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class nqy implements afdr {
    private final /* synthetic */ int a;

    public /* synthetic */ nqy(int i) {
        this.a = i;
    }

    @Override // defpackage.afdr
    public final Object invoke() throws qrz {
        boolean z = false;
        z = false;
        switch (this.a) {
            case 0:
                return a.Q();
            case 1:
                Object objT = khc.t(new wci("GH.ImmersiveToolbarFrag", yzz.IMMERSIVE_MODE, yzy.Ma, "Failed to get car window manager.", new Object[0]), new nqy(z ? 1 : 0));
                objT.getClass();
                return (sab) objT;
            case 2:
                int i = nyx.a;
                return afak.a;
            case 3:
                yph yphVar = RailStatusBarFragment.b;
                yph yphVar2 = nkd.a;
                CarInfo carInfo = (CarInfo) khc.t(new wci("GH.RailStatusBarFrag", yzz.RAIL, yzy.eO, "Unable to get CarInfo", new Object[0]), new nqy(4));
                carInfo.getClass();
                if (carInfo.g && (carInfo.o || carInfo.n)) {
                    ((ype) ((ype) nkd.a.f()).l(1, TimeUnit.MINUTES)).u("Showing battery and phone signal so there's a status bar");
                }
                boolean z2 = carInfo.g;
                boolean z3 = carInfo.o && !z2;
                if (carInfo.n && !z2) {
                    z = true;
                }
                return new nkd(z2, z3, z);
            case 4:
                mki.a.f();
                CarInfo carInfoD = oni.d(kio.b().e());
                carInfoD.getClass();
                return carInfoD;
            case 5:
                oaf oafVar = oaf.a;
                nfr.a.a().b();
                return afak.a;
            case 6:
                oaf oafVar2 = oaf.a;
                nfr nfrVarA = nfr.a.a();
                qrn qrnVarE = kio.b().e();
                qrnVarE.getClass();
                nfrVarA.f(qrnVarE);
                return afak.a;
            case 7:
                oaf oafVar3 = oaf.a;
                nfr nfrVarA2 = nfr.a.a();
                qrn qrnVarE2 = kio.b().e();
                qrnVarE2.getClass();
                nfrVarA2.e(qrnVarE2);
                return afak.a;
            case 8:
                return new ofx();
            case 9:
                return ofz.a();
            case 10:
                return new ois(null);
            case 11:
                return new opr();
            case 12:
                return afak.a;
            case 13:
                return ozf.c();
            case 14:
                return Boolean.valueOf(wer.g());
            case 15:
                return afak.a;
            case 16:
                return new thw(tjk.a);
            case 17:
                return new thw(tjk.b);
            case 18:
                return new thw(tjk.c);
            case 19:
                return new thw(tjk.d);
            default:
                bvf bvfVar = tii.a;
                return yph.c("Gh.ComposeScreen");
        }
    }
}
