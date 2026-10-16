package defpackage;

import android.content.ComponentName;
import android.os.Build;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class niz implements afeg {
    private final /* synthetic */ int a;

    public /* synthetic */ niz(int i) {
        this.a = i;
    }

    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                List list = (List) obj;
                ComponentName componentName = (ComponentName) obj2;
                njj njjVar = njp.a;
                list.getClass();
                ComponentName componentName2 = (ComponentName) woy.bH(list);
                return componentName2 == null ? componentName : componentName2;
            case 1:
                List list2 = (List) obj;
                ComponentName componentName3 = (ComponentName) obj2;
                njj njjVar2 = njp.a;
                list2.getClass();
                ComponentName componentName4 = (ComponentName) woy.bH(list2);
                if (componentName4 != null) {
                    return componentName4;
                }
                if (componentName3 != null) {
                    return componentName3;
                }
                ComponentName componentName5 = mkn.b;
                componentName5.getClass();
                return componentName5;
            case 2:
                mqc mqcVar = (mqc) obj;
                nmj nmjVar = (nmj) obj2;
                njj njjVar3 = njp.a;
                if (mqcVar != null) {
                    zF = affa.f(nmjVar != null ? nmjVar.b : null, mqcVar.a());
                }
                return Boolean.valueOf(zF);
            case 3:
                nmj nmjVar2 = (nmj) obj;
                nmj nmjVar3 = (nmj) obj2;
                njj njjVar4 = njp.a;
                nmjVar2.getClass();
                return nmjVar3 == null ? nmjVar2 : nmjVar3;
            case 4:
                bux buxVar = (bux) obj;
                ((Integer) obj2).intValue();
                nko nkoVar = nko.a;
                buxVar.v(-309348113);
                String strE = vq.e(R.string.control_ac_on, buxVar);
                buxVar.o();
                return strE;
            case 5:
                bux buxVar2 = (bux) obj;
                ((Integer) obj2).intValue();
                nko nkoVar2 = nko.a;
                buxVar2.v(1665635991);
                String strE2 = vq.e(R.string.control_ac_off, buxVar2);
                buxVar2.o();
                return strE2;
            case 6:
                bux buxVar3 = (bux) obj;
                ((Integer) obj2).intValue();
                nko nkoVar3 = nko.a;
                buxVar3.v(-1021312946);
                String strE3 = vq.e(R.string.control_sync, buxVar3);
                buxVar3.o();
                return strE3;
            case 7:
                bux buxVar4 = (bux) obj;
                ((Integer) obj2).intValue();
                nko nkoVar4 = nko.a;
                buxVar4.v(-1491000646);
                String strE4 = vq.e(R.string.control_auto, buxVar4);
                buxVar4.o();
                return strE4;
            case 8:
                bux buxVar5 = (bux) obj;
                ((Integer) obj2).intValue();
                nko nkoVar5 = nko.a;
                buxVar5.v(174442843);
                String strE5 = vq.e(R.string.control_off, buxVar5);
                buxVar5.o();
                return strE5;
            case 9:
                bux buxVar6 = (bux) obj;
                ((Integer) obj2).intValue();
                nko nkoVar6 = nko.a;
                buxVar6.v(-598199876);
                String strE6 = vq.e(R.string.control_off, buxVar6);
                buxVar6.o();
                return strE6;
            case 10:
                return roc.an((bux) obj, ((Integer) obj2).intValue());
            case 11:
                nsv nsvVar = (nsv) obj;
                Boolean bool = (Boolean) obj2;
                nqa nqaVar = nqd.a;
                nsvVar.getClass();
                if (nsvVar == nsv.f || (bool.booleanValue() && nsvVar == nsv.g)) {
                    zF = true;
                }
                return Boolean.valueOf(zF);
            case 12:
                ((cqu) obj).getClass();
                return afak.a;
            case 13:
                ((Integer) obj).intValue();
                nuh nuhVar = (nuh) obj2;
                yph yphVar = nxm.a;
                nuhVar.getClass();
                return nuhVar.d;
            case 14:
                bux buxVar7 = (bux) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (buxVar7.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    String str = Build.MANUFACTURER;
                    str.getClass();
                    boolean zU = afyh.u(str, "samsung", true);
                    eru eruVarA = esh.a(buxVar7);
                    if (eruVarA == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    oal oalVar = (oal) epq.e(affw.b(oal.class), eruVarA, null, null, ecw.g(eruVarA));
                    Object objG = buxVar7.g();
                    if (objG == buw.a) {
                        objG = Boolean.valueOf(ldz.a.a().b());
                        buxVar7.x(objG);
                    }
                    boolean zBooleanValue = ((Boolean) objG).booleanValue();
                    ygr ygrVar = oal.a;
                    nyx.d(zU, oalVar, zBooleanValue, buxVar7, 448);
                } else {
                    buxVar7.s();
                }
                return afak.a;
            case 15:
                return ooi.a((bux) obj, ((Integer) obj2).intValue());
            case 16:
                bux buxVar8 = (bux) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (buxVar8.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    brp.b(vq.e(R.string.remove_widget_dialog_title, buxVar8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, dfw.v(czz.av(buxVar8).f, 0L, 0L, null, null, null, null, 0L, null, 3, 0, 0L, null, null, 16744447), buxVar8, 0, 0, 131070);
                } else {
                    buxVar8.s();
                }
                return afak.a;
            case 17:
                bux buxVar9 = (bux) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (buxVar9.I((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    brp.b(vq.e(R.string.remove_widget_dialog_message, buxVar9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, czz.av(buxVar9).k, buxVar9, 0, 0, 131070);
                } else {
                    buxVar9.s();
                }
                return afak.a;
            case 18:
                return ooi.a((bux) obj, ((Integer) obj2).intValue());
            case 19:
                bux buxVar10 = (bux) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (buxVar10.I((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    brp.b(vq.e(R.string.widget_limit_reached_title, buxVar10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, dfw.v(czz.av(buxVar10).f, 0L, 0L, null, null, null, null, 0L, null, 3, 0, 0L, null, null, 16744447), buxVar10, 0, 0, 131070);
                } else {
                    buxVar10.s();
                }
                return afak.a;
            default:
                bux buxVar11 = (bux) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (buxVar11.I((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    brp.b(vq.f(R.string.widget_limit_reached_message, new Object[]{Integer.valueOf(lec.a.a().a())}, buxVar11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, czz.av(buxVar11).k, buxVar11, 0, 0, 131070);
                } else {
                    buxVar11.s();
                }
                return afak.a;
        }
    }
}
