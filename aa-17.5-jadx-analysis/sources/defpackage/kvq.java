package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class kvq implements afeh {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ kvq(long j, asw aswVar, hhd hhdVar, int i) {
        this.d = i;
        this.a = j;
        this.b = aswVar;
        this.c = hhdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [aqf, java.lang.Object] */
    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.d != 0) {
            bux buxVar = (bux) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            ((ats) obj).getClass();
            if (buxVar.I((iIntValue & 17) != 16, iIntValue & 1)) {
                czz.am(ggf.a.b(new cjv(this.a)), bxc.i(990810496, true, new guk(this.b, this.c, 12), buxVar), buxVar, 56);
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        cfy cfyVar = (cfy) obj;
        bux buxVar2 = (bux) obj2;
        ((Integer) obj3).intValue();
        cfyVar.getClass();
        buxVar2.v(1709372154);
        buxVar2.v(2029133930);
        final long j = this.a;
        if (j == 16) {
            afeg afegVar = kvw.a;
            j = ((cjv) kvw.a.invoke(buxVar2, 6)).a;
        }
        final ?? r0 = this.b;
        buxVar2.o();
        buxVar2.v(-1545745150);
        boolean zG = r0.g();
        final float fFloatValue = BitmapDescriptorFactory.HUE_RED;
        if (zG || r0.h()) {
            agl aglVarF = ca.F(true != r0.i() ? 500 : 150, r0.i() ? 0 : (int) ((kvs) this.c).a.toMillis(), null, 4);
            Object objG = buxVar2.g();
            Object obj4 = buw.a;
            if (objG == obj4) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(true, bxp.c);
                buxVar2.x(parcelableSnapshotMutableState);
                objG = parcelableSnapshotMutableState;
            }
            bwq bwqVar = (bwq) objG;
            bym bymVarB = ady.b((((Boolean) bwqVar.a()).booleanValue() || r0.i()) ? 1.0f : 0.0f, aglVarF, "Scrollbar alpha", null, buxVar2, 3072, 20);
            boolean zAB = roc.aB(r0);
            Boolean boolValueOf = Boolean.valueOf(zAB);
            boolean zD = buxVar2.D(zAB);
            Object objG2 = buxVar2.g();
            if (zD || objG2 == obj4) {
                objG2 = new kvr(zAB, bwqVar, (afck) null, 0);
                buxVar2.x(objG2);
            }
            bvq.g(boolValueOf, (afeg) objG2, buxVar2);
            fFloatValue = ((Number) bymVarB.a()).floatValue();
        }
        buxVar2.o();
        boolean z = buxVar2.z(fFloatValue) | buxVar2.z(8.0f) | buxVar2.z(8.0f) | buxVar2.z(4.0f) | buxVar2.z(4.0f) | buxVar2.E(r0) | buxVar2.B(j) | buxVar2.z(48.0f) | buxVar2.z(128.0f);
        Object objG3 = buxVar2.g();
        if (z || objG3 == buw.a) {
            objG3 = new afec() { // from class: kvp
                @Override // defpackage.afec
                public final Object invoke(Object obj5) throws Throwable {
                    float f;
                    float f2;
                    char c;
                    long jAA;
                    long jFloatToRawIntBits;
                    long jFloatToRawIntBits2;
                    long jFloatToRawIntBits3;
                    long jFloatToRawIntBits4;
                    float fEA;
                    cxd cxdVar = (cxd) obj5;
                    cxdVar.getClass();
                    cxdVar.q();
                    float f3 = fFloatValue;
                    aqf aqfVar = r0;
                    long j2 = j;
                    if (f3 != BitmapDescriptorFactory.HUE_RED) {
                        float fEA2 = cxdVar.eA(8.0f);
                        float fEA3 = cxdVar.eA(8.0f);
                        float fEA4 = cxdVar.eA(4.0f);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (cxdVar.o() & 4294967295L));
                        float fEA5 = cxdVar.eA(4.0f) + fEA2;
                        if (fIntBitsToFloat > fEA5 + fEA5) {
                            float f4 = fEA4 + fEA3;
                            if (Float.intBitsToFloat((int) (cxdVar.o() >> 32)) > f4) {
                                float f5 = -fEA3;
                                float f6 = -fEA2;
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cxdVar.o() >> 32)) - f4;
                                cxdVar.r().c.i(fIntBitsToFloat2, fEA2, fEA3, fEA2);
                                float f7 = -fIntBitsToFloat2;
                                try {
                                    float fEA6 = cxdVar.eA(4.0f);
                                    cxdVar.r().c.i(BitmapDescriptorFactory.HUE_RED, fEA6, BitmapDescriptorFactory.HUE_RED, fEA6);
                                    try {
                                        if (aqfVar instanceof alh) {
                                            float fD = ((alh) aqfVar).d();
                                            jAA = roc.aA(fD / afpt.b(r3.b() + fD, 1.0E-4f), r3.c() / afpt.e(r3.b(), 1));
                                            c = ' ';
                                        } else if (aqfVar instanceof axr) {
                                            axr axrVar = (axr) aqfVar;
                                            float fB = afpt.b((int) (axrVar.l().d() & 4294967295L), 1.0f);
                                            int i = axrVar.l().m;
                                            axk axkVar = (axk) woy.bF(axrVar.l().j);
                                            c = ' ';
                                            float f8 = i;
                                            float f9 = (axkVar.a + ((-axkVar.h) / axkVar.i)) / f8;
                                            axk axkVar2 = (axk) woy.bK(axrVar.l().j);
                                            float fA = ((axkVar2.a + ((((fB - axrVar.l().o) - axrVar.l().a()) - axkVar2.h) / axkVar2.i)) / f8) - f9;
                                            jAA = roc.aA(fA, f9 / (1.0f - fA));
                                        } else {
                                            c = ' ';
                                            if (!(aqfVar instanceof axz)) {
                                                f = f6;
                                                f2 = f7;
                                                try {
                                                    throw new IllegalArgumentException("Unsupported ScrollableState type: ".concat(String.valueOf(aqfVar.getClass().getCanonicalName())));
                                                } catch (Throwable th) {
                                                    th = th;
                                                    try {
                                                        float f10 = -fEA6;
                                                        cxdVar.r().c.i(BitmapDescriptorFactory.HUE_RED, f10, BitmapDescriptorFactory.HUE_RED, f10);
                                                        throw th;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        cxdVar.r().c.i(f2, f, f5, f);
                                                        throw th;
                                                    }
                                                }
                                            }
                                            axz axzVar = (axz) aqfVar;
                                            axzVar.d();
                                            float fB2 = afpt.b(BitmapDescriptorFactory.HUE_RED, 1.0f);
                                            axzVar.d();
                                            axt axtVar = (axt) woy.bF(axzVar.d().b);
                                            float fA2 = (axtVar.a() + ((-dlo.a(axtVar.b())) / ((int) (axtVar.c() & 4294967295L)))) / BitmapDescriptorFactory.HUE_RED;
                                            axt axtVar2 = (axt) woy.bK(axzVar.d().b);
                                            axzVar.d();
                                            float f11 = fB2 + BitmapDescriptorFactory.HUE_RED;
                                            axzVar.d();
                                            float fA3 = ((axtVar2.a() + (((f11 + BitmapDescriptorFactory.HUE_RED) - dlo.a(axtVar2.b())) / ((int) (axtVar2.c() & 4294967295L)))) / BitmapDescriptorFactory.HUE_RED) - fA2;
                                            jAA = roc.aA(fA3, fA2 / (1.0f - fA3));
                                        }
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jAA & 4294967295L)) * (Float.intBitsToFloat((int) (cxdVar.o() & 4294967295L)) - afpt.d(Float.intBitsToFloat((int) (cxdVar.o() & 4294967295L)) * Float.intBitsToFloat((int) (jAA >> c)), cxdVar.eA(48.0f), cxdVar.eA(128.0f)));
                                        jFloatToRawIntBits = Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << c;
                                        jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L;
                                        try {
                                            jFloatToRawIntBits3 = Float.floatToRawIntBits(cxdVar.eA(4.0f)) << c;
                                            jFloatToRawIntBits4 = Float.floatToRawIntBits(r0) & 4294967295L;
                                            fEA = cxdVar.eA(4.0f);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            f = f6;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        f = f6;
                                        f2 = f7;
                                    }
                                    try {
                                        long j3 = jFloatToRawIntBits4 | jFloatToRawIntBits3;
                                        f = f6;
                                        cxdVar = cxdVar;
                                        try {
                                            czz.H(cxdVar, j2, jFloatToRawIntBits2 | jFloatToRawIntBits, j3, (Float.floatToRawIntBits(fEA) << c) | (Float.floatToRawIntBits(fEA) & 4294967295L), f3, 208);
                                            try {
                                                float f12 = -fEA6;
                                                cxdVar.r().c.i(BitmapDescriptorFactory.HUE_RED, f12, BitmapDescriptorFactory.HUE_RED, f12);
                                                cxdVar.r().c.i(f7, f, f5, f);
                                            } catch (Throwable th5) {
                                                th = th5;
                                                f2 = f7;
                                                cxdVar.r().c.i(f2, f, f5, f);
                                                throw th;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            f2 = f7;
                                            float f102 = -fEA6;
                                            cxdVar.r().c.i(BitmapDescriptorFactory.HUE_RED, f102, BitmapDescriptorFactory.HUE_RED, f102);
                                            throw th;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        f = f6;
                                        f2 = f7;
                                        cxdVar = cxdVar;
                                        float f1022 = -fEA6;
                                        cxdVar.r().c.i(BitmapDescriptorFactory.HUE_RED, f1022, BitmapDescriptorFactory.HUE_RED, f1022);
                                        throw th;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    f = f6;
                                    f2 = f7;
                                }
                            }
                        }
                    }
                    return afak.a;
                }
            };
            buxVar2.x(objG3);
        }
        cfy cfyVarR = bxc.r(cfyVar, (afec) objG3);
        buxVar2.o();
        return cfyVarR;
    }

    public /* synthetic */ kvq(long j, kvs kvsVar, aqf aqfVar, int i) {
        this.d = i;
        this.a = j;
        this.c = kvsVar;
        this.b = aqfVar;
    }
}
