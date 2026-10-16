package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarText;
import androidx.car.app.model.GridItem;
import androidx.car.app.model.Row;
import androidx.car.app.model.Toggle;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class fxa {
    public static final void a(fxb fxbVar, cfy cfyVar, bux buxVar, int i, int i2) {
        int i3;
        long jC;
        cjv cjvVar;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-361305016);
        if (i4 == 0) {
            i3 = i | (true != ((i & 8) == 0 ? buxVarC.C(fxbVar) : buxVarC.E(fxbVar)) ? 2 : 4);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i3 & 19) != 18, i3 & 1)) {
            if (i5 != 0) {
                cfyVar = cfy.e;
            }
            hjw hjwVar = fxbVar.c;
            if (hjwVar == null) {
                buxVarC.v(-449551634);
                ((bvv) buxVarC).Y(false);
                cjvVar = null;
            } else {
                buxVarC.v(-449551633);
                cjv cjvVar2 = new cjv(fww.q(hjwVar.b(buxVarC), 0L, 2, buxVarC, 10));
                if (cjvVar2.a == 16) {
                    cjvVar2 = null;
                }
                if (cjvVar2 == null) {
                    buxVarC.v(1031634050);
                    jC = gux.c(buxVarC).C();
                    ((bvv) buxVarC).Y(false);
                } else {
                    buxVarC.v(1031625804);
                    ((bvv) buxVarC).Y(false);
                    jC = cjvVar2.a;
                }
                ((bvv) buxVarC).Y(false);
                cjvVar = new cjv(jC);
            }
            f(new gab(null, null, fxbVar.b), cfyVar, cjvVar, buxVarC, (i3 & 112) | 8);
        } else {
            buxVarC.s();
        }
        cfy cfyVar2 = cfyVar;
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new fwz(fxbVar, cfyVar2, i, i2, 0);
        }
    }

    public static final fwy b(fvy fvyVar, geu geuVar, afdr afdrVar, gcs gcsVar) {
        gcq gcqVarB;
        if (gcsVar != null) {
            hlv hlvVar = hlv.a;
            hlvVar.getClass();
            gcqVarB = gcr.b(gcsVar, geuVar, hlvVar);
        } else {
            gcqVarB = null;
        }
        gag gagVar = fvyVar.b;
        gbg gbgVarD = gagVar != null ? fxy.d(gagVar) : null;
        CarColor carColor = fvyVar.e;
        fwy fwyVar = new fwy(gcqVarB, gbgVarD, afdrVar != null ? new flm(afdrVar, 19) : null, fvyVar.d, carColor != null ? gzw.g(carColor, geuVar.d().g()) : null, fvyVar.f, null);
        gzj.d(fwyVar, fvyVar);
        return fwyVar;
    }

    public static final fxo c(fwb fwbVar, geu geuVar, afdr afdrVar, gcs gcsVar) {
        fxo fxbVar;
        fwbVar.getClass();
        if (fwbVar instanceof fwa) {
            fwa fwaVar = (fwa) fwbVar;
            fvw fvwVar = fwaVar.a;
            long jB = fvwVar.b();
            fxbVar = new fwu(b(fwaVar.b, geuVar, afdrVar, gcsVar), jB, ((aisq) afpt.k(new aisq(fvwVar.a()), new aisq(0L), new aisq(jB))).c, afdrVar != null ? new flm(afdrVar, 19) : null);
        } else if (fwbVar instanceof fvy) {
            fxbVar = b((fvy) fwbVar, geuVar, afdrVar, gcsVar);
        } else {
            if (!(fwbVar instanceof fvz)) {
                throw new aezs();
            }
            fvz fvzVar = (fvz) fwbVar;
            gag gagVar = fvzVar.a;
            CarColor carColor = fvzVar.b;
            fxbVar = new fxb(fxy.d(gagVar), carColor != null ? gzw.g(carColor, geuVar.d().g()) : null);
        }
        gzj.d(fxbVar, fwbVar);
        return fxbVar;
    }

    public static final List d(List list, geu geuVar) {
        list.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                woy.bo();
            }
            geu geuVar2 = geuVar;
            arrayList.add(fvr.h((fvu) obj, geuVar2, i == 0 ? fwx.e : fwx.b, false, i == 0 ? fwh.e : fwh.c, null, null, false, 0, 244));
            i = i2;
            geuVar = geuVar2;
        }
        return arrayList;
    }

    public static /* synthetic */ fxo e(fwb fwbVar, geu geuVar, gcs gcsVar, int i) {
        afdr afdrVarD = (i & 2) != 0 ? fwbVar.d() : null;
        if ((i & 4) != 0) {
            gcsVar = fwbVar.c();
        }
        return c(fwbVar, geuVar, afdrVarD, gcsVar);
    }

    public static final void f(gab gabVar, cfy cfyVar, cjv cjvVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1366213624);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gabVar) : buxVarC.E(gabVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cjvVar) ? 128 : 256;
        }
        int i4 = 0;
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            long jH = cjv.h(czz.at(buxVarC).B, 0.5f);
            gaq gaqVar = (gaq) buxVarC.f(gbj.a);
            buxVarC.v(-1328676580);
            cfy cfyVarI = awd.i(cfyVar, cjvVar != null ? 48.0f : 56.0f);
            if (cjvVar == null) {
                boolean zE = buxVarC.E(gaqVar) | buxVarC.B(jH);
                bvv bvvVar = (bvv) buxVarC;
                Object objS = bvvVar.S();
                if (zE || objS == buw.a) {
                    objS = new fzr(gaqVar, jH, i4);
                    bvvVar.ad(objS);
                }
                cfyVarI = bxc.q(cfyVarI, (afec) objS);
            }
            ((bvv) buxVarC).Y(false);
            fxp.c(gabVar, 56.0f, asl.H(cfyVarI, 4.0f), null, null, cjvVar, true, false, null, buxVarC, (i2 & 14) | 1572920 | ((i2 << 9) & 458752), 920);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new cuw((Object) gabVar, cfyVar, (Object) cjvVar, i, 11);
        }
    }

    public static final void g(Drawable drawable, cfy cfyVar, cfn cfnVar, csi csiVar, float f, cjw cjwVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-622866133);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(drawable) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cfnVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(csiVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.z(f) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.C(cjwVar) ? 65536 : 131072;
        }
        if (buxVarC.I((74899 & i2) != 74898, i2 & 1)) {
            Context context = (Context) buxVarC.f(daa.b);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(null, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new ParcelableSnapshotMutableState(null, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState2);
                objS2 = parcelableSnapshotMutableState2;
            }
            bwq bwqVar = (bwq) objS2;
            boolean zC = buxVarC.C(context) | buxVarC.C(drawable);
            boolean z = (i2 & 7168) == 2048;
            Object objS3 = bvvVar.S();
            if ((zC | z) || objS3 == obj) {
                fsw fswVar = new fsw(context);
                fswVar.a = drawable;
                if (drawable instanceof BitmapDrawable) {
                    fswVar.g(new ieb(csiVar));
                }
                objS3 = fswVar.a();
                bvvVar.ad(objS3);
            }
            fsy fsyVar = (fsy) objS3;
            cfy cfyVarD = das.d(cfyVar, "PainterFallback");
            cmw cmwVarO = o(bwqVar);
            cmw cmwVarO2 = o(bwqVar);
            Object objS4 = bvvVar.S();
            if (objS4 == obj) {
                objS4 = new fzl(bwqVar, 2);
                bvvVar.ad(objS4);
            }
            dtd.h(fsyVar, cfyVarD, cmwVarO, cmwVarO2, null, (afec) objS4, cfnVar, csiVar, f, cjwVar, 0, buxVarC, ((i2 << 21) & 1879048192) | 12619824, (i2 >> 9) & 1022);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new fzq(drawable, cfyVar, cfnVar, csiVar, f, cjwVar, i, 0);
        }
    }

    public static final bmw h() {
        float f = gip.c.g;
        return new bmw(f, f, f, f, gip.a.g);
    }

    public static final bmr i() {
        avp avpVar = bmo.a;
        float f = gip.c.g;
        return bmo.a(f, f, f, f, gip.a.g, 0);
    }

    public static final void j(afdr afdrVar) {
        aitu aituVar = aium.a;
        ahnc.d(ahni.b(ajct.a), null, 0, new gin(afdrVar, null), 3);
    }

    public static boolean k(List list, List list2, int i) {
        List listP = p(list);
        List listP2 = p(list2);
        if (listP.size() != listP2.size()) {
            gks.c("CarApp.H.Dis", "REFRESH check failed. Different item list sizes. Old: %d. New: %d", Integer.valueOf(listP.size()), Integer.valueOf(listP2.size()));
            return false;
        }
        for (int i2 = 0; i2 < listP.size(); i2++) {
            uf ufVar = (uf) listP.get(i2);
            uf ufVar2 = (uf) listP2.get(i2);
            if (ufVar.getClass() != ufVar2.getClass()) {
                gks.c("CarApp.H.Dis", "REFRESH check failed. Different item types at index %d. Old: %s. New: %s", Integer.valueOf(i2), ufVar.getClass(), ufVar2.getClass());
                return false;
            }
            if (i == 2) {
                if (ufVar instanceof Row) {
                    Row row = (Row) ufVar;
                    Row row2 = (Row) ufVar2;
                    Toggle toggle = row.getToggle();
                    Toggle toggle2 = row2.getToggle();
                    if ((toggle == null || toggle2 == null || toggle.isChecked() == toggle2.isChecked()) && !q(row.getTitle(), row2.getTitle())) {
                        gks.c("CarApp.H.Dis", "REFRESH check failed. Different row titles at index %d. Old: %s. New: %s", Integer.valueOf(i2), row.getTitle(), row2.getTitle());
                        return false;
                    }
                } else if (ufVar instanceof GridItem) {
                    GridItem gridItem = (GridItem) ufVar;
                    GridItem gridItem2 = (GridItem) ufVar2;
                    if (!q(gridItem.getTitle(), gridItem2.getTitle())) {
                        gks.c("CarApp.H.Dis", "REFRESH check failed. Different grid item titles at index %d. Old: %s. New: %s", Integer.valueOf(i2), gridItem.getTitle(), gridItem2.getTitle());
                        return false;
                    }
                } else {
                    continue;
                }
            }
        }
        return true;
    }

    public static final aivh l(bwq bwqVar) {
        return (aivh) bwqVar.a();
    }

    public static final void m(cfy cfyVar, long j, long j2, String str, bux buxVar, int i) {
        int i2;
        long j3;
        bux buxVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-393353485);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j3 = j;
            i2 |= true != buxVarC.B(j3) ? 16 : 32;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.B(j2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(str) ? 1024 : 2048;
        }
        if (buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            cfy cfyVarA = cfyVar.a(new aix(j, ckq.a));
            ctp ctpVarB = atk.b(cfl.e, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarA);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            buxVar2 = buxVarC;
            brp.b(str, null, j2, czz.av(buxVarC).k.f(), null, 0L, null, 0L, 0, false, 0, 0, czz.av(buxVarC).k, buxVar2, ((i2 >> 9) & 14) | (i2 & 896), 0, 131050);
            bvvVar.Y(true);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new ggx(cfyVar, j3, j2, str, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [int] */
    /* JADX WARN: Type inference failed for: r4v19 */
    public static final void n(aiyk aiykVar, afdr afdrVar, afec afecVar, cfy cfyVar, avp avpVar, adu aduVar, String str, afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3;
        asf asfVar;
        bym bymVar;
        boolean z;
        cfy cfyVarBf;
        Object bqiVar;
        adu aduVar2;
        aitx aitxVar;
        boolean z2;
        Object fryVar;
        boolean z3;
        bux buxVar2;
        cil cilVar;
        ?? r4;
        int i4;
        bvv bvvVar;
        aiykVar.getClass();
        afdrVar.getClass();
        afecVar.getClass();
        afegVar.getClass();
        int i5 = i & 6;
        bux buxVarC = buxVar.c(174142428);
        if (i5 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(aiykVar) : buxVarC.E(aiykVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afecVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.C(avpVar) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i2 |= true != ((262144 & i) == 0 ? buxVarC.C(aduVar) : buxVarC.E(aduVar)) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.C(str) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 4194304 : 8388608;
        }
        int i6 = i2;
        if (buxVarC.I((4793491 & i6) != 4793490, i6 & 1)) {
            bvv bvvVar2 = (bvv) buxVarC;
            bvvVar2.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            Object objS = bvvVar2.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new cil();
                bvvVar2.ad(objS);
            }
            cil cilVar2 = (cil) objS;
            Object objS2 = bvvVar2.S();
            if (objS2 == obj) {
                objS2 = bvq.a(afcp.a, buxVarC);
                bvvVar2.ad(objS2);
            }
            aitx aitxVar2 = (aitx) objS2;
            Object objS3 = bvvVar2.S();
            if (objS3 == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(null, bxp.c);
                bvvVar2.ad(parcelableSnapshotMutableState);
                objS3 = parcelableSnapshotMutableState;
            }
            bwq bwqVar = (bwq) objS3;
            cfy cfyVarA = cfyVar.a(new aix(cjn.i(0), ckq.a));
            cfn cfnVar = cfl.a;
            ctp ctpVarB = atk.b(cfnVar, false);
            int iG = a.g(bvvVar2.u);
            ccx ccxVarAh = bvvVar2.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarA);
            afdr afdrVar2 = cwb.a;
            buxVarC.w();
            if (bvvVar2.t) {
                buxVarC.j(afdrVar2);
            } else {
                buxVarC.y();
            }
            afeg afegVar2 = cwb.e;
            byq.c(buxVarC, ctpVarB, afegVar2);
            afeg afegVar3 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar3);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar4 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar4);
            afec afecVar2 = cwb.g;
            byq.b(buxVarC, afecVar2);
            afeg afegVar5 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar5);
            Object objS4 = bvvVar2.S();
            if (objS4 == obj) {
                gbz gbzVar = new gbz(aduVar, 3);
                lah lahVar = byj.a;
                i3 = i6;
                asfVar = null;
                bvk bvkVar = new bvk(gbzVar, null);
                bvvVar2.ad(bvkVar);
                objS4 = bvkVar;
            } else {
                i3 = i6;
                asfVar = null;
            }
            bym bymVar2 = (bym) objS4;
            if (((Boolean) bymVar2.a()).booleanValue()) {
                bymVar = bymVar2;
                z = false;
                cfyVarBf = ca.bf(cfy.e, false, asfVar);
            } else {
                bymVar = bymVar2;
                z = false;
                cfyVarBf = cfy.e;
            }
            ctp ctpVarB2 = atk.b(cfnVar, z);
            int iG2 = a.g(bvvVar2.u);
            ccx ccxVarAh2 = bvvVar2.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarBf);
            buxVarC.w();
            if (bvvVar2.t) {
                buxVarC.j(afdrVar2);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB2, afegVar2);
            byq.c(buxVarC, ccxVarAh2, afegVar3);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar4);
            byq.b(buxVarC, afecVar2);
            byq.c(buxVarC, cfyVarJ2, afegVar5);
            afegVar.invoke(buxVarC, Integer.valueOf((i3 >> 21) & 14));
            bvvVar2.Y(true);
            int i7 = i3 & 14;
            afak afakVar = afak.a;
            int i8 = (i3 & 458752) ^ 196608;
            boolean z4 = (i7 == 4 || ((i3 & 8) != 0 && buxVarC.E(aiykVar))) | ((i8 > 131072 && buxVarC.E(aduVar)) || (i3 & 196608) == 131072);
            Object objS5 = bvvVar2.S();
            if (z4 || objS5 == obj) {
                aduVar2 = aduVar;
                aitxVar = aitxVar2;
                z2 = false;
                bqiVar = new bqi(aiykVar, aduVar2, bwqVar, (afck) null, 8);
                bvvVar2.ad(bqiVar);
            } else {
                bqiVar = objS5;
                aduVar2 = aduVar;
                aitxVar = aitxVar2;
                z2 = false;
            }
            bvq.g(afakVar, (afeg) bqiVar, buxVarC);
            Boolean boolValueOf = Boolean.valueOf(((Boolean) bymVar.a()).booleanValue());
            boolean zE = (((i8 <= 131072 || !buxVarC.E(aduVar2)) && (i3 & 196608) != 131072) ? z2 : true) | ((i3 & 112) == 32 ? true : z2) | buxVarC.E(aitxVar);
            boolean z5 = (i3 & 896) == 256 ? true : z2;
            Object objS6 = bvvVar2.S();
            if ((zE || z5) || objS6 == obj) {
                z3 = true;
                buxVar2 = buxVarC;
                aitx aitxVar3 = aitxVar;
                cilVar = cilVar2;
                r4 = z2;
                i4 = 2;
                adu aduVar3 = aduVar2;
                bvvVar = bvvVar2;
                fryVar = new fry(afdrVar, cilVar, aduVar3, aitxVar3, afecVar, bymVar, bwqVar, (afck) null, 2);
                bvvVar.ad(fryVar);
            } else {
                fryVar = objS6;
                z3 = true;
                buxVar2 = buxVarC;
                bvvVar = bvvVar2;
                cilVar = cilVar2;
                r4 = z2;
                i4 = 2;
            }
            bvq.g(boolValueOf, (afeg) fryVar, buxVar2);
            bvv bvvVar3 = bvvVar;
            cil cilVar3 = cilVar;
            boolean z6 = z3;
            buxVarC = buxVar2;
            ca.M(((Boolean) bymVar.a()).booleanValue(), null, acp.a, acl.C(ca.F(150, r4, aev.d, i4), i4), null, bxc.i(-773490242, z6, new oon(cfyVar, cilVar3, avpVar, str, aduVar, 1), buxVarC), buxVarC, 196608, 18);
            bvvVar3.Y(z6);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gnx(aiykVar, afdrVar, afecVar, cfyVar, avpVar, aduVar, str, afegVar, i, 1);
        }
    }

    private static final cmw o(bwq bwqVar) {
        return (cmw) bwqVar.a();
    }

    private static List p(List list) {
        Stream streamFilter = Collection.EL.stream(list).filter(new hmd(1));
        int i = yfq.d;
        return (List) streamFilter.collect(ycm.a);
    }

    private static boolean q(CarText carText, CarText carText2) {
        return (carText == null || carText2 == null) ? carText == null && carText2 == null : Objects.equals(carText.toString(), carText2.toString());
    }
}
