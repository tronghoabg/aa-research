package Q0;

/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: s0, reason: collision with root package name */
    public int f9487s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f9488t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f9489u0;
    public boolean v0;

    @Override // Q0.d
    public final boolean A() {
        return this.v0;
    }

    @Override // Q0.d
    public final boolean B() {
        return this.v0;
    }

    public final boolean T() {
        int i5;
        int i10;
        int i11;
        boolean z2 = true;
        int i12 = 0;
        while (true) {
            i5 = this.f9657r0;
            if (i12 >= i5) {
                break;
            }
            d dVar = this.f9656q0[i12];
            if ((this.f9488t0 || dVar.c()) && ((((i10 = this.f9487s0) == 0 || i10 == 1) && !dVar.A()) || (((i11 = this.f9487s0) == 2 || i11 == 3) && !dVar.B()))) {
                z2 = false;
            }
            i12++;
        }
        if (!z2 || i5 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z10 = false;
        for (int i13 = 0; i13 < this.f9657r0; i13++) {
            d dVar2 = this.f9656q0[i13];
            if (this.f9488t0 || dVar2.c()) {
                if (!z10) {
                    int i14 = this.f9487s0;
                    if (i14 == 0) {
                        iMax = dVar2.i(2).d();
                    } else if (i14 == 1) {
                        iMax = dVar2.i(4).d();
                    } else if (i14 == 2) {
                        iMax = dVar2.i(3).d();
                    } else if (i14 == 3) {
                        iMax = dVar2.i(5).d();
                    }
                    z10 = true;
                }
                int i15 = this.f9487s0;
                if (i15 == 0) {
                    iMax = Math.min(iMax, dVar2.i(2).d());
                } else if (i15 == 1) {
                    iMax = Math.max(iMax, dVar2.i(4).d());
                } else if (i15 == 2) {
                    iMax = Math.min(iMax, dVar2.i(3).d());
                } else if (i15 == 3) {
                    iMax = Math.max(iMax, dVar2.i(5).d());
                }
            }
        }
        int i16 = iMax + this.f9489u0;
        int i17 = this.f9487s0;
        if (i17 == 0 || i17 == 1) {
            J(i16, i16);
        } else {
            K(i16, i16);
        }
        this.v0 = true;
        return true;
    }

    public final int U() {
        int i5 = this.f9487s0;
        if (i5 == 0 || i5 == 1) {
            return 0;
        }
        return (i5 == 2 || i5 == 3) ? 1 : -1;
    }

    @Override // Q0.d
    public final void b(O0.c cVar, boolean z2) {
        boolean z10;
        int i5;
        int i10;
        c[] cVarArr = this.f9530Q;
        c cVar2 = this.f9523I;
        cVarArr[0] = cVar2;
        c cVar3 = this.f9524J;
        int i11 = 2;
        cVarArr[2] = cVar3;
        c cVar4 = this.f9525K;
        cVarArr[1] = cVar4;
        c cVar5 = this.L;
        cVarArr[3] = cVar5;
        for (c cVar6 : cVarArr) {
            cVar6.f9514i = cVar.k(cVar6);
        }
        int i12 = this.f9487s0;
        if (i12 < 0 || i12 >= 4) {
            return;
        }
        c cVar7 = cVarArr[i12];
        if (!this.v0) {
            T();
        }
        if (this.v0) {
            this.v0 = false;
            int i13 = this.f9487s0;
            if (i13 == 0 || i13 == 1) {
                cVar.d(cVar2.f9514i, this.f9538Y);
                cVar.d(cVar4.f9514i, this.f9538Y);
                return;
            } else {
                if (i13 == 2 || i13 == 3) {
                    cVar.d(cVar3.f9514i, this.f9539Z);
                    cVar.d(cVar5.f9514i, this.f9539Z);
                    return;
                }
                return;
            }
        }
        for (int i14 = 0; i14 < this.f9657r0; i14++) {
            d dVar = this.f9656q0[i14];
            if ((this.f9488t0 || dVar.c()) && ((((i10 = this.f9487s0) == 0 || i10 == 1) && dVar.f9570p0[0] == 3 && dVar.f9523I.f9511f != null && dVar.f9525K.f9511f != null) || ((i10 == 2 || i10 == 3) && dVar.f9570p0[1] == 3 && dVar.f9524J.f9511f != null && dVar.L.f9511f != null))) {
                z10 = true;
                break;
            }
        }
        z10 = false;
        boolean z11 = cVar2.g() || cVar4.g();
        boolean z12 = cVar3.g() || cVar5.g();
        int i15 = (z10 || !(((i5 = this.f9487s0) == 0 && z11) || ((i5 == 2 && z12) || ((i5 == 1 && z11) || (i5 == 3 && z12))))) ? 4 : 5;
        int i16 = 0;
        while (i16 < this.f9657r0) {
            d dVar2 = this.f9656q0[i16];
            if (this.f9488t0 || dVar2.c()) {
                O0.f fVarK = cVar.k(dVar2.f9530Q[this.f9487s0]);
                int i17 = this.f9487s0;
                c cVar8 = dVar2.f9530Q[i17];
                cVar8.f9514i = fVarK;
                c cVar9 = cVar8.f9511f;
                int i18 = (cVar9 == null || cVar9.f9509d != this) ? 0 : cVar8.f9512g;
                if (i17 == 0 || i17 == i11) {
                    O0.f fVar = cVar7.f9514i;
                    int i19 = this.f9489u0 - i18;
                    O0.b bVarL = cVar.l();
                    O0.f fVarM = cVar.m();
                    fVarM.f8789d = 0;
                    bVarL.c(fVar, fVarK, fVarM, i19);
                    cVar.c(bVarL);
                } else {
                    O0.f fVar2 = cVar7.f9514i;
                    int i20 = this.f9489u0 + i18;
                    O0.b bVarL2 = cVar.l();
                    O0.f fVarM2 = cVar.m();
                    fVarM2.f8789d = 0;
                    bVarL2.b(fVar2, fVarK, fVarM2, i20);
                    cVar.c(bVarL2);
                }
                cVar.e(cVar7.f9514i, fVarK, this.f9489u0 + i18, i15);
            }
            i16++;
            i11 = 2;
        }
        int i21 = this.f9487s0;
        if (i21 == 0) {
            cVar.e(cVar4.f9514i, cVar2.f9514i, 0, 8);
            cVar.e(cVar2.f9514i, this.f9533T.f9525K.f9514i, 0, 4);
            cVar.e(cVar2.f9514i, this.f9533T.f9523I.f9514i, 0, 0);
            return;
        }
        if (i21 == 1) {
            cVar.e(cVar2.f9514i, cVar4.f9514i, 0, 8);
            cVar.e(cVar2.f9514i, this.f9533T.f9523I.f9514i, 0, 4);
            cVar.e(cVar2.f9514i, this.f9533T.f9525K.f9514i, 0, 0);
        } else if (i21 == 2) {
            cVar.e(cVar5.f9514i, cVar3.f9514i, 0, 8);
            cVar.e(cVar3.f9514i, this.f9533T.L.f9514i, 0, 4);
            cVar.e(cVar3.f9514i, this.f9533T.f9524J.f9514i, 0, 0);
        } else if (i21 == 3) {
            cVar.e(cVar3.f9514i, cVar5.f9514i, 0, 8);
            cVar.e(cVar3.f9514i, this.f9533T.f9524J.f9514i, 0, 4);
            cVar.e(cVar3.f9514i, this.f9533T.L.f9514i, 0, 0);
        }
    }

    @Override // Q0.d
    public final boolean c() {
        return true;
    }

    @Override // Q0.d
    public final String toString() {
        String strC = wg.b.c(new StringBuilder("[Barrier] "), this.f9555h0, " {");
        for (int i5 = 0; i5 < this.f9657r0; i5++) {
            d dVar = this.f9656q0[i5];
            if (i5 > 0) {
                strC = N0.a.f(strC, ", ");
            }
            StringBuilder sbJ = N0.a.j(strC);
            sbJ.append(dVar.f9555h0);
            strC = sbJ.toString();
        }
        return N0.a.f(strC, "}");
    }
}
