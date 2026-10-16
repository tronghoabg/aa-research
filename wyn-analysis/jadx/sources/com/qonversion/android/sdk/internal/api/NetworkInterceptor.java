package com.qonversion.android.sdk.internal.api;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.qonversion.android.sdk.internal.HttpError;
import com.qonversion.android.sdk.internal.InternalConfig;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import r7.AbstractC3935e;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;", "Lokhttp3/Interceptor;", "headersProvider", "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;", "apiHelper", "Lcom/qonversion/android/sdk/internal/api/ApiHelper;", "config", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "(Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/qonversion/android/sdk/internal/api/ApiHelper;Lcom/qonversion/android/sdk/internal/InternalConfig;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NetworkInterceptor implements Interceptor {

    @NotNull
    private static final List<Integer> FATAL_ERRORS = AbstractC3935e.D(Integer.valueOf(TTAdConstant.MATE_IS_NULL_CODE), Integer.valueOf(TTAdConstant.AD_ID_IS_NULL_CODE), Integer.valueOf(TTAdConstant.DEEPLINK_UNAVAILABLE_CODE));

    @NotNull
    private final ApiHelper apiHelper;

    @NotNull
    private final InternalConfig config;

    @NotNull
    private final ApiHeadersProvider headersProvider;

    public NetworkInterceptor(@NotNull ApiHeadersProvider headersProvider, @NotNull ApiHelper apiHelper, @NotNull InternalConfig config) {
        AbstractC3340k.e(headersProvider, "headersProvider");
        AbstractC3340k.e(apiHelper, "apiHelper");
        AbstractC3340k.e(config, "config");
        this.headersProvider = headersProvider;
        this.apiHelper = apiHelper;
        this.config = config;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        AbstractC3340k.e(chain, "chain");
        HttpError fatalError = this.config.getFatalError();
        if (fatalError != null) {
            Response.Builder builder = new Response.Builder();
            builder.f42410c = fatalError.getCode();
            builder.f42414g = ResponseBody.create((MediaType) null, "");
            builder.f42409b = Protocol.HTTP_2;
            String message = fatalError.getMessage();
            AbstractC3340k.e(message, "message");
            builder.f42411d = message;
            Request request = chain.request();
            AbstractC3340k.e(request, "request");
            builder.f42408a = request;
            return builder.a();
        }
        Request request2 = chain.request();
        Request.Builder builderB = request2.b();
        builderB.e(this.headersProvider.getHeaders(request2.f42378c));
        Request requestB = builderB.b();
        Response responseA = chain.a(requestB);
        List<Integer> list = FATAL_ERRORS;
        int i5 = responseA.f42398d;
        if (list.contains(Integer.valueOf(i5)) && this.apiHelper.isDeprecatedEndpoint(requestB)) {
            InternalConfig internalConfig = this.config;
            String str = responseA.f42397c;
            AbstractC3340k.d(str, "message(...)");
            internalConfig.setFatalError(new HttpError(i5, str));
        }
        return responseA;
    }
}
