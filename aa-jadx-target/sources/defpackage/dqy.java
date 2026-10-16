package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dqy extends defpackage.drc {
    public defpackage.dqv[] aJ;
    public int a = -1;
    public int b = -1;
    public int c = -1;
    public int d = -1;
    public int e = -1;
    public int f = -1;
    public float g = 0.5f;
    public float h = 0.5f;
    public float i = 0.5f;
    public float j = 0.5f;
    public float k = 0.5f;
    public float aB = 0.5f;
    public int aC = 0;
    public int aD = 0;
    public int aE = 2;
    public int aF = 2;
    public int aG = 0;
    public int aH = -1;
    public int aI = 0;
    private final java.util.ArrayList aY = new java.util.ArrayList();
    private defpackage.dqv[] aZ = null;
    private defpackage.dqv[] ba = null;
    private int[] bb = null;
    public int aK = 0;

    @Override // defpackage.dqv
    public final void a(defpackage.dpg dpgVar, boolean z) {
        defpackage.dqv dqvVar;
        float f;
        int i;
        super.a(dpgVar, z);
        defpackage.dqv dqvVar2 = this.ae;
        boolean z2 = dqvVar2 != null && ((defpackage.dqw) dqvVar2).d;
        int i2 = this.aG;
        if (i2 == 0) {
            java.util.ArrayList arrayList = this.aY;
            if (arrayList.size() > 0) {
                ((defpackage.dqx) arrayList.get(0)).d(z2, 0, true);
            }
        } else if (i2 == 1) {
            java.util.ArrayList arrayList2 = this.aY;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                ((defpackage.dqx) arrayList2.get(i3)).d(z2, i3, i3 == size + (-1));
                i3++;
            }
        } else if (i2 != 2) {
            if (i2 == 3) {
                java.util.ArrayList arrayList3 = this.aY;
                int size2 = arrayList3.size();
                int i4 = 0;
                while (i4 < size2) {
                    ((defpackage.dqx) arrayList3.get(i4)).d(z2, i4, i4 == size2 + (-1));
                    i4++;
                }
            }
        } else if (this.bb != null && this.ba != null && this.aZ != null) {
            for (int i5 = 0; i5 < this.aK; i5++) {
                this.aJ[i5].v();
            }
            int[] iArr = this.bb;
            int i6 = iArr[0];
            int i7 = iArr[1];
            float f2 = this.g;
            defpackage.dqv dqvVar3 = null;
            int i8 = 0;
            while (i8 < i6) {
                if (z2) {
                    i = (i6 - i8) - 1;
                    f = 1.0f - this.g;
                } else {
                    f = f2;
                    i = i8;
                }
                defpackage.dqv dqvVar4 = this.ba[i];
                if (dqvVar4 != null && dqvVar4.ar != 8) {
                    if (i8 == 0) {
                        dqvVar4.q(dqvVar4.T, this.T, this.aR);
                        dqvVar4.at = this.a;
                        dqvVar4.ao = f;
                        i8 = 0;
                    }
                    if (i8 == i6 - 1) {
                        dqvVar4.q(dqvVar4.V, this.V, this.aS);
                    }
                    if (i8 > 0 && dqvVar3 != null) {
                        defpackage.dqu dquVar = dqvVar4.T;
                        int i9 = this.aC;
                        defpackage.dqu dquVar2 = dqvVar3.V;
                        dqvVar4.q(dquVar, dquVar2, i9);
                        dqvVar3.q(dquVar2, dquVar, 0);
                    }
                    dqvVar3 = dqvVar4;
                }
                i8++;
                f2 = f;
            }
            int i10 = 0;
            while (i10 < i7) {
                defpackage.dqv dqvVar5 = this.aZ[i10];
                if (dqvVar5 != null && dqvVar5.ar != 8) {
                    if (i10 == 0) {
                        dqvVar5.q(dqvVar5.U, this.U, this.aN);
                        dqvVar5.au = this.b;
                        dqvVar5.ap = this.h;
                        i10 = 0;
                    }
                    if (i10 == i7 - 1) {
                        dqvVar5.q(dqvVar5.W, this.W, this.aO);
                    }
                    if (i10 > 0 && dqvVar3 != null) {
                        defpackage.dqu dquVar3 = dqvVar5.U;
                        int i11 = this.aD;
                        defpackage.dqu dquVar4 = dqvVar3.W;
                        dqvVar5.q(dquVar3, dquVar4, i11);
                        dqvVar3.q(dquVar4, dquVar3, 0);
                    }
                    dqvVar3 = dqvVar5;
                }
                i10++;
            }
            for (int i12 = 0; i12 < i6; i12++) {
                for (int i13 = 0; i13 < i7; i13++) {
                    int i14 = (i13 * i6) + i12;
                    if (this.aI == 1) {
                        i14 = (i12 * i7) + i13;
                    }
                    defpackage.dqv[] dqvVarArr = this.aJ;
                    if (i14 < dqvVarArr.length && (dqvVar = dqvVarArr[i14]) != null && dqvVar.ar != 8) {
                        defpackage.dqv dqvVar6 = this.ba[i12];
                        defpackage.dqv dqvVar7 = this.aZ[i13];
                        if (dqvVar != dqvVar6) {
                            dqvVar.q(dqvVar.T, dqvVar6.T, 0);
                            dqvVar.q(dqvVar.V, dqvVar6.V, 0);
                        }
                        if (dqvVar != dqvVar7) {
                            dqvVar.q(dqvVar.U, dqvVar7.U, 0);
                            dqvVar.q(dqvVar.W, dqvVar7.W, 0);
                        }
                    }
                }
            }
        }
        this.aT = false;
    }

    public final int ae(defpackage.dqv dqvVar, int i) {
        defpackage.dqv dqvVar2;
        if (dqvVar == null) {
            return 0;
        }
        if (dqvVar.W() == 3) {
            int i2 = dqvVar.C;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (dqvVar.H * i);
                if (i3 != dqvVar.j()) {
                    dqvVar.r = true;
                    ak(dqvVar, 1, i3, dqvVar.X(), dqvVar.h());
                }
                return i3;
            }
            dqvVar2 = dqvVar;
            if (i2 != 1 && i2 == 3) {
                return (int) ((dqvVar2.h() * dqvVar2.ah) + 0.5f);
            }
        } else {
            dqvVar2 = dqvVar;
        }
        return dqvVar2.j();
    }

    /* JADX WARN: Code duplicated, block: B:270:0x0445  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f4  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.drc
    public final void b(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        defpackage.dqx dqxVar;
        char c;
        int i10;
        int i11;
        int i12;
        int i13;
        defpackage.dqv dqvVar;
        int i14;
        int iCeil;
        int iCeil2;
        java.lang.Object obj;
        defpackage.dqv dqvVar2;
        int i15;
        defpackage.dqu dquVar;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        if (this.aM > 0) {
            defpackage.dqv dqvVar3 = this.ae;
            defpackage.drf drfVar = dqvVar3 != null ? ((defpackage.dqw) dqvVar3).c : null;
            if (drfVar == null) {
                ai(0, 0);
                this.aT = false;
                return;
            }
            for (int i23 = 0; i23 < this.aM; i23++) {
                defpackage.dqv dqvVar4 = this.aL[i23];
                if (dqvVar4 != null && !(dqvVar4 instanceof defpackage.dqz)) {
                    int iV = dqvVar4.V(0);
                    int iV2 = dqvVar4.V(1);
                    if (iV != 3 || dqvVar4.C == 1 || iV2 != 3) {
                        i22 = iV2;
                    } else if (dqvVar4.D == 1) {
                        i22 = 3;
                    }
                    if (iV == 3) {
                        iV = 2;
                    }
                    if (iV2 == 3) {
                        i22 = 2;
                    }
                    defpackage.dre dreVar = this.aW;
                    dreVar.i = iV;
                    dreVar.j = i22;
                    dreVar.a = dqvVar4.j();
                    dreVar.b = dqvVar4.h();
                    drfVar.b(dqvVar4, dreVar);
                    dqvVar4.M(dreVar.c);
                    dqvVar4.B(dreVar.d);
                    dqvVar4.x(dreVar.e);
                }
            }
        }
        int i24 = this.aR;
        int i25 = this.aS;
        int i26 = this.aN;
        int i27 = this.aO;
        int[] iArr2 = new int[2];
        int i28 = (i2 - i24) - i25;
        int i29 = this.aI;
        if (i29 == 1) {
            i28 = (i4 - i26) - i27;
            i29 = 1;
        }
        int i30 = this.a;
        if (i29 == 0) {
            if (i30 == -1) {
                this.a = 0;
            }
            if (this.b == -1) {
                this.b = 0;
            }
        } else {
            if (i30 == -1) {
                this.a = 0;
            }
            if (this.b == -1) {
                this.b = 0;
            }
        }
        defpackage.dqv[] dqvVarArr = this.aL;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        while (true) {
            i5 = this.aM;
            if (i31 >= i5) {
                break;
            }
            if (this.aL[i31].ar == 8) {
                i32++;
            }
            i31++;
        }
        if (i32 > 0) {
            dqvVarArr = new defpackage.dqv[i5 - i32];
            int i34 = 0;
            int i35 = 0;
            while (i34 < this.aM) {
                defpackage.dqv dqvVar5 = this.aL[i34];
                int i36 = i24;
                if (dqvVar5.ar != 8) {
                    dqvVarArr[i35] = dqvVar5;
                    i35++;
                }
                i34++;
                i24 = i36;
            }
            i5 = i35;
        }
        int i37 = i24;
        defpackage.dqv[] dqvVarArr2 = dqvVarArr;
        this.aJ = dqvVarArr2;
        this.aK = i5;
        int i38 = this.aG;
        if (i38 != 0) {
            if (i38 == 1) {
                i6 = i25;
                i7 = i26;
                i8 = i27;
                iArr = iArr2;
                i9 = i37;
                int i39 = this.aI;
                if (i5 != 0) {
                    java.util.ArrayList arrayList = this.aY;
                    arrayList.clear();
                    defpackage.dqu dquVar2 = this.T;
                    defpackage.dqu dquVar3 = this.U;
                    defpackage.dqu dquVar4 = this.V;
                    defpackage.dqu dquVar5 = this.W;
                    defpackage.dqx dqxVar2 = new defpackage.dqx(this, i39, dquVar2, dquVar3, dquVar4, dquVar5, i28);
                    arrayList.add(dqxVar2);
                    if (i39 == 0) {
                        i11 = 0;
                        int i40 = 0;
                        int i41 = 0;
                        while (i40 < i5) {
                            int i42 = i11;
                            defpackage.dqv dqvVar6 = dqvVarArr2[i40];
                            int iAe = ae(dqvVar6, i28);
                            defpackage.dqu dquVar6 = dquVar2;
                            if (dqvVar6.W() == 3) {
                                i42++;
                            }
                            if (((i41 == i28 || this.aC + i41 + iAe > i28) && dqxVar2.a != null) || (i40 > 0 && (i14 = this.aH) > 0 && i40 % i14 == 0)) {
                                dquVar2 = dquVar6;
                                dqxVar2 = new defpackage.dqx(this, 0, dquVar2, dquVar3, dquVar4, dquVar5, i28);
                                dqxVar2.e = i40;
                                arrayList.add(dqxVar2);
                                i41 = iAe;
                                dqvVar = dqvVar6;
                            } else {
                                dqvVar = dqvVar6;
                                dquVar2 = dquVar6;
                                defpackage.dqx dqxVar3 = dqxVar2;
                                if (i40 > 0) {
                                    i41 += this.aC + iAe;
                                    dqxVar2 = dqxVar3;
                                } else {
                                    i41 = iAe;
                                }
                            }
                            dqxVar2.c(dqvVar);
                            i40++;
                            i11 = i42;
                        }
                        i10 = 0;
                    } else {
                        i10 = i39;
                        int i43 = 0;
                        int i44 = 0;
                        int i45 = 0;
                        while (i44 < i5) {
                            defpackage.dqv[] dqvVarArr3 = dqvVarArr2;
                            defpackage.dqv dqvVar7 = dqvVarArr3[i44];
                            int iC = c(dqvVar7, i28);
                            defpackage.dqu dquVar7 = dquVar2;
                            int i46 = i45;
                            if (dqvVar7.X() == 3) {
                                i46++;
                            }
                            if (((i43 == i28 || this.aD + i43 + iC > i28) && dqxVar2.a != null) || (i44 > 0 && (i12 = this.aH) > 0 && i44 % i12 == 0)) {
                                dquVar2 = dquVar7;
                                dqxVar2 = new defpackage.dqx(this, i10, dquVar2, dquVar3, dquVar4, dquVar5, i28);
                                dqxVar2.e = i44;
                                arrayList.add(dqxVar2);
                            } else {
                                dquVar2 = dquVar7;
                                if (i44 > 0) {
                                    i43 += this.aD + iC;
                                }
                                dqxVar2.c(dqvVar7);
                                i44++;
                                i45 = i46;
                                dqvVarArr2 = dqvVarArr3;
                            }
                            i43 = iC;
                            dqxVar2.c(dqvVar7);
                            i44++;
                            i45 = i46;
                            dqvVarArr2 = dqvVarArr3;
                        }
                        i11 = i45;
                    }
                    int size = arrayList.size();
                    int i47 = this.aR;
                    int i48 = this.aN;
                    int i49 = this.aS;
                    int i50 = this.aO;
                    int i51 = i11;
                    defpackage.dqu dquVar8 = dquVar2;
                    boolean z = W() == 2 || X() == 2;
                    if (i51 > 0 && z) {
                        for (int i52 = 0; i52 < size; i52++) {
                            defpackage.dqx dqxVar4 = (defpackage.dqx) arrayList.get(i52);
                            if (i10 == 0) {
                                dqxVar4.e(i28 - dqxVar4.b());
                            } else {
                                dqxVar4.e(i28 - dqxVar4.a());
                            }
                        }
                    }
                    defpackage.dqu dquVar9 = dquVar3;
                    defpackage.dqu dquVar10 = dquVar5;
                    int i53 = i47;
                    int i54 = i48;
                    int i55 = i49;
                    int i56 = i50;
                    defpackage.dqu dquVar11 = dquVar8;
                    int i57 = 0;
                    int iB = 0;
                    int iMax = 0;
                    defpackage.dqu dquVar12 = dquVar4;
                    while (i57 < size) {
                        int i58 = size - 1;
                        defpackage.dqx dqxVar5 = (defpackage.dqx) arrayList.get(i57);
                        if (i10 == 0) {
                            if (i57 < i58) {
                                dquVar10 = ((defpackage.dqx) arrayList.get(i57 + 1)).a.U;
                                i56 = 0;
                            } else {
                                dquVar10 = dquVar5;
                                i56 = this.aO;
                            }
                            defpackage.dqu dquVar13 = dqxVar5.a.W;
                            dqxVar5.f(0, dquVar11, dquVar9, dquVar12, dquVar10, i53, i54, i55, i56, i28);
                            iB = java.lang.Math.max(iB, dqxVar5.b());
                            iMax += dqxVar5.a();
                            if (i57 > 0) {
                                iMax += this.aD;
                            }
                            dquVar9 = dquVar13;
                            i13 = i10;
                            i54 = 0;
                        } else {
                            if (i57 < i58) {
                                dquVar12 = ((defpackage.dqx) arrayList.get(i57 + 1)).a.T;
                                i55 = 0;
                            } else {
                                dquVar12 = dquVar4;
                                i55 = this.aS;
                            }
                            defpackage.dqu dquVar14 = dqxVar5.a.V;
                            i13 = i10;
                            dqxVar5.f(i13, dquVar11, dquVar9, dquVar12, dquVar10, i53, i54, i55, i56, i28);
                            iB += dqxVar5.b();
                            iMax = java.lang.Math.max(iMax, dqxVar5.a());
                            if (i57 > 0) {
                                iB += this.aC;
                            }
                            dquVar11 = dquVar14;
                            i53 = 0;
                        }
                        i57++;
                        i10 = i13;
                    }
                    iArr[0] = iB;
                    iArr[1] = iMax;
                }
            } else if (i38 == 2) {
                i6 = i25;
                i7 = i26;
                i8 = i27;
                iArr = iArr2;
                i9 = i37;
                int i59 = this.aI;
                int i60 = this.aH;
                if (i59 == 0) {
                    if (i60 <= 0) {
                        iCeil2 = 0;
                        int iAe2 = 0;
                        for (int i61 = 0; i61 < i5; i61++) {
                            if (i61 > 0) {
                                iAe2 += this.aC;
                            }
                            defpackage.dqv dqvVar8 = dqvVarArr2[i61];
                            if (dqvVar8 != null) {
                                iAe2 += ae(dqvVar8, i28);
                                if (iAe2 > i28) {
                                    break;
                                } else {
                                    iCeil2++;
                                }
                            }
                        }
                    } else {
                        iCeil2 = i60;
                    }
                    iCeil = 0;
                } else {
                    if (i60 <= 0) {
                        int iC2 = 0;
                        iCeil = 0;
                        for (int i62 = 0; i62 < i5; i62++) {
                            if (i62 > 0) {
                                iC2 += this.aD;
                            }
                            defpackage.dqv dqvVar9 = dqvVarArr2[i62];
                            if (dqvVar9 != null) {
                                iC2 += c(dqvVar9, i28);
                                if (iC2 > i28) {
                                    break;
                                } else {
                                    iCeil++;
                                }
                            }
                        }
                    } else {
                        iCeil = i60;
                    }
                    iCeil2 = 0;
                }
                if (this.bb == null) {
                    this.bb = new int[2];
                }
                boolean z2 = (iCeil == 0 && i59 == 1) || (iCeil2 == 0 && i59 == 0);
                while (!z2) {
                    float f = i5;
                    if (i59 == 0) {
                        iCeil = (int) java.lang.Math.ceil(f / iCeil2);
                    } else {
                        iCeil2 = (int) java.lang.Math.ceil(f / iCeil);
                    }
                    defpackage.dqv[] dqvVarArr4 = this.ba;
                    if (dqvVarArr4 == null || dqvVarArr4.length < iCeil2) {
                        obj = null;
                        this.ba = new defpackage.dqv[iCeil2];
                    } else {
                        obj = null;
                        java.util.Arrays.fill(dqvVarArr4, (java.lang.Object) null);
                    }
                    defpackage.dqv[] dqvVarArr5 = this.aZ;
                    if (dqvVarArr5 == null || dqvVarArr5.length < iCeil) {
                        this.aZ = new defpackage.dqv[iCeil];
                    } else {
                        java.util.Arrays.fill(dqvVarArr5, obj);
                    }
                    for (int i63 = 0; i63 < iCeil2; i63++) {
                        int i64 = 0;
                        while (i64 < iCeil) {
                            int i65 = (i64 * iCeil2) + i63;
                            if (i59 == 1) {
                                i65 = (i63 * iCeil) + i64;
                            }
                            if (i65 < dqvVarArr2.length && (dqvVar2 = dqvVarArr2[i65]) != null) {
                                int iAe3 = ae(dqvVar2, i28);
                                defpackage.dqv[] dqvVarArr6 = this.ba;
                                defpackage.dqv dqvVar10 = dqvVarArr6[i63];
                                i15 = i59;
                                if (dqvVar10 == null || dqvVar10.j() < iAe3) {
                                    dqvVarArr6[i63] = dqvVar2;
                                }
                                int iC3 = c(dqvVar2, i28);
                                defpackage.dqv[] dqvVarArr7 = this.aZ;
                                defpackage.dqv dqvVar11 = dqvVarArr7[i64];
                                if (dqvVar11 == null || dqvVar11.h() < iC3) {
                                    dqvVarArr7[i64] = dqvVar2;
                                }
                            } else {
                                i15 = i59;
                            }
                            i64++;
                            i59 = i15;
                        }
                    }
                    int i66 = i59;
                    int iAe4 = 0;
                    for (int i67 = 0; i67 < iCeil2; i67++) {
                        defpackage.dqv dqvVar12 = this.ba[i67];
                        if (dqvVar12 != null) {
                            if (i67 > 0) {
                                iAe4 += this.aC;
                            }
                            iAe4 += ae(dqvVar12, i28);
                        }
                    }
                    int iC4 = 0;
                    for (int i68 = 0; i68 < iCeil; i68++) {
                        defpackage.dqv dqvVar13 = this.aZ[i68];
                        if (dqvVar13 != null) {
                            if (i68 > 0) {
                                iC4 += this.aD;
                            }
                            iC4 += c(dqvVar13, i28);
                        }
                    }
                    iArr[0] = iAe4;
                    iArr[1] = iC4;
                    if (i66 == 0) {
                        if (iAe4 <= i28 || iCeil2 <= 1) {
                            z2 = true;
                        } else {
                            iCeil2--;
                        }
                    } else if (iC4 <= i28 || iCeil <= 1) {
                        z2 = true;
                    } else {
                        iCeil--;
                    }
                    i59 = i66;
                }
                int[] iArr3 = this.bb;
                iArr3[0] = iCeil2;
                iArr3[1] = iCeil;
                c = 1;
            } else if (i38 != 3) {
                i6 = i25;
                i7 = i26;
                i8 = i27;
                iArr = iArr2;
                i9 = i37;
            } else {
                int i69 = this.aI;
                if (i5 != 0) {
                    java.util.ArrayList arrayList2 = this.aY;
                    arrayList2.clear();
                    defpackage.dqu dquVar15 = this.T;
                    defpackage.dqu dquVar16 = this.U;
                    defpackage.dqu dquVar17 = this.V;
                    defpackage.dqu dquVar18 = this.W;
                    i7 = i26;
                    i8 = i27;
                    int i70 = i37;
                    iArr = iArr2;
                    i6 = i25;
                    defpackage.dqx dqxVar6 = new defpackage.dqx(this, i69, dquVar15, dquVar16, dquVar17, dquVar18, i28);
                    arrayList2.add(dqxVar6);
                    if (i69 == 0) {
                        dquVar = dquVar15;
                        int i71 = 0;
                        int i72 = 0;
                        int i73 = 0;
                        i17 = 0;
                        while (i71 < i5) {
                            int i74 = i71;
                            int i75 = i73 + 1;
                            int i76 = i70;
                            defpackage.dqv dqvVar14 = dqvVarArr2[i74];
                            int iAe5 = ae(dqvVar14, i28);
                            defpackage.dqu dquVar19 = dquVar16;
                            defpackage.dqu dquVar20 = dquVar17;
                            if (dqvVar14.W() == 3) {
                                i17++;
                            }
                            if (((i72 == i28 || this.aC + i72 + iAe5 > i28) && dqxVar6.a != null) || (i74 > 0 && (i21 = this.aH) > 0 && i75 > i21)) {
                                i20 = i74;
                                dquVar16 = dquVar19;
                                dquVar17 = dquVar20;
                                dqxVar6 = new defpackage.dqx(this, 0, dquVar, dquVar16, dquVar17, dquVar18, i28);
                                dqxVar6.e = i20;
                                arrayList2.add(dqxVar6);
                                i72 = iAe5;
                                i73 = 1;
                            } else {
                                i20 = i74;
                                dquVar16 = dquVar19;
                                dquVar17 = dquVar20;
                                defpackage.dqx dqxVar7 = dqxVar6;
                                if (i20 > 0) {
                                    i72 += this.aC + iAe5;
                                    i73 = i75;
                                    dqxVar6 = dqxVar7;
                                } else {
                                    i72 = iAe5;
                                    i73 = i75;
                                }
                            }
                            dqxVar6.c(dqvVar14);
                            i71 = i20 + 1;
                            i70 = i76;
                        }
                        i9 = i70;
                        i16 = 0;
                    } else {
                        dquVar = dquVar15;
                        i9 = i70;
                        i16 = i69;
                        int i77 = 0;
                        int i78 = 0;
                        int i79 = 0;
                        int i80 = 0;
                        while (i79 < i5) {
                            i78++;
                            int i81 = i80;
                            defpackage.dqv dqvVar15 = dqvVarArr2[i79];
                            int iC5 = c(dqvVar15, i28);
                            defpackage.dqu dquVar21 = dquVar16;
                            defpackage.dqu dquVar22 = dquVar17;
                            if (dqvVar15.X() == 3) {
                                i81++;
                            }
                            if (((i77 == i28 || this.aD + i77 + iC5 > i28) && dqxVar6.a != null) || (i79 > 0 && (i18 = this.aH) > 0 && i78 > i18)) {
                                dquVar16 = dquVar21;
                                dquVar17 = dquVar22;
                                dqxVar6 = new defpackage.dqx(this, i16, dquVar, dquVar16, dquVar17, dquVar18, i28);
                                dqxVar6.e = i79;
                                arrayList2.add(dqxVar6);
                                i77 = iC5;
                                i78 = 1;
                            } else {
                                dquVar16 = dquVar21;
                                dquVar17 = dquVar22;
                                defpackage.dqx dqxVar8 = dqxVar6;
                                if (i79 > 0) {
                                    i77 += this.aD + iC5;
                                    dqxVar6 = dqxVar8;
                                } else {
                                    i77 = iC5;
                                }
                            }
                            dqxVar6.c(dqvVar15);
                            i79++;
                            i80 = i81;
                        }
                        i17 = i80;
                    }
                    int size2 = arrayList2.size();
                    int i82 = this.aR;
                    int i83 = this.aN;
                    int i84 = this.aS;
                    int i85 = this.aO;
                    boolean z3 = W() == 2 || X() == 2;
                    if (i17 > 0 && z3) {
                        int i86 = 0;
                        while (i86 < size2) {
                            defpackage.dqx dqxVar9 = (defpackage.dqx) arrayList2.get(i86);
                            if (i16 == 0) {
                                dqxVar9.e(i28 - dqxVar9.b());
                            } else {
                                dqxVar9.e(i28 - dqxVar9.a());
                            }
                            i86++;
                            i82 = i82;
                        }
                    }
                    int i87 = i83;
                    defpackage.dqu dquVar23 = dquVar17;
                    defpackage.dqu dquVar24 = dquVar18;
                    int i88 = i84;
                    int i89 = i85;
                    int i90 = i82;
                    defpackage.dqu dquVar25 = dquVar;
                    int i91 = 0;
                    int iB2 = 0;
                    defpackage.dqu dquVar26 = dquVar16;
                    int iMax2 = 0;
                    while (i91 < size2) {
                        int i92 = size2 - 1;
                        defpackage.dqx dqxVar10 = (defpackage.dqx) arrayList2.get(i91);
                        if (i16 == 0) {
                            if (i91 < i92) {
                                dquVar24 = ((defpackage.dqx) arrayList2.get(i91 + 1)).a.U;
                                i89 = 0;
                            } else {
                                dquVar24 = dquVar18;
                                i89 = this.aO;
                            }
                            defpackage.dqu dquVar27 = dqxVar10.a.W;
                            dqxVar10.f(0, dquVar25, dquVar26, dquVar23, dquVar24, i90, i87, i88, i89, i28);
                            iB2 = java.lang.Math.max(iB2, dqxVar10.b());
                            iMax2 += dqxVar10.a();
                            if (i91 > 0) {
                                iMax2 += this.aD;
                            }
                            dquVar26 = dquVar27;
                            i19 = i16;
                            i87 = 0;
                        } else {
                            if (i91 < i92) {
                                dquVar23 = ((defpackage.dqx) arrayList2.get(i91 + 1)).a.T;
                                i88 = 0;
                            } else {
                                dquVar23 = dquVar17;
                                i88 = this.aS;
                            }
                            defpackage.dqu dquVar28 = dqxVar10.a.V;
                            i19 = i16;
                            dqxVar10.f(i19, dquVar25, dquVar26, dquVar23, dquVar24, i90, i87, i88, i89, i28);
                            iB2 += dqxVar10.b();
                            iMax2 = java.lang.Math.max(iMax2, dqxVar10.a());
                            if (i91 > 0) {
                                iB2 += this.aC;
                            }
                            dquVar25 = dquVar28;
                            i90 = 0;
                        }
                        i91++;
                        i16 = i19;
                    }
                    iArr[0] = iB2;
                    iArr[1] = iMax2;
                } else {
                    i6 = i25;
                    i7 = i26;
                    i8 = i27;
                    iArr = iArr2;
                    i9 = i37;
                }
            }
            c = 1;
        } else {
            i6 = i25;
            i7 = i26;
            i8 = i27;
            iArr = iArr2;
            i9 = i37;
            int i93 = this.aI;
            if (i5 != 0) {
                java.util.ArrayList arrayList3 = this.aY;
                if (arrayList3.size() == 0) {
                    dqxVar = new defpackage.dqx(this, i93, this.T, this.U, this.V, this.W, i28);
                    arrayList3.add(dqxVar);
                } else {
                    defpackage.dqx dqxVar11 = (defpackage.dqx) arrayList3.get(0);
                    dqxVar11.b = 0;
                    dqxVar11.a = null;
                    dqxVar11.c = 0;
                    dqxVar11.d = 0;
                    dqxVar11.e = 0;
                    dqxVar11.f = 0;
                    dqxVar11.g = 0;
                    dqxVar11.f(i93, this.T, this.U, this.V, this.W, this.aR, this.aN, this.aS, this.aO, i28);
                    dqxVar = dqxVar11;
                }
                for (int i94 = 0; i94 < i5; i94++) {
                    dqxVar.c(dqvVarArr2[i94]);
                }
                i33 = 0;
                iArr[0] = dqxVar.b();
                c = 1;
                iArr[1] = dqxVar.a();
            } else {
                c = 1;
            }
        }
        int iMin = iArr[i33] + i9 + i6;
        int iMin2 = iArr[c] + i7 + i8;
        if (i == 1073741824) {
            iMin = i2;
        } else if (i == Integer.MIN_VALUE) {
            iMin = java.lang.Math.min(iMin, i2);
        } else if (i != 0) {
            iMin = i33;
        }
        if (i3 == 1073741824) {
            iMin2 = i4;
        } else if (i3 == Integer.MIN_VALUE) {
            iMin2 = java.lang.Math.min(iMin2, i4);
        } else if (i3 != 0) {
            iMin2 = i33;
        }
        ai(iMin, iMin2);
        M(iMin);
        B(iMin2);
        this.aT = this.aM > 0 ? c : i33;
    }

    public final int c(defpackage.dqv dqvVar, int i) {
        defpackage.dqv dqvVar2;
        if (dqvVar == null) {
            return 0;
        }
        if (dqvVar.X() == 3) {
            int i2 = dqvVar.D;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (dqvVar.K * i);
                if (i3 != dqvVar.h()) {
                    dqvVar.r = true;
                    ak(dqvVar, dqvVar.W(), dqvVar.j(), 1, i3);
                }
                return i3;
            }
            dqvVar2 = dqvVar;
            if (i2 != 1 && i2 == 3) {
                return (int) ((dqvVar2.j() * dqvVar2.ah) + 0.5f);
            }
        } else {
            dqvVar2 = dqvVar;
        }
        return dqvVar2.h();
    }
}
