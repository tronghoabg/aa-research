package defpackage;

/* loaded from: classes2.dex */
public final class jtk {
    public static final void a(fvo fvoVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-980765547);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(fvoVar) : buxVarC.E(fvoVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            geu geuVar = (geu) buxVarC.f(gew.a);
            wci wciVar = (wci) buxVarC.f(dbc.f);
            dfw dfwVar = (dfw) buxVarC.f(brp.a);
            long j = ((cjv) buxVarC.f(bnm.a)).a;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new hkh(19);
                bvvVar.ad(objS);
            }
            afec afecVar = (afec) objS;
            boolean zE = buxVarC.E(geuVar) | ((i2 & 14) == 4 || ((i2 & 8) != 0 && buxVarC.E(fvoVar))) | buxVarC.C(dfwVar) | buxVarC.B(j) | buxVarC.E(wciVar);
            Object objS2 = bvvVar.S();
            if (zE || objS2 == obj) {
                objS2 = new hkh(20);
                bvvVar.ad(objS2);
            }
            jur.f(afecVar, cfyVar, (afec) objS2, buxVarC, (i2 & 112) | 6);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new jtt(fvoVar, cfyVar, i, i4);
        }
    }

    public static final cjv b(fwd fwdVar, boolean z) {
        return new cjv(cjn.i(z ? fwdVar.a : fwdVar.b));
    }

    public static /* synthetic */ afak c(boolean z, cie cieVar) {
        cieVar.getClass();
        cieVar.a(z);
        return afak.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    public static final void d(final gfa gfaVar, final gfk gfkVar, ktf ktfVar, fwe fweVar, boolean z, boolean z2, final afeh afehVar, bux buxVar, int i, int i2) {
        int i3;
        ?? r41;
        boolean z3;
        boolean z4;
        fwe fweVar2;
        fwd fwdVar;
        fwd fwdVar2;
        fwd fwdVar3;
        fwd fwdVar4;
        gfaVar.getClass();
        ktfVar.getClass();
        afehVar.getClass();
        int i4 = i & 6;
        bux buxVarC = buxVar.c(809514888);
        if (i4 == 0) {
            i3 = (true != ((i & 8) == 0 ? buxVarC.C(gfaVar) : buxVarC.E(gfaVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != ((i & 64) == 0 ? buxVarC.C(gfkVar) : buxVarC.E(gfkVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.C(ktfVar) ? 128 : 256;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= true != ((i & 4096) == 0 ? buxVarC.C(fweVar) : buxVarC.E(fweVar)) ? 1024 : 2048;
        }
        int i6 = i2 & 16;
        boolean z5 = i6 == 0;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= true != buxVarC.D(z) ? 8192 : 16384;
        }
        int i7 = i2 & 32;
        boolean z6 = i7 == 0;
        if (i7 != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= true != buxVarC.D(z2) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            r41 = 0;
            i3 |= true != buxVarC.E(afehVar) ? 524288 : 1048576;
        } else {
            r41 = 0;
        }
        if (buxVarC.I((599187 & i3) != 599186 ? true : r41, i3 & 1)) {
            fwe fweVar3 = i5 != 0 ? null : fweVar;
            boolean z7 = (!z5) | z;
            final boolean z8 = (!z6) | z2;
            final affv affvVar = new affv();
            fwd[] fwdVarArr = new fwd[2];
            fwdVarArr[r41] = fweVar3 != null ? fweVar3.d : null;
            fwdVarArr[1] = fweVar3 != null ? fweVar3.a : null;
            fwd fwdVar5 = (fwd) afrg.h(afrg.n(woy.dk(fwdVarArr)));
            long j = fwdVar5 != null ? b(fwdVar5, z7).a : ktfVar.j;
            fwd[] fwdVarArr2 = new fwd[3];
            fwdVarArr2[r41] = fweVar3 != null ? fweVar3.e : null;
            fwdVarArr2[1] = fweVar3 != null ? fweVar3.b : null;
            fwdVarArr2[2] = fweVar3 != null ? fweVar3.c : null;
            fwd fwdVar6 = (fwd) afrg.h(afrg.n(woy.dk(fwdVarArr2)));
            long j2 = fwdVar6 != null ? b(fwdVar6, z7).a : ktfVar.k;
            fwd[] fwdVarArr3 = new fwd[3];
            fwdVarArr3[r41] = fweVar3 != null ? fweVar3.f : null;
            fwdVarArr3[1] = fweVar3 != null ? fweVar3.b : null;
            fwdVarArr3[2] = fweVar3 != null ? fweVar3.c : null;
            fwd fwdVar7 = (fwd) afrg.h(afrg.n(woy.dk(fwdVarArr3)));
            long j3 = fwdVar7 != null ? b(fwdVar7, z7).a : ktfVar.l;
            fwd[] fwdVarArr4 = new fwd[2];
            fwdVarArr4[r41] = fweVar3 != null ? fweVar3.b : null;
            fwdVarArr4[1] = fweVar3 != null ? fweVar3.c : null;
            fwd fwdVar8 = (fwd) afrg.h(afrg.n(woy.dk(fwdVarArr4)));
            affvVar.a = new ktf((fweVar3 == null || (fwdVar4 = fweVar3.a) == null) ? ktfVar.g : b(fwdVar4, z7).a, fwdVar8 != null ? b(fwdVar8, z7).a : ktfVar.h, (fweVar3 == null || (fwdVar3 = fweVar3.c) == null) ? ktfVar.i : b(fwdVar3, z7).a, j, j2, j3, (fweVar3 == null || (fwdVar2 = fweVar3.g) == null) ? ktfVar.m : b(fwdVar2, z7).a, (fweVar3 == null || (fwdVar = fweVar3.h) == null) ? ktfVar.n : b(fwdVar, z7).a);
            ktf ktfVar2 = (ktf) affvVar.a;
            if (!fww.p(ktfVar2.g, g(gfaVar, ktfVar2), buxVarC, 0)) {
                yph yphVar = jtm.a;
                ((ype) jtm.a.h()).u("Button colors failed contrast check");
                affvVar.a = ktfVar;
            }
            ktf ktfVar3 = (ktf) affvVar.a;
            fwn.i(ktfVar3.g, g(gfaVar, ktfVar3), bxc.i(91190140, true, new afeg() { // from class: jtn
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (buxVar2.I((iIntValue & 3) != 2, iIntValue & 1)) {
                        afehVar.invoke(new kzt(affvVar, fwl.v(null, null, z8 ? new cjv(cjn.n()) : null, false, gfaVar, buxVar2, 0, 27), gfkVar, buxVar2), buxVar2, 0);
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, 384);
            buxVarC = buxVarC;
            z4 = z8;
            fweVar2 = fweVar3;
            z3 = z7;
        } else {
            buxVarC.s();
            z3 = z;
            z4 = z2;
            fweVar2 = fweVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mch(gfaVar, gfkVar, ktfVar, fweVar2, z3, z4, afehVar, i, i2, 1);
        }
    }

    public static final int e(fwf fwfVar) {
        fwfVar.getClass();
        return afgi.k(f(fwfVar).i);
    }

    public static final ksy f(fwf fwfVar) {
        fwfVar.getClass();
        int iOrdinal = fwfVar.ordinal();
        if (iOrdinal == 0) {
            return ksy.a;
        }
        if (iOrdinal == 1) {
            return ksy.b;
        }
        if (iOrdinal == 2) {
            return ksy.c;
        }
        if (iOrdinal == 3) {
            return ksy.d;
        }
        throw new aezs();
    }

    private static final long g(gfa gfaVar, ktf ktfVar) {
        return gfaVar.a() ? ktfVar.h : ktfVar.i;
    }
}
