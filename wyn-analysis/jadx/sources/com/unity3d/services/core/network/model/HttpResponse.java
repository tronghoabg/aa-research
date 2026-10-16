package com.unity3d.services.core.network.model;

import A.AbstractC0213f;
import N0.a;
import ff.w;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B]\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0001HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\u001b\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003Ja\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u00062\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0004HÖ\u0001J\t\u0010'\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006("}, d2 = {"Lcom/unity3d/services/core/network/model/HttpResponse;", "", "body", "statusCode", "", "headers", "", "", "", "urlString", "protocol", "client", "contentSize", "", "(Ljava/lang/Object;ILjava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getBody", "()Ljava/lang/Object;", "getClient", "()Ljava/lang/String;", "getContentSize", "()J", "getHeaders", "()Ljava/util/Map;", "getProtocol", "getStatusCode", "()I", "getUrlString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class HttpResponse {

    @NotNull
    private final Object body;

    @NotNull
    private final String client;
    private final long contentSize;

    @NotNull
    private final Map<String, List<String>> headers;

    @NotNull
    private final String protocol;
    private final int statusCode;

    @NotNull
    private final String urlString;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object body) {
        this(body, 0, null, null, null, null, 0L, 126, null);
        AbstractC3340k.e(body, "body");
    }

    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, Object obj, int i5, Map map, String str, String str2, String str3, long j8, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = httpResponse.body;
        }
        if ((i10 & 2) != 0) {
            i5 = httpResponse.statusCode;
        }
        if ((i10 & 4) != 0) {
            map = httpResponse.headers;
        }
        if ((i10 & 8) != 0) {
            str = httpResponse.urlString;
        }
        if ((i10 & 16) != 0) {
            str2 = httpResponse.protocol;
        }
        if ((i10 & 32) != 0) {
            str3 = httpResponse.client;
        }
        if ((i10 & 64) != 0) {
            j8 = httpResponse.contentSize;
        }
        long j10 = j8;
        String str4 = str2;
        String str5 = str3;
        return httpResponse.copy(obj, i5, map, str, str4, str5, j10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Object getBody() {
        return this.body;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    @NotNull
    public final Map<String, List<String>> component3() {
        return this.headers;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getUrlString() {
        return this.urlString;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getProtocol() {
        return this.protocol;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getClient() {
        return this.client;
    }

    /* renamed from: component7, reason: from getter */
    public final long getContentSize() {
        return this.contentSize;
    }

    @NotNull
    public final HttpResponse copy(@NotNull Object body, int statusCode, @NotNull Map<String, ? extends List<String>> headers, @NotNull String urlString, @NotNull String protocol, @NotNull String client, long contentSize) {
        AbstractC3340k.e(body, "body");
        AbstractC3340k.e(headers, "headers");
        AbstractC3340k.e(urlString, "urlString");
        AbstractC3340k.e(protocol, "protocol");
        AbstractC3340k.e(client, "client");
        return new HttpResponse(body, statusCode, headers, urlString, protocol, client, contentSize);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) other;
        return AbstractC3340k.a(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && AbstractC3340k.a(this.headers, httpResponse.headers) && AbstractC3340k.a(this.urlString, httpResponse.urlString) && AbstractC3340k.a(this.protocol, httpResponse.protocol) && AbstractC3340k.a(this.client, httpResponse.client) && this.contentSize == httpResponse.contentSize;
    }

    @NotNull
    public final Object getBody() {
        return this.body;
    }

    @NotNull
    public final String getClient() {
        return this.client;
    }

    public final long getContentSize() {
        return this.contentSize;
    }

    @NotNull
    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final String getProtocol() {
        return this.protocol;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    @NotNull
    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        int iC = a.c(a.c(a.c((this.headers.hashCode() + (((this.body.hashCode() * 31) + this.statusCode) * 31)) * 31, 31, this.urlString), 31, this.protocol), 31, this.client);
        long j8 = this.contentSize;
        return iC + ((int) (j8 ^ (j8 >>> 32)));
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("HttpResponse(body=");
        sb2.append(this.body);
        sb2.append(", statusCode=");
        sb2.append(this.statusCode);
        sb2.append(", headers=");
        sb2.append(this.headers);
        sb2.append(", urlString=");
        sb2.append(this.urlString);
        sb2.append(", protocol=");
        sb2.append(this.protocol);
        sb2.append(", client=");
        sb2.append(this.client);
        sb2.append(", contentSize=");
        return AbstractC0213f.e(sb2, this.contentSize, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object body, int i5) {
        this(body, i5, null, null, null, null, 0L, 124, null);
        AbstractC3340k.e(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object body, int i5, @NotNull Map<String, ? extends List<String>> headers) {
        this(body, i5, headers, null, null, null, 0L, 120, null);
        AbstractC3340k.e(body, "body");
        AbstractC3340k.e(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object body, int i5, @NotNull Map<String, ? extends List<String>> headers, @NotNull String urlString) {
        this(body, i5, headers, urlString, null, null, 0L, 112, null);
        AbstractC3340k.e(body, "body");
        AbstractC3340k.e(headers, "headers");
        AbstractC3340k.e(urlString, "urlString");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object body, int i5, @NotNull Map<String, ? extends List<String>> headers, @NotNull String urlString, @NotNull String protocol) {
        this(body, i5, headers, urlString, protocol, null, 0L, 96, null);
        AbstractC3340k.e(body, "body");
        AbstractC3340k.e(headers, "headers");
        AbstractC3340k.e(urlString, "urlString");
        AbstractC3340k.e(protocol, "protocol");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object body, int i5, @NotNull Map<String, ? extends List<String>> headers, @NotNull String urlString, @NotNull String protocol, @NotNull String client) {
        this(body, i5, headers, urlString, protocol, client, 0L, 64, null);
        AbstractC3340k.e(body, "body");
        AbstractC3340k.e(headers, "headers");
        AbstractC3340k.e(urlString, "urlString");
        AbstractC3340k.e(protocol, "protocol");
        AbstractC3340k.e(client, "client");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpResponse(@NotNull Object body, int i5, @NotNull Map<String, ? extends List<String>> headers, @NotNull String urlString, @NotNull String protocol, @NotNull String client, long j8) {
        AbstractC3340k.e(body, "body");
        AbstractC3340k.e(headers, "headers");
        AbstractC3340k.e(urlString, "urlString");
        AbstractC3340k.e(protocol, "protocol");
        AbstractC3340k.e(client, "client");
        this.body = body;
        this.statusCode = i5;
        this.headers = headers;
        this.urlString = urlString;
        this.protocol = protocol;
        this.client = client;
        this.contentSize = j8;
    }

    public /* synthetic */ HttpResponse(Object obj, int i5, Map map, String str, String str2, String str3, long j8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? 200 : i5, (i10 & 4) != 0 ? w.f35433a : map, (i10 & 8) != 0 ? "" : str, (i10 & 16) == 0 ? str2 : "", (i10 & 32) != 0 ? "unknown" : str3, (i10 & 64) != 0 ? -1L : j8);
    }
}
