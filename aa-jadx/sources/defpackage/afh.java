package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class afh implements defpackage.afe {
    private final float a;
    private final float b;
    private final float c;
    private final defpackage.afz d;

    public afh(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        defpackage.afz afzVar = new defpackage.afz();
        if (f < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            defpackage.afw.a("Damping ratio must be non-negative");
        }
        afzVar.c = f;
        if (afzVar.a() <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            defpackage.afw.a("Spring stiffness constant must be positive.");
        }
        afzVar.b = java.lang.Math.sqrt(f2);
        this.d = afzVar;
    }

    @Override // defpackage.aej
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ defpackage.agu c(defpackage.bil bilVar) {
        return new defpackage.aha(this);
    }

    @Override // defpackage.afe
    public final float b(float f, float f2, float f3) {
        return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.afe
    public final float c(long j, float f, float f2, float f3) {
        defpackage.afz afzVar = this.d;
        afzVar.a = f2;
        return java.lang.Float.intBitsToFloat((int) (afzVar.b(f, f3, j / 1000000) >> 32));
    }

    @Override // defpackage.afe
    public final float d(long j, float f, float f2, float f3) {
        defpackage.afz afzVar = this.d;
        afzVar.a = f2;
        return java.lang.Float.intBitsToFloat((int) (afzVar.b(f, f3, j / 1000000) & 4294967295L));
    }

    @Override // defpackage.afe
    public final long e(float f, float f2, float f3) {
        double dLog;
        long j;
        defpackage.afz afzVar = this.d;
        float fA = afzVar.a();
        float f4 = afzVar.c;
        if (f4 == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            j = 9223372036854L;
        } else {
            float f5 = f - f2;
            float f6 = this.c;
            float f7 = f3 / f6;
            double d = fA;
            double d2 = f4;
            double dSqrt = (d2 + d2) * java.lang.Math.sqrt(d);
            double d3 = (dSqrt * dSqrt) - (d * 4.0d);
            double dSqrt2 = d3 < 0.0d ? 0.0d : java.lang.Math.sqrt(d3);
            double dSqrt3 = d3 < 0.0d ? java.lang.Math.sqrt(java.lang.Math.abs(d3)) : 0.0d;
            double d4 = f7;
            double d5 = -dSqrt;
            double d6 = d5 + dSqrt2;
            double d7 = d5 - dSqrt2;
            double d8 = f5 / f6;
            if (d8 == 0.0d && d4 == 0.0d) {
                j = 0;
            } else {
                if (d8 < 0.0d) {
                    d4 = -d4;
                }
                double d9 = d6 * 0.5d;
                double dAbs = java.lang.Math.abs(d8);
                double d10 = d9 * dAbs;
                double d11 = 1.0d;
                double dAbs2 = Double.MAX_VALUE;
                double d12 = -1.0d;
                if (d2 > 1.0d) {
                    double d13 = d7 * 0.5d;
                    double d14 = d9 - d13;
                    double d15 = (d10 - d4) / d14;
                    double d16 = dAbs - d15;
                    dLog = java.lang.Math.log(java.lang.Math.abs(1.0d / d16)) / d9;
                    double dLog2 = java.lang.Math.log(java.lang.Math.abs(1.0d / d15)) / d13;
                    if ((java.lang.Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog = dLog2;
                    } else if ((java.lang.Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog = java.lang.Math.max(dLog, dLog2);
                    }
                    double d17 = d15 * d13;
                    double d18 = d16 * d9;
                    double dLog3 = java.lang.Math.log(d18 / ((-d15) * d13)) / (d13 - d9);
                    if (java.lang.Double.isNaN(dLog3) || dLog3 <= 0.0d) {
                        d11 = -1.0d;
                    } else if (dLog3 <= 0.0d || (-((java.lang.Math.exp(d9 * dLog3) * d16) + (java.lang.Math.exp(dLog3 * d13) * d15))) >= 1.0d) {
                        dLog = java.lang.Math.log((-(d17 * d13)) / (d18 * d9)) / d14;
                    } else {
                        dLog = (d15 <= 0.0d || d16 >= 0.0d) ? dLog : 0.0d;
                        d11 = -1.0d;
                    }
                    if (java.lang.Math.abs((java.lang.Math.exp(d9 * dLog) * d18) + (java.lang.Math.exp(d13 * dLog) * d17)) >= 1.0E-4d) {
                        int i = 0;
                        while (dAbs2 > 0.001d && i < 100) {
                            double d19 = d9 * dLog;
                            double d20 = d13 * dLog;
                            double dExp = dLog - ((((java.lang.Math.exp(d19) * d16) + (java.lang.Math.exp(d20) * d15)) + d11) / ((java.lang.Math.exp(d19) * d18) + (java.lang.Math.exp(d20) * d17)));
                            dAbs2 = java.lang.Math.abs(dLog - dExp);
                            i++;
                            dLog = dExp;
                        }
                    }
                } else {
                    double d21 = d4 - d10;
                    if (d2 < 1.0d) {
                        double d22 = d21 / (dSqrt3 * 0.5d);
                        dLog = java.lang.Math.log(1.0d / java.lang.Math.sqrt((dAbs * dAbs) + (d22 * d22))) / d9;
                    } else {
                        double dLog4 = java.lang.Math.log(java.lang.Math.abs(1.0d / dAbs)) / d9;
                        double dLog5 = java.lang.Math.log(java.lang.Math.abs(1.0d / d21));
                        double dLog6 = dLog5;
                        for (int i2 = 0; i2 < 6; i2++) {
                            dLog6 = dLog5 - java.lang.Math.log(java.lang.Math.abs(dLog6 / d9));
                        }
                        double d23 = dLog6 / d9;
                        if ((java.lang.Double.doubleToRawLongBits(dLog4) & Long.MAX_VALUE) >= 9218868437227405312L) {
                            dLog4 = d23;
                        } else if ((java.lang.Double.doubleToRawLongBits(d23) & Long.MAX_VALUE) < 9218868437227405312L) {
                            dLog4 = java.lang.Math.max(dLog4, d23);
                        }
                        double d24 = (-(d10 + d21)) / (d9 * d21);
                        double d25 = d9 * d24;
                        double dExp2 = java.lang.Math.exp(d25) * dAbs;
                        double dExp3 = d21 * d24 * java.lang.Math.exp(d25);
                        if (!java.lang.Double.isNaN(d24) && d24 > 0.0d) {
                            if (d24 <= 0.0d || (-(dExp2 + dExp3)) >= 1.0d) {
                                dLog4 = (-(2.0d / d9)) - (dAbs / d21);
                                d12 = 1.0d;
                            } else {
                                dLog4 = (d21 >= 0.0d || dAbs <= 0.0d) ? dLog4 : 0.0d;
                            }
                        }
                        dLog = dLog4;
                        int i3 = 0;
                        while (dAbs2 > 0.001d && i3 < 100) {
                            double d26 = d9 * dLog;
                            double dExp4 = dLog - (((((d21 * dLog) + dAbs) * java.lang.Math.exp(d26)) + d12) / ((((d26 + 1.0d) * d21) + d10) * java.lang.Math.exp(d26)));
                            dAbs2 = java.lang.Math.abs(dLog - dExp4);
                            i3++;
                            dLog = dExp4;
                        }
                    }
                }
                j = (long) (dLog * 1000.0d);
            }
        }
        return j * 1000000;
    }
}
