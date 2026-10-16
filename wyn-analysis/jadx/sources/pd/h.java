package pd;

import K8.C0694f;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;
import md.AbstractC3553v;
import md.AbstractC3556y;
import md.p0;
import od.AbstractC3669a0;
import od.N0;
import od.Y1;
import od.a2;
import qd.C3887b;
import qd.EnumC3886a;

/* loaded from: classes5.dex */
public final class h extends AbstractC3553v {

    /* renamed from: m, reason: collision with root package name */
    public static final C3887b f43502m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f43503n;

    /* renamed from: o, reason: collision with root package name */
    public static final a2.v f43504o;

    /* renamed from: a, reason: collision with root package name */
    public final N0 f43505a;

    /* renamed from: e, reason: collision with root package name */
    public SSLSocketFactory f43509e;

    /* renamed from: b, reason: collision with root package name */
    public final Y1 f43506b = a2.f41912d;

    /* renamed from: c, reason: collision with root package name */
    public final a2.v f43507c = f43504o;

    /* renamed from: d, reason: collision with root package name */
    public final a2.v f43508d = new a2.v(AbstractC3669a0.f41900q, 17);

    /* renamed from: f, reason: collision with root package name */
    public final C3887b f43510f = f43502m;

    /* renamed from: g, reason: collision with root package name */
    public int f43511g = 1;

    /* renamed from: h, reason: collision with root package name */
    public long f43512h = Long.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public final long f43513i = AbstractC3669a0.f41895l;

    /* renamed from: j, reason: collision with root package name */
    public final int f43514j = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    public final int k = 4194304;

    /* renamed from: l, reason: collision with root package name */
    public final int f43515l = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    static {
        Logger.getLogger(h.class.getName());
        C0694f c0694f = new C0694f(C3887b.f44209e);
        c0694f.c(EnumC3886a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, EnumC3886a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, EnumC3886a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, EnumC3886a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, EnumC3886a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, EnumC3886a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        c0694f.f(qd.m.TLS_1_2);
        if (!c0694f.f6639a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        c0694f.f6640b = true;
        f43502m = new C3887b(c0694f);
        f43503n = TimeUnit.DAYS.toNanos(1000L);
        f43504o = new a2.v(new ad.r(), 17);
        EnumSet.of(p0.f40709a, p0.f40710b);
    }

    public h(String str) {
        this.f43505a = new N0(str, new a2.v(this, 20), new com.google.android.gms.ads.nativead.l(this, 14));
    }

    @Override // md.AbstractC3553v
    public final AbstractC3556y m() {
        return this.f43505a;
    }
}
