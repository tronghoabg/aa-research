package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.gms.car.navigation.DestinationDistance;
import com.google.android.gms.car.navigation.NavigationCurrentPosition;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class kuv implements afeh {
    private final /* synthetic */ int a;

    public /* synthetic */ kuv(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        int i2 = 2;
        switch (this.a) {
            case 0:
                bux buxVar = (bux) obj2;
                ((Integer) obj3).intValue();
                kuw kuwVar = kuw.a;
                ((Context) obj).getClass();
                buxVar.v(1830246084);
                eqj eqjVarA = lgx.b().a(mpz.d);
                eqjVarA.getClass();
                Object objG = buxVar.g();
                Object obj4 = buw.a;
                if (objG == obj4) {
                    objG = new kmn(i);
                    buxVar.x(objG);
                }
                eqj eqjVarC = eqy.c(eqjVarA, (afec) objG);
                Object objG2 = buxVar.g();
                if (objG2 == obj4) {
                    objG2 = new kmn(i);
                    buxVar.x(objG2);
                }
                bym bymVarE = bxc.e(tby.v(eqjVarC, (afec) objG2), buxVar);
                Object objG3 = buxVar.g();
                if (objG3 == obj4) {
                    kur kurVar = new kur(bymVarE, 11);
                    lah lahVar = byj.a;
                    bvk bvkVar = new bvk(kurVar, null);
                    buxVar.x(bvkVar);
                    objG3 = bvkVar;
                }
                bym bymVar = (bym) objG3;
                buxVar.o();
                return bymVar;
            case 1:
                Context context = (Context) obj;
                bux buxVar2 = (bux) obj2;
                ((Integer) obj3).intValue();
                kuw kuwVar2 = kuw.a;
                context.getClass();
                buxVar2.v(1251328287);
                Object objG4 = buxVar2.g();
                if (objG4 == buw.a) {
                    Drawable drawable = context.getDrawable(2131231002);
                    drawable.getClass();
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(GhIcon.l(((BitmapDrawable) drawable).getBitmap()), bxp.c);
                    buxVar2.x(parcelableSnapshotMutableState);
                    objG4 = parcelableSnapshotMutableState;
                }
                bwq bwqVar = (bwq) objG4;
                buxVar2.o();
                return bwqVar;
            case 2:
                bux buxVar3 = (bux) obj2;
                ((Integer) obj3).intValue();
                kuw kuwVar3 = kuw.a;
                ((Context) obj).getClass();
                buxVar3.v(-1048309810);
                Object objG5 = buxVar3.g();
                if (objG5 == buw.a) {
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new ParcelableSnapshotMutableState(new GhIcon(8), bxp.c);
                    buxVar3.x(parcelableSnapshotMutableState2);
                    objG5 = parcelableSnapshotMutableState2;
                }
                bwq bwqVar2 = (bwq) objG5;
                buxVar3.o();
                return bwqVar2;
            case 3:
                return roc.aC((atm) obj, (bux) obj2, ((Integer) obj3).intValue());
            case 4:
                return roc.aC((atm) obj, (bux) obj2, ((Integer) obj3).intValue());
            case 5:
                lzi lziVar = (lzi) obj;
                Integer num = (Integer) obj2;
                NavigationCurrentPosition navigationCurrentPosition = (NavigationCurrentPosition) obj3;
                yph yphVar = laa.a;
                abnp abnpVarN = osi.a.n();
                if (lziVar != null) {
                    osc oscVarA = laa.a(lziVar.a);
                    abnpVarN.t();
                    osi osiVar = (osi) abnpVarN.b;
                    oscVarA.getClass();
                    osiVar.f = oscVarA;
                    osiVar.b |= 2;
                }
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (iIntValue == 1) {
                        i = 2;
                    } else if (iIntValue != 2) {
                        i = iIntValue != 5 ? 1 : 4;
                    }
                    abnpVarN.t();
                    osi osiVar2 = (osi) abnpVarN.b;
                    osiVar2.c = i - 1;
                    osiVar2.b |= 1;
                }
                if (navigationCurrentPosition != null) {
                    yfq yfqVarA = navigationCurrentPosition.a();
                    int size = yfqVarA.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        DestinationDistance destinationDistance = (DestinationDistance) yfqVarA.get(i3);
                        abnp abnpVarN2 = osh.a.n();
                        long j = destinationDistance.c;
                        abnpVarN2.t();
                        osh oshVar = (osh) abnpVarN2.b;
                        oshVar.b |= 1;
                        oshVar.c = j;
                        String str = destinationDistance.b;
                        if (str != null) {
                            abnpVarN2.t();
                            osh oshVar2 = (osh) abnpVarN2.b;
                            oshVar2.b |= 2;
                            oshVar2.d = str;
                        }
                        abnpVarN.t();
                        osi osiVar3 = (osi) abnpVarN.b;
                        osh oshVar3 = (osh) abnpVarN2.q();
                        oshVar3.getClass();
                        aboh abohVar = osiVar3.e;
                        if (!abohVar.c()) {
                            osiVar3.e = abnv.I(abohVar);
                        }
                        osiVar3.e.add(oshVar3);
                    }
                }
                return (osi) abnpVarN.q();
            case 6:
                return new lqt(((Boolean) obj).booleanValue(), (lqs) obj2, (lqr) obj3);
            case 7:
                return new lqm((AaPlaybackState) obj, ((Boolean) obj2).booleanValue(), ((Integer) obj3).intValue());
            case 8:
                return new lqr(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue());
            case 9:
                return new lra((ComponentName) obj, ((lol) obj2) != null ? (lmd) obj3 : null);
            case 10:
                return new lrn((lod) obj, (AaPlaybackState) obj2, (lmd) obj3);
            case 11:
                ygr ygrVar = (ygr) obj;
                List list = (List) obj2;
                List list2 = (List) obj3;
                yph yphVar2 = mqo.a;
                ArrayList arrayList = new ArrayList();
                if (ygrVar != null) {
                    arrayList.addAll(ygrVar);
                }
                if (list != null) {
                    arrayList.addAll(list);
                }
                if (list2 != null) {
                    arrayList.addAll(list2);
                }
                return arrayList;
            case 12:
                mst mstVar = (mst) obj;
                bux buxVar4 = (bux) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                mstVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= true != ((iIntValue2 & 8) == 0 ? buxVar4.C(mstVar) : buxVar4.E(mstVar)) ? 2 : 4;
                }
                if (buxVar4.I((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                    lxw.p(mstVar, buxVar4, (iIntValue2 & 14) | 8);
                } else {
                    buxVar4.s();
                }
                return afak.a;
            case 13:
                return msv.a((mst) obj, (bux) obj2, ((Integer) obj3).intValue());
            case 14:
                return msv.a((mst) obj, (bux) obj2, ((Integer) obj3).intValue());
            case 15:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                List list3 = (List) obj2;
                Boolean bool = (Boolean) obj3;
                list3.getClass();
                afbt afbtVar = new afbt(10);
                if (zBooleanValue) {
                    afbtVar.add(mso.a);
                }
                ArrayList arrayList2 = new ArrayList(woy.bp(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new msp(((nuh) it.next()).d));
                }
                afbtVar.addAll(arrayList2);
                if (!lel.a.a().b() && !bool.booleanValue()) {
                    afbtVar.add(msr.a);
                }
                return afbtVar.f();
            case 16:
                bux buxVar5 = (bux) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((abu) obj).getClass();
                if (buxVar5.I((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    boc.a(dao.b(R.drawable.ic_assistant_logo, buxVar5, 0), null, awd.i(asl.J(cfy.e, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, gjk.d.k, BitmapDescriptorFactory.HUE_RED), 32.0f), 0L, buxVar5, 56, 8);
                } else {
                    buxVar5.s();
                }
                return afak.a;
            case 17:
                bux buxVar6 = (bux) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((abu) obj).getClass();
                if (buxVar6.I((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    boc.a(dao.b(R.drawable.quantum_gm_ic_arrow_forward_ios_vd_theme_24, buxVar6, 0), null, awd.i(asl.J(cfy.e, gjk.f.k, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), 24.0f), 0L, buxVar6, 56, 8);
                } else {
                    buxVar6.s();
                }
                return afak.a;
            case 18:
                int iIntValue5 = ((Integer) obj).intValue();
                bux buxVar7 = (bux) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                yph yphVar3 = myv.a;
                buxVar7.v(-464823504);
                if ((((iIntValue6 & 14) ^ 6) <= 4 || !buxVar7.A(iIntValue5)) && (iIntValue6 & 6) != 4) {
                    z = false;
                }
                Object objG6 = buxVar7.g();
                if (z || objG6 == buw.a) {
                    objG6 = new kmk(iIntValue5, i2);
                    buxVar7.x(objG6);
                }
                bbt bbtVarB = bbv.b(0, (afdr) objG6, buxVar7, 3);
                buxVar7.o();
                return bbtVarB;
            case 19:
                Object objEvaluate = nbb.b.evaluate(((Float) obj).floatValue(), (Integer) obj2, (Integer) obj3);
                objEvaluate.getClass();
                Integer num2 = (Integer) objEvaluate;
                num2.intValue();
                return num2;
            default:
                String str2 = (String) obj;
                bux buxVar8 = (bux) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                str2.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= true != buxVar8.C(str2) ? 2 : 4;
                }
                if (buxVar8.I((iIntValue7 & 19) != 18, iIntValue7 & 1)) {
                    cfy cfyVarM = awd.m(asl.J(cfy.e, 2.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), 20.0f);
                    dfw dfwVar = czz.av(buxVar8).d;
                    long j2 = nlx.a;
                    long j3 = nlx.a;
                    dkr.a(BitmapDescriptorFactory.HUE_RED);
                    brp.b(str2, cfyVarM, 0L, 0L, null, 0L, new dkt(3), 0L, 0, false, 1, 0, dfw.v(dfwVar, 0L, j3, null, null, null, null, 0L, null, 0, 0, j3, null, new dks(BitmapDescriptorFactory.HUE_RED, 17), 15597565), buxVar8, (iIntValue7 & 14) | 48, 24576, 113660);
                } else {
                    buxVar8.s();
                }
                return afak.a;
        }
    }
}
