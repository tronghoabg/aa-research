package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zeb {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.xxv b = new defpackage.xxo('.');
    private static final defpackage.xxv c = new defpackage.xxo(':');

    static {
    }

    public static java.net.InetAddress a(byte[] bArr, java.lang.String str) {
        try {
            java.net.InetAddress byAddress = java.net.InetAddress.getByAddress(bArr);
            if (str == null) {
                return byAddress;
            }
            defpackage.ysr.aY(byAddress instanceof java.net.Inet6Address, "Unexpected state, scope should only appear for ipv6");
            java.net.Inet6Address inet6Address = (java.net.Inet6Address) byAddress;
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (i <= 214748364) {
                    int i3 = i * 10;
                    int iDigit = java.lang.Character.digit(str.charAt(i2), 10);
                    if (iDigit >= 0) {
                        i = i3 + iDigit;
                    }
                }
                i = -1;
            }
            if (i != -1) {
                return java.net.Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), i);
            }
            try {
                java.net.NetworkInterface byName = java.net.NetworkInterface.getByName(str);
                if (byName != null) {
                    return java.net.Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), byName);
                }
                throw e("No such interface: '%s'", str);
            } catch (java.net.SocketException | java.net.UnknownHostException e) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bA(str, "No such interface: "), e);
            }
        } catch (java.net.UnknownHostException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }

    public static java.net.InetAddress b(java.lang.String str) {
        sk skVar = new sk((byte[]) null);
        byte[] bArrD = d(str, skVar);
        if (bArrD != null) {
            return a(bArrD, (java.lang.String) skVar.a);
        }
        throw e("'%s' is not an IP string literal.", str);
    }

    public static boolean c(java.lang.String str) {
        return d(str, null) != null;
    }

    public static byte[] d(java.lang.String str, sk skVar) {
        int i;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            i = 1;
            if (i2 >= str.length()) {
                i2 = -1;
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt == '.') {
                z = true;
            } else if (cCharAt != ':') {
                if (cCharAt == '%') {
                    break;
                }
                if (java.lang.Character.digit(cCharAt, 16) == -1) {
                    return null;
                }
            } else {
                if (z) {
                    return null;
                }
                z = false;
                z2 = true;
            }
            i2++;
        }
        if (!z2) {
            if (z && i2 == -1) {
                return f(str);
            }
            return null;
        }
        if (z) {
            int iLastIndexOf = str.lastIndexOf(58) + 1;
            java.lang.String strSubstring = str.substring(0, iLastIndexOf);
            byte[] bArrF = f(str.substring(iLastIndexOf));
            str = bArrF == null ? null : strSubstring + java.lang.Integer.toHexString(((bArrF[0] & 255) << 8) | (bArrF[1] & 255)) + ":" + java.lang.Integer.toHexString((bArrF[3] & 255) | ((bArrF[2] & 255) << 8));
            if (str == null) {
                return null;
            }
        }
        if (i2 != -1) {
            if (skVar != null) {
                skVar.a = str.substring(i2 + 1);
            }
            str = str.substring(0, i2);
        }
        int iG = c.g(str);
        if (iG < 2 || iG > 8) {
            return null;
        }
        int i3 = iG + 1;
        int i4 = 8 - i3;
        int i5 = 0;
        boolean z3 = false;
        while (i5 < str.length() - 1) {
            if (str.charAt(i5) == ':' && str.charAt(i5 + 1) == ':') {
                if (z3) {
                    return null;
                }
                int i6 = i4 + 1;
                if (i5 == 0) {
                    i6 = i4 + 2;
                    i5 = 0;
                }
                if (i5 == str.length() - 2) {
                    i6++;
                }
                i4 = i6;
                z3 = true;
            }
            i5++;
        }
        if (str.charAt(0) == ':' && str.charAt(1) != ':') {
            return null;
        }
        if (str.charAt(str.length() - 1) == ':' && str.charAt(str.length() - 2) != ':') {
            return null;
        }
        if (z3) {
            if (i4 <= 0) {
                return null;
            }
        } else if (i3 != 8) {
            return null;
        }
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(16);
        try {
            if (str.charAt(0) != ':') {
                i = 0;
            }
            while (i < str.length()) {
                int iIndexOf = str.indexOf(58, i);
                if (iIndexOf == -1) {
                    iIndexOf = str.length();
                }
                if (str.charAt(i) == ':') {
                    for (int i7 = 0; i7 < i4; i7++) {
                        byteBufferAllocate.putShort((short) 0);
                    }
                } else {
                    int i8 = iIndexOf - i;
                    if (i8 <= 0 || i8 > 4) {
                        throw new java.lang.NumberFormatException();
                    }
                    int iDigit = 0;
                    while (i < iIndexOf) {
                        iDigit = (iDigit << 4) | java.lang.Character.digit(str.charAt(i), 16);
                        i++;
                    }
                    byteBufferAllocate.putShort((short) iDigit);
                }
                i = iIndexOf + 1;
            }
            return byteBufferAllocate.array();
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    private static java.lang.IllegalArgumentException e(java.lang.String str, java.lang.Object... objArr) {
        return new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.ROOT, str, objArr));
    }

    private static byte[] f(java.lang.String str) {
        if (b.g(str) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int iIndexOf = str.indexOf(46, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int i3 = iIndexOf - i;
            if (i3 <= 0 || i3 > 3) {
                throw new java.lang.NumberFormatException();
            }
            if (i3 > 1) {
                try {
                    if (str.charAt(i) == '0') {
                        throw new java.lang.NumberFormatException();
                    }
                } catch (java.lang.NumberFormatException unused) {
                    return null;
                }
            }
            int i4 = 0;
            while (i < iIndexOf) {
                int i5 = i4 * 10;
                int iDigit = java.lang.Character.digit(str.charAt(i), 10);
                if (iDigit < 0) {
                    throw new java.lang.NumberFormatException();
                }
                i4 = i5 + iDigit;
                i++;
            }
            if (i4 > 255) {
                throw new java.lang.NumberFormatException();
            }
            bArr[i2] = (byte) i4;
            i = iIndexOf + 1;
        }
        return bArr;
    }
}
