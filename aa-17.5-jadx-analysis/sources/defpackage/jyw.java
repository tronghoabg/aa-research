package defpackage;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.apps.auto.components.apphost.signin.MaterialCarRestrictedEditText;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.Map;

/* loaded from: classes.dex */
public final class jyw {
    public static final void a(bux buxVar, int i) {
        bux buxVarC = buxVar.c(1016448282);
        if (buxVarC.I(i != 0, i & 1)) {
            boc.a(dao.b(R.drawable.gs_credit_card_vd_theme_24, buxVarC, 0), "default card icon", awd.i(cfy.e, 64.0f), kfn.i(buxVarC).s(), buxVarC, 440, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gug(i, 3);
        }
    }

    public static final void b(final gvy gvyVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-388880910);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(gvyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            vy.b(awd.r(cfy.e), null, null, null, afp.B(1.0f, czz.at(buxVarC).A), bxc.i(1330610686, true, new afeh() { // from class: jyv
                @Override // defpackage.afeh
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    afec afecVar;
                    afeg afegVar;
                    afeg afegVar2;
                    avy avyVar;
                    gvy gvyVar2;
                    bux buxVar2 = (bux) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((ats) obj).getClass();
                    int i4 = iIntValue & 17;
                    if (buxVar2.I(i4 != 16, iIntValue & 1)) {
                        float f = gjk.e.k;
                        cfm cfmVar = cfl.j;
                        asw aswVarH = atd.h(f, cfmVar);
                        cfr cfrVar = cfl.n;
                        cfv cfvVar = cfy.e;
                        cfy cfyVarH = asl.H(cfvVar, gjk.d.k);
                        ctp ctpVarA = avv.a(aswVarH, cfrVar, buxVar2, 48);
                        int iG = a.g(buxVar2.b());
                        ccx ccxVarN = buxVar2.N();
                        cfy cfyVarJ = bzi.j(buxVar2, cfyVarH);
                        afdr afdrVar = cwb.a;
                        buxVar2.M();
                        buxVar2.w();
                        if (buxVar2.G()) {
                            buxVar2.j(afdrVar);
                        } else {
                            buxVar2.y();
                        }
                        gvy gvyVar3 = gvyVar;
                        afeg afegVar3 = cwb.e;
                        byq.c(buxVar2, ctpVarA, afegVar3);
                        afeg afegVar4 = cwb.d;
                        byq.c(buxVar2, ccxVarN, afegVar4);
                        Integer numValueOf = Integer.valueOf(iG);
                        afeg afegVar5 = cwb.f;
                        byq.c(buxVar2, numValueOf, afegVar5);
                        afec afecVar2 = cwb.g;
                        byq.b(buxVar2, afecVar2);
                        afeg afegVar6 = cwb.c;
                        byq.c(buxVar2, cfyVarJ, afegVar6);
                        avy avyVar2 = avy.a;
                        float fEA = ((dlg) buxVar2.f(dbc.d)).eA(64.0f);
                        buxVar2.v(-252945570);
                        cmw cmwVarA = gvyVar3.c.a((int) fEA, buxVar2, 64);
                        buxVar2.o();
                        if (cmwVarA == null) {
                            buxVar2.v(748685381);
                            jyw.a(buxVar2, 0);
                            buxVar2.o();
                            afecVar = afecVar2;
                            avyVar = avyVar2;
                            afegVar = afegVar5;
                            afegVar2 = afegVar6;
                        } else {
                            buxVar2.v(748740561);
                            afecVar = afecVar2;
                            afegVar = afegVar5;
                            afegVar2 = afegVar6;
                            avyVar = avyVar2;
                            boc.a(cmwVarA, null, cjn.g(awd.i(cfvVar, 64.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bcr.a, true, 0, 1042431), cjn.n(), buxVar2, 3128, 0);
                            buxVar2.o();
                        }
                        cfy cfyVarB = avyVar.b(cfvVar, 1.0f, true);
                        ctp ctpVarA2 = atp.a(atd.c, cfmVar, buxVar2, 0);
                        int iG2 = a.g(buxVar2.b());
                        ccx ccxVarN2 = buxVar2.N();
                        cfy cfyVarJ2 = bzi.j(buxVar2, cfyVarB);
                        buxVar2.M();
                        buxVar2.w();
                        if (buxVar2.G()) {
                            buxVar2.j(afdrVar);
                        } else {
                            buxVar2.y();
                        }
                        byq.c(buxVar2, ctpVarA2, afegVar3);
                        byq.c(buxVar2, ccxVarN2, afegVar4);
                        byq.c(buxVar2, Integer.valueOf(iG2), afegVar);
                        byq.b(buxVar2, afecVar);
                        byq.c(buxVar2, cfyVarJ2, afegVar2);
                        gez gezVarV = fwl.v(null, null, null, false, gvyVar3.a, buxVar2, 262144, 31);
                        deu deuVar = gezVarV.a;
                        if (deuVar == null) {
                            buxVar2.v(-1889661547);
                            buxVar2.o();
                            gvyVar2 = gvyVar3;
                        } else {
                            buxVar2.v(-1889661546);
                            gvyVar2 = gvyVar3;
                            brp.c(deuVar, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, gezVarV.b, null, czz.av(buxVar2).j, buxVar2, 0, 24960, 176126);
                            buxVar2 = buxVar2;
                            buxVar2.o();
                        }
                        gez gezVarV2 = fwl.v(null, null, null, false, gvyVar2.b, buxVar2, 262144, 31);
                        deu deuVar2 = gezVarV2.a;
                        if (deuVar2 == null) {
                            buxVar2.v(-1889272590);
                            buxVar2.o();
                        } else {
                            buxVar2.v(-1889272589);
                            bux buxVar3 = buxVar2;
                            brp.c(deuVar2, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, gezVarV2.b, null, czz.av(buxVar2).l, buxVar3, 0, 24960, 176126);
                            buxVar2 = buxVar3;
                            buxVar2.o();
                        }
                        buxVar2.n();
                        czz.am(fwg.a.b(fwf.c), bxc.i(104595290, true, new juy(gvyVar2, 4), buxVar2), buxVar2, 56);
                        buxVar2.n();
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, 196614);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new jtt(gvyVar, cfyVar, i, 20);
        }
    }

    public static final MaterialCarRestrictedEditText c(bwq bwqVar) {
        return (MaterialCarRestrictedEditText) bwqVar.a();
    }

    public static final void d(final int i, final deu deuVar, final afec afecVar, final afec afecVar2, final afec afecVar3, final cfy cfyVar, ckv ckvVar, long j, dfw dfwVar, long j2, afec afecVar4, bux buxVar, final int i2, final int i3) {
        int i4;
        bux buxVar2;
        final ckv ckvVar2;
        final long j3;
        final dfw dfwVar2;
        final long j4;
        final afec afecVar5;
        ckv ckvVarC;
        long j5;
        long j6;
        afec afecVar6;
        dfw dfwVar3;
        afecVar.getClass();
        afecVar2.getClass();
        afecVar3.getClass();
        int i5 = i2 & 6;
        bux buxVarC = buxVar.c(1527458955);
        if (i5 == 0) {
            i4 = (true != buxVarC.A(i) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != buxVarC.C(deuVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != buxVarC.E(afecVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != buxVarC.E(afecVar2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != buxVarC.E(afecVar3) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != buxVarC.C(cfyVar) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i4 |= 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= 33554432;
        }
        if ((805306368 & i2) == 0) {
            i4 |= 268435456;
        }
        int i6 = i3 | 6;
        if (buxVarC.I(((306783379 & i4) == 306783378 && (i6 & 3) == 2) ? false : true, i4 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i2 & 1) == 0 || buxVarC.F()) {
                float f = gjk.b.k;
                ckvVarC = bcr.c(f, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                j5 = czz.at(buxVarC).r;
                dfw dfwVar4 = czz.av(buxVarC).j;
                j6 = czz.at(buxVarC).s;
                Object objS = bvvVar.S();
                if (objS == buw.a) {
                    objS = new jxa(6);
                    bvvVar.ad(objS);
                }
                afecVar6 = (afec) objS;
                dfwVar3 = dfwVar4;
            } else {
                buxVarC.s();
                ckvVarC = ckvVar;
                j5 = j;
                dfwVar3 = dfwVar;
                j6 = j2;
                afecVar6 = afecVar4;
            }
            buxVarC.l();
            final affv affvVar = new affv();
            dfw dfwVar5 = dfwVar3;
            Object objS2 = bvvVar.S();
            Object obj = buw.a;
            if (objS2 == obj) {
                objS2 = new grl(20);
                bvvVar.ad(objS2);
            }
            affvVar.a = objS2;
            wci wciVar = (wci) buxVarC.f(dbc.f);
            dhs dhsVarK = dfwVar5.k();
            die dieVarN = dfwVar5.n();
            if (dieVarN == null) {
                dieVarN = die.k;
            }
            dhx dhxVarL = dfwVar5.l();
            Object objA = dao.n(wciVar, dhsVarK, dieVarN, dhxVarL != null ? dhxVarL.a : 0, 0, 8).a();
            objA.getClass();
            final Typeface typeface = (Typeface) objA;
            bym bymVarC = byx.c(afecVar2, buxVarC);
            Object objS3 = bvvVar.S();
            if (objS3 == obj) {
                objS3 = new jzh(bymVarC, 0);
                bvvVar.ad(objS3);
            }
            ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = (ViewTreeObserver.OnWindowFocusChangeListener) objS3;
            Object objS4 = bvvVar.S();
            if (objS4 == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(null, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS4 = parcelableSnapshotMutableState;
            }
            final bwq bwqVar = (bwq) objS4;
            MaterialCarRestrictedEditText materialCarRestrictedEditTextC = c(bwqVar);
            boolean zE = buxVarC.E(onWindowFocusChangeListener);
            Object objS5 = bvvVar.S();
            if (zE || objS5 == obj) {
                objS5 = new jzi(onWindowFocusChangeListener, bwqVar, 0);
                bvvVar.ad(objS5);
            }
            bvq.c(materialCarRestrictedEditTextC, (afec) objS5, buxVarC);
            buxVar2 = buxVarC;
            final long j7 = j6;
            jur.f(afecVar6, asl.I(afp.x(kvc.a(afp.E(cfyVar, j5, ckvVarC), ckvVarC, 0L, 0L, null, null, null, false, false, buxVarC, 0, 254), true, null, null, new jtw(affvVar, 13)), gjk.e.k, BitmapDescriptorFactory.HUE_RED), new afec() { // from class: jzj
                @Override // defpackage.afec
                public final Object invoke(Object obj2) {
                    final MaterialCarRestrictedEditText materialCarRestrictedEditText = (MaterialCarRestrictedEditText) obj2;
                    materialCarRestrictedEditText.getClass();
                    bwqVar.b(materialCarRestrictedEditText);
                    materialCarRestrictedEditText.setInputType(i);
                    materialCarRestrictedEditText.setTypeface(typeface);
                    byte[] bArr = null;
                    materialCarRestrictedEditText.setBackgroundDrawable(null);
                    deu deuVar2 = deuVar;
                    if (!TextUtils.isEmpty(deuVar2)) {
                        materialCarRestrictedEditText.setHint(deuVar2);
                    }
                    final afec afecVar7 = afecVar3;
                    afec afecVar8 = afecVar;
                    affv affvVar2 = affvVar;
                    long j8 = j7;
                    materialCarRestrictedEditText.setHintTextColor(cjn.h(j8));
                    materialCarRestrictedEditText.setTextColor(cjn.h(j8));
                    affvVar2.a = new hgl(afecVar8, materialCarRestrictedEditText, 17, bArr);
                    materialCarRestrictedEditText.setFocusable(false);
                    materialCarRestrictedEditText.setOnClickListener(new ie(affvVar2, 11, null));
                    materialCarRestrictedEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: jzl
                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
                            return ((Boolean) afecVar7.invoke(afyh.k(String.valueOf(materialCarRestrictedEditText.getText())).toString())).booleanValue();
                        }
                    });
                    return afak.a;
                }
            }, buxVar2, i6 & 14);
            dfwVar2 = dfwVar5;
            afecVar5 = afecVar6;
            ckvVar2 = ckvVarC;
            j3 = j5;
            j4 = j7;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            ckvVar2 = ckvVar;
            j3 = j;
            dfwVar2 = dfwVar;
            j4 = j2;
            afecVar5 = afecVar4;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: jzk
                @Override // defpackage.afeg
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int i7 = i;
                    deu deuVar2 = deuVar;
                    afec afecVar7 = afecVar;
                    afec afecVar8 = afecVar2;
                    afec afecVar9 = afecVar3;
                    cfy cfyVar2 = cfyVar;
                    ckv ckvVar3 = ckvVar2;
                    int i8 = i2;
                    long j8 = j3;
                    int i9 = i3;
                    int i10 = i8 | 1;
                    int i11 = i9 & 306783378;
                    int i12 = 306783378 & i10;
                    int i13 = i12 + i12;
                    long j9 = j4;
                    int i14 = i9 & 613566756;
                    int i15 = i10 & 613566756;
                    afec afecVar10 = afecVar5;
                    jyw.d(i7, deuVar2, afecVar7, afecVar8, afecVar9, cfyVar2, ckvVar3, j8, dfwVar2, j9, afecVar10, (bux) obj2, (i10 & (-920350135)) | i12 | (i15 >> 1) | (i13 & i15), (i9 & (-920350135)) | i11 | (i14 >> 1) | ((i11 + i11) & i14));
                    return afak.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final defpackage.cmw r30, final defpackage.deu r31, final long r32, final defpackage.afdr r34, final defpackage.afdr r35, defpackage.cfy r36, long r37, defpackage.ksy r39, defpackage.ckv r40, defpackage.ktf r41, defpackage.ktf r42, java.util.Map r43, defpackage.bux r44, final int r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jyw.e(cmw, deu, long, afdr, afdr, cfy, long, ksy, ckv, ktf, ktf, java.util.Map, bux, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final defpackage.cmw r26, final long r27, final defpackage.afdr r29, final defpackage.afdr r30, defpackage.cfy r31, long r32, defpackage.ksy r34, defpackage.ckv r35, defpackage.ktf r36, defpackage.ktf r37, defpackage.bux r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jyw.f(cmw, long, afdr, afdr, cfy, long, ksy, ckv, ktf, ktf, bux, int, int):void");
    }

    public static final void g(final cmw cmwVar, final deu deuVar, final float f, final cfy cfyVar, final ckv ckvVar, final ksy ksyVar, final ktf ktfVar, final ktf ktfVar2, final Map map, final afdr afdrVar, bux buxVar, final int i) {
        int i2;
        afdr afdrVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(809289969);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(cmwVar) : buxVarC.E(cmwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(deuVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.z(f) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.C(ckvVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != ((262144 & i) == 0 ? buxVarC.C(ksyVar) : buxVarC.E(ksyVar)) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.C(ktfVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != buxVarC.C(ktfVar2) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != ((134217728 & i) == 0 ? buxVarC.C(map) : buxVarC.E(map)) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            afdrVar2 = afdrVar;
            i2 |= true != buxVarC.E(afdrVar2) ? 268435456 : 536870912;
        } else {
            afdrVar2 = afdrVar;
        }
        if (buxVarC.I((306783379 & i2) != 306783378, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new asg();
                bvvVar.ad(objS);
            }
            final asf asfVar = (asf) objS;
            bvf bvfVar = bpe.b;
            ktfVar.getClass();
            final afdr afdrVar3 = afdrVar2;
            czz.am(bvfVar.b(khc.e(ktfVar.h)), bxc.i(14892081, true, new afeg() { // from class: kud
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i4 = iIntValue & 3;
                    int i5 = 2;
                    if (buxVar2.I(i4 != 2, iIntValue & 1)) {
                        asf asfVar2 = asfVar;
                        ckv ckvVar2 = ckvVar;
                        ktf ktfVar3 = ktfVar;
                        ksy ksyVar2 = ksyVar;
                        cfy cfyVar2 = cfyVar;
                        float f2 = ksyVar2.h;
                        cfy cfyVarA = kvc.a(awd.n(awd.d(cfyVar2, f2), f2, Float.NaN), ckvVar2, ktfVar3.j, ktfVar3.k, ksyVar2.o, ksyVar2.p, asfVar2, false, false, buxVar2, 1572864, 192);
                        Object objG = buxVar2.g();
                        if (objG == buw.a) {
                            objG = new kmn(i5);
                            buxVar2.x(objG);
                        }
                        Map map2 = map;
                        cmw cmwVar2 = cmwVar;
                        deu deuVar2 = deuVar;
                        ktf ktfVar4 = ktfVar2;
                        bqp.c(afdrVar3, dds.a(cfyVarA, false, (afec) objG), false, ckvVar2, 0L, 0L, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, asfVar2, bxc.i(365261766, true, new kuc(ktfVar, f, ktfVar4, ksyVar2, deuVar2, cmwVar2, map2, 0), buxVar2), buxVar2, 500);
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, 56);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: kue
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cmw cmwVar2 = cmwVar;
                    deu deuVar2 = deuVar;
                    float f2 = f;
                    cfy cfyVar2 = cfyVar;
                    ckv ckvVar2 = ckvVar;
                    ksy ksyVar2 = ksyVar;
                    int i4 = i;
                    int i5 = i4 | 1;
                    int i6 = 306783378 & i5;
                    Map map2 = map;
                    int i7 = 613566756 & i5;
                    afdr afdrVar4 = afdrVar;
                    int i8 = (i5 & (-920350135)) | i6 | (i7 >> 1);
                    jyw.g(cmwVar2, deuVar2, f2, cfyVar2, ckvVar2, ksyVar2, ktfVar, ktfVar2, map2, afdrVar4, (bux) obj, ((i6 + i6) & i7) | i8);
                    return afak.a;
                }
            };
        }
    }

    public static final void h(final ksy ksyVar, final deu deuVar, final cmw cmwVar, final Map map, final ckv ckvVar, ktf ktfVar, bux buxVar) {
        bvf bvfVar = brp.a;
        bxe[] bxeVarArr = {bnm.a.b(new cjv(ktfVar.h)), bvfVar.b(((dfw) buxVar.f(bvfVar)).j(czz.av(buxVar).m))};
        final long j = ktfVar.g;
        czz.an(bxeVarArr, bxc.i(-620271998, true, new afeg() { // from class: ktz
            @Override // defpackage.afeg
            public final Object invoke(Object obj, Object obj2) {
                bux buxVar2 = (bux) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = iIntValue & 3;
                if (buxVar2.I(i != 2, iIntValue & 1)) {
                    long j2 = j;
                    ckv ckvVar2 = ckvVar;
                    cfn cfnVar = cfl.e;
                    cfv cfvVar = cfy.e;
                    cfy cfyVarA = cjn.g(cfvVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ckvVar2, true, 0, 1042431).a(new aix(j2, ckq.a));
                    ctp ctpVarB = atk.b(cfnVar, false);
                    int iG = a.g(buxVar2.b());
                    ccx ccxVarN = buxVar2.N();
                    cfy cfyVarJ = bzi.j(buxVar2, cfyVarA);
                    afdr afdrVar = cwb.a;
                    buxVar2.M();
                    buxVar2.w();
                    if (buxVar2.G()) {
                        buxVar2.j(afdrVar);
                    } else {
                        buxVar2.y();
                    }
                    deu deuVar2 = deuVar;
                    ksy ksyVar2 = ksyVar;
                    afeg afegVar = cwb.e;
                    byq.c(buxVar2, ctpVarB, afegVar);
                    afeg afegVar2 = cwb.d;
                    byq.c(buxVar2, ccxVarN, afegVar2);
                    Integer numValueOf = Integer.valueOf(iG);
                    afeg afegVar3 = cwb.f;
                    byq.c(buxVar2, numValueOf, afegVar3);
                    afec afecVar = cwb.g;
                    byq.b(buxVar2, afecVar);
                    afeg afegVar4 = cwb.c;
                    byq.c(buxVar2, cfyVarJ, afegVar4);
                    float f = ksyVar2.h;
                    cfy cfyVarN = awd.n(awd.d(cfvVar, f), f, Float.NaN);
                    int iA = deuVar2 != null ? deuVar2.a() : 0;
                    cmw cmwVar2 = cmwVar;
                    cfy cfyVarG = asl.G(cfyVarN, khc.d(ksyVar2, iA, cmwVar2 != null));
                    ctp ctpVarA = avv.a(atd.e, cfl.n, buxVar2, 54);
                    int iG2 = a.g(buxVar2.b());
                    ccx ccxVarN2 = buxVar2.N();
                    cfy cfyVarJ2 = bzi.j(buxVar2, cfyVarG);
                    buxVar2.M();
                    buxVar2.w();
                    if (buxVar2.G()) {
                        buxVar2.j(afdrVar);
                    } else {
                        buxVar2.y();
                    }
                    Map map2 = map;
                    byq.c(buxVar2, ctpVarA, afegVar);
                    byq.c(buxVar2, ccxVarN2, afegVar2);
                    byq.c(buxVar2, Integer.valueOf(iG2), afegVar3);
                    byq.b(buxVar2, afecVar);
                    byq.c(buxVar2, cfyVarJ2, afegVar4);
                    khc.f(cmwVar2, deuVar2, ksyVar2, map2, buxVar2, 8, 0);
                    buxVar2.n();
                    buxVar2.n();
                } else {
                    buxVar2.s();
                }
                return afak.a;
            }
        }, buxVar), buxVar, 48);
    }

    public static final void i(final deu deuVar, final long j, final afdr afdrVar, final afdr afdrVar2, final cfy cfyVar, final long j2, final ksy ksyVar, final cmw cmwVar, ckv ckvVar, ktf ktfVar, final ktf ktfVar2, final Map map, bux buxVar, final int i, final int i2) {
        int i3;
        afdr afdrVar3;
        cfy cfyVar2;
        int i4;
        bux buxVar2;
        final ckv ckvVar2;
        final ktf ktfVar3;
        ckv ckvVarD;
        ktf ktfVarJ;
        int i5 = i & 6;
        bux buxVarC = buxVar.c(1289662568);
        if (i5 == 0) {
            i3 = (true != buxVarC.C(deuVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.B(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            afdrVar3 = afdrVar;
            i3 |= true != buxVarC.E(afdrVar3) ? 128 : 256;
        } else {
            afdrVar3 = afdrVar;
        }
        if ((i & 3072) == 0) {
            i3 |= true != buxVarC.E(afdrVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            cfyVar2 = cfyVar;
            i3 |= true != buxVarC.C(cfyVar2) ? 8192 : 16384;
        } else {
            cfyVar2 = cfyVar;
        }
        if ((196608 & i) == 0) {
            i3 |= true != buxVarC.B(j2) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != ((2097152 & i) == 0 ? buxVarC.C(ksyVar) : buxVarC.E(ksyVar)) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != ((16777216 & i) == 0 ? buxVarC.C(cmwVar) : buxVarC.E(cmwVar)) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != buxVarC.C(ktfVar2) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != ((i2 & 64) == 0 ? buxVarC.C(map) : buxVarC.E(map)) ? 16 : 32;
        }
        int i6 = i4;
        if (buxVarC.I(((i3 & 306783379) == 306783378 && (i6 & 19) == 18) ? false : true, i3 & 1)) {
            int i7 = i3 >> 21;
            int i8 = (-2113929217) & i3;
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                avp avpVar = bmo.a;
                ckvVarD = bmo.d(buxVarC);
                aezr aezrVar = ktf.a;
                buxVar2 = buxVarC;
                ktfVarJ = kgq.j(0L, 0L, 0L, 0L, buxVar2, 255);
            } else {
                buxVarC.s();
                ckvVarD = ckvVar;
                ktfVarJ = ktfVar;
                buxVar2 = buxVarC;
            }
            buxVar2.l();
            int i9 = i8 << 3;
            ckv ckvVar3 = ckvVarD;
            e(cmwVar, deuVar, j, afdrVar3, afdrVar2, cfyVar2, ((aisq) afpt.k(new aisq(j2), new aisq(0L), new aisq(j))).c, ksyVar, ckvVar3, ktfVarJ, ktfVar2, map, buxVar2, (i7 & 14) | 8 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (i9 & 29360128), i6 & 126, 0);
            ktfVar3 = ktfVarJ;
            ckvVar2 = ckvVar3;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            ckvVar2 = ckvVar;
            ktfVar3 = ktfVar;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: kub
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    deu deuVar2 = deuVar;
                    long j3 = j;
                    afdr afdrVar4 = afdrVar;
                    afdr afdrVar5 = afdrVar2;
                    cfy cfyVar3 = cfyVar;
                    long j4 = j2;
                    ksy ksyVar2 = ksyVar;
                    cmw cmwVar2 = cmwVar;
                    int i10 = i;
                    ckv ckvVar4 = ckvVar2;
                    int i11 = i2;
                    int i12 = i10 | 1;
                    int i13 = i11 & 306783378;
                    int i14 = i12 & 306783378;
                    ktf ktfVar4 = ktfVar2;
                    int i15 = i11 & 613566756;
                    int i16 = i12 & 613566756;
                    Map map2 = map;
                    jyw.i(deuVar2, j3, afdrVar4, afdrVar5, cfyVar3, j4, ksyVar2, cmwVar2, ckvVar4, ktfVar3, ktfVar4, map2, (bux) obj, (i12 & (-920350135)) | i14 | (i16 >> 1) | ((i14 + i14) & i16), (i11 & (-920350135)) | i13 | (i15 >> 1) | ((i13 + i13) & i15));
                    return afak.a;
                }
            };
        }
    }

    public static final kts j(bux buxVar) {
        long jA = ktw.a(m().a, buxVar);
        long jA2 = ktw.a(m().b, buxVar);
        ktt kttVar = m().c;
        long jA3 = ktt.a(buxVar);
        long j = m().d;
        ktv.a(buxVar);
        long jA4 = ktw.a(m().e, buxVar);
        long jA5 = m().f.a(buxVar);
        long jA6 = m().g.a(buxVar);
        long jA7 = ktw.a(m().h, buxVar);
        long jA8 = ktw.a(m().i, buxVar);
        return new kts(jA, jA2, jA2, jA3, j, jA4, jA5, jA6, jA7, jA8, jA7, jA8, ktw.a(m().j, buxVar), jA6, jA8);
    }

    public static final kts k(long j, long j2, long j3, long j4, bux buxVar, int i) {
        long j5;
        long jA;
        long j6;
        long j7;
        long j8;
        if ((i & 1) != 0) {
            long j9 = o().a;
            ktv.a(buxVar);
            j5 = j9;
        } else {
            j5 = j;
        }
        long jA2 = (i & 2) != 0 ? ktw.a(o().b, buxVar) : 0L;
        long j10 = (i & 4) != 0 ? jA2 : 0L;
        if ((i & 8) != 0) {
            ktt kttVar = o().c;
            jA = ktt.a(buxVar);
        } else {
            jA = 0;
        }
        if ((i & 16) != 0) {
            j6 = o().d;
            ktv.a(buxVar);
        } else {
            j6 = 0;
        }
        long jA3 = (i & 32) != 0 ? ktw.a(o().e, buxVar) : 0L;
        if ((i & 64) != 0) {
            long j11 = o().f;
            ktv.a(buxVar);
            j7 = j11;
        } else {
            j7 = 0;
        }
        long jA4 = (i & 128) != 0 ? o().g.a(buxVar) : 0L;
        if ((i & 256) != 0) {
            long j12 = o().h;
            ktv.a(buxVar);
            j8 = j12;
        } else {
            j8 = j2;
        }
        long jA5 = (i & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? ktw.a(o().i, buxVar) : j3;
        return new kts(j5, jA2, j10, jA, j6, jA3, j7, jA4, j8, jA5, (i & 1024) != 0 ? jA : 0L, (i & 2048) != 0 ? j6 : j4, ktw.a(o().j, buxVar), jA4, jA5);
    }

    public static final kts l(long j, bux buxVar, int i) {
        long j2;
        long jA;
        long j3;
        long j4;
        long j5 = 0;
        if ((i & 1) != 0) {
            long j6 = n().a;
            ktv.a(buxVar);
            j2 = j6;
        } else {
            j2 = 0;
        }
        long jA2 = (i & 2) != 0 ? ktw.a(n().b, buxVar) : 0L;
        long j7 = (i & 4) != 0 ? jA2 : 0L;
        if ((i & 8) != 0) {
            ktt kttVar = n().c;
            jA = ktt.a(buxVar);
        } else {
            jA = 0;
        }
        if ((i & 16) != 0) {
            long j8 = n().d;
            ktv.a(buxVar);
            j3 = j8;
        } else {
            j3 = 0;
        }
        long jA3 = (i & 32) != 0 ? ktw.a(n().e, buxVar) : 0L;
        if ((i & 64) != 0) {
            long j9 = n().f;
            ktv.a(buxVar);
            j4 = j9;
        } else {
            j4 = 0;
        }
        long jA4 = (i & 128) != 0 ? n().g.a(buxVar) : 0L;
        if ((i & 256) != 0) {
            j5 = n().h;
            ktv.a(buxVar);
        }
        long j10 = j5;
        long jA5 = (i & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? ktw.a(n().i, buxVar) : j;
        long jA6 = ktw.a(krr.o, buxVar);
        long jA7 = ktw.a(n().j, buxVar);
        return new kts(j2, jA2, j7, jA, j3, jA3, j4, jA4, j10, jA5, jA, jA6, jA7, jA4, jA7);
    }

    private static final ktq m() {
        return (ktq) kts.c.a();
    }

    private static final ktr n() {
        return (ktr) kts.b.a();
    }

    private static final ktr o() {
        return (ktr) kts.a.a();
    }
}
