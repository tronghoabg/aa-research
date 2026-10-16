package com.unity3d.ads.core.domain;

import Ef.E;
import Ef.H;
import Fe.e;
import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.adquality.InitializeAdQuality;
import com.unity3d.ads.core.domain.events.AdRevenueObserver;
import com.unity3d.ads.core.domain.events.LifecycleEventObserver;
import com.unity3d.ads.core.domain.events.MaxAdRevenueObserver;
import ef.C2515C;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.List;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096Bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010'R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleGatewayInitializationResponse;", "Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;", "Lcom/unity3d/ads/core/data/manager/TransactionEventManager;", "transactionEventManager", "Lcom/unity3d/ads/core/domain/events/AdRevenueObserver;", "adRevenueObserver", "Lcom/unity3d/ads/core/domain/events/MaxAdRevenueObserver;", "maxAdRevenueObserver", "Lcom/unity3d/ads/core/domain/events/LifecycleEventObserver;", "lifecycleEventObserver", "Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;", "triggerInitializationCompletedRequest", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "LEf/E;", "sdkScope", "Lcom/unity3d/ads/core/domain/HandleDebugSettings;", "handleDebugSettings", "Lcom/unity3d/ads/core/domain/GetSafeguardedInitializationPolicy;", "getSafeguardedInitializationPolicy", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "defaultNativeConfiguration", "Lcom/unity3d/ads/core/domain/adquality/InitializeAdQuality;", "initializeAdQuality", "<init>", "(Lcom/unity3d/ads/core/data/manager/TransactionEventManager;Lcom/unity3d/ads/core/domain/events/AdRevenueObserver;Lcom/unity3d/ads/core/domain/events/MaxAdRevenueObserver;Lcom/unity3d/ads/core/domain/events/LifecycleEventObserver;Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;Lcom/unity3d/ads/core/data/repository/SessionRepository;LEf/E;Lcom/unity3d/ads/core/domain/HandleDebugSettings;Lcom/unity3d/ads/core/domain/GetSafeguardedInitializationPolicy;Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;Lcom/unity3d/ads/core/domain/adquality/InitializeAdQuality;)V", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "response", "Lef/C;", "invoke", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;Ljf/c;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/manager/TransactionEventManager;", "Lcom/unity3d/ads/core/domain/events/AdRevenueObserver;", "Lcom/unity3d/ads/core/domain/events/MaxAdRevenueObserver;", "Lcom/unity3d/ads/core/domain/events/LifecycleEventObserver;", "Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "LEf/E;", "Lcom/unity3d/ads/core/domain/HandleDebugSettings;", "Lcom/unity3d/ads/core/domain/GetSafeguardedInitializationPolicy;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "Lcom/unity3d/ads/core/domain/adquality/InitializeAdQuality;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidHandleGatewayInitializationResponse implements HandleGatewayInitializationResponse {

    @NotNull
    private final AdRevenueObserver adRevenueObserver;

    @NotNull
    private final NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration;

    @NotNull
    private final GetSafeguardedInitializationPolicy getSafeguardedInitializationPolicy;

    @NotNull
    private final HandleDebugSettings handleDebugSettings;

    @NotNull
    private final InitializeAdQuality initializeAdQuality;

    @NotNull
    private final LifecycleEventObserver lifecycleEventObserver;

    @NotNull
    private final MaxAdRevenueObserver maxAdRevenueObserver;

    @NotNull
    private final E sdkScope;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final TransactionEventManager transactionEventManager;

    @NotNull
    private final TriggerInitializationCompletedRequest triggerInitializationCompletedRequest;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse$invoke$4", f = "AndroidHandleGatewayInitializationResponse.kt", l = {91}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse$invoke$4, reason: invalid class name */
    public static final class AnonymousClass4 extends AbstractC3471j implements p {
        int label;

        public AnonymousClass4(InterfaceC3103c<? super AnonymousClass4> interfaceC3103c) {
            super(2, interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return AndroidHandleGatewayInitializationResponse.this.new AnonymousClass4(interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass4) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kf.a aVar = kf.a.f39711a;
            int i5 = this.label;
            if (i5 == 0) {
                e.U(obj);
                TriggerInitializationCompletedRequest triggerInitializationCompletedRequest = AndroidHandleGatewayInitializationResponse.this.triggerInitializationCompletedRequest;
                this.label = 1;
                if (triggerInitializationCompletedRequest.invoke(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.U(obj);
            }
            return C2515C.f34653a;
        }
    }

    public AndroidHandleGatewayInitializationResponse(@NotNull TransactionEventManager transactionEventManager, @NotNull AdRevenueObserver adRevenueObserver, @NotNull MaxAdRevenueObserver maxAdRevenueObserver, @NotNull LifecycleEventObserver lifecycleEventObserver, @NotNull TriggerInitializationCompletedRequest triggerInitializationCompletedRequest, @NotNull SessionRepository sessionRepository, @NotNull E sdkScope, @NotNull HandleDebugSettings handleDebugSettings, @NotNull GetSafeguardedInitializationPolicy getSafeguardedInitializationPolicy, @NotNull NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration, @NotNull InitializeAdQuality initializeAdQuality) {
        AbstractC3340k.e(transactionEventManager, "transactionEventManager");
        AbstractC3340k.e(adRevenueObserver, "adRevenueObserver");
        AbstractC3340k.e(maxAdRevenueObserver, "maxAdRevenueObserver");
        AbstractC3340k.e(lifecycleEventObserver, "lifecycleEventObserver");
        AbstractC3340k.e(triggerInitializationCompletedRequest, "triggerInitializationCompletedRequest");
        AbstractC3340k.e(sessionRepository, "sessionRepository");
        AbstractC3340k.e(sdkScope, "sdkScope");
        AbstractC3340k.e(handleDebugSettings, "handleDebugSettings");
        AbstractC3340k.e(getSafeguardedInitializationPolicy, "getSafeguardedInitializationPolicy");
        AbstractC3340k.e(defaultNativeConfiguration, "defaultNativeConfiguration");
        AbstractC3340k.e(initializeAdQuality, "initializeAdQuality");
        this.transactionEventManager = transactionEventManager;
        this.adRevenueObserver = adRevenueObserver;
        this.maxAdRevenueObserver = maxAdRevenueObserver;
        this.lifecycleEventObserver = lifecycleEventObserver;
        this.triggerInitializationCompletedRequest = triggerInitializationCompletedRequest;
        this.sessionRepository = sessionRepository;
        this.sdkScope = sdkScope;
        this.handleDebugSettings = handleDebugSettings;
        this.getSafeguardedInitializationPolicy = getSafeguardedInitializationPolicy;
        this.defaultNativeConfiguration = defaultNativeConfiguration;
        this.initializeAdQuality = initializeAdQuality;
    }

    @Override // com.unity3d.ads.core.domain.HandleGatewayInitializationResponse
    @Nullable
    public Object invoke(@NotNull UniversalResponseOuterClass.UniversalResponse universalResponse, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) throws GatewayException, InitializationException {
        String universalRequestUrl;
        if (universalResponse.hasPayload() && universalResponse.getPayload().hasInitializationResponse() && universalResponse.getPayload().getInitializationResponse().hasError()) {
            ErrorOuterClass.PublicErrorCode errorCode = universalResponse.getPayload().getInitializationResponse().getError().getErrorCode();
            AbstractC3340k.d(errorCode, "response.payload.initial…nResponse.error.errorCode");
            String initErrorMsg = UnityAdsErrorKt.getInitErrorMsg(errorCode, this.sessionRepository.getGameId());
            if (initErrorMsg == null) {
                initErrorMsg = universalResponse.getPayload().getInitializationResponse().getError().getErrorText();
            }
            String str = initErrorMsg;
            AbstractC3340k.d(str, "response.payload.initial…nResponse.error.errorText");
            throw new GatewayException(str, new IllegalStateException(universalResponse.getPayload().getInitializationResponse().getError().getErrorText()), "gateway_initialization", universalResponse.getPayload().getInitializationResponse().getError().getErrorText(), universalResponse.getPayload().getInitializationResponse().getError().getErrorCode());
        }
        if (universalResponse.hasError()) {
            ErrorOuterClass.PublicErrorCode errorCode2 = universalResponse.getError().getErrorCode();
            AbstractC3340k.d(errorCode2, "response.error.errorCode");
            String initErrorMsg2 = UnityAdsErrorKt.getInitErrorMsg(errorCode2, this.sessionRepository.getGameId());
            if (initErrorMsg2 == null) {
                initErrorMsg2 = universalResponse.getError().getErrorText();
            }
            String str2 = initErrorMsg2;
            AbstractC3340k.d(str2, "response.error.errorCode… response.error.errorText");
            throw new InitializationException(str2, new IllegalStateException(universalResponse.getError().getErrorText()), "gateway_initialization", universalResponse.getError().getErrorText(), universalResponse.getError().getErrorCode());
        }
        if (!universalResponse.hasPayload() || !universalResponse.getPayload().hasInitializationResponse()) {
            throw new InitializationException(UnityAdsErrorKt.MSG_INIT_FAIL_PARSING_ERROR, null, "gateway", "No payload", ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_PROTO, 2, null);
        }
        InitializationResponseOuterClass.InitializationResponse initializationResponse = universalResponse.getPayload().getInitializationResponse();
        SessionRepository sessionRepository = this.sessionRepository;
        NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = initializationResponse.getNativeConfiguration();
        AbstractC3340k.d(nativeConfiguration, "initResponse.nativeConfiguration");
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.NativeConfiguration.Builder builder = nativeConfiguration.toBuilder();
        AbstractC3340k.d(builder, "this.toBuilder()");
        NativeConfigurationKt.Dsl dsl_create = companion._create(builder);
        dsl_create.setInitPolicy(this.getSafeguardedInitializationPolicy.invoke(dsl_create.getInitPolicy()));
        dsl_create.setMaxExtrasSizeKb(dsl_create.getMaxExtrasSizeKb() == 0 ? this.defaultNativeConfiguration.getMaxExtrasSizeKb() : dsl_create.getMaxExtrasSizeKb());
        sessionRepository.setNativeConfiguration(dsl_create._build());
        if (initializationResponse.hasUniversalRequestUrl() && (universalRequestUrl = initializationResponse.getUniversalRequestUrl()) != null && universalRequestUrl.length() != 0) {
            SessionRepository sessionRepository2 = this.sessionRepository;
            String universalRequestUrl2 = initializationResponse.getUniversalRequestUrl();
            AbstractC3340k.d(universalRequestUrl2, "initResponse.universalRequestUrl");
            sessionRepository2.setGatewayUrl(universalRequestUrl2);
        }
        List<InitializationResponseOuterClass.RequestUrlOverride> requestUrlOverridesList = initializationResponse.getRequestUrlOverridesList();
        if (requestUrlOverridesList != null) {
            this.sessionRepository.setRequestUrlOverrides(requestUrlOverridesList);
        }
        List<AdFormatOuterClass.AdFormat> scarEligibleFormats = this.sessionRepository.getScarEligibleFormats();
        List<AdFormatOuterClass.AdFormat> scarEligibleFormatsList = initializationResponse.getScarEligibleFormatsList();
        AbstractC3340k.d(scarEligibleFormatsList, "initResponse.scarEligibleFormatsList");
        scarEligibleFormats.addAll(scarEligibleFormatsList);
        if (initializationResponse.getTriggerInitializationCompletedRequest()) {
            H.D(this.sdkScope, null, new AnonymousClass4(null), 3);
        }
        if (initializationResponse.getNativeConfiguration().getEnableIapEvent()) {
            this.transactionEventManager.invoke();
        }
        if (initializationResponse.getNativeConfiguration().getFeatureFlags().getCollectIlrData()) {
            this.adRevenueObserver.invoke();
        }
        this.maxAdRevenueObserver.invoke();
        if (initializationResponse.getNativeConfiguration().getFeatureFlags().getCollectLifecycleEvents()) {
            this.lifecycleEventObserver.invoke();
        }
        if (initializationResponse.getNativeConfiguration().hasDebugSettings()) {
            HandleDebugSettings handleDebugSettings = this.handleDebugSettings;
            NativeConfigurationOuterClass.DebugSettings debugSettings = initializationResponse.getNativeConfiguration().getDebugSettings();
            AbstractC3340k.d(debugSettings, "initResponse.nativeConfiguration.debugSettings");
            handleDebugSettings.invoke(debugSettings);
        }
        if (initializationResponse.getNativeConfiguration().hasLevelPlayAppKey()) {
            InitializeAdQuality initializeAdQuality = this.initializeAdQuality;
            String levelPlayAppKey = initializationResponse.getNativeConfiguration().getLevelPlayAppKey();
            AbstractC3340k.d(levelPlayAppKey, "initResponse.nativeConfiguration.levelPlayAppKey");
            initializeAdQuality.invoke(levelPlayAppKey);
        }
        return C2515C.f34653a;
    }
}
