package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class uhh {
    private static final int[] a = new int[0];
    public int f;
    public final float g;
    public final defpackage.uhg h;
    protected final java.util.Map b = new java.util.HashMap();
    public final java.util.List c = new java.util.ArrayList();
    protected final java.util.List d = new java.util.ArrayList();
    protected int e = 0;
    private final java.util.Set i = new java.util.HashSet();
    private final float[] j = new float[3];

    public uhh(float f, int i, boolean z) {
        this.g = f;
        this.f = i;
        this.h = z ? new defpackage.uhd() : new defpackage.uhf();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final int c(defpackage.ula ulaVar, defpackage.ula ulaVar2) {
        java.lang.Integer num = (java.lang.Integer) this.b.get(ulaVar);
        if (num == null) {
            int i = this.e;
            this.e = i + 1;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
            numValueOf.getClass();
            g(i, ulaVar, ulaVar2);
            num = numValueOf;
        }
        return num.intValue();
    }

    public final int d(defpackage.uka ukaVar) {
        return this.h.b(ukaVar);
    }

    public final int e() {
        int size = this.e;
        if (size == 0) {
            size = this.c.size();
        }
        return defpackage.vab.c(size * 5, 1);
    }

    public final defpackage.ukz f(defpackage.uka ukaVar, int i) {
        return this.h.c(ukaVar, i);
    }

    public final void g(int i, defpackage.ula ulaVar, defpackage.ula ulaVar2) {
        this.b.put(ulaVar, java.lang.Integer.valueOf(i));
        while (true) {
            java.util.List list = this.c;
            if (i < list.size()) {
                list.set(i, ulaVar);
                this.d.set(i, ulaVar2);
                return;
            } else {
                list.add(null);
                this.d.add(null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006a A[LOOP:3: B:21:0x0068->B:22:0x006a, LOOP_END] */
    public final byte[] h() {
        int i;
        float f;
        float f2;
        java.util.List list;
        byte[] bArr;
        int iHSVToColor;
        float f3;
        int i2;
        float f4;
        float f5;
        int i3;
        int i4;
        defpackage.uhh uhhVar = this;
        java.util.List list2 = uhhVar.c;
        if (list2.isEmpty()) {
            return null;
        }
        int iE = uhhVar.e();
        int size = iE - (list2.size() * 5);
        byte[] bArr2 = new byte[iE * 128];
        defpackage.uhe uheVar = new defpackage.uhe(uhhVar, bArr2, size);
        int i5 = 2;
        int[] iArr = new int[2];
        int i6 = 0;
        while (i6 < list2.size()) {
            defpackage.ula ulaVar = (defpackage.ula) list2.get(i6);
            defpackage.uka ukaVarG = ulaVar.g(uhhVar.f);
            defpackage.uhg uhgVar = uhhVar.h;
            int iB = uhgVar.b(ukaVarG);
            int i7 = 0;
            while (true) {
                if (i7 >= 4) {
                    break;
                }
                if (i7 < iB) {
                    i2 = i5;
                    int i8 = 0;
                    f4 = 1.0f;
                    for (int i9 : uhgVar.c(ukaVarG, i7).e) {
                        i8 += i9;
                    }
                    if (i8 != 0) {
                        float f6 = i8;
                        f5 = 1.0f / (f6 + f6);
                    }
                    i3 = 0;
                    i4 = 0;
                    for (int i10 = 4; i3 < i10; i10 = 4) {
                        float f7 = f5 * 255.0f;
                        int iMin = java.lang.Math.min(255, (int) f7);
                        i4 = (i4 << 8) | iMin;
                        f5 = f7 - iMin;
                        i3++;
                    }
                    uheVar.a(i4);
                    uheVar.e = 0;
                    uheVar.d.clear();
                    i7++;
                    i5 = i2;
                } else {
                    i2 = i5;
                    f4 = 1.0f;
                }
                f5 = f4;
                i3 = 0;
                i4 = 0;
                while (i3 < i10) {
                    float f8 = f5 * 255.0f;
                    int iMin2 = java.lang.Math.min(255, (int) f8);
                    i4 = (i4 << 8) | iMin2;
                    f5 = f8 - iMin2;
                    i3++;
                }
                uheVar.a(i4);
                uheVar.e = 0;
                uheVar.d.clear();
                i7++;
                i5 = i2;
            }
            int i11 = i5;
            float f9 = 1.0f;
            int iMax = java.lang.Math.max(0, uhhVar.f);
            int iC = ulaVar.c(iMax) + iMax;
            int i12 = 0;
            while (true) {
                if (i12 >= 4) {
                    break;
                }
                int i13 = iMax + i12;
                if (i13 >= iC) {
                    i13 = iC - 1;
                }
                defpackage.uka ukaVarG2 = ulaVar.g(java.lang.Math.max(0, i13));
                int iB2 = uhgVar.b(ukaVarG2);
                int i14 = 0;
                for (int i15 = 4; i14 < i15; i15 = 4) {
                    if (i14 >= iB2) {
                        int i16 = i13 + 1;
                        list = list2;
                        while (true) {
                            if (i16 >= 4) {
                                bArr = bArr2;
                                iHSVToColor = 0;
                                break;
                            }
                            bArr = bArr2;
                            defpackage.uka ukaVarG3 = ulaVar.g(java.lang.Math.max(0, i16 >= iC ? iC - 1 : i16));
                            if (i14 < uhgVar.b(ukaVarG3)) {
                                iHSVToColor = uhgVar.c(ukaVarG3, i14).b;
                                break;
                            }
                            i16++;
                            bArr2 = bArr;
                        }
                    } else {
                        list = list2;
                        bArr = bArr2;
                        iHSVToColor = uhgVar.c(ukaVarG2, i14).b;
                    }
                    if (uhhVar.i.contains(ulaVar)) {
                        float[] fArr = uhhVar.j;
                        android.graphics.Color.colorToHSV(iHSVToColor, fArr);
                        f3 = f9;
                        fArr[i11] = java.lang.Math.min(f3, fArr[i11] * 1.5f);
                        iHSVToColor = android.graphics.Color.HSVToColor(fArr);
                    } else {
                        f3 = f9;
                    }
                    int i17 = (iHSVToColor << 8) | (iHSVToColor >>> 24);
                    uheVar.d.c(i17);
                    uheVar.a(i17);
                    i14++;
                    f9 = f3;
                    list2 = list;
                    bArr2 = bArr;
                }
                java.util.List list3 = list2;
                byte[] bArr3 = bArr2;
                char c = 0;
                iArr[0] = 0;
                iArr[1] = 0;
                int i18 = 0;
                while (i18 < 4) {
                    iArr[c] = iArr[c] << 8;
                    iArr[1] = iArr[1] << 8;
                    int iMin3 = i18 < iB2 ? (int) java.lang.Math.min(65535.0d, java.lang.Math.floor((uhgVar.c(ukaVarG2, i18).d / 255.0f) * 65535.0f)) : 0;
                    iArr[0] = iArr[0] | (iMin3 / 256);
                    iArr[1] = (iMin3 % 256) | iArr[1];
                    i18++;
                    c = 0;
                }
                int i19 = i11;
                for (int i20 = 0; i20 < i19; i20++) {
                    uheVar.a(iArr[i20]);
                }
                i12++;
                uhhVar = this;
                i11 = i19;
                list2 = list3;
                bArr2 = bArr3;
                f9 = 1.0f;
            }
            java.util.List list4 = list2;
            byte[] bArr4 = bArr2;
            int i21 = 1;
            for (int i22 = 0; i22 < 4; i22++) {
                uheVar.a(0);
            }
            defpackage.uka ukaVarG4 = ulaVar.g(iMax);
            int iB3 = uhgVar.b(ukaVarG4);
            int i23 = 0;
            for (int i24 = 4; i23 < i24; i24 = 4) {
                int[] iArr2 = i23 < iB3 ? uhgVar.c(ukaVarG4, i23).e : a;
                byte[] bArr5 = new byte[32];
                if (iArr2.length == 0) {
                    java.util.Arrays.fill(bArr5, 0, 32, (byte) -1);
                } else {
                    int i25 = 0;
                    for (int i26 : iArr2) {
                        i25 += i26;
                    }
                    float f10 = uheVar.f.g;
                    int i27 = 0;
                    while (i27 < 32) {
                        int length = iArr2.length;
                        if ((length & 1) == i21) {
                            length += length;
                            i = i25 + i25;
                        } else {
                            i = i25;
                        }
                        float f11 = i27;
                        defpackage.uka ukaVar = ukaVarG4;
                        int i28 = iB3;
                        int i29 = 0;
                        boolean z = true;
                        int i30 = 0;
                        while (true) {
                            if (i29 >= length) {
                                throw new java.lang.IllegalStateException("Couldn't find dash");
                            }
                            int i31 = i29;
                            int i32 = iArr2[i31 % iArr2.length] + i30;
                            f = (i * f11) / 32.0f;
                            int i33 = i;
                            f2 = i32;
                            if (f <= f2) {
                                break;
                            }
                            z = !z;
                            i30 = i32;
                            i29 = i31 + 1;
                            i = i33;
                        }
                        float f12 = 8.0f / f10;
                        float f13 = f - i30;
                        float f14 = f2 - f;
                        bArr5[i27] = (byte) java.lang.Math.round(((f13 <= f12 || f14 <= f12) ? 0.5f + ((java.lang.Math.min(f13, f14) / f12) * (true != z ? -0.5f : 0.5f)) : z ? 1.0f : com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) * 255.0f);
                        i27++;
                        ukaVarG4 = ukaVar;
                        iB3 = i28;
                        i21 = 1;
                    }
                }
                defpackage.uka ukaVar2 = ukaVarG4;
                int i34 = iB3;
                int iM = uheVar.d.m(uheVar.e);
                for (int i35 = 0; i35 < 32; i35++) {
                    uheVar.a(((bArr5[i35] & 255) * (iM & 255)) / 255);
                }
                i21 = 1;
                uheVar.e++;
                i23++;
                ukaVarG4 = ukaVar2;
                iB3 = i34;
            }
            i6++;
            uhhVar = this;
            list2 = list4;
            bArr2 = bArr4;
            i5 = 2;
        }
        byte[] bArr6 = bArr2;
        for (int i36 = 0; i36 < uheVar.c; i36++) {
            for (int i37 = 0; i37 < 32; i37++) {
                uheVar.a(0);
            }
        }
        uheVar.b = 0;
        return bArr6;
    }
}
