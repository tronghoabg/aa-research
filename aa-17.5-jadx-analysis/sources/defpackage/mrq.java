package defpackage;

import android.graphics.Rect;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.display.CarDisplay;

/* loaded from: classes.dex */
public final class mrq {
    public static final yph a = yph.c("GH.BackdropWinCtrl");
    public sab g;
    public ieq h;
    public final mrp b = new mrp();
    public final eqn e = new mmt(this, 5);
    public final eqn f = new mmt(this, 6);
    public final eqj c = tby.n(nfn.a().f);
    public final eqj d = tby.n(ksa.d().e);

    public static boolean a() {
        if (!acxa.bb()) {
            return false;
        }
        if (!kio.b().r()) {
            ((ype) ((ype) a.f()).ai((char) 5234)).u("shouldShow car not connected");
            return false;
        }
        int i = 3;
        kym kymVar = new kym(i);
        yzz yzzVar = yzz.SYSTEM_UI_BACKDROP;
        yzy yzyVar = yzy.Ju;
        sab sabVar = (sab) kgq.c(kymVar, "GH.BackdropWinCtrl", yzzVar, yzyVar, true, "shouldShow: failed to get CarWindowManager", new Object[0]);
        sabVar.getClass();
        return b((CarDisplay) kgq.c(new kja(sabVar, i), "GH.BackdropWinCtrl", yzzVar, yzyVar, true, "shouldShow: unable to get CarDisplay", new Object[0]), acxa.aV() ? (CarInfo) kgq.c(new kym(4), "GH.BackdropWinCtrl", yzzVar, yzyVar, true, "shouldShow: failed to get CarInfo", new Object[0]) : null);
    }

    public static boolean b(CarDisplay carDisplay, CarInfo carInfo) {
        acxa acxaVar = acxa.a;
        if (acxaVar.gu().aT()) {
            abqz abqzVarH = acxaVar.gu().H();
            yph yphVar = kjf.a;
            if (kjf.g(carInfo, abqzVarH.b)) {
                return false;
            }
        }
        yph yphVar2 = nsr.a;
        if (((nsr) mki.a.i(nsr.class)).i(carDisplay.a)) {
            ((ype) ((ype) a.f()).ai((char) 5237)).u("shouldShowForCarDisplay disabled for irregular display");
            return false;
        }
        Rect rectA = carDisplay.a();
        if (rectA.left >= ((int) acxaVar.gu().D()) || rectA.top >= ((int) acxaVar.gu().D()) || rectA.right >= ((int) acxaVar.gu().D()) || rectA.bottom >= ((int) acxaVar.gu().D())) {
            return true;
        }
        ((ype) ((ype) a.f()).ai((char) 5235)).y("shouldShowForCarDisplay threshold not met i=%s", rectA);
        return false;
    }

    public static boolean c(qrn qrnVar) {
        acxa acxaVar = acxa.a;
        if (!acxaVar.gu().aZ()) {
            return false;
        }
        kja kjaVar = new kja(qrnVar, 2);
        yzz yzzVar = yzz.SYSTEM_UI_BACKDROP;
        yzy yzyVar = yzy.Ju;
        sab sabVar = (sab) kgq.c(kjaVar, "GH.BackdropWinCtrl", yzzVar, yzyVar, false, "shouldShowOutOfLifetime: failed to get CarWindowManager", new Object[0]);
        sabVar.getClass();
        return b((CarDisplay) kgq.c(new kja(sabVar, 3), "GH.BackdropWinCtrl", yzzVar, yzyVar, false, "shouldShowOutOfLifetime: unable to get CarDisplay", new Object[0]), acxaVar.gu().aT() ? (CarInfo) kgq.c(new kja(qrnVar, 4), "GH.BackdropWinCtrl", yzzVar, yzyVar, false, "shouldShowOutOfLifetime: failed to get CarInfo", new Object[0]) : null);
    }
}
