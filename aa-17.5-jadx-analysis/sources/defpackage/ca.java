package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EdgeEffect;
import androidx.car.app.model.Alert;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import defpackage.abk;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class ca {
    public static boolean a;
    public static Method b;

    public ca() {
    }

    public static aei A(aei aeiVar) {
        aei aeiVarC = aeiVar.c();
        int iB = aeiVarC.b();
        for (int i = 0; i < iB; i++) {
            aeiVarC.e(i, aeiVar.a(i));
        }
        return aeiVarC;
    }

    public static aed B(float f, float f2) {
        return new aed(agm.a, Float.valueOf(f), new aee(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static /* synthetic */ aed C(aed aedVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = ((Number) aedVar.a()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((aee) aedVar.a).a;
        }
        return new aed(aedVar.e, Float.valueOf(f), new aee(f2), aedVar.b, aedVar.c, aedVar.d);
    }

    public static /* synthetic */ aed D(aed aedVar, Object obj, long j, int i) {
        if ((i & 1) != 0) {
            obj = aedVar.a();
        }
        Object obj2 = obj;
        aei aeiVarA = (i & 2) != 0 ? A(aedVar.a) : null;
        long j2 = (i & 4) != 0 ? aedVar.b : 0L;
        if ((i & 8) != 0) {
            j = aedVar.c;
        }
        return new aed(aedVar.e, obj2, aeiVarA, j2, j, aedVar.d);
    }

    public static afk E(afec afecVar) {
        sjg sjgVar = new sjg(null, null);
        afecVar.invoke(sjgVar);
        return new afk(sjgVar);
    }

    public static /* synthetic */ agl F(int i, int i2, aes aesVar, int i3) {
        if ((i3 & 4) != 0) {
            aesVar = aev.a;
        }
        int i4 = i3 & 2;
        int i5 = i3 & 1;
        if (i4 != 0) {
            i2 = 0;
        }
        if (1 == i5) {
            i = 300;
        }
        return new agl(i, i2, aesVar);
    }

    public static /* synthetic */ afc G(aer aerVar, int i, int i2) {
        return new afc(aerVar, i | (((i2 & 2) != 0 ? 0 : 1) ^ 1));
    }

    public static boolean H(adz adzVar, long j) {
        return j >= adzVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void I(final java.lang.Object r16, defpackage.cfy r17, defpackage.aew r18, java.lang.String r19, final defpackage.afeh r20, defpackage.bux r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.I(java.lang.Object, cfy, aew, java.lang.String, afeh, bux, int, int):void");
    }

    public static void J(final agg aggVar, cfy cfyVar, final aew aewVar, afec afecVar, final afeh afehVar, bux buxVar, int i) {
        afec afecVar2;
        boolean z;
        int i2 = i & 6;
        bux buxVarC = buxVar.c(-1877370462);
        int i3 = i2 == 0 ? (true != buxVarC.C(aggVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.E(aewVar) ? 128 : 256;
        }
        int i4 = i3 | 3072;
        if ((i & 24576) == 0) {
            i4 |= true != buxVarC.E(afehVar) ? 8192 : 16384;
        }
        if (buxVarC.I((i4 & 9363) != 9362, i4 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new abc(11);
                bvvVar.ad(objS);
            }
            afecVar2 = (afec) objS;
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = woy.bk(aggVar.e());
                bvvVar.ad(objS2);
            }
            List list = (List) objS2;
            Object objS3 = bvvVar.S();
            if (objS3 == obj) {
                long[] jArr = aao.a;
                objS3 = new aan(6);
                bvvVar.ad(objS3);
            }
            aan aanVar = (aan) objS3;
            Object objG = aggVar.g();
            if (affa.f(aggVar.e(), objG)) {
                buxVarC.v(321155112);
                if (list.size() == 1 && affa.f(list.get(0), objG)) {
                    buxVarC.v(321479744);
                    bvvVar.Y(false);
                } else {
                    buxVarC.v(321289466);
                    boolean zE = buxVarC.E(objG);
                    Object objS4 = bvvVar.S();
                    if (zE || objS4 == obj) {
                        objS4 = new aai(objG, 10);
                        bvvVar.ad(objS4);
                    }
                    woy.cw(list, (afec) objS4);
                    aanVar.k();
                    bvvVar.Y(false);
                }
                bvvVar.Y(false);
            } else {
                buxVarC.v(321485696);
                bvvVar.Y(false);
            }
            if (aan.f(aanVar, objG)) {
                z = false;
                buxVarC.v(322289216);
                bvvVar.Y(false);
            } else {
                buxVarC.v(321546363);
                Iterator it = list.iterator();
                int i5 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i5 = -1;
                        break;
                    } else if (affa.f(afecVar2.invoke(it.next()), afecVar2.invoke(objG))) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 == -1) {
                    list.add(objG);
                } else {
                    list.set(i5, objG);
                }
                aanVar.k();
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    final Object obj2 = list.get(i6);
                    aanVar.m(obj2, bxc.i(-934471669, true, new afeg() { // from class: abz
                        /* JADX WARN: Type inference failed for: r14v8, types: [aew, java.lang.Object] */
                        @Override // defpackage.afeg
                        public final Object invoke(Object obj3, Object obj4) {
                            Object objE;
                            bux buxVar2 = (bux) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            int i7 = 1;
                            if (buxVar2.I((iIntValue & 3) != 2, iIntValue & 1)) {
                                aew aewVar2 = aewVar;
                                agg aggVar2 = aggVar;
                                akh akhVar = new akh(aewVar2, i7);
                                bii biiVar = agm.a;
                                if (aggVar2.w()) {
                                    buxVar2.v(1666827533);
                                    buxVar2.o();
                                    objE = aggVar2.e();
                                } else {
                                    buxVar2.v(1666573488);
                                    boolean zC = buxVar2.C(aggVar2);
                                    objE = buxVar2.g();
                                    if (zC || objE == buw.a) {
                                        cec cecVar = (cec) cek.i.j();
                                        afec afecVarI = cecVar != null ? cecVar.i() : null;
                                        cec cecVarI = byx.i(cecVar);
                                        try {
                                            Object objE2 = aggVar2.e();
                                            byx.l(cecVar, cecVarI, afecVarI);
                                            buxVar2.x(objE2);
                                            objE = objE2;
                                        } catch (Throwable th) {
                                            byx.l(cecVar, cecVarI, afecVarI);
                                            throw th;
                                        }
                                    }
                                    buxVar2.o();
                                }
                                Object obj5 = obj2;
                                buxVar2.v(1378811975);
                                boolean zF = affa.f(objE, obj5);
                                float f = BitmapDescriptorFactory.HUE_RED;
                                float f2 = true != zF ? 0.0f : 1.0f;
                                buxVar2.o();
                                Float fValueOf = Float.valueOf(f2);
                                boolean zC2 = buxVar2.C(aggVar2);
                                Object objG2 = buxVar2.g();
                                if (zC2 || objG2 == buw.a) {
                                    nx nxVar = new nx(aggVar2, 7);
                                    lah lahVar = byj.a;
                                    objG2 = new bvk(nxVar, null);
                                    buxVar2.x(objG2);
                                }
                                Object objA = ((bym) objG2).a();
                                buxVar2.v(1378811975);
                                if (true == affa.f(objA, obj5)) {
                                    f = 1.0f;
                                }
                                buxVar2.o();
                                Float fValueOf2 = Float.valueOf(f);
                                boolean zC3 = buxVar2.C(aggVar2);
                                Object objG3 = buxVar2.g();
                                if (zC3 || objG3 == buw.a) {
                                    bvy bvyVar = new bvy(aggVar2, 1);
                                    lah lahVar2 = byj.a;
                                    objG3 = new bvk(bvyVar, null);
                                    buxVar2.x(objG3);
                                }
                                bym bymVarAf = afp.af(aggVar2, fValueOf, fValueOf2, akhVar.invoke(((bym) objG3).a(), buxVar2, 0), biiVar, buxVar2, 0);
                                boolean zC4 = buxVar2.C(bymVarAf);
                                Object objG4 = buxVar2.g();
                                if (zC4 || objG4 == buw.a) {
                                    objG4 = new aai(bymVarAf, 11);
                                    buxVar2.x(objG4);
                                }
                                cjq cjqVar = new cjq((afec) objG4);
                                ctp ctpVarB = atk.b(cfl.a, false);
                                long jB = buxVar2.b();
                                long j = jB ^ (jB >>> 32);
                                ccx ccxVarN = buxVar2.N();
                                cfy cfyVarJ = bzi.j(buxVar2, cjqVar);
                                afdr afdrVar = cwb.a;
                                buxVar2.M();
                                buxVar2.w();
                                if (buxVar2.G()) {
                                    buxVar2.j(afdrVar);
                                } else {
                                    buxVar2.y();
                                }
                                afeh afehVar2 = afehVar;
                                byq.c(buxVar2, ctpVarB, cwb.e);
                                byq.c(buxVar2, ccxVarN, cwb.d);
                                byq.a(buxVar2, Integer.valueOf((int) j), cwb.f);
                                buxVar2.i(afak.a, new alx(cwb.g, 16));
                                byq.c(buxVar2, cfyVarJ, cwb.c);
                                afehVar2.invoke(obj5, buxVar2, 0);
                                buxVar2.n();
                            } else {
                                buxVar2.s();
                            }
                            return afak.a;
                        }
                    }, buxVarC));
                }
                z = false;
                bvvVar.Y(false);
            }
            ctp ctpVarB = atk.b(cfl.a, z);
            long j = bvvVar.u;
            long j2 = j ^ (j >>> 32);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.a(buxVarC, Integer.valueOf((int) j2), cwb.f);
            buxVarC.i(afak.a, new alx(cwb.g, 16));
            byq.c(buxVarC, cfyVarJ, cwb.c);
            buxVarC.v(-1312707512);
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                Object obj3 = list.get(i7);
                bvvVar.ab(1171574969, afecVar2.invoke(obj3), 0, null);
                afeg afegVar = (afeg) aanVar.a(obj3);
                if (afegVar == null) {
                    buxVarC.v(1959122128);
                } else {
                    buxVarC.v(1171576145);
                    afegVar.invoke(buxVarC, 0);
                }
                bvvVar.Y(false);
                bvvVar.Y(false);
            }
            bvvVar.Y(false);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
            afecVar2 = afecVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new agh(aggVar, cfyVar, aewVar, afecVar2, afehVar, i, 1);
        }
    }

    public static /* synthetic */ cfy K(cfy cfyVar, aew aewVar, afeg afegVar, int i) {
        if ((i & 1) != 0) {
            Map map = ahc.a;
            aewVar = new aft(1.0f, 400.0f, new dlq(4294967297L));
        }
        if ((i & 2) != 0) {
            afegVar = null;
        }
        return cjn.g(cfyVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, true, 0, 1044479).a(new add(aewVar, cfl.a, afegVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void L(defpackage.afm r17, defpackage.cfy r18, defpackage.acp r19, defpackage.acq r20, java.lang.String r21, defpackage.afeh r22, defpackage.bux r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.L(afm, cfy, acp, acq, java.lang.String, afeh, bux, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void M(final boolean r19, defpackage.cfy r20, defpackage.acp r21, defpackage.acq r22, java.lang.String r23, final defpackage.afeh r24, defpackage.bux r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.M(boolean, cfy, acp, acq, java.lang.String, afeh, bux, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void N(defpackage.avx r18, boolean r19, defpackage.cfy r20, defpackage.acp r21, defpackage.acq r22, java.lang.String r23, defpackage.afeh r24, defpackage.bux r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.N(avx, boolean, cfy, acp, acq, java.lang.String, afeh, bux, int, int):void");
    }

    public static boolean O(agg aggVar) {
        Object objE = aggVar.e();
        acc accVar = acc.c;
        return objE == accVar && aggVar.g() == accVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void P(defpackage.ats r18, boolean r19, defpackage.cfy r20, defpackage.acp r21, defpackage.acq r22, java.lang.String r23, defpackage.afeh r24, defpackage.bux r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.P(ats, boolean, cfy, acp, acq, java.lang.String, afeh, bux, int, int):void");
    }

    public static void Q(agg aggVar, afec afecVar, cfy cfyVar, acp acpVar, acq acqVar, afeh afehVar, bux buxVar, int i, int i2) {
        int i3;
        acp acpVar2;
        afeh afehVar2;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-497872534);
        int i5 = 1;
        if (i4 == 0) {
            i3 = (true != buxVarC.C(aggVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.E(afecVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            acpVar2 = acpVar;
            i3 |= true != buxVarC.C(acpVar2) ? 1024 : 2048;
        } else {
            acpVar2 = acpVar;
        }
        if ((i & 24576) == 0) {
            i3 |= true != buxVarC.C(acqVar) ? 8192 : 16384;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= true != buxVarC.E(null) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            afehVar2 = afehVar;
            i3 |= true != buxVarC.E(afehVar2) ? 524288 : 1048576;
        } else {
            afehVar2 = afehVar;
        }
        if (buxVarC.I((599187 & i3) != 599186, i3 & 1)) {
            int i6 = i3 & 112;
            boolean z = i6 == 32;
            int i7 = i3 & 14;
            boolean z2 = i7 == 4;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if ((z2 | z) || objS == buw.a) {
                objS = new alt(afecVar, aggVar, i5);
                bvvVar.ad(objS);
            }
            cfy cfyVarA = cfyVar.a(new csu((afeh) objS));
            Object objS2 = bvvVar.S();
            if (objS2 == buw.a) {
                objS2 = new abp(0);
                bvvVar.ad(objS2);
            }
            int i8 = i7 | 196608;
            afeg afegVar = (afeg) objS2;
            acp acpVar3 = acpVar2;
            ai(aggVar, afecVar, cfyVarA, acpVar3, acqVar, afegVar, null, false, afehVar2, buxVarC, i8 | i6 | (i3 & 7168) | (57344 & i3) | (29360128 & (i3 << 6)) | ((i3 << 9) & 1879048192), 320);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new abq(aggVar, afecVar, cfyVar, acpVar, acqVar, afehVar, i, i2, 0);
        }
    }

    public static acc R(agg aggVar, afec afecVar, Object obj, bux buxVar) {
        acc accVar;
        bvv bvvVar = (bvv) buxVar;
        bvvVar.ab(-422486566, aggVar, 0, null);
        if (aggVar.w()) {
            buxVar.v(-212166497);
            bvvVar.Y(false);
            accVar = ((Boolean) afecVar.invoke(obj)).booleanValue() ? acc.b : ((Boolean) afecVar.invoke(aggVar.e())).booleanValue() ? acc.c : acc.a;
        } else {
            buxVar.v(-211886815);
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(false, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            bwq bwqVar = (bwq) objS;
            Object objF = aggVar.f();
            if (((Boolean) afecVar.invoke(aggVar.e())).booleanValue() || (objF != null && ((Boolean) afecVar.invoke(objF)).booleanValue())) {
                bwqVar.b(true);
            }
            accVar = ((Boolean) afecVar.invoke(obj)).booleanValue() ? acc.b : ((objF == null || !((Boolean) afecVar.invoke(objF)).booleanValue()) && ((Boolean) bwqVar.a()).booleanValue()) ? acc.c : acc.a;
            bvvVar.Y(false);
        }
        bvvVar.Y(false);
        return accVar;
    }

    public static void S(final agg aggVar, final afec afecVar, cfy cfyVar, final acp acpVar, final acq acqVar, final afeh afehVar, bux buxVar, final int i) {
        agg aggVar2;
        int i2;
        acp acpVar2;
        final cfy cfyVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1699747442);
        if (i3 == 0) {
            aggVar2 = aggVar;
            i2 = (true != buxVarC.C(aggVar2) ? 2 : 4) | i;
        } else {
            aggVar2 = aggVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afecVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            acpVar2 = acpVar;
            i4 |= true != buxVarC.C(acpVar2) ? 1024 : 2048;
        } else {
            acpVar2 = acpVar;
        }
        if ((i & 24576) == 0) {
            i4 |= true != buxVarC.C(acqVar) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i4 |= true != buxVarC.E(afehVar) ? 65536 : 131072;
        }
        if (buxVarC.I((74899 & i4) != 74898, i4 & 1)) {
            int i5 = i4 & 7168;
            int i6 = 57344 & i4;
            cfv cfvVar = cfy.e;
            Q(aggVar2, afecVar, cfvVar, acpVar2, acqVar, afehVar, buxVarC, (i4 & 14) | 196608 | (i4 & 112) | (i4 & 896) | i5 | i6 | ((i4 << 3) & 3670016), 0);
            cfyVar2 = cfvVar;
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: abr
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    ((Integer) obj2).intValue();
                    agg aggVar3 = aggVar;
                    afec afecVar2 = afecVar;
                    int i7 = i | 1;
                    int i8 = 306783378 & i7;
                    int i9 = 613566756 & i7;
                    ca.S(aggVar3, afecVar2, cfyVar2, acpVar, acqVar, afehVar, buxVar2, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 + i8) & i9));
                    return afak.a;
                }
            };
        }
    }

    public static /* synthetic */ acp T(abh abhVar) {
        Map map = ahc.a;
        return abhVar.a(new aft(1.0f, 1500.0f, new dlo(4294967297L)), new abc(4));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void U(defpackage.agg r17, defpackage.cfy r18, defpackage.afec r19, defpackage.cfn r20, defpackage.afec r21, defpackage.afei r22, defpackage.bux r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.U(agg, cfy, afec, cfn, afec, afei, bux, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void V(final java.lang.Object r18, defpackage.cfy r19, defpackage.afec r20, defpackage.cfn r21, java.lang.String r22, defpackage.afec r23, final defpackage.afei r24, defpackage.bux r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.V(java.lang.Object, cfy, afec, cfn, java.lang.String, afec, afei, bux, int, int):void");
    }

    public static /* synthetic */ aby W() {
        return new aby(acl.B(F(220, 90, null, 4), 2).a(acl.q(F(220, 90, null, 4), 0.92f, 0L, 4)), acl.C(F(90, 0, null, 6), 2), BitmapDescriptorFactory.HUE_RED, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void X(final agg aggVar, cfy cfyVar, final afec afecVar, cfn cfnVar, final afec afecVar2, afec afecVar3, afei afeiVar, bux buxVar, int i) {
        int i2;
        Object obj;
        Object biiVar;
        aan aanVar;
        abk abkVar;
        bvv bvvVar;
        boolean z;
        abk abkVar2;
        cfy cfyVar2;
        agb agbVarAg;
        int i3;
        int i4;
        afec afecVar4 = afecVar;
        int i5 = i & 6;
        bux buxVarC = buxVar.c(1935038908);
        int i6 = i5 == 0 ? (true != buxVarC.C(aggVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i6 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i6 |= true != buxVarC.E(afecVar4) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i6 |= true != buxVarC.C(cfnVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i6 |= true != buxVarC.E(afecVar2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i6 |= true != buxVarC.E(afecVar3) ? 65536 : 131072;
        }
        final afei afeiVar2 = afeiVar;
        if ((1572864 & i) == 0) {
            i6 |= true != buxVarC.E(afeiVar2) ? 524288 : 1048576;
        }
        if (buxVarC.I((599187 & i6) != 599186, i6 & 1)) {
            dlr dlrVar = (dlr) buxVarC.f(dbc.i);
            int i7 = i6 & 14;
            bvv bvvVar2 = (bvv) buxVarC;
            Object objS = bvvVar2.S();
            if (i7 == 4 || objS == buw.a) {
                objS = new abk(aggVar, cfnVar, dlrVar);
                bvvVar2.ad(objS);
            }
            abk abkVar3 = (abk) objS;
            Object objS2 = bvvVar2.S();
            if (i7 == 4 || objS2 == buw.a) {
                i2 = i6;
                Object[] objArr = {aggVar.e()};
                SnapshotStateList snapshotStateList = new SnapshotStateList();
                snapshotStateList.addAll(woy.df(objArr));
                bvvVar2.ad(snapshotStateList);
                obj = snapshotStateList;
            } else {
                i2 = i6;
                obj = objS2;
            }
            final SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj;
            boolean zC = buxVarC.C(aggVar.f()) | (i7 == 4);
            Object objS3 = bvvVar2.S();
            if (zC || objS3 == buw.a) {
                long[] jArr = aao.a;
                objS3 = new aan(6);
                bvvVar2.ad(objS3);
            }
            aan aanVar2 = (aan) objS3;
            if (!snapshotStateList2.contains(aggVar.e())) {
                snapshotStateList2.clear();
                snapshotStateList2.add(aggVar.e());
            }
            if (affa.f(aggVar.e(), aggVar.g()) && aggVar.f() == null) {
                if (snapshotStateList2.a() != 1 || !affa.f(snapshotStateList2.get(0), aggVar.e())) {
                    snapshotStateList2.clear();
                    snapshotStateList2.add(aggVar.e());
                }
                if (aanVar2.e != 1 || aan.f(aanVar2, aggVar.e())) {
                    aanVar2.k();
                }
                abkVar3.b = cfnVar;
                abkVar3.c = dlrVar;
            }
            Object objF = aggVar.f();
            if (objF != null && !affa.f(objF, aggVar.e())) {
                Object objInvoke = afecVar2.invoke(objF);
                if (!affa.f(objInvoke, afecVar2.invoke(aggVar.g()))) {
                    cet cetVar = new cet(snapshotStateList2, 0);
                    int i8 = 0;
                    while (true) {
                        if (!cetVar.hasNext()) {
                            i4 = -1;
                            break;
                        }
                        int i9 = i8;
                        if (affa.f(afecVar2.invoke(cetVar.next()), objInvoke)) {
                            i4 = i9;
                            break;
                        }
                        i8 = i9 + 1;
                    }
                    if (i4 == -1) {
                        snapshotStateList2.add(objF);
                    } else if (!affa.f(snapshotStateList2.get(i4), objF)) {
                        snapshotStateList2.set(i4, objF);
                    }
                }
            }
            if (!affa.f(aggVar.e(), aggVar.g())) {
                cet cetVar2 = new cet(snapshotStateList2, 0);
                int i10 = 0;
                while (true) {
                    if (!cetVar2.hasNext()) {
                        i3 = -1;
                        break;
                    } else {
                        if (affa.f(afecVar2.invoke(cetVar2.next()), afecVar2.invoke(aggVar.g()))) {
                            i3 = i10;
                            break;
                        }
                        i10++;
                    }
                }
                if (i3 == -1) {
                    snapshotStateList2.add(aggVar.g());
                } else if (!affa.f(snapshotStateList2.get(i3), aggVar.g()) || i3 != snapshotStateList2.a() - 1) {
                    affa.f(aggVar.g(), snapshotStateList2.get(i3));
                    snapshotStateList2.b(i3);
                    snapshotStateList2.add(aggVar.g());
                }
            }
            final Object objF2 = aggVar.f();
            boolean zC2 = buxVarC.C(objF2);
            Object objS4 = bvvVar2.S();
            if (zC2 || objS4 == buw.a) {
                objS4 = objF2 != null ? new acx(abkVar3, aggVar.g(), objF2) : null;
                bvvVar2.ad(objS4);
            }
            acx acxVar = (acx) objS4;
            boolean zC3 = buxVarC.C(acxVar) | ((i2 & 458752) == 131072);
            Object objS5 = bvvVar2.S();
            if (zC3 || objS5 == buw.a) {
                biiVar = acxVar != 0 ? !affa.f(afecVar2.invoke(acxVar.a), afecVar2.invoke(acxVar.b)) ? (bii) afecVar3.invoke(acxVar) : new bii((short[]) null, (byte[]) null) : null;
                bvvVar2.ad(biiVar);
            } else {
                biiVar = objS5;
            }
            bii biiVar2 = (bii) biiVar;
            if (aan.f(aanVar2, aggVar.g()) && aan.f(aanVar2, aggVar.e()) && (objF2 == null || aan.f(aanVar2, objF2))) {
                buxVarC.v(-296483994);
                bvvVar2.Y(false);
                aanVar = aanVar2;
                abkVar = acxVar;
                bvvVar = bvvVar2;
                z = true;
                abkVar2 = abkVar3;
            } else {
                buxVarC.v(-301762767);
                aanVar2.k();
                int iA = snapshotStateList2.a();
                int i11 = 0;
                abk abkVar4 = acxVar;
                bvv bvvVar3 = bvvVar2;
                while (i11 < iA) {
                    final bii biiVar3 = biiVar2;
                    final Object obj2 = snapshotStateList2.get(i11);
                    aan aanVar3 = aanVar2;
                    int i12 = iA;
                    bvv bvvVar4 = bvvVar3;
                    final acx acxVar2 = abkVar4;
                    final abk abkVar5 = abkVar3;
                    afeg afegVar = new afeg() { // from class: abe
                        @Override // defpackage.afeg
                        public final Object invoke(Object obj3, Object obj4) {
                            int iIndexOf;
                            bux buxVar2 = (bux) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            boolean z2 = false;
                            if (buxVar2.I((iIntValue & 3) != 2, iIntValue & 1)) {
                                abk abkVar6 = abkVar5;
                                afec afecVar5 = afecVar;
                                acx acxVar3 = acxVar2;
                                agg aggVar2 = aggVar;
                                Object obj5 = obj2;
                                boolean zD = buxVar2.D(affa.f(obj5, aggVar2.f()));
                                Object objG = buxVar2.g();
                                if (zD || objG == buw.a) {
                                    objG = (!affa.f(obj5, aggVar2.f()) || acxVar3 == null) ? (affa.f(obj5, aggVar2.d().f()) || affa.f(obj5, aggVar2.d().g())) ? (aby) afecVar5.invoke(abkVar6) : (aby) afecVar5.invoke(new acx(abkVar6, aggVar2.d().f(), obj5)) : (aby) afecVar5.invoke(acxVar3);
                                    buxVar2.x(objG);
                                }
                                aby abyVar = (aby) objG;
                                boolean zD2 = buxVar2.D(affa.f(aggVar2.d().g(), obj5)) | buxVar2.D(affa.f(obj5, aggVar2.f()));
                                Object objG2 = buxVar2.g();
                                if (zD2 || objG2 == buw.a) {
                                    objG2 = (affa.f(aggVar2.d().g(), obj5) || (affa.f(obj5, aggVar2.f()) && acxVar3 != null)) ? acq.a : (affa.f(obj5, aggVar2.d().f()) || affa.f(obj5, aggVar2.d().g())) ? ((aby) afecVar5.invoke(abkVar6)).b : ((aby) afecVar5.invoke(new acx(abkVar6, obj5, aggVar2.d().f()))).b;
                                    buxVar2.x(objG2);
                                }
                                acq acqVar = (acq) objG2;
                                Object objG3 = buxVar2.g();
                                Object obj6 = buw.a;
                                if (objG3 == obj6) {
                                    objG3 = new abj(affa.f(obj5, aggVar2.g()));
                                    buxVar2.x(objG3);
                                }
                                Object obj7 = objF2;
                                afec afecVar6 = afecVar2;
                                acp acpVar = abyVar.a;
                                abj abjVar = (abj) objG3;
                                cfy adqVar = new adq(abyVar.c.e(), obj5);
                                abjVar.a.b(Boolean.valueOf(affa.f(obj5, aggVar2.g())));
                                Object objInvoke2 = afecVar6.invoke(obj5);
                                abjVar.b.b(Boolean.valueOf((obj7 == null || !affa.f(objInvoke2, afecVar6.invoke(obj7)) || affa.f(objInvoke2, afecVar6.invoke(aggVar2.g())) || affa.f(objInvoke2, afecVar6.invoke(aggVar2.e()))) ? false : true));
                                if (abjVar != cfy.e) {
                                    adqVar = new cft(adqVar, abjVar);
                                }
                                bii biiVar4 = biiVar3;
                                Object obj8 = null;
                                if (biiVar4 != null) {
                                    if (affa.f(obj5, aggVar2.f())) {
                                        obj8 = biiVar4.a;
                                    } else if (affa.f(obj5, aggVar2.g())) {
                                        obj8 = biiVar4.b;
                                    }
                                }
                                Object obj9 = obj8;
                                SnapshotStateList snapshotStateList3 = snapshotStateList2;
                                if ((aggVar2 instanceof aeq) && (iIndexOf = snapshotStateList3.indexOf(obj5)) >= 0 && iIndexOf >= snapshotStateList3.a() - 3) {
                                    z2 = true;
                                }
                                boolean zE = buxVar2.E(obj5);
                                Object objG4 = buxVar2.g();
                                if (zE || objG4 == obj6) {
                                    objG4 = new aai(obj5, 3);
                                    buxVar2.x(objG4);
                                }
                                afec afecVar7 = (afec) objG4;
                                boolean zC4 = buxVar2.C(acqVar);
                                Object objG5 = buxVar2.g();
                                if (zC4 || objG5 == obj6) {
                                    objG5 = new alx(acqVar, 1);
                                    buxVar2.x(objG5);
                                }
                                ca.ai(aggVar2, afecVar7, adqVar, acpVar, acqVar, (afeg) objG5, (ca) obj9, z2, bxc.i(-519005224, true, new abt(obj5, snapshotStateList3, abkVar6, afeiVar2, 1), buxVar2), buxVar2, 805306368, 64);
                            } else {
                                buxVar2.s();
                            }
                            return afak.a;
                        }
                    };
                    biiVar2 = biiVar3;
                    afecVar4 = afecVar;
                    aanVar3.m(obj2, bxc.i(427839334, true, afegVar, buxVarC));
                    i11++;
                    aanVar2 = aanVar3;
                    afeiVar2 = afeiVar;
                    abkVar4 = acxVar2;
                    abkVar3 = abkVar5;
                    bvvVar3 = bvvVar4;
                    iA = i12;
                }
                aanVar = aanVar2;
                abkVar = abkVar4;
                bvvVar = bvvVar3;
                z = true;
                abkVar2 = abkVar3;
                bvvVar.Y(false);
            }
            boolean zC4 = buxVarC.C(aggVar.d()) | buxVarC.C(abkVar) | buxVarC.C(abkVar2);
            Object objS6 = bvvVar.S();
            if (zC4 || objS6 == buw.a) {
                objS6 = (aby) afecVar4.invoke(abkVar != null ? abkVar : abkVar2);
                bvvVar.ad(objS6);
            }
            aby abyVar = (aby) objS6;
            boolean zC5 = buxVarC.C(abkVar2);
            Object objS7 = bvvVar.S();
            if (zC5 || objS7 == buw.a) {
                Object parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(false, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS7 = parcelableSnapshotMutableState;
            }
            bwq bwqVar = (bwq) objS7;
            bym bymVarC = byx.c(abyVar.d, buxVarC);
            agg aggVar2 = abkVar2.a;
            if (affa.f(aggVar2.e(), aggVar2.g())) {
                bwqVar.b(false);
            } else if (bymVarC.a() != null) {
                bwqVar.b(Boolean.valueOf(z));
            }
            if (((Boolean) bwqVar.a()).booleanValue()) {
                buxVarC.v(1353077497);
                agbVarAg = afp.ag(aggVar2, agm.h, buxVarC, 0);
                boolean zC6 = buxVarC.C(agbVarAg);
                Object objS8 = bvvVar.S();
                if (zC6 || objS8 == buw.a) {
                    adi adiVar = (adi) bymVarC.a();
                    objS8 = (adiVar == null || adiVar.a) ? cjn.g(cfy.e, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, true, 0, 1044479) : cfy.e;
                    bvvVar.ad(objS8);
                }
                cfyVar2 = (cfy) objS8;
                bvvVar.Y(false);
            } else {
                buxVarC.v(1353343539);
                bvvVar.Y(false);
                abkVar2.e = null;
                cfyVar2 = cfy.e;
                agbVarAg = null;
            }
            cfy cfyVarA = cfyVar.a(cfyVar2.a(new abk.a(agbVarAg, bymVarC, abkVar2)));
            Object objS9 = bvvVar.S();
            if (objS9 == buw.a) {
                objS9 = new abf(abkVar2);
                bvvVar.ad(objS9);
            }
            abf abfVar = (abf) objS9;
            long j = bvvVar.u;
            long j2 = j ^ (j >>> 32);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarA);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, abfVar, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.a(buxVarC, Integer.valueOf((int) j2), cwb.f);
            buxVarC.i(afak.a, new alx(cwb.g, 16));
            byq.c(buxVarC, cfyVarJ, cwb.c);
            buxVarC.v(758586195);
            int iA2 = snapshotStateList2.a();
            for (int i13 = 0; i13 < iA2; i13++) {
                Object obj3 = snapshotStateList2.get(i13);
                bvvVar.ab(1420119555, afecVar2.invoke(obj3), 0, null);
                afeg afegVar2 = (afeg) aanVar.a(obj3);
                if (afegVar2 == null) {
                    buxVarC.v(1074069702);
                } else {
                    buxVarC.v(1420120731);
                    afegVar2.invoke(buxVarC, 0);
                }
                bvvVar.Y(false);
                bvvVar.Y(false);
            }
            bvvVar.Y(false);
            bvvVar.Y(z);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new ccs(aggVar, cfyVar, afecVar4, cfnVar, afecVar2, afecVar3, afeiVar, i, 1);
        }
    }

    public static void Y(String str) {
        throw new IllegalArgumentException(str);
    }

    public static void Z(String str) {
        throw new IllegalStateException(str);
    }

    public static void a(Runnable runnable) {
        fdk.a.a("androidx.fragment");
        fdf fdfVar = fdf.b;
        try {
            runnable.run();
        } finally {
        }
    }

    public static boolean aA(cql cqlVar) {
        return cqlVar.b == 2;
    }

    public static aom aB(bux buxVar) {
        kwp kwpVarA = adl.a(buxVar);
        boolean zC = buxVar.C(kwpVarA);
        bvv bvvVar = (bvv) buxVar;
        Object objS = bvvVar.S();
        if (zC || objS == buw.a) {
            objS = new anh(kwpVarA);
            bvvVar.ad(objS);
        }
        return (anh) objS;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object aC(defpackage.aqf r5, float r6, defpackage.aec r7, defpackage.afck r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.apm
            if (r0 == 0) goto L13
            r0 = r8
            apm r0 = (defpackage.apm) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            apm r0 = new apm
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            affs r5 = r0.c
            defpackage.woy.dF(r8)
            goto L4c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.woy.dF(r8)
            affs r8 = new affs
            r8.<init>()
            apo r2 = new apo
            r4 = 0
            r2.<init>(r6, r7, r8, r4)
            r0.c = r8
            r0.b = r3
            akq r6 = defpackage.akq.a
            java.lang.Object r5 = r5.e(r6, r2, r0)
            if (r5 == r1) goto L54
            r5 = r8
        L4c:
            float r5 = r5.a
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            return r6
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.aC(aqf, float, aec, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object aD(defpackage.aqf r5, float r6, defpackage.afck r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.app
            if (r0 == 0) goto L13
            r0 = r7
            app r0 = (defpackage.app) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            app r0 = new app
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            affs r5 = r0.c
            defpackage.woy.dF(r7)
            goto L4c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.woy.dF(r7)
            affs r7 = new affs
            r7.<init>()
            apq r2 = new apq
            r4 = 0
            r2.<init>(r7, r6, r4)
            r0.c = r7
            r0.b = r3
            akq r6 = defpackage.akq.a
            java.lang.Object r5 = r5.e(r6, r2, r0)
            if (r5 == r1) goto L54
            r5 = r7
        L4c:
            float r5 = r5.a
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            return r6
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.aD(aqf, float, afck):java.lang.Object");
    }

    public static boolean aF(aqk aqkVar, float f) {
        float fA = aqkVar.a(f);
        if (fA < BitmapDescriptorFactory.HUE_RED) {
            return aqkVar.a.g();
        }
        if (fA <= BitmapDescriptorFactory.HUE_RED) {
            return false;
        }
        return aqkVar.a.h();
    }

    public static long aG(cpl cplVar, api apiVar, cpk cpkVar) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (apiVar != null) {
            int i = cpkVar.a;
            if (i == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (cplVar.c >> 32));
            } else if (i == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (cplVar.c & 4294967295L));
            }
            if (apiVar == api.b) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED);
                j = jFloatToRawIntBits2 << 32;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED);
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                j = jFloatToRawIntBits3 << 32;
            }
            return j | (4294967295L & jFloatToRawIntBits);
        }
        return cplVar.c;
    }

    public static long aH(cpl cplVar, api apiVar, cpk cpkVar) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (apiVar != null) {
            int i = cpkVar.a;
            if (i == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (cplVar.e >> 32));
            } else if (i == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (cplVar.e & 4294967295L));
            }
            if (apiVar == api.b) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED);
                j = jFloatToRawIntBits2 << 32;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED);
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                j = jFloatToRawIntBits3 << 32;
            }
            return j | (4294967295L & jFloatToRawIntBits);
        }
        return cplVar.e;
    }

    public static boolean aI(cpl cplVar) {
        return !cplVar.f && cplVar.d;
    }

    public static boolean aJ(cpl cplVar) {
        return cplVar.f && !cplVar.d;
    }

    public static Object aK(cqz cqzVar, afeg afegVar, afck afckVar) {
        Object objR = cqzVar.r(new aop(afckVar.hH(), afegVar, null), afckVar);
        return objR == afcr.a ? objR : afak.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:21:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object aL(defpackage.crl r8, defpackage.cqm r9, defpackage.afck r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.aoo
            if (r0 == 0) goto L13
            r0 = r10
            aoo r0 = (defpackage.aoo) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aoo r0 = new aoo
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            cqm r8 = r0.c
            crl r9 = r0.d
            defpackage.woy.dF(r10)
            r7 = r9
            r9 = r8
            r8 = r7
            goto L5e
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            defpackage.woy.dF(r10)
            cql r10 = r8.p()
            java.util.List r10 = r10.a
            int r2 = r10.size()
            r5 = r3
        L45:
            if (r5 >= r2) goto L7a
            java.lang.Object r6 = r10.get(r5)
            cqu r6 = (defpackage.cqu) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L77
        L51:
            r0.d = r8
            r0.c = r9
            r0.b = r4
            java.lang.Object r10 = r8.r(r9, r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            cql r10 = (defpackage.cql) r10
            java.util.List r10 = r10.a
            int r2 = r10.size()
            r5 = r3
        L67:
            if (r5 >= r2) goto L7a
            java.lang.Object r6 = r10.get(r5)
            cqu r6 = (defpackage.cqu) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L74
            goto L51
        L74:
            int r5 = r5 + 1
            goto L67
        L77:
            int r5 = r5 + 1
            goto L45
        L7a:
            afak r8 = defpackage.afak.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.aL(crl, cqm, afck):java.lang.Object");
    }

    public static float aM(dcc dccVar, int i) {
        return i == 2 ? dccVar.d() * 0.0069444445f : dccVar.d();
    }

    public static Object aN(cqz cqzVar, afec afecVar, afdr afdrVar, afdr afdrVar2, afeg afegVar, afck afckVar) {
        akh akhVar = new akh(afecVar, 2);
        int i = 12;
        Object objAK = aK(cqzVar, new anw(new acf(i), akhVar, afegVar, afdrVar2, new acm(afdrVar, i), null), afckVar);
        afcr afcrVar = afcr.a;
        if (objAK != afcrVar) {
            objAK = afak.a;
        }
        return objAK == afcrVar ? objAK : afak.a;
    }

    public static boolean aO(cql cqlVar, long j) {
        Object obj;
        List list = cqlVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (((cqu) obj).a == j) {
                break;
            }
            i++;
        }
        cqu cquVar = (cqu) obj;
        return cquVar == null || !cquVar.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [affv] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object aP(defpackage.crl r9, long r10, defpackage.afck r12) throws java.lang.Throwable {
        /*
            boolean r0 = r12 instanceof defpackage.ans
            if (r0 == 0) goto L13
            r0 = r12
            ans r0 = (defpackage.ans) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ans r0 = new ans
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            affq r9 = r0.e
            affv r10 = r0.d
            cqu r11 = r0.c
            defpackage.woy.dF(r12)     // Catch: defpackage.cqn -> La4
            goto L96
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            defpackage.woy.dF(r12)
            cql r12 = r9.p()
            boolean r12 = aO(r12, r10)
            if (r12 == 0) goto L44
            return r4
        L44:
            cql r12 = r9.p()
            java.util.List r12 = r12.a
            int r2 = r12.size()
            r5 = 0
        L4f:
            if (r5 >= r2) goto L62
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            cqu r7 = (defpackage.cqu) r7
            long r7 = r7.a
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 != 0) goto L5f
            goto L63
        L5f:
            int r5 = r5 + 1
            goto L4f
        L62:
            r6 = r4
        L63:
            r11 = r6
            cqu r11 = (defpackage.cqu) r11
            if (r11 != 0) goto L69
            return r4
        L69:
            affv r10 = new affv
            r10.<init>()
            affv r12 = new affv
            r12.<init>()
            r12.a = r11
            dcc r2 = r9.q()
            long r5 = r2.f()
            affq r2 = new affq     // Catch: defpackage.cqn -> La4
            r2.<init>()     // Catch: defpackage.cqn -> La4
            ant r7 = new ant     // Catch: defpackage.cqn -> La4
            r7.<init>(r2, r12, r10, r4)     // Catch: defpackage.cqn -> La4
            r0.c = r11     // Catch: defpackage.cqn -> La4
            r0.d = r10     // Catch: defpackage.cqn -> La4
            r0.e = r2     // Catch: defpackage.cqn -> La4
            r0.b = r3     // Catch: defpackage.cqn -> La4
            java.lang.Object r9 = r9.s(r5, r7, r0)     // Catch: defpackage.cqn -> La4
            if (r9 == r1) goto La3
            r9 = r2
        L96:
            boolean r9 = r9.a     // Catch: defpackage.cqn -> La4
            if (r9 == 0) goto La2
            java.lang.Object r9 = r10.a     // Catch: defpackage.cqn -> La4
            cqu r9 = (defpackage.cqu) r9     // Catch: defpackage.cqn -> La4
            if (r9 == 0) goto La1
            return r9
        La1:
            return r11
        La2:
            return r4
        La3:
            return r1
        La4:
            java.lang.Object r9 = r10.a
            cqu r9 = (defpackage.cqu) r9
            if (r9 == 0) goto Lab
            r11 = r9
        Lab:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.aP(crl, long, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0162 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x015a -> B:59:0x015c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object aQ(defpackage.crl r18, long r19, defpackage.afeg r21, defpackage.afck r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.aQ(crl, long, afeg, afck):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ae, code lost:
    
        if (defpackage.tl.o(r6) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005b -> B:22:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object aR(defpackage.crl r12, long r13, defpackage.afck r15) throws java.lang.Throwable {
        /*
            boolean r0 = r15 instanceof defpackage.anv
            if (r0 == 0) goto L13
            r0 = r15
            anv r0 = (defpackage.anv) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            anv r0 = new anv
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            affu r12 = r0.c
            crl r13 = r0.d
            defpackage.woy.dF(r15)
            r11 = r13
            r13 = r12
            r12 = r11
            goto L5e
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            defpackage.woy.dF(r15)
            cql r15 = r12.p()
            boolean r15 = aO(r15, r13)
            if (r15 == 0) goto L45
            return r4
        L45:
            affu r15 = new affu
            r15.<init>()
            r15.a = r13
        L4c:
            r0.d = r12
            r0.c = r15
            r0.b = r3
            cqm r13 = defpackage.cqm.b
            java.lang.Object r13 = r12.r(r13, r0)
            if (r13 != r1) goto L5b
            return r1
        L5b:
            r11 = r15
            r15 = r13
            r13 = r11
        L5e:
            cql r15 = (defpackage.cql) r15
            java.util.List r14 = r15.a
            int r15 = r14.size()
            r2 = 0
            r5 = r2
        L68:
            if (r5 >= r15) goto L7d
            java.lang.Object r6 = r14.get(r5)
            r7 = r6
            cqu r7 = (defpackage.cqu) r7
            long r7 = r7.a
            long r9 = r13.a
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L7a
            goto L7e
        L7a:
            int r5 = r5 + 1
            goto L68
        L7d:
            r6 = r4
        L7e:
            cqu r6 = (defpackage.cqu) r6
            if (r6 != 0) goto L84
            r6 = r4
            goto Lb0
        L84:
            boolean r15 = defpackage.tl.m(r6)
            if (r15 == 0) goto Laa
            int r15 = r14.size()
        L8e:
            if (r2 >= r15) goto L9f
            java.lang.Object r5 = r14.get(r2)
            r7 = r5
            cqu r7 = (defpackage.cqu) r7
            boolean r7 = r7.d
            if (r7 == 0) goto L9c
            goto La0
        L9c:
            int r2 = r2 + 1
            goto L8e
        L9f:
            r5 = r4
        La0:
            cqu r5 = (defpackage.cqu) r5
            if (r5 != 0) goto La5
            goto Lb0
        La5:
            long r14 = r5.a
            r13.a = r14
            goto Lba
        Laa:
            boolean r14 = defpackage.tl.o(r6)
            if (r14 == 0) goto Lba
        Lb0:
            if (r6 == 0) goto Lb9
            boolean r12 = r6.c()
            if (r12 != 0) goto Lb9
            return r6
        Lb9:
            return r4
        Lba:
            r15 = r13
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.aR(crl, long, afck):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object aS(defpackage.crl r4, long r5, defpackage.afec r7, defpackage.afck r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.any
            if (r0 == 0) goto L13
            r0 = r8
            any r0 = (defpackage.any) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            any r0 = new any
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.a
            crl r5 = r0.d
            defpackage.woy.dF(r8)
            r7 = r4
            r4 = r5
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            defpackage.woy.dF(r8)
        L38:
            r0.d = r4
            r0.a = r7
            r0.c = r3
            java.lang.Object r8 = aR(r4, r5, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            cqu r8 = (defpackage.cqu) r8
            if (r8 != 0) goto L4f
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L4f:
            boolean r5 = defpackage.tl.m(r8)
            if (r5 == 0) goto L5a
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L5a:
            r7.invoke(r8)
            long r5 = r8.a
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.aS(crl, long, afec, afck):java.lang.Object");
    }

    public static /* synthetic */ Object aT(cqz cqzVar, afec afecVar, afeg afegVar, afck afckVar, int i) {
        if ((i & 1) != 0) {
            afecVar = new ajc(13);
        }
        return aN(cqzVar, afecVar, new acf(10), new acf(11), afegVar, afckVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x05d1, code lost:
    
        if (aO(r1, r8) != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0669, code lost:
    
        if (defpackage.cja.a(defpackage.aclh.y(r1.c, r1.g)) != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) goto L198;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:127:0x04d2, B:130:0x04de], limit reached: 231 */
    /* JADX WARN: Path cross not found for [B:133:0x04e5, B:127:0x04d2], limit reached: 231 */
    /* JADX WARN: Path cross not found for [B:185:0x0639, B:196:0x065a], limit reached: 231 */
    /* JADX WARN: Path cross not found for [B:42:0x02c0, B:44:0x02ce], limit reached: 231 */
    /* JADX WARN: Path cross not found for [B:47:0x02d5, B:42:0x02c0], limit reached: 231 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0629 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0416 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03f0  */
    /* JADX WARN: Type inference failed for: r10v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x040d -> B:89:0x03bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x044a -> B:83:0x039a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:155:0x0576 -> B:14:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x0604 -> B:173:0x0606). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0233 -> B:74:0x0382). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x036b -> B:71:0x0374). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object aU(defpackage.crl r23, defpackage.cqu r24, defpackage.afeh r25, defpackage.afeg r26, defpackage.afdr r27, defpackage.afec r28, defpackage.afck r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.aU(crl, cqu, afeh, afeg, afdr, afec, afck):java.lang.Object");
    }

    public static int aV(int i, int i2, int i3, boolean z) {
        if (i2 >= i3) {
            return bo(i2, i3, z);
        }
        boolean z2 = !z;
        return bp(i, i2, i3, z2) ? bn(i, i2, z) : bp(i, i2, i3, z) ? bn(i, i2, z2) : bo(i2, i3, z2);
    }

    public static cfy aW(cfy cfyVar, aqf aqfVar, api apiVar, aiu aiuVar, boolean z, aom aomVar, asf asfVar, amy amyVar) {
        return afp.t(cfyVar, apiVar).a(new ali(aqfVar, apiVar, z, aomVar, asfVar, amyVar, false, aiuVar));
    }

    public static alh aX(bux buxVar) {
        Object[] objArr = new Object[0];
        cdt cdtVar = alh.g;
        boolean zA = buxVar.A(0);
        bvv bvvVar = (bvv) buxVar;
        Object objS = bvvVar.S();
        if (zA || objS == buw.a) {
            objS = new acf(9);
            bvvVar.ad(objS);
        }
        return (alh) byx.r(objArr, cdtVar, (afdr) objS, buxVar, 0);
    }

    public static cfy aY(cfy cfyVar, alh alhVar) {
        api apiVar = api.a;
        return afp.t(cfyVar, apiVar).a(new ali(alhVar, apiVar, true, null, alhVar.b, null, true, null)).a(new alk(alhVar));
    }

    public static cfy aZ(cfy cfyVar) {
        return dds.a(cfyVar, true, new ajc(5));
    }

    public static void aa(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static void ab(String str) {
        throw new NoSuchElementException(str);
    }

    public static Iterator ac(aau aauVar) {
        aauVar.getClass();
        return new aax(aauVar);
    }

    public static int ad(yy yyVar, int i) {
        try {
            return aaz.a(yyVar.a, yyVar.c, i);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static int ae(yy yyVar, Object obj, int i) {
        int i2 = yyVar.c;
        if (i2 == 0) {
            return -1;
        }
        int iAd = ad(yyVar, i);
        if (iAd < 0 || affa.f(obj, yyVar.b[iAd])) {
            return iAd;
        }
        int i3 = iAd + 1;
        while (i3 < i2 && yyVar.a[i3] == i) {
            if (affa.f(obj, yyVar.b[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iAd - 1; i4 >= 0 && yyVar.a[i4] == i; i4--) {
            if (affa.f(obj, yyVar.b[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    public static float af(yn ynVar) {
        return ((yo) ynVar.a).b;
    }

    public static float ag(yn ynVar) {
        return ((yo) ynVar.a).a;
    }

    public static void ah(yn ynVar) {
        if (!ynVar.c()) {
            ynVar.a(0, 0, 0, 0);
            return;
        }
        float fAf = af(ynVar);
        float fAg = ag(ynVar);
        int iCeil = (int) Math.ceil(yp.a(fAf, fAg, ynVar.b()));
        int iCeil2 = (int) Math.ceil(yp.b(fAf, fAg, ynVar.b()));
        ynVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void ai(agg aggVar, afec afecVar, cfy cfyVar, acp acpVar, acq acqVar, afeg afegVar, ca caVar, boolean z, afeh afehVar, bux buxVar, int i, int i2) {
        ca caVar2;
        cfy cfyVar2;
        bux buxVar2;
        boolean z2;
        ca caVar3;
        boolean z3;
        boolean z4;
        ca caVar4;
        boolean z5;
        acc accVar;
        afeh afehVar2 = afehVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(978633943);
        int i4 = i3 == 0 ? (true != buxVarC.C(aggVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i4 |= true != buxVarC.E(afecVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i4 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i4 |= true != buxVarC.C(acpVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i4 |= true != buxVarC.C(acqVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i4 |= true != buxVarC.E(afegVar) ? 65536 : 131072;
        }
        if ((i2 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= true != ((2097152 & i) == 0 ? buxVarC.C(null) : buxVarC.E(null)) ? 524288 : 1048576;
        }
        int i5 = i2 & 128;
        if (i5 != 0) {
            i4 |= 12582912;
            caVar2 = caVar;
        } else {
            caVar2 = caVar;
            if ((i & 12582912) == 0) {
                i4 |= true != buxVarC.E(caVar2) ? 4194304 : 8388608;
            }
        }
        int i6 = i2 & 256;
        boolean z6 = i6 == 0;
        if (i6 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= true != buxVarC.D(z) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i4 |= true != buxVarC.E(afehVar2) ? 268435456 : 536870912;
        }
        if (buxVarC.I((306783379 & i4) != 306783378, i4 & 1)) {
            ca caVar5 = i5 != 0 ? null : caVar2;
            boolean z7 = z6 & z;
            Object objF = aggVar.f();
            if (z7 || ((Boolean) afecVar.invoke(aggVar.g())).booleanValue() || ((Boolean) afecVar.invoke(aggVar.e())).booleanValue() || ((objF != null && ((Boolean) afecVar.invoke(objF)).booleanValue()) || aggVar.w() || aggVar.u())) {
                buxVarC.v(246697882);
                int i7 = i4 & 14;
                int i8 = i7 | 48;
                int i9 = i8 & 14;
                z3 = z7;
                int i10 = i4;
                boolean z8 = ((i9 ^ 6) > 4 && buxVarC.C(aggVar)) || (i8 & 6) == 4;
                bvv bvvVar = (bvv) buxVarC;
                Object objS = bvvVar.S();
                if (z8 || objS == buw.a) {
                    objS = aggVar.e();
                    bvvVar.ad(objS);
                }
                if (aggVar.w()) {
                    objS = aggVar.e();
                }
                buxVarC.v(-1260162954);
                acc accVarR = R(aggVar, afecVar, objS, buxVarC);
                bvvVar.Y(false);
                Object objG = aggVar.g();
                buxVarC.v(-1260162954);
                acc accVarR2 = R(aggVar, afecVar, objG, buxVarC);
                bvvVar.Y(false);
                int i11 = i9 | 3072;
                int i12 = (i11 & 14) ^ 6;
                boolean z9 = (i12 > 4 && buxVarC.C(aggVar)) || (i11 & 6) == 4;
                Object objS2 = bvvVar.S();
                if (z9 || objS2 == buw.a) {
                    objS2 = new agg(new afm(accVarR), aggVar, String.valueOf(aggVar.b).concat(" > EnterExitTransition"));
                    bvvVar.ad(objS2);
                }
                agg aggVar2 = (agg) objS2;
                boolean zC = ((i12 > 4 && buxVarC.C(aggVar)) || (i11 & 6) == 4) | buxVarC.C(aggVar2);
                Object objS3 = bvvVar.S();
                if (zC || objS3 == buw.a) {
                    objS3 = new abi(aggVar, aggVar2, 16, null);
                    bvvVar.ad(objS3);
                }
                bvq.c(aggVar2, (afec) objS3, buxVarC);
                if (aggVar.w()) {
                    long j = aggVar.g;
                    aggVar2.y(accVarR, accVarR2);
                    z4 = false;
                } else {
                    aggVar2.t(accVarR2);
                    z4 = false;
                    aggVar2.o(false);
                }
                if (aggVar.w()) {
                    buxVarC.v(782538635);
                    bvvVar.Y(z4);
                } else {
                    buxVarC.v(782386797);
                    Object objF2 = aggVar.f();
                    if (objF2 == null) {
                        buxVarC.v(782437481);
                        bvvVar.Y(z4);
                        accVar = null;
                    } else {
                        buxVarC.v(782437482);
                        buxVarC.v(-1260162954);
                        acc accVarR3 = R(aggVar, afecVar, objF2, buxVarC);
                        bvvVar.Y(z4);
                        bvvVar.Y(z4);
                        accVar = accVarR3;
                    }
                    Object objF3 = aggVar2.f();
                    boolean z10 = objF3 != null && accVar == null && affa.f(aggVar2.g(), aggVar2.e());
                    aggVar2.c.b(accVar);
                    if (z10) {
                        aggVar2.p(new agd(objF3, aggVar2.g()));
                        aggVar2.a.c(objF3);
                        if (!aggVar2.v()) {
                            aggVar2.s(true);
                        }
                        SnapshotStateList snapshotStateList = aggVar2.e;
                        int iA = snapshotStateList.a();
                        for (int i13 = 0; i13 < iA; i13++) {
                            ((age) snapshotStateList.get(i13)).h(-2.0f);
                        }
                    }
                    bvvVar.Y(false);
                }
                Object objS4 = bvvVar.S();
                if (i7 == 4 || objS4 == buw.a) {
                    objS4 = new adb();
                    bvvVar.ad(objS4);
                }
                adb adbVar = (adb) objS4;
                adbVar.j(caVar5);
                adb adbVarK = acl.k(aggVar2, adbVar, buxVarC, 0);
                acp acpVarZ = acl.z(aggVar2, acpVar, adbVarK, buxVarC, (i10 >> 6) & 112);
                acq acqVarA = acl.A(aggVar2, acqVar, adbVarK, buxVarC, (i10 >> 9) & 112);
                boolean zC2 = ((i10 & 458752) == 131072) | buxVarC.C(aggVar2);
                Object objS5 = bvvVar.S();
                if (zC2 || objS5 == buw.a) {
                    aiy aiyVar = new aiy(aggVar2, afegVar, 1);
                    lah lahVar = byj.a;
                    bvk bvkVar = new bvk(aiyVar, null);
                    bvvVar.ad(bvkVar);
                    objS5 = bvkVar;
                }
                bym bymVar = (bym) objS5;
                if (O(aggVar2) && ((Boolean) bymVar.a()).booleanValue()) {
                    buxVarC.v(249752715);
                    z5 = false;
                    bvvVar.Y(false);
                    cfyVar2 = cfyVar;
                    afehVar2 = afehVar;
                    caVar4 = caVar5;
                    buxVar2 = buxVarC;
                } else {
                    buxVarC.v(248315059);
                    Object objS6 = bvvVar.S();
                    if (i7 == 4 || objS6 == buw.a) {
                        objS6 = new abv(aggVar2);
                        bvvVar.ad(objS6);
                    }
                    abv abvVar = (abv) objS6;
                    ca caVar6 = caVar5;
                    cfy cfyVarM = acl.m(aggVar2, acpVarZ, acqVarA, adbVarK, "Built-in", buxVarC, 1575936, 8);
                    buxVar2 = buxVarC;
                    buxVar2.v(-130496193);
                    bvvVar.Y(false);
                    cfyVar2 = cfyVar;
                    cfy cfyVarA = cfyVar2.a(cfyVarM.a(cfy.e));
                    Object objS7 = bvvVar.S();
                    if (objS7 == buw.a) {
                        objS7 = new abn(abvVar);
                        bvvVar.ad(objS7);
                    }
                    abn abnVar = (abn) objS7;
                    long j2 = bvvVar.u;
                    long j3 = j2 ^ (j2 >>> 32);
                    ccx ccxVarAh = bvvVar.ah();
                    cfy cfyVarJ = bzi.j(buxVar2, cfyVarA);
                    afdr afdrVar = cwb.a;
                    buxVar2.w();
                    caVar4 = caVar6;
                    if (bvvVar.t) {
                        buxVar2.j(afdrVar);
                    } else {
                        buxVar2.y();
                    }
                    byq.c(buxVar2, abnVar, cwb.e);
                    byq.c(buxVar2, ccxVarAh, cwb.d);
                    byq.a(buxVar2, Integer.valueOf((int) j3), cwb.f);
                    buxVar2.i(afak.a, new alx(cwb.g, 16));
                    byq.c(buxVar2, cfyVarJ, cwb.c);
                    afehVar2 = afehVar;
                    afehVar2.invoke(abvVar, buxVar2, Integer.valueOf((i10 >> 24) & 112));
                    bvvVar.Y(true);
                    z5 = false;
                    bvvVar.Y(false);
                }
                bvvVar.Y(z5);
            } else {
                buxVarC.v(249758667);
                ((bvv) buxVarC).Y(false);
                z3 = z7;
                cfyVar2 = cfyVar;
                caVar4 = caVar5;
                buxVar2 = buxVarC;
            }
            z2 = z3;
            caVar3 = caVar4;
        } else {
            cfyVar2 = cfyVar;
            buxVar2 = buxVarC;
            buxVar2.s();
            z2 = z;
            caVar3 = caVar2;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new awz(aggVar, afecVar, cfyVar2, acpVar, acqVar, afegVar, caVar3, z2, afehVar2, i, i2, 1);
        }
    }

    public static float aj(kwp kwpVar, float f) {
        return ((aee) kwpVar.w().a(new aee(BitmapDescriptorFactory.HUE_RED), new aee(f))).a;
    }

    public static cfy ak(cfy cfyVar, afec afecVar) {
        return cfyVar.a(new avi(afecVar));
    }

    public static cfy al(cfy cfyVar, float f, float f2) {
        return cfyVar.a(new avg(f, f2));
    }

    public static cfy am(cfy cfyVar, int i) {
        return cfyVar.a(new auz(i));
    }

    public static cfy an(cfy cfyVar, int i) {
        return cfyVar.a(new avc(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void ao(defpackage.cfy r20, defpackage.asw r21, defpackage.atc r22, defpackage.cfr r23, int r24, int r25, final defpackage.afeh r26, defpackage.bux r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.ao(cfy, asw, atc, cfr, int, int, afeh, bux, int, int):void");
    }

    public static void ap(final cfy cfyVar, final asw aswVar, final atc atcVar, final cfr cfrVar, final int i, final int i2, final auq auqVar, final afeh afehVar, bux buxVar, final int i3) {
        int i4;
        int i5;
        int i6;
        char c;
        bvv bvvVar;
        boolean z;
        Object obj;
        int i7 = i3 & 6;
        bux buxVarC = buxVar.c(-1956591841);
        if (i7 == 0) {
            i4 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != buxVarC.C(aswVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != buxVarC.C(atcVar) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != buxVarC.C(cfrVar) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != buxVarC.A(i) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i4 |= true != buxVarC.A(i2) ? 65536 : 131072;
        }
        if ((1572864 & i3) == 0) {
            i4 |= true != buxVarC.C(auqVar) ? 524288 : 1048576;
        }
        if ((12582912 & i3) == 0) {
            i4 |= true != buxVarC.E(afehVar) ? 4194304 : 8388608;
        }
        int i8 = i4;
        if (buxVarC.I((i8 & 4793491) != 4793490, i8 & 1)) {
            int i9 = i8 & 3670016;
            bvv bvvVar2 = (bvv) buxVarC;
            Object objS = bvvVar2.S();
            if (i9 == 1048576 || objS == buw.a) {
                objS = new aun();
                bvvVar2.ad(objS);
            }
            int i10 = i8 >> 3;
            aun aunVar = (aun) objS;
            boolean zC = ((((i10 & 896) ^ 384) > 256 && buxVarC.C(cfrVar)) || (i10 & 384) == 256) | ((((i10 & 14) ^ 6) > 4 && buxVarC.C(aswVar)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && buxVarC.C(atcVar)) || (i10 & 48) == 32) | ((((i10 & 7168) ^ 3072) > 2048 && buxVarC.A(i)) || (i10 & 3072) == 2048) | ((((57344 & i10) ^ 24576) > 16384 && buxVarC.A(i2)) || (i10 & 24576) == 16384) | buxVarC.C(aunVar);
            Object objS2 = bvvVar2.S();
            if (zC || objS2 == buw.a) {
                i5 = i9;
                bvv bvvVar3 = bvvVar2;
                i6 = 8388608;
                c = ' ';
                aup aupVar = new aup(aswVar, atcVar, aswVar.a(), new aty(cfrVar), atcVar.a(), i, i2, aunVar);
                bvvVar3.ad(aupVar);
                objS2 = aupVar;
                bvvVar = bvvVar3;
            } else {
                i5 = i9;
                bvvVar = bvvVar2;
                i6 = 8388608;
                c = ' ';
            }
            boolean z2 = i5 == 1048576;
            boolean z3 = (i8 & 29360128) == i6;
            boolean z4 = (i8 & 458752) == 131072;
            aup aupVar2 = (aup) objS2;
            Object objS3 = bvvVar.S();
            if (((z3 | z2) || z4) || objS3 == buw.a) {
                ArrayList arrayList = new ArrayList();
                z = true;
                arrayList.add(new cct(-1192950673, true, new alx(afehVar, 2)));
                int[] iArr = aum.a;
                bvvVar.ad(arrayList);
                obj = arrayList;
            } else {
                z = true;
                obj = objS3;
            }
            cct cctVar = new cct(1271844412, z, new bly((List) obj, 9));
            boolean zC2 = buxVarC.C(aupVar2);
            Object objS4 = bvvVar.S();
            if (zC2 || objS4 == buw.a) {
                objS4 = new ctx(aupVar2);
                bvvVar.ad(objS4);
            }
            ctp ctpVar = (ctp) objS4;
            long j = bvvVar.u;
            long j2 = j ^ (j >>> c);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVar, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf((int) j2), cwb.f);
            buxVarC.i(afak.a, new alx(cwb.g, 16));
            byq.c(buxVarC, cfyVarJ, cwb.c);
            cctVar.invoke(buxVarC, 0);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: auj
                @Override // defpackage.afeg
                public final Object invoke(Object obj2, Object obj3) {
                    bux buxVar2 = (bux) obj2;
                    ((Integer) obj3).intValue();
                    cfy cfyVar2 = cfyVar;
                    asw aswVar2 = aswVar;
                    atc atcVar2 = atcVar;
                    cfr cfrVar2 = cfrVar;
                    int i11 = i3 | 1;
                    int i12 = 306783378 & i11;
                    int i13 = 613566756 & i11;
                    ca.ap(cfyVar2, aswVar2, atcVar2, cfrVar2, i, i2, auqVar, afehVar, buxVar2, (i11 & (-920350135)) | i12 | (i13 >> 1) | ((i12 + i12) & i13));
                    return afak.a;
                }
            };
        }
    }

    public static long aq(cto ctoVar, long j, afec afecVar) {
        avu avuVarC = asl.C(ctoVar);
        if ((avuVarC != null ? avuVarC.a : 0.0f) != BitmapDescriptorFactory.HUE_RED) {
            int iF = ctoVar.f(Alert.DURATION_SHOW_INDEFINITELY);
            return ze.c(iF, ctoVar.e(iF));
        }
        asl.C(ctoVar);
        cuo cuoVarV = ctoVar.v(j);
        afecVar.invoke(cuoVarV);
        return ze.c(cuoVarV.x(), cuoVarV.eC());
    }

    public static aug ar(boolean z, int i, long j, ze zeVar, int i2, int i3, int i4, boolean z2, boolean z3, int i5, aun aunVar, long j2, int i6, int i7, int i8) {
        boolean z4 = true;
        if (zeVar != null) {
            int i9 = aunVar.c;
            if (i2 < i6) {
                int iB = ze.b(j);
                long j3 = zeVar.a;
                if (iB - ze.b(j3) >= 0) {
                    if (i == 0 || (i < i5 && ze.a(j) - ze.a(j3) >= 0)) {
                        Math.max(i4, ze.b(j3));
                        z4 = false;
                    } else if (!z2) {
                        int iB2 = dle.b(j2);
                        int iB3 = (ze.b(j) - i8) - i4;
                        ze zeVar2 = new ze(ze.c(ze.a(j3) - i7, ze.b(j3)));
                        return new aug(true, ar(z, 0, ze.c(iB2, iB3), zeVar2, i2 + 1, i3 + i4, 0, true, false, i5, aunVar, j2, i6, i7, i8).b);
                    }
                }
            }
        }
        return new aug(z4, z4);
    }

    public static auf as(aug augVar, aun aunVar) {
        if (!augVar.b) {
            return null;
        }
        int i = aunVar.c;
        return null;
    }

    public static void at(cfy cfyVar, cfn cfnVar, afeh afehVar, bux buxVar, int i, int i2) {
        int i3;
        int i4 = i2 & 1;
        bux buxVarC = buxVar.c(380139498);
        int i5 = 2;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != buxVarC.C(cfnVar) ? 16 : 32;
        }
        int i7 = i3 | 384;
        if ((i & 3072) == 0) {
            i7 |= true != buxVarC.E(afehVar) ? 1024 : 2048;
        }
        if (buxVarC.I((i7 & 1171) != 1170, i7 & 1)) {
            if (i4 != 0) {
                cfyVar = cfy.e;
            }
            if (i6 != 0) {
                cfnVar = cfl.a;
            }
            ctp ctpVarB = atk.b(cfnVar, false);
            boolean zC = ((i7 & 7168) == 2048) | buxVarC.C(ctpVarB);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zC || objS == buw.a) {
                objS = new apn(ctpVarB, afehVar, i5, null);
                bvvVar.ad(objS);
            }
            cuy.a(cfyVar, (afeg) objS, buxVarC, i7 & 14, 0);
        } else {
            buxVarC.s();
        }
        cfn cfnVar2 = cfnVar;
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new azg(cfyVar, cfnVar2, afehVar, i, i2, 1);
        }
    }

    public static boolean au(long j, int i, int i2) {
        if (i > dle.b(j) || dle.d(j) > i) {
            return false;
        }
        return i2 <= dle.a(j) && dle.c(j) <= i2;
    }

    public static cfy av(cfy cfyVar, boolean z) {
        return cfyVar.a(new ate(z));
    }

    public static int aw(dlg dlgVar, float f) {
        if (Math.abs(f) < dlgVar.eA(400.0f)) {
            return 0;
        }
        return f > BitmapDescriptorFactory.HUE_RED ? 1 : 2;
    }

    public static int ax(axj axjVar) {
        return (int) (axjVar.n == api.a ? axjVar.d() & 4294967295L : axjVar.d() >> 32);
    }

    public static float ay(cql cqlVar, boolean z) {
        long jAz = az(cqlVar, z, new ajc(17));
        float fA = BitmapDescriptorFactory.HUE_RED;
        if (jAz == 9205357640488583168L) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        List list = cqlVar.a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            cqu cquVar = (cqu) list.get(i2);
            if (cquVar.d && cquVar.h) {
                fA += cja.a(aclh.y(z ? cquVar.c : cquVar.g, jAz));
                i++;
            }
        }
        return fA / i;
    }

    public static long az(cql cqlVar, boolean z, afec afecVar) {
        List list = cqlVar.a;
        int size = list.size();
        long jAi = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            cqu cquVar = (cqu) list.get(i2);
            if (((Boolean) afecVar.invoke(cquVar)).booleanValue()) {
                jAi = a.ai(jAi, z ? cquVar.c : cquVar.g);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return cja.b(jAi, i);
    }

    public static /* synthetic */ String b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static aku ba(bux buxVar) {
        buxVar.v(1257603829);
        aku akuVar = aku.a;
        buxVar.o();
        return akuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void bb(final defpackage.cmw r28, final java.lang.String r29, defpackage.cfy r30, defpackage.cfn r31, defpackage.csi r32, float r33, defpackage.cjw r34, defpackage.bux r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.bb(cmw, java.lang.String, cfy, cfn, csi, float, cjw, bux, int, int):void");
    }

    public static void bc(cjj cjjVar, cfy cfyVar, csi csiVar, bux buxVar, int i, int i2) {
        if ((i2 & 4) != 0) {
            cfyVar = cfy.e;
        }
        cfy cfyVar2 = cfyVar;
        cfn cfnVar = (i2 & 8) != 0 ? cfl.e : null;
        if ((i2 & 16) != 0) {
            csiVar = csh.b;
        }
        csi csiVar2 = csiVar;
        boolean zC = buxVar.C(cjjVar);
        Object objG = buxVar.g();
        if (zC || objG == buw.a) {
            objG = ckf.c(cjjVar, 1);
            buxVar.x(objG);
        }
        cmu cmuVar = (cmu) objG;
        bb(cmuVar, null, cfyVar2, cfnVar, csiVar2, 1.0f, null, buxVar, (i & 112) | 8 | (i & 896) | (i & 7168) | (i & 57344), 0);
    }

    public static void bd(cwd cwdVar, afec afecVar) {
        czz.o(cwdVar, ajy.b, new acm(afecVar, 9));
    }

    public static cfy be(cfy cfyVar) {
        return cfyVar.a(ajs.a);
    }

    public static cfy bf(cfy cfyVar, boolean z, asf asfVar) {
        return cfyVar.a(z ? new ajt(asfVar) : cfy.e);
    }

    public static float bg(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
            }
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public static void bh(EdgeEffect edgeEffect, int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    public static float bi(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT < 31) {
            edgeEffect.onPull(f, f2);
            return f;
        }
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    public static void bj(EdgeEffect edgeEffect, float f) {
        if (!(edgeEffect instanceof ajz)) {
            edgeEffect.onRelease();
            return;
        }
        ajz ajzVar = (ajz) edgeEffect;
        float f2 = ajzVar.b + f;
        ajzVar.b = f2;
        if (Math.abs(f2) > ajzVar.a) {
            ajzVar.onRelease();
        }
    }

    public static float bk(EdgeEffect edgeEffect, float f, float f2, dlg dlgVar) {
        float f3 = ajq.a;
        float fA = dlgVar.a() * 386.0878f;
        double d = ajq.a * fA * 160.0f * 0.84f;
        if (((float) (d * Math.exp((ajq.b / ajq.c) * Math.log((Math.abs(f) * 0.35f) / d)))) > bg(edgeEffect) * f2) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        bh(edgeEffect, afgi.k(f));
        return f;
    }

    public static boolean bl(bux buxVar) {
        return (((Configuration) buxVar.f(daa.a)).uiMode & 48) == 32;
    }

    public static cto bm(Iterator it, ca caVar) {
        try {
            if (!(it instanceof atv)) {
                return (cto) it.next();
            }
            caVar.getClass();
            throw null;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    private static int bn(int i, int i2, boolean z) {
        return z ? i : i - i2;
    }

    private static int bo(int i, int i2, boolean z) {
        if (z) {
            return 0;
        }
        return i2 - i;
    }

    private static boolean bp(int i, int i2, int i3, boolean z) {
        return z ? i2 <= i : i3 - i2 > i;
    }

    public static cq c(ViewGroup viewGroup, bt btVar) {
        viewGroup.getClass();
        ca caVarAp = btVar.ap();
        caVarAp.getClass();
        return d(viewGroup, caVarAp);
    }

    public static cq d(ViewGroup viewGroup, ca caVar) {
        caVar.getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof cq) {
            return (cq) tag;
        }
        cq cqVar = new cq(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, cqVar);
        return cqVar;
    }

    public static Drawable e(Context context, int i) {
        return mr.e().c(context, i);
    }

    public static void f(Configuration configuration, dwa dwaVar) {
        configuration.setLocales(LocaleList.forLanguageTags(dwaVar.d()));
    }

    public static /* synthetic */ String g(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static void h(int i, View view, ViewGroup viewGroup) {
        if (bt.ac(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int i2 = i - 1;
        if (i2 == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (bt.ac(2)) {
                    Log.v("FragmentManager", a.bt(viewGroup2, view, "SpecialEffectsController: Removing view ", " from container "));
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (bt.ac(2)) {
                    Log.v("FragmentManager", a.bm(view, "SpecialEffectsController: Setting view ", " to INVISIBLE"));
                }
                view.setVisibility(4);
                return;
            } else {
                if (bt.ac(2)) {
                    Log.v("FragmentManager", a.bm(view, "SpecialEffectsController: Setting view ", " to GONE"));
                }
                view.setVisibility(8);
                return;
            }
        }
        if (bt.ac(2)) {
            Log.v("FragmentManager", a.bm(view, "SpecialEffectsController: Setting view ", " to VISIBLE"));
        }
        ViewParent parent2 = view.getParent();
        if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
            if (bt.ac(2)) {
                Log.v("FragmentManager", a.bt(viewGroup, view, "SpecialEffectsController: Adding view ", " to Container "));
            }
            viewGroup.addView(view);
        }
        view.setVisibility(0);
    }

    public static int i(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        throw new IllegalArgumentException(a.bp(i, "Unknown visibility "));
    }

    public static int j(View view) {
        if (view.getAlpha() == BitmapDescriptorFactory.HUE_RED && view.getVisibility() == 0) {
            return 4;
        }
        return i(view.getVisibility());
    }

    public static /* synthetic */ os k(int i, int i2) {
        return new os(i, i2, (afec) new bmk(1));
    }

    public static boolean l(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static int m(ml mlVar, lq lqVar, View view, View view2, lz lzVar, boolean z) {
        if (lzVar.av() == 0 || mlVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(((ma) view.getLayoutParams()).fP() - ((ma) view2.getLayoutParams()).fP()) + 1;
        }
        return Math.min(lqVar.k(), lqVar.a(view2) - lqVar.d(view));
    }

    public static int n(ml mlVar, lq lqVar, View view, View view2, lz lzVar, boolean z, boolean z2) {
        if (lzVar.av() == 0 || mlVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (mlVar.a() - Math.max(((ma) view.getLayoutParams()).fP(), ((ma) view2.getLayoutParams()).fP())) - 1) : Math.max(0, Math.min(((ma) view.getLayoutParams()).fP(), ((ma) view2.getLayoutParams()).fP()));
        if (z) {
            return Math.round((iMax * (Math.abs(lqVar.a(view2) - lqVar.d(view)) / (Math.abs(((ma) view.getLayoutParams()).fP() - ((ma) view2.getLayoutParams()).fP()) + 1))) + (lqVar.j() - lqVar.d(view)));
        }
        return iMax;
    }

    public static int o(ml mlVar, lq lqVar, View view, View view2, lz lzVar, boolean z) {
        if (lzVar.av() == 0 || mlVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return mlVar.a();
        }
        return (int) (((lqVar.a(view2) - lqVar.d(view)) / (Math.abs(((ma) view.getLayoutParams()).fP() - ((ma) view2.getLayoutParams()).fP()) + 1)) * mlVar.a());
    }

    public static int y(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public static void z(Context context) throws Resources.NotFoundException {
        context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }

    public EdgeEffect r(RecyclerView recyclerView) {
        throw null;
    }

    public void t(int i, int i2, Object obj) {
        w();
    }

    public ca(char[] cArr) {
    }

    public void s() {
    }

    public void w() {
    }

    public void p(RecyclerView recyclerView, int i) {
    }

    public void u(int i, int i2) {
    }

    public void v(int i, int i2) {
    }

    public void x(int i, int i2) {
    }

    public void q(RecyclerView recyclerView, int i, int i2) {
    }
}
