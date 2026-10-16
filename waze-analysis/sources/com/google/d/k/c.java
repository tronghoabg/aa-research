package com.google.d.k;

import com.google.d.b.an;
import com.google.d.b.p;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final p f7942a = p.h('.');

    /* renamed from: b, reason: collision with root package name */
    private static final p f7943b = p.h(':');

    static {
    }

    public static InetAddress a(String str) {
        b bVar = new b();
        byte[] bArrF = f(str, bVar);
        if (bArrF != null) {
            return e(bArrF, bVar.f7941a);
        }
        throw d("'%s' is not an IP string literal.", str);
    }

    public static boolean b(String str) {
        return f(str, null) != null;
    }

    public static boolean c(String str) throws SocketException, UnknownHostException {
        an.B(str);
        int i2 = 4;
        if (str.startsWith("[") && str.endsWith("]")) {
            str = str.substring(1, str.length() - 1);
            i2 = 16;
        }
        InetAddress inetAddressE = null;
        byte[] bArrF = f(str, null);
        if (bArrF != null && bArrF.length == i2) {
            inetAddressE = e(bArrF, null);
        }
        return inetAddressE != null;
    }

    private static IllegalArgumentException d(String str, Object... objArr) {
        return new IllegalArgumentException(String.format(Locale.ROOT, str, objArr));
    }

    private static InetAddress e(byte[] bArr, String str) throws SocketException, UnknownHostException {
        try {
            InetAddress byAddress = InetAddress.getByAddress(bArr);
            if (str == null) {
                return byAddress;
            }
            an.m(byAddress instanceof Inet6Address, "Unexpected state, scope should only appear for ipv6");
            Inet6Address inet6Address = (Inet6Address) byAddress;
            int length = str.length();
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (i2 <= 214748364) {
                    int i4 = i2 * 10;
                    int iDigit = Character.digit(str.charAt(i3), 10);
                    if (iDigit >= 0) {
                        i2 = i4 + iDigit;
                    }
                }
                i2 = -1;
            }
            if (i2 != -1) {
                return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), i2);
            }
            try {
                NetworkInterface byName = NetworkInterface.getByName(str);
                if (byName != null) {
                    return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), byName);
                }
                throw d("No such interface: '%s'", str);
            } catch (SocketException | UnknownHostException e2) {
                throw new IllegalArgumentException("No such interface: " + str, e2);
            }
        } catch (UnknownHostException e3) {
            throw new AssertionError(e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x015b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0160, code lost:
    
        return g(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0161, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        if (r3 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
    
        if (r2 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        r2 = r13.lastIndexOf(58) + 1;
        r10 = r13.substring(0, r2);
        r13 = g(r13.substring(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r13 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        r13 = r10 + java.lang.Integer.toHexString(((r13[0] & 255) << 8) | (r13[1] & 255)) + ":" + java.lang.Integer.toHexString((r13[3] & 255) | ((r13[2] & 255) << 8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        if (r13 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
    
        if (r1 == (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        if (r14 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        r14.f7941a = r13.substring(r1 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        r13 = r13.substring(0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
    
        r14 = com.google.d.k.c.f7943b.c(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        if (r14 < 2) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        if (r14 <= 8) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
    
        r14 = r14 + 1;
        r1 = 8 - r14;
        r2 = 0;
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ac, code lost:
    
        if (r2 >= (r13.length() - 1)) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b2, code lost:
    
        if (r13.charAt(r2) != ':') goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ba, code lost:
    
        if (r13.charAt(r2 + 1) != ':') goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bc, code lost:
    
        if (r3 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00be, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bf, code lost:
    
        r3 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        if (r2 != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c3, code lost:
    
        r3 = r1 + 2;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cc, code lost:
    
        if (r2 != (r13.length() - 2)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ce, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d0, code lost:
    
        r1 = r3;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d2, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d8, code lost:
    
        if (r13.charAt(0) != ':') goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00de, code lost:
    
        if (r13.charAt(1) == ':') goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e0, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ea, code lost:
    
        if (r13.charAt(r13.length() - 1) != ':') goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f6, code lost:
    
        if (r13.charAt(r13.length() - 2) == ':') goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f8, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f9, code lost:
    
        if (r3 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fb, code lost:
    
        if (r1 > 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00fd, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00fe, code lost:
    
        if (r14 == 8) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0100, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0101, code lost:
    
        r14 = java.nio.ByteBuffer.allocate(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0109, code lost:
    
        if (r13.charAt(0) != ':') goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x010c, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0111, code lost:
    
        if (r9 >= r13.length()) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0113, code lost:
    
        r2 = r13.indexOf(58, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0117, code lost:
    
        if (r2 != (-1)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0119, code lost:
    
        r2 = r13.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0121, code lost:
    
        if (r13.charAt(r9) != ':') goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0123, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0124, code lost:
    
        if (r3 >= r1) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0126, code lost:
    
        r14.putShort(0);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x012c, code lost:
    
        r3 = r2 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x012e, code lost:
    
        if (r3 <= 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0131, code lost:
    
        if (r3 > 4) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0133, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0134, code lost:
    
        if (r9 >= r2) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0136, code lost:
    
        r3 = (r3 << 4) | java.lang.Character.digit(r13.charAt(r9), 16);
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0144, code lost:
    
        r14.putShort((short) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0148, code lost:
    
        r9 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0150, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0155, code lost:
    
        return r14.array();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0156, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0157, code lost:
    
        if (r2 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0159, code lost:
    
        if (r1 == (-1)) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] f(java.lang.String r13, com.google.d.k.b r14) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.k.c.f(java.lang.String, com.google.d.k.b):byte[]");
    }

    private static byte[] g(String str) {
        if (f7942a.c(str) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            int iIndexOf = str.indexOf(46, i2);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int i4 = iIndexOf - i2;
            if (i4 <= 0 || i4 > 3) {
                throw new NumberFormatException();
            }
            if (i4 > 1) {
                try {
                    if (str.charAt(i2) == '0') {
                        throw new NumberFormatException();
                    }
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
            int i5 = 0;
            while (i2 < iIndexOf) {
                int i6 = i5 * 10;
                int iDigit = Character.digit(str.charAt(i2), 10);
                if (iDigit < 0) {
                    throw new NumberFormatException();
                }
                i5 = i6 + iDigit;
                i2++;
            }
            if (i5 > 255) {
                throw new NumberFormatException();
            }
            bArr[i3] = (byte) i5;
            i2 = iIndexOf + 1;
        }
        return bArr;
    }
}
