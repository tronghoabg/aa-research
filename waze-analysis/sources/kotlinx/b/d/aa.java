package kotlinx.b.d;

import h.g.b.ar;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlinx.b.d.a.ae;
import okhttp3.av;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aa {
    public static final /* synthetic */ kotlinx.b.a.q a(h.g.a.a aVar) {
        return new o(aVar);
    }

    public static final j b(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "<this>");
        j jVar = eVar instanceof j ? (j) eVar : null;
        if (jVar != null) {
            return jVar;
        }
        Class<?> cls = eVar.getClass();
        int i2 = ar.f48106a;
        h.g.b.m mVar = new h.g.b.m(cls);
        mVar.toString();
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ".concat(mVar.toString()));
    }

    public static final /* synthetic */ void c(kotlinx.b.b.f fVar) {
        h.g.b.x.f(fVar, "<this>");
        if ((fVar instanceof ae ? (ae) fVar : null) != null) {
            return;
        }
        Class<?> cls = fVar.getClass();
        int i2 = ar.f48106a;
        h.g.b.m mVar = new h.g.b.m(cls);
        mVar.toString();
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ".concat(mVar.toString()));
    }

    public static final String d(String str) {
        int i2;
        h.g.b.x.f(str, "<this>");
        int i3 = -1;
        int i4 = 0;
        if (!h.n.o.F(str, ":", false)) {
            try {
                String ascii = IDN.toASCII(str);
                h.g.b.x.e(ascii, "toASCII(...)");
                Locale locale = Locale.US;
                h.g.b.x.e(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                h.g.b.x.e(lowerCase, "toLowerCase(...)");
                if (lowerCase.length() != 0) {
                    int length = lowerCase.length();
                    for (0; i2 < length; i2 + 1) {
                        char cCharAt = lowerCase.charAt(i2);
                        i2 = (h.g.b.x.a(cCharAt, 31) > 0 && h.g.b.x.a(cCharAt, 127) < 0 && h.n.o.W(" #%/:?@[\\]", cCharAt, 0, 6) == -1) ? i2 + 1 : 0;
                        return null;
                    }
                    return lowerCase;
                }
            } catch (IllegalArgumentException unused) {
            }
            return null;
        }
        InetAddress inetAddressG = (h.n.o.ah(str, "[") && h.n.o.l(str, "]", false)) ? g(str, 1, str.length() - 1) : g(str, 0, str.length());
        if (inetAddressG == null) {
            return null;
        }
        byte[] address = inetAddressG.getAddress();
        int length2 = address.length;
        if (length2 != 16) {
            if (length2 == 4) {
                return inetAddressG.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        h.g.b.x.c(address);
        int i5 = 0;
        int i6 = 0;
        while (i5 < address.length) {
            int i7 = i5;
            while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                i7 += 2;
            }
            int i8 = i7 - i5;
            if (i8 > i6 && i8 >= 4) {
                i3 = i5;
                i6 = i8;
            }
            i5 = i7 + 2;
        }
        k.h hVar = new k.h();
        while (i4 < address.length) {
            if (i4 == i3) {
                hVar.ae(58);
                i4 += i6;
                if (i4 == 16) {
                    hVar.ae(58);
                }
            } else {
                if (i4 > 0) {
                    hVar.ae(58);
                }
                hVar.af((okhttp3.internal.b.B(address[i4]) << 8) | okhttp3.internal.b.B(address[i4 + 1]));
                i4 += 2;
            }
        }
        return hVar.v();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final av e(String str) {
        h.g.b.x.f(str, "javaName");
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return av.f55927c;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return av.f55926b;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return av.f55925a;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return av.f55928d;
            }
        } else if (str.equals("SSLv3")) {
            return av.f55929e;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(String.valueOf(str)));
    }

    public static final com.waze.bl.b.c.a f(b bVar) {
        h.g.b.x.f(bVar, "<this>");
        return bVar.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ba, code lost:
    
        if (r4 == 16) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bc, code lost:
    
        if (r5 == (-1)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00be, code lost:
    
        r13 = r4 - r5;
        java.lang.System.arraycopy(r1, r5, r1, 16 - r13, r13);
        java.util.Arrays.fill(r1, r5, (16 - r4) + r5, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d1, code lost:
    
        return java.net.InetAddress.getByAddress(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.net.InetAddress g(java.lang.String r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.b.d.aa.g(java.lang.String, int, int):java.net.InetAddress");
    }
}
