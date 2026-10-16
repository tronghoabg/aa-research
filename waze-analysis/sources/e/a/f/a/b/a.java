package e.a.f.a.b;

import androidx.webkit.ProxyConfig;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import k.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    String f47545a;

    /* renamed from: b, reason: collision with root package name */
    String f47546b;

    /* renamed from: c, reason: collision with root package name */
    int f47547c = -1;

    /* JADX WARN: Code restructure failed: missing block: B:100:?, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008b, code lost:
    
        if ((r12 - r10) == 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008d, code lost:
    
        r3[r7] = (byte) r14;
        r7 = r7 + 1;
        r10 = r12;
        r11 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d5, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d7, code lost:
    
        if (r8 == 16) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d9, code lost:
    
        if (r9 != (-1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00db, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00dc, code lost:
    
        r0 = r8 - r9;
        java.lang.System.arraycopy(r3, r9, r3, 16 - r0, r0);
        java.util.Arrays.fill(r3, r9, (16 - r8) + r9, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ec, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f2, code lost:
    
        throw new java.lang.AssertionError();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.net.InetAddress f(java.lang.String r17, int r18) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.f.a.b.a.f(java.lang.String, int):java.net.InetAddress");
    }

    final int a() {
        int i2 = this.f47547c;
        return i2 != -1 ? i2 : b.b(this.f47545a);
    }

    public final b b() {
        if (this.f47545a == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (this.f47546b != null) {
            return new b(this);
        }
        throw new IllegalStateException("host == null");
    }

    public final void c(String str) {
        int i2;
        String strSubstring;
        if (str == null) {
            throw new IllegalArgumentException("host == null");
        }
        int i3 = 0;
        int iCharCount = 0;
        while (true) {
            int length = str.length();
            i2 = -1;
            if (iCharCount >= length) {
                strSubstring = str.substring(0, length);
                break;
            }
            if (str.charAt(iCharCount) != '%') {
                iCharCount++;
            } else {
                h hVar = new h();
                hVar.an(str, 0, iCharCount);
                while (iCharCount < length) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt != 37) {
                        hVar.ao(iCodePointAt);
                    } else {
                        int i4 = iCharCount + 2;
                        if (i4 < length) {
                            int iA = b.a(str.charAt(iCharCount + 1));
                            int iA2 = b.a(str.charAt(i4));
                            if (iA != -1 && iA2 != -1) {
                                hVar.ae((iA << 4) + iA2);
                                iCharCount = i4;
                                iCodePointAt = 37;
                            }
                        }
                        iCodePointAt = 37;
                        hVar.ao(iCodePointAt);
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                strSubstring = hVar.v();
            }
        }
        String strV = null;
        if (strSubstring.startsWith("[") && strSubstring.endsWith("]")) {
            InetAddress inetAddressF = f(strSubstring, strSubstring.length() - 1);
            if (inetAddressF != null) {
                byte[] address = inetAddressF.getAddress();
                if (address.length != 16) {
                    throw new AssertionError();
                }
                int i5 = 0;
                int i6 = 0;
                while (i5 < address.length) {
                    int i7 = i5;
                    while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                        i7 += 2;
                    }
                    int i8 = i7 - i5;
                    int i9 = i8 > i6 ? i8 : i6;
                    if (i8 > i6) {
                        i2 = i5;
                    }
                    i5 = i7 + 2;
                    i6 = i9;
                }
                h hVar2 = new h();
                while (i3 < address.length) {
                    if (i3 == i2) {
                        hVar2.ae(58);
                        i3 += i6;
                        if (i3 == 16) {
                            hVar2.ae(58);
                        }
                    } else {
                        if (i3 > 0) {
                            hVar2.ae(58);
                        }
                        hVar2.af(((address[i3] & 255) << 8) | (address[i3 + 1] & 255));
                        i3 += 2;
                    }
                }
                strV = hVar2.v();
            }
        } else {
            try {
                String lowerCase = IDN.toASCII(strSubstring).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty()) {
                    while (true) {
                        if (i3 >= lowerCase.length()) {
                            strV = lowerCase;
                            break;
                        }
                        char cCharAt = lowerCase.charAt(i3);
                        if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        if (strV == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        this.f47546b = strV;
    }

    public final void d(int i2) {
        if (i2 > 0 && i2 <= 65535) {
            this.f47547c = i2;
        } else {
            throw new IllegalArgumentException("unexpected port: " + i2);
        }
    }

    public final void e() {
        this.f47545a = ProxyConfig.MATCH_HTTPS;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f47545a);
        sb.append("://");
        if (this.f47546b.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.f47546b);
            sb.append(']');
        } else {
            sb.append(this.f47546b);
        }
        int iA = a();
        if (iA != b.b(this.f47545a)) {
            sb.append(':');
            sb.append(iA);
        }
        return sb.toString();
    }
}
