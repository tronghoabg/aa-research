package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class kvc {
    public static final yph a = yph.c("Gh.FocusRing");
    public static final bvf b = new byo(new ksz(6));

    /* JADX WARN: Type inference failed for: r4v6, types: [bym, java.lang.Object] */
    public static final cfy a(cfy cfyVar, ckv ckvVar, long j, long j2, kve kveVar, kve kveVar2, ase aseVar, boolean z, boolean z2, bux buxVar, int i, int i2) {
        cfyVar.getClass();
        ckvVar.getClass();
        long jA = (i2 & 2) != 0 ? ((kvd) buxVar.f(b)).a(buxVar) : j;
        long jB = (i2 & 4) != 0 ? ((kvd) buxVar.f(b)).b(buxVar) : j2;
        kve kveVarD = (i2 & 8) != 0 ? ((kvd) buxVar.f(b)).d(buxVar) : kveVar;
        kve kveVarC = (i2 & 16) != 0 ? ((kvd) buxVar.f(b)).c(buxVar) : kveVar2;
        bym bymVarI = null;
        ase aseVar2 = (i2 & 32) != 0 ? null : aseVar;
        boolean z3 = ((i2 & 64) == 0) & z;
        boolean z4 = ((i2 & 128) == 0) & z2;
        if (aseVar2 == null) {
            buxVar.v(1429075946);
        } else {
            buxVar.v(-1062279433);
            bymVarI = asl.i(aseVar2, buxVar, (i >> 18) & 14);
        }
        buxVar.o();
        if (bymVarI == null) {
            buxVar.v(1429104994);
            Object objG = buxVar.g();
            if (objG == buw.a) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(false, bxp.c);
                buxVar.x(parcelableSnapshotMutableState);
                objG = parcelableSnapshotMutableState;
            }
            bymVarI = (bwq) objG;
        } else {
            buxVar.v(-1062279984);
        }
        buxVar.o();
        Object objG2 = buxVar.g();
        Object obj = buw.a;
        if (objG2 == obj) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new ParcelableSnapshotMutableState(false, bxp.c);
            buxVar.x(parcelableSnapshotMutableState2);
            objG2 = parcelableSnapshotMutableState2;
        }
        bwq bwqVar = (bwq) objG2;
        boolean zBooleanValue = ((Boolean) ((fbf) buxVar.f(kmc.a)).a.a()).booleanValue();
        int iO = ((kwp) buxVar.f(dbc.h)).o();
        Object objG3 = buxVar.g();
        if (objG3 == obj) {
            objG3 = new daz(bwqVar, 16);
            buxVar.x(objG3);
        }
        return c(cfyVar.a(new chp((afec) objG3)), ((Boolean) bymVarI.a()).booleanValue(), ((Boolean) bwqVar.a()).booleanValue(), zBooleanValue, iO, ckvVar, jA, jB, kveVarD, kveVarC, z3, z4);
    }

    public static final cfy b(cfy cfyVar, ase aseVar, ckv ckvVar, boolean z, bux buxVar, int i, int i2) {
        bwq bwqVar;
        cfyVar.getClass();
        aseVar.getClass();
        ckvVar.getClass();
        long jA = (i2 & 4) != 0 ? ((kvd) buxVar.f(b)).a(buxVar) : 0L;
        long jB = (i2 & 8) != 0 ? ((kvd) buxVar.f(b)).b(buxVar) : 0L;
        kve kveVarD = (i2 & 16) != 0 ? ((kvd) buxVar.f(b)).d(buxVar) : null;
        kve kveVarC = (i2 & 32) != 0 ? ((kvd) buxVar.f(b)).c(buxVar) : null;
        boolean z2 = ((i2 & 128) == 0) & z;
        int i3 = i >> 3;
        int i4 = i3 & 14;
        bym bymVarI = asl.i(aseVar, buxVar, i4);
        bym bymVarJ = asl.j(aseVar, buxVar, i4);
        Object objG = buxVar.g();
        Object obj = buw.a;
        if (objG == obj) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(false, bxp.c);
            buxVar.x(parcelableSnapshotMutableState);
            objG = parcelableSnapshotMutableState;
        }
        bwq bwqVar2 = (bwq) objG;
        boolean z3 = (((i3 & 14) ^ 6) > 4 && buxVar.C(aseVar)) || (i3 & 6) == 4;
        Object objG2 = buxVar.g();
        if (z3 || objG2 == obj) {
            bwqVar = bwqVar2;
            objG2 = new ain(aseVar, bwqVar, (afck) null, 14, (byte[]) null);
            buxVar.x(objG2);
        } else {
            bwqVar = bwqVar2;
        }
        bvq.g(aseVar, (afeg) objG2, buxVar);
        return c(cfyVar, ((Boolean) bymVarI.a()).booleanValue(), ((Boolean) bymVarJ.a()).booleanValue(), ((Boolean) bwqVar.a()).booleanValue(), ((kwp) buxVar.f(dbc.h)).o(), ckvVar, jA, jB, kveVarD, kveVarC, false, z2);
    }

    private static final cfy c(cfy cfyVar, boolean z, boolean z2, boolean z3, int i, final ckv ckvVar, long j, long j2, kve kveVar, kve kveVar2, boolean z4, boolean z5) {
        final float f;
        cfy cfyVarA;
        boolean z6 = false;
        if (i == 2 && z2) {
            z6 = true;
        }
        final long j3 = z6 ? j : 0L;
        final long j4 = true != z6 ? 0L : j2;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (z6) {
            f = z ? kveVar.c : z3 ? kveVar.b : kveVar.a;
        } else {
            f = 0.0f;
        }
        if (z6) {
            f2 = z ? kveVar2.c : z3 ? kveVar2.b : kveVar2.a;
        }
        final float f3 = f2;
        if (z5) {
            cfyVar.getClass();
            cfyVarA = cfyVar.a(new csu(new akh(new avr(f, f, f, f), 6)));
        } else {
            cfyVarA = cfyVar;
        }
        cfy cfyVarA2 = cfyVarA.a(new che(new afec() { // from class: kva
            @Override // defpackage.afec
            public final Object invoke(Object obj) {
                cgz cgzVar = (cgz) obj;
                yph yphVar = kvc.a;
                cgzVar.getClass();
                float fA = cgzVar.a();
                final float f4 = f;
                final float f5 = f4 * fA;
                final float fA2 = f3 * cgzVar.a();
                final ckm ckmVarA = ckvVar.a(cgzVar.n(), cgzVar.o(), cgzVar);
                final long j5 = j4;
                final long j6 = j3;
                return cgzVar.q(new afec() { // from class: kuz
                    @Override // defpackage.afec
                    public final Object invoke(Object obj2) {
                        cxd cxdVar = (cxd) obj2;
                        yph yphVar2 = kvc.a;
                        cxdVar.getClass();
                        int iEF = cxdVar.eF(f4);
                        float f6 = iEF + iEF;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (cxdVar.o() >> 32)) - f6;
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cxdVar.o() & 4294967295L)) - f6;
                        if (fIntBitsToFloat < BitmapDescriptorFactory.HUE_RED || fIntBitsToFloat2 < BitmapDescriptorFactory.HUE_RED) {
                            ((ype) ((ype) ((ype) ((ype) kvc.a.h()).l(5, TimeUnit.SECONDS)).n(String.valueOf(cxdVar.hashCode()))).q(ypd.MEDIUM)).u("Content smaller than 0, unable to draw");
                        } else {
                            cxdVar.q();
                        }
                        ckm ckmVar = ckmVarA;
                        cjm cjmVar = new cjm((byte[]) null);
                        if (ckmVar instanceof ckk) {
                            cjmVar.p(((ckk) ckmVar).a);
                        } else if (ckmVar instanceof ckl) {
                            cjmVar.q(((ckl) ckmVar).a);
                        } else {
                            if (!(ckmVar instanceof ckj)) {
                                throw new aezs();
                            }
                            cjmVar.o(((ckj) ckmVar).a);
                        }
                        cma cmaVarR = cxdVar.r();
                        long jA = cmaVarR.a();
                        cmaVarR.b().g();
                        try {
                            cmaVarR.c.m(cjmVar);
                            float f7 = f5;
                            long j7 = j5;
                            if (j7 != 0) {
                                float f8 = fA2 + f7;
                                if (f8 > BitmapDescriptorFactory.HUE_RED) {
                                    czz.aL(cxdVar, ckmVar, j7, new cmg(f8 + f8, BitmapDescriptorFactory.HUE_RED, 0, 0, 30), 52);
                                }
                            }
                            long j8 = j6;
                            if (j8 != 0 && f7 > BitmapDescriptorFactory.HUE_RED) {
                                czz.aL(cxdVar, ckmVar, j8, new cmg(f7 + f7, BitmapDescriptorFactory.HUE_RED, 0, 0, 30), 52);
                            }
                            cmaVarR.b().e();
                            cmaVarR.h(jA);
                            return afak.a;
                        } catch (Throwable th) {
                            cmaVarR.b().e();
                            cmaVarR.h(jA);
                            throw th;
                        }
                    }
                });
            }
        }));
        if (z4) {
            cfyVarA2 = cjn.g(cfyVarA2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ckvVar, true, 0, 1042431);
        }
        return z5 ? cfyVarA2.a(new avl(f, f, f, f)) : cfyVarA2;
    }
}
