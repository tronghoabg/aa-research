package com.unity3d.services.core.network.model;

import N0.a;
import Va.M6;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.unity3d.ads.core.data.model.OperationType;
import ff.w;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\b\u0086\b\u0018\u0000 O2\u00020\u0001:\u0001OBÓ\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0\t\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0010¢\u0006\u0002\u0010\u001cJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0010HÆ\u0003J\t\u0010:\u001a\u00020\u0010HÆ\u0003J\t\u0010;\u001a\u00020\u0010HÆ\u0003J\t\u0010<\u001a\u00020\u0010HÆ\u0003J\t\u0010=\u001a\u00020\u0016HÆ\u0003J\t\u0010>\u001a\u00020\u0018HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\t\u0010@\u001a\u00020\u0010HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0006HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001b\u0010D\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0\tHÆ\u0003J\u0015\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\t\u0010F\u001a\u00020\rHÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00102JÜ\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0\t2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u0010HÆ\u0001¢\u0006\u0002\u0010JJ\u0013\u0010K\u001a\u00020\u00162\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010M\u001a\u00020\u0010HÖ\u0001J\t\u0010N\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0014\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R#\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010*R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0011\u0010\u001b\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b7\u0010$¨\u0006P"}, d2 = {"Lcom/unity3d/services/core/network/model/HttpRequest;", "", "baseURL", "", "path", "method", "Lcom/unity3d/services/core/network/model/RequestType;", "body", "headers", "", "", "parameters", "bodyType", "Lcom/unity3d/services/core/network/model/BodyType;", "scheme", "port", "", "connectTimeout", "readTimeout", "writeTimeout", "callTimeout", "isProtobuf", "", "operationType", "Lcom/unity3d/ads/core/data/model/OperationType;", "downloadDestination", "Ljava/io/File;", "priority", "(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/services/core/network/model/RequestType;Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;Lcom/unity3d/services/core/network/model/BodyType;Ljava/lang/String;Ljava/lang/Integer;IIIIZLcom/unity3d/ads/core/data/model/OperationType;Ljava/io/File;I)V", "getBaseURL", "()Ljava/lang/String;", "getBody", "()Ljava/lang/Object;", "getBodyType", "()Lcom/unity3d/services/core/network/model/BodyType;", "getCallTimeout", "()I", "getConnectTimeout", "getDownloadDestination", "()Ljava/io/File;", "getHeaders", "()Ljava/util/Map;", "()Z", "getMethod", "()Lcom/unity3d/services/core/network/model/RequestType;", "getOperationType", "()Lcom/unity3d/ads/core/data/model/OperationType;", "getParameters", "getPath", "getPort", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPriority", "getReadTimeout", "getScheme", "getWriteTimeout", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/services/core/network/model/RequestType;Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;Lcom/unity3d/services/core/network/model/BodyType;Ljava/lang/String;Ljava/lang/Integer;IIIIZLcom/unity3d/ads/core/data/model/OperationType;Ljava/io/File;I)Lcom/unity3d/services/core/network/model/HttpRequest;", "equals", "other", "hashCode", "toString", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class HttpRequest {

    @NotNull
    public static final String DEFAULT_SCHEME = "https";
    public static final int DEFAULT_TIMEOUT = 30000;

    @NotNull
    private final String baseURL;

    @Nullable
    private final Object body;

    @NotNull
    private final BodyType bodyType;
    private final int callTimeout;
    private final int connectTimeout;

    @Nullable
    private final File downloadDestination;

    @NotNull
    private final Map<String, List<String>> headers;
    private final boolean isProtobuf;

    @NotNull
    private final RequestType method;

    @NotNull
    private final OperationType operationType;

    @NotNull
    private final Map<String, String> parameters;

    @NotNull
    private final String path;

    @Nullable
    private final Integer port;
    private final int priority;
    private final int readTimeout;

    @NotNull
    private final String scheme;
    private final int writeTimeout;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL) {
        this(baseURL, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131070, null);
        AbstractC3340k.e(baseURL, "baseURL");
    }

    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType, String str3, Integer num, int i5, int i10, int i11, int i12, boolean z2, OperationType operationType, File file, int i13, int i14, Object obj2) {
        int i15;
        File file2;
        String str4;
        HttpRequest httpRequest2;
        OperationType operationType2;
        String str5;
        RequestType requestType2;
        Object obj3;
        Map map3;
        Map map4;
        BodyType bodyType2;
        String str6;
        Integer num2;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z10;
        String str7 = (i14 & 1) != 0 ? httpRequest.baseURL : str;
        String str8 = (i14 & 2) != 0 ? httpRequest.path : str2;
        RequestType requestType3 = (i14 & 4) != 0 ? httpRequest.method : requestType;
        Object obj4 = (i14 & 8) != 0 ? httpRequest.body : obj;
        Map map5 = (i14 & 16) != 0 ? httpRequest.headers : map;
        Map map6 = (i14 & 32) != 0 ? httpRequest.parameters : map2;
        BodyType bodyType3 = (i14 & 64) != 0 ? httpRequest.bodyType : bodyType;
        String str9 = (i14 & 128) != 0 ? httpRequest.scheme : str3;
        Integer num3 = (i14 & 256) != 0 ? httpRequest.port : num;
        int i20 = (i14 & 512) != 0 ? httpRequest.connectTimeout : i5;
        int i21 = (i14 & Segment.SHARE_MINIMUM) != 0 ? httpRequest.readTimeout : i10;
        int i22 = (i14 & 2048) != 0 ? httpRequest.writeTimeout : i11;
        int i23 = (i14 & 4096) != 0 ? httpRequest.callTimeout : i12;
        boolean z11 = (i14 & Segment.SIZE) != 0 ? httpRequest.isProtobuf : z2;
        String str10 = str7;
        OperationType operationType3 = (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? httpRequest.operationType : operationType;
        File file3 = (i14 & 32768) != 0 ? httpRequest.downloadDestination : file;
        if ((i14 & 65536) != 0) {
            file2 = file3;
            i15 = httpRequest.priority;
            operationType2 = operationType3;
            str5 = str8;
            requestType2 = requestType3;
            obj3 = obj4;
            map3 = map5;
            map4 = map6;
            bodyType2 = bodyType3;
            str6 = str9;
            num2 = num3;
            i16 = i20;
            i17 = i21;
            i18 = i22;
            i19 = i23;
            z10 = z11;
            str4 = str10;
            httpRequest2 = httpRequest;
        } else {
            i15 = i13;
            file2 = file3;
            str4 = str10;
            httpRequest2 = httpRequest;
            operationType2 = operationType3;
            str5 = str8;
            requestType2 = requestType3;
            obj3 = obj4;
            map3 = map5;
            map4 = map6;
            bodyType2 = bodyType3;
            str6 = str9;
            num2 = num3;
            i16 = i20;
            i17 = i21;
            i18 = i22;
            i19 = i23;
            z10 = z11;
        }
        return httpRequest2.copy(str4, str5, requestType2, obj3, map3, map4, bodyType2, str6, num2, i16, i17, i18, i19, z10, operationType2, file2, i15);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBaseURL() {
        return this.baseURL;
    }

    /* renamed from: component10, reason: from getter */
    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    /* renamed from: component11, reason: from getter */
    public final int getReadTimeout() {
        return this.readTimeout;
    }

    /* renamed from: component12, reason: from getter */
    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    /* renamed from: component13, reason: from getter */
    public final int getCallTimeout() {
        return this.callTimeout;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsProtobuf() {
        return this.isProtobuf;
    }

    @NotNull
    /* renamed from: component15, reason: from getter */
    public final OperationType getOperationType() {
        return this.operationType;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final File getDownloadDestination() {
        return this.downloadDestination;
    }

    /* renamed from: component17, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final RequestType getMethod() {
        return this.method;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Object getBody() {
        return this.body;
    }

    @NotNull
    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    @NotNull
    public final Map<String, String> component6() {
        return this.parameters;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final BodyType getBodyType() {
        return this.bodyType;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getPort() {
        return this.port;
    }

    @NotNull
    public final HttpRequest copy(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object body, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull BodyType bodyType, @NotNull String scheme, @Nullable Integer port, int connectTimeout, int readTimeout, int writeTimeout, int callTimeout, boolean isProtobuf, @NotNull OperationType operationType, @Nullable File downloadDestination, int priority) {
        AbstractC3340k.e(baseURL, "baseURL");
        AbstractC3340k.e(path, "path");
        AbstractC3340k.e(method, "method");
        AbstractC3340k.e(headers, "headers");
        AbstractC3340k.e(parameters, "parameters");
        AbstractC3340k.e(bodyType, "bodyType");
        AbstractC3340k.e(scheme, "scheme");
        AbstractC3340k.e(operationType, "operationType");
        return new HttpRequest(baseURL, path, method, body, headers, parameters, bodyType, scheme, port, connectTimeout, readTimeout, writeTimeout, callTimeout, isProtobuf, operationType, downloadDestination, priority);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) other;
        return AbstractC3340k.a(this.baseURL, httpRequest.baseURL) && AbstractC3340k.a(this.path, httpRequest.path) && this.method == httpRequest.method && AbstractC3340k.a(this.body, httpRequest.body) && AbstractC3340k.a(this.headers, httpRequest.headers) && AbstractC3340k.a(this.parameters, httpRequest.parameters) && this.bodyType == httpRequest.bodyType && AbstractC3340k.a(this.scheme, httpRequest.scheme) && AbstractC3340k.a(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout && this.isProtobuf == httpRequest.isProtobuf && this.operationType == httpRequest.operationType && AbstractC3340k.a(this.downloadDestination, httpRequest.downloadDestination) && this.priority == httpRequest.priority;
    }

    @NotNull
    public final String getBaseURL() {
        return this.baseURL;
    }

    @Nullable
    public final Object getBody() {
        return this.body;
    }

    @NotNull
    public final BodyType getBodyType() {
        return this.bodyType;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    @Nullable
    public final File getDownloadDestination() {
        return this.downloadDestination;
    }

    @NotNull
    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final RequestType getMethod() {
        return this.method;
    }

    @NotNull
    public final OperationType getOperationType() {
        return this.operationType;
    }

    @NotNull
    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @Nullable
    public final Integer getPort() {
        return this.port;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    @NotNull
    public final String getScheme() {
        return this.scheme;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = (this.method.hashCode() + a.c(this.baseURL.hashCode() * 31, 31, this.path)) * 31;
        Object obj = this.body;
        int iC = a.c((this.bodyType.hashCode() + ((this.parameters.hashCode() + ((this.headers.hashCode() + ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.scheme);
        Integer num = this.port;
        int iHashCode2 = (((((((((iC + (num == null ? 0 : num.hashCode())) * 31) + this.connectTimeout) * 31) + this.readTimeout) * 31) + this.writeTimeout) * 31) + this.callTimeout) * 31;
        boolean z2 = this.isProtobuf;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int iHashCode3 = (this.operationType.hashCode() + ((iHashCode2 + i5) * 31)) * 31;
        File file = this.downloadDestination;
        return ((iHashCode3 + (file != null ? file.hashCode() : 0)) * 31) + this.priority;
    }

    public final boolean isProtobuf() {
        return this.isProtobuf;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("HttpRequest(baseURL=");
        sb2.append(this.baseURL);
        sb2.append(", path=");
        sb2.append(this.path);
        sb2.append(", method=");
        sb2.append(this.method);
        sb2.append(", body=");
        sb2.append(this.body);
        sb2.append(", headers=");
        sb2.append(this.headers);
        sb2.append(", parameters=");
        sb2.append(this.parameters);
        sb2.append(", bodyType=");
        sb2.append(this.bodyType);
        sb2.append(", scheme=");
        sb2.append(this.scheme);
        sb2.append(", port=");
        sb2.append(this.port);
        sb2.append(", connectTimeout=");
        sb2.append(this.connectTimeout);
        sb2.append(", readTimeout=");
        sb2.append(this.readTimeout);
        sb2.append(", writeTimeout=");
        sb2.append(this.writeTimeout);
        sb2.append(", callTimeout=");
        sb2.append(this.callTimeout);
        sb2.append(", isProtobuf=");
        sb2.append(this.isProtobuf);
        sb2.append(", operationType=");
        sb2.append(this.operationType);
        sb2.append(", downloadDestination=");
        sb2.append(this.downloadDestination);
        sb2.append(", priority=");
        return M6.r(sb2, this.priority, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path) {
        this(baseURL, path, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131068, null);
        AbstractC3340k.e(baseURL, "baseURL");
        AbstractC3340k.e(path, "path");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method) {
        this(baseURL, path, method, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131064, null);
        AbstractC3340k.e(baseURL, "baseURL");
        AbstractC3340k.e(path, "path");
        AbstractC3340k.e(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj) {
        this(baseURL, path, method, obj, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131056, null);
        AbstractC3340k.e(baseURL, "baseURL");
        AbstractC3340k.e(path, "path");
        AbstractC3340k.e(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers) {
        this(baseURL, path, method, obj, headers, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131040, null);
        AbstractC3340k.e(baseURL, "baseURL");
        AbstractC3340k.e(path, "path");
        AbstractC3340k.e(method, "method");
        AbstractC3340k.e(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters) {
        this(baseURL, path, method, obj, headers, parameters, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131008, null);
        AbstractC3340k.e(baseURL, "baseURL");
        AbstractC3340k.e(path, "path");
        AbstractC3340k.e(method, "method");
        AbstractC3340k.e(headers, "headers");
        AbstractC3340k.e(parameters, "parameters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull BodyType bodyType) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, null, null, 0, 0, 0, 0, false, null, null, 0, 130944, null);
        AbstractC3340k.e(baseURL, "baseURL");
        AbstractC3340k.e(path, "path");
        AbstractC3340k.e(method, "method");
        AbstractC3340k.e(headers, "headers");
        AbstractC3340k.e(parameters, "parameters");
        AbstractC3340k.e(bodyType, "bodyType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull BodyType bodyType, @NotNull String scheme) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, null, 0, 0, 0, 0, false, null, null, 0, 130816, null);
        AbstractC3340k.e(baseURL, "baseURL");
        AbstractC3340k.e(path, "path");
        AbstractC3340k.e(method, "method");
        AbstractC3340k.e(headers, "headers");
        AbstractC3340k.e(parameters, "parameters");
        AbstractC3340k.e(bodyType, "bodyType");
        AbstractC3340k.e(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull BodyType bodyType, @NotNull String scheme, @Nullable Integer num) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, 0, 0, 0, 0, false, null, null, 0, 130560, null);
        AbstractC3340k.e(baseURL, "baseURL");
        AbstractC3340k.e(path, "path");
        AbstractC3340k.e(method, "method");
        AbstractC3340k.e(headers, "headers");
        AbstractC3340k.e(parameters, "parameters");
        AbstractC3340k.e(bodyType, "bodyType");
        AbstractC3340k.e(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull BodyType bodyType, @NotNull String scheme, @Nullable Integer num, int i5) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i5, 0, 0, 0, false, null, null, 0, 130048, null);
        AbstractC3340k.e(baseURL, "baseURL");
        AbstractC3340k.e(path, "path");
        AbstractC3340k.e(method, "method");
        AbstractC3340k.e(headers, "headers");
        AbstractC3340k.e(parameters, "parameters");
        AbstractC3340k.e(bodyType, "bodyType");
        AbstractC3340k.e(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull BodyType bodyType, @NotNull String scheme, @Nullable Integer num, int i5, int i10) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i5, i10, 0, 0, false, null, null, 0, 129024, null);
        AbstractC3340k.e(baseURL, "baseURL");
        AbstractC3340k.e(path, "path");
        AbstractC3340k.e(method, "method");
        AbstractC3340k.e(headers, "headers");
        AbstractC3340k.e(parameters, "parameters");
        AbstractC3340k.e(bodyType, "bodyType");
        AbstractC3340k.e(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull BodyType bodyType, @NotNull String scheme, @Nullable Integer num, int i5, int i10, int i11) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i5, i10, i11, 0, false, null, null, 0, 126976, null);
        AbstractC3340k.e(baseURL, "baseURL");
        AbstractC3340k.e(path, "path");
        AbstractC3340k.e(method, "method");
        AbstractC3340k.e(headers, "headers");
        AbstractC3340k.e(parameters, "parameters");
        AbstractC3340k.e(bodyType, "bodyType");
        AbstractC3340k.e(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull BodyType bodyType, @NotNull String scheme, @Nullable Integer num, int i5, int i10, int i11, int i12) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i5, i10, i11, i12, false, null, null, 0, 122880, null);
        AbstractC3340k.e(baseURL, "baseURL");
        AbstractC3340k.e(path, "path");
        AbstractC3340k.e(method, "method");
        AbstractC3340k.e(headers, "headers");
        AbstractC3340k.e(parameters, "parameters");
        AbstractC3340k.e(bodyType, "bodyType");
        AbstractC3340k.e(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull BodyType bodyType, @NotNull String scheme, @Nullable Integer num, int i5, int i10, int i11, int i12, boolean z2) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i5, i10, i11, i12, z2, null, null, 0, 114688, null);
        AbstractC3340k.e(baseURL, "baseURL");
        AbstractC3340k.e(path, "path");
        AbstractC3340k.e(method, "method");
        AbstractC3340k.e(headers, "headers");
        AbstractC3340k.e(parameters, "parameters");
        AbstractC3340k.e(bodyType, "bodyType");
        AbstractC3340k.e(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull BodyType bodyType, @NotNull String scheme, @Nullable Integer num, int i5, int i10, int i11, int i12, boolean z2, @NotNull OperationType operationType) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i5, i10, i11, i12, z2, operationType, null, 0, 98304, null);
        AbstractC3340k.e(baseURL, "baseURL");
        AbstractC3340k.e(path, "path");
        AbstractC3340k.e(method, "method");
        AbstractC3340k.e(headers, "headers");
        AbstractC3340k.e(parameters, "parameters");
        AbstractC3340k.e(bodyType, "bodyType");
        AbstractC3340k.e(scheme, "scheme");
        AbstractC3340k.e(operationType, "operationType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull BodyType bodyType, @NotNull String scheme, @Nullable Integer num, int i5, int i10, int i11, int i12, boolean z2, @NotNull OperationType operationType, @Nullable File file) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i5, i10, i11, i12, z2, operationType, file, 0, 65536, null);
        AbstractC3340k.e(baseURL, "baseURL");
        AbstractC3340k.e(path, "path");
        AbstractC3340k.e(method, "method");
        AbstractC3340k.e(headers, "headers");
        AbstractC3340k.e(parameters, "parameters");
        AbstractC3340k.e(bodyType, "bodyType");
        AbstractC3340k.e(scheme, "scheme");
        AbstractC3340k.e(operationType, "operationType");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull BodyType bodyType, @NotNull String scheme, @Nullable Integer num, int i5, int i10, int i11, int i12, boolean z2, @NotNull OperationType operationType, @Nullable File file, int i13) {
        AbstractC3340k.e(baseURL, "baseURL");
        AbstractC3340k.e(path, "path");
        AbstractC3340k.e(method, "method");
        AbstractC3340k.e(headers, "headers");
        AbstractC3340k.e(parameters, "parameters");
        AbstractC3340k.e(bodyType, "bodyType");
        AbstractC3340k.e(scheme, "scheme");
        AbstractC3340k.e(operationType, "operationType");
        this.baseURL = baseURL;
        this.path = path;
        this.method = method;
        this.body = obj;
        this.headers = headers;
        this.parameters = parameters;
        this.bodyType = bodyType;
        this.scheme = scheme;
        this.port = num;
        this.connectTimeout = i5;
        this.readTimeout = i10;
        this.writeTimeout = i11;
        this.callTimeout = i12;
        this.isProtobuf = z2;
        this.operationType = operationType;
        this.downloadDestination = file;
        this.priority = i13;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HttpRequest(String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType, String str3, Integer num, int i5, int i10, int i11, int i12, boolean z2, OperationType operationType, File file, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        String str4 = (i14 & 2) != 0 ? "" : str2;
        RequestType requestType2 = (i14 & 4) != 0 ? RequestType.GET : requestType;
        Object obj2 = (i14 & 8) != 0 ? null : obj;
        int i15 = i14 & 16;
        Map map3 = w.f35433a;
        this(str, str4, requestType2, obj2, i15 != 0 ? map3 : map, (i14 & 32) == 0 ? map2 : map3, (i14 & 64) != 0 ? BodyType.UNKNOWN : bodyType, (i14 & 128) != 0 ? DEFAULT_SCHEME : str3, (i14 & 256) != 0 ? null : num, (i14 & 512) != 0 ? 30000 : i5, (i14 & Segment.SHARE_MINIMUM) != 0 ? 30000 : i10, (i14 & 2048) != 0 ? 30000 : i11, (i14 & 4096) == 0 ? i12 : 30000, (i14 & Segment.SIZE) != 0 ? false : z2, (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? OperationType.UNKNOWN : operationType, (i14 & 32768) != 0 ? null : file, (i14 & 65536) != 0 ? 0 : i13);
    }
}
