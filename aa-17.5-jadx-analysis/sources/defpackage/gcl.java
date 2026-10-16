package defpackage;

import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.EnumSet;

/* loaded from: classes2.dex */
public final class gcl implements afeg {
    private final /* synthetic */ int d;
    public static final gcl c = new gcl(2);
    public static final gcl b = new gcl(1);
    public static final gcl a = new gcl(0);

    public gcl(int i) {
        this.d = i;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                bux buxVar = (bux) obj;
                ((Number) obj2).intValue();
                buxVar.v(1197353253);
                long jH = cjv.h(czz.at(buxVar).A, 0.4f);
                buxVar.o();
                break;
            case 1:
                bux buxVar2 = (bux) obj;
                ((Number) obj2).intValue();
                buxVar2.v(853071744);
                buxVar2.o();
                break;
            case 2:
                bux buxVar3 = (bux) obj;
                ((Number) obj2).intValue();
                buxVar3.v(1772859253);
                long jH2 = cjv.h(kfn.i(buxVar3).y(), 0.4f);
                buxVar3.o();
                break;
            case 3:
                tjo tjoVar = (tjo) obj;
                tjoVar.getClass();
                tjoVar.e();
                ((tik) tjoVar).a = (CarText) obj2;
                break;
            case 4:
                tjo tjoVar2 = (tjo) obj;
                tjoVar2.getClass();
                tjoVar2.e();
                ((tik) tjoVar2).b = (CarIcon) obj2;
                break;
            case 5:
                tjo tjoVar3 = (tjo) obj;
                tjoVar3.getClass();
                tjoVar3.e();
                ((tik) tjoVar3).c = (us) obj2;
                break;
            case 6:
                tjo tjoVar4 = (tjo) obj;
                tjoVar4.getClass();
                tjoVar4.e();
                ((tik) tjoVar4).d = (Boolean) obj2;
                break;
            case 7:
                tjo tjoVar5 = (tjo) obj;
                tjoVar5.getClass();
                tjoVar5.e();
                ((tik) tjoVar5).e = (CarColor) obj2;
                break;
            case 8:
                tjo tjoVar6 = (tjo) obj;
                tjoVar6.getClass();
                tjoVar6.e();
                ((tik) tjoVar6).f = (EnumSet) obj2;
                break;
            case 9:
                tjo tjoVar7 = (tjo) obj;
                tjoVar7.getClass();
                tjoVar7.e();
                tjk tjkVar = (tjk) obj2;
                tjkVar.getClass();
                ((tjj) tjoVar7).a = tjkVar;
                break;
            case 10:
                tjo tjoVar8 = (tjo) obj;
                tjoVar8.getClass();
                tjoVar8.e();
                ((tin) tjoVar8).a = (CarText) obj2;
                break;
            case 11:
                tjo tjoVar9 = (tjo) obj;
                tjoVar9.getClass();
                tjoVar9.e();
                ((tiq) tjoVar9).a = (CharSequence) obj2;
                break;
            case 12:
                tjo tjoVar10 = (tjo) obj;
                tjoVar10.getClass();
                tjoVar10.e();
                ((tiq) tjoVar10).c = (uh) obj2;
                break;
            case 13:
                tjo tjoVar11 = (tjo) obj;
                tjoVar11.getClass();
                tjoVar11.e();
                ((tjr) tjoVar11).a = ((Boolean) obj2).booleanValue();
                break;
            case 14:
                tjo tjoVar12 = (tjo) obj;
                tjoVar12.getClass();
                tjoVar12.e();
                CharSequence charSequence = (CharSequence) obj2;
                charSequence.getClass();
                ((tji) tjoVar12).a = charSequence;
                break;
            case 15:
                tjo tjoVar13 = (tjo) obj;
                tjoVar13.getClass();
                tjoVar13.e();
                ((tis) tjoVar13).j = ((Boolean) obj2).booleanValue();
                break;
            case 16:
                tjo tjoVar14 = (tjo) obj;
                tjoVar14.getClass();
                tjoVar14.e();
                ((tis) tjoVar14).a = ((Boolean) obj2).booleanValue();
                break;
            case 17:
                tjo tjoVar15 = (tjo) obj;
                tjoVar15.getClass();
                tjoVar15.e();
                ((tis) tjoVar15).b = ((Boolean) obj2).booleanValue();
                break;
            case 18:
                tjo tjoVar16 = (tjo) obj;
                tjoVar16.getClass();
                tjoVar16.e();
                CarText carText = (CarText) obj2;
                carText.getClass();
                ((tis) tjoVar16).c = carText;
                break;
            case 19:
                tjo tjoVar17 = (tjo) obj;
                tjoVar17.getClass();
                tjoVar17.e();
                ((tis) tjoVar17).d = (CarIcon) obj2;
                break;
            default:
                tjo tjoVar18 = (tjo) obj;
                tjoVar18.getClass();
                tjoVar18.e();
                ((tis) tjoVar18).e = (tix) obj2;
                break;
        }
        return afak.a;
    }
}
