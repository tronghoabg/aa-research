package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cmd extends defpackage.clp {
    private static final defpackage.clw q = new defpackage.clq(6);
    public final defpackage.cmf d;
    public final float e;
    public final float f;
    public final defpackage.cme g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final defpackage.clw k;
    public final defpackage.affc l;
    public final defpackage.clw m;
    public final defpackage.clw n;
    public final defpackage.affc o;
    public final defpackage.clw p;
    private final boolean r;

    /* JADX WARN: Code duplicated, block: B:34:0x015b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public cmd(java.lang.String str, float[] fArr, defpackage.cmf cmfVar, float[] fArr2, defpackage.clw clwVar, defpackage.clw clwVar2, float f, float f2, defpackage.cme cmeVar, int i) {
        char c;
        char c2;
        char c3;
        float[] fArr3;
        defpackage.cmd cmdVar;
        double d;
        boolean z;
        super(str, 12884901888L, i);
        this.d = cmfVar;
        this.e = f;
        this.f = f2;
        this.g = cmeVar;
        this.k = clwVar;
        this.l = new defpackage.chq(this, 4);
        final int i2 = 1;
        this.m = new defpackage.clw() { // from class: cma
            @Override // defpackage.clw
            public final double a(double d2) {
                int i3 = i2;
                if (i3 == 0) {
                    defpackage.cmd cmdVar2 = (defpackage.cmd) this;
                    return cmdVar2.n.a(defpackage.afqt.a(d2, cmdVar2.e, cmdVar2.f));
                }
                if (i3 == 1) {
                    defpackage.cmd cmdVar3 = (defpackage.cmd) this;
                    return defpackage.afqt.a(cmdVar3.k.a(d2), cmdVar3.e, cmdVar3.f);
                }
                java.lang.Object obj = this;
                if (i3 != 2) {
                    defpackage.cme cmeVar2 = (defpackage.cme) obj;
                    double d3 = cmeVar2.a;
                    double d4 = cmeVar2.e;
                    return defpackage.dai.Z(d2, cmeVar2.b, cmeVar2.c, cmeVar2.d, d4, d3);
                }
                defpackage.cme cmeVar3 = (defpackage.cme) obj;
                double d5 = cmeVar3.a;
                double d6 = cmeVar3.e;
                return defpackage.dai.aa(d2, cmeVar3.b, cmeVar3.c, cmeVar3.d, d6, d5);
            }
        };
        this.n = clwVar2;
        this.o = new defpackage.chq(this, 5);
        final int i3 = 0;
        this.p = new defpackage.clw() { // from class: cma
            @Override // defpackage.clw
            public final double a(double d2) {
                int i4 = i3;
                if (i4 == 0) {
                    defpackage.cmd cmdVar2 = (defpackage.cmd) this;
                    return cmdVar2.n.a(defpackage.afqt.a(d2, cmdVar2.e, cmdVar2.f));
                }
                if (i4 == 1) {
                    defpackage.cmd cmdVar3 = (defpackage.cmd) this;
                    return defpackage.afqt.a(cmdVar3.k.a(d2), cmdVar3.e, cmdVar3.f);
                }
                java.lang.Object obj = this;
                if (i4 != 2) {
                    defpackage.cme cmeVar2 = (defpackage.cme) obj;
                    double d3 = cmeVar2.a;
                    double d4 = cmeVar2.e;
                    return defpackage.dai.Z(d2, cmeVar2.b, cmeVar2.c, cmeVar2.d, d4, d3);
                }
                defpackage.cme cmeVar3 = (defpackage.cme) obj;
                double d5 = cmeVar3.a;
                double d6 = cmeVar3.e;
                return defpackage.dai.aa(d2, cmeVar3.b, cmeVar3.c, cmeVar3.d, d6, d5);
            }
        };
        int length = fArr.length;
        if (f >= f2) {
            throw new java.lang.IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        float[] fArr4 = new float[6];
        defpackage.afga.cl(fArr, fArr4, 6, 6);
        this.h = fArr4;
        if (fArr2 == null) {
            float f3 = fArr4[0];
            float f4 = fArr4[1];
            float f5 = fArr4[2];
            float f6 = fArr4[3];
            float f7 = fArr4[4];
            float f8 = fArr4[5];
            c = 3;
            float f9 = cmfVar.a;
            c2 = 4;
            float f10 = cmfVar.b;
            float f11 = 1.0f - f3;
            float f12 = f11 / f4;
            float f13 = 1.0f - f5;
            float f14 = 1.0f - f7;
            float f15 = (1.0f - f9) / f10;
            float f16 = f3 / f4;
            float f17 = (f7 / f8) - f16;
            float f18 = (f5 / f6) - f16;
            float f19 = (f9 / f10) - f16;
            float f20 = (f13 / f6) - f12;
            float f21 = (((f15 - f12) * f18) - (f20 * f19)) / ((((f14 / f8) - f12) * f18) - (f17 * f20));
            float f22 = (f19 - (f17 * f21)) / f18;
            float f23 = (1.0f - f22) - f21;
            float f24 = f23 / f4;
            float f25 = f22 / f6;
            float f26 = f21 / f8;
            c3 = 1;
            fArr3 = new float[]{f3 * f24, f23, f24 * (f11 - f4), f5 * f25, f22, f25 * (f13 - f6), f7 * f26, f21, f26 * (f14 - f8)};
            this.i = fArr3;
        } else {
            c = 3;
            c2 = 4;
            c3 = 1;
            this.i = fArr2;
            fArr3 = fArr2;
        }
        this.j = defpackage.dai.ae(fArr3);
        float fX = defpackage.dai.X(fArr4);
        float[] fArr5 = defpackage.clr.a;
        if (fX / defpackage.dai.X(defpackage.clr.b) > 0.9f) {
            float f27 = fArr4[0];
            float f28 = fArr4[c3];
            float f29 = fArr4[2];
            float f30 = fArr4[c];
            float f31 = fArr4[c2];
            float f32 = fArr4[5];
        }
        if (i != 0) {
            float[] fArr6 = defpackage.clr.a;
            if (fArr4 == fArr6) {
                defpackage.cmf cmfVar2 = defpackage.clx.a;
                if (defpackage.dai.ac(cmfVar, defpackage.clx.d) && f == 0.0f && f2 == 1.0f) {
                    cmdVar = defpackage.clr.e;
                    d = 0.0d;
                    while (true) {
                        if (d <= 1.0d) {
                            z = c3;
                        } else if (defpackage.dai.Y(d, clwVar, cmdVar.k) && defpackage.dai.Y(d, clwVar2, cmdVar.n)) {
                            d += 0.00392156862745098d;
                        }
                    }
                }
            } else {
                int i4 = 0;
                while (true) {
                    if (i4 >= 6) {
                        defpackage.cmf cmfVar3 = defpackage.clx.a;
                        if (defpackage.dai.ac(cmfVar, defpackage.clx.d)) {
                            cmdVar = defpackage.clr.e;
                            d = 0.0d;
                            while (true) {
                                if (d <= 1.0d) {
                                    z = c3;
                                } else if (defpackage.dai.Y(d, clwVar, cmdVar.k)) {
                                    d += 0.00392156862745098d;
                                }
                            }
                        }
                    } else if (java.lang.Float.compare(fArr4[i4], fArr6[i4]) == 0 || java.lang.Math.abs(fArr4[i4] - fArr6[i4]) <= 0.001f) {
                        i4++;
                    }
                }
            }
            z = 0;
        } else {
            z = c3;
        }
        this.r = z;
    }

    @Override // defpackage.clp
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.clp
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.clp
    public final float c(float f, float f2, float f3) {
        defpackage.clw clwVar = this.p;
        float fA = (float) clwVar.a(f);
        float fA2 = (float) clwVar.a(f2);
        float fA3 = (float) clwVar.a(f3);
        float[] fArr = this.i;
        return (fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3);
    }

    @Override // defpackage.clp
    public final long d(float f, float f2, float f3) {
        defpackage.clw clwVar = this.p;
        float fA = (float) clwVar.a(f);
        float fA2 = (float) clwVar.a(f2);
        float fA3 = (float) clwVar.a(f3);
        float[] fArr = this.i;
        int length = fArr.length;
        float f4 = fArr[0] * fA;
        float f5 = fArr[3] * fA2;
        float f6 = fArr[6] * fA3;
        float f7 = fArr[1] * fA;
        float f8 = fArr[4] * fA2;
        return (((long) java.lang.Float.floatToRawIntBits(f7 + f8 + (fArr[7] * fA3))) & 4294967295L) | (java.lang.Float.floatToRawIntBits((f4 + f5) + f6) << 32);
    }

    @Override // defpackage.clp
    public final long e(float f, float f2, float f3, float f4, defpackage.clp clpVar) {
        float[] fArr = this.j;
        float f5 = fArr[0] * f;
        float f6 = fArr[3] * f2;
        float f7 = fArr[6] * f3;
        float f8 = fArr[1] * f;
        float f9 = fArr[4] * f2;
        float f10 = fArr[7] * f3;
        float f11 = fArr[2] * f;
        float f12 = fArr[5] * f2;
        float f13 = fArr[8] * f3;
        defpackage.clw clwVar = this.m;
        return defpackage.cjv.k((float) clwVar.a(f5 + f6 + f7), (float) clwVar.a(f8 + f9 + f10), (float) clwVar.a(f11 + f12 + f13), f4, clpVar);
    }

    @Override // defpackage.clp
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        defpackage.cmd cmdVar = (defpackage.cmd) obj;
        if (java.lang.Float.compare(cmdVar.e, this.e) != 0 || java.lang.Float.compare(cmdVar.f, this.f) != 0 || !defpackage.afga.f(this.d, cmdVar.d) || !java.util.Arrays.equals(this.h, cmdVar.h)) {
            return false;
        }
        defpackage.cme cmeVar = this.g;
        if (cmeVar != null) {
            return defpackage.afga.f(cmeVar, cmdVar.g);
        }
        if (cmdVar.g == null) {
            return true;
        }
        if (defpackage.afga.f(this.k, cmdVar.k)) {
            return defpackage.afga.f(this.n, cmdVar.n);
        }
        return false;
    }

    @Override // defpackage.clp
    public final boolean f() {
        return this.r;
    }

    @Override // defpackage.clp
    public final int hashCode() {
        int iHashCode = (((super.hashCode() * 31) + this.d.hashCode()) * 31) + java.util.Arrays.hashCode(this.h);
        float f = this.e;
        int iFloatToIntBits = ((iHashCode * 31) + (f == 0.0f ? 0 : java.lang.Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : java.lang.Float.floatToIntBits(f2))) * 31;
        defpackage.cme cmeVar = this.g;
        int iHashCode2 = iFloatToIntBits2 + (cmeVar != null ? cmeVar.hashCode() : 0);
        return cmeVar == null ? (((iHashCode2 * 31) + this.k.hashCode()) * 31) + this.n.hashCode() : iHashCode2;
    }

    public cmd(java.lang.String str, float[] fArr, defpackage.cmf cmfVar, final defpackage.cme cmeVar, int i) {
        defpackage.clw clwVar;
        defpackage.clw clwVar2;
        final int i2 = 3;
        if (cmeVar.a()) {
            clwVar = new defpackage.clw() { // from class: cmc
                @Override // defpackage.clw
                public final double a(double d) {
                    int i3 = i2;
                    if (i3 == 0) {
                        float[] fArr2 = defpackage.clr.a;
                        return defpackage.clr.c(cmeVar, d);
                    }
                    if (i3 == 1) {
                        float[] fArr3 = defpackage.clr.a;
                        return defpackage.clr.a(cmeVar, d);
                    }
                    if (i3 == 2) {
                        defpackage.cme cmeVar2 = cmeVar;
                        if (d < cmeVar2.e) {
                            return (cmeVar2.d * d) + cmeVar2.g;
                        }
                        double d2 = cmeVar2.a;
                        return java.lang.Math.pow((cmeVar2.b * d) + cmeVar2.c, d2) + cmeVar2.f;
                    }
                    if (i3 == 3) {
                        float[] fArr4 = defpackage.clr.a;
                        return defpackage.clr.b(cmeVar, d);
                    }
                    if (i3 == 4) {
                        float[] fArr5 = defpackage.clr.a;
                        return defpackage.clr.d(cmeVar, d);
                    }
                    defpackage.cme cmeVar3 = cmeVar;
                    double d3 = cmeVar3.e;
                    double d4 = cmeVar3.d;
                    if (d < d3 * d4) {
                        return (d - cmeVar3.g) / d4;
                    }
                    double d5 = cmeVar3.a;
                    double d6 = cmeVar3.f;
                    double d7 = cmeVar3.c;
                    return (java.lang.Math.pow(d - d6, 1.0d / d5) - d7) / cmeVar3.b;
                }
            };
        } else if (cmeVar.b()) {
            final int i3 = 4;
            clwVar = new defpackage.clw() { // from class: cmc
                @Override // defpackage.clw
                public final double a(double d) {
                    int i4 = i3;
                    if (i4 == 0) {
                        float[] fArr2 = defpackage.clr.a;
                        return defpackage.clr.c(cmeVar, d);
                    }
                    if (i4 == 1) {
                        float[] fArr3 = defpackage.clr.a;
                        return defpackage.clr.a(cmeVar, d);
                    }
                    if (i4 == 2) {
                        defpackage.cme cmeVar2 = cmeVar;
                        if (d < cmeVar2.e) {
                            return (cmeVar2.d * d) + cmeVar2.g;
                        }
                        double d2 = cmeVar2.a;
                        return java.lang.Math.pow((cmeVar2.b * d) + cmeVar2.c, d2) + cmeVar2.f;
                    }
                    if (i4 == 3) {
                        float[] fArr4 = defpackage.clr.a;
                        return defpackage.clr.b(cmeVar, d);
                    }
                    if (i4 == 4) {
                        float[] fArr5 = defpackage.clr.a;
                        return defpackage.clr.d(cmeVar, d);
                    }
                    defpackage.cme cmeVar3 = cmeVar;
                    double d3 = cmeVar3.e;
                    double d4 = cmeVar3.d;
                    if (d < d3 * d4) {
                        return (d - cmeVar3.g) / d4;
                    }
                    double d5 = cmeVar3.a;
                    double d6 = cmeVar3.f;
                    double d7 = cmeVar3.c;
                    return (java.lang.Math.pow(d - d6, 1.0d / d5) - d7) / cmeVar3.b;
                }
            };
        } else if (cmeVar.f == 0.0d && cmeVar.g == 0.0d) {
            clwVar = new defpackage.clw() { // from class: cma
                @Override // defpackage.clw
                public final double a(double d2) {
                    int i4 = i2;
                    if (i4 == 0) {
                        defpackage.cmd cmdVar2 = (defpackage.cmd) cmeVar;
                        return cmdVar2.n.a(defpackage.afqt.a(d2, cmdVar2.e, cmdVar2.f));
                    }
                    if (i4 == 1) {
                        defpackage.cmd cmdVar3 = (defpackage.cmd) cmeVar;
                        return defpackage.afqt.a(cmdVar3.k.a(d2), cmdVar3.e, cmdVar3.f);
                    }
                    java.lang.Object obj = cmeVar;
                    if (i4 != 2) {
                        defpackage.cme cmeVar2 = (defpackage.cme) obj;
                        double d3 = cmeVar2.a;
                        double d4 = cmeVar2.e;
                        return defpackage.dai.Z(d2, cmeVar2.b, cmeVar2.c, cmeVar2.d, d4, d3);
                    }
                    defpackage.cme cmeVar3 = (defpackage.cme) obj;
                    double d5 = cmeVar3.a;
                    double d6 = cmeVar3.e;
                    return defpackage.dai.aa(d2, cmeVar3.b, cmeVar3.c, cmeVar3.d, d6, d5);
                }
            };
        } else {
            final int i4 = 5;
            clwVar = new defpackage.clw() { // from class: cmc
                @Override // defpackage.clw
                public final double a(double d) {
                    int i5 = i4;
                    if (i5 == 0) {
                        float[] fArr2 = defpackage.clr.a;
                        return defpackage.clr.c(cmeVar, d);
                    }
                    if (i5 == 1) {
                        float[] fArr3 = defpackage.clr.a;
                        return defpackage.clr.a(cmeVar, d);
                    }
                    if (i5 == 2) {
                        defpackage.cme cmeVar2 = cmeVar;
                        if (d < cmeVar2.e) {
                            return (cmeVar2.d * d) + cmeVar2.g;
                        }
                        double d2 = cmeVar2.a;
                        return java.lang.Math.pow((cmeVar2.b * d) + cmeVar2.c, d2) + cmeVar2.f;
                    }
                    if (i5 == 3) {
                        float[] fArr4 = defpackage.clr.a;
                        return defpackage.clr.b(cmeVar, d);
                    }
                    if (i5 == 4) {
                        float[] fArr5 = defpackage.clr.a;
                        return defpackage.clr.d(cmeVar, d);
                    }
                    defpackage.cme cmeVar3 = cmeVar;
                    double d3 = cmeVar3.e;
                    double d4 = cmeVar3.d;
                    if (d < d3 * d4) {
                        return (d - cmeVar3.g) / d4;
                    }
                    double d5 = cmeVar3.a;
                    double d6 = cmeVar3.f;
                    double d7 = cmeVar3.c;
                    return (java.lang.Math.pow(d - d6, 1.0d / d5) - d7) / cmeVar3.b;
                }
            };
        }
        defpackage.clw clwVar3 = clwVar;
        if (cmeVar.a()) {
            final int i5 = 1;
            clwVar2 = new defpackage.clw() { // from class: cmc
                @Override // defpackage.clw
                public final double a(double d) {
                    int i6 = i5;
                    if (i6 == 0) {
                        float[] fArr2 = defpackage.clr.a;
                        return defpackage.clr.c(cmeVar, d);
                    }
                    if (i6 == 1) {
                        float[] fArr3 = defpackage.clr.a;
                        return defpackage.clr.a(cmeVar, d);
                    }
                    if (i6 == 2) {
                        defpackage.cme cmeVar2 = cmeVar;
                        if (d < cmeVar2.e) {
                            return (cmeVar2.d * d) + cmeVar2.g;
                        }
                        double d2 = cmeVar2.a;
                        return java.lang.Math.pow((cmeVar2.b * d) + cmeVar2.c, d2) + cmeVar2.f;
                    }
                    if (i6 == 3) {
                        float[] fArr4 = defpackage.clr.a;
                        return defpackage.clr.b(cmeVar, d);
                    }
                    if (i6 == 4) {
                        float[] fArr5 = defpackage.clr.a;
                        return defpackage.clr.d(cmeVar, d);
                    }
                    defpackage.cme cmeVar3 = cmeVar;
                    double d3 = cmeVar3.e;
                    double d4 = cmeVar3.d;
                    if (d < d3 * d4) {
                        return (d - cmeVar3.g) / d4;
                    }
                    double d5 = cmeVar3.a;
                    double d6 = cmeVar3.f;
                    double d7 = cmeVar3.c;
                    return (java.lang.Math.pow(d - d6, 1.0d / d5) - d7) / cmeVar3.b;
                }
            };
        } else if (cmeVar.b()) {
            final int i6 = 0;
            clwVar2 = new defpackage.clw() { // from class: cmc
                @Override // defpackage.clw
                public final double a(double d) {
                    int i7 = i6;
                    if (i7 == 0) {
                        float[] fArr2 = defpackage.clr.a;
                        return defpackage.clr.c(cmeVar, d);
                    }
                    if (i7 == 1) {
                        float[] fArr3 = defpackage.clr.a;
                        return defpackage.clr.a(cmeVar, d);
                    }
                    if (i7 == 2) {
                        defpackage.cme cmeVar2 = cmeVar;
                        if (d < cmeVar2.e) {
                            return (cmeVar2.d * d) + cmeVar2.g;
                        }
                        double d2 = cmeVar2.a;
                        return java.lang.Math.pow((cmeVar2.b * d) + cmeVar2.c, d2) + cmeVar2.f;
                    }
                    if (i7 == 3) {
                        float[] fArr4 = defpackage.clr.a;
                        return defpackage.clr.b(cmeVar, d);
                    }
                    if (i7 == 4) {
                        float[] fArr5 = defpackage.clr.a;
                        return defpackage.clr.d(cmeVar, d);
                    }
                    defpackage.cme cmeVar3 = cmeVar;
                    double d3 = cmeVar3.e;
                    double d4 = cmeVar3.d;
                    if (d < d3 * d4) {
                        return (d - cmeVar3.g) / d4;
                    }
                    double d5 = cmeVar3.a;
                    double d6 = cmeVar3.f;
                    double d7 = cmeVar3.c;
                    return (java.lang.Math.pow(d - d6, 1.0d / d5) - d7) / cmeVar3.b;
                }
            };
        } else {
            final int i7 = 2;
            if (cmeVar.f == 0.0d && cmeVar.g == 0.0d) {
                clwVar2 = new defpackage.clw() { // from class: cma
                    @Override // defpackage.clw
                    public final double a(double d2) {
                        int i8 = i7;
                        if (i8 == 0) {
                            defpackage.cmd cmdVar2 = (defpackage.cmd) cmeVar;
                            return cmdVar2.n.a(defpackage.afqt.a(d2, cmdVar2.e, cmdVar2.f));
                        }
                        if (i8 == 1) {
                            defpackage.cmd cmdVar3 = (defpackage.cmd) cmeVar;
                            return defpackage.afqt.a(cmdVar3.k.a(d2), cmdVar3.e, cmdVar3.f);
                        }
                        java.lang.Object obj = cmeVar;
                        if (i8 != 2) {
                            defpackage.cme cmeVar2 = (defpackage.cme) obj;
                            double d3 = cmeVar2.a;
                            double d4 = cmeVar2.e;
                            return defpackage.dai.Z(d2, cmeVar2.b, cmeVar2.c, cmeVar2.d, d4, d3);
                        }
                        defpackage.cme cmeVar3 = (defpackage.cme) obj;
                        double d5 = cmeVar3.a;
                        double d6 = cmeVar3.e;
                        return defpackage.dai.aa(d2, cmeVar3.b, cmeVar3.c, cmeVar3.d, d6, d5);
                    }
                };
            } else {
                clwVar2 = new defpackage.clw() { // from class: cmc
                    @Override // defpackage.clw
                    public final double a(double d) {
                        int i8 = i7;
                        if (i8 == 0) {
                            float[] fArr2 = defpackage.clr.a;
                            return defpackage.clr.c(cmeVar, d);
                        }
                        if (i8 == 1) {
                            float[] fArr3 = defpackage.clr.a;
                            return defpackage.clr.a(cmeVar, d);
                        }
                        if (i8 == 2) {
                            defpackage.cme cmeVar2 = cmeVar;
                            if (d < cmeVar2.e) {
                                return (cmeVar2.d * d) + cmeVar2.g;
                            }
                            double d2 = cmeVar2.a;
                            return java.lang.Math.pow((cmeVar2.b * d) + cmeVar2.c, d2) + cmeVar2.f;
                        }
                        if (i8 == 3) {
                            float[] fArr4 = defpackage.clr.a;
                            return defpackage.clr.b(cmeVar, d);
                        }
                        if (i8 == 4) {
                            float[] fArr5 = defpackage.clr.a;
                            return defpackage.clr.d(cmeVar, d);
                        }
                        defpackage.cme cmeVar3 = cmeVar;
                        double d3 = cmeVar3.e;
                        double d4 = cmeVar3.d;
                        if (d < d3 * d4) {
                            return (d - cmeVar3.g) / d4;
                        }
                        double d5 = cmeVar3.a;
                        double d6 = cmeVar3.f;
                        double d7 = cmeVar3.c;
                        return (java.lang.Math.pow(d - d6, 1.0d / d5) - d7) / cmeVar3.b;
                    }
                };
            }
        }
        this(str, fArr, cmfVar, null, clwVar3, clwVar2, 0.0f, 1.0f, cmeVar, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public cmd(java.lang.String str, float[] fArr, defpackage.cmf cmfVar, final double d, float f, float f2, int i) {
        defpackage.clw clwVar;
        defpackage.clw clwVar2;
        if (d == 1.0d) {
            clwVar = q;
        } else {
            final int i2 = 1;
            clwVar = new defpackage.clw() { // from class: cmb
                @Override // defpackage.clw
                public final double a(double d2) {
                    if (i2 != 0) {
                        if (d2 < 0.0d) {
                            d2 = 0.0d;
                        }
                        return java.lang.Math.pow(d2, 1.0d / d);
                    }
                    double d3 = d;
                    if (d2 < 0.0d) {
                        d2 = 0.0d;
                    }
                    return java.lang.Math.pow(d2, d3);
                }
            };
        }
        defpackage.clw clwVar3 = clwVar;
        if (d == 1.0d) {
            clwVar2 = q;
        } else {
            final int i3 = 0;
            clwVar2 = new defpackage.clw() { // from class: cmb
                @Override // defpackage.clw
                public final double a(double d2) {
                    if (i3 != 0) {
                        if (d2 < 0.0d) {
                            d2 = 0.0d;
                        }
                        return java.lang.Math.pow(d2, 1.0d / d);
                    }
                    double d3 = d;
                    if (d2 < 0.0d) {
                        d2 = 0.0d;
                    }
                    return java.lang.Math.pow(d2, d3);
                }
            };
        }
        this(str, fArr, cmfVar, null, clwVar3, clwVar2, f, f2, new defpackage.cme(d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
