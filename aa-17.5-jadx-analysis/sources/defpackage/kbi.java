package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.GridTemplate;
import androidx.car.app.model.Header;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.android.car.libraries.apphost.external.model.GridWrapperTemplate;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class kbi implements afeg {
    private final /* synthetic */ int a;

    public /* synthetic */ kbi(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        int i = 11;
        fzy fzyVarD = null;
        switch (this.a) {
            case 0:
                GridTemplate gridTemplate = (GridTemplate) obj;
                geu geuVar = (geu) obj2;
                gridTemplate.getClass();
                geuVar.getClass();
                boolean zIsLoading = gridTemplate.isLoading();
                Header header = gridTemplate.getHeader();
                fzg fzgVarJ = header != null ? fww.j(header, geuVar) : null;
                List listBg = woy.bg(goy.c(gridTemplate, geuVar));
                List<Action> actions = gridTemplate.getActions();
                actions.getClass();
                ArrayList arrayList = new ArrayList(woy.bp(actions, 10));
                for (Action action : actions) {
                    action.getClass();
                    arrayList.add(fvl.c(action, geuVar, grx.i(geuVar), null, false, 12));
                }
                break;
            case 1:
                GridWrapperTemplate gridWrapperTemplate = (GridWrapperTemplate) obj;
                geu geuVar2 = (geu) obj2;
                gridWrapperTemplate.getClass();
                geuVar2.getClass();
                GridTemplate template = gridWrapperTemplate.getTemplate();
                CarIcon backgroundImage = gridWrapperTemplate.getBackgroundImage();
                CarIcon backgroundImage2 = gridWrapperTemplate.getBackgroundImage();
                CarIcon backgroundImage3 = gridWrapperTemplate.getBackgroundImage();
                boolean zIsLoading2 = template.isLoading();
                Header header2 = template.getHeader();
                fzg fzgVarJ2 = header2 != null ? fww.j(header2, geuVar2) : null;
                List listBg2 = woy.bg(goy.c(template, geuVar2));
                List<Action> actions2 = template.getActions();
                actions2.getClass();
                ArrayList arrayList2 = new ArrayList(woy.bp(actions2, 10));
                for (Action action2 : actions2) {
                    action2.getClass();
                    arrayList2.add(fvl.c(action2, geuVar2, grx.i(geuVar2), null, false, 12));
                }
                if (backgroundImage != null) {
                    hao haoVar = new hao(i);
                    hao haoVar2 = new hao(12);
                    ghw ghwVar = ghw.a;
                    ghv ghvVar = ghv.a;
                    ghvVar.getClass();
                    fzyVarD = fxp.d(backgroundImage, geuVar2, haoVar, haoVar2, ghwVar, ghvVar);
                }
                break;
            case 2:
                kkf kkfVar = (kkf) obj;
                kkf kkfVar2 = (kkf) obj2;
                kjo kjoVar = kjq.a;
                kkfVar.getClass();
                kkfVar2.getClass();
                if ((kkfVar2 instanceof kkc) && !((Boolean) ((kkc) kkfVar2).a).booleanValue()) {
                    break;
                }
                break;
            case 3:
                kkf kkfVar3 = (kkf) obj;
                kkf kkfVar4 = (kkf) obj2;
                kjo kjoVar2 = kjq.a;
                kkfVar3.getClass();
                kkfVar4.getClass();
                if ((kkfVar4 instanceof kkc) && ((Number) ((kkc) kkfVar4).a).intValue() != 4) {
                    break;
                }
                break;
            case 4:
                Optional optional = (Optional) obj;
                Optional optional2 = (Optional) obj2;
                Object[] objArr = optional == null || optional.isEmpty();
                Object[] objArr2 = optional2 == null || optional2.isEmpty();
                if (objArr != true && objArr2 != true) {
                    optional.getClass();
                    optional2.getClass();
                    kqg kqgVar = (kqg) optional2.get();
                    yfq yfqVar = (yfq) optional.get();
                    yfl yflVar = new yfl(4);
                    kqf kqfVar = new kqf(kqgVar);
                    Optional optionalFindFirst = Collection.EL.stream(yfqVar).filter(new koh(kqgVar, 5)).findFirst();
                    if (true == optionalFindFirst.isPresent()) {
                        optionalFindFirst = Optional.ofNullable(((kqg) optionalFindFirst.get()).b);
                    }
                    jfz jfzVar = new jfz(kqfVar, 9);
                    if (true == optionalFindFirst.isPresent()) {
                        ((kqf) jfzVar.a).b((Optional) optionalFindFirst.get());
                    }
                    yflVar.i(kqfVar.a());
                    yflVar.k((Iterable) Collection.EL.stream(yfqVar).filter(new koh(kqgVar, 7)).collect(ycm.a));
                    break;
                } else {
                    break;
                }
                break;
            case 5:
                bux buxVar = (bux) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = iIntValue & 3;
                int i3 = iIntValue & 1;
                if (buxVar.I(i2 != 2, i3)) {
                    Object objG = buxVar.g();
                    if (objG == buw.a) {
                        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(kun.a, bxp.c);
                        buxVar.x(parcelableSnapshotMutableState);
                        objG = parcelableSnapshotMutableState;
                    }
                    ((ype) kuo.a.f()).y("insets: %s", asl.w(buxVar).toString());
                    ksr.a(null, null, false, null, bxc.i(-2092910907, true, new juy((bwq) objG, i), buxVar), buxVar, 24576, 15);
                } else {
                    buxVar.s();
                }
                break;
            case 6:
                bux buxVar2 = (bux) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (buxVar2.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    boc.a(dao.b(R.drawable.ic_call, buxVar2, 0), null, asl.H(cfy.e, 2.0f), ksp.j(krr.h, buxVar2), buxVar2, 440, 0);
                } else {
                    buxVar2.s();
                }
                break;
            case 7:
                bux buxVar3 = (bux) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (buxVar3.I((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    boc.a(dao.b(R.drawable.ic_weather_assistantaction, buxVar3, 0), null, null, cjn.n(), buxVar3, 3128, 4);
                } else {
                    buxVar3.s();
                }
                break;
            case 8:
                bux buxVar4 = (bux) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (buxVar4.I((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    kfl.m(kum.g, null, BitmapDescriptorFactory.HUE_RED, 0L, 0L, null, 0L, kum.h, buxVar4, 12582918, 126);
                } else {
                    buxVar4.s();
                }
                break;
            case 9:
                bux buxVar5 = (bux) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (buxVar5.I((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    fww.C(buxVar5, 0);
                } else {
                    buxVar5.s();
                }
                break;
            case 10:
                bux buxVar6 = (bux) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (buxVar6.I((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    fww.B(buxVar6, 0);
                } else {
                    buxVar6.s();
                }
                break;
            case 11:
                bux buxVar7 = (bux) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (buxVar7.I((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    fww.G(buxVar7, 0);
                } else {
                    buxVar7.s();
                }
                break;
            case 12:
                bux buxVar8 = (bux) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (buxVar8.I((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    fww.D(buxVar8, 0);
                } else {
                    buxVar8.s();
                }
                break;
        }
        return fww.I((bux) obj, ((Integer) obj2).intValue());
    }
}
