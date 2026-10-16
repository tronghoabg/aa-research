package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dro extends defpackage.drr {
    private static final int[] a = new int[2];

    public dro(defpackage.dqv dqvVar) {
        super(dqvVar);
        this.h.l = 4;
        this.i.l = 5;
        this.f = 0;
    }

    private static final void n(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i4 - i3;
        int i7 = i2 - i;
        if (i5 != -1) {
            if (i5 != 0) {
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f) + 0.5f);
                return;
            } else {
                iArr[0] = (int) ((i6 * f) + 0.5f);
                iArr[1] = i6;
                return;
            }
        }
        float f2 = (i7 / f) + 0.5f;
        int i8 = (int) ((i6 * f) + 0.5f);
        if (i8 <= i7) {
            iArr[0] = i8;
            iArr[1] = i6;
            return;
        }
        int i9 = (int) f2;
        if (i9 <= i6) {
            iArr[0] = i7;
            iArr[1] = i9;
        }
    }

    @Override // defpackage.drr
    public final void b() {
        defpackage.dqv dqvVar;
        defpackage.dqv dqvVar2;
        defpackage.dqv dqvVar3;
        defpackage.dqv dqvVar4 = this.d;
        if (dqvVar4.l) {
            this.e.c(dqvVar4.j());
        }
        defpackage.drk drkVar = this.e;
        if (!drkVar.i) {
            int iW = this.d.W();
            this.j = iW;
            if (iW != 3) {
                if (this.j == 4 && (dqvVar3 = this.d.ae) != null && (dqvVar3.W() == 1 || dqvVar3.W() == 4)) {
                    int iJ = (dqvVar3.j() - this.d.T.b()) - this.d.V.b();
                    j(this.h, dqvVar3.o.h, this.d.T.b());
                    j(this.i, dqvVar3.o.i, -this.d.V.b());
                    drkVar.c(iJ);
                    return;
                }
                if (this.j == 1) {
                    drkVar.c(this.d.j());
                }
            }
        } else if (this.j == 4 && (dqvVar = this.d.ae) != null && (dqvVar.W() == 1 || dqvVar.W() == 4)) {
            j(this.h, dqvVar.o.h, this.d.T.b());
            j(this.i, dqvVar.o.i, -this.d.V.b());
            return;
        }
        if (drkVar.i) {
            defpackage.dqv dqvVar5 = this.d;
            if (dqvVar5.l) {
                defpackage.dqu[] dquVarArr = dqvVar5.ab;
                defpackage.dqu dquVar = dquVarArr[0];
                defpackage.dqu dquVar2 = dquVar.e;
                if (dquVar2 != null && dquVarArr[1].e != null) {
                    if (dqvVar5.R()) {
                        this.h.e = this.d.ab[0].b();
                        this.i.e = -this.d.ab[1].b();
                        return;
                    }
                    defpackage.drj drjVarK = k(this.d.ab[0]);
                    if (drjVarK != null) {
                        j(this.h, drjVarK, this.d.ab[0].b());
                    }
                    defpackage.drj drjVarK2 = k(this.d.ab[1]);
                    if (drjVarK2 != null) {
                        j(this.i, drjVarK2, -this.d.ab[1].b());
                    }
                    this.h.b = true;
                    this.i.b = true;
                    return;
                }
                if (dquVar2 != null) {
                    defpackage.drj drjVarK3 = k(dquVar);
                    if (drjVarK3 != null) {
                        defpackage.drj drjVar = this.h;
                        j(drjVar, drjVarK3, this.d.ab[0].b());
                        j(this.i, drjVar, drkVar.f);
                        return;
                    }
                    return;
                }
                defpackage.dqu dquVar3 = dquVarArr[1];
                if (dquVar3.e != null) {
                    defpackage.drj drjVarK4 = k(dquVar3);
                    if (drjVarK4 != null) {
                        defpackage.drj drjVar2 = this.i;
                        j(drjVar2, drjVarK4, -this.d.ab[1].b());
                        j(this.h, drjVar2, -drkVar.f);
                        return;
                    }
                    return;
                }
                if ((dqvVar5 instanceof defpackage.dra) || dqvVar5.ae == null || dqvVar5.U(7).e != null) {
                    return;
                }
                defpackage.dqv dqvVar6 = this.d;
                defpackage.drj drjVar3 = dqvVar6.ae.o.h;
                defpackage.drj drjVar4 = this.h;
                j(drjVar4, drjVar3, dqvVar6.k());
                j(this.i, drjVar4, drkVar.f);
                return;
            }
        }
        if (this.j == 3) {
            defpackage.dqv dqvVar7 = this.d;
            int i = dqvVar7.C;
            if (i == 2) {
                defpackage.dqv dqvVar8 = dqvVar7.ae;
                if (dqvVar8 != null) {
                    defpackage.drk drkVar2 = dqvVar8.p.e;
                    drkVar.k.add(drkVar2);
                    drkVar2.j.add(drkVar);
                    drkVar.b = true;
                    defpackage.drj drjVar5 = this.h;
                    java.util.List list = drkVar.j;
                    list.add(drjVar5);
                    list.add(this.i);
                }
            } else if (i == 3) {
                if (dqvVar7.D == 3) {
                    this.h.a = this;
                    this.i.a = this;
                    defpackage.drp drpVar = dqvVar7.p;
                    drpVar.h.a = this;
                    drpVar.i.a = this;
                    drkVar.a = this;
                    if (dqvVar7.S()) {
                        java.util.List list2 = drkVar.k;
                        list2.add(this.d.p.e);
                        this.d.p.e.j.add(drkVar);
                        defpackage.drp drpVar2 = this.d.p;
                        drpVar2.e.a = this;
                        list2.add(drpVar2.h);
                        list2.add(this.d.p.i);
                        this.d.p.h.j.add(drkVar);
                        this.d.p.i.j.add(drkVar);
                    } else if (this.d.R()) {
                        this.d.p.e.k.add(drkVar);
                        drkVar.j.add(this.d.p.e);
                    } else {
                        this.d.p.e.k.add(drkVar);
                    }
                } else {
                    defpackage.drk drkVar3 = dqvVar7.p.e;
                    drkVar.k.add(drkVar3);
                    drkVar3.j.add(drkVar);
                    this.d.p.h.j.add(drkVar);
                    this.d.p.i.j.add(drkVar);
                    drkVar.b = true;
                    defpackage.drj drjVar6 = this.h;
                    java.util.List list3 = drkVar.j;
                    list3.add(drjVar6);
                    defpackage.drj drjVar7 = this.i;
                    list3.add(drjVar7);
                    drjVar6.k.add(drkVar);
                    drjVar7.k.add(drkVar);
                }
            }
        }
        defpackage.dqv dqvVar9 = this.d;
        defpackage.dqu[] dquVarArr2 = dqvVar9.ab;
        defpackage.dqu dquVar4 = dquVarArr2[0];
        defpackage.dqu dquVar5 = dquVar4.e;
        if (dquVar5 != null && dquVarArr2[1].e != null) {
            if (dqvVar9.R()) {
                this.h.e = this.d.ab[0].b();
                this.i.e = -this.d.ab[1].b();
                return;
            }
            defpackage.drj drjVarK5 = k(this.d.ab[0]);
            defpackage.drj drjVarK6 = k(this.d.ab[1]);
            if (drjVarK5 != null) {
                drjVarK5.a(this);
            }
            if (drjVarK6 != null) {
                drjVarK6.a(this);
            }
            this.k = 4;
            return;
        }
        if (dquVar5 != null) {
            defpackage.drj drjVarK7 = k(dquVar4);
            if (drjVarK7 != null) {
                defpackage.drj drjVar8 = this.h;
                j(drjVar8, drjVarK7, this.d.ab[0].b());
                i(this.i, drjVar8, 1, drkVar);
                return;
            }
            return;
        }
        defpackage.dqu dquVar6 = dquVarArr2[1];
        if (dquVar6.e != null) {
            defpackage.drj drjVarK8 = k(dquVar6);
            if (drjVarK8 != null) {
                defpackage.drj drjVar9 = this.i;
                j(drjVar9, drjVarK8, -this.d.ab[1].b());
                i(this.h, drjVar9, -1, drkVar);
                return;
            }
            return;
        }
        if ((dqvVar9 instanceof defpackage.dra) || (dqvVar2 = dqvVar9.ae) == null) {
            return;
        }
        defpackage.drj drjVar10 = dqvVar2.o.h;
        defpackage.drj drjVar11 = this.h;
        j(drjVar11, drjVar10, dqvVar9.k());
        i(this.i, drjVar11, 1, drkVar);
    }

    @Override // defpackage.drr
    public final void c() {
        defpackage.drj drjVar = this.h;
        if (drjVar.i) {
            this.d.aj = drjVar.f;
        }
    }

    @Override // defpackage.drr
    public final void d() {
        this.l = null;
        this.h.b();
        this.i.b();
        this.e.b();
        this.g = false;
    }

    @Override // defpackage.drr
    public final boolean e() {
        return this.j != 3 || this.d.C == 0;
    }

    @Override // defpackage.drr, defpackage.drh
    public final void f() {
        float f;
        int i = this.k;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 3) {
            defpackage.dqv dqvVar = this.d;
            m(dqvVar.T, dqvVar.V, 0);
            return;
        }
        defpackage.drk drkVar = this.e;
        if (!drkVar.i && this.j == 3) {
            defpackage.dqv dqvVar2 = this.d;
            int i3 = dqvVar2.C;
            if (i3 == 2) {
                defpackage.dqv dqvVar3 = dqvVar2.ae;
                if (dqvVar3 != null) {
                    defpackage.drk drkVar2 = dqvVar3.o.e;
                    if (drkVar2.i) {
                        drkVar.c((int) ((drkVar2.f * dqvVar2.H) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = dqvVar2.D;
                if (i4 == 0 || i4 == 3) {
                    defpackage.drp drpVar = dqvVar2.p;
                    defpackage.drj drjVar = drpVar.h;
                    defpackage.drj drjVar2 = drpVar.i;
                    boolean z = dqvVar2.T.e != null;
                    boolean z2 = dqvVar2.U.e != null;
                    boolean z3 = dqvVar2.V.e != null;
                    boolean z4 = dqvVar2.W.e != null;
                    int i5 = dqvVar2.ai;
                    if (z && z2 && z3 && z4) {
                        float f2 = dqvVar2.ah;
                        if (drjVar.i && drjVar2.i) {
                            defpackage.drj drjVar3 = this.h;
                            if (drjVar3.c) {
                                defpackage.drj drjVar4 = this.i;
                                if (drjVar4.c) {
                                    int i6 = ((defpackage.drj) drjVar3.k.get(0)).f + drjVar3.e;
                                    int i7 = ((defpackage.drj) drjVar4.k.get(0)).f - drjVar4.e;
                                    int i8 = drjVar.f + drjVar.e;
                                    int i9 = drjVar2.f - drjVar2.e;
                                    int[] iArr = a;
                                    n(iArr, i6, i7, i8, i9, f2, i5);
                                    drkVar.c(iArr[0]);
                                    this.d.p.e.c(iArr[1]);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        defpackage.drj drjVar5 = this.h;
                        if (drjVar5.i) {
                            defpackage.drj drjVar6 = this.i;
                            if (drjVar6.i) {
                                if (!drjVar.c || !drjVar2.c) {
                                    return;
                                }
                                int i10 = drjVar5.f + drjVar5.e;
                                int i11 = drjVar6.f - drjVar6.e;
                                int i12 = ((defpackage.drj) drjVar.k.get(0)).f + drjVar.e;
                                int i13 = ((defpackage.drj) drjVar2.k.get(0)).f - drjVar2.e;
                                int[] iArr2 = a;
                                n(iArr2, i10, i11, i12, i13, f2, i5);
                                drkVar.c(iArr2[0]);
                                this.d.p.e.c(iArr2[1]);
                            }
                        }
                        if (!drjVar5.c) {
                            return;
                        }
                        defpackage.drj drjVar7 = this.i;
                        if (!drjVar7.c || !drjVar.c || !drjVar2.c) {
                            return;
                        }
                        int i14 = ((defpackage.drj) drjVar5.k.get(0)).f + drjVar5.e;
                        int i15 = ((defpackage.drj) drjVar7.k.get(0)).f - drjVar7.e;
                        int i16 = ((defpackage.drj) drjVar.k.get(0)).f + drjVar.e;
                        int i17 = ((defpackage.drj) drjVar2.k.get(0)).f - drjVar2.e;
                        int[] iArr3 = a;
                        n(iArr3, i14, i15, i16, i17, f2, i5);
                        drkVar.c(iArr3[0]);
                        this.d.p.e.c(iArr3[1]);
                    } else if (z && z3) {
                        defpackage.drj drjVar8 = this.h;
                        if (!drjVar8.c) {
                            return;
                        }
                        defpackage.drj drjVar9 = this.i;
                        if (!drjVar9.c) {
                            return;
                        }
                        float f3 = dqvVar2.ah;
                        int i18 = (((defpackage.drj) drjVar9.k.get(0)).f - drjVar9.e) - (((defpackage.drj) drjVar8.k.get(0)).f + drjVar8.e);
                        if (i5 == -1 || i5 == 0) {
                            int iH = h(i18, 0);
                            int i19 = (int) ((iH * f3) + 0.5f);
                            int iH2 = h(i19, 1);
                            if (i19 != iH2) {
                                iH = (int) ((iH2 / f3) + 0.5f);
                            }
                            drkVar.c(iH);
                            this.d.p.e.c(iH2);
                        } else {
                            int iH3 = h(i18, 0);
                            int i20 = (int) ((iH3 / f3) + 0.5f);
                            int iH4 = h(i20, 1);
                            if (i20 != iH4) {
                                iH3 = (int) ((iH4 * f3) + 0.5f);
                            }
                            drkVar.c(iH3);
                            this.d.p.e.c(iH4);
                        }
                    } else if (z2 && z4) {
                        if (!drjVar.c || !drjVar2.c) {
                            return;
                        }
                        float f4 = dqvVar2.ah;
                        int i21 = (((defpackage.drj) drjVar2.k.get(0)).f - drjVar2.e) - (((defpackage.drj) drjVar.k.get(0)).f + drjVar.e);
                        if (i5 != 0) {
                            int iH5 = h(i21, 1);
                            int i22 = (int) ((iH5 / f4) + 0.5f);
                            int iH6 = h(i22, 0);
                            if (i22 != iH6) {
                                iH5 = (int) ((iH6 * f4) + 0.5f);
                            }
                            drkVar.c(iH6);
                            this.d.p.e.c(iH5);
                        } else {
                            int iH7 = h(i21, 1);
                            int i23 = (int) ((iH7 * f4) + 0.5f);
                            int iH8 = h(i23, 0);
                            if (i23 != iH8) {
                                iH7 = (int) ((iH8 / f4) + 0.5f);
                            }
                            drkVar.c(iH8);
                            this.d.p.e.c(iH7);
                        }
                    }
                } else {
                    int i24 = dqvVar2.ai;
                    if (i24 == -1 || i24 != 0) {
                        float f5 = dqvVar2.p.e.f;
                        float f6 = dqvVar2.ah;
                        f = f5 * f6;
                    } else {
                        f = dqvVar2.p.e.f / dqvVar2.ah;
                    }
                    drkVar.c((int) (f + 0.5f));
                }
            }
        }
        defpackage.drj drjVar10 = this.h;
        if (drjVar10.c) {
            defpackage.drj drjVar11 = this.i;
            if (drjVar11.c) {
                if (drjVar10.i && drjVar11.i && drkVar.i) {
                    return;
                }
                if (!drkVar.i && this.j == 3) {
                    defpackage.dqv dqvVar4 = this.d;
                    if (dqvVar4.C == 0 && !dqvVar4.R()) {
                        defpackage.drj drjVar12 = (defpackage.drj) drjVar10.k.get(0);
                        defpackage.drj drjVar13 = (defpackage.drj) drjVar11.k.get(0);
                        int i25 = drjVar12.f + drjVar10.e;
                        int i26 = drjVar13.f + drjVar11.e;
                        drjVar10.c(i25);
                        drjVar11.c(i26);
                        drkVar.c(i26 - i25);
                        return;
                    }
                }
                if (!drkVar.i && this.j == 3 && this.c == 1) {
                    java.util.List list = drjVar10.k;
                    if (list.size() > 0) {
                        java.util.List list2 = drjVar11.k;
                        if (list2.size() > 0) {
                            defpackage.drj drjVar14 = (defpackage.drj) list.get(0);
                            int iMin = java.lang.Math.min((((defpackage.drj) list2.get(0)).f + drjVar11.e) - (drjVar14.f + drjVar10.e), drkVar.m);
                            defpackage.dqv dqvVar5 = this.d;
                            int i27 = dqvVar5.G;
                            int iMax = java.lang.Math.max(dqvVar5.F, iMin);
                            if (i27 > 0) {
                                iMax = java.lang.Math.min(i27, iMax);
                            }
                            drkVar.c(iMax);
                        }
                    }
                }
                if (drkVar.i) {
                    defpackage.drj drjVar15 = (defpackage.drj) drjVar10.k.get(0);
                    defpackage.drj drjVar16 = (defpackage.drj) drjVar11.k.get(0);
                    int i28 = drjVar15.f;
                    int i29 = drjVar10.e + i28;
                    int i30 = drjVar16.f;
                    int i31 = drjVar11.e + i30;
                    float f7 = this.d.ao;
                    if (drjVar15 == drjVar16) {
                        f7 = 0.5f;
                    }
                    if (drjVar15 != drjVar16) {
                        i30 = i31;
                    }
                    if (drjVar15 != drjVar16) {
                        i28 = i29;
                    }
                    drjVar10.c((int) (i28 + 0.5f + (((i30 - i28) - drkVar.f) * f7)));
                    drjVar11.c(drjVar10.f + drkVar.f);
                }
            }
        }
    }

    public final void g() {
        this.g = false;
        defpackage.drj drjVar = this.h;
        drjVar.b();
        drjVar.i = false;
        defpackage.drj drjVar2 = this.i;
        drjVar2.b();
        drjVar2.i = false;
        this.e.i = false;
    }

    public final java.lang.String toString() {
        return "HorizontalRun ".concat(java.lang.String.valueOf(this.d.as));
    }
}
