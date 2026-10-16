package defpackage;

/* loaded from: classes.dex */
public final class agx implements agq {
    public final int a;
    private final zf b;
    private final zh c;
    private final aes d;
    private int[] e = agp.a;
    private float[] f;
    private aei g;
    private aei h;
    private aei i;
    private aei j;
    private float[] k;
    private float[] l;
    private kwp m;

    public agx(zf zfVar, zh zhVar, int i, aes aesVar) {
        this.b = zfVar;
        this.c = zhVar;
        this.a = i;
        this.d = aesVar;
        float[] fArr = agp.b;
        this.f = fArr;
        this.k = fArr;
        this.l = fArr;
        this.m = agp.c;
    }

    private final float h(int i) {
        return i(j(i), i, false);
    }

    private final float i(int i, int i2, boolean z) {
        aes aesVar;
        float f;
        zf zfVar = this.b;
        if (i >= zfVar.b - 1) {
            f = i2;
        } else {
            int iA = zfVar.a(i);
            int iA2 = zfVar.a(i + 1);
            if (i2 == iA) {
                f = iA;
            } else {
                int i3 = iA2 - iA;
                agw agwVar = (agw) this.c.a(iA);
                if (agwVar == null || (aesVar = agwVar.b) == null) {
                    aesVar = this.d;
                }
                float f2 = i3;
                float fA = aesVar.a((i2 - iA) / f2);
                if (z) {
                    return fA;
                }
                f = (f2 * fA) + iA;
            }
        }
        return f / 1000.0f;
    }

