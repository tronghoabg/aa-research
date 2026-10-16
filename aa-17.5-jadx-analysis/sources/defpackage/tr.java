package defpackage;

import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class tr {
    public static Object a(String str, xz xzVar) throws RemoteException {
        try {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", a.bq(str, "Dispatching call ", " to host"));
            }
            return xzVar.a();
        } catch (SecurityException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw new qs(a.bq(str, "Remote ", " call failed"), e2);
        }
    }

    public static void b(IOnDoneCallback iOnDoneCallback, String str, xy xyVar) {
        yj.b(new ae(iOnDoneCallback, str, xyVar, 6, (short[]) null));
    }

    public static void c(ept eptVar, String str, xy xyVar) {
        yj.b(new ae(eptVar, xyVar, str, 5, (char[]) null));
    }

    public static void d(ept eptVar, IOnDoneCallback iOnDoneCallback, String str, xy xyVar) {
        yj.b(new xx(eptVar, iOnDoneCallback, str, xyVar, 0));
    }

    public static void e(String str, xz xzVar) {
        try {
            a(str, xzVar);
        } catch (RemoteException e) {
            Log.e("CarApp.Dispatch", "Host unresponsive when dispatching call ".concat(str), e);
        }
    }

    public static void f(IOnDoneCallback iOnDoneCallback, String str, Throwable th) {
        e(str.concat(" onFailure"), new xw(iOnDoneCallback, th, str, 0));
    }

    public static void g(IOnDoneCallback iOnDoneCallback, String str, Object obj) {
        e(str.concat(" onSuccess"), new xw(iOnDoneCallback, obj, str, 1));
    }

    public static final void h(final boolean z, afec afecVar, cfy cfyVar, final boolean z2, brx brxVar, bru bruVar, bmr bmrVar, avp avpVar, asf asfVar, afeh afehVar, bux buxVar, int i, int i2) {
        int i3;
        final afec afecVar2;
        Object obj;
        int i4;
        bux buxVar2;
        boolean z3;
        asf asfVar2;
        aew aewVar;
        long j;
        long j2;
        long j3;
        bym bymVarA;
        ckv ckvVar;
        boolean z4;
        float f;
        boolean z5;
        boolean z6;
        int i5 = i & 6;
        bux buxVarC = buxVar.c(579209066);
        if (i5 == 0) {
            i3 = (true != buxVarC.D(z) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            afecVar2 = afecVar;
            i3 |= true != buxVarC.E(afecVar2) ? 16 : 32;
        } else {
            afecVar2 = afecVar;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != buxVarC.D(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != buxVarC.C(brxVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != buxVarC.C(bruVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != buxVarC.C(bmrVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != buxVarC.C(null) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            obj = avpVar;
            i3 |= true != buxVarC.C(obj) ? 33554432 : 67108864;
        } else {
            obj = avpVar;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != buxVarC.C(asfVar) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != buxVarC.E(afehVar) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if (buxVarC.I(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            if (asfVar == null) {
                buxVarC.v(-1960617487);
                Object objS = bvvVar.S();
                if (objS == buw.a) {
                    objS = new asg();
                    bvvVar.ad(objS);
                }
                asfVar2 = (asf) objS;
                bvvVar.Y(false);
            } else {
                buxVarC.v(-1725814362);
                bvvVar.Y(false);
                asfVar2 = asfVar;
            }
            aew aewVarB = rl.b(2, buxVarC);
            bym bymVarI = asl.i(asfVar2, buxVarC, 0);
            if (!z2) {
                aewVar = aewVarB;
                j = bruVar.c;
            } else if (z) {
                aewVar = aewVarB;
                j = bruVar.e;
            } else {
                aewVar = aewVarB;
                j = bruVar.a;
            }
            if (!z2) {
                j2 = j;
                j3 = bruVar.d;
            } else if (z) {
                j2 = j;
                j3 = bruVar.f;
            } else {
                j2 = j;
                j3 = bruVar.b;
            }
            long j4 = j3;
            if (bmrVar == null) {
                buxVarC.v(-1960202708);
                bvvVar.Y(false);
                bymVarA = null;
            } else {
                buxVarC.v(-1725800331);
                bymVarA = bmrVar.a(z2, asfVar2, buxVarC, (((i3 >> 9) & 14) | ((i3 >> 12) & 896)) & 910);
                bvvVar.Y(false);
            }
            float f2 = bymVarA != null ? ((dlj) bymVarA.a()).a : BitmapDescriptorFactory.HUE_RED;
            boolean zBooleanValue = ((Boolean) bymVarI.a()).booleanValue();
            buxVarC.v(-585100128);
            if (zBooleanValue) {
                ckvVar = brxVar.b;
                z4 = z;
            } else if (z) {
                ckvVar = brxVar.c;
                z4 = true;
            } else {
                ckvVar = brxVar.a;
                z4 = false;
            }
            boolean z7 = brxVar.a instanceof bcm;
            if (z7 && (brxVar.b instanceof bcm) && (brxVar.c instanceof bcm)) {
                buxVarC.v(-1740235478);
                f = f2;
                bvvVar.ab(359505585, brxVar, 0, null);
                ckvVar.getClass();
                aew aewVar2 = aewVar;
                boolean zC = buxVarC.C(aewVar2);
                Object objS2 = bvvVar.S();
                if (zC || objS2 == buw.a) {
                    objS2 = new ksx((bcm) ckvVar, aewVar2);
                    bvvVar.ad(objS2);
                }
                ksx ksxVar = (ksx) objS2;
                Object objS3 = bvvVar.S();
                Object obj2 = buw.a;
                if (objS3 == obj2) {
                    objS3 = afpt.r(-1, 0, 6);
                    bvvVar.ad(objS3);
                }
                aixl aixlVar = (aixl) objS3;
                boolean zE = buxVarC.E(aixlVar) | buxVarC.C(ckvVar);
                Object objS4 = bvvVar.S();
                if (zE || objS4 == obj2) {
                    objS4 = new bsh(aixlVar, ckvVar, 0);
                    bvvVar.ad(objS4);
                }
                buxVarC.r((afdr) objS4);
                boolean zE2 = buxVarC.E(aixlVar) | buxVarC.C(ksxVar);
                Object objS5 = bvvVar.S();
                if (zE2 || objS5 == obj2) {
                    objS5 = new bsj(aixlVar, ksxVar, null, 1, null);
                    bvvVar.ad(objS5);
                }
                bvq.f(ksxVar, aixlVar, (afeg) objS5, buxVarC);
                dlg dlgVar = (dlg) buxVarC.f(dbc.d);
                ksxVar.c = dlgVar;
                boolean zC2 = buxVarC.C(dlgVar) | buxVarC.C(ksxVar);
                Object objS6 = bvvVar.S();
                if (zC2 || objS6 == obj2) {
                    objS6 = new bsi(ksxVar, 1);
                    bvvVar.ad(objS6);
                }
                ckvVar = (bsi) objS6;
                bvvVar.Y(false);
                bvvVar.Y(false);
                bvvVar.Y(false);
                z5 = false;
            } else {
                f = f2;
                aew aewVar3 = aewVar;
                if (z7 && (brxVar.b instanceof bcm) && (brxVar.c instanceof bcm)) {
                    buxVarC.v(-1740097652);
                    bvvVar.ab(359510031, brxVar, 0, null);
                    ckvVar.getClass();
                    boolean zC3 = buxVarC.C(aewVar3);
                    Object objS7 = bvvVar.S();
                    if (zC3 || objS7 == buw.a) {
                        objS7 = new ksx((bcm) ckvVar, aewVar3);
                        bvvVar.ad(objS7);
                    }
                    ksx ksxVar2 = (ksx) objS7;
                    Object objS8 = bvvVar.S();
                    Object obj3 = buw.a;
                    if (objS8 == obj3) {
                        objS8 = afpt.r(-1, 0, 6);
                        bvvVar.ad(objS8);
                    }
                    aixl aixlVar2 = (aixl) objS8;
                    boolean zE3 = buxVarC.E(aixlVar2) | buxVarC.C(ckvVar);
                    Object objS9 = bvvVar.S();
                    if (zE3 || objS9 == obj3) {
                        objS9 = new bsh(aixlVar2, ckvVar, 2);
                        bvvVar.ad(objS9);
                    }
                    buxVarC.r((afdr) objS9);
                    boolean zE4 = buxVarC.E(aixlVar2) | buxVarC.C(ksxVar2);
                    Object objS10 = bvvVar.S();
                    if (zE4 || objS10 == obj3) {
                        objS10 = new bsj(aixlVar2, ksxVar2, null, 0, null, null);
                        bvvVar.ad(objS10);
                    }
                    bvq.f(ksxVar2, aixlVar2, (afeg) objS10, buxVarC);
                    dlg dlgVar2 = (dlg) buxVarC.f(dbc.d);
                    ksxVar2.c = dlgVar2;
                    boolean zC4 = buxVarC.C(dlgVar2) | buxVarC.C(ksxVar2);
                    Object objS11 = bvvVar.S();
                    if (zC4 || objS11 == obj3) {
                        z5 = false;
                        objS11 = new bsi(ksxVar2, 0, null);
                        bvvVar.ad(objS11);
                    } else {
                        z5 = false;
                    }
                    ckvVar = (bsi) objS11;
                    bvvVar.Y(z5);
                } else {
                    z5 = false;
                    buxVarC.v(-1740015006);
                }
                bvvVar.Y(z5);
                bvvVar.Y(z5);
            }
            Object objS12 = bvvVar.S();
            Object obj4 = buw.a;
            if (objS12 == obj4) {
                objS12 = new bmk(14);
                bvvVar.ad(objS12);
            }
            final cfy cfyVarA = dds.a(cfyVar, z5, (afec) objS12);
            final cct cctVarI = bxc.i(-1671845632, true, new brw(j4, obj, afehVar, 0), buxVarC);
            if (asfVar2 == null) {
                buxVarC.v(643383721);
                Object objS13 = bvvVar.S();
                if (objS13 == obj4) {
                    objS13 = new asg();
                    bvvVar.ad(objS13);
                }
                asfVar2 = (asf) objS13;
                z6 = false;
            } else {
                z6 = false;
                buxVarC.v(-533435666);
            }
            bvvVar.Y(z6);
            bvf bvfVar = bqp.a;
            final float f3 = ((dlj) buxVarC.f(bvfVar)).a + BitmapDescriptorFactory.HUE_RED;
            buxVar2 = buxVarC;
            final long j5 = j2;
            final float f4 = f;
            final ckv ckvVar2 = ckvVar;
            final asf asfVar3 = asfVar2;
            czz.an(new bxe[]{bnm.a.b(new cjv(j4)), bvfVar.b(new dlj(f3))}, bxc.i(-1839065134, true, new afeg() { // from class: bqo
                @Override // defpackage.afeg
                public final Object invoke(Object obj5, Object obj6) {
                    bux buxVar3 = (bux) obj5;
                    int iIntValue = ((Integer) obj6).intValue();
                    if (buxVar3.I((iIntValue & 3) != 2, iIntValue & 1)) {
                        float f5 = f4;
                        afec afecVar3 = afecVar2;
                        boolean z8 = z2;
                        boolean z9 = z;
                        float f6 = f3;
                        long j6 = j5;
                        ckv ckvVar3 = ckvVar2;
                        asf asfVar4 = asfVar3;
                        cfy cfyVarA2 = cfyVarA.a(bop.a);
                        bvf bvfVar2 = bpe.a;
                        Object obj7 = ((kgx) buxVar3.f(bvfVar2)).a;
                        cfv cfvVar = cfy.e;
                        cfy cfyVarA3 = bqp.a(cfyVarA2.a(cfvVar), ckvVar3, bnh.c(((bog) buxVar3.f(boh.a)).a, j6, f6, buxVar3), null, ((dlg) buxVar3.f(dbc.d)).eA(f5));
                        Object obj8 = ((kgx) buxVar3.f(bvfVar2)).a;
                        akm akmVarA = bpe.a(false, BitmapDescriptorFactory.HUE_RED, 0L, ckvVar3, true, 215);
                        cfy cfyVarA4 = cfyVarA3.a(akmVarA instanceof akm ? new bci(z9, asfVar4, akmVarA, z8, afecVar3) : akmVarA == null ? new bci(z9, asfVar4, null, z8, afecVar3) : asfVar4 != null ? aki.a(cfvVar, asfVar4, akmVarA).a(new bci(z9, asfVar4, null, z8, afecVar3)) : new cfu(new bcj(akmVarA, z9, z8, afecVar3))).a(new bso(new bes(19)));
                        ctp ctpVarB = atk.b(cfl.a, true);
                        long jB = buxVar3.b();
                        long j7 = jB ^ (jB >>> 32);
                        ccx ccxVarN = buxVar3.N();
                        cfy cfyVarJ = bzi.j(buxVar3, cfyVarA4);
                        afdr afdrVar = cwb.a;
                        buxVar3.M();
                        buxVar3.w();
                        if (buxVar3.G()) {
                            buxVar3.j(afdrVar);
                        } else {
                            buxVar3.y();
                        }
                        afeg afegVar = cctVarI;
                        byq.c(buxVar3, ctpVarB, cwb.e);
                        byq.c(buxVar3, ccxVarN, cwb.d);
                        byq.c(buxVar3, Integer.valueOf((int) j7), cwb.f);
                        buxVar3.i(afak.a, new alx(cwb.g, 16));
                        byq.c(buxVar3, cfyVarJ, cwb.c);
                        afegVar.invoke(buxVar3, 0);
                        buxVar3.n();
                    } else {
                        buxVar3.s();
                    }
                    return afak.a;
                }
            }, buxVar2), buxVar2, 56);
            z3 = z4;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            z3 = z;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kuh(z3, afecVar, cfyVar, z2, brxVar, bruVar, bmrVar, avpVar, asfVar, afehVar, i, i2, 1);
        }
    }

    public static final void i(cfy cfyVar, long j, long j2, afeh afehVar, afeg afegVar, afeg afegVar2, bux buxVar, int i) {
        cfy cfyVar2;
        int i2;
        bux buxVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1955286154);
        int i4 = 2;
        if (i3 == 0) {
            cfyVar2 = cfyVar;
            i2 = (true != buxVarC.C(cfyVar2) ? 2 : 4) | i;
        } else {
            cfyVar2 = cfyVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.B(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.B(j2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(afehVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.E(afegVar2) ? 65536 : 131072;
        }
        if (buxVarC.I((74899 & i2) != 74898, i2 & 1)) {
            buxVar2 = buxVarC;
            bqp.b(afp.Q(cfyVar2), null, j, j2, BitmapDescriptorFactory.HUE_RED, null, bxc.i(830280655, true, new brf(afegVar2, afegVar, afehVar, i4), buxVarC), buxVar2, 114);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new brj(cfyVar, j, j2, afehVar, afegVar, afegVar2, i, 1);
        }
    }

    public static final void j(cfy cfyVar, long j, long j2, afeh afehVar, afeg afegVar, afeg afegVar2, bux buxVar, int i) {
        cfy cfyVar2;
        int i2;
        bux buxVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(148841506);
        if (i3 == 0) {
            cfyVar2 = cfyVar;
            i2 = (true != buxVarC.C(cfyVar2) ? 2 : 4) | i;
        } else {
            cfyVar2 = cfyVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.B(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.B(j2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(afehVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.E(afegVar2) ? 65536 : 131072;
        }
        if (buxVarC.I((74899 & i2) != 74898, i2 & 1)) {
            buxVar2 = buxVarC;
            bqp.b(afp.Q(cfyVar2), null, j, j2, BitmapDescriptorFactory.HUE_RED, null, bxc.i(-1815327065, true, new brf(afegVar2, afegVar, afehVar, 3), buxVarC), buxVar2, 114);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new brj(cfyVar, j, j2, afehVar, afegVar, afegVar2, i, 0);
        }
    }

    public static final void k(int i, cfy cfyVar, long j, long j2, afeh afehVar, afeg afegVar, afeg afegVar2, bux buxVar, int i2) {
        int i3;
        bux buxVar2;
        long j3;
        long j4;
        long jA;
        long jB;
        int i4 = i2 & 6;
        bux buxVarC = buxVar.c(-1012974221);
        if (i4 == 0) {
            i3 = (true != buxVarC.A(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != buxVarC.E(afehVar) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != buxVarC.E(afegVar) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != buxVarC.E(afegVar2) ? 524288 : 1048576;
        }
        if (buxVarC.I((599187 & i3) != 599186, i3 & 1)) {
            int i5 = i3 & (-8065);
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i2 & 1) == 0 || buxVarC.F()) {
                jA = bre.a(buxVarC);
                jB = bre.b(buxVarC);
            } else {
                buxVarC.s();
                jA = j;
                jB = j2;
            }
            buxVarC.l();
            buxVar2 = buxVarC;
            i(cfyVar, jA, jB, afehVar, afegVar, afegVar2, buxVar2, (i5 >> 3) & 523278);
            j3 = jA;
            j4 = jB;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            j3 = j;
            j4 = j2;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bri(i, cfyVar, j3, j4, afehVar, afegVar, afegVar2, i2, 1);
        }
    }

    public static final void l(int i, cfy cfyVar, long j, long j2, afeh afehVar, afeg afegVar, afeg afegVar2, bux buxVar, int i2) {
        int i3;
        afeg afegVar3;
        bux buxVar2;
        cfy cfyVar2;
        long j3;
        long j4;
        afeh afehVar2;
        afeg afegVar4;
        afeh afehVarI;
        afeg afegVar5;
        long j5;
        cfy cfyVar3;
        long j6;
        int i4 = i2 & 6;
        bux buxVarC = buxVar.c(1445190381);
        if (i4 == 0) {
            i3 = (true != buxVarC.A(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i5 = i3 | 48;
        if ((i2 & 384) == 0) {
            i5 = i3 | 176;
        }
        if ((i2 & 3072) == 0) {
            i5 |= 1024;
        }
        int i6 = 221184 | i5;
        if ((1572864 & i2) == 0) {
            afegVar3 = afegVar2;
            i6 |= true != buxVarC.E(afegVar3) ? 524288 : 1048576;
        } else {
            afegVar3 = afegVar2;
        }
        int i7 = 0;
        if (buxVarC.I((599187 & i6) != 599186, i6 & 1)) {
            int i8 = i6 & (-8065);
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i2 & 1) == 0 || buxVarC.F()) {
                cfv cfvVar = cfy.e;
                long jA = bre.a(buxVarC);
                long jB = bre.b(buxVarC);
                afehVarI = bxc.i(906699528, true, new brh(i, i7), buxVarC);
                afegVar5 = bnk.a;
                j5 = jB;
                cfyVar3 = cfvVar;
                j6 = jA;
            } else {
                buxVarC.s();
                cfyVar3 = cfyVar;
                j6 = j;
                j5 = j2;
                afehVarI = afehVar;
                afegVar5 = afegVar;
            }
            buxVarC.l();
            buxVar2 = buxVarC;
            j(cfyVar3, j6, j5, afehVarI, afegVar5, afegVar3, buxVar2, (i8 >> 3) & 523278);
            cfyVar2 = cfyVar3;
            j3 = j6;
            j4 = j5;
            afehVar2 = afehVarI;
            afegVar4 = afegVar5;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            cfyVar2 = cfyVar;
            j3 = j;
            j4 = j2;
            afehVar2 = afehVar;
            afegVar4 = afegVar;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bri(i, cfyVar2, j3, j4, afehVar2, afegVar4, afegVar2, i2, 0);
        }
    }

    public static int m(ctw ctwVar, csq csqVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) list.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new ctu((csp) list2.get(i3), 2, 2, 1));
            }
            arrayList.add(arrayList2);
        }
        return ctwVar.e(new css(csqVar, csqVar.p()), arrayList, dlf.d(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY)).b();
    }

    public static int n(ctw ctwVar, csq csqVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) list.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new ctu((csp) list2.get(i3), 2, 1, 1));
            }
            arrayList.add(arrayList2);
        }
        return ctwVar.e(new css(csqVar, csqVar.p()), arrayList, dlf.d(0, Alert.DURATION_SHOW_INDEFINITELY, 0, i)).c();
    }

    public static int o(ctw ctwVar, csq csqVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) list.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new ctu((csp) list2.get(i3), 1, 2, 1));
            }
            arrayList.add(arrayList2);
        }
        return ctwVar.e(new css(csqVar, csqVar.p()), arrayList, dlf.d(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY)).b();
    }

    public static int p(ctw ctwVar, csq csqVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) list.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new ctu((csp) list2.get(i3), 1, 1, 1));
            }
            arrayList.add(arrayList2);
        }
        return ctwVar.e(new css(csqVar, csqVar.p()), arrayList, dlf.d(0, Alert.DURATION_SHOW_INDEFINITELY, 0, i)).c();
    }

    public static final int q(csy csyVar, csq csqVar, csp cspVar, int i) {
        return csyVar.h(new css(csqVar, csqVar.p()), new ctu(cspVar, 2, 2, 0), dlf.d(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY)).b();
    }

    public static final int r(csy csyVar, csq csqVar, csp cspVar, int i) {
        return csyVar.h(new css(csqVar, csqVar.p()), new ctu(cspVar, 2, 1, 0), dlf.d(0, Alert.DURATION_SHOW_INDEFINITELY, 0, i)).c();
    }

    public static final int s(csy csyVar, csq csqVar, csp cspVar, int i) {
        return csyVar.h(new css(csqVar, csqVar.p()), new ctu(cspVar, 1, 2, 0), dlf.d(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY)).b();
    }

    public static final int t(csy csyVar, csq csqVar, csp cspVar, int i) {
        return csyVar.h(new css(csqVar, csqVar.p()), new ctu(cspVar, 1, 1, 0), dlf.d(0, Alert.DURATION_SHOW_INDEFINITELY, 0, i)).c();
    }

    public static int u(ctp ctpVar, csq csqVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ctu((csp) list.get(i2), 2, 2, 1));
        }
        return ctpVar.e(new css(csqVar, csqVar.p()), arrayList, dlf.d(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY)).b();
    }

    public static int v(ctp ctpVar, csq csqVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ctu((csp) list.get(i2), 2, 1, 1));
        }
        return ctpVar.e(new css(csqVar, csqVar.p()), arrayList, dlf.d(0, Alert.DURATION_SHOW_INDEFINITELY, 0, i)).c();
    }

    public static int w(ctp ctpVar, csq csqVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ctu((csp) list.get(i2), 1, 2, 1));
        }
        return ctpVar.e(new css(csqVar, csqVar.p()), arrayList, dlf.d(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY)).b();
    }

    public static int x(ctp ctpVar, csq csqVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ctu((csp) list.get(i2), 1, 1, 1));
        }
        return ctpVar.e(new css(csqVar, csqVar.p()), arrayList, dlf.d(0, Alert.DURATION_SHOW_INDEFINITELY, 0, i)).c();
    }

    public static final cxl y(cxl cxlVar) {
        cxb cxbVarL = cxlVar.L();
        while (true) {
            cxb cxbVarL2 = cxbVarL.l();
            cxb cxbVar = null;
            if ((cxbVarL2 != null ? cxbVarL2.j : null) == null) {
                cxl cxlVarC = cxbVarL.q().C();
                cxlVarC.getClass();
                return cxlVarC;
            }
            cxb cxbVarL3 = cxbVarL.l();
            if (cxbVarL3 != null) {
                cxbVar = cxbVarL3.j;
            }
            cxbVar.getClass();
            cxb cxbVarL4 = cxbVarL.l();
            cxbVarL4.getClass();
            cxbVarL = cxbVarL4.j;
            cxbVarL.getClass();
        }
    }
}
