package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dln {
    public static final int a(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i >= 262143 ? 255 : 18;
    }

    public static final int b(long j, int i) {
        int iC = defpackage.dlm.c(j);
        if (i < iC) {
            i = iC;
        }
        int iA = defpackage.dlm.a(j);
        return i > iA ? iA : i;
    }

    public static final int c(long j, int i) {
        int iD = defpackage.dlm.d(j);
        if (i < iD) {
            i = iD;
        }
        int iB = defpackage.dlm.b(j);
        return i > iB ? iB : i;
    }

    public static final long d(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            defpackage.dlv.a(afzh.a("\n        maxWidth(" + i2 + ") must be >= than minWidth(" + i + "),\n        maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + "),\n        minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0\n        "));
        }
        return g(i, i2, i3, i4);
    }

    public static final long e(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iD = defpackage.dlm.d(j);
        if (i < iD) {
            i = iD;
        }
        int iB = defpackage.dlm.b(j);
        if (i > iB) {
            i = iB;
        }
        long j3 = ((long) i) << 32;
        int iA = defpackage.dlm.a(j);
        int i2 = (int) (j2 & 4294967295L);
        int iC = defpackage.dlm.c(j);
        if (i2 < iC) {
            i2 = iC;
        }
        if (i2 <= iA) {
            iA = i2;
        }
        return ((long) iA) | j3;
    }

    public static final long f(long j, long j2) {
        int iD = defpackage.dlm.d(j2);
        int iD2 = defpackage.dlm.d(j);
        if (iD < iD2) {
            iD = iD2;
        }
        int iB = defpackage.dlm.b(j);
        if (iD > iB) {
            iD = iB;
        }
        int iB2 = defpackage.dlm.b(j2);
        if (iB2 >= iD2) {
            iD2 = iB2;
        }
        if (iD2 <= iB) {
            iB = iD2;
        }
        int iC = defpackage.dlm.c(j2);
        int iC2 = defpackage.dlm.c(j);
        if (iC < iC2) {
            iC = iC2;
        }
        int iA = defpackage.dlm.a(j);
        if (iC > iA) {
            iC = iA;
        }
        int iA2 = defpackage.dlm.a(j2);
        if (iA2 >= iC2) {
            iC2 = iA2;
        }
        if (iC2 <= iA) {
            iA = iC2;
        }
        return d(iD, iB, iC, iA);
    }

    public static final long g(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iA = a(i5);
        int iA2 = a(i6);
        if (iA + iA2 > 31) {
            j(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iA2 - 13;
        return (((long) ((~(i7 >> 31)) & i7)) << 33) | (i << 2) | ((i9 >> 1) + (i9 & 1)) | (i3 << (iA2 + 2)) | (((long) ((~(i8 >> 31)) & i8)) << (iA2 + 33));
    }

    public static final long h(long j, int i, int i2) {
        int iB = defpackage.dlm.b(j);
        if (iB != Integer.MAX_VALUE && (iB = iB + i) < 0) {
            iB = 0;
        }
        int iC = defpackage.dlm.c(j) + i2;
        if (iC < 0) {
            iC = 0;
        }
        int iA = defpackage.dlm.a(j);
        if (iA != Integer.MAX_VALUE && (iA = iA + i2) < 0) {
            iA = 0;
        }
        int iD = defpackage.dlm.d(j) + i;
        return d(iD >= 0 ? iD : 0, iB, iC, iA);
    }

    public static final java.lang.Void i(int i) {
        throw new java.lang.IllegalArgumentException(defpackage.a.bm(i, "Can't represent a size of ", " in Constraints"));
    }

    public static final void j(int i, int i2) {
        throw new java.lang.IllegalArgumentException(defpackage.a.bz(i2, i, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    public static final long k(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = java.lang.Math.min(i3, 262142);
        int iMin2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.min(i4, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    i(i6);
                    throw new defpackage.afap();
                }
                i5 = 8190;
            }
        }
        return d(java.lang.Math.min(i5, i), i2 != Integer.MAX_VALUE ? java.lang.Math.min(i5, i2) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static final long l(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = java.lang.Math.min(i, 262142);
        int iMin2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.min(i2, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    i(i6);
                    throw new defpackage.afap();
                }
                i5 = 8190;
            }
        }
        return d(iMin, iMin2, java.lang.Math.min(i5, i3), i4 != Integer.MAX_VALUE ? java.lang.Math.min(i5, i4) : Integer.MAX_VALUE);
    }

    public static final long m(int i, int i2) {
        if (!((i2 >= 0) & (i >= 0))) {
            defpackage.dlv.a(defpackage.a.bz(i2, i, "width(", ") and height(", ") must be >= 0"));
        }
        return g(i, i, i2, i2);
    }

    public static float n(defpackage.dlu dluVar, long j) {
        defpackage.dme dmeVarA;
        if (defpackage.dmb.a[(int) ((1095216660480L & j) >>> 32)].a != 4294967296L) {
            defpackage.dlv.b("Only Sp can convert to Px");
        }
        int i = defpackage.dmf.a;
        int i2 = (int) (j & 4294967295L);
        if (dluVar.b() >= 1.03f && (dmeVarA = defpackage.dmf.a(dluVar.b())) != null) {
            return dmeVarA.b(java.lang.Float.intBitsToFloat(i2));
        }
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat(i2);
        float fB = dluVar.b();
        return fIntBitsToFloat * fB;
    }

    public static long o(defpackage.dlu dluVar, float f) {
        long jFloatToRawIntBits;
        int i = defpackage.dmf.a;
        if (dluVar.b() >= 1.03f) {
            defpackage.dme dmeVarA = defpackage.dmf.a(dluVar.b());
            jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(dmeVarA != null ? dmeVarA.a(f) : f / dluVar.b());
            defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
        } else {
            jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f / dluVar.b());
            defpackage.dmc[] dmcVarArr2 = defpackage.dmb.a;
        }
        return (jFloatToRawIntBits & 4294967295L) | 4294967296L;
    }

    public static float p(defpackage.dlo dloVar, long j) {
        if (defpackage.dmb.a[(int) ((1095216660480L & j) >>> 32)].a != 4294967296L) {
            defpackage.dlv.b("Only Sp can convert to Px");
        }
        return dloVar.dI(dloVar.dE(j));
    }

    public static int q(defpackage.dlo dloVar, float f) {
        float fDI = dloVar.dI(f);
        if (java.lang.Float.isInfinite(fDI)) {
            return Integer.MAX_VALUE;
        }
        return java.lang.Math.round(fDI);
    }

    public static long r(defpackage.dlo dloVar, long j) {
        if (j != 9205357640488583168L) {
            return defpackage.tna.aK(dloVar.dF(java.lang.Float.intBitsToFloat((int) (j >> 32))), dloVar.dF(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    public static long s(defpackage.dlo dloVar, long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fDI = dloVar.dI(java.lang.Float.intBitsToFloat((int) (j >> 32)) + 0.0f);
        float fDI2 = dloVar.dI(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + 0.0f);
        return (((long) java.lang.Float.floatToRawIntBits(fDI)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fDI2)) & 4294967295L);
    }

    public static final defpackage.dlo t(android.content.Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        int i = defpackage.dmf.a;
        defpackage.dme dmeVarA = defpackage.dmf.a(f);
        if (dmeVarA == null) {
            dmeVarA = new defpackage.dma(f);
        }
        return new defpackage.dlq(f2, f, dmeVarA);
    }

    public static final defpackage.dlf u(long j) {
        return j != 16 ? new defpackage.dkw(j) : defpackage.dle.a;
    }

    public static defpackage.dlf v(defpackage.dlf dlfVar, defpackage.dlf dlfVar2) {
        boolean z = dlfVar2 instanceof defpackage.dkv;
        if (z && (dlfVar instanceof defpackage.dkv)) {
            throw null;
        }
        if (!z || (dlfVar instanceof defpackage.dkv)) {
            return (z || !(dlfVar instanceof defpackage.dkv)) ? dlfVar2.d(new defpackage.djm(dlfVar, 3)) : dlfVar;
        }
        return dlfVar2;
    }

    public static defpackage.dlf w(defpackage.dlf dlfVar, defpackage.afer aferVar) {
        return !defpackage.afga.f(dlfVar, defpackage.dle.a) ? dlfVar : (defpackage.dlf) aferVar.invoke();
    }

    public static /* synthetic */ java.lang.String x(int i) {
        return i != 1 ? "Rtl" : "Ltr";
    }
}
