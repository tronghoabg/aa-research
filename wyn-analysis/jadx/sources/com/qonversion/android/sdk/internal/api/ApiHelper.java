package com.qonversion.android.sdk.internal.api;

import Bf.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import tf.a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/qonversion/android/sdk/internal/api/ApiHelper;", "", "apiUrl", "", "(Ljava/lang/String;)V", "v0MethodsRegex", "v1MethodsRegex", "checkRequestVersion", "", "request", "Lokhttp3/Request;", "regexStr", "isDeprecatedEndpoint", "isV0Request", "isV1Request", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ApiHelper {

    @NotNull
    private final String v0MethodsRegex;

    @NotNull
    private final String v1MethodsRegex;

    public ApiHelper(@NotNull String apiUrl) {
        AbstractC3340k.e(apiUrl, "apiUrl");
        this.v0MethodsRegex = apiUrl.concat("(?!v\\d+/).*");
        this.v1MethodsRegex = apiUrl.concat("v1/.*");
    }

    private final boolean checkRequestVersion(Request request, String regexStr) {
        return ((a) new i(regexStr).a(request.f42376a.f42281i).f1311b).invoke() != null;
    }

    public final boolean isDeprecatedEndpoint(@NotNull Request request) {
        AbstractC3340k.e(request, "request");
        return isV0Request(request) || isV1Request(request);
    }

    public final boolean isV0Request(@NotNull Request request) {
        AbstractC3340k.e(request, "request");
        return checkRequestVersion(request, this.v0MethodsRegex);
    }

    public final boolean isV1Request(@NotNull Request request) {
        AbstractC3340k.e(request, "request");
        return checkRequestVersion(request, this.v1MethodsRegex);
    }
}
