package defpackage;

import com.google.android.gms.car.control.CarAction;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class nkf {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.AlertsControl");

    public static final void a(kjk kjkVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        kjkVar.getClass();
        bux buxVarC = buxVar.c(322908135);
        if ((i & 6) == 0) {
            i2 = (true != buxVarC.E(kjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.A(1) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if (buxVarC.I((i3 & 147) != 146, i3 & 1)) {
            kjz kjzVar = kjkVar.a;
            cfv cfvVar = cfy.e;
            Integer num = (Integer) kkg.b(roc.ao(bxc.f(jul.f(kjzVar), kke.a, buxVarC)));
            if (num == null || num.intValue() == 0) {
                ((ype) b.f()).y("Alert notification new value is %s", num);
                bxf bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    bxfVarJ.c = new nad(kjkVar, cfvVar, i, 9);
                    return;
                }
                return;
            }
            CarAction carAction = kjkVar.b;
            cmw cmwVarB = dao.b(R.drawable.gs_warning_fill1rond100_vd_theme_24, buxVarC, 0);
            boolean zE = buxVarC.E(carAction);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zE || objS == buw.a) {
                objS = new njb(carAction, 5);
                bvvVar.ad(objS);
            }
            buxVarC.v(-969790793);
            lws.p(cmwVarB, (afdr) objS, buxVarC, 8);
            bvvVar.Y(false);
            cfyVar = cfvVar;
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ2 = buxVarC.J();
        if (bxfVarJ2 != null) {
            bxfVarJ2.c = new nad(kjkVar, cfyVar, i, 10);
        }
    }
}
