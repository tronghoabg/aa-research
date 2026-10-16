package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class aebt {
    public static final aebt a;
    private static final aebs[] f;
    final boolean b = true;
    public final String[] c;
    public final String[] d;
    public final boolean e;

    static {
        aebs[] aebsVarArr = {aebs.TLS_AES_128_GCM_SHA256, aebs.TLS_AES_256_GCM_SHA384, aebs.TLS_CHACHA20_POLY1305_SHA256, aebs.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, aebs.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, aebs.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, aebs.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, aebs.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, aebs.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, aebs.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, aebs.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, aebs.TLS_RSA_WITH_AES_128_GCM_SHA256, aebs.TLS_RSA_WITH_AES_256_GCM_SHA384, aebs.TLS_RSA_WITH_AES_128_CBC_SHA, aebs.TLS_RSA_WITH_AES_256_CBC_SHA, aebs.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f = aebsVarArr;
        gkj gkjVar = new gkj();
        gkjVar.a(aebsVarArr);
        gkjVar.c(aecc.TLS_1_3, aecc.TLS_1_2);
        gkjVar.b();
        aebt aebtVar = new aebt(gkjVar);
        a = aebtVar;
        gkj gkjVar2 = new gkj(aebtVar);
        gkjVar2.c(aecc.TLS_1_3, aecc.TLS_1_2, aecc.TLS_1_1, aecc.TLS_1_0);
        gkjVar2.b();
    }

    public aebt(gkj gkjVar) {
        this.c = (String[]) gkjVar.c;
        this.d = (String[]) gkjVar.b;
        this.e = gkjVar.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aebt)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        aebt aebtVar = (aebt) obj;
        boolean z = aebtVar.b;
        return Arrays.equals(this.c, aebtVar.c) && Arrays.equals(this.d, aebtVar.d) && this.e == aebtVar.e;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.c) + 527) * 31) + Arrays.hashCode(this.d)) * 31) + (!this.e ? 1 : 0);
    }

    public final String toString() {
        List listA;
        aecc aeccVar;
        String[] strArr = this.c;
        if (strArr == null) {
            listA = null;
        } else {
            aebs[] aebsVarArr = new aebs[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                aebs aebsVar = aebs.TLS_RSA_WITH_NULL_MD5;
                aebsVarArr[i] = str.startsWith("SSL_") ? aebs.valueOf("TLS_".concat(String.valueOf(str.substring(4)))) : aebs.valueOf(str);
            }
            listA = aecd.a(aebsVarArr);
        }
        String string = listA == null ? "[use default]" : listA.toString();
        String[] strArr2 = this.d;
        aecc[] aeccVarArr = new aecc[strArr2.length];
        for (int i2 = 0; i2 < strArr2.length; i2++) {
            String str2 = strArr2[i2];
            boolean zEquals = "TLSv1.3".equals(str2);
            aecc aeccVar2 = aecc.TLS_1_3;
            if (zEquals) {
                aeccVar = aecc.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                aeccVar = aecc.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                aeccVar = aecc.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                aeccVar = aecc.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    throw new IllegalArgumentException("Unexpected TLS version: ".concat(String.valueOf(str2)));
                }
                aeccVar = aecc.SSL_3_0;
            }
            aeccVarArr[i2] = aeccVar;
        }
        return "ConnectionSpec(cipherSuites=" + string + ", tlsVersions=" + String.valueOf(aecd.a(aeccVarArr)) + ", supportsTlsExtensions=" + this.e + ")";
    }
}
