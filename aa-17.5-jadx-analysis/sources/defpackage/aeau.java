package defpackage;

import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class aeau extends adjx {
    static final aebt a;
    static final aebt b;
    static final adwt c;
    public static final /* synthetic */ int i = 0;
    private static final adzq j;
    public final adwt d;
    public final adwt e;
    public final aebt f;
    public final long g;
    public final erb h;
    private final adwb k;
    private SSLSocketFactory l;

    static {
        Logger.getLogger(aeau.class.getName());
        gkj gkjVar = new gkj(aebt.a);
        gkjVar.a(aebs.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, aebs.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, aebs.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, aebs.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, aebs.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, aebs.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, aebs.TLS_AES_128_GCM_SHA256, aebs.TLS_AES_256_GCM_SHA384, aebs.TLS_CHACHA20_POLY1305_SHA256);
        gkjVar.c(aecc.TLS_1_3, aecc.TLS_1_2);
        gkjVar.b();
        a = new aebt(gkjVar);
        gkj gkjVar2 = new gkj(aebt.a);
        gkjVar2.a(aebs.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, aebs.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, aebs.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, aebs.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, aebs.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, aebs.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        gkjVar2.c(aecc.TLS_1_2);
        gkjVar2.b();
        b = new aebt(gkjVar2);
        TimeUnit timeUnit = TimeUnit.DAYS;
        aeaq aeaqVar = new aeaq(0);
        j = aeaqVar;
        c = new adzs(aeaqVar, 0);
        EnumSet.of(adny.b, adny.c);
    }

    public aeau(String str, int i2) {
        String strD = adue.d(str, i2);
        this.h = aeac.i;
        this.d = c;
        this.e = new adzs(adue.p, 0);
        this.f = aebi.b instanceof aebh ? a : b;
        this.g = adue.l;
        this.k = new adwb(strD, new aeas(this, 0), new aear());
    }

    @Override // defpackage.adjx
    protected final adlo b() {
        return this.k;
    }

    final SSLSocketFactory c() {
        try {
            SSLSocketFactory sSLSocketFactory = this.l;
            if (sSLSocketFactory != null) {
                return sSLSocketFactory;
            }
            SSLSocketFactory socketFactory = SSLContext.getInstance("Default", aeca.b.c).getSocketFactory();
            this.l = socketFactory;
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new RuntimeException("TLS Provider failure", e);
        }
    }
}
