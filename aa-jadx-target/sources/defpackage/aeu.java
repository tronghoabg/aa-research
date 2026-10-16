package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aeu implements defpackage.aez {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;

    public aeu(float f, float f2, float f3, float f4) {
        int iB;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (java.lang.Float.isNaN(f) || java.lang.Float.isNaN(f2) || java.lang.Float.isNaN(f3) || java.lang.Float.isNaN(f4)) {
            defpackage.afw.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f2 + ", " + f3 + ", " + f4 + ".");
        }
        float[] fArr = new float[5];
        float f5 = (f4 - f2) * 3.0f;
        double d = f5;
        float f6 = (f2 + 0.0f) * 3.0f;
        double d2 = f6;
        double d3 = d + d;
        float f7 = (1.0f - f4) * 3.0f;
        double d4 = f7;
        double d5 = (d2 - d3) + d4;
        if (d5 == 0.0d) {
            iB = d == d4 ? 0 : defpackage.cjv.b((float) ((d3 - d4) / (d3 - (d4 + d4))), fArr, 0);
        } else {
            double d6 = -java.lang.Math.sqrt((d * d) - (d4 * d2));
            double d7 = (-d2) + d;
            int iB2 = defpackage.cjv.b((float) ((-(d6 + d7)) / d5), fArr, 0);
            iB = defpackage.cjv.b((float) ((d6 - d7) / d5), fArr, iB2) + iB2;
            if (iB > 1) {
                float f8 = fArr[0];
                float f9 = fArr[1];
                if (f8 > f9) {
                    fArr[0] = f9;
                    fArr[1] = f8;
                } else if (f8 == f9) {
                    iB = 1;
                }
            }
        }
        float f10 = f5 - f6;
        float f11 = f7 - f5;
        float f12 = f10 + f10;
        int iB3 = iB + defpackage.cjv.b((-f12) / ((f11 + f11) - f12), fArr, iB);
        float fMin = 0.0f;
        float fMax = 1.0f;
        for (int i = 0; i < iB3; i++) {
            float f13 = fArr[i];
            float f14 = ((((((((f2 - f4) * 3.0f) + 1.0f + 0.0f) * f13) + (((f4 - (f2 + f2)) + 0.0f) * 3.0f)) * f13) + f6) * f13) + 0.0f;
            fMin = java.lang.Math.min(fMin, f14);
            fMax = java.lang.Math.max(fMax, f14);
        }
        long jAK = defpackage.tna.aK(fMin, fMax);
        this.e = java.lang.Float.intBitsToFloat((int) (jAK >> 32));
        this.f = java.lang.Float.intBitsToFloat((int) (jAK & 4294967295L));
    }

    /* JADX WARN: Code duplicated, block: B:127:0x022f A[PHI: r3
  0x022f: PHI (r3v19 float) = (r3v6 float), (r3v12 float), (r3v17 float), (r3v25 float), (r3v30 float) binds: [B:125:0x022b, B:114:0x01fa, B:89:0x01ad, B:45:0x00da, B:22:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0069  */
    @Override // defpackage.aez
    public final float a(float f) {
        float f2;
        float f3;
        if (f <= 0.0f || f >= 1.0f) {
            return f;
        }
        float fMax = java.lang.Math.max(f, 1.1920929E-7f);
        float f4 = -fMax;
        float f5 = this.a;
        float f6 = f5 - fMax;
        float f7 = this.c;
        float f8 = f7 - fMax;
        double d = ((double) (-f4)) + (((double) (f6 - f8)) * 3.0d) + ((double) (1.0f - fMax));
        float f9 = 0.0f;
        double d2 = f4;
        double d3 = ((double) (f6 - f4)) * 3.0d;
        double d4 = f6;
        double d5 = ((d2 - (d4 + d4)) + ((double) f8)) * 3.0d;
        if (java.lang.Math.abs(d + 0.0d) >= 1.0E-7d) {
            double d6 = d5 / d;
            double d7 = d3 / d;
            double d8 = d2 / d;
            double d9 = d6 / 3.0d;
            double d10 = ((d7 * 3.0d) - (d6 * d6)) / 9.0d;
            double d11 = (((((d6 + d6) * d6) * d6) - ((d6 * 9.0d) * d7)) + (d8 * 27.0d)) / 54.0d;
            double d12 = d10 * d10 * d10;
            double d13 = (d11 * d11) + d12;
            if (d13 < 0.0d) {
                double dSqrt = java.lang.Math.sqrt(-d12);
                double d14 = (-d11) / dSqrt;
                if (d14 < -1.0d) {
                    d14 = -1.0d;
                }
                if (d14 > 1.0d) {
                    d14 = 1.0d;
                }
                double dAcos = java.lang.Math.acos(d14);
                float fO = defpackage.dlv.o((float) dSqrt);
                double d15 = fO + fO;
                float fCos = (float) ((java.lang.Math.cos(dAcos / 3.0d) * d15) - d9);
                float f10 = fCos < 0.0f ? 0.0f : fCos;
                if (f10 > 1.0f) {
                    f10 = 1.0f;
                }
                if (java.lang.Math.abs(f10 - fCos) > 1.05E-6f) {
                    f10 = Float.NaN;
                }
                if (java.lang.Float.isNaN(f10)) {
                    float fCos2 = (float) ((java.lang.Math.cos((6.283185307179586d + dAcos) / 3.0d) * d15) - d9);
                    f10 = fCos2 < 0.0f ? 0.0f : fCos2;
                    if (f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                    if (java.lang.Math.abs(f10 - fCos2) > 1.05E-6f) {
                        f10 = Float.NaN;
                    }
                    if (java.lang.Float.isNaN(f10)) {
                        float fCos3 = (float) ((d15 * java.lang.Math.cos((dAcos + 12.566370614359172d) / 3.0d)) - d9);
                        if (fCos3 >= 0.0f) {
                            f9 = fCos3;
                        }
                        f2 = f9 > 1.0f ? 1.0f : f9;
                        if (java.lang.Math.abs(f2 - fCos3) > 1.05E-6f) {
                            f3 = Float.NaN;
                        } else {
                            f3 = f2;
                        }
                    }
                }
                f3 = f10;
            } else if (d13 == 0.0d) {
                float f11 = -defpackage.dlv.o((float) d11);
                float f12 = (float) d9;
                float f13 = (f11 + f11) - f12;
                f3 = f13 < 0.0f ? 0.0f : f13;
                if (f3 > 1.0f) {
                    f3 = 1.0f;
                }
                if (java.lang.Math.abs(f3 - f13) > 1.05E-6f) {
                    f3 = Float.NaN;
                }
                if (java.lang.Float.isNaN(f3)) {
                    float f14 = (-f11) - f12;
                    if (f14 >= 0.0f) {
                        f9 = f14;
                    }
                    f2 = f9 > 1.0f ? 1.0f : f9;
                    if (java.lang.Math.abs(f2 - f14) > 1.05E-6f) {
                        f3 = Float.NaN;
                    } else {
                        f3 = f2;
                    }
                }
            } else {
                double dSqrt2 = java.lang.Math.sqrt(d13);
                float fO2 = (float) (((double) (defpackage.dlv.o((float) ((-d11) + dSqrt2)) - defpackage.dlv.o((float) (d11 + dSqrt2)))) - d9);
                if (fO2 >= 0.0f) {
                    f9 = fO2;
                }
                f2 = f9 > 1.0f ? 1.0f : f9;
                if (java.lang.Math.abs(f2 - fO2) > 1.05E-6f) {
                    f3 = Float.NaN;
                } else {
                    f3 = f2;
                }
            }
        } else if (java.lang.Math.abs(d5 + 0.0d) < 1.0E-7d) {
            if (java.lang.Math.abs(d3 + 0.0d) >= 1.0E-7d) {
                float f15 = (float) ((-d2) / d3);
                if (f15 >= 0.0f) {
                    f9 = f15;
                }
                f2 = f9 > 1.0f ? 1.0f : f9;
                if (java.lang.Math.abs(f2 - f15) <= 1.05E-6f) {
                    f3 = f2;
                }
            }
            f3 = Float.NaN;
        } else {
            double d16 = 4.0d * d5 * d2;
            double d17 = d5 + d5;
            double dSqrt3 = java.lang.Math.sqrt((d3 * d3) - d16);
            float f16 = (float) ((dSqrt3 - d3) / d17);
            float f17 = f16 < 0.0f ? 0.0f : f16;
            if (f17 > 1.0f) {
                f17 = 1.0f;
            }
            if (java.lang.Math.abs(f17 - f16) > 1.05E-6f) {
                f17 = Float.NaN;
            }
            if (java.lang.Float.isNaN(f17)) {
                float f18 = (float) (((-d3) - dSqrt3) / d17);
                if (f18 >= 0.0f) {
                    f9 = f18;
                }
                f2 = f9 > 1.0f ? 1.0f : f9;
                if (java.lang.Math.abs(f2 - f18) > 1.05E-6f) {
                    f3 = Float.NaN;
                } else {
                    f3 = f2;
                }
            } else {
                f3 = f17;
            }
        }
        boolean zIsNaN = java.lang.Float.isNaN(f3);
        float f19 = this.b;
        if (!zIsNaN) {
            float f20 = this.d;
            float f21 = ((((((f19 - f20) + 0.33333334f) * f3) + (f20 - (f19 + f19))) * f3) + f19) * 3.0f * f3;
            float f22 = this.e;
            float f23 = this.f;
            if (f21 < f22) {
                f21 = f22;
            }
            return f21 > f23 ? f23 : f21;
        }
        throw new java.lang.IllegalArgumentException("The cubic curve with parameters (" + f5 + ", " + f19 + ", " + f7 + ", " + this.d + ") has no solution at " + f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aeu)) {
            return false;
        }
        defpackage.aeu aeuVar = (defpackage.aeu) obj;
        return this.a == aeuVar.a && this.b == aeuVar.b && this.c == aeuVar.c && this.d == aeuVar.d;
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d);
    }

    public final java.lang.String toString() {
        return "CubicBezierEasing(a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ")";
    }
}
