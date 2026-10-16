package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class boh {
    public static final bvf a = new byo(new blv(4));

    public static final void a(bng bngVar, bpu bpuVar, bry bryVar, afeg afegVar, bux buxVar, int i, int i2) {
        int i3;
        bng bngVar2;
        bpu bpuVar2;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-449719819);
        if (i4 == 0) {
            int i5 = 2;
            if ((i2 & 1) == 0 && buxVarC.C(bngVar)) {
                i5 = 4;
            }
            i3 = i | i5;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i6 = 16;
            if ((i2 & 2) == 0 && buxVarC.C(bpuVar)) {
                i6 = 32;
            }
            i3 |= i6;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.C(bryVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != buxVarC.E(afegVar) ? 1024 : 2048;
        }
        if (buxVarC.I((i3 & 1171) != 1170, i3 & 1)) {
            int i7 = i2 & 2;
            int i8 = i2 & 1;
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                if (i8 != 0) {
                    i3 &= -15;
                    bngVar = ((bog) buxVarC.f(a)).a;
                }
                if (i7 != 0) {
                    bpuVar = ((bog) buxVarC.f(a)).c;
                    i3 &= -113;
                }
                bng bngVar3 = bngVar;
                bpu bpuVar3 = bpuVar;
                buxVarC.l();
                int i9 = i3 << 3;
                b(bngVar3, ((bog) buxVarC.f(a)).d, bpuVar3, bryVar, afegVar, buxVarC, (i3 & 14) | (i9 & 896) | (i9 & 7168) | (i9 & 57344));
                bngVar2 = bngVar3;
                bpuVar2 = bpuVar3;
            } else {
                buxVarC.s();
                if (i8 != 0) {
                    i3 &= -15;
                }
                if (i7 != 0) {
                    i3 &= -113;
                }
                bng bngVar32 = bngVar;
                bpu bpuVar32 = bpuVar;
                buxVarC.l();
                int i92 = i3 << 3;
                b(bngVar32, ((bog) buxVarC.f(a)).d, bpuVar32, bryVar, afegVar, buxVarC, (i3 & 14) | (i92 & 896) | (i92 & 7168) | (i92 & 57344));
                bngVar2 = bngVar32;
                bpuVar2 = bpuVar32;
            }
        } else {
            buxVarC.s();
            bngVar2 = bngVar;
            bpuVar2 = bpuVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new dmv(bngVar2, bpuVar2, bryVar, afegVar, i, i2, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    public static final void b(bng bngVar, bor borVar, bpu bpuVar, bry bryVar, afeg afegVar, bux buxVar, int i) {
        int i2;
        char c;
        boolean z;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(904511636);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(bngVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(borVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(bpuVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(bryVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 8192 : 16384;
        }
        if (buxVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            bog bogVar = new bog(bngVar, bryVar, bpuVar, borVar);
            akm akmVarA = bpe.a(false, BitmapDescriptorFactory.HUE_RED, 0L, null, false, 255);
            long j = bngVar.a;
            boolean zB = buxVarC.B(j);
            Object objS = bvvVar.S();
            if (zB) {
                c = 0;
            } else {
                c = 0;
                if (objS != buw.a) {
                    z = 1;
                }
                bxe[] bxeVarArr = new bxe[3];
                bxeVarArr[c] = a.b(bogVar);
                bxeVarArr[z] = aki.a.b(akmVarA);
                bxeVarArr[2] = blw.a.b((blu) objS);
                czz.an(bxeVarArr, bxc.i(-1750539308, z, new apn(bryVar, afegVar, 11, null), buxVarC), buxVarC, 56);
            }
            float fD = cjv.d(j);
            z = 1;
            float fC = cjv.c(j);
            float fB = cjv.b(j);
            float[] fArr = clj.a;
            objS = new blu(j, cjn.j(fD, fC, fB, 0.4f, clj.y[(int) (j & 63)]));
            bvvVar.ad(objS);
            bxe[] bxeVarArr2 = new bxe[3];
            bxeVarArr2[c] = a.b(bogVar);
            bxeVarArr2[z] = aki.a.b(akmVarA);
            bxeVarArr2[2] = blw.a.b((blu) objS);
            czz.an(bxeVarArr2, bxc.i(-1750539308, z, new apn(bryVar, afegVar, 11, null), buxVarC), buxVarC, 56);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gbn(bngVar, borVar, bpuVar, bryVar, afegVar, i, 1);
        }
    }
}
