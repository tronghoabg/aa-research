package defpackage;

/* loaded from: classes2.dex */
public final class bqu {
    public static final afr a = new afr(0);

    public static final void a(cfy cfyVar, boolean z, boolean z2, bqs bqsVar, ase aseVar, ckv ckvVar, bux buxVar, int i) {
        int i2;
        boolean z3;
        boolean z4;
        long j;
        boolean z5;
        long j2;
        long j3;
        boolean z6;
        boolean z7;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-670917213);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(bqsVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.E(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.C(aseVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.C(ckvVar) ? 524288 : 1048576;
        }
        if (buxVarC.I((599187 & i2) != 599186, i2 & 1)) {
            if (z2) {
                if (z) {
                    j = bqsVar.b;
                    z5 = true;
                } else {
                    j = bqsVar.e;
                    z5 = false;
                }
            } else if (z) {
                j = bqsVar.h;
                z5 = true;
            } else {
                j = bqsVar.k;
                z5 = false;
            }
            long j4 = z2 ? z5 ? bqsVar.a : bqsVar.d : z5 ? bqsVar.g : bqsVar.j;
            ckv ckvVarAr = czz.ar(7, buxVarC);
            bvf bvfVar = bpe.a;
            Object obj = ((kgx) buxVarC.f(bvfVar)).a;
            cfv cfvVar = cfy.e;
            if (z2) {
                if (z5) {
                    j2 = j4;
                    j3 = bqsVar.c;
                    z6 = true;
                } else {
                    j2 = j4;
                    j3 = bqsVar.f;
                    z6 = false;
                }
                z7 = true;
            } else {
                j2 = j4;
                if (z5) {
                    j3 = bqsVar.i;
                    z6 = true;
                } else {
                    j3 = bqsVar.l;
                    z6 = false;
                }
                z7 = false;
            }
            cfy cfyVarA = afp.E(afp.D(cfyVar, 2.0f, j3, ckvVarAr), j, ckvVarAr).a(cfvVar);
            ctp ctpVarB = atk.b(cfl.a, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarA);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            afeg afegVar = cwb.e;
            byq.c(buxVarC, ctpVarB, afegVar);
            afeg afegVar2 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar2);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar3 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar3);
            afec afecVar = cwb.g;
            byq.b(buxVarC, afecVar);
            afeg afegVar4 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar4);
            cfy cfyVarA2 = atn.a.a(cfvVar, cfl.d).a(new brq(aseVar, z5, rl.b(2, buxVarC)));
            Object obj2 = ((kgx) buxVarC.f(bvfVar)).a;
            cfy cfyVarE = afp.E(aki.a(cfyVarA2, aseVar, bpe.a(false, 20.0f, 0L, null, true, 220)), j2, ckvVar);
            ctp ctpVarB2 = atk.b(cfl.e, false);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarE);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB2, afegVar);
            byq.c(buxVarC, ccxVarAh2, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar3);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ2, afegVar4);
            buxVarC.v(1236071411);
            bvvVar.Y(false);
            bvvVar.Y(true);
            bvvVar.Y(true);
            z4 = z6;
            z3 = z7;
        } else {
            buxVarC.s();
            z3 = z2;
            z4 = z;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mxm(cfyVar, z4, z3, bqsVar, aseVar, ckvVar, i, 1);
        }
    }

    public static final void b(boolean z, cfy cfyVar, boolean z2, bqs bqsVar, bux buxVar, int i) {
        boolean z3;
        int i2;
        cfy cfyVar2;
        bqs bqsVar2;
        cfy cfyVar3;
        int i3;
        boolean z4;
        bux buxVar2;
        bqs bqsVar3;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-263339167);
        if (i4 == 0) {
            z3 = z;
            i2 = (true != buxVarC.D(z3) ? 2 : 4) | i;
        } else {
            z3 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(null) ? 16 : 32;
        }
        int i5 = i2 | 3456;
        if ((i & 24576) == 0) {
            i5 |= true != buxVarC.D(z2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i5 |= 65536;
        }
        int i6 = i5 | 1572864;
        if (buxVarC.I((599187 & i6) != 599186, i6 & 1)) {
            int i7 = i6 >> 6;
            int i8 = i6 & (-458753);
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                cfyVar3 = cfy.e;
                bng bngVarAt = czz.at(buxVarC);
                bqs bqsVar4 = bngVarAt.af;
                if (bqsVar4 == null) {
                    long jE = bnh.e(bngVarAt, 10);
                    long jE2 = bnh.e(bngVarAt, 26);
                    long jE3 = bnh.e(bngVarAt, 11);
                    long jE4 = bnh.e(bngVarAt, 24);
                    long jE5 = bnh.e(bngVarAt, 39);
                    long jE6 = bnh.e(bngVarAt, 24);
                    long jE7 = bnh.e(bngVarAt, 39);
                    i3 = i7;
                    long jH = cjv.h(bnh.e(bngVarAt, 35), 1.0f);
                    z4 = false;
                    long j = bngVarAt.p;
                    buxVar2 = buxVarC;
                    bqs bqsVar5 = new bqs(jE, jE2, cjn.i(0), jE3, jE4, jE5, jE6, jE7, cjn.l(jH, j), cjn.l(cjv.h(bnh.e(bngVarAt, 18), 0.12f), j), cjn.i(0), cjn.l(cjv.h(bnh.e(bngVarAt, 18), 0.38f), j), cjn.l(cjv.h(bnh.e(bngVarAt, 18), 0.38f), j), cjn.l(cjv.h(bnh.e(bngVarAt, 39), 0.12f), j), cjn.l(cjv.h(bnh.e(bngVarAt, 18), 0.12f), j), cjn.l(cjv.h(bnh.e(bngVarAt, 39), 0.38f), j));
                    bngVarAt.af = bqsVar5;
                    bqsVar4 = bqsVar5;
                } else {
                    i3 = i7;
                    z4 = false;
                    buxVar2 = buxVarC;
                }
                bqsVar3 = bqsVar4;
            } else {
                buxVarC.s();
                cfyVar3 = cfyVar;
                i3 = i7;
                z4 = false;
                buxVar2 = buxVarC;
                bqsVar3 = bqsVar;
            }
            buxVar2.l();
            buxVarC = buxVar2;
            buxVarC.v(1768510810);
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new asg();
                bvvVar.ad(objS);
            }
            bvvVar.Y(z4);
            int i9 = i8 << 3;
            a(awd.g(awd.u(cfy.e, cfl.e, 2), 52.0f, 32.0f), z3, z2, bqsVar3, (asf) objS, czz.ar(7, buxVarC), buxVarC, (i9 & 112) | (i3 & 896) | (i9 & 57344));
            cfyVar2 = cfyVar3;
            bqsVar2 = bqsVar3;
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
            bqsVar2 = bqsVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bqt(z, cfyVar2, z2, bqsVar2, i, 0);
        }
    }
}
