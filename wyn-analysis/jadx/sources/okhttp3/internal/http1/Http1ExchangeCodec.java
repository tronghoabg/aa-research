package okhttp3.internal.http1;

import cg.C1609A;
import cg.C1610B;
import cg.C1618g;
import cg.F;
import cg.H;
import cg.J;
import cg.p;
import com.google.android.gms.common.api.f;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "AbstractSource", "ChunkedSink", "ChunkedSource", "Companion", "FixedLengthSource", "KnownLengthSink", "UnknownLengthSource", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f42663h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f42664a;

    /* renamed from: b, reason: collision with root package name */
    public final RealConnection f42665b;

    /* renamed from: c, reason: collision with root package name */
    public final C1610B f42666c;

    /* renamed from: d, reason: collision with root package name */
    public final C1609A f42667d;

    /* renamed from: e, reason: collision with root package name */
    public int f42668e;

    /* renamed from: f, reason: collision with root package name */
    public final HeadersReader f42669f;

    /* renamed from: g, reason: collision with root package name */
    public Headers f42670g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b¢\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lcg/H;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public abstract class AbstractSource implements H {

        /* renamed from: a, reason: collision with root package name */
        public final p f42671a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f42672b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Http1ExchangeCodec f42673c;

        public AbstractSource(Http1ExchangeCodec this$0) {
            AbstractC3340k.e(this$0, "this$0");
            this.f42673c = this$0;
            this.f42671a = new p(this$0.f42666c.f19863a.timeout());
        }

        public final void a() {
            Http1ExchangeCodec http1ExchangeCodec = this.f42673c;
            int i5 = http1ExchangeCodec.f42668e;
            if (i5 == 6) {
                return;
            }
            if (i5 != 5) {
                throw new IllegalStateException(AbstractC3340k.k(Integer.valueOf(http1ExchangeCodec.f42668e), "state: "));
            }
            p pVar = this.f42671a;
            J j8 = pVar.f19915e;
            pVar.f19915e = J.f19879d;
            j8.a();
            j8.b();
            http1ExchangeCodec.f42668e = 6;
        }

        @Override // cg.H
        public long read(C1618g sink, long j8) throws IOException {
            Http1ExchangeCodec http1ExchangeCodec = this.f42673c;
            AbstractC3340k.e(sink, "sink");
            try {
                return http1ExchangeCodec.f42666c.read(sink, j8);
            } catch (IOException e7) {
                http1ExchangeCodec.f42665b.l();
                a();
                throw e7;
            }
        }

        @Override // cg.H
        public final J timeout() {
            return this.f42671a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;", "Lcg/F;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class ChunkedSink implements F {

        /* renamed from: a, reason: collision with root package name */
        public final p f42674a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f42675b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Http1ExchangeCodec f42676c;

        public ChunkedSink(Http1ExchangeCodec this$0) {
            AbstractC3340k.e(this$0, "this$0");
            this.f42676c = this$0;
            this.f42674a = new p(this$0.f42667d.f19860a.timeout());
        }

        @Override // cg.F
        public final void E(C1618g source, long j8) {
            AbstractC3340k.e(source, "source");
            if (this.f42675b) {
                throw new IllegalStateException("closed");
            }
            if (j8 == 0) {
                return;
            }
            Http1ExchangeCodec http1ExchangeCodec = this.f42676c;
            C1609A c1609a = http1ExchangeCodec.f42667d;
            if (c1609a.f19862c) {
                throw new IllegalStateException("closed");
            }
            c1609a.f19861b.Z(j8);
            c1609a.b();
            C1609A c1609a2 = http1ExchangeCodec.f42667d;
            c1609a2.writeUtf8("\r\n");
            c1609a2.E(source, j8);
            c1609a2.writeUtf8("\r\n");
        }

        @Override // cg.F, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f42675b) {
                return;
            }
            this.f42675b = true;
            this.f42676c.f42667d.writeUtf8("0\r\n\r\n");
            Http1ExchangeCodec http1ExchangeCodec = this.f42676c;
            p pVar = this.f42674a;
            http1ExchangeCodec.getClass();
            J j8 = pVar.f19915e;
            pVar.f19915e = J.f19879d;
            j8.a();
            j8.b();
            this.f42676c.f42668e = 3;
        }

        @Override // cg.F, java.io.Flushable
        public final synchronized void flush() {
            if (this.f42675b) {
                return;
            }
            this.f42676c.f42667d.flush();
        }

        @Override // cg.F
        public final J timeout() {
            return this.f42674a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class ChunkedSource extends AbstractSource {

        /* renamed from: d, reason: collision with root package name */
        public final HttpUrl f42677d;

        /* renamed from: e, reason: collision with root package name */
        public long f42678e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f42679f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Http1ExchangeCodec f42680g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec this$0, HttpUrl url) {
            super(this$0);
            AbstractC3340k.e(this$0, "this$0");
            AbstractC3340k.e(url, "url");
            this.f42680g = this$0;
            this.f42677d = url;
            this.f42678e = -1L;
            this.f42679f = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f42672b) {
                return;
            }
            if (this.f42679f) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!Util.g(this)) {
                    this.f42680g.f42665b.l();
                    a();
                }
            }
            this.f42672b = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x010c, code lost:
        
            if (r18.f42679f == false) goto L56;
         */
        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, cg.H
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final long read(cg.C1618g r19, long r20) throws java.io.IOException, java.lang.NumberFormatException {
            /*
                Method dump skipped, instructions count: 373
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http1.Http1ExchangeCodec.ChunkedSource.read(cg.g, long):long");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$Companion;", "", "()V", "NO_CHUNK_YET", "", "STATE_CLOSED", "", "STATE_IDLE", "STATE_OPEN_REQUEST_BODY", "STATE_OPEN_RESPONSE_BODY", "STATE_READING_RESPONSE_BODY", "STATE_READ_RESPONSE_HEADERS", "STATE_WRITING_REQUEST_BODY", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class FixedLengthSource extends AbstractSource {

        /* renamed from: d, reason: collision with root package name */
        public long f42681d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Http1ExchangeCodec f42682e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FixedLengthSource(Http1ExchangeCodec this$0, long j8) {
            super(this$0);
            AbstractC3340k.e(this$0, "this$0");
            this.f42682e = this$0;
            this.f42681d = j8;
            if (j8 == 0) {
                a();
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f42672b) {
                return;
            }
            if (this.f42681d != 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!Util.g(this)) {
                    this.f42682e.f42665b.l();
                    a();
                }
            }
            this.f42672b = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, cg.H
        public final long read(C1618g sink, long j8) throws IOException {
            AbstractC3340k.e(sink, "sink");
            if (j8 < 0) {
                throw new IllegalArgumentException(AbstractC3340k.k(Long.valueOf(j8), "byteCount < 0: ").toString());
            }
            if (this.f42672b) {
                throw new IllegalStateException("closed");
            }
            long j10 = this.f42681d;
            if (j10 == 0) {
                return -1L;
            }
            long j11 = super.read(sink, Math.min(j10, j8));
            if (j11 == -1) {
                this.f42682e.f42665b.l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
            long j12 = this.f42681d - j11;
            this.f42681d = j12;
            if (j12 == 0) {
                a();
            }
            return j11;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;", "Lcg/F;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class KnownLengthSink implements F {

        /* renamed from: a, reason: collision with root package name */
        public final p f42683a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f42684b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Http1ExchangeCodec f42685c;

        public KnownLengthSink(Http1ExchangeCodec this$0) {
            AbstractC3340k.e(this$0, "this$0");
            this.f42685c = this$0;
            this.f42683a = new p(this$0.f42667d.f19860a.timeout());
        }

        @Override // cg.F
        public final void E(C1618g source, long j8) {
            AbstractC3340k.e(source, "source");
            if (this.f42684b) {
                throw new IllegalStateException("closed");
            }
            long j10 = source.f19902b;
            byte[] bArr = Util.f42438a;
            if (j8 < 0 || 0 > j10 || j10 < j8) {
                throw new ArrayIndexOutOfBoundsException();
            }
            this.f42685c.f42667d.E(source, j8);
        }

        @Override // cg.F, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f42684b) {
                return;
            }
            this.f42684b = true;
            int i5 = Http1ExchangeCodec.f42663h;
            Http1ExchangeCodec http1ExchangeCodec = this.f42685c;
            http1ExchangeCodec.getClass();
            p pVar = this.f42683a;
            J j8 = pVar.f19915e;
            pVar.f19915e = J.f19879d;
            j8.a();
            j8.b();
            http1ExchangeCodec.f42668e = 3;
        }

        @Override // cg.F, java.io.Flushable
        public final void flush() {
            if (this.f42684b) {
                return;
            }
            this.f42685c.f42667d.flush();
        }

        @Override // cg.F
        public final J timeout() {
            return this.f42683a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class UnknownLengthSource extends AbstractSource {

        /* renamed from: d, reason: collision with root package name */
        public boolean f42686d;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f42672b) {
                return;
            }
            if (!this.f42686d) {
                a();
            }
            this.f42672b = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, cg.H
        public final long read(C1618g sink, long j8) throws IOException {
            AbstractC3340k.e(sink, "sink");
            if (j8 < 0) {
                throw new IllegalArgumentException(AbstractC3340k.k(Long.valueOf(j8), "byteCount < 0: ").toString());
            }
            if (this.f42672b) {
                throw new IllegalStateException("closed");
            }
            if (this.f42686d) {
                return -1L;
            }
            long j10 = super.read(sink, j8);
            if (j10 != -1) {
                return j10;
            }
            this.f42686d = true;
            a();
            return -1L;
        }
    }

    static {
        new Companion(0);
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection connection, C1610B source, C1609A sink) {
        AbstractC3340k.e(connection, "connection");
        AbstractC3340k.e(source, "source");
        AbstractC3340k.e(sink, "sink");
        this.f42664a = okHttpClient;
        this.f42665b = connection;
        this.f42666c = source;
        this.f42667d = sink;
        this.f42669f = new HeadersReader(source);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final H a(Response response) {
        if (!HttpHeaders.a(response)) {
            return e(0L);
        }
        if ("chunked".equalsIgnoreCase(Response.b("Transfer-Encoding", response))) {
            HttpUrl httpUrl = response.f42395a.f42376a;
            int i5 = this.f42668e;
            if (i5 != 4) {
                throw new IllegalStateException(AbstractC3340k.k(Integer.valueOf(i5), "state: ").toString());
            }
            this.f42668e = 5;
            return new ChunkedSource(this, httpUrl);
        }
        long j8 = Util.j(response);
        if (j8 != -1) {
            return e(j8);
        }
        int i10 = this.f42668e;
        if (i10 != 4) {
            throw new IllegalStateException(AbstractC3340k.k(Integer.valueOf(i10), "state: ").toString());
        }
        this.f42668e = 5;
        this.f42665b.l();
        return new UnknownLengthSource(this);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long b(Response response) {
        if (!HttpHeaders.a(response)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(Response.b("Transfer-Encoding", response))) {
            return -1L;
        }
        return Util.j(response);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final F c(Request request, long j8) throws ProtocolException {
        AbstractC3340k.e(request, "request");
        RequestBody requestBody = request.f42379d;
        if (requestBody != null && requestBody.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(request.f42378c.a("Transfer-Encoding"))) {
            int i5 = this.f42668e;
            if (i5 != 1) {
                throw new IllegalStateException(AbstractC3340k.k(Integer.valueOf(i5), "state: ").toString());
            }
            this.f42668e = 2;
            return new ChunkedSink(this);
        }
        if (j8 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        int i10 = this.f42668e;
        if (i10 != 1) {
            throw new IllegalStateException(AbstractC3340k.k(Integer.valueOf(i10), "state: ").toString());
        }
        this.f42668e = 2;
        return new KnownLengthSink(this);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        Socket socket = this.f42665b.f42599c;
        if (socket == null) {
            return;
        }
        Util.d(socket);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void d(Request request) {
        AbstractC3340k.e(request, "request");
        RequestLine requestLine = RequestLine.f42655a;
        Proxy.Type type = this.f42665b.f42598b.f42428b.type();
        AbstractC3340k.d(type, "connection.route().proxy.type()");
        requestLine.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.f42377b);
        sb2.append(' ');
        HttpUrl httpUrl = request.f42376a;
        if (httpUrl.f42282j || type != Proxy.Type.HTTP) {
            sb2.append(RequestLine.a(httpUrl));
        } else {
            sb2.append(httpUrl);
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        AbstractC3340k.d(string, "StringBuilder().apply(builderAction).toString()");
        g(request.f42378c, string);
    }

    public final H e(long j8) {
        int i5 = this.f42668e;
        if (i5 != 4) {
            throw new IllegalStateException(AbstractC3340k.k(Integer.valueOf(i5), "state: ").toString());
        }
        this.f42668e = 5;
        return new FixedLengthSource(this, j8);
    }

    public final void f(Response response) {
        long j8 = Util.j(response);
        if (j8 == -1) {
            return;
        }
        H hE = e(j8);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Util.u(hE, f.API_PRIORITY_OTHER);
        ((FixedLengthSource) hE).close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void finishRequest() {
        this.f42667d.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void flushRequest() {
        this.f42667d.flush();
    }

    public final void g(Headers headers, String requestLine) {
        AbstractC3340k.e(requestLine, "requestLine");
        int i5 = this.f42668e;
        if (i5 != 0) {
            throw new IllegalStateException(AbstractC3340k.k(Integer.valueOf(i5), "state: ").toString());
        }
        C1609A c1609a = this.f42667d;
        c1609a.writeUtf8(requestLine);
        c1609a.writeUtf8("\r\n");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            c1609a.writeUtf8(headers.c(i10));
            c1609a.writeUtf8(": ");
            c1609a.writeUtf8(headers.f(i10));
            c1609a.writeUtf8("\r\n");
        }
        c1609a.writeUtf8("\r\n");
        this.f42668e = 1;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* renamed from: getConnection, reason: from getter */
    public final RealConnection getF42796a() {
        return this.f42665b;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Response.Builder readResponseHeaders(boolean z2) {
        HeadersReader headersReader = this.f42669f;
        int i5 = this.f42668e;
        if (i5 != 1 && i5 != 3) {
            throw new IllegalStateException(AbstractC3340k.k(Integer.valueOf(i5), "state: ").toString());
        }
        try {
            StatusLine.Companion companion = StatusLine.f42657d;
            String utf8LineStrict = headersReader.f42661a.readUtf8LineStrict(headersReader.f42662b);
            headersReader.f42662b -= utf8LineStrict.length();
            companion.getClass();
            StatusLine statusLineA = StatusLine.Companion.a(utf8LineStrict);
            int i10 = statusLineA.f42659b;
            Response.Builder builder = new Response.Builder();
            Protocol protocol = statusLineA.f42658a;
            AbstractC3340k.e(protocol, "protocol");
            builder.f42409b = protocol;
            builder.f42410c = i10;
            String message = statusLineA.f42660c;
            AbstractC3340k.e(message, "message");
            builder.f42411d = message;
            Headers.Builder builder2 = new Headers.Builder();
            while (true) {
                String utf8LineStrict2 = headersReader.f42661a.readUtf8LineStrict(headersReader.f42662b);
                headersReader.f42662b -= utf8LineStrict2.length();
                if (utf8LineStrict2.length() == 0) {
                    break;
                }
                builder2.b(utf8LineStrict2);
            }
            builder.c(builder2.d());
            if (z2 && i10 == 100) {
                return null;
            }
            if (i10 == 100) {
                this.f42668e = 3;
                return builder;
            }
            this.f42668e = 4;
            return builder;
        } catch (EOFException e7) {
            throw new IOException(AbstractC3340k.k(this.f42665b.f42598b.f42427a.f42144h.h(), "unexpected end of stream on "), e7);
        }
    }
}
