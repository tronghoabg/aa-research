package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aect {
    public static final defpackage.aect a;
    private static final defpackage.aecs[] f;
    final boolean b = true;
    public final java.lang.String[] c;
    public final java.lang.String[] d;
    public final boolean e;

    static {
        defpackage.aecs[] aecsVarArr = {defpackage.aecs.TLS_AES_128_GCM_SHA256, defpackage.aecs.TLS_AES_256_GCM_SHA384, defpackage.aecs.TLS_CHACHA20_POLY1305_SHA256, defpackage.aecs.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, defpackage.aecs.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, defpackage.aecs.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, defpackage.aecs.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, defpackage.aecs.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, defpackage.aecs.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, defpackage.aecs.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, defpackage.aecs.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, defpackage.aecs.TLS_RSA_WITH_AES_128_GCM_SHA256, defpackage.aecs.TLS_RSA_WITH_AES_256_GCM_SHA384, defpackage.aecs.TLS_RSA_WITH_AES_128_CBC_SHA, defpackage.aecs.TLS_RSA_WITH_AES_256_CBC_SHA, defpackage.aecs.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f = aecsVarArr;
        defpackage.gkq gkqVar = new defpackage.gkq();
        gkqVar.a(aecsVarArr);
        gkqVar.c(defpackage.aedc.TLS_1_3, defpackage.aedc.TLS_1_2);
        gkqVar.b();
        defpackage.aect aectVar = new defpackage.aect(gkqVar);
        a = aectVar;
        defpackage.gkq gkqVar2 = new defpackage.gkq(aectVar);
        gkqVar2.c(defpackage.aedc.TLS_1_3, defpackage.aedc.TLS_1_2, defpackage.aedc.TLS_1_1, defpackage.aedc.TLS_1_0);
        gkqVar2.b();
    }

    public aect(defpackage.gkq gkqVar) {
        this.c = (java.lang.String[]) gkqVar.c;
        this.d = (java.lang.String[]) gkqVar.b;
        this.e = gkqVar.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aect)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        defpackage.aect aectVar = (defpackage.aect) obj;
        boolean z = aectVar.b;
        return java.util.Arrays.equals(this.c, aectVar.c) && java.util.Arrays.equals(this.d, aectVar.d) && this.e == aectVar.e;
    }

    public final int hashCode() {
        return ((((java.util.Arrays.hashCode(this.c) + 527) * 31) + java.util.Arrays.hashCode(this.d)) * 31) + (!this.e ? 1 : 0);
    }

    public final java.lang.String toString() {
        java.util.List listA;
        defpackage.aedc aedcVar;
        java.lang.String[] strArr = this.c;
        if (strArr == null) {
            listA = null;
        } else {
            defpackage.aecs[] aecsVarArr = new defpackage.aecs[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                java.lang.String str = strArr[i];
                defpackage.aecs aecsVar = defpackage.aecs.TLS_RSA_WITH_NULL_MD5;
                aecsVarArr[i] = str.startsWith("SSL_") ? defpackage.aecs.valueOf("TLS_".concat(java.lang.String.valueOf(str.substring(4)))) : defpackage.aecs.valueOf(str);
            }
            listA = defpackage.aedd.a(aecsVarArr);
        }
        java.lang.String string = listA == null ? "[use default]" : listA.toString();
        java.lang.String[] strArr2 = this.d;
        defpackage.aedc[] aedcVarArr = new defpackage.aedc[strArr2.length];
        for (int i2 = 0; i2 < strArr2.length; i2++) {
            java.lang.String str2 = strArr2[i2];
            boolean zEquals = "TLSv1.3".equals(str2);
            defpackage.aedc aedcVar2 = defpackage.aedc.TLS_1_3;
            if (zEquals) {
                aedcVar = defpackage.aedc.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                aedcVar = defpackage.aedc.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                aedcVar = defpackage.aedc.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                aedcVar = defpackage.aedc.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    throw new java.lang.IllegalArgumentException("Unexpected TLS version: ".concat(java.lang.String.valueOf(str2)));
                }
                aedcVar = defpackage.aedc.SSL_3_0;
            }
            aedcVarArr[i2] = aedcVar;
        }
        return "ConnectionSpec(cipherSuites=" + string + ", tlsVersions=" + java.lang.String.valueOf(defpackage.aedd.a(aedcVarArr)) + ", supportsTlsExtensions=" + this.e + ")";
    }
}
