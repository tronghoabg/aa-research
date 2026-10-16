package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bzo {
    public static boolean a;

    public static final defpackage.cjk A(float f, float f2, float f3, float f4, long j) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new defpackage.cjk(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final boolean B(defpackage.cjk cjkVar) {
        long j = cjkVar.e;
        return (j >>> 32) == (4294967295L & j) && j == cjkVar.f && j == cjkVar.g && j == cjkVar.h;
    }

    public static final defpackage.cjj C(long j, long j2) {
        int i = (int) (j & 4294967295L);
        int i2 = (int) (j >> 32);
        return new defpackage.cjj(java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2) + java.lang.Float.intBitsToFloat((int) (j2 >> 32)), java.lang.Float.intBitsToFloat(i) + java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final int a(java.util.ArrayList arrayList, int i, int i2) {
        int iC = c(arrayList, i, i2);
        return iC >= 0 ? iC : -(iC + 1);
    }

    public static final int b(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + java.lang.Integer.bitCount(iArr[i2 + 1] >> 30);
    }

    public static final int c(java.util.ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((defpackage.bzh) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int iB = defpackage.afga.b(i5, i);
            if (iB < 0) {
                i3 = i4 + 1;
            } else {
                if (iB <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int d(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + java.lang.Integer.bitCount(iArr[i2 + 1] >> 28);
    }

    public static final defpackage.bzh e(java.util.ArrayList arrayList, int i, int i2) {
        int iC = c(arrayList, i, i2);
        if (iC >= 0) {
            return (defpackage.bzh) arrayList.get(iC);
        }
        return null;
    }

    public static final void f() {
        throw new java.util.ConcurrentModificationException();
    }

    public static final java.util.List g(defpackage.bzp bzpVar, int i, defpackage.bzp bzpVar2, boolean z, boolean z2, boolean z3) {
        j$.util.List arrayList;
        boolean zT;
        int i2 = bzpVar.i(i);
        int i3 = i + i2;
        int iB = bzpVar.b(i);
        int iB2 = bzpVar.b(i3);
        int i4 = iB2 - iB;
        boolean z4 = i >= 0 && (bzpVar.b[(bzpVar.g(i) * 5) + 1] & 201326592) != 0;
        bzpVar2.B(i2);
        bzpVar2.C(i4, bzpVar2.o);
        if (bzpVar.f < i3) {
            bzpVar.E(i3);
        }
        if (bzpVar.j < iB2) {
            bzpVar.F(iB2, i3);
        }
        int[] iArr = bzpVar2.b;
        int i5 = bzpVar2.o;
        int[] iArr2 = bzpVar.b;
        int i6 = i5 * 5;
        int i7 = i * 5;
        iArr2.getClass();
        iArr.getClass();
        java.lang.System.arraycopy(iArr2, i7, iArr, i6, (i3 * 5) - i7);
        java.lang.Object[] objArr = bzpVar2.c;
        int i8 = bzpVar2.h;
        java.lang.System.arraycopy(bzpVar.c, iB, objArr, i8, i4);
        int i9 = bzpVar2.q;
        iArr[i6 + 2] = i9;
        int i10 = i5 - i;
        int i11 = i5 + i2;
        int iC = i8 - bzpVar2.c(iArr, i5);
        int i12 = bzpVar2.l;
        int i13 = bzpVar2.k;
        int length = objArr.length;
        int i14 = i12;
        boolean z5 = z4;
        int i15 = i5;
        while (i15 < i11) {
            int i16 = i15 * 5;
            if (i15 != i5) {
                int i17 = i16 + 2;
                iArr[i17] = iArr[i17] + i10;
            }
            int[] iArr3 = iArr;
            int iC2 = bzpVar2.c(iArr, i15) + iC;
            if (iC2 > (i14 < i15 ? 0 : bzpVar2.j)) {
                iC2 = -(((length - i13) - iC2) + 1);
            }
            iArr3[i16 + 4] = iC2;
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i5 = i5;
            iArr = iArr3;
        }
        int[] iArr4 = iArr;
        bzpVar2.l = i14;
        int iA = a(bzpVar.d, i, bzpVar.f());
        int iA2 = a(bzpVar.d, i3, bzpVar.f());
        if (iA < iA2) {
            java.util.ArrayList arrayList2 = bzpVar.d;
            arrayList = new java.util.ArrayList(iA2 - iA);
            for (int i18 = iA; i18 < iA2; i18++) {
                defpackage.bzh bzhVar = (defpackage.bzh) arrayList2.get(i18);
                bzhVar.a += i10;
                arrayList.add(bzhVar);
            }
            bzpVar2.d.addAll(a(bzpVar2.d, bzpVar2.o, bzpVar2.f()), arrayList);
            arrayList2.subList(iA, iA2).clear();
        } else {
            arrayList = defpackage.afce.a;
        }
        if (!arrayList.isEmpty()) {
            java.util.HashMap map = bzpVar.e;
            java.util.HashMap map2 = bzpVar2.e;
            if (map != null && map2 != null) {
                int size = arrayList.size();
                for (int i19 = 0; i19 < size; i19++) {
                    defpackage.bzh bzhVar2 = (defpackage.bzh) arrayList.get(i19);
                    defpackage.bzd bzdVar = (defpackage.bzd) map.get(bzhVar2);
                    if (bzdVar != null) {
                        map.remove(bzhVar2);
                        map2.put(bzhVar2, bzdVar);
                    }
                }
            }
        }
        int i20 = bzpVar2.q;
        if (bzpVar2.Y(i9) != null) {
            int i21 = i20 + 1;
            int i22 = bzpVar2.o;
            while (i21 < i22) {
                i21 += bzpVar2.b[(i21 * 5) + 3];
            }
            throw null;
        }
        int iK = bzpVar.k(i);
        if (z3) {
            if (z) {
                boolean z6 = iK >= 0;
                if (z6) {
                    bzpVar.J();
                    bzpVar.u(iK - bzpVar.o);
                    bzpVar.J();
                }
                bzpVar.u(i - bzpVar.o);
                zT = bzpVar.T();
                if (z6) {
                    bzpVar.I();
                    bzpVar.V();
                    bzpVar.I();
                    bzpVar.V();
                }
            } else {
                boolean zU = bzpVar.U(i, i2);
                bzpVar.H(iB, i4, i - 1);
                zT = zU;
            }
            if (zT) {
                defpackage.bvg.b("Unexpectedly removed anchors");
            }
        }
        int i23 = bzpVar2.n;
        int i24 = iArr4[i6 + 1];
        bzpVar2.n = i23 + ((1073741824 & i24) != 0 ? 1 : i24 & 67108863);
        if (z2) {
            bzpVar2.o = i11;
            bzpVar2.h = i8 + i4;
        }
        if (z5) {
            bzpVar2.O(i9);
        }
        return arrayList;
    }

    public static final java.lang.Object[] h(java.lang.Object[] objArr, int i, java.lang.Object obj, java.lang.Object obj2) {
        int length = objArr.length;
        java.lang.Object[] objArr2 = new java.lang.Object[length + 2];
        defpackage.afga.cv(objArr, objArr2, 0, i, 6);
        objArr.getClass();
        java.lang.System.arraycopy(objArr, i, objArr2, i + 2, length - i);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final java.lang.Object[] i(java.lang.Object[] objArr, int i) {
        int length = objArr.length;
        java.lang.Object[] objArr2 = new java.lang.Object[length - 2];
        defpackage.afga.cv(objArr, objArr2, 0, i, 6);
        defpackage.afga.ck(objArr, objArr2, i, i + 2, length);
        return objArr2;
    }

    public static final java.lang.Object[] j(java.lang.Object[] objArr, int i) {
        int length = objArr.length;
        java.lang.Object[] objArr2 = new java.lang.Object[length - 1];
        defpackage.afga.cv(objArr, objArr2, 0, i, 6);
        defpackage.afga.ck(objArr, objArr2, i, i + 1, length);
        return objArr2;
    }

    public static boolean k(defpackage.cgd cgdVar, defpackage.affc affcVar) {
        return ((java.lang.Boolean) affcVar.invoke(cgdVar)).booleanValue();
    }

    public static defpackage.cgf l(defpackage.cgf cgfVar, defpackage.cgf cgfVar2) {
        return cgfVar2 == defpackage.cgf.e ? cgfVar : new defpackage.cga(cgfVar, cgfVar2);
    }

    public static final defpackage.cgf m(defpackage.bve bveVar, defpackage.cgf cgfVar) {
        if (cgfVar.c(new defpackage.bwy(7))) {
            return cgfVar;
        }
        bveVar.K();
        defpackage.cgf cgfVar2 = (defpackage.cgf) cgfVar.b(defpackage.cgf.e, new defpackage.amc(bveVar, 19));
        bveVar.p();
        return cgfVar2;
    }

    public static final defpackage.cgf n(defpackage.bve bveVar, defpackage.cgf cgfVar) {
        bveVar.v(439770924);
        defpackage.cgf cgfVarM = m(bveVar, cgfVar);
        bveVar.o();
        return cgfVarM;
    }

    public static final android.graphics.Paint p(defpackage.cjs cjsVar) {
        if (!(cjsVar instanceof defpackage.cjs)) {
            defpackage.ckn.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received ".concat(java.lang.String.valueOf(defpackage.afgw.a.getOrCreateKotlinClass(cjsVar.getClass()).getQualifiedName())));
        }
        return cjsVar.a;
    }

    public static final void q(android.graphics.Matrix matrix, float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
    }

    public static final void r(float[] fArr, android.graphics.Matrix matrix) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }

    public static final android.graphics.Bitmap s(defpackage.cjr cjrVar) {
        if (cjrVar instanceof defpackage.cjr) {
            return cjrVar.a;
        }
        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final long t(long j) {
        long j2 = 63 & j;
        int i = (int) j2;
        if (i <= 15) {
            return j;
        }
        float[] fArr = defpackage.clr.a;
        if (i == defpackage.clr.u.c) {
            return (int) (defpackage.ckd.e(j, defpackage.clr.e) >>> 32);
        }
        if ((i == defpackage.clr.v.c || i == defpackage.clr.w.c) && android.os.Build.VERSION.SDK_INT < 34) {
            return (int) (defpackage.ckd.e(j, defpackage.clr.e) >>> 32);
        }
        return (i != defpackage.clr.x.c || android.os.Build.VERSION.SDK_INT >= 36) ? (j & (-64)) | (j2 - 1) : (int) (defpackage.ckd.e(j, defpackage.clr.e) >>> 32);
    }

    public static final long u(long j) {
        float[] fArr = defpackage.clr.a;
        int i = (int) (63 & j);
        return (i == defpackage.clr.x.c || i == defpackage.clr.s.c || i == defpackage.clr.t.c) ? t(defpackage.ckd.e(j, defpackage.clr.e)) : t(j);
    }

    public static final long v(long j) {
        long j2 = 63 & j;
        return j2 < 16 ? j : (j & (-64)) | (j2 + 1);
    }

    public static final android.graphics.BlendMode w(int i) {
        if (i == 0) {
            return alh$.ExternalSyntheticApiModelOutline0.m();
        }
        if (i == 1) {
            return alh$.ExternalSyntheticApiModelOutline0.m$2();
        }
        if (i == 2) {
            return alh$.ExternalSyntheticApiModelOutline0.m$3();
        }
        if (i == 3) {
            return alh$.ExternalSyntheticApiModelOutline0.m$4();
        }
        if (i == 4) {
            return alh$.ExternalSyntheticApiModelOutline0.m$5();
        }
        if (i == 5) {
            return alh$.ExternalSyntheticApiModelOutline0.m$6();
        }
        if (i == 6) {
            return alh$.ExternalSyntheticApiModelOutline0.m$7();
        }
        if (i == 7) {
            return alh$.ExternalSyntheticApiModelOutline0.m$8();
        }
        if (i == 8) {
            return alh$.ExternalSyntheticApiModelOutline0.m$9();
        }
        if (i == 9) {
            return alh$.ExternalSyntheticApiModelOutline0.m$10();
        }
        if (i == 10) {
            return alh$.ExternalSyntheticApiModelOutline0.m$11();
        }
        if (i == 11) {
            return alh$.ExternalSyntheticApiModelOutline0.m$12();
        }
        if (i == 12) {
            return alh$.ExternalSyntheticApiModelOutline0.m$13();
        }
        return i == 13 ? alh$.ExternalSyntheticApiModelOutline0.m$14() : alh$.ExternalSyntheticApiModelOutline0.m$1();
    }

    public static final android.graphics.PorterDuff.Mode x(int i) {
        if (i == 0) {
            return android.graphics.PorterDuff.Mode.CLEAR;
        }
        if (i == 1) {
            return android.graphics.PorterDuff.Mode.SRC;
        }
        if (i == 2) {
            return android.graphics.PorterDuff.Mode.DST;
        }
        if (i == 3) {
            return android.graphics.PorterDuff.Mode.SRC_OVER;
        }
        if (i == 4) {
            return android.graphics.PorterDuff.Mode.DST_OVER;
        }
        if (i == 5) {
            return android.graphics.PorterDuff.Mode.SRC_IN;
        }
        if (i == 6) {
            return android.graphics.PorterDuff.Mode.DST_IN;
        }
        if (i == 7) {
            return android.graphics.PorterDuff.Mode.SRC_OUT;
        }
        if (i == 8) {
            return android.graphics.PorterDuff.Mode.DST_OUT;
        }
        if (i == 9) {
            return android.graphics.PorterDuff.Mode.SRC_ATOP;
        }
        if (i == 10) {
            return android.graphics.PorterDuff.Mode.DST_ATOP;
        }
        if (i == 11) {
            return android.graphics.PorterDuff.Mode.XOR;
        }
        if (i == 12) {
            return android.graphics.PorterDuff.Mode.ADD;
        }
        return i == 14 ? android.graphics.PorterDuff.Mode.SCREEN : android.graphics.PorterDuff.Mode.MULTIPLY;
    }

    public static final long y(long j) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final defpackage.cjk z(defpackage.cjj cjjVar, long j, long j2, long j3, long j4) {
        return new defpackage.cjk(cjjVar.b, cjjVar.c, cjjVar.d, cjjVar.e, j, j2, j3, j4);
    }
}
