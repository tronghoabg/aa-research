package okhttp3;

import A7.AbstractC0279p0;
import Bf.r;
import ef.C2527k;
import ff.AbstractC2640A;
import ff.w;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
import r7.AbstractC3935e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Request;", "", "Builder", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Request {

    /* renamed from: a, reason: collision with root package name */
    public final HttpUrl f42376a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42377b;

    /* renamed from: c, reason: collision with root package name */
    public final Headers f42378c;

    /* renamed from: d, reason: collision with root package name */
    public final RequestBody f42379d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f42380e;

    /* renamed from: f, reason: collision with root package name */
    public CacheControl f42381f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Request$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public HttpUrl f42382a;

        /* renamed from: d, reason: collision with root package name */
        public RequestBody f42385d;

        /* renamed from: e, reason: collision with root package name */
        public LinkedHashMap f42386e = new LinkedHashMap();

        /* renamed from: b, reason: collision with root package name */
        public String f42383b = "GET";

        /* renamed from: c, reason: collision with root package name */
        public Headers.Builder f42384c = new Headers.Builder();

        public final void a(String str, String value) {
            AbstractC3340k.e(value, "value");
            this.f42384c.a(str, value);
        }

        public final Request b() {
            Map mapUnmodifiableMap;
            HttpUrl httpUrl = this.f42382a;
            if (httpUrl == null) {
                throw new IllegalStateException("url == null");
            }
            String str = this.f42383b;
            Headers headersD = this.f42384c.d();
            RequestBody requestBody = this.f42385d;
            LinkedHashMap linkedHashMap = this.f42386e;
            byte[] bArr = Util.f42438a;
            AbstractC3340k.e(linkedHashMap, "<this>");
            if (linkedHashMap.isEmpty()) {
                mapUnmodifiableMap = w.f35433a;
            } else {
                mapUnmodifiableMap = DesugarCollections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                AbstractC3340k.d(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
            }
            return new Request(httpUrl, str, headersD, requestBody, mapUnmodifiableMap);
        }

        public final void c(CacheControl cacheControl) {
            AbstractC3340k.e(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            if (string.length() == 0) {
                this.f42384c.f("Cache-Control");
            } else {
                d("Cache-Control", string);
            }
        }

        public final void d(String str, String value) {
            AbstractC3340k.e(value, "value");
            Headers.Builder builder = this.f42384c;
            builder.getClass();
            Headers.f42269b.getClass();
            Headers.Companion.a(str);
            Headers.Companion.b(value, str);
            builder.f(str);
            builder.c(str, value);
        }

        public final void e(Headers headers) {
            AbstractC3340k.e(headers, "headers");
            this.f42384c = headers.d();
        }

        public final void f(String method, RequestBody requestBody) {
            AbstractC3340k.e(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (requestBody == null) {
                HttpMethod httpMethod = HttpMethod.f42642a;
                if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                    throw new IllegalArgumentException(AbstractC0279p0.l("method ", method, " must have a request body.").toString());
                }
            } else if (!HttpMethod.b(method)) {
                throw new IllegalArgumentException(AbstractC0279p0.l("method ", method, " must not have a request body.").toString());
            }
            this.f42383b = method;
            this.f42385d = requestBody;
        }

        public final void g(Class type, Object obj) {
            AbstractC3340k.e(type, "type");
            if (obj == null) {
                this.f42386e.remove(type);
                return;
            }
            if (this.f42386e.isEmpty()) {
                this.f42386e = new LinkedHashMap();
            }
            LinkedHashMap linkedHashMap = this.f42386e;
            Object objCast = type.cast(obj);
            AbstractC3340k.b(objCast);
            linkedHashMap.put(type, objCast);
        }

        public final void h(String url) {
            AbstractC3340k.e(url, "url");
            if (r.k0(url, "ws:", true)) {
                String strSubstring = url.substring(3);
                AbstractC3340k.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                url = AbstractC3340k.k(strSubstring, "http:");
            } else if (r.k0(url, "wss:", true)) {
                String strSubstring2 = url.substring(4);
                AbstractC3340k.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                url = AbstractC3340k.k(strSubstring2, "https:");
            }
            HttpUrl.k.getClass();
            this.f42382a = HttpUrl.Companion.c(url);
        }
    }

    public Request(HttpUrl url, String method, Headers headers, RequestBody requestBody, Map map) {
        AbstractC3340k.e(url, "url");
        AbstractC3340k.e(method, "method");
        this.f42376a = url;
        this.f42377b = method;
        this.f42378c = headers;
        this.f42379d = requestBody;
        this.f42380e = map;
    }

    public final CacheControl a() {
        CacheControl cacheControl = this.f42381f;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl.Companion companion = CacheControl.f42175n;
        Headers headers = this.f42378c;
        companion.getClass();
        CacheControl cacheControlA = CacheControl.Companion.a(headers);
        this.f42381f = cacheControlA;
        return cacheControlA;
    }

    public final Builder b() {
        Builder builder = new Builder();
        builder.f42386e = new LinkedHashMap();
        builder.f42382a = this.f42376a;
        builder.f42383b = this.f42377b;
        builder.f42385d = this.f42379d;
        Map map = this.f42380e;
        builder.f42386e = map.isEmpty() ? new LinkedHashMap() : AbstractC2640A.a0(map);
        builder.f42384c = this.f42378c.d();
        return builder;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.f42377b);
        sb2.append(", url=");
        sb2.append(this.f42376a);
        Headers headers = this.f42378c;
        if (headers.size() != 0) {
            sb2.append(", headers=[");
            int i5 = 0;
            for (C2527k c2527k : headers) {
                int i10 = i5 + 1;
                if (i5 < 0) {
                    AbstractC3935e.P();
                    throw null;
                }
                C2527k c2527k2 = c2527k;
                String str = (String) c2527k2.f34671a;
                String str2 = (String) c2527k2.f34672b;
                if (i5 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                sb2.append(str2);
                i5 = i10;
            }
            sb2.append(']');
        }
        Map map = this.f42380e;
        if (!map.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(map);
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC3340k.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
