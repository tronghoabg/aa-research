package e.a.f.a;

import com.waze.strings.DisplayStrings;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f47555a;

    /* renamed from: d, reason: collision with root package name */
    private static final a[] f47556d;

    /* renamed from: b, reason: collision with root package name */
    final boolean f47557b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f47558c;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f47559e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f47560f;

    static {
        a[] aVarArr = {a.TLS_AES_128_GCM_SHA256, a.TLS_AES_256_GCM_SHA384, a.TLS_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, a.TLS_RSA_WITH_AES_128_GCM_SHA256, a.TLS_RSA_WITH_AES_256_GCM_SHA384, a.TLS_RSA_WITH_AES_128_CBC_SHA, a.TLS_RSA_WITH_AES_256_CBC_SHA, a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f47556d = aVarArr;
        b bVar = new b();
        bVar.e(aVarArr);
        bVar.h(n.TLS_1_3, n.TLS_1_2);
        bVar.g();
        c cVar = new c(bVar);
        f47555a = cVar;
        b bVar2 = new b(cVar);
        bVar2.h(n.TLS_1_3, n.TLS_1_2, n.TLS_1_1, n.TLS_1_0);
        bVar2.g();
    }

    private c(b bVar) {
        this.f47557b = true;
        this.f47559e = bVar.f47542a;
        this.f47560f = bVar.f47543b;
        this.f47558c = bVar.f47544c;
    }

    public final boolean a() {
        return this.f47558c;
    }

    public final void d(SSLSocket sSLSocket) throws CloneNotSupportedException {
        String[] strArr = this.f47559e;
        String[] strArr2 = strArr != null ? (String[]) o.b(String.class, strArr, sSLSocket.getEnabledCipherSuites()) : null;
        String[] strArr3 = (String[]) o.b(String.class, this.f47560f, sSLSocket.getEnabledProtocols());
        b bVar = new b(this);
        bVar.f(strArr2);
        bVar.i(strArr3);
        c cVar = new c(bVar);
        sSLSocket.setEnabledProtocols(cVar.f47560f);
        String[] strArr4 = cVar.f47559e;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        c cVar = (c) obj;
        boolean z = cVar.f47557b;
        return Arrays.equals(this.f47559e, cVar.f47559e) && Arrays.equals(this.f47560f, cVar.f47560f) && this.f47558c == cVar.f47558c;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f47559e) + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL) * 31) + Arrays.hashCode(this.f47560f)) * 31) + (!this.f47558c ? 1 : 0);
    }

    public final String toString() {
        List listA;
        n nVar;
        String[] strArr = this.f47559e;
        if (strArr == null) {
            listA = null;
        } else {
            a[] aVarArr = new a[strArr.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                String str = strArr[i2];
                a aVar = a.TLS_RSA_WITH_NULL_MD5;
                aVarArr[i2] = str.startsWith("SSL_") ? a.a("TLS_".concat(String.valueOf(str.substring(4)))) : a.a(str);
            }
            listA = o.a(aVarArr);
        }
        String string = listA == null ? "[use default]" : listA.toString();
        String[] strArr2 = this.f47560f;
        n[] nVarArr = new n[strArr2.length];
        for (int i3 = 0; i3 < strArr2.length; i3++) {
            String str2 = strArr2[i3];
            boolean zEquals = "TLSv1.3".equals(str2);
            n nVar2 = n.TLS_1_3;
            if (zEquals) {
                nVar = n.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                nVar = n.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                nVar = n.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                nVar = n.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    throw new IllegalArgumentException("Unexpected TLS version: ".concat(String.valueOf(str2)));
                }
                nVar = n.SSL_3_0;
            }
            nVarArr[i3] = nVar;
        }
        return "ConnectionSpec(cipherSuites=" + string + ", tlsVersions=" + String.valueOf(o.a(nVarArr)) + ", supportsTlsExtensions=" + this.f47558c + ")";
    }

    /* synthetic */ c(b bVar, byte[] bArr) {
        this(bVar);
    }
}
