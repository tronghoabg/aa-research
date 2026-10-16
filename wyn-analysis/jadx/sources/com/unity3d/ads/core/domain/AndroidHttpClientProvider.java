package com.unity3d.ads.core.domain;

import A6.h;
import Ef.C0502n;
import Ef.H;
import Ef.InterfaceC0498l;
import Nf.e;
import android.content.Context;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.CronetClient;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.OkHttp3Client;
import com.vungle.ads.internal.protos.Sdk;
import ef.C2527k;
import ff.AbstractC2641B;
import java.util.Map;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3464c;
import lf.InterfaceC3466e;
import okhttp3.OkHttpClient;
import org.chromium.net.CronetEngine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0010H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0012J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHttpClientProvider;", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "alternativeFlowReader", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Landroid/content/Context;", "context", "Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;", "cronetEngineBuilderFactory", "Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;", "mediationTraitsMetadataReader", "<init>", "(Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Landroid/content/Context;Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;)V", "Lcom/unity3d/services/core/network/core/HttpClient;", "createHttpClient", "(Ljf/c;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/HttpClientSelection;", "selectedHttpClient", "buildNetworkClient", "(Landroid/content/Context;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/ads/core/domain/HttpClientSelection;Ljf/c;)Ljava/lang/Object;", "invoke", "Lcom/unity3d/services/core/network/core/OkHttp3Client;", "getOkHttp3Client", "()Lcom/unity3d/services/core/network/core/OkHttp3Client;", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Landroid/content/Context;", "Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;", "Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;", "LNf/a;", "mutex", "LNf/a;", "cachedClient", "Lcom/unity3d/services/core/network/core/HttpClient;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidHttpClientProvider implements HttpClientProvider {

    @NotNull
    private final AlternativeFlowReader alternativeFlowReader;

    @Nullable
    private HttpClient cachedClient;

    @NotNull
    private final Context context;

    @NotNull
    private final CronetEngineBuilderFactory cronetEngineBuilderFactory;

    @NotNull
    private final ISDKDispatchers dispatchers;

    @NotNull
    private final MediationTraitsMetadataReader mediationTraitsMetadataReader;

    @NotNull
    private final Nf.a mutex;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider", f = "AndroidHttpClientProvider.kt", l = {74}, m = "createHttpClient")
    /* renamed from: com.unity3d.ads.core.domain.AndroidHttpClientProvider$createHttpClient$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3464c {
        long J$0;
        Object L$0;
        Object L$1;
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
            return AndroidHttpClientProvider.this.createHttpClient(this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider", f = "AndroidHttpClientProvider.kt", l = {Sdk.SDKError.Reason.STORE_REGION_CODE_ERROR_VALUE, 57}, m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1, reason: invalid class name and case insensitive filesystem */
    public static final class C23041 extends AbstractC3464c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C23041(InterfaceC3103c<? super C23041> interfaceC3103c) {
            super(interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHttpClientProvider.this.invoke(this);
        }
    }

    public AndroidHttpClientProvider(@NotNull AlternativeFlowReader alternativeFlowReader, @NotNull ISDKDispatchers dispatchers, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull Context context, @NotNull CronetEngineBuilderFactory cronetEngineBuilderFactory, @NotNull MediationTraitsMetadataReader mediationTraitsMetadataReader) {
        AbstractC3340k.e(alternativeFlowReader, "alternativeFlowReader");
        AbstractC3340k.e(dispatchers, "dispatchers");
        AbstractC3340k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(cronetEngineBuilderFactory, "cronetEngineBuilderFactory");
        AbstractC3340k.e(mediationTraitsMetadataReader, "mediationTraitsMetadataReader");
        this.alternativeFlowReader = alternativeFlowReader;
        this.dispatchers = dispatchers;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.context = context;
        this.cronetEngineBuilderFactory = cronetEngineBuilderFactory;
        this.mediationTraitsMetadataReader = mediationTraitsMetadataReader;
        this.mutex = e.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object buildNetworkClient(final Context context, final ISDKDispatchers iSDKDispatchers, final HttpClientSelection httpClientSelection, InterfaceC3103c<? super HttpClient> interfaceC3103c) {
        final C0502n c0502n = new C0502n(1, h.A(interfaceC3103c));
        c0502n.t();
        B7.a.a(context).addOnCompleteListener(H.g(iSDKDispatchers.getIo()), new OnCompleteListener() { // from class: com.unity3d.ads.core.domain.AndroidHttpClientProvider$buildNetworkClient$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(@NotNull Task<Void> it) {
                String str;
                String message;
                AbstractC3340k.e(it, "it");
                str = "Errored without message.";
                if (!it.isSuccessful()) {
                    SendDiagnosticEvent sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                    Exception exception = it.getException();
                    if (exception != null && (message = exception.getMessage()) != null) {
                        str = message;
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_cronet_install_error", (Double) null, AbstractC2641B.E(new C2527k("reason", str)), (Map) null, (AdObject) null, (Integer) null, 58, (Object) null);
                    c0502n.resumeWith(this.this$0.getOkHttp3Client());
                    return;
                }
                try {
                    CronetEngine.Builder builderCreateCronetEngineBuilder = this.this$0.cronetEngineBuilderFactory.createCronetEngineBuilder(context);
                    if (httpClientSelection == HttpClientSelection.CRONET_WITH_QUIC) {
                        builderCreateCronetEngineBuilder.enableQuic(true);
                        builderCreateCronetEngineBuilder.addQuicHint(ServiceProvider.GATEWAY_HOST, 443, 443);
                        builderCreateCronetEngineBuilder.addQuicHint(ServiceProvider.CDN_CREATIVES_HOST, 443, 443);
                    }
                    CronetEngine cronetEngine = builderCreateCronetEngineBuilder.build();
                    InterfaceC0498l interfaceC0498l = c0502n;
                    AbstractC3340k.d(cronetEngine, "cronetEngine");
                    interfaceC0498l.resumeWith(new CronetClient(cronetEngine, iSDKDispatchers));
                } catch (Throwable th) {
                    SendDiagnosticEvent sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
                    String message2 = th.getMessage();
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "native_cronet_engine_error", (Double) null, AbstractC2641B.E(new C2527k("reason", message2 != null ? message2 : "Errored without message.")), (Map) null, (AdObject) null, (Integer) null, 58, (Object) null);
                    c0502n.resumeWith(this.this$0.getOkHttp3Client());
                }
            }
        });
        Object objS = c0502n.s();
        kf.a aVar = kf.a.f39711a;
        return objS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createHttpClient(jf.InterfaceC3103c<? super com.unity3d.services.core.network.core.HttpClient> r14) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHttpClientProvider.createHttpClient(jf.c):java.lang.Object");
    }

    @NotNull
    public final OkHttp3Client getOkHttp3Client() {
        return new OkHttp3Client(this.dispatchers, new OkHttpClient());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.HttpClientProvider
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super com.unity3d.services.core.network.core.HttpClient> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.domain.AndroidHttpClientProvider.C23041
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidHttpClientProvider.C23041) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kf.a r1 = kf.a.f39711a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.L$1
            Nf.a r1 = (Nf.a) r1
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.AndroidHttpClientProvider r0 = (com.unity3d.ads.core.domain.AndroidHttpClientProvider) r0
            Fe.e.U(r7)     // Catch: java.lang.Throwable -> L33
            goto L75
        L33:
            r7 = move-exception
            goto L80
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3d:
            java.lang.Object r2 = r0.L$1
            Nf.a r2 = (Nf.a) r2
            java.lang.Object r4 = r0.L$0
            com.unity3d.ads.core.domain.AndroidHttpClientProvider r4 = (com.unity3d.ads.core.domain.AndroidHttpClientProvider) r4
            Fe.e.U(r7)
            r7 = r2
            goto L5d
        L4a:
            Fe.e.U(r7)
            Nf.a r7 = r6.mutex
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r2 = r7.b(r0)
            if (r2 != r1) goto L5c
            goto L71
        L5c:
            r4 = r6
        L5d:
            com.unity3d.services.core.network.core.HttpClient r2 = r4.cachedClient     // Catch: java.lang.Throwable -> L7d
            if (r2 == 0) goto L65
            r7.a(r5)
            return r2
        L65:
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L7d
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L7d
            r0.label = r3     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r0 = r4.createHttpClient(r0)     // Catch: java.lang.Throwable -> L7d
            if (r0 != r1) goto L72
        L71:
            return r1
        L72:
            r1 = r7
            r7 = r0
            r0 = r4
        L75:
            com.unity3d.services.core.network.core.HttpClient r7 = (com.unity3d.services.core.network.core.HttpClient) r7     // Catch: java.lang.Throwable -> L33
            r0.cachedClient = r7     // Catch: java.lang.Throwable -> L33
            r1.a(r5)
            return r7
        L7d:
            r0 = move-exception
            r1 = r7
            r7 = r0
        L80:
            r1.a(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHttpClientProvider.invoke(jf.c):java.lang.Object");
    }
}
