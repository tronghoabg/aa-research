package com.unity3d.ads.core.domain.events;

import Ef.E;
import Hf.InterfaceC0592c0;
import Hf.Z;
import Hf.k0;
import Hf.x0;
import com.unity3d.ads.core.data.repository.AdRevenueRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.gatewayclient.GatewayClient;
import ef.C2515C;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;
import tf.p;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/unity3d/ads/core/domain/events/AdRevenueObserver;", "", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "getUniversalRequestForPayLoad", "LEf/E;", "scope", "Lcom/unity3d/ads/core/data/repository/AdRevenueRepository;", "adRevenueRepository", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "gatewayClient", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getRequestPolicy", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;LEf/E;Lcom/unity3d/ads/core/data/repository/AdRevenueRepository;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/core/log/Logger;)V", "Lef/C;", "invoke", "()V", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "LEf/E;", "Lcom/unity3d/ads/core/data/repository/AdRevenueRepository;", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "Lcom/unity3d/ads/core/log/Logger;", "LHf/c0;", "", "isRunning", "LHf/c0;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdRevenueObserver {

    @NotNull
    private final AdRevenueRepository adRevenueRepository;

    @NotNull
    private final GatewayClient gatewayClient;

    @NotNull
    private final GetRequestPolicy getRequestPolicy;

    @NotNull
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    @NotNull
    private final InterfaceC0592c0 isRunning;

    @NotNull
    private final Logger logger;

    @NotNull
    private final E scope;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;", "currentAdRevenueEventRequest", "Lef/C;", "<anonymous>", "(Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.domain.events.AdRevenueObserver$invoke$2", f = "AdRevenueObserver.kt", l = {36, 37}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.events.AdRevenueObserver$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3471j implements p {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(InterfaceC3103c<? super AnonymousClass2> interfaceC3103c) {
            super(2, interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            AnonymousClass2 anonymousClass2 = AdRevenueObserver.this.new AnonymousClass2(interfaceC3103c);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull AdRevenueEventRequestOuterClass.AdRevenueEventRequest adRevenueEventRequest, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass2) create(adRevenueEventRequest, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|32|(2:35|(1:(4:6|7|28|29)(2:10|11))(1:12))(5:14|33|15|(1:17)|22)|18|19|36|20|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
        
            if (com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r3, null, r5, r6, r7, r8, 1, null) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
        
            r0 = e;
         */
        @Override // lf.AbstractC3462a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
            /*
                r11 = this;
                kf.a r0 = kf.a.f39711a
                int r1 = r11.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                Fe.e.U(r12)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lf java.lang.Exception -> L12
            Lf:
                r8 = r11
                goto L84
            L12:
                r0 = move-exception
                r12 = r0
                r8 = r11
                goto L79
            L16:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1e:
                Fe.e.U(r12)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lf java.lang.Exception -> L12
                goto L51
            L22:
                Fe.e.U(r12)
                java.lang.Object r12 = r11.L$0
                gatewayprotocol.v1.AdRevenueEventRequestOuterClass$AdRevenueEventRequest r12 = (gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueEventRequest) r12
                gatewayprotocol.v1.UniversalRequestKt r1 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lf java.lang.Exception -> L76
                gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl$Companion r1 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lf java.lang.Exception -> L76
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder r4 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lf java.lang.Exception -> L76
                java.lang.String r5 = "newBuilder()"
                kotlin.jvm.internal.AbstractC3340k.d(r4, r5)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lf java.lang.Exception -> L76
                gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl r1 = r1._create(r4)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lf java.lang.Exception -> L76
                r1.setAdRevenueEventRequest(r12)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lf java.lang.Exception -> L76
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r12 = r1._build()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lf java.lang.Exception -> L76
                com.unity3d.ads.core.domain.events.AdRevenueObserver r1 = com.unity3d.ads.core.domain.events.AdRevenueObserver.this     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lf java.lang.Exception -> L76
                com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r1 = com.unity3d.ads.core.domain.events.AdRevenueObserver.access$getGetUniversalRequestForPayLoad$p(r1)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lf java.lang.Exception -> L76
                r11.label = r3     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lf java.lang.Exception -> L76
                java.lang.Object r12 = r1.invoke(r12, r11)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lf java.lang.Exception -> L76
                if (r12 != r0) goto L51
                r8 = r11
                goto L72
            L51:
                r5 = r12
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r5 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r5     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lf java.lang.Exception -> L76
                com.unity3d.ads.core.domain.events.AdRevenueObserver r12 = com.unity3d.ads.core.domain.events.AdRevenueObserver.this     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lf java.lang.Exception -> L76
                com.unity3d.ads.gatewayclient.GatewayClient r3 = com.unity3d.ads.core.domain.events.AdRevenueObserver.access$getGatewayClient$p(r12)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lf java.lang.Exception -> L76
                com.unity3d.ads.core.domain.events.AdRevenueObserver r12 = com.unity3d.ads.core.domain.events.AdRevenueObserver.this     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lf java.lang.Exception -> L76
                com.unity3d.ads.core.domain.GetRequestPolicy r12 = com.unity3d.ads.core.domain.events.AdRevenueObserver.access$getGetRequestPolicy$p(r12)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lf java.lang.Exception -> L76
                com.unity3d.ads.gatewayclient.RequestPolicy r6 = r12.invoke()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lf java.lang.Exception -> L76
                com.unity3d.ads.core.data.model.OperationType r7 = com.unity3d.ads.core.data.model.OperationType.AD_REVENUE_EVENT     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lf java.lang.Exception -> L76
                r11.label = r2     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lf java.lang.Exception -> L76
                r4 = 0
                r9 = 1
                r10 = 0
                r8 = r11
                java.lang.Object r12 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L73 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L84
                if (r12 != r0) goto L84
            L72:
                return r0
            L73:
                r0 = move-exception
            L74:
                r12 = r0
                goto L79
            L76:
                r0 = move-exception
                r8 = r11
                goto L74
            L79:
                com.unity3d.ads.core.domain.events.AdRevenueObserver r0 = com.unity3d.ads.core.domain.events.AdRevenueObserver.this
                com.unity3d.ads.core.log.Logger r0 = com.unity3d.ads.core.domain.events.AdRevenueObserver.access$getLogger$p(r0)
                java.lang.String r1 = "Unexpected error processing ad revenue event"
                r0.trace(r1, r12)
            L84:
                ef.C r12 = ef.C2515C.f34653a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.AdRevenueObserver.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lef/C;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.unity3d.ads.core.domain.events.AdRevenueObserver$invoke$3, reason: invalid class name */
    public static final class AnonymousClass3 extends AbstractC3343n implements l {
        public AnonymousClass3() {
            super(1);
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@Nullable Throwable th) {
            InterfaceC0592c0 interfaceC0592c0 = AdRevenueObserver.this.isRunning;
            Boolean bool = Boolean.FALSE;
            x0 x0Var = (x0) interfaceC0592c0;
            x0Var.getClass();
            x0Var.k(null, bool);
        }
    }

    public AdRevenueObserver(@NotNull GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, @NotNull E scope, @NotNull AdRevenueRepository adRevenueRepository, @NotNull GatewayClient gatewayClient, @NotNull GetRequestPolicy getRequestPolicy, @NotNull Logger logger) {
        AbstractC3340k.e(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        AbstractC3340k.e(scope, "scope");
        AbstractC3340k.e(adRevenueRepository, "adRevenueRepository");
        AbstractC3340k.e(gatewayClient, "gatewayClient");
        AbstractC3340k.e(getRequestPolicy, "getRequestPolicy");
        AbstractC3340k.e(logger, "logger");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.scope = scope;
        this.adRevenueRepository = adRevenueRepository;
        this.gatewayClient = gatewayClient;
        this.getRequestPolicy = getRequestPolicy;
        this.logger = logger;
        this.isRunning = k0.c(Boolean.FALSE);
    }

    public final void invoke() {
        x0 x0Var;
        Object value;
        Boolean bool;
        InterfaceC0592c0 interfaceC0592c0 = this.isRunning;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!x0Var.i(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        k0.u(new Z(this.adRevenueRepository.getAdRevenueEvents(), new AnonymousClass2(null), 0), this.scope).invokeOnCompletion(new AnonymousClass3());
    }
}
