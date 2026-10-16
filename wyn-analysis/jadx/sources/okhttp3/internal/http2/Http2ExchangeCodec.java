package okhttp3.internal.http2;

import cg.C1621j;
import cg.F;
import cg.H;
import com.google.android.gms.internal.consent_sdk.a;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.http2.Http2Stream;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Http2ExchangeCodec implements ExchangeCodec {

    /* renamed from: g, reason: collision with root package name */
    public static final Companion f42793g = new Companion(0);

    /* renamed from: h, reason: collision with root package name */
    public static final List f42794h = Util.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", com.applovin.shadow.okhttp3.internal.http2.Header.TARGET_METHOD_UTF8, com.applovin.shadow.okhttp3.internal.http2.Header.TARGET_PATH_UTF8, com.applovin.shadow.okhttp3.internal.http2.Header.TARGET_SCHEME_UTF8, com.applovin.shadow.okhttp3.internal.http2.Header.TARGET_AUTHORITY_UTF8);

    /* renamed from: i, reason: collision with root package name */
    public static final List f42795i = Util.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final RealConnection f42796a;

    /* renamed from: b, reason: collision with root package name */
    public final RealInterceptorChain f42797b;

    /* renamed from: c, reason: collision with root package name */
    public final Http2Connection f42798c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Http2Stream f42799d;

    /* renamed from: e, reason: collision with root package name */
    public final Protocol f42800e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f42801f;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;", "", "<init>", "()V", "", "CONNECTION", "Ljava/lang/String;", "ENCODING", "HOST", "", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", "TE", "TRANSFER_ENCODING", "UPGRADE", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        private Companion() {
        }
    }

    public Http2ExchangeCodec(OkHttpClient client, RealConnection connection, RealInterceptorChain realInterceptorChain, Http2Connection http2Connection) {
        AbstractC3340k.e(client, "client");
        AbstractC3340k.e(connection, "connection");
        AbstractC3340k.e(http2Connection, "http2Connection");
        this.f42796a = connection;
        this.f42797b = realInterceptorChain;
        this.f42798c = http2Connection;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f42800e = client.f42333s.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final H a(Response response) {
        Http2Stream http2Stream = this.f42799d;
        AbstractC3340k.b(http2Stream);
        return http2Stream.f42821i;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long b(Response response) {
        if (HttpHeaders.a(response)) {
            return Util.j(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final F c(Request request, long j8) {
        AbstractC3340k.e(request, "request");
        Http2Stream http2Stream = this.f42799d;
        AbstractC3340k.b(http2Stream);
        return http2Stream.g();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        this.f42801f = true;
        Http2Stream http2Stream = this.f42799d;
        if (http2Stream == null) {
            return;
        }
        http2Stream.e(ErrorCode.CANCEL);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void d(Request request) throws IOException {
        int i5;
        Http2Stream http2Stream;
        AbstractC3340k.e(request, "request");
        if (this.f42799d != null) {
            return;
        }
        boolean z2 = true;
        boolean z10 = request.f42379d != null;
        f42793g.getClass();
        Headers headers = request.f42378c;
        ArrayList arrayList = new ArrayList(headers.size() + 4);
        arrayList.add(new Header(Header.f42698f, request.f42377b));
        C1621j c1621j = Header.f42699g;
        RequestLine requestLine = RequestLine.f42655a;
        HttpUrl httpUrl = request.f42376a;
        requestLine.getClass();
        arrayList.add(new Header(c1621j, RequestLine.a(httpUrl)));
        String strA = request.f42378c.a("Host");
        if (strA != null) {
            arrayList.add(new Header(Header.f42701i, strA));
        }
        arrayList.add(new Header(Header.f42700h, httpUrl.f42273a));
        int size = headers.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            String strC = headers.c(i10);
            Locale locale = Locale.US;
            String strV = a.v(locale, "US", strC, locale, "this as java.lang.String).toLowerCase(locale)");
            if (!f42794h.contains(strV) || (strV.equals("te") && AbstractC3340k.a(headers.f(i10), "trailers"))) {
                arrayList.add(new Header(strV, headers.f(i10)));
            }
            i10 = i11;
        }
        Http2Connection http2Connection = this.f42798c;
        http2Connection.getClass();
        boolean z11 = !z10;
        synchronized (http2Connection.f42752x) {
            synchronized (http2Connection) {
                try {
                    if (http2Connection.f42734e > 1073741823) {
                        http2Connection.o(ErrorCode.REFUSED_STREAM);
                    }
                    if (http2Connection.f42735f) {
                        throw new ConnectionShutdownException();
                    }
                    i5 = http2Connection.f42734e;
                    http2Connection.f42734e = i5 + 2;
                    http2Stream = new Http2Stream(i5, http2Connection, z11, false, null);
                    if (z10 && http2Connection.f42749u < http2Connection.f42750v && http2Stream.f42817e < http2Stream.f42818f) {
                        z2 = false;
                    }
                    if (http2Stream.i()) {
                        http2Connection.f42731b.put(Integer.valueOf(i5), http2Stream);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            http2Connection.f42752x.i(z11, i5, arrayList);
        }
        if (z2) {
            http2Connection.f42752x.flush();
        }
        this.f42799d = http2Stream;
        if (this.f42801f) {
            Http2Stream http2Stream2 = this.f42799d;
            AbstractC3340k.b(http2Stream2);
            http2Stream2.e(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        Http2Stream http2Stream3 = this.f42799d;
        AbstractC3340k.b(http2Stream3);
        Http2Stream.StreamTimeout streamTimeout = http2Stream3.k;
        long j8 = this.f42797b.f42649g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        streamTimeout.g(j8, timeUnit);
        Http2Stream http2Stream4 = this.f42799d;
        AbstractC3340k.b(http2Stream4);
        http2Stream4.f42823l.g(this.f42797b.f42650h, timeUnit);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void finishRequest() {
        Http2Stream http2Stream = this.f42799d;
        AbstractC3340k.b(http2Stream);
        http2Stream.g().close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void flushRequest() {
        this.f42798c.f42752x.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* renamed from: getConnection, reason: from getter */
    public final RealConnection getF42796a() {
        return this.f42796a;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Response.Builder readResponseHeaders(boolean z2) throws NumberFormatException, IOException {
        Headers headers;
        Http2Stream http2Stream = this.f42799d;
        AbstractC3340k.b(http2Stream);
        synchronized (http2Stream) {
            http2Stream.k.h();
            while (http2Stream.f42819g.isEmpty() && http2Stream.f42824m == null) {
                try {
                    http2Stream.l();
                } catch (Throwable th) {
                    http2Stream.k.k();
                    throw th;
                }
            }
            http2Stream.k.k();
            if (http2Stream.f42819g.isEmpty()) {
                IOException iOException = http2Stream.f42825n;
                if (iOException != null) {
                    throw iOException;
                }
                ErrorCode errorCode = http2Stream.f42824m;
                AbstractC3340k.b(errorCode);
                throw new StreamResetException(errorCode);
            }
            Object objRemoveFirst = http2Stream.f42819g.removeFirst();
            AbstractC3340k.d(objRemoveFirst, "headersQueue.removeFirst()");
            headers = (Headers) objRemoveFirst;
        }
        Companion companion = f42793g;
        Protocol protocol = this.f42800e;
        companion.getClass();
        AbstractC3340k.e(protocol, "protocol");
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        int i5 = 0;
        StatusLine statusLineA = null;
        while (i5 < size) {
            int i10 = i5 + 1;
            String strC = headers.c(i5);
            String strF = headers.f(i5);
            if (AbstractC3340k.a(strC, com.applovin.shadow.okhttp3.internal.http2.Header.RESPONSE_STATUS_UTF8)) {
                StatusLine.Companion companion2 = StatusLine.f42657d;
                String strK = AbstractC3340k.k(strF, "HTTP/1.1 ");
                companion2.getClass();
                statusLineA = StatusLine.Companion.a(strK);
            } else if (!f42795i.contains(strC)) {
                builder.c(strC, strF);
            }
            i5 = i10;
        }
        if (statusLineA == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        Response.Builder builder2 = new Response.Builder();
        builder2.f42409b = protocol;
        builder2.f42410c = statusLineA.f42659b;
        String message = statusLineA.f42660c;
        AbstractC3340k.e(message, "message");
        builder2.f42411d = message;
        builder2.c(builder.d());
        if (z2 && builder2.f42410c == 100) {
            return null;
        }
        return builder2;
    }
}
