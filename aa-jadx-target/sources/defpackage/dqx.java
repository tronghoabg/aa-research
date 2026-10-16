package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class dqx {
    public defpackage.dqv a = null;
    int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    final /* synthetic */ defpackage.dqy h;
    private int i;
    private defpackage.dqu j;
    private defpackage.dqu k;
    private defpackage.dqu l;
    private defpackage.dqu m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;

    public dqx(defpackage.dqy dqyVar, int i, defpackage.dqu dquVar, defpackage.dqu dquVar2, defpackage.dqu dquVar3, defpackage.dqu dquVar4, int i2) {
        this.h = dqyVar;
        this.o = 0;
        this.q = 0;
        this.i = i;
        this.j = dquVar;
        this.k = dquVar2;
        this.l = dquVar3;
        this.m = dquVar4;
        this.n = dqyVar.aR;
        this.o = dqyVar.aN;
        this.p = dqyVar.aS;
        this.q = dqyVar.aO;
        this.r = i2;
    }

    public final int a() {
        int i = this.i;
        int i2 = this.d;
        return i == 1 ? i2 - this.h.aD : i2;
    }

    public final int b() {
        int i = this.i;
        int i2 = this.c;
        return i == 0 ? i2 - this.h.aC : i2;
    }

    public final void c(defpackage.dqv dqvVar) {
        int i = this.i;
        defpackage.dqy dqyVar = this.h;
        if (i == 0) {
            int iAe = dqyVar.ae(dqvVar, this.r);
            if (dqvVar.W() == 3) {
                this.g++;
                iAe = 0;
            }
            this.c += iAe + (dqvVar.ar != 8 ? dqyVar.aC : 0);
            int iC = dqyVar.c(dqvVar, this.r);
            if (this.a == null || this.b < iC) {
                this.a = dqvVar;
                this.b = iC;
                this.d = iC;
            }
        } else {
            int iAe2 = dqyVar.ae(dqvVar, this.r);
            int iC2 = dqyVar.c(dqvVar, this.r);
            if (dqvVar.X() == 3) {
                this.g++;
                iC2 = 0;
            }
            this.d += iC2 + (dqvVar.ar != 8 ? dqyVar.aD : 0);
            if (this.a == null || this.b < iAe2) {
                this.a = dqvVar;
                this.b = iAe2;
                this.c = iAe2;
            }
        }
        this.f++;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0174 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0176  */
    /* JADX WARN: Code duplicated, block: B:121:0x018c  */
    /* JADX WARN: Code duplicated, block: B:199:0x0307  */
    public final void d(boolean z, int i, boolean z2) {
        int i2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        defpackage.dqv dqvVar;
        boolean z4;
        int i6;
        boolean z5;
        char c;
        float f;
        float f2;
        int i7;
        int i8;
        int i9 = this.f;
        boolean z6 = false;
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = this.e + i10;
            defpackage.dqy dqyVar = this.h;
            if (i11 >= dqyVar.aK) {
                break;
            }
            defpackage.dqv dqvVar2 = dqyVar.aJ[i11];
            if (dqvVar2 != null) {
                dqvVar2.v();
            }
        }
        if (i9 == 0 || this.a == null) {
            return;
        }
        if (z2 && i == 0) {
            i2 = 0;
            z3 = true;
        } else {
            i2 = i;
            z3 = false;
        }
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < i9; i14++) {
            int i15 = this.e + (z ? (i9 - 1) - i14 : i14);
            defpackage.dqy dqyVar2 = this.h;
            if (i15 >= dqyVar2.aK) {
                break;
            }
            defpackage.dqv dqvVar3 = dqyVar2.aJ[i15];
            if (dqvVar3 != null && dqvVar3.ar == 0) {
                if (i12 == -1) {
                    i12 = i14;
                }
                i13 = i14;
            }
        }
        int i16 = this.i;
        defpackage.dqv dqvVar4 = this.a;
        if (i16 != 0) {
            boolean z7 = z3;
            defpackage.dqy dqyVar3 = this.h;
            dqvVar4.at = dqyVar3.a;
            int i17 = this.n;
            if (i2 > 0) {
                i17 += dqyVar3.aC;
            }
            if (z) {
                defpackage.dqu dquVar = dqvVar4.V;
                dquVar.l(this.l, i17, Integer.MIN_VALUE, false);
                if (z2) {
                    dqvVar4.T.l(this.j, this.p, Integer.MIN_VALUE, false);
                }
                if (i2 > 0) {
                    this.l.d.T.l(dquVar, 0, Integer.MIN_VALUE, false);
                }
                i3 = 0;
            } else {
                defpackage.dqu dquVar2 = dqvVar4.T;
                dquVar2.l(this.j, i17, Integer.MIN_VALUE, false);
                if (z2) {
                    dqvVar4.V.l(this.l, this.p, Integer.MIN_VALUE, false);
                }
                if (i2 > 0) {
                    this.j.d.V.l(dquVar2, 0, Integer.MIN_VALUE, false);
                }
                i3 = 0;
            }
            defpackage.dqv dqvVar5 = null;
            while (i3 < i9) {
                int i18 = this.e + i3;
                if (i18 >= dqyVar3.aK) {
                    return;
                }
                defpackage.dqv dqvVar6 = dqyVar3.aJ[i18];
                if (dqvVar6 == null) {
                    dqvVar6 = dqvVar5;
                } else {
                    if (i3 == 0) {
                        dqvVar6.q(dqvVar6.U, this.k, this.o);
                        int i19 = dqyVar3.b;
                        float f3 = dqyVar3.h;
                        if (this.e == 0) {
                            int i20 = dqyVar3.d;
                            i5 = -1;
                            if (i20 != -1) {
                                f3 = dqyVar3.j;
                            }
                            i19 = i20;
                            dqvVar6.au = i19;
                            dqvVar6.ap = f3;
                            i4 = 0;
                        } else {
                            i5 = -1;
                        }
                        if (z2 && (i20 = dqyVar3.f) != i5) {
                            f3 = dqyVar3.aB;
                            i19 = i20;
                        }
                        dqvVar6.au = i19;
                        dqvVar6.ap = f3;
                        i4 = 0;
                    } else {
                        i4 = i3;
                    }
                    if (i4 == i9 - 1) {
                        dqvVar6.q(dqvVar6.W, this.m, this.q);
                    }
                    if (dqvVar5 != null) {
                        int i21 = i13 + 1;
                        defpackage.dqu dquVar3 = dqvVar6.U;
                        int i22 = dqyVar3.aD;
                        defpackage.dqu dquVar4 = dqvVar5.W;
                        dquVar3.l(dquVar4, i22, Integer.MIN_VALUE, false);
                        if (i4 == i12) {
                            dquVar3.g(this.o);
                        }
                        dquVar4.l(dquVar3, 0, Integer.MIN_VALUE, false);
                        if (i4 == i21) {
                            dquVar4.g(this.q);
                        }
                    }
                    if (dqvVar6 != dqvVar4) {
                        if (z) {
                            int i23 = dqyVar3.aE;
                            if (i23 == 0) {
                                dqvVar6.V.l(dqvVar4.V, 0, Integer.MIN_VALUE, false);
                            } else if (i23 == 1) {
                                dqvVar6.T.l(dqvVar4.T, 0, Integer.MIN_VALUE, false);
                            } else if (i23 == 2) {
                                dqvVar6.T.l(dqvVar4.T, 0, Integer.MIN_VALUE, false);
                                dqvVar6.V.l(dqvVar4.V, 0, Integer.MIN_VALUE, false);
                            }
                        } else {
                            int i24 = dqyVar3.aE;
                            if (i24 == 0) {
                                dqvVar6.T.l(dqvVar4.T, 0, Integer.MIN_VALUE, false);
                            } else if (i24 == 1) {
                                dqvVar6.V.l(dqvVar4.V, 0, Integer.MIN_VALUE, false);
                            } else if (i24 == 2) {
                                if (z7) {
                                    dqvVar6.T.l(this.j, this.n, Integer.MIN_VALUE, false);
                                    dqvVar6.V.l(this.l, this.p, Integer.MIN_VALUE, false);
                                } else {
                                    dqvVar6.T.l(dqvVar4.T, 0, Integer.MIN_VALUE, false);
                                    dqvVar6.V.l(dqvVar4.V, 0, Integer.MIN_VALUE, false);
                                }
                            }
                        }
                    }
                    i3 = i4;
                }
                i3++;
                dqvVar5 = dqvVar6;
            }
            return;
        }
        defpackage.dqy dqyVar4 = this.h;
        dqvVar4.au = dqyVar4.b;
        int i25 = this.o;
        if (i2 > 0) {
            i25 += dqyVar4.aD;
        }
        defpackage.dqu dquVar5 = dqvVar4.U;
        dquVar5.l(this.k, i25, Integer.MIN_VALUE, false);
        if (z2) {
            dqvVar4.W.l(this.m, this.q, Integer.MIN_VALUE, false);
        }
        if (i2 > 0) {
            this.k.d.W.l(dquVar5, 0, Integer.MIN_VALUE, false);
        }
        if (dqyVar4.aF != 3 || dqvVar4.P) {
            dqvVar = dqvVar4;
            break;
        }
        int i26 = 0;
        while (true) {
            if (i26 < i9) {
                int i27 = this.e + (z ? (i9 - 1) - i26 : i26);
                if (i27 < dqyVar4.aK) {
                    dqvVar = dqyVar4.aJ[i27];
                    if (dqvVar.P) {
                        break;
                    } else {
                        i26++;
                    }
                }
            }
            dqvVar = dqvVar4;
            break;
        }
        int i28 = 0;
        defpackage.dqv dqvVar7 = null;
        while (i28 < i9) {
            if (z) {
                i6 = (i9 - 1) - i28;
                z4 = true;
            } else {
                z4 = z6;
                i6 = i28;
            }
            int i29 = this.e + i6;
            if (i29 >= dqyVar4.aK) {
                return;
            }
            defpackage.dqv dqvVar8 = dqyVar4.aJ[i29];
            if (dqvVar8 != null) {
                int i30 = i9 - 1;
                if (i28 == 0) {
                    dqvVar8.q(dqvVar8.T, this.j, this.n);
                    i28 = 0;
                }
                if (i6 == 0) {
                    int i31 = dqyVar4.a;
                    if (z4) {
                        f = 1.0f;
                        f2 = 1.0f - dqyVar4.g;
                    } else {
                        f = 1.0f;
                        f2 = dqyVar4.g;
                    }
                    if (this.e == 0 && (i8 = dqyVar4.c) != -1) {
                        f2 = z4 ? f - dqyVar4.i : dqyVar4.i;
                        i7 = i8;
                    } else if (!z2 || (i7 = dqyVar4.e) == -1) {
                        i7 = i31;
                    } else {
                        float f4 = dqyVar4.k;
                        f2 = z4 ? f - f4 : f4;
                    }
                    dqvVar8.at = i7;
                    dqvVar8.ao = f2;
                }
                if (i28 == i30) {
                    dqvVar8.q(dqvVar8.V, this.l, this.p);
                }
                if (dqvVar7 != null) {
                    int i32 = i13 + 1;
                    defpackage.dqu dquVar6 = dqvVar8.T;
                    int i33 = dqyVar4.aC;
                    defpackage.dqu dquVar7 = dqvVar7.V;
                    z5 = z3;
                    dquVar6.l(dquVar7, i33, Integer.MIN_VALUE, false);
                    if (i28 == i12) {
                        dquVar6.g(this.n);
                    }
                    dquVar7.l(dquVar6, 0, Integer.MIN_VALUE, false);
                    if (i28 == i32) {
                        dquVar7.g(this.p);
                    }
                } else {
                    z5 = z3;
                }
                if (dqvVar8 != dqvVar4) {
                    int i34 = dqyVar4.aF;
                    c = 3;
                    if (i34 == 3) {
                        if (dqvVar.P && dqvVar8 != dqvVar && dqvVar8.P) {
                            dqvVar8.X.l(dqvVar.X, 0, Integer.MIN_VALUE, false);
                        } else if (z5) {
                            dqvVar8.U.l(this.k, this.o, Integer.MIN_VALUE, false);
                            dqvVar8.W.l(this.m, this.q, Integer.MIN_VALUE, false);
                        } else {
                            dqvVar8.U.l(dquVar5, 0, Integer.MIN_VALUE, false);
                            dqvVar8.W.l(dqvVar4.W, 0, Integer.MIN_VALUE, false);
                        }
                    } else if (i34 == 0) {
                        dqvVar8.U.l(dquVar5, 0, Integer.MIN_VALUE, false);
                    } else if (i34 == 1) {
                        dqvVar8.W.l(dqvVar4.W, 0, Integer.MIN_VALUE, false);
                    } else if (z5) {
                        dqvVar8.U.l(this.k, this.o, Integer.MIN_VALUE, false);
                        dqvVar8.W.l(this.m, this.q, Integer.MIN_VALUE, false);
                    } else {
                        dqvVar8.U.l(dquVar5, 0, Integer.MIN_VALUE, false);
                        dqvVar8.W.l(dqvVar4.W, 0, Integer.MIN_VALUE, false);
                    }
                } else {
                    c = 3;
                }
                dqvVar7 = dqvVar8;
            } else {
                z5 = z3;
                c = 3;
            }
            i28++;
            z3 = z5;
            z6 = false;
        }
    }

    public final void e(int i) {
        int i2 = this.g;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f;
        int i4 = i / i2;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = this.e + i5;
            defpackage.dqy dqyVar = this.h;
            if (i6 >= dqyVar.aK) {
                break;
            }
            defpackage.dqv dqvVar = dqyVar.aJ[i6];
            if (this.i == 0) {
                if (dqvVar != null && dqvVar.W() == 3 && dqvVar.C == 0) {
                    dqyVar.ak(dqvVar, 1, i4, dqvVar.X(), dqvVar.h());
                }
            } else if (dqvVar != null && dqvVar.X() == 3 && dqvVar.D == 0) {
                int i7 = i4;
                dqyVar.ak(dqvVar, dqvVar.W(), dqvVar.j(), 1, i7);
                i4 = i7;
            }
        }
        this.c = 0;
        this.d = 0;
        this.a = null;
        this.b = 0;
        int i8 = this.f;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.e + i9;
            defpackage.dqy dqyVar2 = this.h;
            if (i10 >= dqyVar2.aK) {
                return;
            }
            defpackage.dqv dqvVar2 = dqyVar2.aJ[i10];
            if (this.i == 0) {
                int iJ = dqvVar2.j();
                int i11 = dqyVar2.aC;
                if (dqvVar2.ar == 8) {
                    i11 = 0;
                }
                this.c += iJ + i11;
                int iC = dqyVar2.c(dqvVar2, this.r);
                if (this.a == null || this.b < iC) {
                    this.a = dqvVar2;
                    this.b = iC;
                    this.d = iC;
                }
            } else {
                int iAe = dqyVar2.ae(dqvVar2, this.r);
                int iC2 = dqyVar2.c(dqvVar2, this.r);
                int i12 = dqyVar2.aD;
                if (dqvVar2.ar == 8) {
                    i12 = 0;
                }
                this.d += iC2 + i12;
                if (this.a == null || this.b < iAe) {
                    this.a = dqvVar2;
                    this.b = iAe;
                    this.c = iAe;
                }
            }
        }
    }

    public final void f(int i, defpackage.dqu dquVar, defpackage.dqu dquVar2, defpackage.dqu dquVar3, defpackage.dqu dquVar4, int i2, int i3, int i4, int i5, int i6) {
        this.i = i;
        this.j = dquVar;
        this.k = dquVar2;
        this.l = dquVar3;
        this.m = dquVar4;
        this.n = i2;
        this.o = i3;
        this.p = i4;
        this.q = i5;
        this.r = i6;
    }
}
