package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class bqh {
    public static final float a;
    public static final float b;
    public static final cvg c;

    static {
        roc.aA(4.0f, 44.0f);
        roc.aA(44.0f, 4.0f);
        a = 6.0f;
        b = 2.0f;
        c = new cvg(bqc.a);
    }

    public static final float a(float f, float f2, float f3) {
        float f4 = f2 - f;
        return afpt.d(f4 == BitmapDescriptorFactory.HUE_RED ? 0.0f : (f3 - f) / f4, BitmapDescriptorFactory.HUE_RED, 1.0f);
    }

    public static final void b(cfy cfyVar, bqj bqjVar, boolean z, asf asfVar, afeh afehVar, afeh afehVar2, bux buxVar, int i) {
        cfy cfyVar2;
        int i2;
        boolean z2;
        cfv cfvVar;
        cfy crgVar;
        api apiVar;
        afeh afehVar3 = afehVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(898172835);
        if (i3 == 0) {
            cfyVar2 = cfyVar;
            i2 = (true != buxVarC.C(cfyVar2) ? 2 : 4) | i;
        } else {
            cfyVar2 = cfyVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(bqjVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(asfVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.E(afehVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.E(afehVar3) ? 65536 : 131072;
        }
        int i4 = i2;
        if (buxVarC.I((74899 & i4) != 74898, i4 & 1)) {
            bqjVar.d = buxVarC.f(dbc.i) == dlr.b;
            int i5 = i4 >> 9;
            bym bymVarJ = asl.j(asfVar, buxVarC, i5 & 14);
            bqjVar.e.b(Boolean.valueOf(((Boolean) bymVarJ.a()).booleanValue()));
            if (bqjVar.f == api.b && bqjVar.d) {
                z2 = true;
            } else {
                api apiVar2 = api.a;
                z2 = false;
            }
            cfv cfvVar2 = cfy.e;
            if (z) {
                gix gixVar = new gix(asfVar, bqjVar, 1);
                cql cqlVar = crh.a;
                crgVar = new crg(bqjVar, asfVar, gixVar);
                cfvVar = cfvVar2;
            } else {
                cfvVar = cfvVar2;
                crgVar = cfvVar;
            }
            api apiVar3 = bqjVar.f;
            boolean zK = bqjVar.k();
            boolean zE = buxVarC.E(bqjVar);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zE || objS == buw.a) {
                apiVar = apiVar3;
                objS = new eyq(bqjVar, (afck) null, 1);
                bvvVar.ad(objS);
            } else {
                apiVar = apiVar3;
            }
            cfv cfvVar3 = cfvVar;
            cfy cfyVar3 = crgVar;
            aof aofVar = new aof(bqjVar, apiVar, z, asfVar, zK, aoi.a, (afeh) objS, z2);
            boolean z3 = z2;
            api apiVar4 = bqjVar.f;
            api apiVar5 = api.a;
            cfy cfyVarT = apiVar4 == apiVar5 ? awd.t(new csv(bpw.a), null, 3) : awd.v(new csv(bpw.a), false, 3);
            Object obj = ((kgx) buxVarC.f(bpe.a)).a;
            buxVarC.v(-177303905);
            bvvVar.Y(false);
            dlg dlgVar = (dlg) buxVarC.f(dbc.d);
            cfy cfyVarA = bof.a(cfyVar2);
            api apiVar6 = bqjVar.f;
            cfy cfyVar4 = cfyVarT;
            cfy cfyVarA2 = dds.a(awd.s(cfyVarA, apiVar6 == apiVar5 ? 16.0f : 4.0f, apiVar6 == apiVar5 ? 4.0f : 16.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12), false, new glh(z, bqjVar, 1)).a(bqjVar.f == apiVar5 ? bsd.b : bsd.a);
            float fC = bqjVar.c();
            afgw afgwVar = bqjVar.h;
            cfy cfyVarBf = ca.bf(dds.a(cfyVarA2, true, new ale(fC, new afgw(((Number) afgwVar.d()).floatValue(), ((Number) afgwVar.c()).floatValue()), 0)), z, asfVar);
            float fC2 = bqjVar.c();
            boolean zE2 = buxVarC.E(bqjVar);
            Object objS2 = bvvVar.S();
            if (zE2 || objS2 == buw.a) {
                objS2 = new bml(bqjVar, 7);
                bvvVar.ad(objS2);
            }
            afec afecVar = (afec) objS2;
            afdr afdrVar = bqjVar.a;
            boolean z4 = bqjVar.d;
            cfy cfyVarA3 = ti.h(cfyVarBf, new bqf(z, afgwVar, z3, afecVar, bqjVar.f == apiVar5, fC2, afdrVar)).a(cfyVar3).a(aofVar);
            boolean zD = buxVarC.D(false) | buxVarC.C(bymVarJ) | buxVarC.E(bqjVar);
            Object objS3 = bvvVar.S();
            if (zD || objS3 == buw.a) {
                objS3 = new bra(bqjVar, 1);
                bvvVar.ad(objS3);
            }
            ctp ctpVar = (ctp) objS3;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarA3);
            afdr afdrVar2 = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar2);
            } else {
                buxVarC.y();
            }
            afeg afegVar = cwb.e;
            byq.c(buxVarC, ctpVar, afegVar);
            afeg afegVar2 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar2);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar3 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar3);
            afec afecVar2 = cwb.g;
            byq.b(buxVarC, afecVar2);
            afeg afegVar4 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar4);
            cfy cfyVarA4 = cfyVar4.a(cfvVar3);
            boolean zC = buxVarC.C(bymVarJ) | buxVarC.D(false) | buxVarC.C(dlgVar) | buxVarC.E(bqjVar);
            Object objS4 = bvvVar.S();
            if (zC || objS4 == buw.a) {
                objS4 = new bml(bqjVar, 8);
                bvvVar.ad(objS4);
            }
            cfy cfyVarE = tt.e(cfyVarA4, (afec) objS4);
            cfn cfnVar = cfl.a;
            ctp ctpVarB = atk.b(cfnVar, false);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarE);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar2);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, afegVar);
            byq.c(buxVarC, ccxVarAh2, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar3);
            byq.b(buxVarC, afecVar2);
            byq.c(buxVarC, cfyVarJ2, afegVar4);
            int i6 = (i4 >> 3) & 14;
            afehVar.invoke(bqjVar, buxVarC, Integer.valueOf((i5 & 112) | i6));
            bvvVar.Y(true);
            csv csvVar = new csv(bpw.b);
            ctp ctpVarB2 = atk.b(cfnVar, false);
            int iG3 = a.g(bvvVar.u);
            ccx ccxVarAh3 = bvvVar.ah();
            cfy cfyVarJ3 = bzi.j(buxVarC, csvVar);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar2);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB2, afegVar);
            byq.c(buxVarC, ccxVarAh3, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG3), afegVar3);
            byq.b(buxVarC, afecVar2);
            byq.c(buxVarC, cfyVarJ3, afegVar4);
            afehVar3 = afehVar2;
            afehVar3.invoke(bqjVar, buxVarC, Integer.valueOf(i6 | ((i4 >> 12) & 112)));
            bvvVar.Y(true);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new boa(cfyVar, bqjVar, z, asfVar, afehVar, afehVar3, i, 3);
        }
    }

    public static final void c(asf asfVar, cfy cfyVar, bpv bpvVar, boolean z, long j, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(2115331054);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(asfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(bpvVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.D(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.B(j) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.D(false) ? 65536 : 131072;
        }
        if (buxVarC.I((74899 & i2) != 74898, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new SnapshotStateList();
                bvvVar.ad(objS);
            }
            int i4 = i2 & 14;
            SnapshotStateList snapshotStateList = (SnapshotStateList) objS;
            Object objS2 = bvvVar.S();
            if (i4 == 4 || objS2 == obj) {
                objS2 = new bns(asfVar, snapshotStateList, (afck) null, 3);
                bvvVar.ad(objS2);
            }
            bvq.g(asfVar, (afeg) objS2, buxVarC);
            long jAh = !snapshotStateList.isEmpty() ? a.ah(dll.b(j) / 2.0f, Float.intBitsToFloat((int) (4294967295L & j)) + BitmapDescriptorFactory.HUE_RED) : j;
            cfy cfyVarI = tl.i(awd.j(cfyVar, j).a(new akb(asfVar)), cqq.c);
            ctp ctpVarB = atk.b(cfl.e, false);
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarI);
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
            asl.A(afp.E(awd.j(cfy.e, jAh), z ? bpvVar.a : bpvVar.f, czz.ar(7, buxVarC)), buxVarC);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gbr(asfVar, cfyVar, bpvVar, z, j, i, 1);
        }
    }

    public static final void d(bqj bqjVar, cfy cfyVar, boolean z, bpv bpvVar, asf asfVar, afeh afehVar, afeh afehVar2, bux buxVar, int i) {
        bqj bqjVar2;
        int i2;
        bpv bpvVar2;
        bpv bpvVarB;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(409861960);
        if (i3 == 0) {
            bqjVar2 = bqjVar;
            i2 = (true != buxVarC.E(bqjVar2) ? 2 : 4) | i;
        } else {
            bqjVar2 = bqjVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.C(asfVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.E(afehVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.E(afehVar2) ? 524288 : 1048576;
        }
        if (buxVarC.I((599187 & i2) != 599186, i2 & 1)) {
            int i4 = i2 & (-7169);
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                bqb bqbVar = bqb.a;
                bpvVarB = bqb.b(czz.at(buxVarC));
            } else {
                buxVarC.s();
                bpvVarB = bpvVar;
            }
            buxVarC.l();
            int i5 = i4 >> 3;
            b(cfyVar, bqjVar2, z, asfVar, afehVar, afehVar2, buxVarC, (i2 & 896) | ((i4 << 3) & 112) | (i5 & 14) | (i5 & 7168) | (57344 & i5) | (458752 & i5));
            bpvVar2 = bpvVarB;
        } else {
            buxVarC.s();
            bpvVar2 = bpvVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nac(bqjVar, cfyVar, z, bpvVar2, asfVar, afehVar, afehVar2, i, 1);
        }
    }

    public static final void e(float f, afec afecVar, cfy cfyVar, boolean z, afdr afdrVar, bpv bpvVar, asf asfVar, afeh afehVar, afeh afehVar2, afgw afgwVar, bux buxVar, int i, int i2) {
        int i3;
        bpv bpvVar2;
        asf asfVar2;
        afeh afehVar3;
        int i4;
        bux buxVar2;
        int i5 = i & 6;
        bux buxVarC = buxVar.c(985901935);
        if (i5 == 0) {
            i3 = (true != buxVarC.z(f) ? 2 : 4) | i;
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
            i3 |= true != buxVarC.D(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != buxVarC.E(afdrVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            bpvVar2 = bpvVar;
            i3 |= true != buxVarC.C(bpvVar2) ? 65536 : 131072;
        } else {
            bpvVar2 = bpvVar;
        }
        if ((1572864 & i) == 0) {
            asfVar2 = asfVar;
            i3 |= true != buxVarC.C(asfVar2) ? 524288 : 1048576;
        } else {
            asfVar2 = asfVar;
        }
        int i6 = i3 | 12582912;
        if ((100663296 & i) == 0) {
            afehVar3 = afehVar;
            i6 |= true != buxVarC.E(afehVar3) ? 33554432 : 67108864;
        } else {
            afehVar3 = afehVar;
        }
        if ((805306368 & i) == 0) {
            i6 |= true != buxVarC.E(afehVar2) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != buxVarC.C(afgwVar) ? 2 : 4);
        } else {
            i4 = i2;
        }
        int i7 = i6;
        if (buxVarC.I(((i6 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i7 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            int i8 = i4;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            boolean z2 = ((i7 & 29360128) == 8388608) | ((((i8 & 14) ^ 6) > 4 && buxVarC.C(afgwVar)) || (i8 & 6) == 4);
            Object objS = bvvVar.S();
            if (z2 || objS == buw.a) {
                objS = new bqj(f, afdrVar, afgwVar);
                bvvVar.ad(objS);
            }
            bqj bqjVar = (bqj) objS;
            bqjVar.a = afdrVar;
            bqjVar.b = afecVar;
            bqjVar.j(f);
            int i9 = i7 >> 9;
            buxVar2 = buxVarC;
            d(bqjVar, cfyVar, z, null, asfVar2, afehVar3, afehVar2, buxVar2, ((i7 >> 3) & 1008) | ((i7 >> 6) & 57344) | (458752 & i9) | (3670016 & i9));
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kvk(f, afecVar, cfyVar, z, afdrVar, bpvVar2, asfVar, afehVar, afehVar2, afgwVar, i, i2, 1);
        }
    }
}
