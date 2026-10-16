package okhttp3.internal.connection;

import Va.M6;
import cg.C1618g;
import cg.F;
import cg.H;
import cg.n;
import cg.o;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.EventListener;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/Exchange;", "", "RequestBodySink", "ResponseBodySource", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Exchange {

    /* renamed from: a, reason: collision with root package name */
    public final RealCall f42550a;

    /* renamed from: b, reason: collision with root package name */
    public final EventListener f42551b;

    /* renamed from: c, reason: collision with root package name */
    public final ExchangeFinder f42552c;

    /* renamed from: d, reason: collision with root package name */
    public final ExchangeCodec f42553d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f42554e;

    /* renamed from: f, reason: collision with root package name */
    public final RealConnection f42555f;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/Exchange$RequestBodySink;", "Lcg/n;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class RequestBodySink extends n {

        /* renamed from: b, reason: collision with root package name */
        public final long f42556b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f42557c;

        /* renamed from: d, reason: collision with root package name */
        public long f42558d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f42559e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Exchange f42560f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange this$0, F delegate, long j8) {
            super(delegate);
            AbstractC3340k.e(this$0, "this$0");
            AbstractC3340k.e(delegate, "delegate");
            this.f42560f = this$0;
            this.f42556b = j8;
        }

        @Override // cg.n, cg.F
        public final void E(C1618g source, long j8) throws IOException {
            AbstractC3340k.e(source, "source");
            if (this.f42559e) {
                throw new IllegalStateException("closed");
            }
            long j10 = this.f42556b;
            if (j10 != -1 && this.f42558d + j8 > j10) {
                StringBuilder sbU = M6.u(j10, "expected ", " bytes but received ");
                sbU.append(this.f42558d + j8);
                throw new ProtocolException(sbU.toString());
            }
            try {
                super.E(source, j8);
                this.f42558d += j8;
            } catch (IOException e7) {
                throw a(e7);
            }
        }

        public final IOException a(IOException iOException) {
            if (this.f42557c) {
                return iOException;
            }
            this.f42557c = true;
            return this.f42560f.a(false, true, iOException);
        }

        @Override // cg.n, cg.F, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f42559e) {
                return;
            }
            this.f42559e = true;
            long j8 = this.f42556b;
            if (j8 != -1 && this.f42558d != j8) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e7) {
                throw a(e7);
            }
        }

        @Override // cg.n, cg.F, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e7) {
                throw a(e7);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/Exchange$ResponseBodySource;", "Lcg/o;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class ResponseBodySource extends o {

        /* renamed from: b, reason: collision with root package name */
        public final long f42561b;

        /* renamed from: c, reason: collision with root package name */
        public long f42562c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f42563d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f42564e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f42565f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Exchange f42566g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange this$0, H delegate, long j8) {
            super(delegate);
            AbstractC3340k.e(this$0, "this$0");
            AbstractC3340k.e(delegate, "delegate");
            this.f42566g = this$0;
            this.f42561b = j8;
            this.f42563d = true;
            if (j8 == 0) {
                a(null);
            }
        }

        public final IOException a(IOException iOException) {
            if (this.f42564e) {
                return iOException;
            }
            this.f42564e = true;
            Exchange exchange = this.f42566g;
            if (iOException == null && this.f42563d) {
                this.f42563d = false;
                exchange.f42551b.getClass();
                RealCall call = exchange.f42550a;
                AbstractC3340k.e(call, "call");
            }
            return exchange.a(true, false, iOException);
        }

        @Override // cg.o, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f42565f) {
                return;
            }
            this.f42565f = true;
            try {
                super.close();
                a(null);
            } catch (IOException e7) {
                throw a(e7);
            }
        }

        @Override // cg.o, cg.H
        public final long read(C1618g sink, long j8) throws IOException {
            AbstractC3340k.e(sink, "sink");
            if (this.f42565f) {
                throw new IllegalStateException("closed");
            }
            try {
                long j10 = delegate().read(sink, j8);
                if (this.f42563d) {
                    this.f42563d = false;
                    Exchange exchange = this.f42566g;
                    EventListener eventListener = exchange.f42551b;
                    RealCall call = exchange.f42550a;
                    eventListener.getClass();
                    AbstractC3340k.e(call, "call");
                }
                if (j10 == -1) {
                    a(null);
                    return -1L;
                }
                long j11 = this.f42562c + j10;
                long j12 = this.f42561b;
                if (j12 == -1 || j11 <= j12) {
                    this.f42562c = j11;
                    if (j11 == j12) {
                        a(null);
                    }
                    return j10;
                }
                throw new ProtocolException("expected " + j12 + " bytes but received " + j11);
            } catch (IOException e7) {
                throw a(e7);
            }
        }
    }

    public Exchange(RealCall call, EventListener eventListener, ExchangeFinder finder, ExchangeCodec exchangeCodec) {
        AbstractC3340k.e(call, "call");
        AbstractC3340k.e(eventListener, "eventListener");
        AbstractC3340k.e(finder, "finder");
        this.f42550a = call;
        this.f42551b = eventListener;
        this.f42552c = finder;
        this.f42553d = exchangeCodec;
        this.f42555f = exchangeCodec.getF42796a();
    }

    public final IOException a(boolean z2, boolean z10, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        EventListener eventListener = this.f42551b;
        RealCall call = this.f42550a;
        if (z10) {
            if (iOException != null) {
                eventListener.getClass();
                AbstractC3340k.e(call, "call");
            } else {
                eventListener.getClass();
                AbstractC3340k.e(call, "call");
            }
        }
        if (z2) {
            if (iOException != null) {
                eventListener.getClass();
                AbstractC3340k.e(call, "call");
            } else {
                eventListener.getClass();
                AbstractC3340k.e(call, "call");
            }
        }
        return call.e(this, z10, z2, iOException);
    }

    public final F b(Request request, boolean z2) {
        AbstractC3340k.e(request, "request");
        this.f42554e = z2;
        RequestBody requestBody = request.f42379d;
        AbstractC3340k.b(requestBody);
        long jContentLength = requestBody.contentLength();
        this.f42551b.getClass();
        RealCall call = this.f42550a;
        AbstractC3340k.e(call, "call");
        return new RequestBodySink(this, this.f42553d.c(request, jContentLength), jContentLength);
    }

    public final Response.Builder c(boolean z2) throws IOException {
        try {
            Response.Builder responseHeaders = this.f42553d.readResponseHeaders(z2);
            if (responseHeaders == null) {
                return responseHeaders;
            }
            responseHeaders.f42419m = this;
            return responseHeaders;
        } catch (IOException e7) {
            this.f42551b.getClass();
            RealCall call = this.f42550a;
            AbstractC3340k.e(call, "call");
            d(e7);
            throw e7;
        }
    }

    public final void d(IOException iOException) {
        this.f42552c.c(iOException);
        RealConnection connection = this.f42553d.getF42796a();
        RealCall call = this.f42550a;
        synchronized (connection) {
            try {
                AbstractC3340k.e(call, "call");
                if (!(iOException instanceof StreamResetException)) {
                    if (!(connection.f42603g != null) || (iOException instanceof ConnectionShutdownException)) {
                        connection.f42606j = true;
                        if (connection.f42608m == 0) {
                            RealConnection.d(call.f42577a, connection.f42598b, iOException);
                            connection.f42607l++;
                        }
                    }
                } else if (((StreamResetException) iOException).f42854a == ErrorCode.REFUSED_STREAM) {
                    int i5 = connection.f42609n + 1;
                    connection.f42609n = i5;
                    if (i5 > 1) {
                        connection.f42606j = true;
                        connection.f42607l++;
                    }
                } else if (((StreamResetException) iOException).f42854a != ErrorCode.CANCEL || !call.f42590o) {
                    connection.f42606j = true;
                    connection.f42607l++;
                }
            } finally {
            }
        }
    }
}
