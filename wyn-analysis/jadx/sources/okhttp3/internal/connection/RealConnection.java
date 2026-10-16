package okhttp3.internal.connection;

import A7.AbstractC0279p0;
import Bf.l;
import Fe.b;
import cg.AbstractC1613b;
import cg.C1609A;
import cg.C1610B;
import cg.C1621j;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.common.api.f;
import ff.o;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.CipherSuite;
import okhttp3.Connection;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.EventListener$Companion$NONE$1;
import okhttp3.Handshake;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Http2Writer;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "Lokhttp3/Connection;", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection {

    /* renamed from: b, reason: collision with root package name */
    public final Route f42598b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f42599c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f42600d;

    /* renamed from: e, reason: collision with root package name */
    public Handshake f42601e;

    /* renamed from: f, reason: collision with root package name */
    public Protocol f42602f;

    /* renamed from: g, reason: collision with root package name */
    public Http2Connection f42603g;

    /* renamed from: h, reason: collision with root package name */
    public C1610B f42604h;

    /* renamed from: i, reason: collision with root package name */
    public C1609A f42605i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f42606j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f42607l;

    /* renamed from: m, reason: collision with root package name */
    public int f42608m;

    /* renamed from: n, reason: collision with root package name */
    public int f42609n;

    /* renamed from: o, reason: collision with root package name */
    public int f42610o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f42611p;

    /* renamed from: q, reason: collision with root package name */
    public long f42612q;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lokhttp3/internal/connection/RealConnection$Companion;", "", "<init>", "()V", "", "IDLE_CONNECTION_HEALTHY_NS", "J", "", "MAX_TUNNEL_ATTEMPTS", "I", "", "NPE_THROW_WITH_NULL", "Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42613a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            f42613a = iArr;
        }
    }

    static {
        new Companion(0);
    }

    public RealConnection(RealConnectionPool connectionPool, Route route) {
        AbstractC3340k.e(connectionPool, "connectionPool");
        AbstractC3340k.e(route, "route");
        this.f42598b = route;
        this.f42610o = 1;
        this.f42611p = new ArrayList();
        this.f42612q = Long.MAX_VALUE;
    }

    public static void d(OkHttpClient client, Route failedRoute, IOException failure) {
        AbstractC3340k.e(client, "client");
        AbstractC3340k.e(failedRoute, "failedRoute");
        AbstractC3340k.e(failure, "failure");
        if (failedRoute.f42428b.type() != Proxy.Type.DIRECT) {
            Address address = failedRoute.f42427a;
            address.f42143g.connectFailed(address.f42144h.i(), failedRoute.f42428b.address(), failure);
        }
        RouteDatabase routeDatabase = client.f42315A;
        synchronized (routeDatabase) {
            routeDatabase.f42622a.add(failedRoute);
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final synchronized void a(Http2Connection connection, Settings settings) {
        AbstractC3340k.e(connection, "connection");
        AbstractC3340k.e(settings, "settings");
        this.f42610o = (settings.f42852a & 16) != 0 ? settings.f42853b[4] : f.API_PRIORITY_OTHER;
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void b(Http2Stream http2Stream) {
        http2Stream.c(ErrorCode.REFUSED_STREAM, null);
    }

    public final void c(int i5, int i10, int i11, boolean z2, Call call, EventListener eventListener) throws Throwable {
        Route route;
        AbstractC3340k.e(call, "call");
        AbstractC3340k.e(eventListener, "eventListener");
        if (this.f42602f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f42598b.f42427a.f42146j;
        ConnectionSpecSelector connectionSpecSelector = new ConnectionSpecSelector(list);
        Address address = this.f42598b.f42427a;
        if (address.f42139c == null) {
            if (!list.contains(ConnectionSpec.f42224f)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f42598b.f42427a.f42144h.f42276d;
            Platform.f42887a.getClass();
            if (!Platform.f42888b.h(str)) {
                throw new RouteException(new UnknownServiceException(AbstractC0279p0.l("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (address.f42145i.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        do {
            try {
                Route route2 = this.f42598b;
                if (route2.f42427a.f42139c != null && route2.f42428b.type() == Proxy.Type.HTTP) {
                    f(i5, i10, i11, call, eventListener);
                    if (this.f42599c == null) {
                    }
                    route = this.f42598b;
                    if (route.f42427a.f42139c == null && route.f42428b.type() == Proxy.Type.HTTP && this.f42599c == null) {
                        throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
                    }
                    this.f42612q = System.nanoTime();
                    return;
                }
                e(i5, i10, call, eventListener);
                g(connectionSpecSelector, call, eventListener);
                InetSocketAddress inetSocketAddress = this.f42598b.f42429c;
                EventListener$Companion$NONE$1 eventListener$Companion$NONE$1 = EventListener.f42255a;
                AbstractC3340k.e(inetSocketAddress, "inetSocketAddress");
                route = this.f42598b;
                if (route.f42427a.f42139c == null) {
                }
                this.f42612q = System.nanoTime();
                return;
            } catch (IOException e7) {
                Socket socket = this.f42600d;
                if (socket != null) {
                    Util.d(socket);
                }
                Socket socket2 = this.f42599c;
                if (socket2 != null) {
                    Util.d(socket2);
                }
                this.f42600d = null;
                this.f42599c = null;
                this.f42604h = null;
                this.f42605i = null;
                this.f42601e = null;
                this.f42602f = null;
                this.f42603g = null;
                this.f42610o = 1;
                InetSocketAddress inetSocketAddress2 = this.f42598b.f42429c;
                AbstractC3340k.e(inetSocketAddress2, "inetSocketAddress");
                if (routeException == null) {
                    routeException = new RouteException(e7);
                } else {
                    b.d(routeException.f42623a, e7);
                    routeException.f42624b = e7;
                }
                if (!z2) {
                    throw routeException;
                }
                connectionSpecSelector.f42549d = true;
                if (!connectionSpecSelector.f42548c) {
                    throw routeException;
                }
                if (e7 instanceof ProtocolException) {
                    throw routeException;
                }
                if (e7 instanceof InterruptedIOException) {
                    throw routeException;
                }
                if ((e7 instanceof SSLHandshakeException) && (e7.getCause() instanceof CertificateException)) {
                    throw routeException;
                }
                if (e7 instanceof SSLPeerUnverifiedException) {
                    throw routeException;
                }
            }
        } while (e7 instanceof SSLException);
        throw routeException;
    }

    public final void e(int i5, int i10, Call call, EventListener eventListener) throws IOException {
        Socket socketCreateSocket;
        Route route = this.f42598b;
        Proxy proxy = route.f42428b;
        Address address = route.f42427a;
        Proxy.Type type = proxy.type();
        int i11 = type == null ? -1 : WhenMappings.f42613a[type.ordinal()];
        if (i11 == 1 || i11 == 2) {
            socketCreateSocket = address.f42138b.createSocket();
            AbstractC3340k.b(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f42599c = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.f42598b.f42429c;
        eventListener.getClass();
        AbstractC3340k.e(call, "call");
        AbstractC3340k.e(inetSocketAddress, "inetSocketAddress");
        socketCreateSocket.setSoTimeout(i10);
        try {
            Platform.f42887a.getClass();
            Platform.f42888b.e(socketCreateSocket, this.f42598b.f42429c, i5);
            try {
                this.f42604h = AbstractC1613b.d(AbstractC1613b.n(socketCreateSocket));
                this.f42605i = AbstractC1613b.c(AbstractC1613b.j(socketCreateSocket));
            } catch (NullPointerException e7) {
                if (AbstractC3340k.a(e7.getMessage(), "throw with null exception")) {
                    throw new IOException(e7);
                }
            }
        } catch (ConnectException e10) {
            ConnectException connectException = new ConnectException(AbstractC3340k.k(this.f42598b.f42429c, "Failed to connect to "));
            connectException.initCause(e10);
            throw connectException;
        }
    }

    public final void f(int i5, int i10, int i11, Call call, EventListener eventListener) throws IOException {
        Request.Builder builder = new Request.Builder();
        Route route = this.f42598b;
        HttpUrl url = route.f42427a.f42144h;
        AbstractC3340k.e(url, "url");
        builder.f42382a = url;
        builder.f("CONNECT", null);
        Address address = route.f42427a;
        builder.d("Host", Util.w(address.f42144h, true));
        builder.d("Proxy-Connection", "Keep-Alive");
        builder.d("User-Agent", "okhttp/4.10.0");
        Request requestB = builder.b();
        Response.Builder builder2 = new Response.Builder();
        builder2.f42408a = requestB;
        builder2.f42409b = Protocol.HTTP_1_1;
        builder2.f42410c = TTAdConstant.DOWNLOAD_APP_INFO_CODE;
        builder2.f42411d = "Preemptive Authenticate";
        builder2.f42414g = Util.f42440c;
        builder2.k = -1L;
        builder2.f42418l = -1L;
        Headers.Builder builder3 = builder2.f42413f;
        builder3.getClass();
        Headers.f42269b.getClass();
        Headers.Companion.a("Proxy-Authenticate");
        Headers.Companion.b("OkHttp-Preemptive", "Proxy-Authenticate");
        builder3.f("Proxy-Authenticate");
        builder3.c("Proxy-Authenticate", "OkHttp-Preemptive");
        Request requestA = address.f42142f.a(route, builder2.a());
        if (requestA != null) {
            requestB = requestA;
        }
        e(i5, i10, call, eventListener);
        String str = "CONNECT " + Util.w(requestB.f42376a, true) + " HTTP/1.1";
        while (true) {
            C1610B c1610b = this.f42604h;
            AbstractC3340k.b(c1610b);
            C1609A c1609a = this.f42605i;
            AbstractC3340k.b(c1609a);
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, c1610b, c1609a);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c1610b.f19863a.timeout().g(i10, timeUnit);
            c1609a.f19860a.timeout().g(i11, timeUnit);
            http1ExchangeCodec.g(requestB.f42378c, str);
            http1ExchangeCodec.finishRequest();
            Response.Builder responseHeaders = http1ExchangeCodec.readResponseHeaders(false);
            AbstractC3340k.b(responseHeaders);
            responseHeaders.f42408a = requestB;
            Response responseA = responseHeaders.a();
            http1ExchangeCodec.f(responseA);
            int i12 = responseA.f42398d;
            if (i12 == 200) {
                if (!c1610b.f19864b.exhausted() || !c1609a.f19861b.exhausted()) {
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                return;
            } else {
                if (i12 != 407) {
                    throw new IOException(AbstractC3340k.k(Integer.valueOf(i12), "Unexpected response code for CONNECT: "));
                }
                Request requestA2 = address.f42142f.a(route, responseA);
                if (requestA2 == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                if ("close".equalsIgnoreCase(Response.b("Connection", responseA))) {
                    return;
                } else {
                    requestB = requestA2;
                }
            }
        }
    }

    public final void g(ConnectionSpecSelector connectionSpecSelector, Call call, EventListener eventListener) throws Throwable {
        Protocol protocolA;
        Address address = this.f42598b.f42427a;
        if (address.f42139c == null) {
            List list = address.f42145i;
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(protocol)) {
                this.f42600d = this.f42599c;
                this.f42602f = Protocol.HTTP_1_1;
                return;
            } else {
                this.f42600d = this.f42599c;
                this.f42602f = protocol;
                m();
                return;
            }
        }
        eventListener.getClass();
        AbstractC3340k.e(call, "call");
        Address address2 = this.f42598b.f42427a;
        SSLSocketFactory sSLSocketFactory = address2.f42139c;
        SSLSocket sSLSocket = null;
        String strF = null;
        try {
            AbstractC3340k.b(sSLSocketFactory);
            Socket socket = this.f42599c;
            HttpUrl httpUrl = address2.f42144h;
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, httpUrl.f42276d, httpUrl.f42277e, true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                ConnectionSpec connectionSpecA = connectionSpecSelector.a(sSLSocket2);
                if (connectionSpecA.f42226b) {
                    Platform.f42887a.getClass();
                    Platform.f42888b.d(sSLSocket2, address2.f42144h.f42276d, address2.f42145i);
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                Handshake.Companion companion = Handshake.f42261e;
                AbstractC3340k.d(sslSocketSession, "sslSocketSession");
                companion.getClass();
                Handshake handshakeA = Handshake.Companion.a(sslSocketSession);
                HostnameVerifier hostnameVerifier = address2.f42140d;
                AbstractC3340k.b(hostnameVerifier);
                if (hostnameVerifier.verify(address2.f42144h.f42276d, sslSocketSession)) {
                    CertificatePinner certificatePinner = address2.f42141e;
                    AbstractC3340k.b(certificatePinner);
                    this.f42601e = new Handshake(handshakeA.f42262a, handshakeA.f42263b, handshakeA.f42264c, new RealConnection$connectTls$1(certificatePinner, handshakeA, address2));
                    certificatePinner.b(address2.f42144h.f42276d, new RealConnection$connectTls$2(this));
                    if (connectionSpecA.f42226b) {
                        Platform.f42887a.getClass();
                        strF = Platform.f42888b.f(sSLSocket2);
                    }
                    this.f42600d = sSLSocket2;
                    this.f42604h = AbstractC1613b.d(AbstractC1613b.n(sSLSocket2));
                    this.f42605i = AbstractC1613b.c(AbstractC1613b.j(sSLSocket2));
                    if (strF != null) {
                        Protocol.f42367b.getClass();
                        protocolA = Protocol.Companion.a(strF);
                    } else {
                        protocolA = Protocol.HTTP_1_1;
                    }
                    this.f42602f = protocolA;
                    Platform.f42887a.getClass();
                    Platform.f42888b.a(sSLSocket2);
                    if (this.f42602f == Protocol.HTTP_2) {
                        m();
                        return;
                    }
                    return;
                }
                List listA = handshakeA.a();
                if (listA.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + address2.f42144h.f42276d + " not verified (no certificates)");
                }
                X509Certificate certificate = (X509Certificate) listA.get(0);
                StringBuilder sb2 = new StringBuilder("\n              |Hostname ");
                sb2.append(address2.f42144h.f42276d);
                sb2.append(" not verified:\n              |    certificate: ");
                CertificatePinner.f42194c.getClass();
                AbstractC3340k.e(certificate, "certificate");
                C1621j c1621j = C1621j.f19903d;
                byte[] encoded = certificate.getPublicKey().getEncoded();
                AbstractC3340k.d(encoded, "publicKey.encoded");
                sb2.append(AbstractC3340k.k(ab.b.g(encoded).c("SHA-256").a(), "sha256/"));
                sb2.append("\n              |    DN: ");
                sb2.append((Object) certificate.getSubjectDN().getName());
                sb2.append("\n              |    subjectAltNames: ");
                OkHostnameVerifier.f42928a.getClass();
                sb2.append(o.E0(OkHostnameVerifier.a(certificate, 2), OkHostnameVerifier.a(certificate, 7)));
                sb2.append("\n              ");
                throw new SSLPeerUnverifiedException(l.W(sb2.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    Platform.f42887a.getClass();
                    Platform.f42888b.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    Util.d(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized void h() {
        this.f42608m++;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(okhttp3.Address r9, java.util.List r10) {
        /*
            r8 = this;
            byte[] r0 = okhttp3.internal.Util.f42438a
            java.util.ArrayList r0 = r8.f42611p
            int r0 = r0.size()
            int r1 = r8.f42610o
            r2 = 0
            if (r0 >= r1) goto Lc9
            boolean r0 = r8.f42606j
            if (r0 == 0) goto L13
            goto Lc9
        L13:
            okhttp3.Route r0 = r8.f42598b
            okhttp3.Address r1 = r0.f42427a
            boolean r1 = r1.a(r9)
            if (r1 != 0) goto L1f
            goto Lc9
        L1f:
            okhttp3.HttpUrl r1 = r9.f42144h
            java.lang.String r3 = r1.f42276d
            okhttp3.Address r4 = r0.f42427a
            okhttp3.HttpUrl r5 = r4.f42144h
            java.lang.String r5 = r5.f42276d
            boolean r3 = kotlin.jvm.internal.AbstractC3340k.a(r3, r5)
            r5 = 1
            if (r3 == 0) goto L31
            return r5
        L31:
            okhttp3.internal.http2.Http2Connection r3 = r8.f42603g
            if (r3 != 0) goto L37
            goto Lc9
        L37:
            if (r10 == 0) goto Lc9
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            boolean r3 = r10 instanceof java.util.Collection
            if (r3 == 0) goto L4a
            r3 = r10
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L4a
            goto Lc9
        L4a:
            java.util.Iterator r10 = r10.iterator()
        L4e:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto Lc9
            java.lang.Object r3 = r10.next()
            okhttp3.Route r3 = (okhttp3.Route) r3
            java.net.Proxy r6 = r3.f42428b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L4e
            java.net.Proxy r6 = r0.f42428b
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L4e
            java.net.InetSocketAddress r3 = r3.f42429c
            java.net.InetSocketAddress r6 = r0.f42429c
            boolean r3 = kotlin.jvm.internal.AbstractC3340k.a(r6, r3)
            if (r3 == 0) goto L4e
            okhttp3.internal.tls.OkHostnameVerifier r10 = okhttp3.internal.tls.OkHostnameVerifier.f42928a
            javax.net.ssl.HostnameVerifier r0 = r9.f42140d
            if (r0 == r10) goto L7d
            goto Lc9
        L7d:
            byte[] r0 = okhttp3.internal.Util.f42438a
            okhttp3.HttpUrl r0 = r4.f42144h
            int r3 = r0.f42277e
            int r4 = r1.f42277e
            if (r4 == r3) goto L88
            goto Lc9
        L88:
            java.lang.String r0 = r0.f42276d
            java.lang.String r1 = r1.f42276d
            boolean r0 = kotlin.jvm.internal.AbstractC3340k.a(r1, r0)
            if (r0 == 0) goto L93
            goto Lb7
        L93:
            boolean r0 = r8.k
            if (r0 != 0) goto Lc9
            okhttp3.Handshake r0 = r8.f42601e
            if (r0 == 0) goto Lc9
            java.util.List r0 = r0.a()
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto Lc9
            java.lang.Object r0 = r0.get(r2)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            r10.getClass()
            boolean r10 = okhttp3.internal.tls.OkHostnameVerifier.c(r1, r0)
            if (r10 == 0) goto Lc9
        Lb7:
            okhttp3.CertificatePinner r9 = r9.f42141e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc9
            kotlin.jvm.internal.AbstractC3340k.b(r9)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc9
            okhttp3.Handshake r10 = r8.f42601e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc9
            kotlin.jvm.internal.AbstractC3340k.b(r10)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc9
            java.util.List r10 = r10.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc9
            r9.a(r1, r10)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc9
            return r5
        Lc9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.i(okhttp3.Address, java.util.List):boolean");
    }

    public final boolean j(boolean z2) throws SocketException {
        long j8;
        byte[] bArr = Util.f42438a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f42599c;
        AbstractC3340k.b(socket);
        Socket socket2 = this.f42600d;
        AbstractC3340k.b(socket2);
        AbstractC3340k.b(this.f42604h);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.f42603g;
        if (http2Connection != null) {
            return http2Connection.h(jNanoTime);
        }
        synchronized (this) {
            j8 = jNanoTime - this.f42612q;
        }
        if (j8 < com.applovin.shadow.okhttp3.internal.connection.RealConnection.IDLE_CONNECTION_HEALTHY_NS || !z2) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !r4.exhausted();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final ExchangeCodec k(OkHttpClient client, RealInterceptorChain realInterceptorChain) throws SocketException {
        AbstractC3340k.e(client, "client");
        Socket socket = this.f42600d;
        AbstractC3340k.b(socket);
        C1610B c1610b = this.f42604h;
        AbstractC3340k.b(c1610b);
        C1609A c1609a = this.f42605i;
        AbstractC3340k.b(c1609a);
        Http2Connection http2Connection = this.f42603g;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(client, this, realInterceptorChain, http2Connection);
        }
        int i5 = realInterceptorChain.f42649g;
        socket.setSoTimeout(i5);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c1610b.f19863a.timeout().g(i5, timeUnit);
        c1609a.f19860a.timeout().g(realInterceptorChain.f42650h, timeUnit);
        return new Http1ExchangeCodec(client, this, c1610b, c1609a);
    }

    public final synchronized void l() {
        this.f42606j = true;
    }

    public final void m() throws SocketException {
        Socket socket = this.f42600d;
        AbstractC3340k.b(socket);
        C1610B c1610b = this.f42604h;
        AbstractC3340k.b(c1610b);
        C1609A c1609a = this.f42605i;
        AbstractC3340k.b(c1609a);
        socket.setSoTimeout(0);
        TaskRunner taskRunner = TaskRunner.f42534i;
        Http2Connection.Builder builder = new Http2Connection.Builder(taskRunner);
        String peerName = this.f42598b.f42427a.f42144h.f42276d;
        AbstractC3340k.e(peerName, "peerName");
        builder.f42784b = socket;
        String str = Util.f42444g + ' ' + peerName;
        AbstractC3340k.e(str, "<set-?>");
        builder.f42785c = str;
        builder.f42786d = c1610b;
        builder.f42787e = c1609a;
        builder.f42788f = this;
        Http2Connection http2Connection = new Http2Connection(builder);
        this.f42603g = http2Connection;
        Http2Connection.f42728A.getClass();
        Settings settings = Http2Connection.f42729B;
        this.f42610o = (settings.f42852a & 16) != 0 ? settings.f42853b[4] : f.API_PRIORITY_OTHER;
        Http2Writer http2Writer = http2Connection.f42752x;
        synchronized (http2Writer) {
            try {
                if (http2Writer.f42841d) {
                    throw new IOException("closed");
                }
                Logger logger = Http2Writer.f42837f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Util.h(AbstractC3340k.k(Http2.f42724b.e(), ">> CONNECTION "), new Object[0]));
                }
                http2Writer.f42838a.u(Http2.f42724b);
                http2Writer.f42838a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
        http2Connection.f42752x.y(http2Connection.f42745q);
        if (http2Connection.f42745q.a() != 65535) {
            http2Connection.f42752x.z(0, r1 - com.applovin.shadow.okhttp3.internal.http2.Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        }
        TaskQueue taskQueueE = taskRunner.e();
        final String str2 = http2Connection.f42732c;
        final Http2Connection.ReaderRunnable readerRunnable = http2Connection.f42753y;
        taskQueueE.c(new Task(str2) { // from class: okhttp3.internal.concurrent.TaskQueue$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() throws Throwable {
                readerRunnable.invoke();
                return -1L;
            }
        }, 0L);
    }

    public final String toString() {
        CipherSuite cipherSuite;
        StringBuilder sb2 = new StringBuilder("Connection{");
        Route route = this.f42598b;
        sb2.append(route.f42427a.f42144h.f42276d);
        sb2.append(':');
        sb2.append(route.f42427a.f42144h.f42277e);
        sb2.append(", proxy=");
        sb2.append(route.f42428b);
        sb2.append(" hostAddress=");
        sb2.append(route.f42429c);
        sb2.append(" cipherSuite=");
        Handshake handshake = this.f42601e;
        Object obj = "none";
        if (handshake != null && (cipherSuite = handshake.f42263b) != null) {
            obj = cipherSuite;
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f42602f);
        sb2.append('}');
        return sb2.toString();
    }
}
