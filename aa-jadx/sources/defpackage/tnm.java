package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class tnm {
    public static volatile defpackage.tnm a;

    public tnm(java.util.concurrent.Executor executor, defpackage.qbs qbsVar, defpackage.tot totVar, defpackage.ubg ubgVar) {
        int i = defpackage.ygw.d;
        defpackage.ygw ygwVar = defpackage.ymx.a;
        int i2 = totVar.e;
        new defpackage.tvh(executor, qbsVar, ubgVar.f());
    }

    public static boolean i(android.content.Context context) {
        return "com.google.android.gms".equals(context.getPackageName());
    }

    public static /* synthetic */ java.lang.String j(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "PHONE_MAIN";
        }
        return "UNSPECIFIED";
    }

    public static int k(int i, float f) {
        float f2 = f * (((i >> 24) & 255) / 255.0f);
        return (((int) (f2 * ((i >> 16) & 255))) << 24) + (((int) (((i >> 8) & 255) * f2)) << 16) + (((int) ((i & 255) * f2)) << 8) + ((int) (255.0f * f2));
    }

    public static int l(defpackage.tpm tpmVar, defpackage.tpm tpmVar2, defpackage.tpm tpmVar3) {
        int i = tpmVar3.a;
        int i2 = i - tpmVar.a;
        int i3 = tpmVar3.b;
        long j = (((long) i2) * ((long) (i3 - tpmVar2.b))) - (((long) (i3 - tpmVar.b)) * ((long) (i - tpmVar2.a)));
        return (int) (((long) (j != 0 ? 1 : 0)) | (j >> 63));
    }

    public static boolean m(defpackage.tpm tpmVar, defpackage.tpm tpmVar2, defpackage.tpm tpmVar3) {
        int i = tpmVar.a;
        int i2 = tpmVar.b;
        int i3 = tpmVar2.a;
        int i4 = tpmVar2.b;
        int i5 = tpmVar3.a;
        int i6 = tpmVar3.b;
        if (i2 <= i6 && i4 <= i6) {
            return false;
        }
        if (i5 >= i && i5 >= i3) {
            return false;
        }
        if (i5 < i && i5 < i3) {
            return false;
        }
        long j = i6 - i2;
        long j2 = ((long) (i5 - i)) * ((long) (i4 - i2));
        if (i3 >= i) {
            return j2 > j * ((long) (i3 - i));
        }
        return j2 < j * ((long) (i3 - i));
    }

    public static boolean n(defpackage.tpm tpmVar, defpackage.tpm tpmVar2, defpackage.tpm tpmVar3, defpackage.tpm tpmVar4) {
        int i = tpmVar2.a;
        int i2 = tpmVar.a;
        int i3 = i - i2;
        int i4 = tpmVar2.b;
        int i5 = tpmVar.b;
        int i6 = i4 - i5;
        int i7 = tpmVar4.a;
        int i8 = tpmVar3.a;
        int i9 = i7 - i8;
        int i10 = tpmVar4.b;
        int i11 = tpmVar3.b;
        int i12 = i10 - i11;
        int i13 = i8 - i2;
        int i14 = i11 - i5;
        long j = i12;
        long j2 = i3;
        long j3 = i9;
        long j4 = i6;
        long j5 = (j3 * j4) - (j * j2);
        if (j5 != 0) {
            long j6 = i14;
            double d = ((((long) (-i13)) * j4) + (j2 * j6)) / j5;
            if (d >= 0.0d && d <= 1.0d) {
                double d2 = ((((long) i13) * j) - (j6 * j3)) / (-j5);
                if (d2 >= 0.0d && d2 <= 1.0d) {
                    return true;
                }
            }
            return false;
        }
        if (i13 == 0) {
            if (i14 == 0) {
                return true;
            }
            i13 = 0;
        }
        if ((((long) i13) * j4) - (((long) i14) * j2) != 0) {
            return false;
        }
        if (i3 == 0 && i6 == 0) {
            return y(tpmVar3, tpmVar4, tpmVar);
        }
        if (i9 == 0 && i12 == 0) {
            return y(tpmVar, tpmVar2, tpmVar3);
        }
        return y(tpmVar, tpmVar2, tpmVar3) || y(tpmVar, tpmVar2, tpmVar4) || y(tpmVar3, tpmVar4, tpmVar) || y(tpmVar3, tpmVar4, tpmVar2);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static void o(defpackage.tpm tpmVar, defpackage.tpm tpmVar2, defpackage.tpm tpmVar3, defpackage.tpm tpmVar4, defpackage.tpm tpmVar5) {
        double d;
        int i = tpmVar.b;
        int i2 = i - tpmVar2.b;
        int i3 = tpmVar2.a;
        int i4 = tpmVar.a;
        int i5 = tpmVar4.a;
        int i6 = tpmVar3.a;
        int i7 = tpmVar4.b;
        int i8 = tpmVar3.b;
        long j = i3 - i4;
        long j2 = i2;
        long j3 = (((long) (i5 - i6)) * j2) + (((long) (i7 - i8)) * j);
        if (j3 != 0) {
            d = ((((long) (i4 - i6)) * j2) + (((long) (i - i8)) * j)) / j3;
        } else if (l(tpmVar, tpmVar2, tpmVar3) == 0) {
            d = 0.0d;
        } else {
            d = l(tpmVar, tpmVar2, tpmVar4) == 0 ? 1.0d : Double.NaN;
        }
        if (java.lang.Double.isNaN(d) || d < 0.0d || d > 1.0d) {
            return;
        }
        int i9 = tpmVar3.a;
        tpmVar5.a = (int) (((double) i9) + (((double) (tpmVar4.a - i9)) * d));
        int i10 = tpmVar3.b;
        tpmVar5.b = (int) (((double) i10) + (((double) (tpmVar4.b - i10)) * d));
    }

    public static int p(defpackage.abnv abnvVar) {
        defpackage.abnr it = abnvVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.a() >= 0) {
                i++;
            }
        }
        return i;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static int q(defpackage.abnv abnvVar, int i, int i2, int[] iArr, int i3) throws java.io.IOException {
        int i4;
        int i5 = i - 1;
        int i6 = 0;
        if (i5 == 1) {
            defpackage.abny abnyVarG = abnvVar.g();
            while (!abnyVarG.C()) {
                iArr[i3 + i6] = abnyVarG.m();
                i6++;
            }
            return i6;
        }
        if (i5 == 2) {
            defpackage.yvb yvbVar = new defpackage.yvb(abnvVar.h());
            while (yvbVar.available() > 0 && (i4 = i3 + i6) < iArr.length) {
                iArr[i4] = (short) yvbVar.readUnsignedShort();
                i6++;
            }
            return i6;
        }
        if (i5 != 3) {
            throw new java.io.IOException("Unknown vertex encoding :".concat(java.lang.Integer.toString(i5)));
        }
        if (i2 != 3) {
            return z(abnvVar, iArr, i3);
        }
        defpackage.abny abnyVarG2 = abnvVar.g();
        int iM = 0;
        int iM2 = 0;
        int iM3 = 0;
        while (!abnyVarG2.C()) {
            iM += abnyVarG2.m();
            iM2 += abnyVarG2.m();
            iM3 += abnyVarG2.m();
            int i7 = i3 + i6;
            iArr[i7] = iM;
            iArr[i7 + 1] = iM2;
            iArr[i7 + 2] = iM3;
            i6 += 3;
        }
        return i6;
    }

    public static int[] r(defpackage.abnv abnvVar, int i, int i2, int i3) throws java.io.IOException {
        if (i3 <= 0) {
            int i4 = i - 1;
            if (i4 == 1) {
                i3 = p(abnvVar);
            } else if (i4 != 2) {
                if (i4 != 3) {
                    throw new java.io.IOException("Unknown vertex encoding :".concat(java.lang.Integer.toString(i4)));
                }
                i3 = p(abnvVar);
            } else {
                i3 = abnvVar.d() / 2;
            }
        }
        int[] iArr = new int[i3];
        q(abnvVar, i, i2, iArr, 0);
        return iArr;
    }

    public static defpackage.tpg s(defpackage.tpm tpmVar) {
        return new defpackage.tpg(tpmVar.a(), tpmVar.b());
    }

    public static defpackage.tpm t(defpackage.tpg tpgVar) {
        return defpackage.tpm.l(tpgVar.a, tpgVar.b);
    }

    public static /* synthetic */ java.lang.String u(int i) {
        if (i != 1) {
            return i != 2 ? "BLANK" : "TEXT";
        }
        return "ICON";
    }

    public static defpackage.tzd v(defpackage.tzx tzxVar, defpackage.tpd tpdVar, defpackage.txb txbVar) {
        defpackage.tzc twyVar = txbVar.l ? new defpackage.twy(txbVar) : new defpackage.twz(txbVar);
        int i = true == txbVar.k ? 2 : 1;
        defpackage.uub uubVar = txbVar.m;
        float f = txbVar.g;
        int i2 = defpackage.txb.c;
        defpackage.txb.c = i2 + 1;
        return new defpackage.tzd(tzxVar, twyVar, tpdVar, i, f, i2, new defpackage.ums(uubVar, defpackage.tzd.b(i2)));
    }

    public static /* bridge */ /* synthetic */ void w(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static java.util.Set x(defpackage.tur turVar, java.util.Set set, defpackage.tpm tpmVar) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            defpackage.ulk ulkVarB = turVar.b((defpackage.ulk) it.next(), tpmVar);
            if (ulkVarB != null) {
                linkedHashSet.add(ulkVarB);
            }
        }
        return linkedHashSet;
    }

    private static boolean y(defpackage.tpm tpmVar, defpackage.tpm tpmVar2, defpackage.tpm tpmVar3) {
        int i;
        int iMin = java.lang.Math.min(tpmVar.a, tpmVar2.a);
        int iMax = java.lang.Math.max(tpmVar.a, tpmVar2.a);
        int iMin2 = java.lang.Math.min(tpmVar.b, tpmVar2.b);
        int iMax2 = java.lang.Math.max(tpmVar.b, tpmVar2.b);
        int i2 = tpmVar3.a;
        if (i2 <= iMax && i2 >= iMin && (i = tpmVar3.b) <= iMax2 && i >= iMin2) {
            int i3 = tpmVar2.b;
            int i4 = tpmVar.b;
            int i5 = tpmVar.a;
            if ((i3 - i4) * (i2 - i5) == (i - i4) * (tpmVar2.a - i5)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019 A[PHI: r7 r8
  0x0019: PHI (r7v11 int) = (r7v1 int), (r7v3 int) binds: [B:9:0x0017, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x0019: PHI (r8v10 int) = (r8v0 int), (r8v4 int) binds: [B:9:0x0017, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[PHI: r8 r9
  0x005b: PHI (r8v3 int) = (r8v2 int), (r8v5 int) binds: [B:12:0x0028, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x005b: PHI (r9v1 int) = (r9v0 int), (r9v3 int) binds: [B:12:0x0028, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    private static int z(defpackage.abnv abnvVar, int[] iArr, int i) throws java.io.IOException {
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = true;
        while (i3 < abnvVar.d() && (i2 = i + i4) < iArr.length) {
            int i7 = i3 + 1;
            try {
                int iA = abnvVar.a(i3);
                if (iA >= 0) {
                    i3 = i7;
                } else {
                    int i8 = i3 + 2;
                    byte bA = abnvVar.a(i7);
                    iA = (iA & 127) | ((bA & 127) << 7);
                    if (bA < 0) {
                        i7 = i3 + 3;
                        byte bA2 = abnvVar.a(i8);
                        iA |= (bA2 & 127) << 14;
                        if (bA2 < 0) {
                            i8 = i3 + 4;
                            byte bA3 = abnvVar.a(i7);
                            iA |= (bA3 & 127) << 21;
                            if (bA3 < 0) {
                                i3 += 5;
                                byte bA4 = abnvVar.a(i8);
                                iA |= (bA4 & 127) << 28;
                                while (bA4 < 0) {
                                    int i9 = i3 + 1;
                                    bA4 = abnvVar.a(i3);
                                    i3 = i9;
                                }
                            } else {
                                i3 = i8;
                            }
                        } else {
                            i3 = i7;
                        }
                    } else {
                        i3 = i8;
                    }
                }
                int i10 = (iA >>> 1) ^ (-(iA & 1));
                if (z) {
                    i5 += i10;
                    iArr[i2] = i5;
                } else {
                    i6 += i10;
                    iArr[i2] = i6;
                }
                z = !z;
                i4++;
            } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                throw new java.io.IOException("Invalid vertex data", e);
            }
        }
        if (z) {
            return i4;
        }
        throw new java.io.IOException("Odd number of vertices");
    }

    public void a(defpackage.txn txnVar, defpackage.tpg tpgVar, defpackage.tvw tvwVar) {
        txnVar.a(defpackage.trb.b, defpackage.tpm.l(tpgVar.a, tpgVar.b));
    }

    public void b(defpackage.txn txnVar, defpackage.tpg tpgVar, defpackage.tvw tvwVar) {
        txnVar.a(defpackage.trb.a, defpackage.tpm.l(tpgVar.a, tpgVar.b));
    }

    public void f() {
    }

    public tnm(byte[] bArr, byte[] bArr2) {
    }

    public tnm() {
    }

    public void c(defpackage.tvw tvwVar) {
    }

    public void d(defpackage.tvw tvwVar) {
    }

    public void e(defpackage.tvw tvwVar) {
    }

    public void h(defpackage.tvw tvwVar) {
    }

    public void g(float f, boolean z, defpackage.tvw tvwVar) {
    }
}
