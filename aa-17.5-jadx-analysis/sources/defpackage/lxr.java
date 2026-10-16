package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.Objects;
import java.util.Map;

/* loaded from: classes.dex */
public class lxr {
    public lxr() {
    }

    public static /* synthetic */ afak A(bwq bwqVar, cis cisVar) {
        cisVar.getClass();
        if (cisVar.b()) {
            bwqVar.b(nmr.b);
        }
        return afak.a;
    }

    public static void B(String str, boolean z, boolean z2, kts ktsVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1405555901);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(str) ? 2 : 4) | i;
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
            i2 |= true != buxVarC.C(ktsVar) ? 1024 : 2048;
        }
        int i4 = 0;
        if (buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            lws.w(str, null, null, null, bxc.i(-12027117, true, new nlu(ktsVar, z2, z, i4), buxVarC), buxVarC, (i2 & 14) | 24576, 14);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bqt(str, z, z2, ktsVar, i, 4);
        }
    }

    public static void C(afeh afehVar, afeh afehVar2, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1518294106);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(afehVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afehVar2) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            asx asxVar = atd.e;
            cfm cfmVar = cfl.k;
            cfv cfvVar = cfy.e;
            ctp ctpVarA = atp.a(asxVar, cfmVar, buxVarC, 54);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfvVar);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            ats atsVar = ats.a;
            afehVar.invoke(atsVar, buxVarC, Integer.valueOf(((i2 << 3) & 112) | 6));
            afehVar2.invoke(atsVar, buxVarC, Integer.valueOf((i2 & 112) | 6));
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nad(afehVar, afehVar2, i, 19, null);
        }
    }

    public static void D(cmw cmwVar, float f, afeh afehVar, bux buxVar, int i, int i2) {
        int i3;
        afehVar.getClass();
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-1652372735);
        if (i4 == 0) {
            i3 = (true != ((i & 8) == 0 ? buxVarC.C(cmwVar) : buxVarC.E(cmwVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i5 = 16;
            if ((i2 & 2) == 0 && buxVarC.z(f)) {
                i5 = 32;
            }
            i3 |= i5;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.E(afehVar) ? 128 : 256;
        }
        if (buxVarC.I((i3 & 147) != 146, i3 & 1)) {
            int i6 = i2 & 2;
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
                if (i6 != 0) {
                    i3 &= -113;
                }
            } else if (i6 != 0) {
                i3 &= -113;
                ksy ksyVar = nly.a;
                f = 32.0f;
            }
            buxVarC.l();
            C(bxc.i(-391747018, true, new hco(f, cmwVar, 3), buxVarC), afehVar, buxVarC, ((i3 >> 3) & 112) | 6);
        } else {
            buxVarC.s();
        }
        float f2 = f;
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new fzb(cmwVar, f2, afehVar, i, i2, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void E(java.lang.String r25, java.lang.String r26, boolean r27, defpackage.afec r28, defpackage.cfy r29, boolean r30, defpackage.kts r31, defpackage.bux r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxr.E(java.lang.String, java.lang.String, boolean, afec, cfy, boolean, kts, bux, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void F(final defpackage.cmw r27, float r28, java.lang.String r29, final boolean r30, final defpackage.afec r31, defpackage.cfy r32, boolean r33, defpackage.kts r34, defpackage.bux r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxr.F(cmw, float, java.lang.String, boolean, afec, cfy, boolean, kts, bux, int, int):void");
    }

    public static /* synthetic */ afak G(String str, boolean z, boolean z2, kts ktsVar, ats atsVar, bux buxVar, int i) {
        atsVar.getClass();
        if (buxVar.I((i & 17) != 16, i & 1)) {
            B(str, z, z2, ktsVar, buxVar, 0);
        } else {
            buxVar.s();
        }
        return afak.a;
    }

    public static qaa H(pzy pzyVar, abwo abwoVar, abnp abnpVar) {
        qaa qaaVar = new qaa(abwoVar, (ywb) abnpVar.q(), pzyVar.a());
        if (!qaaVar.b()) {
            ((ynz) qaa.a.a(uys.a).ai((char) 6971)).u("Attempted to build invalid UE3 params, see http://go/gmm-logging-errors#general-validity");
        }
        return qaaVar;
    }

    public static void I(zbe zbeVar, abnp abnpVar) {
        abnpVar.t();
        ywb ywbVar = (ywb) abnpVar.b;
        ywb ywbVar2 = ywb.a;
        zbeVar.getClass();
        ywbVar.c = zbeVar;
        ywbVar.b |= 8;
    }

    public static String K(pzl pzlVar) {
        return pzlVar.b().toString();
    }

    public static String L(Context context) {
        long longVersionCode;
        try {
            longVersionCode = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode();
        } catch (PackageManager.NameNotFoundException e) {
            ((ynz) ((ynz) ((ynz) pzm.a.g()).p(e)).ai((char) 6958)).y("Error trying to get versionCode from PackageManager for package: '%s'", context.getPackageName());
            longVersionCode = 0;
        }
        Long lValueOf = Long.valueOf(longVersionCode);
        lValueOf.getClass();
        return longVersionCode == 0 ? CloudRecognizerProtocolStrings.CLIENT_SOURCE_VALUE : lValueOf.toString();
    }

    private static long c(bwq bwqVar) {
        return ((dlq) bwqVar.a()).a;
    }

    private static long d(bwq bwqVar) {
        return ((dlq) bwqVar.a()).a;
    }

    public static lxr e() {
        return (lxr) mki.a.b(lxr.class, new lpu(15));
    }

    public static void f(yzz yzzVar, yzy yzyVar, ComponentName componentName) {
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzzVar, yzyVar);
        if (componentName != null) {
            rrbVarH.p(componentName);
            rrbVarH.g(componentName.getPackageName());
        }
        ohu.a().b((rrc) rrbVarH.l());
    }

    public static void g(yzz yzzVar, yzy yzyVar, ComponentName componentName) {
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzzVar, yzyVar);
        if (componentName != null) {
            rrbVarH.p(componentName);
            rrbVarH.g(componentName.getPackageName());
        }
        ebf.j().F(rrbVarH.l());
    }

    public static void h(yzz yzzVar, yzy yzyVar, String str) {
        f(yzzVar, yzyVar, str != null ? new ComponentName(str, "") : null);
    }

    public static void i(yzz yzzVar, yzy yzyVar, String str) {
        g(yzzVar, yzyVar, str != null ? new ComponentName(str, "") : null);
    }

    public static void j(yzz yzzVar, yzy yzyVar, yyv yyvVar, String str) {
        i(yzzVar, yzyVar, str);
        ebf.j().C(yyvVar, str);
    }

    public static mau l() {
        return (mau) mki.a.i(mau.class);
    }

    public static Bundle m(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("IS_HORIZONTAL", z);
        return bundle;
    }

    public static oxn n() {
        return (oxn) mki.a.i(oxn.class);
    }

    public static mns o() {
        return (mns) mki.a.i(mns.class);
    }

    public static mnr p() {
        return (mnr) mki.a.i(mnr.class);
    }

    public static /* synthetic */ npt q(int i) {
        npt nptVar = npt.a;
        if (i == nptVar.c) {
            return nptVar;
        }
        npt nptVar2 = npt.b;
        if (i == nptVar2.c) {
            return nptVar2;
        }
        throw new IllegalStateException(a.bp(i, "Unexpected temperature display unit value: "));
    }

    public static long r(bwq bwqVar) {
        return ((dlq) bwqVar.a()).a;
    }

    public static boolean s() {
        return acxa.B() == ((long) yzy.CY.a());
    }

    public static cfy t(cfy cfyVar, ckv ckvVar, bux buxVar) {
        cfyVar.getClass();
        ckvVar.getClass();
        buxVar.v(-1553871329);
        if (s()) {
            Object objG = buxVar.g();
            Object obj = buw.a;
            if (objG == obj) {
                Object parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(new dlq(0L), bxp.c);
                buxVar.x(parcelableSnapshotMutableState);
                objG = parcelableSnapshotMutableState;
            }
            bwq bwqVar = (bwq) objG;
            Object objG2 = buxVar.g();
            if (objG2 == obj) {
                objG2 = new noo(bwqVar, 0);
                buxVar.x(objG2);
            }
            cfy cfyVarE = tt.e(cfyVar, (afec) objG2);
            if (!a.j(c(bwqVar), 0L)) {
                dlg dlgVar = (dlg) buxVar.f(dbc.d);
                float fEy = dlgVar.ey((int) (c(bwqVar) >> 32));
                float fEy2 = dlgVar.ey((int) (c(bwqVar) & 4294967295L));
                long jC = c(bwqVar) >> 32;
                long jC2 = c(bwqVar) & 4294967295L;
                bcm bcmVar = (bcm) ckvVar;
                long jFloatToRawIntBits = (Float.floatToRawIntBits((int) jC) << 32) | (4294967295L & Float.floatToRawIntBits((int) jC2));
                float fA = bcmVar.a.a(jFloatToRawIntBits, dlgVar);
                float[] fArrF = xsz.f(dlgVar.ex(bcmVar.c.a(jFloatToRawIntBits, dlgVar)), dlgVar.ex(bcmVar.b.a(jFloatToRawIntBits, dlgVar)), dlgVar.ex(bcmVar.d.a(jFloatToRawIntBits, dlgVar)), dlgVar.ex(fA));
                int iH = cjn.h(kfn.i(buxVar).A());
                Object objG3 = buxVar.g();
                if (objG3 == obj) {
                    Object parcelableSnapshotMutableState2 = new ParcelableSnapshotMutableState(xqp.c, bxp.c);
                    buxVar.x(parcelableSnapshotMutableState2);
                    objG3 = parcelableSnapshotMutableState2;
                }
                bwq bwqVar2 = (bwq) objG3;
                boolean z = buxVar.z(fEy) | buxVar.z(fEy2) | buxVar.C(fArrF) | buxVar.A(iH);
                Object objG4 = buxVar.g();
                if (z || objG4 == obj) {
                    objG4 = new nom(fEy, fEy2, fArrF, iH);
                    buxVar.x(objG4);
                }
                nom nomVar = (nom) objG4;
                boolean zC = buxVar.C(nomVar);
                Object objG5 = buxVar.g();
                if (zC || objG5 == obj) {
                    objG5 = nomVar.j();
                    buxVar.x(objG5);
                }
                Map map = (Map) objG5;
                xqq xqqVarI = nomVar.i();
                xqp xqpVar = (xqp) bwqVar2.a();
                Object objG6 = buxVar.g();
                if (objG6 == obj) {
                    objG6 = new njg(bwqVar2, 9);
                    buxVar.x(objG6);
                }
                cfy cfyVarN = wpq.N(cfyVarE, xqqVarI, xqpVar, map, (afeg) objG6, ((Context) buxVar.f(daa.b)).getMainExecutor(), nomVar.i(), 448);
                buxVar.o();
                return cfyVarN;
            }
            cfyVar = cfyVarE;
        }
        buxVar.o();
        return cfyVar;
    }

    public static cfy u(cfy cfyVar, bux buxVar) {
        cfy cfyVarE;
        cfyVar.getClass();
        buxVar.v(167718904);
        if (s()) {
            bvv bvvVar = (bvv) buxVar;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(new dlq(0L), bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            bwq bwqVar = (bwq) objS;
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = new noo(bwqVar, 1);
                bvvVar.ad(objS2);
            }
            cfyVarE = tt.e(cfyVar, (afec) objS2);
            if (!a.j(d(bwqVar), 0L)) {
                dlg dlgVar = (dlg) buxVar.f(dbc.d);
                float fEy = dlgVar.ey((int) (d(bwqVar) >> 32));
                float fEy2 = dlgVar.ey((int) (d(bwqVar) & 4294967295L));
                int iH = cjn.h(kfn.i(buxVar).A());
                int iH2 = cjn.h(kfn.i(buxVar).O());
                boolean z = buxVar.z(fEy) | buxVar.z(fEy2) | buxVar.A(iH2) | buxVar.A(iH);
                Object objS3 = bvvVar.S();
                if (z || objS3 == obj) {
                    objS3 = new non(fEy, fEy2, iH2, iH);
                    bvvVar.ad(objS3);
                }
                non nonVar = (non) objS3;
                Object objS4 = bvvVar.S();
                if (objS4 == obj) {
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new ParcelableSnapshotMutableState(xqp.c, bxp.c);
                    bvvVar.ad(parcelableSnapshotMutableState2);
                    objS4 = parcelableSnapshotMutableState2;
                }
                bwq bwqVar2 = (bwq) objS4;
                boolean zC = buxVar.C(nonVar);
                Object objS5 = bvvVar.S();
                if (zC || objS5 == obj) {
                    objS5 = nonVar.j();
                    bvvVar.ad(objS5);
                }
                Map map = (Map) objS5;
                xqq xqqVarF = nonVar.f();
                xqp xqpVar = (xqp) bwqVar2.a();
                Object objS6 = bvvVar.S();
                if (objS6 == obj) {
                    objS6 = new njg(bwqVar2, 8);
                    bvvVar.ad(objS6);
                }
                cfy cfyVarN = wpq.N(cfyVarE, xqqVarF, xqpVar, map, (afeg) objS6, ((Context) buxVar.f(daa.b)).getMainExecutor(), null, 480);
                bvvVar.Y(false);
                return cfyVarN;
            }
        } else {
            cfyVarE = cfyVar;
        }
        ((bvv) buxVar).Y(false);
        return cfyVarE;
    }

    public static boolean v(ComponentName componentName, nnl nnlVar) {
        componentName.getClass();
        return (nnlVar == null || affa.f(nnlVar, nnl.a) || Objects.equals(nnlVar.r, componentName)) ? false : true;
    }

    public static boolean w(nnl nnlVar) {
        CharSequence charSequence = nnlVar.l;
        if (charSequence != null && charSequence.length() != 0) {
            return false;
        }
        CharSequence charSequence2 = nnlVar.m;
        return charSequence2 == null || charSequence2.length() == 0;
    }

    public static boolean x(nnl nnlVar) {
        if (nnlVar != null) {
            return nnlVar.b.a == null && nnlVar.o == null && nnlVar.p == null && nnlVar.q == null && w(nnlVar);
        }
        return true;
    }

    public static nnk y(nwt nwtVar) {
        int i = nwtVar.d;
        if (i != 0) {
            return new nnk(nwtVar.b, i, new njb(nwtVar, 10));
        }
        throw null;
    }

    public static /* synthetic */ aby z(abh abhVar) {
        abhVar.getClass();
        return new aby(acl.a(ca.F(150, 0, null, 6), 0.75f).a(acl.q(ca.F(150, 0, null, 6), 0.85f, 0L, 4)), acl.f(ca.F(150, 0, null, 6), 0.75f).a(acl.r(ca.F(150, 0, null, 6), 0.85f, 0L, 4)), BitmapDescriptorFactory.HUE_RED, 12);
    }

    public final synchronized void J() {
    }

    public void a() {
        throw null;
    }

    public void b(StatusBarNotification statusBarNotification) {
        throw null;
    }

    public lxr(char[] cArr) {
    }

    public void k(StatusBarNotification statusBarNotification) {
    }
}
