package Q0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f9601a;

    /* renamed from: d, reason: collision with root package name */
    public c f9604d;

    /* renamed from: e, reason: collision with root package name */
    public c f9605e;

    /* renamed from: f, reason: collision with root package name */
    public c f9606f;

    /* renamed from: g, reason: collision with root package name */
    public c f9607g;

    /* renamed from: h, reason: collision with root package name */
    public int f9608h;

    /* renamed from: i, reason: collision with root package name */
    public int f9609i;

    /* renamed from: j, reason: collision with root package name */
    public int f9610j;
    public int k;

    /* renamed from: q, reason: collision with root package name */
    public int f9616q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f9617r;

    /* renamed from: b, reason: collision with root package name */
    public d f9602b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f9603c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f9611l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f9612m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f9613n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f9614o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f9615p = 0;

    public f(g gVar, int i5, c cVar, c cVar2, c cVar3, c cVar4, int i10) {
        this.f9617r = gVar;
        this.f9601a = i5;
        this.f9604d = cVar;
        this.f9605e = cVar2;
        this.f9606f = cVar3;
        this.f9607g = cVar4;
        this.f9608h = gVar.f9647w0;
        this.f9609i = gVar.f9644s0;
        this.f9610j = gVar.f9648x0;
        this.k = gVar.f9645t0;
        this.f9616q = i10;
    }

    public final void a(d dVar) {
        int i5 = this.f9601a;
        g gVar = this.f9617r;
        if (i5 == 0) {
            int iU = gVar.U(dVar, this.f9616q);
            if (dVar.f9570p0[0] == 3) {
                this.f9615p++;
                iU = 0;
            }
            this.f9611l = iU + (dVar.f9553g0 != 8 ? gVar.f9632P0 : 0) + this.f9611l;
            int iT = gVar.T(dVar, this.f9616q);
            if (this.f9602b == null || this.f9603c < iT) {
                this.f9602b = dVar;
                this.f9603c = iT;
                this.f9612m = iT;
            }
        } else {
            int iU2 = gVar.U(dVar, this.f9616q);
            int iT2 = gVar.T(dVar, this.f9616q);
            if (dVar.f9570p0[1] == 3) {
                this.f9615p++;
                iT2 = 0;
            }
            this.f9612m = iT2 + (dVar.f9553g0 != 8 ? gVar.f9633Q0 : 0) + this.f9612m;
            if (this.f9602b == null || this.f9603c < iU2) {
                this.f9602b = dVar;
                this.f9603c = iU2;
                this.f9611l = iU2;
            }
        }
        this.f9614o++;
    }

    public final void b(int i5, boolean z2, boolean z10) {
        g gVar;
        int i10;
        d dVar;
        boolean z11;
        char c10;
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        int i12;
        int i13 = this.f9614o;
        int i14 = 0;
        while (true) {
            gVar = this.f9617r;
            if (i14 >= i13 || (i12 = this.f9613n + i14) >= gVar.f9643b1) {
                break;
            }
            d dVar2 = gVar.f9642a1[i12];
            if (dVar2 != null) {
                dVar2.D();
            }
            i14++;
        }
        if (i13 == 0 || this.f9602b == null) {
            return;
        }
        boolean z12 = z10 && i5 == 0;
        int i15 = -1;
        int i16 = -1;
        for (int i17 = 0; i17 < i13; i17++) {
            int i18 = this.f9613n + (z2 ? (i13 - 1) - i17 : i17);
            if (i18 >= gVar.f9643b1) {
                break;
            }
            d dVar3 = gVar.f9642a1[i18];
            if (dVar3 != null && dVar3.f9553g0 == 0) {
                if (i15 == -1) {
                    i15 = i17;
                }
                i16 = i17;
            }
        }
        if (this.f9601a != 0) {
            boolean z13 = z12;
            d dVar4 = this.f9602b;
            dVar4.f9557i0 = gVar.f9620D0;
            int i19 = this.f9608h;
            if (i5 > 0) {
                i19 += gVar.f9632P0;
            }
            c cVar = dVar4.f9523I;
            c cVar2 = dVar4.f9525K;
            if (z2) {
                cVar2.a(this.f9606f, i19);
                if (z10) {
                    cVar.a(this.f9604d, this.f9610j);
                }
                if (i5 > 0) {
                    this.f9606f.f9509d.f9523I.a(cVar2, 0);
                }
            } else {
                cVar.a(this.f9604d, i19);
                if (z10) {
                    cVar2.a(this.f9606f, this.f9610j);
                }
                if (i5 > 0) {
                    this.f9604d.f9509d.f9525K.a(cVar, 0);
                }
            }
            d dVar5 = null;
            for (int i20 = 0; i20 < i13; i20++) {
                int i21 = this.f9613n + i20;
                if (i21 >= gVar.f9643b1) {
                    return;
                }
                d dVar6 = gVar.f9642a1[i21];
                if (dVar6 != null) {
                    c cVar3 = dVar6.f9524J;
                    if (i20 == 0) {
                        dVar6.f(cVar3, this.f9605e, this.f9609i);
                        int i22 = gVar.f9621E0;
                        float f14 = gVar.f9627K0;
                        if (this.f9613n == 0) {
                            int i23 = gVar.f9623G0;
                            i10 = -1;
                            if (i23 != -1) {
                                f14 = gVar.f9629M0;
                            }
                            i22 = i23;
                            dVar6.f9559j0 = i22;
                            dVar6.f9549e0 = f14;
                        } else {
                            i10 = -1;
                        }
                        if (z10 && (i23 = gVar.f9625I0) != i10) {
                            f14 = gVar.f9631O0;
                            i22 = i23;
                        }
                        dVar6.f9559j0 = i22;
                        dVar6.f9549e0 = f14;
                    }
                    if (i20 == i13 - 1) {
                        dVar6.f(dVar6.L, this.f9607g, this.k);
                    }
                    if (dVar5 != null) {
                        int i24 = gVar.f9633Q0;
                        c cVar4 = dVar5.L;
                        cVar3.a(cVar4, i24);
                        if (i20 == i15) {
                            int i25 = this.f9609i;
                            if (cVar3.h()) {
                                cVar3.f9513h = i25;
                            }
                        }
                        cVar4.a(cVar3, 0);
                        if (i20 == i16 + 1) {
                            int i26 = this.k;
                            if (cVar4.h()) {
                                cVar4.f9513h = i26;
                            }
                        }
                    }
                    if (dVar6 != dVar4) {
                        c cVar5 = dVar6.f9525K;
                        c cVar6 = dVar6.f9523I;
                        if (z2) {
                            int i27 = gVar.f9634R0;
                            if (i27 == 0) {
                                cVar5.a(cVar2, 0);
                            } else if (i27 == 1) {
                                cVar6.a(cVar, 0);
                            } else if (i27 == 2) {
                                cVar6.a(cVar, 0);
                                cVar5.a(cVar2, 0);
                            }
                            dVar5 = dVar6;
                        } else {
                            int i28 = gVar.f9634R0;
                            if (i28 == 0) {
                                cVar6.a(cVar, 0);
                            } else if (i28 == 1) {
                                cVar5.a(cVar2, 0);
                            } else if (i28 == 2) {
                                if (z13) {
                                    cVar6.a(this.f9604d, this.f9608h);
                                    cVar5.a(this.f9606f, this.f9610j);
                                } else {
                                    cVar6.a(cVar, 0);
                                    cVar5.a(cVar2, 0);
                                }
                            }
                            dVar5 = dVar6;
                        }
                    } else {
                        dVar5 = dVar6;
                    }
                }
            }
            return;
        }
        d dVar7 = this.f9602b;
        dVar7.f9559j0 = gVar.f9621E0;
        int i29 = this.f9609i;
        if (i5 > 0) {
            i29 += gVar.f9633Q0;
        }
        c cVar7 = this.f9605e;
        c cVar8 = dVar7.f9524J;
        cVar8.a(cVar7, i29);
        c cVar9 = dVar7.L;
        if (z10) {
            cVar9.a(this.f9607g, this.k);
        }
        if (i5 > 0) {
            this.f9605e.f9509d.L.a(cVar8, 0);
        }
        if (gVar.f9635S0 != 3 || dVar7.f9519E) {
            dVar = dVar7;
        } else {
            for (int i30 = 0; i30 < i13; i30++) {
                int i31 = this.f9613n + (z2 ? (i13 - 1) - i30 : i30);
                if (i31 >= gVar.f9643b1) {
                    break;
                }
                dVar = gVar.f9642a1[i31];
                if (dVar.f9519E) {
                    break;
                }
            }
            dVar = dVar7;
        }
        int i32 = 0;
        d dVar8 = null;
        while (i32 < i13) {
            int i33 = z2 ? (i13 - 1) - i32 : i32;
            int i34 = this.f9613n + i33;
            if (i34 >= gVar.f9643b1) {
                return;
            }
            d dVar9 = gVar.f9642a1[i34];
            if (dVar9 == null) {
                z11 = z12;
                c10 = 3;
            } else {
                c cVar10 = dVar9.f9523I;
                if (i32 == 0) {
                    dVar9.f(cVar10, this.f9604d, this.f9608h);
                }
                if (i33 == 0) {
                    int i35 = gVar.f9620D0;
                    if (z2) {
                        f10 = 1.0f;
                        f11 = 1.0f - gVar.f9626J0;
                    } else {
                        f10 = 1.0f;
                        f11 = gVar.f9626J0;
                    }
                    if (this.f9613n == 0) {
                        i11 = gVar.f9622F0;
                        z11 = z12;
                        if (i11 != -1) {
                            if (z2) {
                                f13 = gVar.f9628L0;
                                f11 = f10 - f13;
                            } else {
                                f12 = gVar.f9628L0;
                                f11 = f12;
                            }
                        }
                        dVar9.f9557i0 = i11;
                        dVar9.f9547d0 = f11;
                    } else {
                        z11 = z12;
                    }
                    if (!z10 || (i11 = gVar.f9624H0) == -1) {
                        i11 = i35;
                        dVar9.f9557i0 = i11;
                        dVar9.f9547d0 = f11;
                    } else if (z2) {
                        f13 = gVar.f9630N0;
                        f11 = f10 - f13;
                        dVar9.f9557i0 = i11;
                        dVar9.f9547d0 = f11;
                    } else {
                        f12 = gVar.f9630N0;
                        f11 = f12;
                        dVar9.f9557i0 = i11;
                        dVar9.f9547d0 = f11;
                    }
                } else {
                    z11 = z12;
                }
                if (i32 == i13 - 1) {
                    dVar9.f(dVar9.f9525K, this.f9606f, this.f9610j);
                }
                if (dVar8 != null) {
                    int i36 = gVar.f9632P0;
                    c cVar11 = dVar8.f9525K;
                    cVar10.a(cVar11, i36);
                    if (i32 == i15) {
                        int i37 = this.f9608h;
                        if (cVar10.h()) {
                            cVar10.f9513h = i37;
                        }
                    }
                    cVar11.a(cVar10, 0);
                    if (i32 == i16 + 1) {
                        int i38 = this.f9610j;
                        if (cVar11.h()) {
                            cVar11.f9513h = i38;
                        }
                    }
                }
                if (dVar9 != dVar7) {
                    int i39 = gVar.f9635S0;
                    c10 = 3;
                    if (i39 == 3 && dVar.f9519E && dVar9 != dVar && dVar9.f9519E) {
                        dVar9.f9526M.a(dVar.f9526M, 0);
                    } else {
                        c cVar12 = dVar9.f9524J;
                        if (i39 != 0) {
                            c cVar13 = dVar9.L;
                            if (i39 == 1) {
                                cVar13.a(cVar9, 0);
                            } else if (z11) {
                                cVar12.a(this.f9605e, this.f9609i);
                                cVar13.a(this.f9607g, this.k);
                            } else {
                                cVar12.a(cVar8, 0);
                                cVar13.a(cVar9, 0);
                            }
                        } else {
                            cVar12.a(cVar8, 0);
                        }
                    }
                } else {
                    c10 = 3;
                }
                dVar8 = dVar9;
            }
            i32++;
            z12 = z11;
        }
    }

    public final int c() {
        return this.f9601a == 1 ? this.f9612m - this.f9617r.f9633Q0 : this.f9612m;
    }

    public final int d() {
        return this.f9601a == 0 ? this.f9611l - this.f9617r.f9632P0 : this.f9611l;
    }

    public final void e(int i5) {
        g gVar;
        int i10;
        int i11 = this.f9615p;
        if (i11 == 0) {
            return;
        }
        int i12 = this.f9614o;
        int i13 = i5 / i11;
        int i14 = 0;
        while (true) {
            gVar = this.f9617r;
            if (i14 >= i12 || (i10 = this.f9613n + i14) >= gVar.f9643b1) {
                break;
            }
            d dVar = gVar.f9642a1[i10];
            if (this.f9601a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.f9570p0;
                    if (iArr[0] == 3 && dVar.f9572r == 0) {
                        gVar.V(1, i13, iArr[1], dVar.k(), dVar);
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.f9570p0;
                if (iArr2[1] == 3 && dVar.f9573s == 0) {
                    int i15 = iArr2[0];
                    int i16 = i13;
                    gVar.V(i15, dVar.q(), 1, i16, dVar);
                    i13 = i16;
                }
            }
            i14++;
        }
        this.f9611l = 0;
        this.f9612m = 0;
        this.f9602b = null;
        this.f9603c = 0;
        int i17 = this.f9614o;
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = this.f9613n + i18;
            if (i19 >= gVar.f9643b1) {
                return;
            }
            d dVar2 = gVar.f9642a1[i19];
            if (this.f9601a == 0) {
                int iQ = dVar2.q();
                int i20 = gVar.f9632P0;
                if (dVar2.f9553g0 == 8) {
                    i20 = 0;
                }
                this.f9611l = iQ + i20 + this.f9611l;
                int iT = gVar.T(dVar2, this.f9616q);
                if (this.f9602b == null || this.f9603c < iT) {
                    this.f9602b = dVar2;
                    this.f9603c = iT;
                    this.f9612m = iT;
                }
            } else {
                int iU = gVar.U(dVar2, this.f9616q);
                int iT2 = gVar.T(dVar2, this.f9616q);
                int i21 = gVar.f9633Q0;
                if (dVar2.f9553g0 == 8) {
                    i21 = 0;
                }
                this.f9612m = iT2 + i21 + this.f9612m;
                if (this.f9602b == null || this.f9603c < iU) {
                    this.f9602b = dVar2;
                    this.f9603c = iU;
                    this.f9611l = iU;
                }
            }
        }
    }

    public final void f(int i5, c cVar, c cVar2, c cVar3, c cVar4, int i10, int i11, int i12, int i13, int i14) {
        this.f9601a = i5;
        this.f9604d = cVar;
        this.f9605e = cVar2;
        this.f9606f = cVar3;
        this.f9607g = cVar4;
        this.f9608h = i10;
        this.f9609i = i11;
        this.f9610j = i12;
        this.k = i13;
        this.f9616q = i14;
    }
}
