package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ajob implements java.io.Serializable, java.lang.Comparable {
    public static final defpackage.ajob a = new defpackage.ajob(new byte[0]);
    private static final long serialVersionUID = 1;
    public final byte[] b;
    public transient int c;
    public transient java.lang.String d;

    public ajob(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    private final void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.io.IOException {
        int i = objectInputStream.readInt();
        objectInputStream.getClass();
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "byteCount < 0: "));
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = objectInputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new java.io.EOFException();
            }
            i2 += i3;
        }
        defpackage.ajob ajobVar = new defpackage.ajob(bArr);
        java.lang.reflect.Field declaredField = defpackage.ajob.class.getDeclaredField("b");
        declaredField.setAccessible(true);
        declaredField.set(this, ajobVar.b);
    }

    private final void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.writeInt(this.b.length);
        objectOutputStream.write(this.b);
    }

    public byte a(int i) {
        return this.b[i];
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(defpackage.ajob ajobVar) {
        ajobVar.getClass();
        int iC = c();
        int iC2 = ajobVar.c();
        int iMin = java.lang.Math.min(iC, iC2);
        for (int i = 0; i < iMin; i++) {
            int iA = a(i) & 255;
            int iA2 = ajobVar.a(i) & 255;
            if (iA != iA2) {
                return iA >= iA2 ? 1 : -1;
            }
        }
        if (iC == iC2) {
            return 0;
        }
        return iC >= iC2 ? 1 : -1;
    }

    public int c() {
        return this.b.length;
    }

    public final int d(defpackage.ajob ajobVar, int i) {
        ajobVar.getClass();
        return e(ajobVar.b, i);
    }

    public int e(byte[] bArr, int i) {
        bArr.getClass();
        int length = this.b.length - bArr.length;
        int iMax = java.lang.Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!defpackage.aiqt.e(this.b, iMax, bArr, 0, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ajob) {
            defpackage.ajob ajobVar = (defpackage.ajob) obj;
            int iC = ajobVar.c();
            byte[] bArr = this.b;
            int length = bArr.length;
            return iC == length && ajobVar.l(0, bArr, 0, length);
        }
        return false;
    }

    public final java.lang.String f() {
        int length;
        int i;
        byte[] bArr = defpackage.ajnr.a;
        byte[] bArr2 = this.b;
        bArr2.getClass();
        bArr.getClass();
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = bArr2.length;
            i = length - (length % 3);
            if (i2 >= i) {
                break;
            }
            int i4 = i3 + 3;
            byte b = bArr2[i2];
            int i5 = i2 + 2;
            byte b2 = bArr2[i2 + 1];
            i2 += 3;
            byte b3 = bArr2[i5];
            bArr3[i3] = bArr[(b & 255) >> 2];
            bArr3[i3 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            bArr3[i3 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i3 += 4;
            bArr3[i4] = bArr[b3 & 63];
        }
        int i6 = length - i;
        if (i6 == 1) {
            byte b4 = bArr2[i2];
            bArr3[i3] = bArr[(b4 & 255) >> 2];
            bArr3[i3 + 1] = bArr[(b4 & 3) << 4];
            bArr3[i3 + 2] = 61;
            bArr3[i3 + 3] = 61;
        } else if (i6 == 2) {
            int i7 = i2 + 1;
            byte b5 = bArr2[i2];
            byte b6 = bArr2[i7];
            bArr3[i3] = bArr[(b5 & 255) >> 2];
            bArr3[i3 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i3 + 2] = bArr[(b6 & 15) << 2];
            bArr3[i3 + 3] = 61;
        }
        return defpackage.airw.a(bArr3);
    }

    public java.lang.String g() {
        byte[] bArr = this.b;
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            char[] cArr2 = defpackage.ajph.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            cArr[i + 1] = cArr2[b & 15];
            i += 2;
        }
        return new java.lang.String(cArr);
    }

    public java.lang.String h(java.nio.charset.Charset charset) {
        charset.getClass();
        return new java.lang.String(this.b, charset);
    }

    public int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int iHashCode = java.util.Arrays.hashCode(this.b);
        this.c = iHashCode;
        return iHashCode;
    }

    public final java.lang.String i() {
        java.lang.String str = this.d;
        if (str != null) {
            return str;
        }
        java.lang.String strA = defpackage.airw.a(n());
        this.d = strA;
        return strA;
    }

    public defpackage.ajob j(int i, int i2) {
        int iA = defpackage.aiqt.a(this, i2);
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.b;
        int length = bArr.length;
        if (iA > length) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bm(length, "endIndex > length(", ")"));
        }
        if (iA - i >= 0) {
            return (i == 0 && iA == length) ? this : new defpackage.ajob(defpackage.afga.bA(bArr, i, iA));
        }
        throw new java.lang.IllegalArgumentException("endIndex < beginIndex");
    }

    public defpackage.ajob k() {
        int i = 0;
        while (true) {
            byte[] bArr = this.b;
            int length = bArr.length;
            if (i >= length) {
                return this;
            }
            int i2 = i + 1;
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, length);
                bArrCopyOf.getClass();
                bArrCopyOf[i] = (byte) (b + 32);
                while (i2 < bArrCopyOf.length) {
                    int i3 = i2 + 1;
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                    i2 = i3;
                }
                return new defpackage.ajob(bArrCopyOf);
            }
            i = i2;
        }
    }

    public boolean l(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.b;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && defpackage.aiqt.e(bArr2, i, bArr, i2, i3);
    }

    public final boolean m(defpackage.ajob ajobVar) {
        ajobVar.getClass();
        return p(0, ajobVar, ajobVar.c());
    }

    public byte[] n() {
        return this.b;
    }

    public byte[] o() {
        byte[] bArr = this.b;
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        bArrCopyOf.getClass();
        return bArrCopyOf;
    }

    public boolean p(int i, defpackage.ajob ajobVar, int i2) {
        ajobVar.getClass();
        return ajobVar.l(0, this.b, i, i2);
    }

    public void q(defpackage.ajny ajnyVar, int i) {
        char[] cArr = defpackage.ajph.a;
        ajnyVar.L(this.b, 0, i);
    }

    public final defpackage.ajob r() throws java.security.NoSuchAlgorithmException {
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
        messageDigest.update(this.b, 0, c());
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new defpackage.ajob(bArrDigest);
    }

    public final int s(defpackage.ajob ajobVar) {
        ajobVar.getClass();
        return t(ajobVar.b);
    }

    public int t(byte[] bArr) {
        bArr.getClass();
        for (int iMin = java.lang.Math.min(defpackage.aiqt.a(this, -1234567890), this.b.length - bArr.length); iMin >= 0; iMin--) {
            if (defpackage.aiqt.e(this.b, iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0064 A[EDGE_INSN: B:40:0x0064->B:126:0x013d BREAK  A[LOOP:0: B:7:0x000f->B:34:0x004e]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0087 A[PHI: r4 r10
  0x0087: PHI (r4v9 int) = (r4v6 int), (r4v10 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]
  0x0087: PHI (r10v13 int) = (r10v10 int), (r10v17 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x008a A[PHI: r4 r10
  0x008a: PHI (r4v7 int) = (r4v6 int), (r4v10 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]
  0x008a: PHI (r10v11 int) = (r10v10 int), (r10v17 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    public java.lang.String toString() {
        int i;
        int i2;
        byte[] bArr = this.b;
        int length = bArr.length;
        if (length == 0) {
            return "[size=0]";
        }
        char[] cArr = defpackage.ajph.a;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        loop0: while (i3 < length) {
            byte b = bArr[i3];
            if (b >= 0) {
                i = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if (b == 10 || b == 13 || (b >= 32 && b < 127)) {
                    i5++;
                    i3++;
                    while (true) {
                        if (i3 >= length) {
                            continue;
                        } else {
                            byte b2 = bArr[i3];
                            if (b2 >= 0) {
                                i3++;
                                int i6 = i + 1;
                                if (i == 64) {
                                    break loop0;
                                }
                                if (b2 == 10 || b2 == 13 || (b2 >= 32 && b2 < 127)) {
                                    i5++;
                                    i = i6;
                                }
                            } else {
                                continue;
                            }
                        }
                        i4 = i;
                    }
                }
                i5 = -1;
                break;
            }
            if ((b >> 5) != -2) {
                if ((b >> 4) != -2) {
                    if ((b >> 3) != -2) {
                        if (i4 == 64) {
                            break;
                        }
                        i5 = -1;
                        break;
                    }
                    int i7 = i3 + 3;
                    if (length > i7) {
                        byte b3 = bArr[i3 + 1];
                        if ((b3 & 192) != 128) {
                            if (i4 == 64) {
                                break;
                            }
                            i5 = -1;
                            break;
                        }
                        byte b4 = bArr[i3 + 2];
                        if ((b4 & 192) != 128) {
                            if (i4 == 64) {
                                break;
                            }
                            i5 = -1;
                            break;
                        }
                        byte b5 = bArr[i7];
                        if ((b5 & 192) != 128) {
                            if (i4 == 64) {
                                break;
                            }
                            i5 = -1;
                            break;
                        }
                        int i8 = (((b5 ^ 3678080) ^ (b4 << 6)) ^ (b3 << 12)) ^ (b << 18);
                        if (i8 <= 1114111) {
                            if (i8 >= 55296 && i8 < 57344) {
                                if (i4 == 64) {
                                    break;
                                }
                                i5 = -1;
                                break;
                            }
                            if (i8 >= 65536) {
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                i5 += 2;
                                i3 += 4;
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i5 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i5 = -1;
                            break;
                        }
                    } else {
                        if (i4 == 64) {
                            break;
                        }
                        i5 = -1;
                        break;
                    }
                } else {
                    int i9 = i3 + 2;
                    if (length > i9) {
                        byte b6 = bArr[i3 + 1];
                        if ((b6 & 192) != 128) {
                            if (i4 == 64) {
                                break;
                            }
                            i5 = -1;
                            break;
                        }
                        byte b7 = bArr[i9];
                        if ((b7 & 192) != 128) {
                            if (i4 == 64) {
                                break;
                            }
                            i5 = -1;
                            break;
                        }
                        int i10 = ((b7 ^ (-123008)) ^ (b6 << 6)) ^ (b << 12);
                        if (i10 >= 2048) {
                            if (i10 >= 55296 && i10 < 57344) {
                                if (i4 == 64) {
                                    break;
                                }
                                i5 = -1;
                                break;
                            }
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if (i10 == 65533) {
                                i5 = -1;
                                break;
                            }
                            i3 += 3;
                            if (i10 < 65536) {
                                i2 = 1;
                            } else {
                                i2 = 2;
                            }
                            i5 += i2;
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i5 = -1;
                            break;
                        }
                    } else {
                        if (i4 == 64) {
                            break;
                        }
                        i5 = -1;
                        break;
                    }
                }
            } else {
                int i11 = i3 + 1;
                if (length > i11) {
                    byte b8 = bArr[i11];
                    if ((b8 & 192) != 128) {
                        if (i4 == 64) {
                            break;
                        }
                        i5 = -1;
                        break;
                    }
                    int i12 = (b << 6) ^ (b8 ^ 3968);
                    if (i12 >= 128) {
                        i = i4 + 1;
                        if (i4 != 64) {
                            if (i12 < 160 || i12 == 65533) {
                                i5 = -1;
                                break;
                            }
                            i3 += 2;
                            if (i12 < 65536) {
                                i2 = 1;
                            } else {
                                i2 = 2;
                            }
                            i5 += i2;
                        } else {
                            break;
                        }
                    } else {
                        if (i4 == 64) {
                            break;
                        }
                        i5 = -1;
                        break;
                    }
                } else {
                    if (i4 == 64) {
                        break;
                    }
                    i5 = -1;
                    break;
                }
            }
            i4 = i;
        }
        if (i5 != -1) {
            java.lang.String strI = i();
            java.lang.String strSubstring = strI.substring(0, i5);
            strSubstring.getClass();
            java.lang.String strJ = defpackage.afzh.J(defpackage.afzh.J(defpackage.afzh.J(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i5 >= strI.length()) {
                return defpackage.a.bp(strJ, "[text=", "]");
            }
            return "[size=" + this.b.length + " text=" + strJ + "…]";
        }
        byte[] bArr2 = this.b;
        int length2 = bArr2.length;
        if (length2 <= 64) {
            return "[hex=" + g() + "]";
        }
        return "[size=" + length2 + " hex=" + new defpackage.ajob(defpackage.afga.bA(bArr2, 0, 64)).g() + "…]";
    }
}
