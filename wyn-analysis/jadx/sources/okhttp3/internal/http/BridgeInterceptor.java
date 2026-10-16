package okhttp3.internal.http;

import cg.AbstractC1613b;
import cg.r;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http/BridgeInterceptor;", "Lokhttp3/Interceptor;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BridgeInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final CookieJar f42636a;

    public BridgeInterceptor(CookieJar cookieJar) {
        AbstractC3340k.e(cookieJar, "cookieJar");
        this.f42636a = cookieJar;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws NumberFormatException {
        ResponseBody responseBody;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.f42647e;
        Request.Builder builderB = request.b();
        RequestBody requestBody = request.f42379d;
        if (requestBody != null) {
            MediaType f42304e = requestBody.getF42304e();
            if (f42304e != null) {
                builderB.d("Content-Type", f42304e.f42295a);
            }
            long jContentLength = requestBody.contentLength();
            if (jContentLength != -1) {
                builderB.d(org.apache.tika.metadata.HttpHeaders.CONTENT_LENGTH, String.valueOf(jContentLength));
                builderB.f42384c.f("Transfer-Encoding");
            } else {
                builderB.d("Transfer-Encoding", "chunked");
                builderB.f42384c.f(org.apache.tika.metadata.HttpHeaders.CONTENT_LENGTH);
            }
        }
        Headers headers = request.f42378c;
        String strA = headers.a("Host");
        boolean z2 = false;
        HttpUrl httpUrl = request.f42376a;
        if (strA == null) {
            builderB.d("Host", Util.w(httpUrl, false));
        }
        if (headers.a("Connection") == null) {
            builderB.d("Connection", "Keep-Alive");
        }
        if (headers.a("Accept-Encoding") == null && headers.a("Range") == null) {
            builderB.d("Accept-Encoding", "gzip");
            z2 = true;
        }
        CookieJar cookieJar = this.f42636a;
        cookieJar.a(httpUrl);
        if (headers.a("User-Agent") == null) {
            builderB.d("User-Agent", "okhttp/4.10.0");
        }
        Response responseA = realInterceptorChain.a(builderB.b());
        Headers headers2 = responseA.f42400f;
        HttpHeaders.d(cookieJar, httpUrl, headers2);
        Response.Builder builderH = responseA.h();
        builderH.f42408a = request;
        if (z2 && "gzip".equalsIgnoreCase(Response.b(org.apache.tika.metadata.HttpHeaders.CONTENT_ENCODING, responseA)) && HttpHeaders.a(responseA) && (responseBody = responseA.f42401g) != null) {
            r rVar = new r(responseBody.getF42426f());
            Headers.Builder builderD = headers2.d();
            builderD.f(org.apache.tika.metadata.HttpHeaders.CONTENT_ENCODING);
            builderD.f(org.apache.tika.metadata.HttpHeaders.CONTENT_LENGTH);
            builderH.c(builderD.d());
            builderH.f42414g = new RealResponseBody(Response.b("Content-Type", responseA), -1L, AbstractC1613b.d(rVar));
        }
        return builderH.a();
    }
}
