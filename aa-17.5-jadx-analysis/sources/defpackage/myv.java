package defpackage;

import android.content.ComponentName;
import androidx.car.app.model.Alert;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class myv {
    public static final yph a = yph.c("Gh.ComposeMediaSwitcher");

    public static final float a(float f, boolean z) {
        return (dlj.a(f, 220.0f) < 0 || !z) ? 24.0f : 36.0f;
    }

    public static final ComponentName b(bym bymVar) {
        return (ComponentName) bymVar.a();
    }

    public static final loz c(bym bymVar) {
        return (loz) bymVar.a();
    }

    public static final loz d(bym bymVar) {
        return (loz) bymVar.a();
    }

    public static final Object e(nbf nbfVar) {
        if (!aclu.j()) {
            ComponentName componentName = nbfVar.b;
            String className = componentName.getClassName();
            className.getClass();
            if (className.length() <= 0) {
                loz lozVar = nbfVar.a;
                return lozVar == null ? componentName : lozVar;
            }
        }
        return nbfVar.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Iterable, java.lang.Object, java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.bbt r17, java.util.List r18, defpackage.afdr r19, defpackage.afec r20, defpackage.loz r21, android.content.ComponentName r22, java.util.Map r23, defpackage.aitx r24, defpackage.afck r25) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myv.f(bbt, java.util.List, afdr, afec, loz, android.content.ComponentName, java.util.Map, aitx, afck):java.lang.Object");
    }

    public static final Object g(bbt bbtVar, List list, List list2, afck afckVar) {
        int size = list.size() + 1;
        int size2 = list2.size() + 1;
        nbf nbfVar = (nbf) woy.bI(list, mcd.n(bbtVar.j(), size));
        int iE = afpt.e(list2.indexOf(nbfVar), 0);
        int iM = mcd.m(bbtVar, size2) + iE;
        if (bbtVar.j() == iM) {
            return afak.a;
        }
        a.l().K("Items changed, scrolling to keep %s in view at %s", nbfVar, iE);
        return bbtVar.A(iM, afckVar);
    }

    public static final List h(bwq bwqVar) {
        return (List) bwqVar.a();
    }

    public static final List i(List list, loz lozVar, ComponentName componentName) {
        nbf nbfVar;
        Object next;
        Object obj = null;
        if (lozVar != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (affa.f(((nbf) next).a, lozVar)) {
                    break;
                }
            }
            nbfVar = (nbf) next;
        } else {
            nbfVar = null;
        }
        if (componentName != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (affa.f(((nbf) next2).b, componentName)) {
                    obj = next2;
                    break;
                }
            }
            obj = (nbf) obj;
        }
        return (nbfVar == null || !list.contains(nbfVar)) ? obj != null ? woy.bY(woy.bg(obj), woy.bV(list, obj)) : list : woy.bY(woy.bg(nbfVar), woy.bV(list, nbfVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final defpackage.mzy r18, final defpackage.bbt r19, final int r20, final defpackage.cfy r21, final defpackage.afec r22, java.util.List r23, int r24, final boolean r25, final boolean r26, defpackage.bux r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myv.j(mzy, bbt, int, cfy, afec, java.util.List, int, boolean, boolean, bux, int, int):void");
    }

    public static final boolean k(ComponentName componentName) {
        return lmi.a.a().d() && affa.f(componentName, mkn.G);
    }

    public static final boolean l(float f, boolean z) {
        return z ? dlj.a(f, 250.0f) < 0 : dlj.a(f, 220.0f) < 0;
    }

    public static final void m(cfy cfyVar, boolean z, boolean z2, afeh afehVar, afec afecVar, bux buxVar, int i) {
        int i2;
        int i3;
        afbe afbeVar;
        List listAg;
        boolean z3;
        boolean z4;
        String str;
        boolean z5;
        aitx aitxVar;
        bym bymVar;
        Object obj;
        List list;
        afec afecVar2;
        mzy mzyVar;
        mzy mzyVar2;
        afehVar.getClass();
        afecVar.getClass();
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-1716983662);
        if (i4 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(afehVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.E(afecVar) ? 8192 : 16384;
        }
        if (buxVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            afco afcoVar = tby.a;
            eqj eqjVarB = lpq.i().b();
            eqjVarB.getClass();
            eqj eqjVarV = tby.v(eqjVarB, new mtw(9));
            afbe afbeVar2 = afbe.a;
            bym bymVarF = bxc.f(eqjVarV, afbeVar2, buxVarC);
            bym bymVarF2 = bxc.f(lof.a.a().a(), afbeVar2, buxVarC);
            eqj eqjVarA = lgx.b().a(mpz.d);
            eqjVarA.getClass();
            bym bymVarE = bxc.e(eqjVarA, buxVarC);
            final bym bymVarE2 = bxc.e(lrw.a.a().c, buxVarC);
            final bym bymVarE3 = bxc.e(lpq.i().e(), buxVarC);
            if (aclu.g()) {
                buxVarC.v(-1893710804);
                ((bvv) buxVarC).Y(false);
                listAg = roc.ag(bymVarF2);
                i3 = i2;
                afbeVar = afbeVar2;
            } else {
                buxVarC.v(-1893656275);
                List listAg2 = roc.ag(bymVarF);
                listAg2.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = listAg2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    loz lozVar = (loz) next;
                    String strValueOf = String.valueOf(lozVar.hashCode());
                    int i5 = i2;
                    Iterator it2 = it;
                    erq erqVar = (erq) afecVar.invoke(new nbf(lozVar, lozVar.a));
                    eru eruVarA = esh.a(buxVarC);
                    if (eruVarA == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    afbe afbeVar3 = afbeVar2;
                    mzy mzyVar3 = (mzy) epq.e(affw.b(mzy.class), eruVarA, strValueOf, erqVar, ecw.g(eruVarA));
                    AaPlaybackState aaPlaybackState = (AaPlaybackState) bxc.e(mzyVar3.l(), buxVarC).a();
                    lmd lmdVar = (lmd) bxc.e(mzyVar3.k(), buxVarC).a();
                    lozVar.getClass();
                    if (loe.c(lozVar, aaPlaybackState, lmdVar)) {
                        arrayList.add(next);
                    }
                    it = it2;
                    afbeVar2 = afbeVar3;
                    i2 = i5;
                }
                i3 = i2;
                afbeVar = afbeVar2;
                ((bvv) buxVarC).Y(false);
                listAg = arrayList;
            }
            boolean zC = buxVarC.C(b(bymVarE)) | buxVarC.C(listAg) | buxVarC.C(c(bymVarE2));
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            int i6 = 6;
            if (zC || objS == buw.a) {
                mts mtsVar = new mts(listAg, bymVarE, i6);
                lah lahVar = byj.a;
                objS = new bvk(mtsVar, null);
                bvvVar.ad(objS);
            }
            final bym bymVar2 = (bym) objS;
            Object objS2 = bvvVar.S();
            Object obj2 = buw.a;
            if (objS2 == obj2) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(null, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS2 = parcelableSnapshotMutableState;
            }
            bwq bwqVar = (bwq) objS2;
            final List listH = h(bwqVar);
            if (listH == null) {
                listH = afbeVar;
            }
            Object objS3 = bvvVar.S();
            if (objS3 == obj2) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new ParcelableSnapshotMutableState(true, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState2);
                objS3 = parcelableSnapshotMutableState2;
            }
            bwq bwqVar2 = (bwq) objS3;
            boolean zE = buxVarC.E(listH) | buxVarC.C(bymVar2) | buxVarC.C(bymVarE2) | buxVarC.C(bymVarE3);
            Object objS4 = bvvVar.S();
            if (zE || objS4 == obj2) {
                objS4 = new mnd() { // from class: myl
                    @Override // defpackage.mnd
                    public final void h(PrintWriter printWriter) {
                        yph yphVar = myv.a;
                        printWriter.println("MultiplePlayerSwitcher");
                        List list2 = listH;
                        Objects.toString(list2);
                        printWriter.println("  stableItems: ".concat(list2.toString()));
                        List listAg3 = roc.ag(bymVar2);
                        Objects.toString(listAg3);
                        printWriter.println("  liveItems: ".concat(String.valueOf(listAg3)));
                        loz lozVarC = myv.c(bymVarE2);
                        Objects.toString(lozVarC);
                        printWriter.println("  ongoingSession: ".concat(String.valueOf(lozVarC)));
                        loz lozVarD = myv.d(bymVarE3);
                        Objects.toString(lozVarD);
                        printWriter.println("  nowPlayingSession: ".concat(String.valueOf(lozVarD)));
                    }
                };
                bvvVar.ad(objS4);
            }
            kmc.a(listH, (mnd) objS4, buxVarC, 0, 0);
            Integer numValueOf = Integer.valueOf(listH.size());
            boolean zE2 = buxVarC.E(listH);
            Object objS5 = bvvVar.S();
            if (zE2 || objS5 == obj2) {
                objS5 = new ksw(listH, bwqVar2, (afck) null, 10);
                bvvVar.ad(objS5);
            }
            bvq.g(numValueOf, (afeg) objS5, buxVarC);
            int size = listH.size() + 1 + ((listH.isEmpty() && ((Boolean) bwqVar2.a()).booleanValue()) ? 1 : 0);
            if (!lmi.a.a().c() || listH.isEmpty()) {
                z3 = true;
                z4 = false;
            } else {
                z4 = true;
                z3 = true;
            }
            Object objInvoke = afehVar.invoke(Integer.valueOf(z3 != z4 ? size : Alert.DURATION_SHOW_INDEFINITELY), buxVarC, Integer.valueOf((i3 >> 6) & 112));
            Object objS6 = bvvVar.S();
            if (objS6 == obj2) {
                objS6 = new LinkedHashMap();
                bvvVar.ad(objS6);
            }
            Map map = (Map) objS6;
            Object objS7 = bvvVar.S();
            if (objS7 == obj2) {
                objS7 = bvq.a(afcp.a, buxVarC);
                bvvVar.ad(objS7);
            }
            aitx aitxVar2 = (aitx) objS7;
            Object objS8 = bvvVar.S();
            if (objS8 == obj2) {
                z5 = false;
                str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
                ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = new ParcelableSnapshotMutableState(false, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState3);
                objS8 = parcelableSnapshotMutableState3;
            } else {
                str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
                z5 = false;
            }
            bwq bwqVar3 = (bwq) objS8;
            Object objS9 = bvvVar.S();
            if (objS9 == obj2) {
                aitxVar = aitxVar2;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = new ParcelableSnapshotMutableState(Boolean.valueOf(z5), bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState4);
                objS9 = parcelableSnapshotMutableState4;
            } else {
                aitxVar = aitxVar2;
            }
            bwq bwqVar4 = (bwq) objS9;
            epr eprVar = epr.ON_PAUSE;
            boolean zE3 = buxVarC.E(map);
            Object objS10 = bvvVar.S();
            if (zE3 || objS10 == obj2) {
                objS10 = new mts(map, bwqVar3, 7);
                bvvVar.ad(objS10);
            }
            eee.h(eprVar, null, (afdr) objS10, buxVarC, 6);
            epr eprVar2 = epr.ON_RESUME;
            boolean zC2 = buxVarC.C(bymVar2) | buxVarC.C(bymVarE2) | buxVarC.C(bymVarE);
            Object objS11 = bvvVar.S();
            if (zC2 || objS11 == obj2) {
                nxd nxdVar = new nxd(bwqVar3, bwqVar, bymVar2, bymVarE2, bymVarE, bwqVar4, 1);
                bymVar = bymVarE2;
                bvvVar.ad(nxdVar);
                objS11 = nxdVar;
            } else {
                bymVar = bymVarE2;
            }
            eee.h(eprVar2, null, (afdr) objS11, buxVarC, 6);
            Object objS12 = bvvVar.S();
            if (objS12 == obj2) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState5 = new ParcelableSnapshotMutableState(null, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState5);
                objS12 = parcelableSnapshotMutableState5;
            }
            bwq bwqVar5 = (bwq) objS12;
            Object[] objArr = {roc.ag(bymVar2), d(bymVarE3), Boolean.valueOf(((Boolean) bwqVar4.a()).booleanValue()), Boolean.valueOf(z4)};
            aitx aitxVar3 = aitxVar;
            boolean zC3 = buxVarC.C(bymVar2) | buxVarC.C(bymVarE3) | buxVarC.D(z4) | buxVarC.E(listH) | buxVarC.C(objInvoke) | buxVarC.A(size) | buxVarC.C(bymVar) | buxVarC.C(bymVarE) | buxVarC.E(map) | buxVarC.E(aitxVar3);
            Object objS13 = bvvVar.S();
            if (zC3 || objS13 == obj2) {
                List list2 = listH;
                objS13 = new mys(z4, list2, (bbt) objInvoke, size, map, aitxVar3, bwqVar5, bymVar2, bymVarE3, bwqVar4, bwqVar, bymVar, bymVarE, null);
                obj = objInvoke;
                list = list2;
                bvvVar.ad(objS13);
            } else {
                list = listH;
                obj = objInvoke;
            }
            int i7 = size - 1;
            bvq.h(objArr, (afeg) objS13, buxVarC);
            bbt bbtVar = (bbt) obj;
            int iN = mcd.n(bbtVar.j(), size);
            if (iN == i7) {
                buxVarC.v(-1888498837);
                bvvVar.Y(false);
                afecVar2 = afecVar;
                mzyVar2 = null;
            } else {
                if (list.isEmpty()) {
                    afecVar2 = afecVar;
                    String str2 = str;
                    buxVarC.v(-753644291);
                    eru eruVarA2 = esh.a(buxVarC);
                    if (eruVarA2 == null) {
                        throw new IllegalStateException(str2);
                    }
                    mzyVar = (mzy) epq.e(affw.b(mzy.class), eruVarA2, null, null, ecw.g(eruVarA2));
                    bvvVar.Y(false);
                } else {
                    buxVarC.v(-753654361);
                    String string = aclu.j() ? ((nbf) list.get(iN)).b.toString() : String.valueOf(((nbf) list.get(iN)).hashCode());
                    afecVar2 = afecVar;
                    erq erqVar2 = (erq) afecVar2.invoke(list.get(iN));
                    eru eruVarA3 = esh.a(buxVarC);
                    if (eruVarA3 == null) {
                        throw new IllegalStateException(str);
                    }
                    mzyVar = (mzy) epq.e(affw.b(mzy.class), eruVarA3, string, erqVar2, ecw.g(eruVarA3));
                    bvvVar.Y(false);
                }
                mzyVar2 = mzyVar;
            }
            int i8 = i3 << 18;
            j(mzyVar2, bbtVar, i7, cfyVar, afecVar2, list, size, z, z2, buxVarC, ((i3 << 9) & 7168) | 8 | (i3 & 57344) | (29360128 & i8) | (234881024 & i8), 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mym(cfyVar, z, z2, afehVar, afecVar, i, 1);
        }
    }

    public static final void n(cfy cfyVar, boolean z, boolean z2, afeh afehVar, afec afecVar, bux buxVar, int i) {
        cfy cfyVar2;
        int i2;
        bux buxVar2;
        int i3;
        afehVar.getClass();
        afecVar.getClass();
        int i4 = i & 6;
        bux buxVarC = buxVar.c(479116362);
        if (i4 == 0) {
            cfyVar2 = cfyVar;
            i2 = (true != buxVarC.C(cfyVar2) ? 2 : 4) | i;
        } else {
            cfyVar2 = cfyVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(afehVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.E(afecVar) ? 8192 : 16384;
        }
        if (buxVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            Object objInvoke = afehVar.invoke(2, buxVarC, Integer.valueOf(((i2 >> 6) & 112) | 6));
            eru eruVarA = esh.a(buxVarC);
            if (eruVarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            mzy mzyVar = (mzy) epq.e(affw.b(mzy.class), eruVarA, null, null, ecw.g(eruVarA));
            bym bymVarF = bxc.f(mzyVar.l(), AaPlaybackState.a, buxVarC);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                mvg mvgVar = new mvg(bymVarF, 7);
                lah lahVar = byj.a;
                bvk bvkVar = new bvk(mvgVar, null);
                bvvVar.ad(bvkVar);
                objS = bvkVar;
            }
            bym bymVar = (bym) objS;
            Boolean boolValueOf = Boolean.valueOf(((Boolean) bymVar.a()).booleanValue());
            boolean zC = buxVarC.C(objInvoke);
            Object objS2 = bvvVar.S();
            if (zC || objS2 == obj) {
                i3 = i2;
                objS2 = new ksw((bbt) objInvoke, bymVar, (afck) null, 11);
                bvvVar.ad(objS2);
            } else {
                i3 = i2;
            }
            bvq.g(boolValueOf, (afeg) objS2, buxVarC);
            int i5 = i3 << 18;
            int i6 = ((i3 << 9) & 7168) | 392 | (i3 & 57344) | (29360128 & i5) | (234881024 & i5);
            buxVar2 = buxVarC;
            j(mzyVar, (bbt) objInvoke, 1, cfyVar2, afecVar, null, 0, z, z2, buxVar2, i6, 96);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mym(cfyVar, z, z2, afehVar, afecVar, i, 2);
        }
    }

    public static final void o(cfy cfyVar, boolean z, boolean z2, afeh afehVar, afec afecVar, bux buxVar, int i) {
        int i2;
        afeh afehVar2;
        afec afecVar2;
        afeh afehVar3;
        afec afecVar3;
        bux buxVarC = buxVar.c(130451657);
        if ((i & 6) == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        int i3 = i2 | 24576;
        if (buxVarC.I((i3 & 9363) != 9362, i3 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                kuv kuvVar = new kuv(18);
                Object objS = bvvVar.S();
                if (objS == buw.a) {
                    objS = new mtw(8);
                    bvvVar.ad(objS);
                }
                afehVar3 = kuvVar;
                afecVar3 = (afec) objS;
            } else {
                buxVarC.s();
                afehVar3 = afehVar;
                afecVar3 = afecVar;
            }
            buxVarC.l();
            if (lmi.a.a().c()) {
                buxVarC.v(-659646015);
                m(cfyVar, z, z2, afehVar3, afecVar3, buxVarC, i3 & 58366);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-659489341);
                n(cfyVar, z, z2, afehVar3, afecVar3, buxVarC, i3 & 58366);
                bvvVar.Y(false);
            }
            afehVar2 = afehVar3;
            afecVar2 = afecVar3;
        } else {
            buxVarC.s();
            afehVar2 = afehVar;
            afecVar2 = afecVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mym(cfyVar, z, z2, afehVar2, afecVar2, i, 0);
        }
    }
}
