package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class afe implements afec {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ afe(adu aduVar, aed aedVar, afec afecVar, affq affqVar, int i) {
        this.e = i;
        this.b = aduVar;
        this.a = aedVar;
        this.c = afecVar;
        this.d = affqVar;
    }

    /* JADX WARN: Type inference failed for: r11v13, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v23, types: [bah, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v5, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [apr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [afec, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i = this.e;
        if (i == 0) {
            long jLongValue = ((Long) obj).longValue();
            bym bymVar = (bym) this.a.a();
            long jLongValue2 = bymVar != null ? ((Number) bymVar.a()).longValue() : jLongValue;
            ?? r12 = this.d;
            Object obj2 = this.c;
            afh afhVar = (afh) this.b;
            if (afhVar.b == Long.MIN_VALUE || ((affs) obj2).a != afp.c(r12.c())) {
                afhVar.b = jLongValue;
                byw bywVar = afhVar.a;
                Object[] objArr = bywVar.a;
                int i2 = bywVar.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((afd) objArr[i3]).f = true;
                }
                ((affs) obj2).a = afp.c(r12.c());
            }
            float f = ((affs) obj2).a;
            if (f == BitmapDescriptorFactory.HUE_RED) {
                byw bywVar2 = afhVar.a;
                Object[] objArr2 = bywVar2.a;
                int i4 = bywVar2.b;
                for (int i5 = 0; i5 < i4; i5++) {
                    afd afdVar = (afd) objArr2[i5];
                    afdVar.b(afdVar.d.a);
                    afdVar.f = true;
                }
            } else {
                float f2 = (jLongValue2 - afhVar.b) / f;
                byw bywVar3 = afhVar.a;
                Object[] objArr3 = bywVar3.a;
                int i6 = bywVar3.b;
                boolean z = true;
                for (int i7 = 0; i7 < i6; i7++) {
                    afd afdVar2 = (afd) objArr3[i7];
                    boolean zH = afdVar2.e;
                    if (!zH) {
                        long j = (long) f2;
                        afdVar2.h.b(false);
                        if (afdVar2.f) {
                            afdVar2.f = false;
                            afdVar2.g = j;
                        }
                        long j2 = j - afdVar2.g;
                        afdVar2.b(afdVar2.d.c(j2));
                        zH = ca.H(afdVar2.d, j2);
                        afdVar2.e = zH;
                    }
                    z &= zH;
                }
                afhVar.c.b(Boolean.valueOf(!z));
            }
            return afak.a;
        }
        if (i == 1) {
            Object obj3 = this.b;
            adu aduVar = (adu) obj3;
            aed aedVar = aduVar.b;
            aeb aebVar = (aeb) obj;
            afp.h(aebVar, aedVar);
            Object objB = aduVar.b(aebVar.a());
            boolean zF = affa.f(objB, aebVar.a());
            ?? r5 = this.c;
            if (!zF) {
                Object obj4 = this.a;
                aedVar.c(objB);
                ((aed) obj4).c(objB);
                if (r5 != 0) {
                    r5.invoke(obj3);
                }
                Object obj5 = this.d;
                aebVar.b();
                ((affq) obj5).a = true;
            } else if (r5 != 0) {
                r5.invoke(obj3);
            }
            return afak.a;
        }
        if (i == 2) {
            aeb aebVar2 = (aeb) obj;
            float fFloatValue = ((Number) aebVar2.a()).floatValue();
            affs affsVar = (affs) this.c;
            float f3 = fFloatValue - affsVar.a;
            float fA = this.a.a(f3);
            affsVar.a = ((Number) aebVar2.a()).floatValue();
            ((affs) this.d).a = ((Number) aebVar2.f.a.invoke(aebVar2.c)).floatValue();
            if (Math.abs(f3 - fA) > 0.5f) {
                aebVar2.b();
            }
            ((anh) this.b).a++;
            return afak.a;
        }
        if (i == 3) {
            aeb aebVar3 = (aeb) obj;
            long jFloatToRawIntBits = Float.floatToRawIntBits(((Number) aebVar3.a()).floatValue());
            affu affuVar = (affu) this.d;
            long jI = apc.i(jFloatToRawIntBits, affuVar.a);
            if (!apc.h(jI)) {
                if (!apc.h(apc.i(jI, ((apc) this.b).l((izj) this.a, jI)))) {
                    aebVar3.b();
                    return afak.a;
                }
                affuVar.a = apc.k(affuVar.a, jI);
            }
            if (((Boolean) this.c.invoke(new aps(affuVar.a))).booleanValue()) {
                aebVar3.b();
            }
            return afak.a;
        }
        if (i != 4) {
            if (i == 5) {
                sji sjiVar = new sji((nfh) this.b, (cvc) this.d, this.c);
                Object obj6 = this.a;
                ((azt) obj6).f = sjiVar;
                return new agj(obj6, 3);
            }
            bed bedVar = (bed) this.b;
            if (bedVar.p()) {
                bedVar.s = asl.ae((fbf) this.d, (djv) this.c, bedVar.t, (dje) this.a, bedVar.m, bedVar.n);
            }
            return new bdp(0);
        }
        apc apcVar = (apc) this.b;
        aps apsVar = (aps) obj;
        aoy aoyVarG = apc.g(apcVar.a);
        if (aoyVarG != null) {
            Object obj7 = this.a;
            Object obj8 = this.c;
            Object obj9 = this.d;
            apcVar.e(aoyVarG);
            affv affvVar = (affv) obj9;
            affvVar.a = ((aoy) affvVar.a).a(aoyVarG);
            ((affu) obj8).a = apcVar.b(((aoy) affvVar.a).a);
            ((affq) obj7).a = !apc.h(apc.i(r6, apsVar.a));
        }
        return Boolean.valueOf(aoyVarG != null);
    }

    public /* synthetic */ afe(affs affsVar, apr aprVar, affs affsVar2, anh anhVar, int i) {
        this.e = i;
        this.c = affsVar;
        this.a = aprVar;
        this.d = affsVar2;
        this.b = anhVar;
    }

    public /* synthetic */ afe(apc apcVar, affu affuVar, izj izjVar, afec afecVar, int i) {
        this.e = i;
        this.b = apcVar;
        this.d = affuVar;
        this.a = izjVar;
        this.c = afecVar;
    }

    public /* synthetic */ afe(azt aztVar, nfh nfhVar, cvc cvcVar, bah bahVar, int i) {
        this.e = i;
        this.a = aztVar;
        this.b = nfhVar;
        this.d = cvcVar;
        this.c = bahVar;
    }

    public /* synthetic */ afe(bwq bwqVar, afh afhVar, affs affsVar, aitx aitxVar, int i) {
        this.e = i;
        this.a = bwqVar;
        this.b = afhVar;
        this.c = affsVar;
        this.d = aitxVar;
    }

    public /* synthetic */ afe(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
        this.a = obj4;
    }
}