    private final int j(int i) {
        int i2;
        zf zfVar = this.b;
        int i3 = zfVar.b;
        if (i3 < 0) {
            throw new IndexOutOfBoundsException(a.bo(i3, i3, "fromIndex (0) and toIndex (", ") must be in range 0.."));
        }
        int i4 = i3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = zfVar.a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = -(i5 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb A[LOOP:5: B:37:0x00b9->B:38:0x00bb, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void k(defpackage.aei r10, defpackage.aei r11, defpackage.aei r12) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agx.k(aei, aei, aei):void");
    }

    @Override // defpackage.agn
    public final /* synthetic */ long a(aei aeiVar, aei aeiVar2, aei aeiVar3) {
        return afp.n(this);
    }

    @Override // defpackage.agn
    public final /* synthetic */ aei b(aei aeiVar, aei aeiVar2, aei aeiVar3) {
        return d(afp.n(this), aeiVar, aeiVar2, aeiVar3);
    }

    @Override // defpackage.agn
    public final aei c(long j, aei aeiVar, aei aeiVar2, aei aeiVar3) {
        aei aeiVar4;
        aei aeiVar5;
        int iA = (int) agp.a(this, j / 1000000);
        zh zhVar = this.c;
        agw agwVar = (agw) zhVar.a(iA);
        if (agwVar != null) {
            return agwVar.a;
        }
        if (iA >= this.a) {
            return aeiVar2;
        }
        if (iA <= 0) {
            return aeiVar;
        }
        k(aeiVar, aeiVar2, aeiVar3);
        aei aeiVar6 = this.g;
        aeiVar6.getClass();
        int i = 0;
        if (this.m != agp.c) {
            float fH = h(iA);
            float[] fArr = this.k;
            ael[][] aelVarArr = (ael[][]) this.m.a;
            int length = aelVarArr.length;
            float f = aelVarArr[0][0].a;
            int i2 = length - 1;
            float f2 = aelVarArr[i2][0].b;
            int length2 = fArr.length;
            if (fH >= f && fH <= f2) {
                boolean z = false;
                for (ael[] aelVarArr2 : aelVarArr) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < length2 - 1; i4 += 2) {
                        ael aelVar = aelVarArr2[i3];
                        if (fH <= aelVar.b) {
                            int i5 = i4 + 1;
                            if (aelVar.g) {
                                fArr[i4] = aelVar.c(fH);
                                fArr[i5] = aelVar.d(fH);
                            } else {
                                aelVar.e(fH);
                                fArr[i4] = aelVar.h + (aelVar.e * aelVar.c);
                                fArr[i5] = aelVar.i + (aelVar.f * aelVar.d);
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
                    ael aelVar2 = aelVarArr[i2][i8];
                    if (aelVar2.g) {
                        fArr[i7] = aelVar2.c(f) + (aelVar2.h * f3);
                        fArr[i9] = aelVar2.d(f) + (aelVar2.i * f3);
                    } else {
                        aelVar2.e(f);
                        fArr[i7] = aelVar2.h + (aelVar2.e * aelVar2.c) + (aelVar2.a() * f3);
                        fArr[i9] = aelVar2.i + (aelVar2.f * aelVar2.d) + (aelVar2.b() * f3);
                    }
                    i7 += 2;
                    i8++;
                }
            }
            int length3 = fArr.length;
            while (i < length3) {
                aeiVar6.e(i, fArr[i]);
                i++;
            }
        } else {
            int iJ = j(iA);
            float fI = i(iJ, iA, true);
            zf zfVar = this.b;
            agw agwVar2 = (agw) zhVar.a(zfVar.a(iJ));
            if (agwVar2 != null && (aeiVar5 = agwVar2.a) != null) {
                aeiVar = aeiVar5;
            }
            agw agwVar3 = (agw) zhVar.a(zfVar.a(iJ + 1));
            if (agwVar3 != null && (aeiVar4 = agwVar3.a) != null) {
                aeiVar2 = aeiVar4;
            }
            int iB = aeiVar6.b();
            while (i < iB) {
                aeiVar6.e(i, (aeiVar.a(i) * (1.0f - fI)) + (aeiVar2.a(i) * fI));
                i++;
            }
        }
        return aeiVar6;
    }

    @Override // defpackage.agn
    public final aei d(long j, aei aeiVar, aei aeiVar2, aei aeiVar3) {
        long jA = agp.a(this, j / 1000000);
        if (jA < 0) {
            return aeiVar3;
        }
        k(aeiVar, aeiVar2, aeiVar3);
        aei aeiVar4 = this.h;
        aeiVar4.getClass();
        int i = 0;
        if (this.m != agp.c) {
            float fH = h((int) jA);
            float[] fArr = this.l;
            ael[][] aelVarArr = (ael[][]) this.m.a;
            float f = aelVarArr[0][0].a;
            float f2 = aelVarArr[aelVarArr.length - 1][0].b;
            if (fH < f) {
                fH = f;
            }
            if (fH <= f2) {
                f2 = fH;
            }
            int length = fArr.length;
            boolean z = false;
            for (ael[] aelVarArr2 : aelVarArr) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < length - 1) {
                    ael aelVar = aelVarArr2[i3];
                    if (f2 <= aelVar.b) {
                        int i4 = i2 + 1;
                        if (aelVar.g) {
                            fArr[i2] = aelVar.h;
                            fArr[i4] = aelVar.i;
                        } else {
                            aelVar.e(f2);
                            fArr[i2] = aelVar.a();
                            fArr[i4] = aelVar.b();
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
                aeiVar4.e(i, fArr[i]);
                i++;
            }
        } else {
            aei aeiVarC = c(((-1) + jA) * 1000000, aeiVar, aeiVar2, aeiVar3);
            aei aeiVarC2 = c(jA * 1000000, aeiVar, aeiVar2, aeiVar3);
            int iB = aeiVarC.b();
            while (i < iB) {
                aeiVar4.e(i, (aeiVarC.a(i) - aeiVarC2.a(i)) * 1000.0f);
                i++;
            }
        }
        return aeiVar4;
    }

    @Override // defpackage.agn
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // defpackage.agq
    public final int f() {
        return 0;
    }

    @Override // defpackage.agq
    public final int g() {
        return this.a;
    }
}
