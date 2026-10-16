package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aedq {
    public java.lang.String a;
    public java.lang.String b;
    public int c = -1;

    public static java.net.InetAddress b(java.lang.String str, int i) {
        java.net.InetAddress inetAddress;
        java.net.InetAddress inetAddress2;
        byte[] bArr = new byte[16];
        int i2 = 1;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        while (true) {
            java.net.InetAddress inetAddress3 = null;
            if (i2 < i) {
                if (i5 == 16) {
                    return null;
                }
                int i6 = i2 + 2;
                if (i6 > i || !str.regionMatches(i2, "::", 0, 2)) {
                    if (i5 == 0) {
                        i4 = i2;
                    } else {
                        if (!str.regionMatches(i2, ":", 0, 1)) {
                            if (!str.regionMatches(i2, ".", 0, 1)) {
                                return null;
                            }
                            int i7 = i5 - 2;
                            int i8 = i7;
                            while (i4 < i) {
                                if (i8 != 16) {
                                    if (i8 != i7) {
                                        if (str.charAt(i4) == '.') {
                                            i4++;
                                        }
                                    }
                                    int i9 = 0;
                                    int i10 = i4;
                                    while (true) {
                                        if (i10 >= i) {
                                            inetAddress2 = inetAddress3;
                                            break;
                                        }
                                        char cCharAt = str.charAt(i10);
                                        inetAddress2 = inetAddress3;
                                        if (cCharAt < '0' || cCharAt > '9') {
                                            break;
                                        }
                                        if (i9 == 0) {
                                            if (i4 != i10) {
                                                return inetAddress2;
                                            }
                                            i9 = 0;
                                        }
                                        i9 = ((i9 * 10) + cCharAt) - 48;
                                        if (i9 > 255) {
                                            return inetAddress2;
                                        }
                                        i10++;
                                        inetAddress3 = inetAddress2;
                                    }
                                    if (i10 - i4 == 0) {
                                        return inetAddress2;
                                    }
                                    bArr[i8] = (byte) i9;
                                    i8++;
                                    i4 = i10;
                                    inetAddress3 = inetAddress2;
                                }
                                return inetAddress3;
                            }
                            inetAddress = inetAddress3;
                            if (i8 != i5 + 2) {
                                return inetAddress;
                            }
                            i5 += 2;
                            break;
                        }
                        i4 = i2 + 1;
                    }
                } else {
                    if (i3 != -1) {
                        return null;
                    }
                    i5 += 2;
                    if (i6 == i) {
                        i3 = i5;
                    } else {
                        i3 = i5;
                        i4 = i6;
                    }
                }
                int i11 = 0;
                i2 = i4;
                while (i2 < i) {
                    int iA = defpackage.aedr.a(str.charAt(i2));
                    if (iA == -1) {
                        break;
                    }
                    i2++;
                    i11 = (i11 << 4) + iA;
                }
                int i12 = i2 - i4;
                if (i12 == 0 || i12 > 4) {
                    return 0;
                }
                int i13 = i5 + 1;
                bArr[i5] = (byte) (255 & (i11 >>> 8));
                i5 += 2;
                bArr[i13] = (byte) (i11 & 255);
            }
            inetAddress = null;
            break;
        }
        if (i5 != 16) {
            if (i3 == -1) {
                return inetAddress;
            }
            int i14 = i5 - i3;
            java.lang.System.arraycopy(bArr, i3, bArr, 16 - i14, i14);
            java.util.Arrays.fill(bArr, i3, (16 - i5) + i3, (byte) 0);
        }
        try {
            return java.net.InetAddress.getByAddress(bArr);
        } catch (java.net.UnknownHostException unused) {
            throw new java.lang.AssertionError();
        }
    }

    final int a() {
        int i = this.c;
        return i != -1 ? i : defpackage.aedr.b(this.a);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.a);
        sb.append("://");
        if (this.b.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.b);
            sb.append(']');
        } else {
            sb.append(this.b);
        }
        int iA = a();
        if (iA != defpackage.aedr.b(this.a)) {
            sb.append(':');
            sb.append(iA);
        }
        return sb.toString();
    }
}
