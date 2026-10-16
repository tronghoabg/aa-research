package com.unity3d.ads.network.mapper;

import Bf.k;
import E5.Q;
import com.unity3d.ads.network.model.HttpBody;
import com.unity3d.ads.network.model.HttpRequest;
import ff.o;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0002\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u0006¨\u0006\t"}, d2 = {"generateOkHttpBody", "Lokhttp3/RequestBody;", "body", "Lcom/unity3d/ads/network/model/HttpBody;", "generateOkHttpHeaders", "Lokhttp3/Headers;", "Lcom/unity3d/ads/network/model/HttpRequest;", "toOkHttpRequest", "Lokhttp3/Request;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HttpRequestToOkHttpRequestKt {
    private static final RequestBody generateOkHttpBody(HttpBody httpBody) {
        if (httpBody instanceof HttpBody.StringBody) {
            MediaType.f42292d.getClass();
            return RequestBody.create(MediaType.Companion.b("text/plain;charset=utf-8"), ((HttpBody.StringBody) httpBody).getContent());
        }
        if (httpBody instanceof HttpBody.ByteArrayBody) {
            MediaType.f42292d.getClass();
            return RequestBody.create(MediaType.Companion.b("text/plain;charset=utf-8"), ((HttpBody.ByteArrayBody) httpBody).getContent());
        }
        if (httpBody instanceof HttpBody.EmptyBody) {
            return null;
        }
        throw new Q((byte) 0, 9);
    }

    private static final Headers generateOkHttpHeaders(HttpRequest httpRequest) {
        Headers.Builder builder = new Headers.Builder();
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            builder.a(entry.getKey(), o.w0(entry.getValue(), ",", null, null, null, 62));
        }
        return builder.d();
    }

    @NotNull
    public static final Request toOkHttpRequest(@NotNull HttpRequest httpRequest) {
        AbstractC3340k.e(httpRequest, "<this>");
        Request.Builder builder = new Request.Builder();
        builder.h(k.F0(k.W0(httpRequest.getBaseURL(), '/') + '/' + k.W0(httpRequest.getPath(), '/'), "/"));
        builder.f(httpRequest.getMethod().toString(), generateOkHttpBody(httpRequest.getBody()));
        builder.e(generateOkHttpHeaders(httpRequest));
        return builder.b();
    }
}
