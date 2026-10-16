package okhttp3;

import S8.b;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import ff.t;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Call;
import okhttp3.WebSocket;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lokhttp3/OkHttpClient;", "", "Lokhttp3/Call$Factory;", "Lokhttp3/WebSocket$Factory;", "<init>", "()V", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {

    /* renamed from: B, reason: collision with root package name */
    public static final Companion f42312B = new Companion(0);

    /* renamed from: C, reason: collision with root package name */
    public static final List f42313C = Util.k(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* renamed from: D, reason: collision with root package name */
    public static final List f42314D = Util.k(ConnectionSpec.f42223e, ConnectionSpec.f42224f);

    /* renamed from: A, reason: collision with root package name */
    public final RouteDatabase f42315A;

    /* renamed from: a, reason: collision with root package name */
    public final Dispatcher f42316a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectionPool f42317b;

    /* renamed from: c, reason: collision with root package name */
    public final List f42318c;

    /* renamed from: d, reason: collision with root package name */
    public final List f42319d;

    /* renamed from: e, reason: collision with root package name */
    public final b f42320e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f42321f;

    /* renamed from: g, reason: collision with root package name */
    public final Authenticator f42322g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f42323h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f42324i;

    /* renamed from: j, reason: collision with root package name */
    public final CookieJar f42325j;
    public final Cache k;

    /* renamed from: l, reason: collision with root package name */
    public final Dns f42326l;

    /* renamed from: m, reason: collision with root package name */
    public final ProxySelector f42327m;

    /* renamed from: n, reason: collision with root package name */
    public final Authenticator f42328n;

    /* renamed from: o, reason: collision with root package name */
    public final SocketFactory f42329o;

    /* renamed from: p, reason: collision with root package name */
    public final SSLSocketFactory f42330p;

    /* renamed from: q, reason: collision with root package name */
    public final X509TrustManager f42331q;

    /* renamed from: r, reason: collision with root package name */
    public final List f42332r;

    /* renamed from: s, reason: collision with root package name */
    public final List f42333s;

    /* renamed from: t, reason: collision with root package name */
    public final OkHostnameVerifier f42334t;

    /* renamed from: u, reason: collision with root package name */
    public final CertificatePinner f42335u;

    /* renamed from: v, reason: collision with root package name */
    public final CertificateChainCleaner f42336v;

    /* renamed from: w, reason: collision with root package name */
    public final int f42337w;

    /* renamed from: x, reason: collision with root package name */
    public final int f42338x;

    /* renamed from: y, reason: collision with root package name */
    public final int f42339y;

    /* renamed from: z, reason: collision with root package name */
    public final long f42340z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/OkHttpClient$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: A, reason: collision with root package name */
        public RouteDatabase f42341A;

        /* renamed from: a, reason: collision with root package name */
        public Dispatcher f42342a = new Dispatcher();

        /* renamed from: b, reason: collision with root package name */
        public ConnectionPool f42343b = new ConnectionPool();

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f42344c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f42345d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        public b f42346e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f42347f;

        /* renamed from: g, reason: collision with root package name */
        public Authenticator f42348g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f42349h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f42350i;

        /* renamed from: j, reason: collision with root package name */
        public CookieJar f42351j;
        public Cache k;

        /* renamed from: l, reason: collision with root package name */
        public Dns f42352l;

        /* renamed from: m, reason: collision with root package name */
        public ProxySelector f42353m;

        /* renamed from: n, reason: collision with root package name */
        public Authenticator f42354n;

        /* renamed from: o, reason: collision with root package name */
        public SocketFactory f42355o;

        /* renamed from: p, reason: collision with root package name */
        public SSLSocketFactory f42356p;

        /* renamed from: q, reason: collision with root package name */
        public X509TrustManager f42357q;

        /* renamed from: r, reason: collision with root package name */
        public List f42358r;

        /* renamed from: s, reason: collision with root package name */
        public List f42359s;

        /* renamed from: t, reason: collision with root package name */
        public OkHostnameVerifier f42360t;

        /* renamed from: u, reason: collision with root package name */
        public CertificatePinner f42361u;

        /* renamed from: v, reason: collision with root package name */
        public CertificateChainCleaner f42362v;

        /* renamed from: w, reason: collision with root package name */
        public int f42363w;

        /* renamed from: x, reason: collision with root package name */
        public int f42364x;

        /* renamed from: y, reason: collision with root package name */
        public int f42365y;

        /* renamed from: z, reason: collision with root package name */
        public long f42366z;

        public Builder() {
            EventListener$Companion$NONE$1 eventListener$Companion$NONE$1 = EventListener.f42255a;
            byte[] bArr = Util.f42438a;
            AbstractC3340k.e(eventListener$Companion$NONE$1, "<this>");
            this.f42346e = new b(eventListener$Companion$NONE$1, 20);
            this.f42347f = true;
            Authenticator authenticator = Authenticator.f42147a;
            this.f42348g = authenticator;
            this.f42349h = true;
            this.f42350i = true;
            this.f42351j = CookieJar.f42246a;
            this.f42352l = Dns.f42253a;
            this.f42354n = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            AbstractC3340k.d(socketFactory, "getDefault()");
            this.f42355o = socketFactory;
            OkHttpClient.f42312B.getClass();
            this.f42358r = OkHttpClient.f42314D;
            this.f42359s = OkHttpClient.f42313C;
            this.f42360t = OkHostnameVerifier.f42928a;
            this.f42361u = CertificatePinner.f42195d;
            this.f42363w = 10000;
            this.f42364x = 10000;
            this.f42365y = 10000;
            this.f42366z = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        }

        public final void a(long j8, TimeUnit unit) {
            AbstractC3340k.e(unit, "unit");
            this.f42363w = Util.b(j8, unit);
        }

        public final void b(long j8, TimeUnit unit) {
            AbstractC3340k.e(unit, "unit");
            this.f42364x = Util.b(j8, unit);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/OkHttpClient$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        private Companion() {
        }
    }

    public OkHttpClient(Builder builder) throws NoSuchAlgorithmException, KeyStoreException {
        this.f42316a = builder.f42342a;
        this.f42317b = builder.f42343b;
        this.f42318c = Util.x(builder.f42344c);
        this.f42319d = Util.x(builder.f42345d);
        this.f42320e = builder.f42346e;
        this.f42321f = builder.f42347f;
        this.f42322g = builder.f42348g;
        this.f42323h = builder.f42349h;
        this.f42324i = builder.f42350i;
        this.f42325j = builder.f42351j;
        this.k = builder.k;
        this.f42326l = builder.f42352l;
        ProxySelector proxySelector = builder.f42353m;
        proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
        this.f42327m = proxySelector == null ? NullProxySelector.f42916a : proxySelector;
        this.f42328n = builder.f42354n;
        this.f42329o = builder.f42355o;
        List list = builder.f42358r;
        this.f42332r = list;
        this.f42333s = builder.f42359s;
        this.f42334t = builder.f42360t;
        this.f42337w = builder.f42363w;
        this.f42338x = builder.f42364x;
        this.f42339y = builder.f42365y;
        this.f42340z = builder.f42366z;
        RouteDatabase routeDatabase = builder.f42341A;
        this.f42315A = routeDatabase == null ? new RouteDatabase() : routeDatabase;
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            this.f42330p = null;
            this.f42336v = null;
            this.f42331q = null;
            this.f42335u = CertificatePinner.f42195d;
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).f42225a) {
                    SSLSocketFactory sSLSocketFactory = builder.f42356p;
                    if (sSLSocketFactory != null) {
                        this.f42330p = sSLSocketFactory;
                        CertificateChainCleaner certificateChainCleaner = builder.f42362v;
                        AbstractC3340k.b(certificateChainCleaner);
                        this.f42336v = certificateChainCleaner;
                        X509TrustManager x509TrustManager = builder.f42357q;
                        AbstractC3340k.b(x509TrustManager);
                        this.f42331q = x509TrustManager;
                        CertificatePinner certificatePinner = builder.f42361u;
                        certificatePinner.getClass();
                        this.f42335u = AbstractC3340k.a(certificatePinner.f42197b, certificateChainCleaner) ? certificatePinner : new CertificatePinner(certificatePinner.f42196a, certificateChainCleaner);
                    } else {
                        Platform.f42887a.getClass();
                        X509TrustManager x509TrustManagerM = Platform.f42888b.m();
                        this.f42331q = x509TrustManagerM;
                        this.f42330p = Platform.f42888b.l(x509TrustManagerM);
                        CertificateChainCleaner.f42927a.getClass();
                        CertificateChainCleaner certificateChainCleanerB = Platform.f42888b.b(x509TrustManagerM);
                        this.f42336v = certificateChainCleanerB;
                        CertificatePinner certificatePinner2 = builder.f42361u;
                        certificatePinner2.getClass();
                        this.f42335u = AbstractC3340k.a(certificatePinner2.f42197b, certificateChainCleanerB) ? certificatePinner2 : new CertificatePinner(certificatePinner2.f42196a, certificateChainCleanerB);
                    }
                }
            }
            this.f42330p = null;
            this.f42336v = null;
            this.f42331q = null;
            this.f42335u = CertificatePinner.f42195d;
        }
        List list3 = this.f42318c;
        if (list3.contains(null)) {
            throw new IllegalStateException(AbstractC3340k.k(list3, "Null interceptor: ").toString());
        }
        List list4 = this.f42319d;
        if (list4.contains(null)) {
            throw new IllegalStateException(AbstractC3340k.k(list4, "Null network interceptor: ").toString());
        }
        List list5 = this.f42332r;
        boolean z2 = list5 instanceof Collection;
        X509TrustManager x509TrustManager2 = this.f42331q;
        CertificateChainCleaner certificateChainCleaner2 = this.f42336v;
        SSLSocketFactory sSLSocketFactory2 = this.f42330p;
        if (!z2 || !list5.isEmpty()) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((ConnectionSpec) it2.next()).f42225a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (certificateChainCleaner2 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (certificateChainCleaner2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!AbstractC3340k.a(this.f42335u, CertificatePinner.f42195d)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // okhttp3.Call.Factory
    public final RealCall a(Request request) {
        AbstractC3340k.e(request, "request");
        return new RealCall(this, request);
    }

    public final Builder b() {
        Builder builder = new Builder();
        builder.f42342a = this.f42316a;
        builder.f42343b = this.f42317b;
        t.e0(this.f42318c, builder.f42344c);
        t.e0(this.f42319d, builder.f42345d);
        builder.f42346e = this.f42320e;
        builder.f42347f = this.f42321f;
        builder.f42348g = this.f42322g;
        builder.f42349h = this.f42323h;
        builder.f42350i = this.f42324i;
        builder.f42351j = this.f42325j;
        builder.k = this.k;
        builder.f42352l = this.f42326l;
        builder.f42353m = this.f42327m;
        builder.f42354n = this.f42328n;
        builder.f42355o = this.f42329o;
        builder.f42356p = this.f42330p;
        builder.f42357q = this.f42331q;
        builder.f42358r = this.f42332r;
        builder.f42359s = this.f42333s;
        builder.f42360t = this.f42334t;
        builder.f42361u = this.f42335u;
        builder.f42362v = this.f42336v;
        builder.f42363w = this.f42337w;
        builder.f42364x = this.f42338x;
        builder.f42365y = this.f42339y;
        builder.f42366z = this.f42340z;
        builder.f42341A = this.f42315A;
        return builder;
    }

    public final Object clone() {
        return super.clone();
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
