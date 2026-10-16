package okhttp3;

import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "Builder", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Response implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Request f42395a;

    /* renamed from: b, reason: collision with root package name */
    public final Protocol f42396b;

    /* renamed from: c, reason: collision with root package name */
    public final String f42397c;

    /* renamed from: d, reason: collision with root package name */
    public final int f42398d;

    /* renamed from: e, reason: collision with root package name */
    public final Handshake f42399e;

    /* renamed from: f, reason: collision with root package name */
    public final Headers f42400f;

    /* renamed from: g, reason: collision with root package name */
    public final ResponseBody f42401g;

    /* renamed from: h, reason: collision with root package name */
    public final Response f42402h;

    /* renamed from: i, reason: collision with root package name */
    public final Response f42403i;

    /* renamed from: j, reason: collision with root package name */
    public final Response f42404j;
    public final long k;

    /* renamed from: l, reason: collision with root package name */
    public final long f42405l;

    /* renamed from: m, reason: collision with root package name */
    public final Exchange f42406m;

    /* renamed from: n, reason: collision with root package name */
    public CacheControl f42407n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Response$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public Request f42408a;

        /* renamed from: b, reason: collision with root package name */
        public Protocol f42409b;

        /* renamed from: d, reason: collision with root package name */
        public String f42411d;

        /* renamed from: e, reason: collision with root package name */
        public Handshake f42412e;

        /* renamed from: g, reason: collision with root package name */
        public ResponseBody f42414g;

        /* renamed from: h, reason: collision with root package name */
        public Response f42415h;

        /* renamed from: i, reason: collision with root package name */
        public Response f42416i;

        /* renamed from: j, reason: collision with root package name */
        public Response f42417j;
        public long k;

        /* renamed from: l, reason: collision with root package name */
        public long f42418l;

        /* renamed from: m, reason: collision with root package name */
        public Exchange f42419m;

        /* renamed from: c, reason: collision with root package name */
        public int f42410c = -1;

        /* renamed from: f, reason: collision with root package name */
        public Headers.Builder f42413f = new Headers.Builder();

        public static void b(String str, Response response) {
            if (response == null) {
                return;
            }
            if (response.f42401g != null) {
                throw new IllegalArgumentException(AbstractC3340k.k(".body != null", str).toString());
            }
            if (response.f42402h != null) {
                throw new IllegalArgumentException(AbstractC3340k.k(".networkResponse != null", str).toString());
            }
            if (response.f42403i != null) {
                throw new IllegalArgumentException(AbstractC3340k.k(".cacheResponse != null", str).toString());
            }
            if (response.f42404j != null) {
                throw new IllegalArgumentException(AbstractC3340k.k(".priorResponse != null", str).toString());
            }
        }

        public final Response a() {
            int i5 = this.f42410c;
            if (i5 < 0) {
                throw new IllegalStateException(AbstractC3340k.k(Integer.valueOf(i5), "code < 0: ").toString());
            }
            Request request = this.f42408a;
            if (request == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.f42409b;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f42411d;
            if (str != null) {
                return new Response(request, protocol, str, i5, this.f42412e, this.f42413f.d(), this.f42414g, this.f42415h, this.f42416i, this.f42417j, this.k, this.f42418l, this.f42419m);
            }
            throw new IllegalStateException("message == null");
        }

        public final void c(Headers headers) {
            AbstractC3340k.e(headers, "headers");
            this.f42413f = headers.d();
        }
    }

    public Response(Request request, Protocol protocol, String message, int i5, Handshake handshake, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j8, long j10, Exchange exchange) {
        AbstractC3340k.e(request, "request");
        AbstractC3340k.e(protocol, "protocol");
        AbstractC3340k.e(message, "message");
        this.f42395a = request;
        this.f42396b = protocol;
        this.f42397c = message;
        this.f42398d = i5;
        this.f42399e = handshake;
        this.f42400f = headers;
        this.f42401g = responseBody;
        this.f42402h = response;
        this.f42403i = response2;
        this.f42404j = response3;
        this.k = j8;
        this.f42405l = j10;
        this.f42406m = exchange;
    }

    public static String b(String str, Response response) {
        response.getClass();
        String strA = response.f42400f.a(str);
        if (strA == null) {
            return null;
        }
        return strA;
    }

    public final CacheControl a() {
        CacheControl cacheControl = this.f42407n;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl.Companion companion = CacheControl.f42175n;
        Headers headers = this.f42400f;
        companion.getClass();
        CacheControl cacheControlA = CacheControl.Companion.a(headers);
        this.f42407n = cacheControlA;
        return cacheControlA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ResponseBody responseBody = this.f42401g;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        responseBody.close();
    }

    public final boolean d() {
        int i5 = this.f42398d;
        return 200 <= i5 && i5 < 300;
    }

    public final Builder h() {
        Builder builder = new Builder();
        builder.f42408a = this.f42395a;
        builder.f42409b = this.f42396b;
        builder.f42410c = this.f42398d;
        builder.f42411d = this.f42397c;
        builder.f42412e = this.f42399e;
        builder.f42413f = this.f42400f.d();
        builder.f42414g = this.f42401g;
        builder.f42415h = this.f42402h;
        builder.f42416i = this.f42403i;
        builder.f42417j = this.f42404j;
        builder.k = this.k;
        builder.f42418l = this.f42405l;
        builder.f42419m = this.f42406m;
        return builder;
    }

    public final String toString() {
        return "Response{protocol=" + this.f42396b + ", code=" + this.f42398d + ", message=" + this.f42397c + ", url=" + this.f42395a.f42376a + '}';
    }
}
