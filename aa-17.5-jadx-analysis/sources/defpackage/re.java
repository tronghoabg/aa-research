package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import androidx.car.app.CarAppMetadataHolderService;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class re {
    public static rm a(qn qnVar, qr qrVar) throws ClassNotFoundException {
        int i = qnVar.d;
        if (i == 0) {
            throw new IllegalStateException("Car App API level hasn't been established yet");
        }
        if (i < 3) {
            throw new qs("Create CarHardwareManager failed", new IllegalArgumentException("Attempted to retrieve CarHardwareManager service, but the host is less than 3"));
        }
        try {
            ServiceInfo serviceInfoA = CarAppMetadataHolderService.a(qnVar);
            String string = serviceInfoA.metaData != null ? serviceInfoA.metaData.getString("androidx.car.app.CarAppMetadataHolderService.CAR_HARDWARE_MANAGER") : null;
            if (string != null) {
                return (rm) Class.forName(string).getConstructor(qn.class, qr.class).newInstance(qnVar, qrVar);
            }
            throw new ClassNotFoundException("CarHardwareManager metadata could not be found");
        } catch (PackageManager.NameNotFoundException | ReflectiveOperationException unused) {
            throw new IllegalStateException("CarHardwareManager not configured. Did you forget to add a dependency on app-automotive or app-projected artifacts?");
        }
    }

    public static final bnz b(bng bngVar, long j) {
        bnz bnzVar = bngVar.ab;
        if (bnzVar != null) {
            return bnzVar;
        }
        long jH = cjv.h(j, 0.38f);
        bnz bnzVar2 = new bnz(cjn.i(0), j, cjn.i(0), jH);
        bngVar.ab = bnzVar2;
        return bnzVar2;
    }

    public static final bnz c(long j, long j2, bux buxVar) {
        return b(czz.at(buxVar), ((cjv) buxVar.f(bnm.a)).a).a(cjn.n(), j, cjn.n(), j2);
    }

    public static final void d(afdr afdrVar, cfy cfyVar, ckv ckvVar, long j, long j2, bnt bntVar, afeg afegVar, bux buxVar, int i) {
        afdr afdrVar2;
        int i2;
        afeg afegVar2;
        bux buxVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(748201188);
        if (i3 == 0) {
            afdrVar2 = afdrVar;
            i2 = (true != buxVarC.E(afdrVar2) ? 2 : 4) | i;
        } else {
            afdrVar2 = afdrVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(ckvVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.B(j) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.B(j2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.C(bntVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.C(null) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            afegVar2 = afegVar;
            i2 |= true != buxVarC.E(afegVar2) ? 4194304 : 8388608;
        } else {
            afegVar2 = afegVar;
        }
        if (buxVarC.I((4793491 & i2) != 4793490, i2 & 1)) {
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            int i4 = i2 << 9;
            buxVar2 = buxVarC;
            f(afdrVar2, czz.ap(10, buxVarC), cfyVar, ckvVar, j, j2, bntVar, afegVar2, buxVar2, (i2 & 14) | 3456 | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), (i2 >> 21) & 14);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bny(afdrVar, cfyVar, ckvVar, j, j2, bntVar, afegVar, i, 1);
        }
    }

    public static final void e(afdr afdrVar, cfy cfyVar, ckv ckvVar, long j, long j2, bnt bntVar, afeh afehVar, bux buxVar, int i) {
        afdr afdrVar2;
        int i2;
        bux buxVar2;
        cfy cfyVar2;
        ckv ckvVar2;
        long j3;
        long j4;
        bnt bntVar2;
        long j5;
        bnt bntVar3;
        long j6;
        cfy cfyVar3;
        ckv ckvVar3;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1039585610);
        if (i3 == 0) {
            afdrVar2 = afdrVar;
            i2 = (true != buxVarC.E(afdrVar2) ? 2 : 4) | i;
        } else {
            afdrVar2 = afdrVar;
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 = i2 | 176;
        }
        if ((i & 3072) == 0) {
            i4 |= 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        int i5 = i4 | 1572864;
        if ((i & 12582912) == 0) {
            i5 |= true != buxVarC.E(afehVar) ? 4194304 : 8388608;
        }
        if (buxVarC.I((4793491 & i5) != 4793490, i5 & 1)) {
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                cfv cfvVar = cfy.e;
                ckv ckvVarAr = czz.ar(8, buxVarC);
                long jF = bnh.f(27, buxVarC);
                long jD = bnh.d(jF, buxVarC);
                j5 = jF;
                bntVar3 = new bnt();
                j6 = jD;
                cfyVar3 = cfvVar;
                ckvVar3 = ckvVarAr;
            } else {
                buxVarC.s();
                cfyVar3 = cfyVar;
                ckvVar3 = ckvVar;
                j5 = j;
                j6 = j2;
                bntVar3 = bntVar;
            }
            buxVarC.l();
            buxVar2 = buxVarC;
            d(afdrVar2, cfyVar3, ckvVar3, j5, j6, bntVar3, bxc.i(-1233936436, true, new bly(afehVar, 5), buxVarC), buxVar2, 12582912 | (i5 & 14) | (i5 & 112) | (3670016 & i5));
            cfyVar2 = cfyVar3;
            ckvVar2 = ckvVar3;
            j3 = j5;
            j4 = j6;
            bntVar2 = bntVar3;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            cfyVar2 = cfyVar;
            ckvVar2 = ckvVar;
            j3 = j;
            j4 = j2;
            bntVar2 = bntVar;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bny(afdrVar, cfyVar2, ckvVar2, j3, j4, bntVar2, afehVar, i, 0);
        }
    }

    public static final void f(final afdr afdrVar, final dfw dfwVar, final cfy cfyVar, final ckv ckvVar, final long j, final long j2, final bnt bntVar, final afeg afegVar, bux buxVar, final int i, final int i2) {
        afdr afdrVar2;
        int i3;
        afeg afegVar2;
        int i4;
        bux buxVar2;
        int i5;
        int i6 = i & 6;
        bux buxVarC = buxVar.c(121669932);
        if (i6 == 0) {
            afdrVar2 = afdrVar;
            i3 = (true != buxVarC.E(afdrVar2) ? 2 : 4) | i;
        } else {
            afdrVar2 = afdrVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.C(dfwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.z(56.0f) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != buxVarC.z(56.0f) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != buxVarC.C(ckvVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != buxVarC.B(j) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != buxVarC.B(j2) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != buxVarC.C(bntVar) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != buxVarC.C(null) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            afegVar2 = afegVar;
            i4 = i2 | (true != buxVarC.E(afegVar2) ? 2 : 4);
        } else {
            afegVar2 = afegVar;
            i4 = i2;
        }
        if (buxVarC.I(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            buxVarC.v(-282853233);
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new asg();
                bvvVar.ad(objS);
            }
            asf asfVar = (asf) objS;
            bvvVar.Y(false);
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                i5 = i3;
                objS2 = new bmk(3);
                bvvVar.ad(objS2);
            } else {
                i5 = i3;
            }
            cfy cfyVarA = dds.a(cfyVar, false, (afec) objS2);
            float f = bntVar.a;
            int i7 = i5 >> 21;
            boolean zC = buxVarC.C(asfVar);
            Object objS3 = bvvVar.S();
            if (zC || objS3 == obj) {
                float f2 = bntVar.b;
                float f3 = bntVar.d;
                float f4 = bntVar.c;
                objS3 = new bnw();
                bvvVar.ad(objS3);
            }
            bnw bnwVar = (bnw) objS3;
            boolean zE = buxVarC.E(bnwVar) | ((((i7 & 112) ^ 48) > 32 && buxVarC.C(bntVar)) || (i7 & 48) == 32);
            Object objS4 = bvvVar.S();
            if (zE || objS4 == obj) {
                objS4 = new bns(bnwVar, bntVar, (afck) null, 1);
                bvvVar.ad(objS4);
            }
            bvq.g(bntVar, (afeg) objS4, buxVarC);
            boolean zC2 = buxVarC.C(asfVar) | buxVarC.E(bnwVar);
            Object objS5 = bvvVar.S();
            if (zC2 || objS5 == obj) {
                objS5 = new dxb(asfVar, bnwVar, (afck) null, 1);
                bvvVar.ad(objS5);
            }
            bvq.g(asfVar, (afeg) objS5, buxVarC);
            buxVar2 = buxVarC;
            bqp.c(afdrVar2, cfyVarA, false, ckvVar, j, j2, 6.0f, ((dlj) bnwVar.e.b.a()).a, null, asfVar, bxc.i(-1779603465, true, new brw(j2, dfwVar, afegVar2, 1), buxVarC), buxVar2, 260);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: bnx
                @Override // defpackage.afeg
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    afdr afdrVar3 = afdrVar;
                    dfw dfwVar2 = dfwVar;
                    cfy cfyVar2 = cfyVar;
                    ckv ckvVar2 = ckvVar;
                    int i8 = i;
                    long j3 = j;
                    int i9 = i2;
                    int i10 = i8 | 1;
                    int i11 = i9 & 306783378;
                    int i12 = 306783378 & i10;
                    int i13 = i12 + i12;
                    bnt bntVar2 = bntVar;
                    int i14 = i9 & 613566756;
                    int i15 = i10 & 613566756;
                    afeg afegVar3 = afegVar;
                    re.f(afdrVar3, dfwVar2, cfyVar2, ckvVar2, j3, j2, bntVar2, afegVar3, (bux) obj2, (i10 & (-920350135)) | i12 | (i15 >> 1) | (i13 & i15), (i9 & (-920350135)) | i11 | (i14 >> 1) | ((i11 + i11) & i14));
                    return afak.a;
                }
            };
        }
    }

    public static void g(cju cjuVar, cjb cjbVar) {
        cjuVar.a(cjbVar.b, cjbVar.c, cjbVar.d, cjbVar.e, 1);
    }

    public static final long[] h(List list) {
        int size = list.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = byx.w(((cjv) list.get(i)).a);
        }
        return jArr;
    }

    public static final int[] i(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            long j = ((cjv) list.get(i)).a;
            float[] fArr = clj.a;
            iArr[i] = (int) (cjv.e(j, clj.e) >>> 32);
        }
        return iArr;
    }

    public static final void j(List list) {
        if (list.size() < 2) {
            throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
        }
    }

    public static final Boolean k(ciu ciuVar, int i, cjb cjbVar, afec afecVar) {
        int iOrdinal = ciuVar.g().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ciu ciuVarP = mt.p(ciuVar);
                if (ciuVarP == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = ciuVarP.g().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolK = k(ciuVarP, i, cjbVar, afecVar);
                        if (!affa.f(boolK, false)) {
                            return boolK;
                        }
                        if (cjbVar == null) {
                            if (ciuVarP.g() != cis.b) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            ciu ciuVarO = mt.o(ciuVarP);
                            if (ciuVarO == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            cjbVar = mt.q(ciuVarO);
                        }
                        return Boolean.valueOf(t(ciuVar, cjbVar, i, afecVar));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new aezs();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (cjbVar == null) {
                    cjbVar = mt.q(ciuVarP);
                }
                return Boolean.valueOf(t(ciuVar, cjbVar, i, afecVar));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return (Boolean) (((cig) ciuVar.b()).a ? afecVar.invoke(ciuVar) : cjbVar == null ? Boolean.valueOf(l(ciuVar, i, afecVar)) : Boolean.valueOf(n(ciuVar, cjbVar, i, afecVar)));
                }
                throw new aezs();
            }
        }
        return Boolean.valueOf(l(ciuVar, i, afecVar));
    }

    public static final boolean l(ciu ciuVar, int i, afec afecVar) {
        cjb cjbVar;
        byw bywVar = new byw(new ciu[16]);
        q(ciuVar, bywVar);
        int i2 = bywVar.b;
        if (i2 <= 1) {
            ciu ciuVar2 = (ciu) (i2 == 0 ? null : bywVar.a[0]);
            if (ciuVar2 != null) {
                return ((Boolean) afecVar.invoke(ciuVar2)).booleanValue();
            }
        } else {
            if (true == a.Y(i, 7)) {
                i = 4;
            }
            if (a.Y(i, 4) || a.Y(i, 6)) {
                cjb cjbVarQ = mt.q(ciuVar);
                float f = cjbVarQ.b;
                float f2 = cjbVarQ.c;
                cjbVar = new cjb(f, f2, f, f2);
            } else {
                if (!a.Y(i, 3) && !a.Y(i, 5)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                cjb cjbVarQ2 = mt.q(ciuVar);
                float f3 = cjbVarQ2.d;
                float f4 = cjbVarQ2.e;
                cjbVar = new cjb(f3, f4, f3, f4);
            }
            ciu ciuVarP = p(bywVar, cjbVar, i);
            if (ciuVarP != null) {
                return ((Boolean) afecVar.invoke(ciuVarP)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean m(cjb cjbVar, cjb cjbVar2, cjb cjbVar3, int i) {
        if (!u(cjbVar, i, cjbVar3)) {
            return false;
        }
        if (u(cjbVar2, i, cjbVar3) && !r(cjbVar3, cjbVar, cjbVar2, i)) {
            return !r(cjbVar3, cjbVar2, cjbVar, i) && o(i, cjbVar3, cjbVar) < o(i, cjbVar3, cjbVar2);
        }
        return true;
    }

    public static final boolean n(ciu ciuVar, cjb cjbVar, int i, afec afecVar) {
        ciu ciuVarP;
        byw bywVar = new byw(new ciu[16]);
        if (!ciuVar.q.A) {
            crt.c("visitChildren called on an unattached node");
        }
        byw bywVar2 = new byw(new cfx[16]);
        cfx cfxVar = ciuVar.q;
        cfx cfxVar2 = cfxVar.u;
        if (cfxVar2 == null) {
            bzi.w(bywVar2, cfxVar);
        } else {
            bywVar2.n(cfxVar2);
        }
        while (true) {
            int i2 = bywVar2.b;
            if (i2 == 0) {
                break;
            }
            cfx cfxVarN = (cfx) bywVar2.c(i2 - 1);
            if ((cfxVarN.s & 1024) == 0) {
                bzi.w(bywVar2, cfxVarN);
            } else {
                while (true) {
                    if (cfxVarN == null) {
                        break;
                    }
                    if ((cfxVarN.r & 1024) != 0) {
                        byw bywVar3 = null;
                        while (cfxVarN != null) {
                            if (cfxVarN instanceof ciu) {
                                ciu ciuVar2 = (ciu) cfxVarN;
                                if (ciuVar2.A) {
                                    bywVar.n(ciuVar2);
                                }
                            } else if ((cfxVarN.r & 1024) != 0 && (cfxVarN instanceof cwe)) {
                                int i3 = 0;
                                for (cfx cfxVar3 = ((cwe) cfxVarN).C; cfxVar3 != null; cfxVar3 = cfxVar3.u) {
                                    if ((cfxVar3.r & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            cfxVarN = cfxVar3;
                                        } else {
                                            if (bywVar3 == null) {
                                                bywVar3 = new byw(new cfx[16]);
                                            }
                                            if (cfxVarN != null) {
                                                bywVar3.n(cfxVarN);
                                            }
                                            bywVar3.n(cfxVar3);
                                            cfxVarN = null;
                                        }
                                    }
                                }
                                if (i3 != 1) {
                                }
                            }
                            cfxVarN = bzi.n(bywVar3);
                        }
                    } else {
                        cfxVarN = cfxVarN.u;
                    }
                }
            }
        }
        while (bywVar.b != 0 && (ciuVarP = p(bywVar, cjbVar, i)) != null) {
            if (((cig) ciuVarP.b()).a) {
                return ((Boolean) afecVar.invoke(ciuVarP)).booleanValue();
            }
            if (t(ciuVarP, cjbVar, i, afecVar)) {
                return true;
            }
            bywVar.m(ciuVarP);
        }
        return false;
    }

    private static final long o(int i, cjb cjbVar, cjb cjbVar2) {
        float f;
        float f2;
        float f3;
        long jV = (long) v(cjbVar2, i, cjbVar);
        if (a.Y(i, 3) || a.Y(i, 4)) {
            float f4 = cjbVar.c;
            f = f4 + ((cjbVar.e - f4) / 2.0f);
            f2 = cjbVar2.c;
            f3 = cjbVar2.e;
        } else {
            if (!a.Y(i, 5) && !a.Y(i, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f5 = cjbVar.b;
            f = f5 + ((cjbVar.d - f5) / 2.0f);
            f2 = cjbVar2.b;
            f3 = cjbVar2.d;
        }
        float f6 = f - (f2 + ((f3 - f2) / 2.0f));
        long j = 13 * jV * jV;
        long j2 = (long) f6;
        return j + (j2 * j2);
    }

    private static final ciu p(byw bywVar, cjb cjbVar, int i) {
        cjb cjbVarE;
        if (a.Y(i, 3)) {
            cjbVarE = cjbVar.e((cjbVar.d - cjbVar.b) + 1.0f, BitmapDescriptorFactory.HUE_RED);
        } else if (a.Y(i, 4)) {
            cjbVarE = cjbVar.e(-((cjbVar.d - cjbVar.b) + 1.0f), BitmapDescriptorFactory.HUE_RED);
        } else if (a.Y(i, 5)) {
            cjbVarE = cjbVar.e(BitmapDescriptorFactory.HUE_RED, (cjbVar.e - cjbVar.c) + 1.0f);
        } else {
            if (!a.Y(i, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            cjbVarE = cjbVar.e(BitmapDescriptorFactory.HUE_RED, -((cjbVar.e - cjbVar.c) + 1.0f));
        }
        Object[] objArr = bywVar.a;
        int i2 = bywVar.b;
        ciu ciuVar = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ciu ciuVar2 = (ciu) objArr[i3];
            if (mt.r(ciuVar2)) {
                cjb cjbVarQ = mt.q(ciuVar2);
                if (m(cjbVarQ, cjbVarE, cjbVar, i)) {
                    ciuVar = ciuVar2;
                    cjbVarE = cjbVarQ;
                }
            }
        }
        return ciuVar;
    }

    private static final void q(cwd cwdVar, byw bywVar) {
        cfx cfxVar = (cfx) cwdVar;
        if (!cfxVar.q.A) {
            crt.c("visitChildren called on an unattached node");
        }
        byw bywVar2 = new byw(new cfx[16]);
        cfx cfxVar2 = cfxVar.q;
        cfx cfxVar3 = cfxVar2.u;
        if (cfxVar3 == null) {
            bzi.w(bywVar2, cfxVar2);
        } else {
            bywVar2.n(cfxVar3);
        }
        while (true) {
            int i = bywVar2.b;
            if (i == 0) {
                return;
            }
            cfx cfxVarN = (cfx) bywVar2.c(i - 1);
            if ((cfxVarN.s & 1024) == 0) {
                bzi.w(bywVar2, cfxVarN);
            } else {
                while (true) {
                    if (cfxVarN == null) {
                        break;
                    }
                    if ((cfxVarN.r & 1024) != 0) {
                        byw bywVar3 = null;
                        while (cfxVarN != null) {
                            if (cfxVarN instanceof ciu) {
                                ciu ciuVar = (ciu) cfxVarN;
                                if (ciuVar.A && !bzi.q(ciuVar).D) {
                                    if (((cig) ciuVar.b()).a) {
                                        bywVar.n(ciuVar);
                                    } else {
                                        q(ciuVar, bywVar);
                                    }
                                }
                            } else if ((cfxVarN.r & 1024) != 0 && (cfxVarN instanceof cwe)) {
                                int i2 = 0;
                                for (cfx cfxVar4 = ((cwe) cfxVarN).C; cfxVar4 != null; cfxVar4 = cfxVar4.u) {
                                    if ((cfxVar4.r & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cfxVarN = cfxVar4;
                                        } else {
                                            if (bywVar3 == null) {
                                                bywVar3 = new byw(new cfx[16]);
                                            }
                                            if (cfxVarN != null) {
                                                bywVar3.n(cfxVarN);
                                            }
                                            bywVar3.n(cfxVar4);
                                            cfxVarN = null;
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            cfxVarN = bzi.n(bywVar3);
                        }
                    } else {
                        cfxVarN = cfxVarN.u;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean r(defpackage.cjb r9, defpackage.cjb r10, defpackage.cjb r11, int r12) {
        /*
            boolean r0 = s(r11, r12, r9)
            r1 = 0
            if (r0 != 0) goto Lac
            boolean r0 = s(r10, r12, r9)
            if (r0 != 0) goto Le
            return r1
        Le:
            r0 = 3
            boolean r2 = defpackage.a.Y(r12, r0)
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r4 = 6
            r5 = 5
            r6 = 4
            r7 = 1
            if (r2 == 0) goto L25
            float r2 = r9.b
            float r8 = r11.d
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 < 0) goto L24
            goto L52
        L24:
            return r7
        L25:
            boolean r2 = defpackage.a.Y(r12, r6)
            if (r2 == 0) goto L34
            float r2 = r9.d
            float r8 = r11.b
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 <= 0) goto L52
            return r7
        L34:
            boolean r2 = defpackage.a.Y(r12, r5)
            if (r2 == 0) goto L43
            float r2 = r9.c
            float r8 = r11.e
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 >= 0) goto L52
            return r7
        L43:
            boolean r2 = defpackage.a.Y(r12, r4)
            if (r2 == 0) goto La6
            float r2 = r9.e
            float r8 = r11.c
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 <= 0) goto L52
            return r7
        L52:
            boolean r2 = defpackage.a.Y(r12, r0)
            if (r2 != 0) goto La5
            boolean r2 = defpackage.a.Y(r12, r6)
            if (r2 == 0) goto L5f
            return r7
        L5f:
            float r10 = v(r10, r12, r9)
            boolean r0 = defpackage.a.Y(r12, r0)
            if (r0 == 0) goto L6f
            float r9 = r9.b
            float r11 = r11.b
        L6d:
            float r9 = r9 - r11
            goto L92
        L6f:
            boolean r0 = defpackage.a.Y(r12, r6)
            if (r0 == 0) goto L7c
            float r11 = r11.d
            float r9 = r9.d
        L79:
            float r9 = r11 - r9
            goto L92
        L7c:
            boolean r0 = defpackage.a.Y(r12, r5)
            if (r0 == 0) goto L87
            float r9 = r9.c
            float r11 = r11.c
            goto L6d
        L87:
            boolean r12 = defpackage.a.Y(r12, r4)
            if (r12 == 0) goto L9f
            float r11 = r11.e
            float r9 = r9.e
            goto L79
        L92:
            r11 = 1065353216(0x3f800000, float:1.0)
            int r12 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r12 >= 0) goto L99
            r9 = r11
        L99:
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 < 0) goto L9e
            return r1
        L9e:
            return r7
        L9f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        La5:
            return r7
        La6:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re.r(cjb, cjb, cjb, int):boolean");
    }

    private static final boolean s(cjb cjbVar, int i, cjb cjbVar2) {
        if (a.Y(i, 3) || a.Y(i, 4)) {
            return cjbVar.e > cjbVar2.c && cjbVar.c < cjbVar2.e;
        }
        if (a.Y(i, 5) || a.Y(i, 6)) {
            return cjbVar.d > cjbVar2.b && cjbVar.b < cjbVar2.d;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    private static final boolean t(ciu ciuVar, cjb cjbVar, int i, afec afecVar) {
        if (n(ciuVar, cjbVar, i, afecVar)) {
            return true;
        }
        Boolean bool = (Boolean) lv.s(ciuVar, i, new ciw(((czq) bzi.s(ciuVar)).J.b(), ciuVar, cjbVar, i, afecVar, 2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean u(cjb cjbVar, int i, cjb cjbVar2) {
        if (a.Y(i, 3)) {
            float f = cjbVar2.d;
            float f2 = cjbVar.d;
            return (f > f2 || cjbVar2.b >= f2) && cjbVar2.b > cjbVar.b;
        }
        if (a.Y(i, 4)) {
            float f3 = cjbVar2.b;
            float f4 = cjbVar.b;
            return (f3 < f4 || cjbVar2.d <= f4) && cjbVar2.d < cjbVar.d;
        }
        if (a.Y(i, 5)) {
            float f5 = cjbVar2.e;
            float f6 = cjbVar.e;
            return (f5 > f6 || cjbVar2.c >= f6) && cjbVar2.c > cjbVar.c;
        }
        if (!a.Y(i, 6)) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f7 = cjbVar2.c;
        float f8 = cjbVar.c;
        return (f7 < f8 || cjbVar2.e <= f8) && cjbVar2.e < cjbVar.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ float v(defpackage.cjb r1, int r2, defpackage.cjb r3) {
        /*
            r0 = 3
            boolean r0 = defpackage.a.Y(r2, r0)
            if (r0 == 0) goto Ld
            float r2 = r3.b
            float r1 = r1.d
        Lb:
            float r2 = r2 - r1
            goto L33
        Ld:
            r0 = 4
            boolean r0 = defpackage.a.Y(r2, r0)
            if (r0 == 0) goto L1b
            float r1 = r1.b
            float r2 = r3.d
        L18:
            float r2 = r1 - r2
            goto L33
        L1b:
            r0 = 5
            boolean r0 = defpackage.a.Y(r2, r0)
            if (r0 == 0) goto L27
            float r2 = r3.c
            float r1 = r1.e
            goto Lb
        L27:
            r0 = 6
            boolean r2 = defpackage.a.Y(r2, r0)
            if (r2 == 0) goto L3a
            float r1 = r1.c
            float r2 = r3.e
            goto L18
        L33:
            r1 = 0
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 >= 0) goto L39
            return r1
        L39:
            return r2
        L3a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This function should only be used for 2-D focus search"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re.v(cjb, int, cjb):float");
    }
}
