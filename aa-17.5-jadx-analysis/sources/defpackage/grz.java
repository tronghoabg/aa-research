package defpackage;

import androidx.car.app.model.Alert;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarText;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class grz extends afeo implements afeh {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grz(Object obj, int i) {
        super(3, obj, gsa.class, "toUiModel", "toUiModel(Lcom/android/car/libraries/apphost/message/model/MessageTemplateInternal;Lcom/android/car/libraries/apphost/screenstate/ScreenState;)Lcom/android/car/libraries/apphost/ui/UiModel;", 4);
        this.a = i;
    }

    @Override // defpackage.afeh
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        fxz fxzVar;
        hck hckVarC;
        int i = this.a;
        int i2 = 3;
        hju fxjVar = null;
        if (i != 0) {
            if (i == 1) {
                grb grbVar = (grb) this.receiver;
                long millis = ((Duration) obj2).toMillis();
                long millis2 = ((Duration) obj).toMillis();
                if (millis > 0) {
                    millis2 = Math.min(millis2, millis);
                }
                String strD = grbVar.d(millis);
                String strD2 = grbVar.d(millis2);
                if (strD2 != null) {
                    return strD != null ? grbVar.b.getResources().getString(R.string.formatted_time, strD2, strD) : strD2;
                }
                return null;
            }
            if (i == 2) {
                ((gsv) this.receiver).a((gzc) obj, (Alert) obj2);
                return afak.a;
            }
            gvn gvnVar = (gvn) obj;
            gzc gzcVar = (gzc) obj2;
            gvm gvmVar = (gvm) this.receiver;
            if (gvnVar.e) {
                hkt hktVar = new hkt(gvmVar.d(gvnVar, gzcVar), new fvm(null), null, 88.0f, 88.0f, null, 1.0f, false);
                gzj.d(hktVar, gvnVar);
                return hktVar;
            }
            boolean zA = gzcVar.a();
            fza fzaVarD = gvmVar.d(gvnVar, gzcVar);
            har harVar = gvnVar.b;
            if (harVar != null) {
                geu geuVar = gvmVar.a;
                hcj hcjVar = hcj.a;
                hckVarC = hej.c(harVar, geuVar, false, hbz.b(gzcVar));
            } else {
                hckVarC = null;
            }
            hcl hclVar = new hcl(woy.bj(hckVarC), null, 0, 0, null, gvmVar.b, 62);
            gag gagVar = gvnVar.c;
            gbg gbgVarD = gagVar != null ? fxy.d(gagVar) : null;
            List list = gvnVar.d;
            if (!list.isEmpty()) {
                int iE = fvq.e(list, zA);
                if (!zA) {
                    fxjVar = new fxz(gvmVar.e(list, iE), false, 2, cfl.j);
                } else if (gzcVar == gzc.e && fvq.c(list, iE)) {
                    fxjVar = new fxj(gvmVar.e(list, iE), 3);
                } else {
                    fxjVar = new fxz(gvmVar.e(list, iE), iE >= 0, 3, null, 8);
                }
            }
            gvr gvrVar = new gvr(fzaVarD, hclVar, gbgVarD, fxjVar);
            gzj.d(gvrVar, gvnVar);
            return gvrVar;
        }
        gsb gsbVar = (gsb) obj;
        gzc gzcVar2 = (gzc) obj2;
        gsa gsaVar = (gsa) this.receiver;
        if (gsbVar == null || gsbVar.g) {
            return new fvm(null);
        }
        fyy fyyVar = fyy.a;
        fyy fyyVarC = fwn.c(gzcVar2);
        fzg fzgVar = gsbVar.b;
        fza fzaVarD2 = fzgVar != null ? fzc.d(fzgVar, gsaVar.a, fyyVarC) : null;
        fzy fzyVar = gsbVar.e;
        gab gabVarE = fzyVar != null ? fxy.e(fzyVar, gsaVar.a) : null;
        CarText carText = gsbVar.c;
        geu geuVar2 = gsaVar.a;
        gfa gfaVarK = fzc.k(carText, geuVar2);
        boolean z = gsbVar.a;
        grw grwVar = new grw(gabVarE, gfaVarK, null, z ? new fmn(geuVar2.w().c, 14) : ajac.a(true), z ? 1 : 3, false, 36);
        List list2 = gsbVar.f;
        boolean zA2 = gzcVar2.a();
        if (!list2.isEmpty()) {
            int iE2 = fvq.e(list2, zA2);
            int iD = fvq.d(list2);
            ArrayList arrayList = new ArrayList(woy.bp(list2, 10));
            int i3 = 0;
            for (Object obj4 : list2) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    woy.bo();
                }
                fvu fvuVar = (fvu) obj4;
                boolean z2 = i3 == iE2;
                fvv fvvVar = fvuVar.a;
                CarColor carColor = fvvVar != null ? fvvVar.d : null;
                fwh fwhVar = (carColor == null || carColor.getType() == 1) ? fwh.c : fwh.d;
                ArrayList arrayList2 = arrayList;
                geu geuVar3 = geuVar2;
                arrayList2.add(fvr.h(fvuVar, geuVar3, null, z2, fwhVar, null, null, false, iD, 114));
                arrayList = arrayList2;
                geuVar2 = geuVar3;
                i3 = i4;
            }
            geu geuVar4 = geuVar2;
            ArrayList arrayList3 = arrayList;
            int i5 = gzcVar2 == gzc.e ? 3 : 2;
            if (z) {
                i2 = 1;
                z = true;
            } else if (!zA2) {
                z = false;
            } else if (fvq.c(list2, iE2)) {
                i2 = 2;
                z = false;
            } else {
                z = false;
                i2 = 1;
            }
            int i6 = i2 - 1;
            if (i6 == 0) {
                fxzVar = new fxz(arrayList3, iE2 >= 0, i5, null, 8);
            } else if (i6 == 1) {
                fxjVar = new fxj(arrayList3, i5);
            } else if (((ggk) geuVar4.F(ggk.class)).e()) {
                fxjVar = new fwo(arrayList3, iE2 >= 0, i5);
            } else {
                fxzVar = new fxz(arrayList3, iE2 >= 0, i5, null, 8);
            }
            fxjVar = fxzVar;
        }
        return (gzcVar2.a() || z) ? new hky(fzaVarD2, grwVar, fxjVar) : new hkt(fzaVarD2, new gry(grwVar, fxjVar), null, 88.0f, 88.0f, null, 1.0f, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grz(Object obj, int i, byte[] bArr) {
        super(3, obj, grb.class, "createTrackTimer", "createTrackTimer(Ljava/time/Duration;Ljava/time/Duration;)Ljava/lang/String;", 4);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grz(Object obj, int i, char[] cArr) {
        super(3, obj, gsv.class, "postAlertChange", "postAlertChange(Lcom/android/car/libraries/apphost/screenstate/ScreenState;Landroidx/car/app/model/Alert;)V", 4);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grz(Object obj, int i, short[] sArr) {
        super(3, obj, gvm.class, "toUiModel", "toUiModel(Lcom/android/car/libraries/apphost/pane/model/PaneTemplateInternal;Lcom/android/car/libraries/apphost/screenstate/ScreenState;)Lcom/android/car/libraries/apphost/ui/UiModel;", 4);
        this.a = i;
    }
}
