package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dqs extends defpackage.dra {
    public int a = 0;
    public boolean b = true;
    public int c = 0;
    boolean d = false;

    /* JADX WARN: Code duplicated, block: B:75:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4 A[DONT_INVERT, PHI: r14
  0x00e4: PHI (r14v8 boolean) = (r14v2 boolean), (r14v9 boolean) binds: [B:74:0x00df, B:76:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    @Override // defpackage.dqv
    public final void a(defpackage.dpg dpgVar, boolean z) {
        boolean z2;
        int i;
        int i2;
        int i3;
        defpackage.dqu dquVar = this.T;
        defpackage.dqu[] dquVarArr = this.ab;
        dquVarArr[0] = dquVar;
        defpackage.dqu dquVar2 = this.U;
        int i4 = 2;
        dquVarArr[2] = dquVar2;
        defpackage.dqu dquVar3 = this.V;
        dquVarArr[1] = dquVar3;
        defpackage.dqu dquVar4 = this.W;
        dquVarArr[3] = dquVar4;
        int i5 = 0;
        while (true) {
            int length = dquVarArr.length;
            if (i5 >= 6) {
                break;
            }
            defpackage.dqu dquVar5 = dquVarArr[i5];
            dquVar5.h = dpgVar.b(dquVar5);
            i5++;
        }
        int i6 = this.a;
        if (i6 < 0 || i6 >= 4) {
            return;
        }
        defpackage.dqu dquVar6 = dquVarArr[i6];
        if (!this.d) {
            c();
        }
        if (this.d) {
            this.d = false;
            int i7 = this.a;
            if (i7 == 0 || i7 == 1) {
                dpgVar.f(dquVar.h, this.aj);
                dpgVar.f(dquVar3.h, this.aj);
                return;
            } else {
                if (i7 == 2 || i7 == 3) {
                    dpgVar.f(dquVar2.h, this.ak);
                    dpgVar.f(dquVar4.h, this.ak);
                    return;
                }
                return;
            }
        }
        int i8 = 0;
        while (true) {
            if (i8 >= this.aM) {
                z2 = false;
                break;
            }
            defpackage.dqv dqvVar = this.aL[i8];
            if ((this.b || dqvVar.ay()) && ((((i2 = this.a) == 0 || i2 == 1) && dqvVar.W() == 3 && dqvVar.T.e != null && dqvVar.V.e != null) || (((i3 = this.a) == 2 || i3 == 3) && dqvVar.X() == 3 && dqvVar.U.e != null && dqvVar.W.e != null))) {
                z2 = true;
                break;
            }
            i8++;
        }
        boolean z3 = dquVar.h() || dquVar3.h();
        boolean z4 = dquVar2.h() || dquVar4.h();
        if (z2) {
            i = 4;
        } else {
            int i9 = this.a;
            i = 5;
            if (i9 != 0) {
                if (i9 != 2) {
                    if ((i9 == 1 || !z3) && (i9 != 3 || !z4)) {
                        i = 4;
                    }
                } else if (!z4) {
                    z4 = false;
                    if (i9 == 1) {
                        i = 4;
                    } else {
                        i = 4;
                    }
                }
            } else if (!z3) {
                i9 = 0;
                z3 = false;
                if (i9 != 2) {
                    if (i9 == 1) {
                        i = 4;
                    } else {
                        i = 4;
                    }
                } else if (!z4) {
                    z4 = false;
                    if (i9 == 1) {
                        i = 4;
                    } else {
                        i = 4;
                    }
                }
            }
        }
        int i10 = 0;
        while (i10 < this.aM) {
            defpackage.dqv dqvVar2 = this.aL[i10];
            if (this.b || dqvVar2.ay()) {
                defpackage.dqu[] dquVarArr2 = dqvVar2.ab;
                defpackage.dpj dpjVarB = dpgVar.b(dquVarArr2[this.a]);
                int i11 = this.a;
                defpackage.dqu dquVar7 = dquVarArr2[i11];
                dquVar7.h = dpjVarB;
                defpackage.dqu dquVar8 = dquVar7.e;
                int i12 = (dquVar8 == null || dquVar8.d != this) ? 0 : dquVar7.f;
                if (i11 == 0 || i11 == i4) {
                    defpackage.dpj dpjVar = dquVar6.h;
                    int i13 = this.c - i12;
                    defpackage.dpf dpfVarA = dpgVar.a();
                    defpackage.dpj dpjVarC = dpgVar.c();
                    dpjVarC.e = 0;
                    dpfVarA.i(dpjVar, dpjVarB, dpjVarC, i13);
                    dpgVar.e(dpfVarA);
                } else {
                    defpackage.dpj dpjVar2 = dquVar6.h;
                    int i14 = this.c + i12;
                    defpackage.dpf dpfVarA2 = dpgVar.a();
                    defpackage.dpj dpjVarC2 = dpgVar.c();
                    dpjVarC2.e = 0;
                    dpfVarA2.h(dpjVar2, dpjVarB, dpjVarC2, i14);
                    dpgVar.e(dpfVarA2);
                }
                dpgVar.m(dquVar6.h, dpjVarB, this.c + i12, i);
            }
            i10++;
            i4 = 2;
        }
        int i15 = this.a;
        if (i15 == 0) {
            dpgVar.m(dquVar3.h, dquVar.h, 0, 8);
            dpgVar.m(dquVar.h, this.ae.V.h, 0, 4);
            dpgVar.m(dquVar.h, this.ae.T.h, 0, 0);
            return;
        }
        if (i15 == 1) {
            dpgVar.m(dquVar.h, dquVar3.h, 0, 8);
            dpgVar.m(dquVar.h, this.ae.T.h, 0, 4);
            dpgVar.m(dquVar.h, this.ae.V.h, 0, 0);
        } else if (i15 == 2) {
            dpgVar.m(dquVar4.h, dquVar2.h, 0, 8);
            dpgVar.m(dquVar2.h, this.ae.W.h, 0, 4);
            dpgVar.m(dquVar2.h, this.ae.U.h, 0, 0);
        } else if (i15 == 3) {
            dpgVar.m(dquVar2.h, dquVar4.h, 0, 8);
            dpgVar.m(dquVar2.h, this.ae.U.h, 0, 4);
            dpgVar.m(dquVar2.h, this.ae.W.h, 0, 0);
        }
    }

    @Override // defpackage.dqv
    public final boolean ay() {
        return true;
    }

    public final int b() {
        int i = this.a;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    public final boolean c() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.aM;
            if (i4 >= i) {
                break;
            }
            defpackage.dqv dqvVar = this.aL[i4];
            if ((this.b || dqvVar.ay()) && ((((i2 = this.a) == 0 || i2 == 1) && !dqvVar.e()) || (((i3 = this.a) == 2 || i3 == 3) && !dqvVar.f()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.aM; i5++) {
            defpackage.dqv dqvVar2 = this.aL[i5];
            if (this.b || dqvVar2.ay()) {
                if (!z2) {
                    int i6 = this.a;
                    if (i6 == 0) {
                        iMax = dqvVar2.U(2).a();
                    } else if (i6 == 1) {
                        iMax = dqvVar2.U(4).a();
                    } else if (i6 == 2) {
                        iMax = dqvVar2.U(3).a();
                    } else if (i6 == 3) {
                        iMax = dqvVar2.U(5).a();
                    }
                }
                int i7 = this.a;
                if (i7 == 0) {
                    iMax = java.lang.Math.min(iMax, dqvVar2.U(2).a());
                } else if (i7 == 1) {
                    iMax = java.lang.Math.max(iMax, dqvVar2.U(4).a());
                } else if (i7 == 2) {
                    iMax = java.lang.Math.min(iMax, dqvVar2.U(3).a());
                } else if (i7 == 3) {
                    iMax = java.lang.Math.max(iMax, dqvVar2.U(5).a());
                }
                z2 = true;
            }
        }
        int i8 = iMax + this.c;
        int i9 = this.a;
        if (i9 == 0 || i9 == 1) {
            z(i8, i8);
        } else {
            A(i8, i8);
        }
        this.d = true;
        return true;
    }

    @Override // defpackage.dqv
    public final boolean e() {
        return this.d;
    }

    @Override // defpackage.dqv
    public final boolean f() {
        return this.d;
    }

    @Override // defpackage.dqv
    public final java.lang.String toString() {
        java.lang.String strConcat = "[Barrier] " + this.as + " {";
        for (int i = 0; i < this.aM; i++) {
            defpackage.dqv dqvVar = this.aL[i];
            if (i > 0) {
                strConcat = strConcat.concat(", ");
            }
            strConcat = strConcat.concat(java.lang.String.valueOf(dqvVar.as));
        }
        return strConcat.concat("}");
    }
}
