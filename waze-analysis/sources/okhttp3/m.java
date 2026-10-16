package okhttp3;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f56299a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f56300b;

    /* renamed from: c, reason: collision with root package name */
    public static final m f56301c;

    /* renamed from: d, reason: collision with root package name */
    public static final m f56302d;

    /* renamed from: e, reason: collision with root package name */
    public static final m f56303e;

    /* renamed from: f, reason: collision with root package name */
    public static final m f56304f;

    /* renamed from: g, reason: collision with root package name */
    public static final m f56305g;

    /* renamed from: h, reason: collision with root package name */
    public static final m f56306h;

    /* renamed from: i, reason: collision with root package name */
    public static final m f56307i;

    /* renamed from: j, reason: collision with root package name */
    public static final m f56308j;

    /* renamed from: k, reason: collision with root package name */
    public static final m f56309k;

    /* renamed from: l, reason: collision with root package name */
    public static final m f56310l;
    public static final m m;
    public static final m n;
    public static final m o;
    public static final m p;
    public static final kotlinx.b.p q = new kotlinx.b.p();
    private static final Comparator r = new l();
    private static final Map s = new LinkedHashMap();
    private final String t;

    static {
        kotlinx.b.p.j("SSL_RSA_WITH_NULL_MD5");
        kotlinx.b.p.j("SSL_RSA_WITH_NULL_SHA");
        kotlinx.b.p.j("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        kotlinx.b.p.j("SSL_RSA_WITH_RC4_128_MD5");
        kotlinx.b.p.j("SSL_RSA_WITH_RC4_128_SHA");
        kotlinx.b.p.j("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        kotlinx.b.p.j("SSL_RSA_WITH_DES_CBC_SHA");
        f56299a = kotlinx.b.p.j("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        kotlinx.b.p.j("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        kotlinx.b.p.j("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        kotlinx.b.p.j("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        kotlinx.b.p.j("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        kotlinx.b.p.j("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        kotlinx.b.p.j("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        kotlinx.b.p.j("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        kotlinx.b.p.j("SSL_DH_anon_WITH_RC4_128_MD5");
        kotlinx.b.p.j("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        kotlinx.b.p.j("SSL_DH_anon_WITH_DES_CBC_SHA");
        kotlinx.b.p.j("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        kotlinx.b.p.j("TLS_KRB5_WITH_DES_CBC_SHA");
        kotlinx.b.p.j("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        kotlinx.b.p.j("TLS_KRB5_WITH_RC4_128_SHA");
        kotlinx.b.p.j("TLS_KRB5_WITH_DES_CBC_MD5");
        kotlinx.b.p.j("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        kotlinx.b.p.j("TLS_KRB5_WITH_RC4_128_MD5");
        kotlinx.b.p.j("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        kotlinx.b.p.j("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        kotlinx.b.p.j("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        kotlinx.b.p.j("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f56300b = kotlinx.b.p.j("TLS_RSA_WITH_AES_128_CBC_SHA");
        kotlinx.b.p.j("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        kotlinx.b.p.j("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        kotlinx.b.p.j("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f56301c = kotlinx.b.p.j("TLS_RSA_WITH_AES_256_CBC_SHA");
        kotlinx.b.p.j("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        kotlinx.b.p.j("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        kotlinx.b.p.j("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        kotlinx.b.p.j("TLS_RSA_WITH_NULL_SHA256");
        kotlinx.b.p.j("TLS_RSA_WITH_AES_128_CBC_SHA256");
        kotlinx.b.p.j("TLS_RSA_WITH_AES_256_CBC_SHA256");
        kotlinx.b.p.j("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        kotlinx.b.p.j("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        kotlinx.b.p.j("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        kotlinx.b.p.j("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        kotlinx.b.p.j("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        kotlinx.b.p.j("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        kotlinx.b.p.j("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        kotlinx.b.p.j("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        kotlinx.b.p.j("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        kotlinx.b.p.j("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        kotlinx.b.p.j("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        kotlinx.b.p.j("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        kotlinx.b.p.j("TLS_PSK_WITH_RC4_128_SHA");
        kotlinx.b.p.j("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        kotlinx.b.p.j("TLS_PSK_WITH_AES_128_CBC_SHA");
        kotlinx.b.p.j("TLS_PSK_WITH_AES_256_CBC_SHA");
        kotlinx.b.p.j("TLS_RSA_WITH_SEED_CBC_SHA");
        f56302d = kotlinx.b.p.j("TLS_RSA_WITH_AES_128_GCM_SHA256");
        f56303e = kotlinx.b.p.j("TLS_RSA_WITH_AES_256_GCM_SHA384");
        kotlinx.b.p.j("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        kotlinx.b.p.j("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        kotlinx.b.p.j("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        kotlinx.b.p.j("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        kotlinx.b.p.j("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        kotlinx.b.p.j("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        kotlinx.b.p.j("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        kotlinx.b.p.j("TLS_FALLBACK_SCSV");
        kotlinx.b.p.j("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        kotlinx.b.p.j("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        kotlinx.b.p.j("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        kotlinx.b.p.j("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        kotlinx.b.p.j("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        kotlinx.b.p.j("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        kotlinx.b.p.j("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        kotlinx.b.p.j("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        kotlinx.b.p.j("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        kotlinx.b.p.j("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        kotlinx.b.p.j("TLS_ECDH_RSA_WITH_NULL_SHA");
        kotlinx.b.p.j("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        kotlinx.b.p.j("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        kotlinx.b.p.j("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        kotlinx.b.p.j("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        kotlinx.b.p.j("TLS_ECDHE_RSA_WITH_NULL_SHA");
        kotlinx.b.p.j("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        kotlinx.b.p.j("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        f56304f = kotlinx.b.p.j("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f56305g = kotlinx.b.p.j("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        kotlinx.b.p.j("TLS_ECDH_anon_WITH_NULL_SHA");
        kotlinx.b.p.j("TLS_ECDH_anon_WITH_RC4_128_SHA");
        kotlinx.b.p.j("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        kotlinx.b.p.j("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        kotlinx.b.p.j("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        kotlinx.b.p.j("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        kotlinx.b.p.j("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        kotlinx.b.p.j("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        kotlinx.b.p.j("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        kotlinx.b.p.j("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        kotlinx.b.p.j("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        kotlinx.b.p.j("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        kotlinx.b.p.j("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        f56306h = kotlinx.b.p.j("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        f56307i = kotlinx.b.p.j("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        kotlinx.b.p.j("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        kotlinx.b.p.j("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f56308j = kotlinx.b.p.j("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f56309k = kotlinx.b.p.j("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        kotlinx.b.p.j("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        kotlinx.b.p.j("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        kotlinx.b.p.j("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        kotlinx.b.p.j("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f56310l = kotlinx.b.p.j("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        m = kotlinx.b.p.j("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        kotlinx.b.p.j("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        kotlinx.b.p.j("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        n = kotlinx.b.p.j("TLS_AES_128_GCM_SHA256");
        o = kotlinx.b.p.j("TLS_AES_256_GCM_SHA384");
        p = kotlinx.b.p.j("TLS_CHACHA20_POLY1305_SHA256");
        kotlinx.b.p.j("TLS_AES_128_CCM_SHA256");
        kotlinx.b.p.j("TLS_AES_128_CCM_8_SHA256");
    }

    public /* synthetic */ m(String str) {
        this.t = str;
    }

    public final String a() {
        return this.t;
    }

    public final String toString() {
        return this.t;
    }
}
