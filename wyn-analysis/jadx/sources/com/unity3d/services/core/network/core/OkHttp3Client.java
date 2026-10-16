package com.unity3d.services.core.network.core;

import Ef.E;
import Ef.H;
import Fe.e;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.vungle.ads.internal.protos.Sdk;
import ef.C2515C;
import jf.InterfaceC3103c;
import kf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3464c;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/unity3d/services/core/network/core/OkHttp3Client;", "Lcom/unity3d/services/core/network/core/HttpClient;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "Lokhttp3/OkHttpClient;", "client", "<init>", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Lokhttp3/OkHttpClient;)V", "Lcom/unity3d/services/core/network/model/HttpRequest;", "request", "Lcom/unity3d/services/core/network/model/HttpResponse;", "executeBlocking", "(Lcom/unity3d/services/core/network/model/HttpRequest;)Lcom/unity3d/services/core/network/model/HttpResponse;", "", "withInputStream", "execute", "(Lcom/unity3d/services/core/network/model/HttpRequest;ZLjf/c;)Ljava/lang/Object;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "Lokhttp3/OkHttpClient;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OkHttp3Client implements HttpClient {

    @NotNull
    public static final String MSG_CONNECTION_FAILED = "Network request failed";

    @NotNull
    public static final String MSG_CONNECTION_TIMEOUT = "Network request timeout";

    @NotNull
    public static final String NETWORK_CLIENT_OKHTTP = "refactored-okhttp";

    @NotNull
    private final OkHttpClient client;

    @NotNull
    private final ISDKDispatchers dispatchers;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.services.core.network.core.OkHttp3Client", f = "OkHttp3Client.kt", l = {Sdk.SDKError.Reason.STORE_REGION_CODE_ERROR_VALUE}, m = "execute")
    /* renamed from: com.unity3d.services.core.network.core.OkHttp3Client$execute$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3464c {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC3103c<? super AnonymousClass1> interfaceC3103c) {
            super(interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OkHttp3Client.this.execute(null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lcom/unity3d/services/core/network/model/HttpResponse;", "<anonymous>", "(LEf/E;)Lcom/unity3d/services/core/network/model/HttpResponse;"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.services.core.network.core.OkHttp3Client$executeBlocking$1", f = "OkHttp3Client.kt", l = {37}, m = "invokeSuspend")
    /* renamed from: com.unity3d.services.core.network.core.OkHttp3Client$executeBlocking$1, reason: invalid class name and case insensitive filesystem */
    public static final class C23741 extends AbstractC3471j implements p {
        final /* synthetic */ HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23741(HttpRequest httpRequest, InterfaceC3103c<? super C23741> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$request = httpRequest;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return OkHttp3Client.this.new C23741(this.$request, interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super HttpResponse> interfaceC3103c) {
            return ((C23741) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.f39711a;
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.U(obj);
                return obj;
            }
            e.U(obj);
            OkHttp3Client okHttp3Client = OkHttp3Client.this;
            HttpRequest httpRequest = this.$request;
            this.label = 1;
            Object objExecute$default = HttpClient.DefaultImpls.execute$default(okHttp3Client, httpRequest, false, this, 2, null);
            return objExecute$default == aVar ? aVar : objExecute$default;
        }
    }

    public OkHttp3Client(@NotNull ISDKDispatchers dispatchers, @NotNull OkHttpClient client) {
        AbstractC3340k.e(dispatchers, "dispatchers");
        AbstractC3340k.e(client, "client");
        this.dispatchers = dispatchers;
        this.client = client;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.services.core.network.core.HttpClient
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(@org.jetbrains.annotations.NotNull com.unity3d.services.core.network.model.HttpRequest r11, final boolean r12, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super com.unity3d.services.core.network.model.HttpResponse> r13) throws com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.unity3d.services.core.network.core.OkHttp3Client.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r13
            com.unity3d.services.core.network.core.OkHttp3Client$execute$1 r0 = (com.unity3d.services.core.network.core.OkHttp3Client.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.network.core.OkHttp3Client$execute$1 r0 = new com.unity3d.services.core.network.core.OkHttp3Client$execute$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            kf.a r1 = kf.a.f39711a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r11 = r0.L$2
            okhttp3.OkHttpClient r11 = (okhttp3.OkHttpClient) r11
            java.lang.Object r11 = r0.L$1
            okhttp3.Request r11 = (okhttp3.Request) r11
            java.lang.Object r11 = r0.L$0
            com.unity3d.services.core.network.model.HttpRequest r11 = (com.unity3d.services.core.network.model.HttpRequest) r11
            Fe.e.U(r13)     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            return r13
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            Fe.e.U(r13)
            okhttp3.Request r13 = com.unity3d.services.core.network.mapper.HttpRequestToOkHttpRequestKt.toOkHttpProtoRequest(r11)     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            okhttp3.OkHttpClient r2 = r10.client     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            okhttp3.OkHttpClient$Builder r2 = r2.b()     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            int r4 = r11.getConnectTimeout()     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            long r4 = (long) r4     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            r2.a(r4, r6)     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            int r4 = r11.getReadTimeout()     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            long r4 = (long) r4     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            r2.b(r4, r6)     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            int r4 = r11.getWriteTimeout()     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            long r4 = (long) r4     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            int r4 = okhttp3.internal.Util.b(r4, r6)     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            r2.f42365y = r4     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            okhttp3.OkHttpClient r4 = new okhttp3.OkHttpClient     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            r4.<init>(r2)     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            r0.L$0 = r11     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            r0.L$1 = r13     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            r0.L$2 = r4     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            r0.Z$0 = r12     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            r0.label = r3     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            Ef.n r2 = new Ef.n     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            jf.c r0 = A6.h.A(r0)     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            r2.<init>(r3, r0)     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            r2.t()     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            okhttp3.internal.connection.RealCall r13 = r4.a(r13)     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            com.unity3d.services.core.network.core.OkHttp3Client$execute$2$1 r0 = new com.unity3d.services.core.network.core.OkHttp3Client$execute$2$1     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            r0.<init>(r13)     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            r2.v(r0)     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            com.unity3d.services.core.network.core.OkHttp3Client$execute$2$2 r0 = new com.unity3d.services.core.network.core.OkHttp3Client$execute$2$2     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            r0.<init>()     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            r13.B(r0)     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            java.lang.Object r11 = r2.s()     // Catch: java.io.IOException -> L9c java.net.SocketTimeoutException -> Lb1
            if (r11 != r1) goto L9b
            return r1
        L9b:
            return r11
        L9c:
            com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException r0 = new com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException
            java.lang.String r4 = r11.getBaseURL()
            r6 = 0
            java.lang.String r7 = "refactored-okhttp"
            java.lang.String r1 = "Network request failed"
            r2 = 0
            r3 = 0
            r5 = 0
            r8 = 54
            r9 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            throw r0
        Lb1:
            com.unity3d.ads.core.data.model.exception.NetworkTimeoutException r0 = new com.unity3d.ads.core.data.model.exception.NetworkTimeoutException
            java.lang.String r4 = r11.getBaseURL()
            r6 = 0
            java.lang.String r7 = "refactored-okhttp"
            java.lang.String r1 = "Network request timeout"
            r2 = 0
            r3 = 0
            r5 = 0
            r8 = 54
            r9 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.core.OkHttp3Client.execute(com.unity3d.services.core.network.model.HttpRequest, boolean, jf.c):java.lang.Object");
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    @NotNull
    public HttpResponse executeBlocking(@NotNull HttpRequest request) {
        AbstractC3340k.e(request, "request");
        return (HttpResponse) H.I(this.dispatchers.getIo(), new C23741(request, null));
    }
}
