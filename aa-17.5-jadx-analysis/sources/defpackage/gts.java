package defpackage;

import androidx.car.app.model.CarColor;
import androidx.car.app.navigation.model.Step;
import java.util.List;

/* loaded from: classes2.dex */
public final class gts implements hem {
    public final geu a;
    public gta c;
    public gtn d;
    public final yob b = yob.c("com/android/car/libraries/apphost/nav/services/RouteInfoService");
    public final ajab e = ajac.a(null);
    public final ajab f = ajac.a(null);

    public gts(geu geuVar) {
        this.a = geuVar;
    }

    public final void a() {
        gmq gmqVar;
        List listBg;
        gtr gtrVar;
        Step step;
        gtn gtnVar = this.d;
        gta gtaVar = null;
        gtjVar = null;
        gtj gtjVar = null;
        gtlVar = null;
        gtl gtlVar = null;
        if (gtnVar != null) {
            gbz gbzVar = new gbz(this.a, 14);
            gth gthVar = gtnVar.b;
            gtf gtfVar = gthVar != null ? new gtf(null, gthVar) : null;
            gtq gtqVar = gtnVar.a;
            if (gtqVar != null && (gmqVar = gtqVar.b) != null) {
                CarColor carColor = gtqVar.a;
                gtp gtpVar = (gtp) gmqVar.a;
                if (gtpVar != null) {
                    if (gtpVar instanceof gto) {
                        gto gtoVar = (gto) gtpVar;
                        gtm gtmVar = new gtm(gtoVar.a, gtoVar.b, gtoVar.c);
                        gka.b(gtmVar, gka.a(gtpVar));
                        listBg = woy.bg(gtmVar);
                    } else if (!(gtpVar instanceof gtr) || (step = (gtrVar = (gtr) gtpVar).b) == null) {
                        listBg = null;
                    } else {
                        List listBk = woy.bk(gsm.c(step, gtrVar.a, gtrVar.d));
                        Step step2 = gtrVar.c;
                        if (step2 != null) {
                            listBk.add(gsm.c(step2, null, null));
                        }
                        listBg = listBk;
                    }
                    if (listBg != null) {
                        gtjVar = new gtj(listBg);
                    }
                }
                gtlVar = new gtl(carColor, new gmq(gtjVar));
            }
            gta gtaVar2 = new gta(gtfVar, gtlVar, gbzVar);
            gka.b(gtaVar2, gka.a(gtnVar));
            gtaVar = gtaVar2;
        }
        this.e.d(gtaVar);
    }

    public final void b() {
        gtq gtqVar;
        gta gtaVar = this.c;
        gtl gtlVar = null;
        if (gtaVar != null) {
            gtn gtnVar = this.d;
            CarColor carColor = (gtnVar == null || (gtqVar = gtnVar.a) == null) ? null : gtqVar.a;
            if (carColor != null) {
                gtl gtlVar2 = gtaVar.b;
                if (gtlVar2 != null) {
                    gmq gmqVar = gtlVar2.b;
                    gmq gmqVar2 = new gmq(gmqVar.a);
                    gka.b(gmqVar2, gka.a(gmqVar));
                    gtlVar = new gtl(carColor, gmqVar2);
                }
                gta gtaVar2 = new gta(gtaVar.a, gtlVar, gtaVar.c);
                gka.b(gtaVar2, gka.a(gtaVar));
                gtaVar = gtaVar2;
            }
        } else {
            gtaVar = null;
        }
        this.f.d(gtaVar);
    }
}
