package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class drg extends drj {
    private static final int[] a = new int[2];

    public drg(dqn dqnVar) {
        super(dqnVar);
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

    @Override // defpackage.drj
    public final void b() {
        dqn dqnVar;
        dqn dqnVar2;
        dqn dqnVar3;
        dqn dqnVar4 = this.d;
        if (dqnVar4.l) {
            this.e.c(dqnVar4.j());
        }
        drc drcVar = this.e;
        if (!drcVar.i) {
            int iW = this.d.W();
            this.j = iW;
            if (iW != 3) {
                if (this.j == 4 && (dqnVar3 = this.d.ae) != null && (dqnVar3.W() == 1 || dqnVar3.W() == 4)) {
                    int iJ = (dqnVar3.j() - this.d.T.b()) - this.d.V.b();
                    j(this.h, dqnVar3.o.h, this.d.T.b());
                    j(this.i, dqnVar3.o.i, -this.d.V.b());
                    drcVar.c(iJ);
                    return;
                }
                if (this.j == 1) {
                    drcVar.c(this.d.j());
                }
            }
        } else if (this.j == 4 && (dqnVar = this.d.ae) != null && (dqnVar.W() == 1 || dqnVar.W() == 4)) {
            j(this.h, dqnVar.o.h, this.d.T.b());
            j(this.i, dqnVar.o.i, -this.d.V.b());
            return;
        }
        if (drcVar.i) {
            dqn dqnVar5 = this.d;
            if (dqnVar5.l) {
                dqm[] dqmVarArr = dqnVar5.ab;
                dqm dqmVar = dqmVarArr[0];
                dqm dqmVar2 = dqmVar.e;
                if (dqmVar2 != null && dqmVarArr[1].e != null) {
                    if (dqnVar5.R()) {
                        this.h.e = this.d.ab[0].b();
                        this.i.e = -this.d.ab[1].b();
                        return;
                    }
                    drb drbVarK = k(this.d.ab[0]);
                    if (drbVarK != null) {
                        j(this.h, drbVarK, this.d.ab[0].b());
                    }
                    drb drbVarK2 = k(this.d.ab[1]);
                    if (drbVarK2 != null) {
                        j(this.i, drbVarK2, -this.d.ab[1].b());
                    }
                    this.h.b = true;
                    this.i.b = true;
                    return;
                }
                if (dqmVar2 != null) {
                    drb drbVarK3 = k(dqmVar);
                    if (drbVarK3 != null) {
                        drb drbVar = this.h;
                        j(drbVar, drbVarK3, this.d.ab[0].b());
                        j(this.i, drbVar, drcVar.f);
                        return;
                    }
                    return;
                }
                dqm dqmVar3 = dqmVarArr[1];
                if (dqmVar3.e != null) {
                    drb drbVarK4 = k(dqmVar3);
                    if (drbVarK4 != null) {
                        drb drbVar2 = this.i;
                        j(drbVar2, drbVarK4, -this.d.ab[1].b());
                        j(this.h, drbVar2, -drcVar.f);
                        return;
                    }
                    return;
                }
                if ((dqnVar5 instanceof dqs) || dqnVar5.ae == null || dqnVar5.U(7).e != null) {
                    return;
                }
                dqn dqnVar6 = this.d;
                drb drbVar3 = dqnVar6.ae.o.h;
                drb drbVar4 = this.h;
                j(drbVar4, drbVar3, dqnVar6.k());
                j(this.i, drbVar4, drcVar.f);
                return;
            }
        }
        if (this.j == 3) {
            dqn dqnVar7 = this.d;
            int i = dqnVar7.C;
            if (i == 2) {
                dqn dqnVar8 = dqnVar7.ae;
                if (dqnVar8 != null) {
                    drc drcVar2 = dqnVar8.p.e;
                    drcVar.k.add(drcVar2);
                    drcVar2.j.add(drcVar);
                    drcVar.b = true;
                    drb drbVar5 = this.h;
                    List list = drcVar.j;
                    list.add(drbVar5);
                    list.add(this.i);
                }
            } else if (i == 3) {
                if (dqnVar7.D == 3) {
                    this.h.a = this;
                    this.i.a = this;
                    drh drhVar = dqnVar7.p;
                    drhVar.h.a = this;
                    drhVar.i.a = this;
                    drcVar.a = this;
                    if (dqnVar7.S()) {
                        List list2 = drcVar.k;
                        list2.add(this.d.p.e);
                        this.d.p.e.j.add(drcVar);
                        drh drhVar2 = this.d.p;
                        drhVar2.e.a = this;
                        list2.add(drhVar2.h);
                        list2.add(this.d.p.i);
                        this.d.p.h.j.add(drcVar);
                        this.d.p.i.j.add(drcVar);
                    } else if (this.d.R()) {
                        this.d.p.e.k.add(drcVar);
                        drcVar.j.add(this.d.p.e);
                    } else {
                        this.d.p.e.k.add(drcVar);
                    }
                } else {
                    drc drcVar3 = dqnVar7.p.e;
                    drcVar.k.add(drcVar3);
                    drcVar3.j.add(drcVar);
                    this.d.p.h.j.add(drcVar);
                    this.d.p.i.j.add(drcVar);
                    drcVar.b = true;
                    drb drbVar6 = this.h;
                    List list3 = drcVar.j;
                    list3.add(drbVar6);
                    drb drbVar7 = this.i;
                    list3.add(drbVar7);
                    drbVar6.k.add(drcVar);
                    drbVar7.k.add(drcVar);
                }
            }
        }
        dqn dqnVar9 = this.d;
        dqm[] dqmVarArr2 = dqnVar9.ab;
        dqm dqmVar4 = dqmVarArr2[0];
        dqm dqmVar5 = dqmVar4.e;
        if (dqmVar5 != null && dqmVarArr2[1].e != null) {
            if (dqnVar9.R()) {
                this.h.e = this.d.ab[0].b();
                this.i.e = -this.d.ab[1].b();
                return;
            }
            drb drbVarK5 = k(this.d.ab[0]);
            drb drbVarK6 = k(this.d.ab[1]);
            if (drbVarK5 != null) {
                drbVarK5.a(this);
            }
            if (drbVarK6 != null) {
                drbVarK6.a(this);
            }
            this.k = 4;
            return;
        }
        if (dqmVar5 != null) {
            drb drbVarK7 = k(dqmVar4);
            if (drbVarK7 != null) {
                drb drbVar8 = this.h;
                j(drbVar8, drbVarK7, this.d.ab[0].b());
                i(this.i, drbVar8, 1, drcVar);
                return;
            }
            return;
        }
        dqm dqmVar6 = dqmVarArr2[1];
        if (dqmVar6.e != null) {
            drb drbVarK8 = k(dqmVar6);
            if (drbVarK8 != null) {
                drb drbVar9 = this.i;
                j(drbVar9, drbVarK8, -this.d.ab[1].b());
                i(this.h, drbVar9, -1, drcVar);
                return;
            }
            return;
        }
        if ((dqnVar9 instanceof dqs) || (dqnVar2 = dqnVar9.ae) == null) {
            return;
        }
        drb drbVar10 = dqnVar2.o.h;
        drb drbVar11 = this.h;
        j(drbVar11, drbVar10, dqnVar9.k());
        i(this.i, drbVar11, 1, drcVar);
    }

    @Override // defpackage.drj
    public final void c() {
        drb drbVar = this.h;
        if (drbVar.i) {
            this.d.aj = drbVar.f;
        }
    }

    @Override // defpackage.drj
    public final void d() {
        this.l = null;
        this.h.b();
        this.i.b();
        this.e.b();
        this.g = false;
    }

    @Override // defpackage.drj
    public final boolean e() {
        return this.j != 3 || this.d.C == 0;
    }

    @Override // defpackage.drj, defpackage.dqz
    public final void f() {
        float f;
        int i = this.k;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 3) {
            dqn dqnVar = this.d;
            m(dqnVar.T, dqnVar.V, 0);
            return;
        }
        drc drcVar = this.e;
        if (!drcVar.i && this.j == 3) {
            dqn dqnVar2 = this.d;
            int i3 = dqnVar2.C;
            if (i3 == 2) {
                dqn dqnVar3 = dqnVar2.ae;
                if (dqnVar3 != null) {
                    if (dqnVar3.o.e.i) {
                        drcVar.c((int) ((r7.f * dqnVar2.H) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = dqnVar2.D;
                if (i4 == 0 || i4 == 3) {
                    drh drhVar = dqnVar2.p;
                    drb drbVar = drhVar.h;
                    drb drbVar2 = drhVar.i;
                    boolean z = dqnVar2.T.e != null;
                    boolean z2 = dqnVar2.U.e != null;
                    boolean z3 = dqnVar2.V.e != null;
                    boolean z4 = dqnVar2.W.e != null;
                    int i5 = dqnVar2.ai;
                    if (z && z2 && z3 && z4) {
                        float f2 = dqnVar2.ah;
                        if (drbVar.i && drbVar2.i) {
                            drb drbVar3 = this.h;
                            if (drbVar3.c) {
                                drb drbVar4 = this.i;
                                if (drbVar4.c) {
                                    int i6 = ((drb) drbVar3.k.get(0)).f + drbVar3.e;
                                    int i7 = ((drb) drbVar4.k.get(0)).f - drbVar4.e;
                                    int i8 = drbVar.f + drbVar.e;
                                    int i9 = drbVar2.f - drbVar2.e;
                                    int[] iArr = a;
                                    n(iArr, i6, i7, i8, i9, f2, i5);
                                    drcVar.c(iArr[0]);
                                    this.d.p.e.c(iArr[1]);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        drb drbVar5 = this.h;
                        if (drbVar5.i) {
                            drb drbVar6 = this.i;
                            if (drbVar6.i) {
                                if (!drbVar.c || !drbVar2.c) {
                                    return;
                                }
                                int i10 = drbVar5.f + drbVar5.e;
                                int i11 = drbVar6.f - drbVar6.e;
                                int i12 = ((drb) drbVar.k.get(0)).f + drbVar.e;
                                int i13 = ((drb) drbVar2.k.get(0)).f - drbVar2.e;
                                int[] iArr2 = a;
                                n(iArr2, i10, i11, i12, i13, f2, i5);
                                drcVar.c(iArr2[0]);
                                this.d.p.e.c(iArr2[1]);
                            }
                        }
                        if (!drbVar5.c) {
                            return;
                        }
                        drb drbVar7 = this.i;
                        if (!drbVar7.c || !drbVar.c || !drbVar2.c) {
                            return;
                        }
                        int i14 = ((drb) drbVar5.k.get(0)).f + drbVar5.e;
                        int i15 = ((drb) drbVar7.k.get(0)).f - drbVar7.e;
                        int i16 = ((drb) drbVar.k.get(0)).f + drbVar.e;
                        int i17 = ((drb) drbVar2.k.get(0)).f - drbVar2.e;
                        int[] iArr3 = a;
                        n(iArr3, i14, i15, i16, i17, f2, i5);
                        drcVar.c(iArr3[0]);
                        this.d.p.e.c(iArr3[1]);
                    } else if (z && z3) {
                        drb drbVar8 = this.h;
                        if (!drbVar8.c) {
                            return;
                        }
                        drb drbVar9 = this.i;
                        if (!drbVar9.c) {
                            return;
                        }
                        float f3 = dqnVar2.ah;
                        int i18 = (((drb) drbVar9.k.get(0)).f - drbVar9.e) - (((drb) drbVar8.k.get(0)).f + drbVar8.e);
                        if (i5 == -1 || i5 == 0) {
                            int iH = h(i18, 0);
                            int i19 = (int) ((iH * f3) + 0.5f);
                            int iH2 = h(i19, 1);
                            if (i19 != iH2) {
                                iH = (int) ((iH2 / f3) + 0.5f);
                            }
                            drcVar.c(iH);
                            this.d.p.e.c(iH2);
                        } else {
                            int iH3 = h(i18, 0);
                            int i20 = (int) ((iH3 / f3) + 0.5f);
                            int iH4 = h(i20, 1);
                            if (i20 != iH4) {
                                iH3 = (int) ((iH4 * f3) + 0.5f);
                            }
                            drcVar.c(iH3);
                            this.d.p.e.c(iH4);
                        }
                    } else if (z2 && z4) {
                        if (!drbVar.c || !drbVar2.c) {
                            return;
                        }
                        float f4 = dqnVar2.ah;
                        int i21 = (((drb) drbVar2.k.get(0)).f - drbVar2.e) - (((drb) drbVar.k.get(0)).f + drbVar.e);
                        if (i5 != 0) {
                            int iH5 = h(i21, 1);
                            int i22 = (int) ((iH5 / f4) + 0.5f);
                            int iH6 = h(i22, 0);
                            if (i22 != iH6) {
                                iH5 = (int) ((iH6 * f4) + 0.5f);
                            }
                            drcVar.c(iH6);
                            this.d.p.e.c(iH5);
                        } else {
                            int iH7 = h(i21, 1);
                            int i23 = (int) ((iH7 * f4) + 0.5f);
                            int iH8 = h(i23, 0);
                            if (i23 != iH8) {
                                iH7 = (int) ((iH8 / f4) + 0.5f);
                            }
                            drcVar.c(iH8);
                            this.d.p.e.c(iH7);
                        }
                    }
                } else {
                    int i24 = dqnVar2.ai;
                    if (i24 == -1 || i24 != 0) {
                        float f5 = dqnVar2.p.e.f;
                        float f6 = dqnVar2.ah;
                        f = f5 * f6;
                        drcVar.c((int) (f + 0.5f));
                    } else {
                        f = dqnVar2.p.e.f / dqnVar2.ah;
                        drcVar.c((int) (f + 0.5f));
                    }
                }
            }
        }
        drb drbVar10 = this.h;
        if (drbVar10.c) {
            drb drbVar11 = this.i;
            if (drbVar11.c) {
                if (drbVar10.i && drbVar11.i && drcVar.i) {
                    return;
                }
                if (!drcVar.i && this.j == 3) {
                    dqn dqnVar4 = this.d;
                    if (dqnVar4.C == 0 && !dqnVar4.R()) {
                        drb drbVar12 = (drb) drbVar10.k.get(0);
                        drb drbVar13 = (drb) drbVar11.k.get(0);
                        int i25 = drbVar12.f + drbVar10.e;
                        int i26 = drbVar13.f + drbVar11.e;
                        drbVar10.c(i25);
                        drbVar11.c(i26);
                        drcVar.c(i26 - i25);
                        return;
                    }
                }
                if (!drcVar.i && this.j == 3 && this.c == 1) {
                    List list = drbVar10.k;
                    if (list.size() > 0) {
                        List list2 = drbVar11.k;
                        if (list2.size() > 0) {
                            drb drbVar14 = (drb) list.get(0);
                            int iMin = Math.min((((drb) list2.get(0)).f + drbVar11.e) - (drbVar14.f + drbVar10.e), drcVar.m);
                            dqn dqnVar5 = this.d;
                            int i27 = dqnVar5.G;
                            int iMax = Math.max(dqnVar5.F, iMin);
                            if (i27 > 0) {
                                iMax = Math.min(i27, iMax);
                            }
                            drcVar.c(iMax);
                        }
                    }
                }
                if (drcVar.i) {
                    drb drbVar15 = (drb) drbVar10.k.get(0);
                    drb drbVar16 = (drb) drbVar11.k.get(0);
                    int i28 = drbVar15.f;
                    int i29 = drbVar10.e + i28;
                    int i30 = drbVar16.f;
                    int i31 = drbVar11.e + i30;
                    float f7 = this.d.ao;
                    if (drbVar15 == drbVar16) {
                        f7 = 0.5f;
                    }
                    if (drbVar15 != drbVar16) {
                        i30 = i31;
                    }
                    if (drbVar15 != drbVar16) {
                        i28 = i29;
                    }
                    drbVar10.c((int) (i28 + 0.5f + (((i30 - i28) - drcVar.f) * f7)));
                    drbVar11.c(drbVar10.f + drcVar.f);
                }
            }
        }
    }

    public final void g() {
        this.g = false;
        drb drbVar = this.h;
        drbVar.b();
        drbVar.i = false;
        drb drbVar2 = this.i;
        drbVar2.b();
        drbVar2.i = false;
        this.e.i = false;
    }

    public final String toString() {
        return "HorizontalRun ".concat(String.valueOf(this.d.as));
    }
}
