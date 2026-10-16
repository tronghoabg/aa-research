package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telecom.CallAudioState;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.EdgeEffect;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public class ebf {
    public static odj A() {
        return (odj) mki.a.i(odj.class);
    }

    public static cfy B(cfy cfyVar, nok nokVar, asf asfVar) {
        cfyVar.getClass();
        nokVar.getClass();
        asfVar.getClass();
        return cfyVar.a(new ocz(nokVar, asfVar));
    }

    public static long C(boolean z, boolean z2, oax oaxVar) {
        return z ? oaxVar.a() : z2 ? oaxVar.d() : oaxVar.c();
    }

    public static void D(obb obbVar, afdr afdrVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-2105880744);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(obbVar) : buxVarC.E(obbVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            boolean z = (i2 & 14) == 4 || ((i2 & 8) != 0 && buxVarC.E(obbVar));
            boolean z2 = (i2 & 112) == 32;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            boolean z3 = z | z2;
            int i4 = 14;
            if (z3 || objS == buw.a) {
                objS = new erl(obbVar, afdrVar, i4, (byte[]) null);
                bvvVar.ad(objS);
            }
            afp.z(cfyVar, (afec) objS, buxVarC, (i2 >> 6) & 14);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kmg((Object) obbVar, (Object) afdrVar, cfyVar, i, 14);
        }
    }

    public static void E(afdr afdrVar, afdr afdrVar2, boolean z, cfy cfyVar, bux buxVar, int i) {
        afdr afdrVar3;
        int i2;
        boolean z2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(880933296);
        if (i3 == 0) {
            afdrVar3 = afdrVar;
            i2 = (true != buxVarC.E(afdrVar3) ? 2 : 4) | i;
        } else {
            afdrVar3 = afdrVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afdrVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= true != buxVarC.D(z2) ? 128 : 256;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 1024 : 2048;
        }
        if (buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            obi obiVar = oay.a;
            obi obiVar2 = oay.b;
            cfy cfyVarG = cjn.g(cfyVar, buxVarC.f(dbc.i) == dlr.b ? -1.0f : 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, false, 0, 1048574);
            boolean z3 = (i2 & 14) == 4;
            boolean zE = ((i2 & 896) == 256) | ((i2 & 112) == 32) | z3 | buxVarC.E(obiVar2);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zE || objS == buw.a) {
                objS = new hkk(afdrVar3, afdrVar2, z2, obiVar2, 2);
                bvvVar.ad(objS);
            }
            afp.z(cfyVarG, (afec) objS, buxVarC, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hkv((Object) afdrVar, (Object) afdrVar2, z, cfyVar, i, 7);
        }
    }

    public static void F(final obi obiVar, afdr afdrVar, final boolean z, afdr afdrVar2, afdr afdrVar3, cfy cfyVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        final oax oaxVar;
        int i3;
        bvv bvvVar;
        boolean z2;
        obiVar.getClass();
        int i4 = i & 6;
        bux buxVarC = buxVar.c(1462487175);
        if (i4 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(obiVar) : buxVarC.E(obiVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(afdrVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.E(afdrVar3) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.C("") ? 524288 : 1048576;
        }
        if (buxVarC.I((599187 & i2) != 599186, i2 & 1)) {
            boolean z3 = buxVarC.f(dbc.i) == dlr.b;
            final Integer num = (Integer) afdrVar.invoke();
            oax oaxVar2 = (oax) afdrVar3.invoke();
            final boolean zBooleanValue = ((Boolean) afdrVar2.invoke()).booleanValue();
            ctp ctpVarB = atk.b(cfl.a, false);
            bvv bvvVar2 = (bvv) buxVarC;
            long j = bvvVar2.u;
            long j2 = j ^ (j >>> 32);
            ccx ccxVarAh = bvvVar2.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
            afdr afdrVar4 = cwb.a;
            buxVarC.w();
            if (bvvVar2.t) {
                buxVarC.j(afdrVar4);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf((int) j2), cwb.f);
            buxVarC.i(afak.a, new alx(cwb.g, 16));
            byq.c(buxVarC, cfyVarJ, cwb.c);
            atn atnVar = atn.a;
            cfv cfvVar = cfy.e;
            cfy cfyVarC = awd.c(cfvVar, 1.0f);
            boolean zD = buxVarC.D(zBooleanValue) | ((i2 & 896) == 256) | buxVarC.E(oaxVar2) | ((i2 & 14) == 4 || ((i2 & 8) != 0 && buxVarC.E(obiVar))) | buxVarC.C(num) | buxVarC.D(z3);
            Object objS = bvvVar2.S();
            if (zD || objS == buw.a) {
                final boolean z4 = z3;
                oaxVar = oaxVar2;
                i3 = i2;
                afec afecVar = new afec() { // from class: obm
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.afec
                    public final Object invoke(Object obj) throws Throwable {
                        cma cmaVar;
                        long j3;
                        cma cmaVar2;
                        cmd cmdVar = (cmd) obj;
                        cmdVar.getClass();
                        boolean z5 = zBooleanValue;
                        boolean z6 = z;
                        oax oaxVar3 = oaxVar;
                        long jC = ebf.C(z5, z6, oaxVar3);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (cmdVar.o() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cmdVar.o() & 4294967295L));
                        obi obiVar2 = obiVar;
                        float fA = obiVar2.a(fIntBitsToFloat, fIntBitsToFloat2);
                        cma cmaVarR = cmdVar.r();
                        long jA = cmaVarR.a();
                        cmaVarR.b().g();
                        try {
                            cmaVarR.c.k(fA, fA, 0L);
                            if (!z5) {
                                czz.aJ(cmdVar, obiVar2.a, jC, null, 60);
                                Integer num2 = num;
                                if (num2 != null) {
                                    try {
                                        if (num2.intValue() > 0) {
                                            double dCeil = Math.ceil((num2.intValue() / 100.0f) * 24.0f);
                                            boolean z7 = z4;
                                            float f = (float) dCeil;
                                            float f2 = !z7 ? BitmapDescriptorFactory.HUE_RED : 24.0f - f;
                                            float f3 = true != z7 ? f : 24.0f;
                                            try {
                                                cma cmaVarR2 = cmdVar.r();
                                                long jA2 = cmaVarR2.a();
                                                cmaVarR2.b().g();
                                                try {
                                                    cmaVarR2.c.h(f2, BitmapDescriptorFactory.HUE_RED, f3, 13.0f, 1);
                                                    cmaVar2 = cmaVarR;
                                                    j3 = jA2;
                                                    try {
                                                        czz.H(cmdVar, oaxVar3.a(), 0L, (Float.floatToRawIntBits(24.0f) << 32) | (Float.floatToRawIntBits(13.0f) & 4294967295L), (Float.floatToRawIntBits(4.0f) << 32) | (Float.floatToRawIntBits(4.0f) & 4294967295L), BitmapDescriptorFactory.HUE_RED, 240);
                                                        cmaVarR2.b().e();
                                                        cmaVarR2.h(j3);
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        cmaVarR2.b().e();
                                                        cmaVarR2.h(j3);
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    j3 = jA2;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                cmaVar = obj;
                                                cmaVar.b().e();
                                                cmaVar.h(jA);
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        obj = cmaVarR;
                                    }
                                }
                                cmaVar2.b().e();
                                cmaVar2.h(jA);
                                return afak.a;
                            }
                            czz.aJ(cmdVar, obiVar2.a, jC, null, 60);
                            cmaVar2 = cmaVarR;
                            cmaVar2.b().e();
                            cmaVar2.h(jA);
                            return afak.a;
                        } catch (Throwable th5) {
                            th = th5;
                            cmaVar = cmaVarR;
                        }
                    }
                };
                bvvVar2.ad(afecVar);
                objS = afecVar;
            } else {
                oaxVar = oaxVar2;
                i3 = i2;
            }
            afp.A(cfyVarC, (afec) objS, buxVarC, ((i3 >> 15) & 112) | 6);
            if (!z || num == null) {
                buxVar2 = buxVarC;
                bvvVar = bvvVar2;
                z2 = true;
                buxVar2.v(-29129259);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-30088523);
                String strValueOf = String.valueOf(num.intValue());
                long jE = oaxVar.e();
                cfn cfnVar = cfl.e;
                cfy cfyVarO = awd.o(atnVar.a(cfvVar, cfnVar), cfnVar, true);
                long jFloatToRawIntBits = Float.floatToRawIntBits(12.0f);
                dlu[] dluVarArr = dlt.a;
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(-0.02f);
                die dieVar = die.k;
                int i5 = did.a;
                List listAsList = Arrays.asList(new dii(R.font.google_sans_flex, dieVar, 0, new dic(new dib(600), new dia("wdth", 100.0f), new dia("GRAD", BitmapDescriptorFactory.HUE_RED), new dia("ROND", 100.0f), new dia("slnt", BitmapDescriptorFactory.HUE_RED))));
                listAsList.getClass();
                bvvVar = bvvVar2;
                z2 = true;
                brp.b(strValueOf, cfyVarO, jE, 0L, null, 0L, null, 0L, 0, false, 0, 0, new dfw(0L, (jFloatToRawIntBits & 4294967295L) | 4294967296L, null, new dhv(listAsList), (jFloatToRawIntBits2 & 4294967295L) | 8589934592L, 3, 0L, 16744285), buxVarC, 0, 0, 131064);
                buxVar2 = buxVarC;
                bvvVar.Y(false);
            }
            bvvVar.Y(z2);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new boa(obiVar, afdrVar, z, afdrVar2, afdrVar3, cfyVar, i, 11);
        }
    }

    public static void G(obb obbVar, afdr afdrVar, afdr afdrVar2, boolean z, afdr afdrVar3, cfy cfyVar, bux buxVar, int i) {
        int i2;
        afdr afdrVar4;
        afdr afdrVar5;
        boolean z2;
        afdrVar.getClass();
        afdrVar2.getClass();
        afdrVar3.getClass();
        cfyVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-779934128);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(obbVar) : buxVarC.E(obbVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            afdrVar4 = afdrVar;
            i2 |= true != buxVarC.E(afdrVar4) ? 16 : 32;
        } else {
            afdrVar4 = afdrVar;
        }
        if ((i & 384) == 0) {
            afdrVar5 = afdrVar2;
            i2 |= true != buxVarC.E(afdrVar5) ? 128 : 256;
        } else {
            afdrVar5 = afdrVar2;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= true != buxVarC.D(z2) ? 1024 : 2048;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.E(afdrVar3) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.C("") ? 524288 : 1048576;
        }
        int i5 = i2;
        if (buxVarC.I((599187 & i5) != 599186, i5 & 1)) {
            obg obgVar = new obg(0);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new nir(i4);
                bvvVar.ad(objS);
            }
            cfy cfyVarA = cfyVar.a(new csu((afeh) objS));
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = new nna(13);
                bvvVar.ad(objS2);
            }
            cfy cfyVarA2 = cfyVarA.a(new cjq((afec) objS2));
            long j = bvvVar.u;
            long j2 = j ^ (j >>> 32);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarA2);
            afdr afdrVar6 = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar6);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, obgVar, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf((int) j2), cwb.f);
            buxVarC.i(afak.a, new alx(cwb.g, 16));
            byq.c(buxVarC, cfyVarJ, cwb.c);
            obi obiVar = oay.a;
            int i6 = i5 >> 3;
            int i7 = i6 & 896;
            boolean z3 = z2;
            F(oay.a, afdrVar4, z3, afdrVar5, afdrVar3, new csv(obf.a), buxVarC, (i5 & 112) | 196616 | i7 | ((i5 << 3) & 7168) | (57344 & i5) | (3670016 & i5));
            if (obbVar != null) {
                buxVarC.v(930502253);
                D(obbVar, afdrVar3, new csv(new obd(obbVar)), buxVarC, (i5 & 14) | ((i5 >> 9) & 112));
                bvvVar.Y(false);
            } else {
                buxVarC.v(930744146);
                E(afdrVar3, afdrVar2, z, new csv(obe.a), buxVarC, ((i5 >> 12) & 14) | 3072 | (i6 & 112) | i7);
                bvvVar.Y(false);
            }
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new boa(obbVar, afdrVar, afdrVar2, z, afdrVar3, cfyVar, i, 10);
        }
    }

    public static void H(final cfy cfyVar, final int i, final boolean z, final boolean z2, final boolean z3, final boolean z4, String str, bux buxVar, final int i2) {
        cfy cfyVar2;
        int i3;
        final String str2;
        bux buxVarC = buxVar.c(-1746762028);
        if ((i2 & 6) == 0) {
            cfyVar2 = cfyVar;
            i3 = (true != buxVarC.C(cfyVar2) ? 2 : 4) | i2;
        } else {
            cfyVar2 = cfyVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != buxVarC.A(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != buxVarC.D(z) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != buxVarC.D(z2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != buxVarC.D(z3) ? 8192 : 16384;
        }
        int i4 = i3 | 1572864;
        if (buxVarC.I((533651 & i4) != 533650, i4 & 1)) {
            final boolean zBl = ca.bl(buxVarC);
            boolean z5 = (i4 & 896) == 256;
            boolean z6 = (i4 & 7168) == 2048;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if ((z5 | z6) || objS == buw.a) {
                objS = z ? oaz.a : z2 ? oba.a : null;
                bvvVar.ad(objS);
            }
            obb obbVar = (obb) objS;
            final boolean z7 = i <= 20 && !z;
            final boolean z8 = !z7 && i >= 95;
            boolean zD = buxVarC.D(zBl) | z5 | z6 | buxVarC.D(z7);
            Object objS2 = bvvVar.S();
            if (zD || objS2 == buw.a) {
                objS2 = new afdr() { // from class: obn
                    @Override // defpackage.afdr
                    public final Object invoke() {
                        boolean z9 = zBl;
                        boolean z10 = z7;
                        boolean z11 = z;
                        boolean z12 = z2;
                        return z9 ? z10 ? oap.a : z11 ? oan.a : z12 ? oaq.a : oao.a : z10 ? oau.a : z11 ? oas.a : z12 ? oav.a : oat.a;
                    }
                };
                bvvVar.ad(objS2);
            }
            int i5 = i4 & 112;
            afdr afdrVar = (afdr) objS2;
            Object objS3 = bvvVar.S();
            if (i5 == 32 || objS3 == buw.a) {
                objS3 = new afdr() { // from class: obj
                    @Override // defpackage.afdr
                    public final Object invoke() {
                        return Integer.valueOf(i);
                    }
                };
                bvvVar.ad(objS3);
            }
            afdr afdrVar2 = (afdr) objS3;
            boolean zD2 = buxVarC.D(z8);
            Object objS4 = bvvVar.S();
            if (zD2 || objS4 == buw.a) {
                objS4 = new afdr() { // from class: obk
                    @Override // defpackage.afdr
                    public final Object invoke() {
                        return Boolean.valueOf(z8);
                    }
                };
                bvvVar.ad(objS4);
            }
            G(obbVar, afdrVar2, (afdr) objS4, z3, afdrVar, cfyVar2, buxVarC, ((i4 >> 3) & 7168) | ((i4 << 15) & 458752) | (i4 & 3670016));
            str2 = "";
        } else {
            buxVarC.s();
            str2 = str;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: obl
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    ((Integer) obj2).intValue();
                    cfy cfyVar3 = cfyVar;
                    int i6 = i;
                    boolean z9 = z;
                    int i7 = i2 | 1;
                    int i8 = 306783378 & i7;
                    int i9 = 613566756 & i7;
                    ebf.H(cfyVar3, i6, z9, z2, z3, z4, str2, buxVar2, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 + i8) & i9));
                    return afak.a;
                }
            };
        }
    }

    public static long I(obb obbVar, float f) {
        float fB = obbVar.b() * f;
        float fA = obbVar.a() * f;
        return (Float.floatToRawIntBits(fA) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
    }

    public static boolean J(boolean z, int i, boolean z2, boolean z3) {
        if (z) {
            return true;
        }
        if (z3) {
            return false;
        }
        return i > 0 || z2;
    }

    public static String K(erb erbVar, int i) {
        erbVar.getClass();
        return i <= 16777215 ? String.valueOf(i) : erbVar.C(i);
    }

    public static euq L(erb erbVar, euz euzVar, Bundle bundle, eps epsVar, evn evnVar, String str, Bundle bundle2) {
        epsVar.getClass();
        return new euq(erbVar, euzVar, bundle, epsVar, evnVar, str, bundle2);
    }

    public static /* synthetic */ euq M(erb erbVar, euz euzVar, Bundle bundle, eps epsVar, evn evnVar) {
        String string = UUID.randomUUID().toString();
        string.getClass();
        return L(erbVar, euzVar, bundle, epsVar, evnVar, string, null);
    }

    public static lds N(View view) {
        lds ldsVar = (lds) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (ldsVar != null) {
            return ldsVar;
        }
        lds ldsVar2 = new lds((char[]) null, (byte[]) null);
        view.setTag(R.id.pooling_container_listener_holder_tag, ldsVar2);
        return ldsVar2;
    }

    public static ecy a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        ecy ecyVar = new ecy(rootWindowInsets);
        ecyVar.u(ecyVar);
        ecyVar.r(view.getRootView());
        return ecyVar;
    }

    public static airp b(ViewGroup viewGroup) {
        viewGroup.getClass();
        return new ebp(viewGroup);
    }

    public static float e(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return eee.b(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public static EdgeEffect f(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? eee.c(context, attributeSet) : new EdgeEffect(context);
    }

    public static void fJ(View view) {
        Iterator itA = new afbb(new nid(view, (afck) null, 1), 3).a();
        while (itA.hasNext()) {
            N((View) itA.next()).Q();
        }
    }

    public static float fK(EdgeEffect edgeEffect) {
        return Build.VERSION.SDK_INT >= 31 ? eee.a(edgeEffect) : BitmapDescriptorFactory.HUE_RED;
    }

    public static airp g(eva evaVar) {
        return afrg.f(evaVar, new dmw(17));
    }

    public static airp h(euz euzVar) {
        euzVar.getClass();
        return afrg.f(euzVar, new dmw(16));
    }

    public static erm i(erq erqVar, afhe afheVar, esc escVar) {
        try {
            try {
                return erqVar.c(afheVar, escVar);
            } catch (AbstractMethodError unused) {
                Class<?> jClass = ((afer) afheVar).getJClass();
                jClass.getClass();
                return erqVar.b(jClass, escVar);
            }
        } catch (AbstractMethodError unused2) {
            Class<?> jClass2 = ((afer) afheVar).getJClass();
            jClass2.getClass();
            return erqVar.a(jClass2);
        }
    }

    public static ohs j() {
        return (ohs) mki.a.i(ohs.class);
    }

    public static void k(ohs ohsVar, rqx rqxVar) {
        ohsVar.F(rqxVar.l());
    }

    @Deprecated
    public void l(KeyEvent keyEvent) {
    }

    public void m(CallAudioState callAudioState) {
    }

    public void n(CarCall carCall) {
    }

    public void o(CarCall carCall) {
    }

    public void p(CarCall carCall) {
    }

    public void q(CarCall carCall, List list) {
    }

    public void r(CarCall carCall, List list) {
    }

    public void s(CarCall carCall, List list) {
    }

    public void t(CarCall carCall, String str) {
    }

    public void u(CarCall carCall, CarCall.Details details) {
    }

    public void v(CarCall carCall, CarCall carCall2) {
    }

    public void w(CarCall carCall, int i) {
    }

    public void x(CarCall carCall, String str) {
    }

    public void y(CarCall carCall, int i) {
    }

    public void z(CarCall carCall, Uri uri) {
    }
}
