package e.a.f;

import androidx.webkit.Profile;
import e.a.bz;
import e.a.d.dh;
import e.a.d.el;
import e.a.d.fx;
import e.a.d.gr;
import e.a.d.jp;
import e.a.d.jr;
import e.a.d.ka;
import e.a.d.kc;
import e.a.en;
import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p extends e.a.ak {

    /* renamed from: a, reason: collision with root package name */
    static final e.a.f.a.c f47706a;

    /* renamed from: b, reason: collision with root package name */
    static final e.a.f.a.c f47707b;

    /* renamed from: c, reason: collision with root package name */
    static final gr f47708c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f47709d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final long f47710e;

    /* renamed from: f, reason: collision with root package name */
    private static final jp f47711f;

    /* renamed from: g, reason: collision with root package name */
    private final fx f47712g;

    /* renamed from: h, reason: collision with root package name */
    private final ka f47713h = kc.a();

    /* renamed from: i, reason: collision with root package name */
    private final gr f47714i = f47708c;

    /* renamed from: j, reason: collision with root package name */
    private final gr f47715j = jr.c(dh.n);

    /* renamed from: k, reason: collision with root package name */
    private SSLSocketFactory f47716k;

    /* renamed from: l, reason: collision with root package name */
    private final e.a.f.a.c f47717l;
    private long m;
    private long n;
    private boolean o;

    static {
        Logger.getLogger(p.class.getName());
        e.a.f.a.b bVar = new e.a.f.a.b(e.a.f.a.c.f47555a);
        bVar.e(e.a.f.a.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, e.a.f.a.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, e.a.f.a.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, e.a.f.a.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, e.a.f.a.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, e.a.f.a.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, e.a.f.a.a.TLS_AES_128_GCM_SHA256, e.a.f.a.a.TLS_AES_256_GCM_SHA384, e.a.f.a.a.TLS_CHACHA20_POLY1305_SHA256);
        bVar.h(e.a.f.a.n.TLS_1_3, e.a.f.a.n.TLS_1_2);
        bVar.g();
        f47706a = bVar.a();
        e.a.f.a.b bVar2 = new e.a.f.a.b(e.a.f.a.c.f47555a);
        bVar2.e(e.a.f.a.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, e.a.f.a.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, e.a.f.a.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, e.a.f.a.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, e.a.f.a.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, e.a.f.a.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        bVar2.h(e.a.f.a.n.TLS_1_2);
        bVar2.g();
        f47707b = bVar2.a();
        TimeUnit timeUnit = TimeUnit.DAYS;
        f47710e = 86400000000000000L;
        k kVar = new k();
        f47711f = kVar;
        f47708c = jr.c(kVar);
        EnumSet.of(en.f47433b, en.f47434c);
    }

    private p(String str) {
        this.f47717l = ah.d() instanceof ag ? f47706a : f47707b;
        this.m = Long.MAX_VALUE;
        this.n = dh.f46800j;
        this.f47712g = new fx(str, new m(this), new l(this));
    }

    public static p l(String str) {
        return new p(str);
    }

    @Override // e.a.ak
    protected final bz b() {
        return this.f47712g;
    }

    @Override // e.a.bz
    public final /* bridge */ /* synthetic */ void h(long j2, TimeUnit timeUnit) {
        com.google.d.b.an.m(j2 > 0, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(j2);
        this.m = nanos;
        long jC = el.c(nanos);
        this.m = jC;
        if (jC >= f47710e) {
            this.m = Long.MAX_VALUE;
        }
    }

    @Override // e.a.bz
    public final /* bridge */ /* synthetic */ void i(long j2, TimeUnit timeUnit) {
        com.google.d.b.an.m(j2 > 0, "keepalive timeout must be positive");
        long nanos = timeUnit.toNanos(j2);
        this.n = nanos;
        this.n = el.d(nanos);
    }

    @Override // e.a.bz
    public final /* bridge */ /* synthetic */ void j() {
        this.o = true;
    }

    final o k() {
        boolean z = this.m != Long.MAX_VALUE;
        ka kaVar = this.f47713h;
        SSLSocketFactory sSLSocketFactoryM = m();
        long j2 = this.m;
        long j3 = this.n;
        boolean z2 = this.o;
        e.a.f.a.c cVar = this.f47717l;
        return new o(this.f47714i, this.f47715j, sSLSocketFactoryM, cVar, z, j2, j3, z2, kaVar);
    }

    final SSLSocketFactory m() {
        try {
            SSLSocketFactory sSLSocketFactory = this.f47716k;
            if (sSLSocketFactory != null) {
                return sSLSocketFactory;
            }
            SSLSocketFactory socketFactory = SSLContext.getInstance(Profile.DEFAULT_PROFILE_NAME, e.a.f.a.l.e().f()).getSocketFactory();
            this.f47716k = socketFactory;
            return socketFactory;
        } catch (GeneralSecurityException e2) {
            throw new RuntimeException("TLS Provider failure", e2);
        }
    }
}
