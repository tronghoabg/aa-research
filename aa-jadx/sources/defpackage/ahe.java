package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ahe implements defpackage.agx {
    public final int a;
    private final defpackage.zm b;
    private final defpackage.zo c;
    private final defpackage.aez d;
    private int[] e = defpackage.agw.a;
    private float[] f;
    private defpackage.aep g;
    private defpackage.aep h;
    private defpackage.aep i;
    private defpackage.aep j;
    private float[] k;
    private float[] l;
    private defpackage.kwv m;

    public ahe(defpackage.zm zmVar, defpackage.zo zoVar, int i, defpackage.aez aezVar) {
        this.b = zmVar;
        this.c = zoVar;
        this.a = i;
        this.d = aezVar;
        float[] fArr = defpackage.agw.b;
        this.f = fArr;
        this.k = fArr;
        this.l = fArr;
        this.m = defpackage.agw.c;
    }

    private final float h(int i) {
        return i(j(i), i, false);
    }

    private final float i(int i, int i2, boolean z) {
        defpackage.aez aezVar;
        float f;
        defpackage.zm zmVar = this.b;
        if (i >= zmVar.b - 1) {
            f = i2;
        } else {
            int iA = zmVar.a(i);
            int iA2 = zmVar.a(i + 1);
            if (i2 == iA) {
                f = iA;
            } else {
                int i3 = iA2 - iA;
                defpackage.ahd ahdVar = (defpackage.ahd) this.c.a(iA);
                if (ahdVar == null || (aezVar = ahdVar.b) == null) {
                    aezVar = this.d;
                }
                float f2 = i3;
                float fA = aezVar.a((i2 - iA) / f2);
                if (z) {
                    return fA;
                }
                f = (f2 * fA) + iA;
            }
        }
        return f / 1000.0f;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX WARN: Code duplicated, block: B:15:0x0026 A[RETURN] */
    private final int j(int i) {
        int i2;
        defpackage.zm zmVar = this.b;
        int i3 = zmVar.b;
        if (i3 < 0) {
            throw new java.lang.IndexOutOfBoundsException(defpackage.a.bn(i3, i3, "fromIndex (0) and toIndex (", ") must be in range 0.."));
        }
        int i4 = i3 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            i2 = (i5 + i4) >>> 1;
            int i6 = zmVar.a[i2];
            if (i6 < i) {
                i5 = i2 + 1;
            } else {
                if (i6 <= i) {
                    if (i2 < -1) {
                        return -(i2 + 2);
                    }
                    return i2;
                }
                i4 = i2 - 1;
            }
        }
        i2 = -(i5 + 1);
        if (i2 < -1) {
            return -(i2 + 2);
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bb A[LOOP:5: B:37:0x00b9->B:38:0x00bb, LOOP_END] */
    private final void k(defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        float[] fArr;
        int i;
        defpackage.kwv kwvVar = this.m;
        defpackage.kwv kwvVar2 = defpackage.agw.c;
        if (this.g == null) {
            this.g = aepVar.c();
            this.h = aepVar3.c();
            defpackage.zm zmVar = this.b;
            int i2 = zmVar.b;
            float[] fArr2 = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr2[i3] = zmVar.a(i3) / 1000.0f;
            }
            this.f = fArr2;
            int i4 = zmVar.b;
            int[] iArr = new int[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                iArr[i5] = 0;
            }
            this.e = iArr;
        }
        if (kwvVar == kwvVar2) {
            return;
        }
        if (this.m != kwvVar2 && defpackage.afga.f(this.i, aepVar) && defpackage.afga.f(this.j, aepVar2)) {
            return;
        }
        this.i = aepVar;
        this.j = aepVar2;
        int iB = (aepVar.b() & 1) + aepVar.b();
        this.k = new float[iB];
        this.l = new float[iB];
        defpackage.zm zmVar2 = this.b;
        int i6 = zmVar2.b;
        float[][] fArr3 = new float[i6][];
        for (int i7 = 0; i7 < i6; i7++) {
            int iA = zmVar2.a(i7);
            defpackage.ahd ahdVar = (defpackage.ahd) this.c.a(iA);
            if (iA != 0) {
                if (iA == this.a || ahdVar != null) {
                    ahdVar.getClass();
                    fArr = new float[iB];
                    for (i = 0; i < iB; i++) {
                        fArr[i] = ahdVar.a.a(i);
                    }
                } else {
                    fArr = new float[iB];
                    for (int i8 = 0; i8 < iB; i8++) {
                        fArr[i8] = aepVar2.a(i8);
                    }
                }
            } else if (ahdVar == null) {
                fArr = new float[iB];
                for (int i9 = 0; i9 < iB; i9++) {
                    fArr[i9] = aepVar.a(i9);
                }
            } else {
                iA = 0;
                if (iA == this.a) {
                    ahdVar.getClass();
                    fArr = new float[iB];
                    while (i < iB) {
                        fArr[i] = ahdVar.a.a(i);
                    }
                } else {
                    ahdVar.getClass();
                    fArr = new float[iB];
                    while (i < iB) {
                        fArr[i] = ahdVar.a.a(i);
                    }
                }
            }
            fArr3[i7] = fArr;
        }
        this.m = new defpackage.kwv(this.e, this.f, fArr3);
    }

    @Override // defpackage.agu
    public final /* synthetic */ long a(defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        return defpackage.afw.n(this);
    }

    @Override // defpackage.agu
    public final /* synthetic */ defpackage.aep b(defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        return d(defpackage.afw.n(this), aepVar, aepVar2, aepVar3);
    }

    @Override // defpackage.agu
    public final defpackage.aep c(long j, defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        defpackage.aep aepVar4;
        defpackage.aep aepVar5;
        int iA = (int) defpackage.agw.a(this, j / 1000000);
        defpackage.zo zoVar = this.c;
        defpackage.ahd ahdVar = (defpackage.ahd) zoVar.a(iA);
        if (ahdVar != null) {
            return ahdVar.a;
        }
        if (iA >= this.a) {
            return aepVar2;
        }
        if (iA <= 0) {
            return aepVar;
        }
        k(aepVar, aepVar2, aepVar3);
        defpackage.aep aepVar6 = this.g;
        aepVar6.getClass();
        int i = 0;
        if (this.m != defpackage.agw.c) {
            float fH = h(iA);
            float[] fArr = this.k;
            defpackage.aes[][] aesVarArr = (defpackage.aes[][]) this.m.a;
            int length = aesVarArr.length;
            float f = aesVarArr[0][0].a;
            int i2 = length - 1;
            float f2 = aesVarArr[i2][0].b;
            int length2 = fArr.length;
            if (fH >= f && fH <= f2) {
                boolean z = false;
                for (defpackage.aes[] aesVarArr2 : aesVarArr) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < length2 - 1; i4 += 2) {
                        defpackage.aes aesVar = aesVarArr2[i3];
                        if (fH <= aesVar.b) {
                            int i5 = i4 + 1;
                            if (aesVar.g) {
                                fArr[i4] = aesVar.c(fH);
                                fArr[i5] = aesVar.d(fH);
                            } else {
                                aesVar.e(fH);
                                fArr[i4] = aesVar.h + (aesVar.e * aesVar.c);
                                fArr[i5] = aesVar.i + (aesVar.f * aesVar.d);
                            }
                            z = true;
                        }
                        i3++;
                    }
                    if (z) {
                        break;
                    }
                }
            } else {
                int i6 = length2 - 1;
                if (fH > f2) {
                    f = f2;
                }
                if (fH <= f2) {
                    i2 = 0;
                }
                float f3 = fH - f;
                int i7 = 0;
                int i8 = 0;
                while (i7 < i6) {
                    int i9 = i7 + 1;
                    defpackage.aes aesVar2 = aesVarArr[i2][i8];
                    if (aesVar2.g) {
                        fArr[i7] = aesVar2.c(f) + (aesVar2.h * f3);
                        fArr[i9] = aesVar2.d(f) + (aesVar2.i * f3);
                    } else {
                        aesVar2.e(f);
                        fArr[i7] = aesVar2.h + (aesVar2.e * aesVar2.c) + (aesVar2.a() * f3);
                        fArr[i9] = aesVar2.i + (aesVar2.f * aesVar2.d) + (aesVar2.b() * f3);
                    }
                    i7 += 2;
                    i8++;
                }
            }
            int length3 = fArr.length;
            while (i < length3) {
                aepVar6.e(i, fArr[i]);
                i++;
            }
        } else {
            int iJ = j(iA);
            float fI = i(iJ, iA, true);
            defpackage.zm zmVar = this.b;
            defpackage.ahd ahdVar2 = (defpackage.ahd) zoVar.a(zmVar.a(iJ));
            if (ahdVar2 != null && (aepVar5 = ahdVar2.a) != null) {
                aepVar = aepVar5;
            }
            defpackage.ahd ahdVar3 = (defpackage.ahd) zoVar.a(zmVar.a(iJ + 1));
            if (ahdVar3 != null && (aepVar4 = ahdVar3.a) != null) {
                aepVar2 = aepVar4;
            }
            int iB = aepVar6.b();
            while (i < iB) {
                aepVar6.e(i, (aepVar.a(i) * (1.0f - fI)) + (aepVar2.a(i) * fI));
                i++;
            }
        }
        return aepVar6;
    }

    @Override // defpackage.agu
    public final defpackage.aep d(long j, defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        long jA = defpackage.agw.a(this, j / 1000000);
        if (jA < 0) {
            return aepVar3;
        }
        k(aepVar, aepVar2, aepVar3);
        defpackage.aep aepVar4 = this.h;
        aepVar4.getClass();
        int i = 0;
        if (this.m != defpackage.agw.c) {
            float fH = h((int) jA);
            float[] fArr = this.l;
            defpackage.aes[][] aesVarArr = (defpackage.aes[][]) this.m.a;
            float f = aesVarArr[0][0].a;
            float f2 = aesVarArr[aesVarArr.length - 1][0].b;
            if (fH < f) {
                fH = f;
            }
            if (fH <= f2) {
                f2 = fH;
            }
            int length = fArr.length;
            boolean z = false;
            for (defpackage.aes[] aesVarArr2 : aesVarArr) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < length - 1) {
                    defpackage.aes aesVar = aesVarArr2[i3];
                    if (f2 <= aesVar.b) {
                        int i4 = i2 + 1;
                        if (aesVar.g) {
                            fArr[i2] = aesVar.h;
                            fArr[i4] = aesVar.i;
                        } else {
                            aesVar.e(f2);
                            fArr[i2] = aesVar.a();
                            fArr[i4] = aesVar.b();
                        }
                        z = true;
                    }
                    i2 += 2;
                    i3++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                aepVar4.e(i, fArr[i]);
                i++;
            }
        } else {
            defpackage.aep aepVarC = c(((-1) + jA) * 1000000, aepVar, aepVar2, aepVar3);
            defpackage.aep aepVarC2 = c(jA * 1000000, aepVar, aepVar2, aepVar3);
            int iB = aepVarC.b();
            while (i < iB) {
                aepVar4.e(i, (aepVarC.a(i) - aepVarC2.a(i)) * 1000.0f);
                i++;
            }
        }
        return aepVar4;
    }

    @Override // defpackage.agu
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // defpackage.agx
    public final int f() {
        return 0;
    }

    @Override // defpackage.agx
    public final int g() {
        return this.a;
    }
}
