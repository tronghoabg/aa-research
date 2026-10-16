package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.gms.car.display.CarDisplayNativeUiElement;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Iterator;
import java.util.List;
import mesquite.messaging.model.Container;

/* loaded from: classes.dex */
public final class lxw {
    public static final void A(String str) {
        ((ype) nvq.a.g()).y("%s", str);
    }

    public static final nuh B(List list, nuo nuoVar) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            nur nurVar = ((nuh) next).c;
            if (nurVar.l && nurVar.x == nuoVar) {
                break;
            }
        }
        return (nuh) next;
    }

    public static final boolean C(int i, int i2) {
        return (i & i2) != 0;
    }

    public static final boolean D(List list, int i) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((nvd) it.next()).b == i) {
                return true;
            }
        }
        return false;
    }

    public static nsx E() {
        return (nsx) mki.a.i(nsx.class);
    }

    public static /* synthetic */ boolean F(CarDisplayNativeUiElement carDisplayNativeUiElement) {
        return carDisplayNativeUiElement.a != null;
    }

    public static final void G(cfy cfyVar, afdr afdrVar, afdr afdrVar2, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(487608329);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afdrVar2) ? 128 : 256;
        }
        int i4 = 0;
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            ksr.a(ksp.f(buxVarC), null, false, null, bxc.i(512904545, true, new nrb(cfyVar, afdrVar, afdrVar2, i4), buxVarC), buxVarC, 24576, 14);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kmg(cfyVar, afdrVar, afdrVar2, i, 11);
        }
    }

    public static final not H(int i) {
        Object next;
        afao afaoVar = new afao((afar) not.i);
        while (true) {
            if (!afaoVar.hasNext()) {
                next = null;
                break;
            }
            next = afaoVar.next();
            if (((not) next).j == i) {
                break;
            }
        }
        not notVar = (not) next;
        if (notVar != null) {
            return notVar;
        }
        throw new IllegalStateException(a.bp(i, "Unexpected fan direction value: "));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final eqj a(luh luhVar) {
        eqj eqjVarA = luhVar.a();
        eqjVarA.getClass();
        yfq yfqVar = (yfq) eqjVarA.e();
        yfqVar.getClass();
        if (yfqVar.size() == 1) {
            return luhVar.b((Container) yfqVar.get(0));
        }
        throw new UnsupportedOperationException("Multiple containers are not supported for messaging apps");
    }

    public static final luh b(String str) {
        return lup.e().j(kio.b().e(), lup.e().a(str)) ? lva.h() : luv.a().b(str, mqa.b);
    }

    public static void c() {
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.afdr r23, java.lang.String r24, com.google.android.apps.auto.components.graphics.icon.GhIcon r25, defpackage.ktf r26, boolean r27, defpackage.cfy r28, boolean r29, defpackage.bux r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxw.d(afdr, java.lang.String, com.google.android.apps.auto.components.graphics.icon.GhIcon, ktf, boolean, cfy, boolean, bux, int, int):void");
    }

    public static final boolean g(nuh nuhVar, Duration duration) {
        return Duration.ofMillis(Instant.now().toEpochMilli() - nuhVar.c.i).compareTo(duration) <= 0;
    }

    public static final Duration h() {
        return wub.ao(acpc.e());
    }

    public static final Duration i() {
        return wub.ao(acpc.i());
    }

    public static final Duration j() {
        return wub.ao(acpc.j());
    }

    public static final Duration k() {
        return wub.ao(acpc.b());
    }

    public static final Duration l() {
        return wub.al(acpc.c());
    }

    public static final Duration m() {
        return wub.al(acpc.d());
    }

    public static final float n(float f) {
        if (!ldz.a.a().b()) {
            return f;
        }
        float f2 = gjk.b.k;
        return f + f2 + f2 + BitmapDescriptorFactory.HUE_RED + BitmapDescriptorFactory.HUE_RED;
    }

    public static final Float o(bym bymVar) {
        return (Float) bymVar.a();
    }

    public static final void p(mst mstVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        cfy cfyVarK;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1517905627);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(mstVar) : buxVarC.E(mstVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            mss mssVar = mstVar.a;
            cfy cfyVar = mstVar.b;
            if (mssVar == null || affa.f(mssVar, msl.a)) {
                buxVar2 = buxVarC;
                buxVar2.v(-1783952955);
                ((bvv) buxVar2).Y(false);
            } else if (affa.f(mssVar, msm.a)) {
                buxVarC.v(-1581565723);
                if (ldz.a.a().b()) {
                    buxVarC.v(-1783868108);
                    int i4 = jvm.x;
                    Bundle bundleB = juc.b();
                    cfy cfyVarC = awd.c(cfyVar, 1.0f);
                    bvv bvvVar = (bvv) buxVarC;
                    Object objS = bvvVar.S();
                    Object obj = buw.a;
                    if (objS == obj) {
                        objS = gge.e;
                        bvvVar.ad(objS);
                    }
                    cfy cfyVarA = kml.a(cfyVarC, (afdr) objS);
                    Object objS2 = bvvVar.S();
                    if (objS2 == obj) {
                        objS2 = new asg();
                        bvvVar.ad(objS2);
                    }
                    buxVar2 = buxVarC;
                    ca.at(cfyVarA, null, bxc.i(-56396680, true, new nde(bundleB, 1), buxVarC), buxVar2, 3072, 6);
                    bvvVar.Y(false);
                } else {
                    buxVarC.v(-1783716487);
                    int i5 = jvm.x;
                    Bundle bundleB2 = juc.b();
                    bvv bvvVar2 = (bvv) buxVarC;
                    Object objS3 = bvvVar2.S();
                    Object obj2 = buw.a;
                    if (objS3 == obj2) {
                        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(new dlq(0L), bxp.c);
                        bvvVar2.ad(parcelableSnapshotMutableState);
                        objS3 = parcelableSnapshotMutableState;
                    }
                    bwq bwqVar = (bwq) objS3;
                    cfy cfyVarC2 = awd.c(cfyVar, 1.0f);
                    if (Build.VERSION.SDK_INT == 34) {
                        buxVarC.v(-944124220);
                        cfv cfvVar = cfy.e;
                        Object objS4 = bvvVar2.S();
                        if (objS4 == obj2) {
                            objS4 = new fxd(bwqVar, 5);
                            bvvVar2.ad(objS4);
                        }
                        cfyVarK = ca.K(cfvVar, null, (afeg) objS4, 1);
                        bvvVar2.Y(false);
                    } else {
                        buxVarC.v(-944010543);
                        bvvVar2.Y(false);
                        cfyVarK = cfy.e;
                    }
                    cfy cfyVarA2 = cfyVarC2.a(cfyVarK);
                    Object objS5 = bvvVar2.S();
                    if (objS5 == obj2) {
                        objS5 = gge.f;
                        bvvVar2.ad(objS5);
                    }
                    cfy cfyVarA3 = kml.a(cfyVarA2, (afdr) objS5);
                    ctp ctpVarB = atk.b(cfl.a, false);
                    int iG = a.g(bvvVar2.u);
                    ccx ccxVarAh = bvvVar2.ah();
                    cfy cfyVarJ = bzi.j(buxVarC, cfyVarA3);
                    afdr afdrVar = cwb.a;
                    buxVarC.w();
                    if (bvvVar2.t) {
                        buxVarC.j(afdrVar);
                    } else {
                        buxVarC.y();
                    }
                    byq.c(buxVarC, ctpVarB, cwb.e);
                    byq.c(buxVarC, ccxVarAh, cwb.d);
                    byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
                    byq.b(buxVarC, cwb.g);
                    byq.c(buxVarC, cfyVarJ, cwb.c);
                    bvvVar2.ab(1169735167, new dlq(((dlq) bwqVar.a()).a), 0, null);
                    boolean zBl = ca.bl(buxVarC);
                    float f = zBl ? 0.0f : 1.0f;
                    int iEF = ((dlg) buxVarC.f(dbc.d)).eF(1.0f);
                    cfv cfvVar2 = cfy.e;
                    cfy cfyVarC3 = awd.c(cfvVar2, 1.0f);
                    boolean zA = buxVarC.A(iEF);
                    Object objS6 = bvvVar2.S();
                    if (zA || objS6 == obj2) {
                        objS6 = new mtj(iEF);
                        bvvVar2.ad(objS6);
                    }
                    dtk.i(jvm.class, cfyVarC3, dtv.d(buxVarC), bundleB2, (eps) dyz.c(((eqa) buxVarC.f(erz.a)).getLifecycle(), buxVarC).a(), (afec) objS6, buxVarC, 48);
                    buxVar2 = buxVarC;
                    r(f, buxVar2, 0);
                    if (zBl) {
                        buxVar2.v(1903162541);
                        bvvVar2.Y(false);
                    } else {
                        buxVar2.v(1902822347);
                        cfy cfyVarC4 = awd.c(cfvVar2, 1.0f);
                        long j = ksp.j(krr.n, buxVar2);
                        bcm bcmVar = kss.a;
                        atk.c(afp.D(cfyVarC4, f, j, kss.c), buxVar2, 0);
                        bvvVar2.Y(false);
                    }
                    bvvVar2.Y(false);
                    bvvVar2.Y(true);
                    bvvVar2.Y(false);
                }
                ((bvv) buxVar2).Y(false);
            } else {
                buxVar2 = buxVarC;
                if (affa.f(mssVar, msn.a)) {
                    buxVar2.v(-1581554068);
                    myv.o(cfyVar, lec.a.a().f() && !mstVar.c, mstVar.e, null, null, buxVar2, 0);
                    buxVar2 = buxVar2;
                    ((bvv) buxVar2).Y(false);
                } else if (affa.f(mssVar, mso.a)) {
                    buxVar2.v(-1581546755);
                    nca.c(cfyVar, mstVar.d, buxVar2, 0);
                    ((bvv) buxVar2).Y(false);
                } else if (mssVar instanceof msp) {
                    buxVar2.v(-1581543059);
                    ndj.h(((msp) mssVar).a, cfyVar, mstVar.d, null, false, buxVar2, 0, 24);
                    buxVar2 = buxVar2;
                    ((bvv) buxVar2).Y(false);
                } else if (affa.f(mssVar, msq.a)) {
                    buxVar2.v(-1581539372);
                    mlq.j(cfyVar, null, buxVar2, 0);
                    ((bvv) buxVar2).Y(false);
                } else {
                    if (!affa.f(mssVar, msr.a)) {
                        buxVar2.v(-1581568359);
                        ((bvv) buxVar2).Y(false);
                        throw new aezs();
                    }
                    buxVar2.v(-1581537425);
                    mva.t(cfyVar, mstVar.d, buxVar2, 0);
                    ((bvv) buxVar2).Y(false);
                }
            }
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kda(mstVar, i, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(final boolean r20, final defpackage.mtz r21, defpackage.afeh r22, defpackage.bux r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxw.q(boolean, mtz, afeh, bux, int, int):void");
    }

    public static final void r(final float f, bux buxVar, int i) {
        int i2;
        final long jK;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-21248746);
        if (i3 == 0) {
            i2 = (true != buxVarC.z(f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            final dlg dlgVar = (dlg) buxVarC.f(dbc.d);
            if (leh.a.a().b()) {
                buxVarC.v(-1661048385);
                jK = ksp.j(krr.o, buxVarC);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(-1660997948);
                jK = ksp.k(krs.a, buxVarC);
                ((bvv) buxVarC).Y(false);
            }
            cfy cfyVarC = awd.c(cfy.e, 1.0f);
            boolean zC = buxVarC.C(dlgVar) | ((i2 & 14) == 4) | buxVarC.B(jK);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zC || objS == buw.a) {
                objS = new afec() { // from class: mta
                    @Override // defpackage.afec
                    public final Object invoke(Object obj) {
                        cmd cmdVar = (cmd) obj;
                        cmdVar.getClass();
                        bcm bcmVar = kss.a;
                        float fA = kss.c.a.a(cmdVar.o(), dlgVar);
                        float fEA = cmdVar.eA(f);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (cmdVar.o() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cmdVar.o() & 4294967295L));
                        cjm cjmVar = new cjm((byte[]) null);
                        cjmVar.p(new cjb(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fIntBitsToFloat, fIntBitsToFloat2));
                        cjm cjmVar2 = new cjm((byte[]) null);
                        float f2 = fIntBitsToFloat2 - fEA;
                        float f3 = fA - fEA;
                        float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, f3);
                        float fMax2 = Math.max(BitmapDescriptorFactory.HUE_RED, f3);
                        cjmVar2.q(byx.C(fEA, fEA, fIntBitsToFloat - fEA, f2, (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L)));
                        cjm cjmVar3 = new cjm((byte[]) null);
                        cjmVar3.n(cjmVar, cjmVar2, 0);
                        czz.aJ(cmdVar, cjmVar3, jK, cmf.a, 52);
                        return afak.a;
                    }
                };
                bvvVar.ad(objS);
            }
            afp.z(cfyVarC, (afec) objS, buxVarC, 6);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mzz(f, i, 1);
        }
    }

    public static final void s(boolean z, afm afmVar, afeg afegVar, afeg afegVar2, cfy cfyVar, float f, afeg afegVar3, bux buxVar, int i) {
        int i2;
        afeg afegVar4;
        afeg afegVar5;
        int i3;
        afeg afegVar6;
        acp acpVarA;
        acq acqVarA;
        boolean z2 = z;
        float f2 = f;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-687013270);
        if (i4 == 0) {
            i2 = (true != buxVarC.D(z2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(afmVar) : buxVarC.E(afmVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            afegVar4 = afegVar;
            i2 |= true != buxVarC.E(afegVar4) ? 128 : 256;
        } else {
            afegVar4 = afegVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(afegVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i2 |= true != buxVarC.z(f2) ? 65536 : 131072;
        }
        int i5 = i2 | 1572864;
        if (buxVarC.I((i5 & 599187) != 599186, i5 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                Object objS = bvvVar.S();
                i3 = 196608;
                if (objS == buw.a) {
                    objS = new mqe(3);
                    bvvVar.ad(objS);
                }
                afegVar6 = (afeg) objS;
            } else {
                buxVarC.s();
                i3 = 196608;
                afegVar6 = afegVar3;
            }
            buxVarC.l();
            int i6 = 13;
            if (z2) {
                buxVarC.v(-1292065092);
                Object objS2 = bvvVar.S();
                if (objS2 == buw.a) {
                    objS2 = new mii(12);
                    bvvVar.ad(objS2);
                }
                acpVarA = acl.v((afec) objS2).a(acl.n(null, cfl.j, 13));
                bvvVar.Y(false);
            } else {
                buxVarC.v(-1291968062);
                Object objS3 = bvvVar.S();
                if (objS3 == buw.a) {
                    objS3 = new mii(i6);
                    bvvVar.ad(objS3);
                }
                acpVarA = acl.w((afec) objS3).a(acl.p(cfl.m, 13));
                bvvVar.Y(false);
            }
            if (z2) {
                buxVarC.v(-1291836808);
                Object objS4 = bvvVar.S();
                if (objS4 == buw.a) {
                    objS4 = new mii(14);
                    bvvVar.ad(objS4);
                }
                acqVarA = acl.x((afec) objS4).a(acl.s(null, cfl.j, 13));
                bvvVar.Y(false);
            } else {
                buxVarC.v(-1291735810);
                Object objS5 = bvvVar.S();
                if (objS5 == buw.a) {
                    objS5 = new mii(15);
                    bvvVar.ad(objS5);
                }
                acqVarA = acl.y((afec) objS5).a(acl.u(cfl.m, 13));
                bvvVar.Y(false);
            }
            mtb mtbVar = new mtb(afmVar, f2, z2, acpVarA, acqVarA, afegVar4, 0);
            f2 = f2;
            z2 = z2;
            List listBi = woy.bi(bxc.i(1744680690, true, mtbVar, buxVarC), afegVar2);
            boolean z3 = (((i5 & 458752) ^ i3) > 131072 && buxVarC.z(f2)) || (i5 & i3) == 131072;
            boolean z4 = (i5 & 14) == 4;
            boolean z5 = (i5 & 3670016) == 1048576;
            Object objS6 = bvvVar.S();
            if ((z4 | z3 | z5) || objS6 == buw.a) {
                objS6 = new mtl(f2, z2, afegVar6);
                bvvVar.ad(objS6);
            }
            ctw ctwVar = (ctw) objS6;
            afeg afegVarF = crt.f(listBi);
            boolean zC = buxVarC.C(ctwVar);
            Object objS7 = bvvVar.S();
            if (zC || objS7 == buw.a) {
                objS7 = new ctx(ctwVar);
                bvvVar.ad(objS7);
            }
            ctp ctpVar = (ctp) objS7;
            int iG = a.g(bvvVar.u);
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
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            afegVarF.invoke(buxVarC, 0);
            bvvVar.Y(true);
            afegVar5 = afegVar6;
        } else {
            buxVarC.s();
            afegVar5 = afegVar3;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mtc(z2, afmVar, afegVar, afegVar2, cfyVar, f2, afegVar5, i, 0);
        }
    }

    public static final boolean t(nwt nwtVar) {
        return nwtVar == null || nwtVar.d == 1;
    }

    public static final yzy u(int i, int i2) {
        int i3 = i - 1;
        if (i3 == 1) {
            return i2 != 0 ? i2 != 1 ? yzy.oF : yzy.od : yzy.oc;
        }
        if (i3 == 3) {
            return i2 != 0 ? i2 != 1 ? yzy.oL : yzy.oK : yzy.oJ;
        }
        if (i2 == 0) {
            return yzy.nY;
        }
        if (i2 == 1) {
            return yzy.od;
        }
        throw new IllegalArgumentException("Position must be 0 or 1");
    }

    public static final void v(final nwt nwtVar, final afdr afdrVar, final Runnable runnable, final ktf ktfVar, cfy cfyVar, final boolean z, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-36368359);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(nwtVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(runnable) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(ktfVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.D(z) ? 65536 : 131072;
        }
        if (buxVarC.I((74899 & i2) != 74898, i2 & 1)) {
            cct cctVarI = bxc.i(398622970, true, new afeh() { // from class: nwb
                @Override // defpackage.afeh
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    cfy cfyVar2 = (cfy) obj;
                    bux buxVar2 = (bux) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    cfyVar2.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= true != buxVar2.C(cfyVar2) ? 2 : 4;
                    }
                    if (buxVar2.I((iIntValue & 19) != 18, iIntValue & 1)) {
                        Runnable runnable2 = runnable;
                        afdr afdrVar2 = afdrVar;
                        nwt nwtVar2 = nwtVar;
                        boolean zE = buxVar2.E(nwtVar2) | buxVar2.C(afdrVar2) | buxVar2.E(runnable2);
                        Object objG = buxVar2.g();
                        if (zE || objG == buw.a) {
                            lxu lxuVar = new lxu(nwtVar2, afdrVar2, runnable2, 15, (short[]) null);
                            buxVar2.x(lxuVar);
                            objG = lxuVar;
                        }
                        boolean z2 = z;
                        String str = nwtVar2.c;
                        GhIcon ghIcon = nwtVar2.b;
                        lxw.d((afdr) objG, str, ghIcon, ktfVar, z2 || ghIcon == null, cfyVar2, false, buxVar2, (iIntValue << 15) & 458752, 64);
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVarC);
            if (nwtVar.d == 6) {
                buxVarC.v(-1117312460);
                ctp ctpVarB = atk.b(cfl.a, false);
                bvv bvvVar = (bvv) buxVarC;
                int iG = a.g(bvvVar.u);
                ccx ccxVarAh = bvvVar.ah();
                cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
                afdr afdrVar2 = cwb.a;
                buxVarC.w();
                if (bvvVar.t) {
                    buxVarC.j(afdrVar2);
                } else {
                    buxVarC.y();
                }
                byq.c(buxVarC, ctpVarB, cwb.e);
                byq.c(buxVarC, ccxVarAh, cwb.d);
                byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
                byq.b(buxVarC, cwb.g);
                byq.c(buxVarC, cfyVarJ, cwb.c);
                atn atnVar = atn.a;
                cfv cfvVar = cfy.e;
                atk.c(lxr.u(atnVar.b(cfvVar), buxVarC), buxVarC, 0);
                cctVarI.invoke(awd.r(cfvVar), buxVarC, 54);
                bvvVar.Y(true);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-1117162327);
                cctVarI.invoke(cfyVar, buxVarC, Integer.valueOf(((i2 >> 12) & 14) | 48));
                ((bvv) buxVarC).Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new boa(nwtVar, afdrVar, runnable, ktfVar, cfyVar, z, i, 9);
        }
    }

    public static final void w(final nwr nwrVar, afec afecVar, final cil cilVar, cil cilVar2, final cil cilVar3, final cil cilVar4, final cil cilVar5, bux buxVar, int i) {
        int i2;
        final afec afecVar2;
        cil cilVar6;
        bux buxVar2;
        cjv cjvVar;
        final boolean z;
        boolean z2;
        kso ksoVarF;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(252740077);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(nwrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            afecVar2 = afecVar;
            i2 |= true != buxVarC.E(afecVar2) ? 16 : 32;
        } else {
            afecVar2 = afecVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cilVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            cilVar6 = cilVar2;
            i2 |= true != buxVarC.C(cilVar6) ? 1024 : 2048;
        } else {
            cilVar6 = cilVar2;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.C(cilVar3) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.C(cilVar4) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.C(cilVar5) ? 524288 : 1048576;
        }
        if (buxVarC.I((599187 & i2) != 599186, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            final List listDa = woy.da(new nwt[]{nwrVar.n, nwrVar.o, nwrVar.p});
            if (nwrVar.u == 3) {
                cjvVar = null;
                z = true;
            } else {
                cjvVar = null;
                z = false;
            }
            Integer num = nwrVar.q;
            if (num != null) {
                cjvVar = new cjv(cjn.i(num.intValue()));
            }
            if (cjvVar == null) {
                buxVarC.v(-1929898888);
                ksoVarF = kfn.i(buxVarC);
                z2 = false;
            } else {
                z2 = false;
                buxVarC.v(-1929898338);
                ksoVarF = ksp.f(buxVarC);
            }
            bvvVar.Y(z2);
            final cjv cjvVar2 = cjvVar;
            final cil cilVar7 = cilVar6;
            buxVar2 = buxVarC;
            ksr.a(ksoVarF, null, false, null, bxc.i(1562396485, true, new afeg() { // from class: nvy
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar3 = (bux) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i4 = iIntValue & 3;
                    if (buxVar3.I(i4 != 2, iIntValue & 1)) {
                        final boolean z3 = z;
                        final cil cilVar8 = cilVar5;
                        final cil cilVar9 = cilVar4;
                        final cil cilVar10 = cilVar3;
                        final cil cilVar11 = cilVar7;
                        final cil cilVar12 = cilVar;
                        final cjv cjvVar3 = cjvVar2;
                        final afec afecVar3 = afecVar2;
                        final nwr nwrVar2 = nwrVar;
                        final List list = listDa;
                        ca.at(null, null, bxc.i(-984204261, true, new afeh() { // from class: nvz
                            /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
                            /* JADX WARN: Removed duplicated region for block: B:43:0x0096  */
                            /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
                            /* JADX WARN: Removed duplicated region for block: B:47:0x00ad  */
                            /* JADX WARN: Removed duplicated region for block: B:52:0x00be  */
                            /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
                            /* JADX WARN: Removed duplicated region for block: B:63:0x00fe  */
                            /* JADX WARN: Removed duplicated region for block: B:64:0x0103  */
                            /* JADX WARN: Removed duplicated region for block: B:67:0x0151  */
                            /* JADX WARN: Removed duplicated region for block: B:72:0x01c0  */
                            @Override // defpackage.afeh
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invoke(java.lang.Object r25, java.lang.Object r26, java.lang.Object r27) {
                                /*
                                    Method dump skipped, instructions count: 471
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.nvz.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                            }
                        }, buxVar3), buxVar3, 3072, 7);
                    } else {
                        buxVar3.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVar2, 24576, 14);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hfp(nwrVar, afecVar, cilVar, cilVar2, cilVar3, cilVar4, cilVar5, i, 4);
        }
    }

    public static final void x(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                float f = nvv.a;
            }
        }
    }

    public static final ktf y(int i, boolean z, bux buxVar, int i2) {
        ktf ktfVarJ;
        ktf ktfVarJ2;
        int i3 = i - 1;
        if (i3 == 1) {
            buxVar.v(150604314);
            aezr aezrVar = ktf.a;
            ktf ktfVarE = kgq.e(kfn.i(buxVar).d(), 0L, 0L, 0L, 0L, 0L, 0L, buxVar, 254);
            buxVar.o();
            return ktfVarE;
        }
        if (i3 == 2) {
            buxVar.v(150606648);
            aezr aezrVar2 = ktf.a;
            ktf ktfVarE2 = kgq.e(kfn.i(buxVar).C(), 0L, 0L, 0L, 0L, 0L, 0L, buxVar, 254);
            buxVar.o();
            return ktfVarE2;
        }
        if (i3 == 3) {
            buxVar.v(150608805);
            aezr aezrVar3 = ktf.a;
            ktf ktfVarE3 = kgq.e(kfn.i(buxVar).t(), 0L, 0L, 0L, 0L, 0L, 0L, buxVar, 254);
            buxVar.o();
            return ktfVarE3;
        }
        if (i3 == 4) {
            buxVar.v(150611802);
            aezr aezrVar4 = ktf.a;
            ktf ktfVarF = kgq.f(0L, 0L, 0L, 0L, buxVar, 255);
            buxVar.o();
            return ktfVarF;
        }
        if (i3 == 5) {
            buxVar.v(150613882);
            if (lxr.s()) {
                buxVar.v(374089088);
                aezr aezrVar5 = ktf.a;
                ktfVarJ = kgq.e(cjn.i(0), kfn.i(buxVar).s(), 0L, 0L, 0L, 0L, 0L, buxVar, 252);
                buxVar.o();
            } else {
                buxVar.v(374246599);
                aezr aezrVar6 = ktf.a;
                ktfVarJ = kgq.j(0L, 0L, 0L, 0L, buxVar, 255);
                buxVar.o();
            }
            buxVar.o();
            return ktfVarJ;
        }
        boolean z2 = ((i2 & 2) == 0) & z;
        buxVar.v(150622284);
        if (z2) {
            buxVar.v(374341862);
            aezr aezrVar7 = ktf.a;
            ktfVarJ2 = kgq.f(0L, 0L, 0L, 0L, buxVar, 255);
            buxVar.o();
        } else {
            buxVar.v(374401351);
            aezr aezrVar8 = ktf.a;
            ktfVarJ2 = kgq.j(0L, 0L, 0L, 0L, buxVar, 255);
            buxVar.o();
        }
        buxVar.o();
        return ktfVarJ2;
    }

    public static final Integer z(Notification notification) {
        notification.getClass();
        Bundle bundle = notification.extras;
        bundle.getClass();
        if (bundle.containsKey("android.callType")) {
            return Integer.valueOf(bundle.getInt("android.callType"));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.String r31, defpackage.cfy r32, boolean r33, java.lang.String r34, defpackage.dfw r35, defpackage.bux r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxw.e(java.lang.String, cfy, boolean, java.lang.String, dfw, bux, int, int):void");
    }

    public final void f(String str, cfy cfyVar, boolean z, dfw dfwVar, bux buxVar, int i) {
        String str2;
        int i2;
        cfy cfyVar2;
        dfw dfwVar2;
        dfw dfwVar3;
        str.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-747255059);
        if (i3 == 0) {
            str2 = str;
            i2 = (true != buxVarC.C(str2) ? 2 : 4) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= true != buxVarC.D(z) ? 128 : 256;
        }
        int i5 = i4 | 3072;
        if ((i & 24576) == 0) {
            i5 = i4 | 11264;
        }
        if (buxVarC.I((i5 & 9363) != 9362, i5 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                cfyVar2 = cfy.e;
                dfwVar3 = czz.av(buxVarC).e;
            } else {
                buxVarC.s();
                cfyVar2 = cfyVar;
                dfwVar3 = dfwVar;
            }
            buxVarC.l();
            ctp ctpVarA = avv.a(atd.a, cfl.n, buxVarC, 48);
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar2);
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
            avy avyVar = avy.a;
            cfv cfvVar = cfy.e;
            brp.b(str2, avyVar.b(cfvVar, 1.0f, false), 0L, 0L, null, 0L, null, 0L, 0, false, 2, 0, dfwVar3, buxVarC, i5 & 14, 24576, 114684);
            buxVarC = buxVarC;
            buxVarC.v(-932896175);
            bvvVar.Y(false);
            if (z) {
                buxVarC.v(-932859502);
                asl.A(awd.m(cfvVar, gjk.c.k), buxVarC);
                boc.a(dao.b(2131233167, buxVarC, 0), null, awd.i(cfvVar, 24.0f), kfn.i(buxVarC).b(), buxVarC, 440, 0);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-932583695);
                bvvVar.Y(false);
            }
            bvvVar.Y(true);
            dfwVar2 = dfwVar3;
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
            dfwVar2 = dfwVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mcg(this, str, cfyVar2, z, dfwVar2, i, 0);
        }
    }
}
