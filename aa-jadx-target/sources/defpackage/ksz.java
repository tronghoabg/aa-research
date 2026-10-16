package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ksz {
    public static final defpackage.bpi a;
    private static final defpackage.bmb b;

    static {
        defpackage.bmb bmbVar = new defpackage.bmb(0.08f, 0.12f);
        b = bmbVar;
        a = new defpackage.bpi(defpackage.cjv.c(), bmbVar);
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0151  */
    /* JADX WARN: Code duplicated, block: B:83:0x0206  */
    public static final void a(defpackage.ksw kswVar, defpackage.bpz bpzVar, boolean z, defpackage.bse bseVar, final defpackage.affg affgVar, defpackage.bve bveVar, final int i, final int i2) {
        int i3;
        defpackage.bpz bpzVar2;
        final defpackage.bse bseVar2;
        final defpackage.bpz bpzVar3;
        defpackage.dgd dgdVar;
        defpackage.dgd dgdVar2;
        defpackage.ksv ksvVar;
        defpackage.dil dilVar;
        defpackage.bvm bvmVar;
        defpackage.bse bseVar3;
        int i4;
        defpackage.bse bseVar4;
        defpackage.ksw kswVarI = kswVar;
        boolean z2 = z;
        affgVar.getClass();
        int i5 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1768042784);
        if (i5 == 0) {
            int i6 = 2;
            if ((i2 & 1) == 0) {
                if ((i & 8) == 0 ? bveVarC.C(kswVarI) : bveVarC.E(kswVarI)) {
                    i6 = 4;
                }
            }
            i3 = i | i6;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                bpzVar2 = bpzVar;
                int i7 = bveVarC.C(bpzVar2) ? 32 : 16;
                i3 |= i7;
            } else {
                bpzVar2 = bpzVar;
            }
            i3 |= i7;
        } else {
            bpzVar2 = bpzVar;
        }
        int i8 = i2 & 4;
        boolean z3 = i8 == 0;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != bveVarC.D(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= true != bveVarC.E(affgVar) ? 8192 : 16384;
        }
        if (bveVarC.I((i3 & 9363) != 9362, i3 & 1)) {
            int i9 = i2 & 2;
            int i10 = i2 & 1;
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                if (i10 != 0) {
                    i3 &= -15;
                    kswVarI = defpackage.kfp.i(bveVarC);
                }
                if (i9 != 0) {
                    i3 &= -113;
                    bpzVar2 = defpackage.ktb.a;
                }
                z2 |= !z3;
                bveVarC.v(-975626097);
                if (z2 && defpackage.ebo.r()) {
                    defpackage.dhz dhzVar = defpackage.ktc.a;
                    dgdVar2 = new defpackage.dgd(0L, 0L, null, defpackage.ktc.c, 0L, 0, 0L, 16777183);
                } else {
                    if (defpackage.lee.a.a().b()) {
                        defpackage.dhz dhzVar2 = defpackage.ktc.a;
                        dgdVar2 = new defpackage.dgd(0L, 0L, null, defpackage.ktc.b, 0L, 0, 0L, 16777183);
                    } else {
                        defpackage.dhz dhzVar3 = defpackage.ktc.a;
                        dgdVar = new defpackage.dgd(0L, 0L, null, defpackage.ktc.a, 0L, 0, 0L, 16777183);
                    }
                    dilVar = defpackage.ktc.f;
                    bvmVar = defpackage.dbl.d;
                    ksvVar = new defpackage.ksv(dgdVar, dilVar, (defpackage.dlo) bveVarC.f(bvmVar));
                    if (defpackage.lee.a.a().b()) {
                        bveVarC.v(-832697007);
                        defpackage.ksv ksvVar2 = new defpackage.ksv(new defpackage.dgd(0L, 0L, dilVar, defpackage.ktc.d, 0L, 0, 0L, 16777179), defpackage.ktc.e, (defpackage.dlo) bveVarC.f(bvmVar));
                        defpackage.bse bseVar5 = new defpackage.bse(ksvVar.a, ksvVar.b, ksvVar.c, ksvVar.d, ksvVar.e, ksvVar.f, ksvVar.g, ksvVar.h, ksvVar.i, ksvVar.j, ksvVar.k, ksvVar.l, ksvVar.m, ksvVar.n, ksvVar.o, ksvVar2.a, ksvVar2.b, ksvVar2.c, ksvVar2.d, ksvVar2.e, ksvVar2.f, ksvVar2.g, ksvVar2.h, ksvVar2.i, ksvVar2.j, ksvVar2.k, ksvVar2.l, ksvVar2.m, ksvVar2.n, ksvVar2.o);
                        bwcVar.Y(false);
                        bwcVar.Y(false);
                        bseVar3 = bseVar5;
                    } else {
                        bveVarC.v(-830542445);
                        bwcVar.Y(false);
                        defpackage.dgd dgdVar3 = ksvVar.a;
                        defpackage.dgd dgdVar4 = ksvVar.b;
                        defpackage.dgd dgdVar5 = ksvVar.c;
                        defpackage.dgd dgdVar6 = ksvVar.d;
                        defpackage.dgd dgdVar7 = ksvVar.e;
                        defpackage.dgd dgdVar8 = ksvVar.f;
                        defpackage.dgd dgdVar9 = ksvVar.g;
                        defpackage.dgd dgdVar10 = ksvVar.h;
                        defpackage.dgd dgdVar11 = ksvVar.i;
                        defpackage.dgd dgdVar12 = ksvVar.j;
                        defpackage.dgd dgdVar13 = ksvVar.k;
                        defpackage.dgd dgdVar14 = ksvVar.l;
                        defpackage.dgd dgdVar15 = ksvVar.m;
                        defpackage.dgd dgdVar16 = ksvVar.n;
                        defpackage.dgd dgdVar17 = ksvVar.o;
                        bseVar3 = new defpackage.bse(dgdVar3, dgdVar4, dgdVar5, dgdVar6, dgdVar7, dgdVar8, dgdVar9, dgdVar10, dgdVar11, dgdVar12, dgdVar13, dgdVar14, dgdVar15, dgdVar16, dgdVar17, dgdVar3, dgdVar4, dgdVar5, dgdVar6, dgdVar7, dgdVar8, dgdVar9, dgdVar10, dgdVar11, dgdVar12, dgdVar13, dgdVar14, dgdVar15, dgdVar16, dgdVar17);
                        bwcVar.Y(false);
                    }
                    i4 = i3 & (-7169);
                    kswVarI = kswVarI;
                    bseVar4 = bseVar3;
                }
                dgdVar = dgdVar2;
                dilVar = defpackage.ktc.f;
                bvmVar = defpackage.dbl.d;
                ksvVar = new defpackage.ksv(dgdVar, dilVar, (defpackage.dlo) bveVarC.f(bvmVar));
                if (defpackage.lee.a.a().b()) {
                    bveVarC.v(-832697007);
                    defpackage.ksv ksvVar3 = new defpackage.ksv(new defpackage.dgd(0L, 0L, dilVar, defpackage.ktc.d, 0L, 0, 0L, 16777179), defpackage.ktc.e, (defpackage.dlo) bveVarC.f(bvmVar));
                    defpackage.bse bseVar6 = new defpackage.bse(ksvVar.a, ksvVar.b, ksvVar.c, ksvVar.d, ksvVar.e, ksvVar.f, ksvVar.g, ksvVar.h, ksvVar.i, ksvVar.j, ksvVar.k, ksvVar.l, ksvVar.m, ksvVar.n, ksvVar.o, ksvVar3.a, ksvVar3.b, ksvVar3.c, ksvVar3.d, ksvVar3.e, ksvVar3.f, ksvVar3.g, ksvVar3.h, ksvVar3.i, ksvVar3.j, ksvVar3.k, ksvVar3.l, ksvVar3.m, ksvVar3.n, ksvVar3.o);
                    bwcVar.Y(false);
                    bwcVar.Y(false);
                    bseVar3 = bseVar6;
                } else {
                    bveVarC.v(-830542445);
                    bwcVar.Y(false);
                    defpackage.dgd dgdVar18 = ksvVar.a;
                    defpackage.dgd dgdVar19 = ksvVar.b;
                    defpackage.dgd dgdVar20 = ksvVar.c;
                    defpackage.dgd dgdVar21 = ksvVar.d;
                    defpackage.dgd dgdVar22 = ksvVar.e;
                    defpackage.dgd dgdVar23 = ksvVar.f;
                    defpackage.dgd dgdVar24 = ksvVar.g;
                    defpackage.dgd dgdVar110 = ksvVar.h;
                    defpackage.dgd dgdVar111 = ksvVar.i;
                    defpackage.dgd dgdVar112 = ksvVar.j;
                    defpackage.dgd dgdVar113 = ksvVar.k;
                    defpackage.dgd dgdVar114 = ksvVar.l;
                    defpackage.dgd dgdVar115 = ksvVar.m;
                    defpackage.dgd dgdVar116 = ksvVar.n;
                    defpackage.dgd dgdVar117 = ksvVar.o;
                    bseVar3 = new defpackage.bse(dgdVar18, dgdVar19, dgdVar20, dgdVar21, dgdVar22, dgdVar23, dgdVar24, dgdVar110, dgdVar111, dgdVar112, dgdVar113, dgdVar114, dgdVar115, dgdVar116, dgdVar117, dgdVar18, dgdVar19, dgdVar20, dgdVar21, dgdVar22, dgdVar23, dgdVar24, dgdVar110, dgdVar111, dgdVar112, dgdVar113, dgdVar114, dgdVar115, dgdVar116, dgdVar117);
                    bwcVar.Y(false);
                }
                i4 = i3 & (-7169);
                kswVarI = kswVarI;
                bseVar4 = bseVar3;
            } else {
                bveVarC.s();
                if (i10 != 0) {
                    i3 &= -15;
                }
                if (i9 != 0) {
                    i3 &= -113;
                }
                i4 = i3 & (-7169);
                bseVar4 = bseVar;
            }
            defpackage.bpz bpzVar4 = bpzVar2;
            bveVarC.l();
            java.lang.Object objS = bwcVar.S();
            if (objS == defpackage.bvd.a) {
                objS = new defpackage.ksw(kswVarI.A(), kswVarI.m(), kswVarI.B(), kswVarI.n(), kswVarI.g(), kswVarI.E(), kswVarI.q(), kswVarI.F(), kswVarI.r(), kswVarI.P(), kswVarI.u(), kswVarI.Q(), kswVarI.v(), kswVarI.a(), kswVarI.G(), kswVarI.N(), kswVarI.M(), kswVarI.s(), kswVarI.h(), kswVarI.f(), kswVarI.O(), kswVarI.t(), kswVarI.H(), kswVarI.K(), kswVarI.L(), kswVarI.I(), kswVarI.J(), kswVarI.y(), kswVarI.z(), kswVarI.R(), kswVarI.S(), kswVarI.C(), kswVarI.o(), kswVarI.D(), kswVarI.p(), kswVarI.d(), kswVarI.k(), kswVarI.e(), kswVarI.l(), kswVarI.b(), kswVarI.i(), kswVarI.c(), kswVarI.j(), kswVarI.T(), kswVarI.w(), kswVarI.U(), kswVarI.x(), kswVarI.V());
                bwcVar.ad(objS);
            }
            defpackage.ksw kswVar2 = (defpackage.ksw) objS;
            defpackage.ksw kswVar3 = defpackage.ksx.a;
            kswVar2.getClass();
            kswVarI.getClass();
            kswVar2.a.b(new defpackage.ckd(kswVarI.A()));
            kswVar2.b.b(new defpackage.ckd(kswVarI.m()));
            kswVar2.c.b(new defpackage.ckd(kswVarI.B()));
            kswVar2.d.b(new defpackage.ckd(kswVarI.n()));
            kswVar2.e.b(new defpackage.ckd(kswVarI.g()));
            kswVar2.f.b(new defpackage.ckd(kswVarI.E()));
            kswVar2.g.b(new defpackage.ckd(kswVarI.q()));
            kswVar2.h.b(new defpackage.ckd(kswVarI.F()));
            kswVar2.i.b(new defpackage.ckd(kswVarI.r()));
            kswVar2.j.b(new defpackage.ckd(kswVarI.P()));
            kswVar2.k.b(new defpackage.ckd(kswVarI.u()));
            kswVar2.l.b(new defpackage.ckd(kswVarI.Q()));
            kswVar2.m.b(new defpackage.ckd(kswVarI.v()));
            kswVar2.n.b(new defpackage.ckd(kswVarI.G()));
            kswVar2.o.b(new defpackage.ckd(kswVarI.N()));
            kswVar2.p.b(new defpackage.ckd(kswVarI.M()));
            kswVar2.q.b(new defpackage.ckd(kswVarI.s()));
            kswVar2.r.b(new defpackage.ckd(kswVarI.h()));
            kswVar2.s.b(new defpackage.ckd(kswVarI.f()));
            kswVar2.t.b(new defpackage.ckd(kswVarI.O()));
            kswVar2.u.b(new defpackage.ckd(kswVarI.t()));
            kswVar2.v.b(new defpackage.ckd(kswVarI.H()));
            kswVar2.w.b(new defpackage.ckd(kswVarI.K()));
            kswVar2.x.b(new defpackage.ckd(kswVarI.L()));
            kswVar2.y.b(new defpackage.ckd(kswVarI.I()));
            kswVar2.z.b(new defpackage.ckd(kswVarI.J()));
            kswVar2.A.b(new defpackage.ckd(kswVarI.y()));
            kswVar2.B.b(new defpackage.ckd(kswVarI.z()));
            kswVar2.C.b(new defpackage.ckd(kswVarI.R()));
            kswVar2.D.b(new defpackage.ckd(kswVarI.S()));
            kswVar2.E.b(new defpackage.ckd(kswVarI.C()));
            kswVar2.F.b(new defpackage.ckd(kswVarI.o()));
            kswVar2.G.b(new defpackage.ckd(kswVarI.D()));
            kswVar2.H.b(new defpackage.ckd(kswVarI.p()));
            kswVar2.I.b(new defpackage.ckd(kswVarI.d()));
            kswVar2.J.b(new defpackage.ckd(kswVarI.k()));
            kswVar2.K.b(new defpackage.ckd(kswVarI.e()));
            kswVar2.L.b(new defpackage.ckd(kswVarI.l()));
            kswVar2.M.b(new defpackage.ckd(kswVarI.b()));
            kswVar2.N.b(new defpackage.ckd(kswVarI.i()));
            kswVar2.O.b(new defpackage.ckd(kswVarI.c()));
            kswVar2.P.b(new defpackage.ckd(kswVarI.j()));
            kswVar2.Q.b(new defpackage.ckd(kswVarI.T()));
            kswVar2.R.b(new defpackage.ckd(kswVarI.w()));
            kswVar2.S.b(new defpackage.ckd(kswVarI.U()));
            kswVar2.T.b(new defpackage.ckd(kswVarI.x()));
            kswVarI.getClass();
            defpackage.bom.a(new defpackage.bnk(kswVarI.A(), kswVarI.m(), kswVarI.B(), kswVarI.n(), kswVarI.g(), kswVarI.E(), kswVarI.q(), kswVarI.F(), kswVarI.r(), kswVarI.P(), kswVarI.u(), kswVarI.Q(), kswVarI.v(), defpackage.lem.a.a().b() ? kswVarI.a() : kswVarI.M(), kswVarI.s(), kswVarI.G(), kswVarI.s(), kswVarI.O(), kswVarI.t(), kswVarI.A(), kswVarI.h(), kswVarI.f(), kswVarI.C(), kswVarI.o(), kswVarI.D(), kswVarI.p(), kswVarI.y(), kswVarI.z(), kswVarI.M(), kswVarI.N(), kswVarI.M(), kswVarI.H(), kswVarI.I(), kswVarI.J(), kswVarI.K(), kswVarI.L()), bpzVar4, bseVar4, defpackage.dai.as(1957725876, true, new defpackage.aps(kswVar2, affgVar, 16, null), bveVarC), bveVarC, (i4 & 112) | 3072, 0);
            bpzVar3 = bpzVar4;
            bseVar2 = bseVar4;
        } else {
            bveVarC.s();
            bseVar2 = bseVar;
            bpzVar3 = bpzVar2;
        }
        final boolean z4 = z2;
        final defpackage.ksw kswVar4 = kswVarI;
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: ksy
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.bve bveVar2 = (defpackage.bve) obj;
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.ksw kswVar5 = kswVar4;
                    int i11 = i | 1;
                    int i12 = 306783378 & i11;
                    int i13 = 613566756 & i11;
                    defpackage.ksz.a(kswVar5, bpzVar3, z4, bseVar2, affgVar, bveVar2, (i11 & (-920350135)) | i12 | (i13 >> 1) | ((i12 + i12) & i13), i2);
                    return defpackage.afbk.a;
                }
            };
        }
    }
}
