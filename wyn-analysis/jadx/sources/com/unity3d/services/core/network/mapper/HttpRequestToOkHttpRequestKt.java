package com.unity3d.services.core.network.mapper;

import Bf.k;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.core.network.model.HttpRequest;
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

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0007\u001a\n\u0010\n\u001a\u00020\t*\u00020\u0007¨\u0006\u000b"}, d2 = {"generateOkHttpBody", "Lokhttp3/RequestBody;", "body", "", "generateOkHttpProtobufBody", "generateOkHttpHeaders", "Lokhttp3/Headers;", "Lcom/unity3d/services/core/network/model/HttpRequest;", "toOkHttpProtoRequest", "Lokhttp3/Request;", "toOkHttpRequest", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HttpRequestToOkHttpRequestKt {
    private static final RequestBody generateOkHttpBody(Object obj) {
        if (obj instanceof byte[]) {
            MediaType.f42292d.getClass();
            RequestBody requestBodyCreate = RequestBody.create(MediaType.Companion.b("text/plain;charset=utf-8"), (byte[]) obj);
            AbstractC3340k.d(requestBodyCreate, "create(MediaType.parse(\"…in;charset=utf-8\"), body)");
            return requestBodyCreate;
        }
        if (obj instanceof String) {
            MediaType.f42292d.getClass();
            RequestBody requestBodyCreate2 = RequestBody.create(MediaType.Companion.b("text/plain;charset=utf-8"), (String) obj);
            AbstractC3340k.d(requestBodyCreate2, "create(MediaType.parse(\"…in;charset=utf-8\"), body)");
            return requestBodyCreate2;
        }
        MediaType.f42292d.getClass();
        RequestBody requestBodyCreate3 = RequestBody.create(MediaType.Companion.b("text/plain;charset=utf-8"), "");
        AbstractC3340k.d(requestBodyCreate3, "create(MediaType.parse(\"…lain;charset=utf-8\"), \"\")");
        return requestBodyCreate3;
    }

    private static final Headers generateOkHttpHeaders(HttpRequest httpRequest) {
        Headers.Builder builder = new Headers.Builder();
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            builder.a(entry.getKey(), o.w0(entry.getValue(), ",", null, null, null, 62));
        }
        return builder.d();
    }

    private static final RequestBody generateOkHttpProtobufBody(Object obj) {
        if (obj instanceof byte[]) {
            MediaType.f42292d.getClass();
            RequestBody requestBodyCreate = RequestBody.create(MediaType.Companion.b(CommonGatewayClient.HEADER_PROTOBUF), (byte[]) obj);
            AbstractC3340k.d(requestBodyCreate, "create(MediaType.parse(\"…ation/x-protobuf\"), body)");
            return requestBodyCreate;
        }
        if (obj instanceof String) {
            MediaType.f42292d.getClass();
            RequestBody requestBodyCreate2 = RequestBody.create(MediaType.Companion.b(CommonGatewayClient.HEADER_PROTOBUF), (String) obj);
            AbstractC3340k.d(requestBodyCreate2, "create(MediaType.parse(\"…ation/x-protobuf\"), body)");
            return requestBodyCreate2;
        }
        MediaType.f42292d.getClass();
        RequestBody requestBodyCreate3 = RequestBody.create(MediaType.Companion.b(CommonGatewayClient.HEADER_PROTOBUF), "");
        AbstractC3340k.d(requestBodyCreate3, "create(MediaType.parse(\"…ication/x-protobuf\"), \"\")");
        return requestBodyCreate3;
    }

    @NotNull
    public static final Request toOkHttpProtoRequest(@NotNull HttpRequest httpRequest) {
        AbstractC3340k.e(httpRequest, "<this>");
        Request.Builder builder = new Request.Builder();
        builder.h(k.F0(k.W0(httpRequest.getBaseURL(), '/') + '/' + k.W0(httpRequest.getPath(), '/'), "/"));
        String string = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        builder.f(string, body != null ? generateOkHttpProtobufBody(body) : null);
        builder.e(generateOkHttpHeaders(httpRequest));
        return builder.b();
    }

    @NotNull
    public static final Request toOkHttpRequest(@NotNull HttpRequest httpRequest) {
        AbstractC3340k.e(httpRequest, "<this>");
        Request.Builder builder = new Request.Builder();
        builder.h(k.F0(k.W0(httpRequest.getBaseURL(), '/') + '/' + k.W0(httpRequest.getPath(), '/'), "/"));
        String string = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        builder.f(string, body != null ? generateOkHttpBody(body) : null);
        builder.e(generateOkHttpHeaders(httpRequest));
        return builder.b();
    }
}
