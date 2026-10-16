package okhttp3.internal;

import Bf.k;
import Bf.r;
import cg.C1618g;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import ka.AbstractC3256n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.metadata.TikaCoreProperties;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HostnamesKt {
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cc, code lost:
    
        if (r7 == 16) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ce, code lost:
    
        if (r8 != (-1)) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d2, code lost:
    
        r0 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r0, r0);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e2, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.net.InetAddress a(java.lang.String r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.HostnamesKt.a(java.lang.String, int, int):java.net.InetAddress");
    }

    public static final String b(String str) {
        AbstractC3340k.e(str, "<this>");
        int i5 = 0;
        int i10 = -1;
        if (!k.n0(str, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, false)) {
            try {
                String ascii = IDN.toASCII(str);
                AbstractC3340k.d(ascii, "toASCII(host)");
                Locale US = Locale.US;
                AbstractC3340k.d(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                AbstractC3340k.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i11 + 1;
                    char cCharAt = lowerCase.charAt(i11);
                    if (AbstractC3340k.g(cCharAt, 31) <= 0 || AbstractC3340k.g(cCharAt, 127) >= 0 || k.v0(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                        return null;
                    }
                    i11 = i12;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressA = (r.k0(str, "[", false) && r.b0(str, "]", false)) ? a(str, 1, str.length() - 1) : a(str, 0, str.length());
        if (inetAddressA == null) {
            return null;
        }
        byte[] address = inetAddressA.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressA.getHostAddress();
            }
            throw new AssertionError(AbstractC3256n.f('\'', "Invalid IPv6 address: '", str));
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < address.length) {
            int i15 = i13;
            while (i15 < 16 && address[i15] == 0 && address[i15 + 1] == 0) {
                i15 += 2;
            }
            int i16 = i15 - i13;
            if (i16 > i14 && i16 >= 4) {
                i10 = i13;
                i14 = i16;
            }
            i13 = i15 + 2;
        }
        C1618g c1618g = new C1618g();
        while (i5 < address.length) {
            if (i5 == i10) {
                c1618g.X(58);
                i5 += i14;
                if (i5 == 16) {
                    c1618g.X(58);
                }
            } else {
                if (i5 > 0) {
                    c1618g.X(58);
                }
                byte b5 = address[i5];
                byte[] bArr = Util.f42438a;
                c1618g.Z(((b5 & ForkServer.ERROR) << 8) | (address[i5 + 1] & ForkServer.ERROR));
                i5 += 2;
            }
        }
        return c1618g.readUtf8();
    }
}
