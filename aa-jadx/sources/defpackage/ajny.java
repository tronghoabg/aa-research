package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajny implements java.lang.Cloneable, java.nio.channels.ByteChannel, defpackage.ajoa, defpackage.ajnz {
    public defpackage.ajox a;
    public long b;

    @Override // defpackage.ajoa
    public final void A(long j) throws java.io.EOFException {
        while (j > 0) {
            defpackage.ajox ajoxVar = this.a;
            if (ajoxVar == null) {
                throw new java.io.EOFException();
            }
            int iMin = (int) java.lang.Math.min(j, ajoxVar.c - ajoxVar.b);
            long j2 = iMin;
            this.b -= j2;
            j -= j2;
            int i = ajoxVar.b + iMin;
            ajoxVar.b = i;
            if (i == ajoxVar.c) {
                this.a = ajoxVar.a();
                defpackage.ajoy.b(ajoxVar);
            }
        }
    }

    @Override // defpackage.ajoa
    public final boolean B() {
        return this.b == 0;
    }

    @Override // defpackage.ajoa
    public final boolean C(long j) {
        throw null;
    }

    public final byte[] D() {
        return E(this.b);
    }

    public final byte[] E(long j) throws java.io.EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bM(j, "byteCount: "));
        }
        if (this.b < j) {
            throw new java.io.EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int iE = e(bArr, i2, i - i2);
            if (iE == -1) {
                throw new java.io.EOFException();
            }
            i2 += iE;
        }
        return bArr;
    }

    public final void F(defpackage.ajny ajnyVar, long j, long j2) {
        long j3 = j;
        defpackage.aiqt.d(this.b, j3, j2);
        if (j2 == 0) {
            return;
        }
        ajnyVar.b += j2;
        defpackage.ajox ajoxVar = this.a;
        while (true) {
            ajoxVar.getClass();
            long j4 = ajoxVar.c - ajoxVar.b;
            if (j3 < j4) {
                break;
            }
            ajoxVar = ajoxVar.f;
            j3 -= j4;
        }
        long j5 = j2;
        while (j5 > 0) {
            ajoxVar.getClass();
            defpackage.ajox ajoxVarB = ajoxVar.b();
            int i = ajoxVarB.b + ((int) j3);
            ajoxVarB.b = i;
            ajoxVarB.c = java.lang.Math.min(i + ((int) j5), ajoxVarB.c);
            defpackage.ajox ajoxVar2 = ajnyVar.a;
            if (ajoxVar2 == null) {
                ajoxVarB.g = ajoxVarB;
                ajoxVarB.f = ajoxVarB.g;
                ajnyVar.a = ajoxVarB.f;
            } else {
                defpackage.ajox ajoxVar3 = ajoxVar2.g;
                ajoxVar3.getClass();
                ajoxVar3.d(ajoxVarB);
            }
            j5 -= (long) (ajoxVarB.c - ajoxVarB.b);
            ajoxVar = ajoxVar.f;
            j3 = 0;
        }
    }

    @Override // defpackage.ajoa
    public final long G(defpackage.ajob ajobVar) throws java.io.IOException {
        ajobVar.getClass();
        byte[] bArr = defpackage.ajpg.a;
        return defpackage.ajpg.b(this, ajobVar, 0L, 1024L, ajobVar.c());
    }

    @Override // defpackage.ajoa
    public final boolean H(defpackage.ajob ajobVar) {
        ajobVar.getClass();
        return I(0L, ajobVar, ajobVar.c());
    }

    public final boolean I(long j, defpackage.ajob ajobVar, int i) {
        if (i >= 0 && j >= 0 && ((long) i) + j <= this.b && i <= ajobVar.c()) {
            return i == 0 || defpackage.ajpg.b(this, ajobVar, j, j + 1, i) != -1;
        }
        return false;
    }

    @Override // defpackage.ajoa
    public final void J(defpackage.ajpa ajpaVar) throws java.io.IOException {
        long j = this.b;
        if (j > 0) {
            ajpaVar.a(this, j);
        }
    }

    public final void K(defpackage.ajob ajobVar) {
        ajobVar.getClass();
        ajobVar.q(this, ajobVar.c());
    }

    public final void L(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        defpackage.aiqt.d(bArr.length, i, j);
        int i3 = i;
        while (true) {
            int i4 = i + i2;
            if (i3 >= i4) {
                this.b += j;
                return;
            }
            defpackage.ajox ajoxVarV = v(1);
            int i5 = 8192 - ajoxVarV.c;
            byte[] bArr2 = ajoxVarV.a;
            int iMin = java.lang.Math.min(i4 - i3, i5);
            int i6 = i3 + iMin;
            defpackage.afga.ch(bArr, bArr2, ajoxVarV.c, i3, i6);
            ajoxVarV.c += iMin;
            i3 = i6;
        }
    }

    public final void M(defpackage.ajpc ajpcVar) throws java.io.IOException {
        while (ajpcVar.hg(this, 8192L) != -1) {
        }
    }

    public final void N(int i) {
        defpackage.ajox ajoxVarV = v(1);
        byte[] bArr = ajoxVarV.a;
        int i2 = ajoxVarV.c;
        ajoxVarV.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    public final void O(int i) {
        defpackage.ajox ajoxVarV = v(4);
        byte[] bArr = ajoxVarV.a;
        int i2 = ajoxVarV.c;
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        ajoxVarV.c = i2 + 4;
        this.b += 4;
    }

    @Override // defpackage.ajnz
    public final /* bridge */ /* synthetic */ void P(int i) throws java.io.IOException {
        throw null;
    }

    @Override // defpackage.ajnz
    public final /* bridge */ /* synthetic */ void Q(int i) throws java.io.IOException {
        throw null;
    }

    public final void R(java.io.OutputStream outputStream, long j) throws java.io.IOException {
        outputStream.getClass();
        defpackage.aiqt.d(this.b, 0L, j);
        defpackage.ajox ajoxVar = this.a;
        long j2 = j;
        while (j2 > 0) {
            ajoxVar.getClass();
            int iMin = (int) java.lang.Math.min(j2, ajoxVar.c - ajoxVar.b);
            outputStream.write(ajoxVar.a, ajoxVar.b, iMin);
            int i = ajoxVar.b + iMin;
            ajoxVar.b = i;
            long j3 = iMin;
            this.b -= j3;
            j2 -= j3;
            if (i == ajoxVar.c) {
                defpackage.ajox ajoxVarA = ajoxVar.a();
                this.a = ajoxVarA;
                defpackage.ajoy.b(ajoxVar);
                ajoxVar = ajoxVarA;
            }
        }
    }

    public final void S(java.lang.String str, int i, int i2) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "beginIndex < 0: "));
        }
        if (i2 < i) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bn(i, i2, "endIndex < beginIndex: ", " < "));
        }
        if (i2 > str.length()) {
            throw new java.lang.IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                defpackage.ajox ajoxVarV = v(1);
                byte[] bArr = ajoxVarV.a;
                int i4 = ajoxVarV.c - i;
                int iMin = java.lang.Math.min(i2, 8192 - i4);
                bArr[i + i4] = (byte) cCharAt;
                i = i3;
                while (i < iMin) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i + i4] = (byte) cCharAt2;
                    i++;
                }
                int i5 = ajoxVarV.c;
                int i6 = (i4 + i) - i5;
                ajoxVarV.c = i5 + i6;
                this.b += (long) i6;
            } else {
                if (cCharAt < 2048) {
                    defpackage.ajox ajoxVarV2 = v(2);
                    byte[] bArr2 = ajoxVarV2.a;
                    int i7 = ajoxVarV2.c;
                    bArr2[i7] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt & '?') | 128);
                    ajoxVarV2.c = i7 + 2;
                    this.b += 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    defpackage.ajox ajoxVarV3 = v(3);
                    byte[] bArr3 = ajoxVarV3.a;
                    int i8 = ajoxVarV3.c;
                    bArr3[i8] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt & '?') | 128);
                    ajoxVarV3.c = i8 + 3;
                    this.b += 3;
                } else {
                    char cCharAt3 = i3 < i2 ? str.charAt(i3) : (char) 0;
                    if (cCharAt > 56319 || cCharAt3 < 56320 || cCharAt3 >= 57344) {
                        N(63);
                    } else {
                        defpackage.ajox ajoxVarV4 = v(4);
                        byte[] bArr4 = ajoxVarV4.a;
                        int i9 = ajoxVarV4.c;
                        int i10 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        bArr4[i9] = (byte) ((i10 >> 18) | 240);
                        bArr4[i9 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i9 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i9 + 3] = (byte) ((i10 & 63) | 128);
                        ajoxVarV4.c = i9 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i = i3;
            }
        }
    }

    public final void T(int i) {
        if (i < 128) {
            N(i);
            return;
        }
        if (i < 2048) {
            defpackage.ajox ajoxVarV = v(2);
            byte[] bArr = ajoxVarV.a;
            int i2 = ajoxVarV.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            ajoxVarV.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (i >= 55296 && i < 57344) {
            N(63);
            return;
        }
        if (i < 65536) {
            defpackage.ajox ajoxVarV2 = v(3);
            byte[] bArr2 = ajoxVarV2.a;
            int i3 = ajoxVarV2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            ajoxVarV2.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i > 1114111) {
            throw new java.lang.IllegalArgumentException("Unexpected code point: 0x".concat(defpackage.aiqt.c(i)));
        }
        defpackage.ajox ajoxVarV3 = v(4);
        byte[] bArr3 = ajoxVarV3.a;
        int i4 = ajoxVarV3.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        ajoxVarV3.c = i4 + 4;
        this.b += 4;
    }

    public final void U(long j) {
        if (j == 0) {
            N(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) >> 2);
        defpackage.ajox ajoxVarV = v(i);
        byte[] bArr = ajoxVarV.a;
        int i2 = ajoxVarV.c;
        int i3 = i2 + i;
        while (true) {
            i3--;
            if (i3 < i2) {
                ajoxVarV.c += i;
                this.b += (long) i;
                return;
            } else {
                bArr[i3] = defpackage.ajpg.a[(int) (15 & j)];
                j >>>= 4;
            }
        }
    }

    public final void V(java.lang.String str) {
        str.getClass();
        S(str, 0, str.length());
    }

    @Override // defpackage.ajnz
    public final /* bridge */ /* synthetic */ void W(int i) throws java.io.IOException {
        throw null;
    }

    public final void X(long j) {
        boolean z;
        if (j == 0) {
            N(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                V("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = defpackage.ajpg.a;
        int iNumberOfLeadingZeros = ((64 - java.lang.Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > defpackage.ajpg.b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        defpackage.ajox ajoxVarV = v(i);
        byte[] bArr2 = ajoxVarV.a;
        int i2 = ajoxVarV.c + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = defpackage.ajpg.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        ajoxVarV.c += i;
        this.b += (long) i;
    }

    @Override // defpackage.ajnz
    public final /* bridge */ /* synthetic */ void Y(long j) throws java.io.IOException {
        throw null;
    }

    @Override // defpackage.ajnz
    public final /* bridge */ /* synthetic */ void Z(java.lang.String str) throws java.io.IOException {
        throw null;
    }

    @Override // defpackage.ajpa
    public final void a(defpackage.ajny ajnyVar, long j) {
        defpackage.ajox ajoxVarB;
        ajnyVar.getClass();
        if (ajnyVar == this) {
            throw new java.lang.IllegalArgumentException("source == this");
        }
        defpackage.aiqt.d(ajnyVar.b, 0L, j);
        while (j > 0) {
            defpackage.ajox ajoxVar = ajnyVar.a;
            ajoxVar.getClass();
            int i = ajoxVar.c;
            ajoxVar.getClass();
            int i2 = i - ajoxVar.b;
            int i3 = 0;
            if (j < i2) {
                defpackage.ajox ajoxVar2 = this.a;
                defpackage.ajox ajoxVar3 = ajoxVar2 != null ? ajoxVar2.g : null;
                int i4 = (int) j;
                if (ajoxVar3 != null && ajoxVar3.e) {
                    if ((((long) ajoxVar3.c) + j) - ((long) (ajoxVar3.d ? 0 : ajoxVar3.b)) <= 8192) {
                        ajoxVar.getClass();
                        ajoxVar.c(ajoxVar3, i4);
                        ajnyVar.b -= j;
                        this.b += j;
                        return;
                    }
                }
                ajoxVar.getClass();
                if (i4 > i2) {
                    throw new java.lang.IllegalArgumentException("byteCount out of range");
                }
                if (i4 >= 1024) {
                    ajoxVarB = ajoxVar.b();
                } else {
                    byte[] bArr = ajoxVar.a;
                    defpackage.ajox ajoxVarA = defpackage.ajoy.a();
                    byte[] bArr2 = ajoxVarA.a;
                    int i5 = ajoxVar.b;
                    defpackage.afga.ch(bArr, bArr2, 0, i5, i5 + i4);
                    ajoxVarB = ajoxVarA;
                }
                ajoxVarB.c = ajoxVarB.b + i4;
                ajoxVar.b += i4;
                defpackage.ajox ajoxVar4 = ajoxVar.g;
                ajoxVar4.getClass();
                ajoxVar4.d(ajoxVarB);
                ajnyVar.a = ajoxVarB;
            }
            defpackage.ajox ajoxVar5 = ajnyVar.a;
            ajoxVar5.getClass();
            int i6 = ajoxVar5.c - ajoxVar5.b;
            ajnyVar.a = ajoxVar5.a();
            defpackage.ajox ajoxVar6 = this.a;
            if (ajoxVar6 == null) {
                this.a = ajoxVar5;
                ajoxVar5.g = ajoxVar5;
                ajoxVar5.f = ajoxVar5.g;
            } else {
                defpackage.ajox ajoxVar7 = ajoxVar6.g;
                ajoxVar7.getClass();
                ajoxVar7.d(ajoxVar5);
                defpackage.ajox ajoxVar8 = ajoxVar5.g;
                if (ajoxVar8 == ajoxVar5) {
                    throw new java.lang.IllegalStateException("cannot compact");
                }
                ajoxVar8.getClass();
                if (ajoxVar8.e) {
                    int i7 = ajoxVar5.c - ajoxVar5.b;
                    ajoxVar8.getClass();
                    int i8 = 8192 - ajoxVar8.c;
                    ajoxVar8.getClass();
                    if (!ajoxVar8.d) {
                        ajoxVar8.getClass();
                        i3 = ajoxVar8.b;
                    }
                    if (i7 <= i8 + i3) {
                        ajoxVar8.getClass();
                        ajoxVar5.c(ajoxVar8, i7);
                        ajoxVar5.a();
                        defpackage.ajoy.b(ajoxVar5);
                    }
                }
            }
            long j2 = i6;
            ajnyVar.b -= j2;
            this.b += j2;
            j -= j2;
        }
    }

    public final byte c(long j) {
        defpackage.aiqt.d(this.b, j, 1L);
        defpackage.ajox ajoxVar = this.a;
        ajoxVar.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                ajoxVar = ajoxVar.g;
                ajoxVar.getClass();
                j2 -= (long) (ajoxVar.c - ajoxVar.b);
            }
            ajoxVar.getClass();
            return ajoxVar.a[(int) ((((long) ajoxVar.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = ajoxVar.c;
            int i2 = ajoxVar.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                ajoxVar.getClass();
                return ajoxVar.a[(int) ((((long) i2) + j) - j3)];
            }
            ajoxVar = ajoxVar.f;
            ajoxVar.getClass();
            j3 = j4;
        }
    }

    public final /* synthetic */ java.lang.Object clone() {
        defpackage.ajny ajnyVar = new defpackage.ajny();
        if (this.b == 0) {
            return ajnyVar;
        }
        defpackage.ajox ajoxVar = this.a;
        ajoxVar.getClass();
        defpackage.ajox ajoxVarB = ajoxVar.b();
        ajnyVar.a = ajoxVarB;
        ajoxVarB.g = ajoxVarB;
        ajoxVarB.f = ajoxVarB.g;
        for (defpackage.ajox ajoxVar2 = ajoxVar.f; ajoxVar2 != ajoxVar; ajoxVar2 = ajoxVar2.f) {
            defpackage.ajox ajoxVar3 = ajoxVarB.g;
            ajoxVar3.getClass();
            ajoxVar2.getClass();
            ajoxVar3.d(ajoxVar2.b());
        }
        ajnyVar.b = this.b;
        return ajnyVar;
    }

    @Override // defpackage.ajoa
    public final byte d() throws java.io.EOFException {
        long j = this.b;
        if (j == 0) {
            throw new java.io.EOFException();
        }
        defpackage.ajox ajoxVar = this.a;
        ajoxVar.getClass();
        int i = ajoxVar.b;
        int i2 = i + 1;
        byte[] bArr = ajoxVar.a;
        int i3 = ajoxVar.c;
        byte b = bArr[i];
        this.b = j - 1;
        if (i2 != i3) {
            ajoxVar.b = i2;
            return b;
        }
        this.a = ajoxVar.a();
        defpackage.ajoy.b(ajoxVar);
        return b;
    }

    public final int e(byte[] bArr, int i, int i2) {
        bArr.getClass();
        defpackage.aiqt.d(bArr.length, i, i2);
        defpackage.ajox ajoxVar = this.a;
        if (ajoxVar == null) {
            return -1;
        }
        int iMin = java.lang.Math.min(i2, ajoxVar.c - ajoxVar.b);
        int i3 = ajoxVar.b;
        defpackage.afga.ch(ajoxVar.a, bArr, i, i3, i3 + iMin);
        int i4 = ajoxVar.b + iMin;
        ajoxVar.b = i4;
        this.b -= (long) iMin;
        if (i4 != ajoxVar.c) {
            return iMin;
        }
        this.a = ajoxVar.a();
        defpackage.ajoy.b(ajoxVar);
        return iMin;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ajny)) {
            return false;
        }
        long j = this.b;
        defpackage.ajny ajnyVar = (defpackage.ajny) obj;
        if (j != ajnyVar.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        defpackage.ajox ajoxVar = this.a;
        ajoxVar.getClass();
        defpackage.ajox ajoxVar2 = ajnyVar.a;
        ajoxVar2.getClass();
        int i = ajoxVar.b;
        int i2 = ajoxVar2.b;
        long j2 = 0;
        while (j2 < this.b) {
            long jMin = java.lang.Math.min(ajoxVar.c - i, ajoxVar2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (ajoxVar.a[i] != ajoxVar2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == ajoxVar.c) {
                ajoxVar = ajoxVar.f;
                ajoxVar.getClass();
                i = ajoxVar.b;
            }
            if (i2 == ajoxVar2.c) {
                ajoxVar2 = ajoxVar2.f;
                ajoxVar2.getClass();
                i2 = ajoxVar2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // defpackage.ajoa
    public final int f() throws java.io.EOFException {
        long j = this.b;
        if (j < 4) {
            throw new java.io.EOFException();
        }
        defpackage.ajox ajoxVar = this.a;
        ajoxVar.getClass();
        int i = ajoxVar.b;
        int i2 = ajoxVar.c;
        if (i2 - i < 4) {
            return (d() & 255) | ((d() & 255) << 24) | ((d() & 255) << 16) | ((d() & 255) << 8);
        }
        byte[] bArr = ajoxVar.a;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = (bArr[i + 1] & 255) << 16;
        int i5 = (bArr[i + 2] & 255) << 8;
        int i6 = bArr[i + 3] & 255;
        this.b = j - 4;
        int i7 = i3 | i4 | i5 | i6;
        int i8 = i + 4;
        if (i8 != i2) {
            ajoxVar.b = i8;
            return i7;
        }
        this.a = ajoxVar.a();
        defpackage.ajoy.b(ajoxVar);
        return i7;
    }

    @Override // defpackage.ajoa
    public final int g() throws java.io.EOFException {
        throw null;
    }

    public final long h() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        defpackage.ajox ajoxVar = this.a;
        ajoxVar.getClass();
        defpackage.ajox ajoxVar2 = ajoxVar.g;
        ajoxVar2.getClass();
        int i = ajoxVar2.c;
        return (i >= 8192 || !ajoxVar2.e) ? j : j - ((long) (i - ajoxVar2.b));
    }

    public final int hashCode() {
        defpackage.ajox ajoxVar = this.a;
        if (ajoxVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = ajoxVar.c;
            for (int i3 = ajoxVar.b; i3 < i2; i3++) {
                i = (i * 31) + ajoxVar.a[i3];
            }
            ajoxVar = ajoxVar.f;
            ajoxVar.getClass();
        } while (ajoxVar != this.a);
        return i;
    }

    @Override // defpackage.ajpc
    public final long hg(defpackage.ajny ajnyVar, long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bM(j, "byteCount < 0: "));
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        ajnyVar.a(this, j);
        return j;
    }

    @Override // defpackage.ajpc
    public final defpackage.ajpe hh() {
        return defpackage.ajpe.k;
    }

    public final long i(byte b, long j, long j2) {
        defpackage.ajox ajoxVar;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (j3 < 0 || j3 > j4) {
            throw new java.lang.IllegalArgumentException("size=" + this.b + " fromIndex=" + j3 + " toIndex=" + j4);
        }
        long j6 = this.b;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (ajoxVar = this.a) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                ajoxVar = ajoxVar.g;
                ajoxVar.getClass();
                j6 -= (long) (ajoxVar.c - ajoxVar.b);
            }
            if (ajoxVar == null) {
                return -1L;
            }
            while (j6 < j4) {
                byte[] bArr = ajoxVar.a;
                long j8 = j7;
                int iMin = (int) java.lang.Math.min(ajoxVar.c, (((long) ajoxVar.b) + j4) - j6);
                for (int i = (int) ((((long) ajoxVar.b) + j3) - j6); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - ajoxVar.b)) + j6;
                    }
                }
                j6 += (long) (ajoxVar.c - ajoxVar.b);
                ajoxVar = ajoxVar.f;
                ajoxVar.getClass();
                j7 = j8;
                j3 = j6;
            }
            return j7;
        }
        while (true) {
            long j9 = ((long) (ajoxVar.c - ajoxVar.b)) + j5;
            if (j9 > j3) {
                break;
            }
            ajoxVar = ajoxVar.f;
            ajoxVar.getClass();
            j5 = j9;
        }
        if (ajoxVar == null) {
            return -1L;
        }
        while (j5 < j4) {
            byte[] bArr2 = ajoxVar.a;
            int iMin2 = (int) java.lang.Math.min(ajoxVar.c, (((long) ajoxVar.b) + j4) - j5);
            for (int i2 = (int) ((((long) ajoxVar.b) + j3) - j5); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - ajoxVar.b)) + j5;
                }
            }
            j5 += (long) (ajoxVar.c - ajoxVar.b);
            ajoxVar = ajoxVar.f;
            ajoxVar.getClass();
            j3 = j5;
        }
        return -1L;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final long j(defpackage.ajob ajobVar) {
        int i;
        int i2;
        ajobVar.getClass();
        defpackage.ajox ajoxVar = this.a;
        if (ajoxVar == null) {
            return -1L;
        }
        long j = this.b;
        long j2 = 0;
        if (j < 0) {
            while (j > 0) {
                ajoxVar = ajoxVar.g;
                ajoxVar.getClass();
                j -= (long) (ajoxVar.c - ajoxVar.b);
            }
            if (ajoxVar == null) {
                return -1L;
            }
            if (ajobVar.c() == 2) {
                byte bA = ajobVar.a(0);
                byte bA2 = ajobVar.a(1);
                while (j < this.b) {
                    byte[] bArr = ajoxVar.a;
                    long j3 = ((long) ajoxVar.b) + j2;
                    int i3 = ajoxVar.c;
                    i = (int) (j3 - j);
                    while (true) {
                        if (i >= i3) {
                            j2 = ((long) (ajoxVar.c - ajoxVar.b)) + j;
                            ajoxVar = ajoxVar.f;
                            ajoxVar.getClass();
                            j = j2;
                        } else {
                            byte b = bArr[i];
                            if (b == bA || b == bA2) {
                                i2 = ajoxVar.b;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                return -1L;
            }
            byte[] bArr2 = ajobVar.b;
            while (j < this.b) {
                byte[] bArr3 = ajoxVar.a;
                long j4 = ((long) ajoxVar.b) + j2;
                int i4 = ajoxVar.c;
                i = (int) (j4 - j);
                while (true) {
                    if (i < i4) {
                        byte b2 = bArr3[i];
                        int length = bArr2.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                i++;
                            } else if (b2 == bArr2[i5]) {
                                i2 = ajoxVar.b;
                            } else {
                                i5++;
                            }
                        }
                    } else {
                        j2 = ((long) (ajoxVar.c - ajoxVar.b)) + j;
                        ajoxVar = ajoxVar.f;
                        ajoxVar.getClass();
                        j = j2;
                    }
                }
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j5 = ((long) (ajoxVar.c - ajoxVar.b)) + j;
            if (j5 > 0) {
                break;
            }
            ajoxVar = ajoxVar.f;
            ajoxVar.getClass();
            j = j5;
        }
        if (ajoxVar == null) {
            return -1L;
        }
        if (ajobVar.c() == 2) {
            byte bA3 = ajobVar.a(0);
            byte bA4 = ajobVar.a(1);
            while (j < this.b) {
                byte[] bArr4 = ajoxVar.a;
                long j6 = ((long) ajoxVar.b) + j2;
                int i6 = ajoxVar.c;
                i = (int) (j6 - j);
                while (true) {
                    if (i >= i6) {
                        j2 = ((long) (ajoxVar.c - ajoxVar.b)) + j;
                        ajoxVar = ajoxVar.f;
                        ajoxVar.getClass();
                        j = j2;
                    } else {
                        byte b3 = bArr4[i];
                        if (b3 == bA3 || b3 == bA4) {
                            i2 = ajoxVar.b;
                        } else {
                            i++;
                        }
                    }
                }
            }
            return -1L;
        }
        byte[] bArr5 = ajobVar.b;
        while (j < this.b) {
            byte[] bArr6 = ajoxVar.a;
            long j7 = ((long) ajoxVar.b) + j2;
            int i7 = ajoxVar.c;
            i = (int) (j7 - j);
            while (true) {
                if (i < i7) {
                    byte b4 = bArr6[i];
                    int length2 = bArr5.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length2) {
                            i++;
                        } else if (b4 == bArr5[i8]) {
                            i2 = ajoxVar.b;
                        } else {
                            i8++;
                        }
                    }
                } else {
                    j2 = ((long) (ajoxVar.c - ajoxVar.b)) + j;
                    ajoxVar = ajoxVar.f;
                    ajoxVar.getClass();
                    j = j2;
                }
            }
        }
        return -1L;
        return ((long) (i - i2)) + j;
    }

    @Override // defpackage.ajoa
    public final long k() throws java.io.EOFException {
        throw null;
    }

    @Override // defpackage.ajoa
    public final java.io.InputStream l() {
        return new defpackage.ajnx(this);
    }

    public final java.lang.String m(long j, java.nio.charset.Charset charset) throws java.io.EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bM(j, "byteCount: "));
        }
        long j2 = this.b;
        if (j2 < j) {
            throw new java.io.EOFException();
        }
        if (j == 0) {
            return "";
        }
        defpackage.ajox ajoxVar = this.a;
        ajoxVar.getClass();
        int i = ajoxVar.b;
        int i2 = ajoxVar.c;
        if (((long) i) + j > i2) {
            return new java.lang.String(E(j), charset);
        }
        int i3 = (int) j;
        java.lang.String str = new java.lang.String(ajoxVar.a, i, i3, charset);
        int i4 = i + i3;
        ajoxVar.b = i4;
        this.b = j2 - j;
        if (i4 == i2) {
            this.a = ajoxVar.a();
            defpackage.ajoy.b(ajoxVar);
        }
        return str;
    }

    public final java.lang.String n() {
        return m(this.b, defpackage.aitd.a);
    }

    @Override // defpackage.ajoa
    public final java.lang.String o(long j) throws java.io.EOFException {
        return m(j, defpackage.aitd.a);
    }

    @Override // defpackage.ajoa
    public final java.lang.String p(long j) throws java.io.EOFException {
        throw null;
    }

    @Override // defpackage.ajoa
    public final defpackage.ajoa q() {
        throw null;
    }

    public final defpackage.ajob r() {
        return s(this.b);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        byteBuffer.getClass();
        defpackage.ajox ajoxVar = this.a;
        if (ajoxVar == null) {
            return -1;
        }
        int iMin = java.lang.Math.min(byteBuffer.remaining(), ajoxVar.c - ajoxVar.b);
        byteBuffer.put(ajoxVar.a, ajoxVar.b, iMin);
        int i = ajoxVar.b + iMin;
        ajoxVar.b = i;
        this.b -= (long) iMin;
        if (i == ajoxVar.c) {
            this.a = ajoxVar.a();
            defpackage.ajoy.b(ajoxVar);
        }
        return iMin;
    }

    @Override // defpackage.ajoa
    public final defpackage.ajob s(long j) throws java.io.EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bM(j, "byteCount: "));
        }
        if (this.b < j) {
            throw new java.io.EOFException();
        }
        if (j < 4096) {
            return new defpackage.ajob(E(j));
        }
        defpackage.ajob ajobVarU = u((int) j);
        A(j);
        return ajobVarU;
    }

    public final defpackage.ajob t() {
        long j = this.b;
        if (j <= 2147483647L) {
            return u((int) j);
        }
        throw new java.lang.IllegalStateException(defpackage.a.bM(j, "size > Int.MAX_VALUE: "));
    }

    public final java.lang.String toString() {
        return t().toString();
    }

    public final defpackage.ajob u(int i) {
        if (i == 0) {
            return defpackage.ajob.a;
        }
        defpackage.aiqt.d(this.b, 0L, i);
        defpackage.ajox ajoxVar = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            ajoxVar.getClass();
            int i5 = ajoxVar.c;
            int i6 = ajoxVar.b;
            if (i5 == i6) {
                throw new java.lang.AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            ajoxVar = ajoxVar.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 + i4];
        defpackage.ajox ajoxVar2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            ajoxVar2.getClass();
            bArr[i7] = ajoxVar2.a;
            i2 += ajoxVar2.c - ajoxVar2.b;
            iArr[i7] = java.lang.Math.min(i2, i);
            iArr[i7 + i4] = ajoxVar2.b;
            ajoxVar2.d = true;
            i7++;
            ajoxVar2 = ajoxVar2.f;
        }
        return new defpackage.ajoz(bArr, iArr);
    }

    public final defpackage.ajox v(int i) {
        if (i <= 0 || i > 8192) {
            throw new java.lang.IllegalArgumentException("unexpected capacity");
        }
        defpackage.ajox ajoxVar = this.a;
        if (ajoxVar == null) {
            defpackage.ajox ajoxVarA = defpackage.ajoy.a();
            this.a = ajoxVarA;
            ajoxVarA.g = ajoxVarA;
            ajoxVarA.f = ajoxVarA;
            return ajoxVarA;
        }
        defpackage.ajox ajoxVar2 = ajoxVar.g;
        ajoxVar2.getClass();
        if (ajoxVar2.c + i <= 8192 && ajoxVar2.e) {
            return ajoxVar2;
        }
        defpackage.ajox ajoxVarA2 = defpackage.ajoy.a();
        ajoxVar2.d(ajoxVarA2);
        return ajoxVarA2;
    }

    @Override // defpackage.ajoa
    public final short w() throws java.io.EOFException {
        int iD;
        long j = this.b;
        if (j < 2) {
            throw new java.io.EOFException();
        }
        defpackage.ajox ajoxVar = this.a;
        ajoxVar.getClass();
        int i = ajoxVar.b;
        int i2 = ajoxVar.c;
        if (i2 - i < 2) {
            iD = (d() & 255) | ((d() & 255) << 8);
        } else {
            byte[] bArr = ajoxVar.a;
            int i3 = (bArr[i] & 255) << 8;
            int i4 = bArr[i + 1] & 255;
            this.b = j - 2;
            int i5 = i + 2;
            if (i5 == i2) {
                this.a = ajoxVar.a();
                defpackage.ajoy.b(ajoxVar);
            } else {
                ajoxVar.b = i5;
            }
            iD = i3 | i4;
        }
        return (short) iD;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            defpackage.ajox ajoxVarV = v(1);
            int i2 = 8192 - ajoxVarV.c;
            byte[] bArr = ajoxVarV.a;
            int iMin = java.lang.Math.min(i, i2);
            byteBuffer.get(bArr, ajoxVarV.c, iMin);
            i -= iMin;
            ajoxVarV.c += iMin;
        }
        this.b += (long) iRemaining;
        return iRemaining;
    }

    @Override // defpackage.ajoa
    public final short x() throws java.io.EOFException {
        throw null;
    }

    public final void y() throws java.io.EOFException {
        A(this.b);
    }

    @Override // defpackage.ajoa
    public final void z(long j) throws java.io.EOFException {
        throw null;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.ajpc
    public final void close() {
    }

    @Override // defpackage.ajnz, defpackage.ajpa, java.io.Flushable
    public final void flush() {
    }
}
