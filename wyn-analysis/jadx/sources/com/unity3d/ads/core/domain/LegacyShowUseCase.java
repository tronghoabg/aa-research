package com.unity3d.ads.core.domain;

import Cf.f;
import Fe.e;
import Hf.InterfaceC0592c0;
import Hf.InterfaceC0603m;
import Hf.k0;
import Hf.x0;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.ShowStatusExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import ef.C2515C;
import ef.C2527k;
import ff.AbstractC2640A;
import ff.AbstractC2641B;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.OperativeEventErrorDataKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gf.C2759f;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import lf.AbstractC3464c;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tf.p;
import tf.q;
import tf.t;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 Y2\u00020\u0001:\u0001YBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0086Bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010 J+\u0010'\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%H\u0082@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b)\u0010*J'\u0010+\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b+\u0010 J'\u0010,\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b,\u0010 J\u0019\u0010-\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b-\u0010.J!\u00101\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\u00142\b\u00100\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b1\u00102JQ\u00107\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u00104\u001a\u0002032\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00142\b\u00100\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b7\u00108Jt\u0010=\u001a:\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010;\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0<\u0012\u0006\u0012\u0004\u0018\u00010\u0001092\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\u00100\u001a\u0004\u0018\u00010\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b=\u0010>JA\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140B2\u0006\u0010?\u001a\u00020\u00142\b\u0010@\u001a\u0004\u0018\u00010;2\b\u0010A\u001a\u0004\u0018\u00010\u00142\b\u00100\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020%2\u0006\u0010/\u001a\u00020\u0014H\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0014H\u0002¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010IR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010JR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010KR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010LR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010MR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010NR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010OR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010PR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010TR\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010VR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010WR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010X\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Z"}, d2 = {"Lcom/unity3d/ads/core/domain/LegacyShowUseCase;", "", "Lcom/unity3d/ads/core/domain/Show;", "show", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "adRepository", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "getOperativeEventApi", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "getInitializationState", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "safeCallbackInvoke", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/ads/core/domain/Show;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;Lcom/unity3d/ads/core/domain/GetInitializationState;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;Lcom/unity3d/ads/core/log/Logger;)V", "", "placement", "Lcom/unity3d/ads/UnityAdsShowOptions;", "unityAdsShowOptions", "Lcom/unity3d/ads/core/data/model/Listeners;", "listeners", "Lef/C;", "invoke", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;Lcom/unity3d/ads/core/data/model/Listeners;Ljf/c;)Ljava/lang/Object;", "LCf/f;", "startTime", "showReceivedReward", "(LCf/f;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/Listeners;)V", "bannerLeftApplication", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventErrorType;", "operativeEvent", "operativeMessage", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "sendOperativeError", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventErrorType;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Ljf/c;)Ljava/lang/Object;", "cancelTimeout", "(LCf/f;)V", "showStarted", "showClicked", "getOpportunityId", "(Lcom/unity3d/ads/UnityAdsShowOptions;)Ljava/lang/String;", "opportunityId", "showOptions", "showStart", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;)V", "Lcom/unity3d/ads/adplayer/model/ShowStatus;", "status", "reason", "reasonDebug", "showCompleted", "(LCf/f;Ljava/lang/String;Lcom/unity3d/ads/adplayer/model/ShowStatus;Lcom/unity3d/ads/core/data/model/Listeners;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;)V", "Lkotlin/Function6;", "Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "", "Ljf/c;", "showError", "(LCf/f;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/Listeners;Lcom/unity3d/ads/UnityAdsShowOptions;)Ltf/t;", "diagnosticReason", "code", "debugMessage", "", "getTags", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;)Ljava/util/Map;", "getTmpAdObject", "(Ljava/lang/String;)Lcom/unity3d/ads/core/data/model/AdObject;", "getAdInfoString", "()Ljava/lang/String;", "Lcom/unity3d/ads/core/domain/Show;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "Lcom/unity3d/ads/core/log/Logger;", "LHf/c0;", "", "hasStarted", "LHf/c0;", "timeoutCancellationRequested", "Lcom/unity3d/ads/core/data/model/AdObject;", "Ljava/lang/String;", "Lcom/unity3d/ads/UnityAdsShowOptions;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LegacyShowUseCase {

    @NotNull
    public static final String KEY_OBJECT_ID = "objectId";

    @NotNull
    public static final String MESSAGE_AD_OBJECT_EXPIRED = "The ad has expired";

    @NotNull
    public static final String MESSAGE_AD_PLAYER_UNAVAILABLE = "Ad player is unavailable.";

    @NotNull
    public static final String MESSAGE_ALREADY_SHOWING = "Can't show a new ad unit when ad unit is already open";

    @NotNull
    public static final String MESSAGE_NO_AD_OBJECT = "No ad object found for opportunity id: ";

    @NotNull
    public static final String MESSAGE_OPPORTUNITY_ID = "No valid opportunity id provided";

    @NotNull
    public static final String MESSAGE_OPT_TIMEOUT = "timeout";

    @NotNull
    public static final String MESSAGE_PLACEMENT_NOT_LOADED = "Placement %s must be Loaded before calling Show";

    @NotNull
    public static final String MESSAGE_TIMEOUT = "[UnityAds] Timeout while trying to show ";

    @NotNull
    public static final String MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING = "[UnityAds] Object ID and Placement ID provided does not match previously loaded ad";
    private static volatile boolean isFullscreenAdShowing;

    @Nullable
    private AdObject adObject;

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final GetInitializationState getInitializationState;

    @NotNull
    private final GetOperativeEventApi getOperativeEventApi;

    @NotNull
    private final InterfaceC0592c0 hasStarted;

    @NotNull
    private final Logger logger;

    @Nullable
    private String placement;

    @NotNull
    private final SafeCallbackInvoke safeCallbackInvoke;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final Show show;

    @NotNull
    private final InterfaceC0592c0 timeoutCancellationRequested;

    @Nullable
    private UnityAdsShowOptions unityAdsShowOptions;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$bannerLeftApplication$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements tf.a {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Listeners listeners, String str) {
            super(0);
            this.$listeners = listeners;
            this.$placement = str;
        }

        @Override // tf.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m271invoke();
            return C2515C.f34653a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m271invoke() {
            this.$listeners.onLeftApplication(this.$placement);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.ads.core.domain.LegacyShowUseCase", f = "LegacyShowUseCase.kt", l = {117, 122, 128, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 141, 146, 152, 159, 164, 196}, m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$1, reason: invalid class name and case insensitive filesystem */
    public static final class C23101 extends AbstractC3464c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C23101(InterfaceC3103c<? super C23101> interfaceC3103c) {
            super(interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LegacyShowUseCase.this.invoke(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Lef/C;", "close", "<anonymous>", "(Ltf/a;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2", f = "LegacyShowUseCase.kt", l = {178, 184, 185}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3471j implements p {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ String $placement;
        final /* synthetic */ t $reportShowError;
        final /* synthetic */ boolean $useTimeout;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AdObject adObject, boolean z2, t tVar, String str, InterfaceC3103c<? super AnonymousClass2> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$adObject = adObject;
            this.$useTimeout = z2;
            this.$reportShowError = tVar;
            this.$placement = str;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            AnonymousClass2 anonymousClass2 = LegacyShowUseCase.this.new AnonymousClass2(this.$adObject, this.$useTimeout, this.$reportShowError, this.$placement, interfaceC3103c);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
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
                ef.C r2 = ef.C2515C.f34653a
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L32
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L22
                if (r1 != r3) goto L1a
                java.lang.Object r0 = r11.L$0
                tf.a r0 = (tf.a) r0
                Fe.e.U(r12)
                goto Lb2
            L1a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L22:
                java.lang.Object r1 = r11.L$0
                tf.a r1 = (tf.a) r1
                Fe.e.U(r12)
                goto L8d
            L2a:
                java.lang.Object r1 = r11.L$0
                tf.a r1 = (tf.a) r1
                Fe.e.U(r12)
                goto L76
            L32:
                Fe.e.U(r12)
                java.lang.Object r12 = r11.L$0
                r1 = r12
                tf.a r1 = (tf.a) r1
                com.unity3d.ads.core.domain.LegacyShowUseCase r12 = com.unity3d.ads.core.domain.LegacyShowUseCase.this
                Hf.c0 r12 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getHasStarted$p(r12)
                Hf.x0 r12 = (Hf.x0) r12
                java.lang.Object r12 = r12.getValue()
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 != 0) goto Lb5
                com.unity3d.ads.core.domain.LegacyShowUseCase r12 = com.unity3d.ads.core.domain.LegacyShowUseCase.this
                Hf.c0 r12 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getTimeoutCancellationRequested$p(r12)
                Hf.x0 r12 = (Hf.x0) r12
                java.lang.Object r12 = r12.getValue()
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto L63
                goto Lb5
            L63:
                com.unity3d.ads.core.domain.LegacyShowUseCase r12 = com.unity3d.ads.core.domain.LegacyShowUseCase.this
                gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType r6 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT
                com.unity3d.ads.core.data.model.AdObject r7 = r11.$adObject
                r11.L$0 = r1
                r11.label = r5
                java.lang.String r5 = "timeout"
                java.lang.Object r12 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$sendOperativeError(r12, r6, r5, r7, r11)
                if (r12 != r0) goto L76
                goto Lb0
            L76:
                boolean r12 = r11.$useTimeout
                if (r12 == 0) goto Lb5
                com.unity3d.ads.core.domain.LegacyShowUseCase r12 = com.unity3d.ads.core.domain.LegacyShowUseCase.this
                com.unity3d.ads.core.domain.Show r12 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getShow$p(r12)
                com.unity3d.ads.core.data.model.AdObject r5 = r11.$adObject
                r11.L$0 = r1
                r11.label = r4
                java.lang.Object r12 = r12.terminate(r5, r11)
                if (r12 != r0) goto L8d
                goto Lb0
            L8d:
                tf.t r4 = r11.$reportShowError
                com.unity3d.ads.UnityAds$UnityAdsShowError r6 = com.unity3d.ads.UnityAds.UnityAdsShowError.TIMEOUT
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                java.lang.String r5 = "[UnityAds] Timeout while trying to show "
                r12.<init>(r5)
                java.lang.String r5 = r11.$placement
                r12.append(r5)
                java.lang.String r7 = r12.toString()
                r11.L$0 = r1
                r11.label = r3
                java.lang.String r5 = "timeout"
                r8 = 0
                r9 = 0
                r10 = r11
                java.lang.Object r12 = r4.invoke(r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto Lb1
            Lb0:
                return r0
            Lb1:
                r0 = r1
            Lb2:
                r0.invoke()
            Lb5:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull tf.a aVar, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass2) create(aVar, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LHf/m;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "", "it", "Lef/C;", "<anonymous>", "(LHf/m;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3", f = "LegacyShowUseCase.kt", l = {191}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3, reason: invalid class name */
    public static final class AnonymousClass3 extends AbstractC3471j implements q {
        final /* synthetic */ boolean $isBanner;
        final /* synthetic */ t $reportShowError;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(t tVar, boolean z2, InterfaceC3103c<? super AnonymousClass3> interfaceC3103c) {
            super(3, interfaceC3103c);
            this.$reportShowError = tVar;
            this.$isBanner = z2;
        }

        @Override // tf.q
        @Nullable
        public final Object invoke(@NotNull InterfaceC0603m interfaceC0603m, @NotNull Throwable th, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$reportShowError, this.$isBanner, interfaceC3103c);
            anonymousClass3.L$0 = th;
            return anonymousClass3.invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AnonymousClass3 anonymousClass3;
            kf.a aVar = kf.a.f39711a;
            int i5 = this.label;
            if (i5 == 0) {
                e.U(obj);
                Throwable th = (Throwable) this.L$0;
                t tVar = this.$reportShowError;
                UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null);
                this.label = 1;
                anonymousClass3 = this;
                if (tVar.invoke("uncaught_exception", unityAdsShowError, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, shortenedStackTrace$default, anonymousClass3) == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.U(obj);
                anonymousClass3 = this;
            }
            if (!anonymousClass3.$isBanner) {
                LegacyShowUseCase.isFullscreenAdShowing = false;
            }
            return C2515C.f34653a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showClicked$1, reason: invalid class name and case insensitive filesystem */
    public static final class C23111 extends AbstractC3343n implements tf.a {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23111(Listeners listeners, String str) {
            super(0);
            this.$listeners = listeners;
            this.$placement = str;
        }

        @Override // tf.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m272invoke();
            return C2515C.f34653a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m272invoke() {
            this.$listeners.onClick(this.$placement);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showCompleted$1, reason: invalid class name and case insensitive filesystem */
    public static final class C23121 extends AbstractC3343n implements tf.a {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;
        final /* synthetic */ ShowStatus $status;
        final /* synthetic */ LegacyShowUseCase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23121(Listeners listeners, String str, ShowStatus showStatus, LegacyShowUseCase legacyShowUseCase) {
            super(0);
            this.$listeners = listeners;
            this.$placement = str;
            this.$status = showStatus;
            this.this$0 = legacyShowUseCase;
        }

        @Override // tf.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m273invoke();
            return C2515C.f34653a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m273invoke() {
            Listeners listeners = this.$listeners;
            String str = this.$placement;
            ShowStatus showStatus = this.$status;
            NativeConfigurationOuterClass.ShowCompletionState defaultShowCompletionState = this.this$0.sessionRepository.getNativeConfiguration().getDefaultShowCompletionState();
            AbstractC3340k.d(defaultShowCompletionState, "sessionRepository.native…efaultShowCompletionState");
            listeners.onComplete(str, ShowStatusExtensionsKt.toUnityAdsShowCompletionState(showStatus, defaultShowCompletionState));
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "diagnosticReason", "Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "reason", PglCryptUtils.KEY_MESSAGE, "", "code", "debugMessage", "Lef/C;", "<anonymous>", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAds$UnityAdsShowError;Ljava/lang/String;ILjava/lang/String;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1", f = "LegacyShowUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1, reason: invalid class name and case insensitive filesystem */
    public static final class C23131 extends AbstractC3471j implements t {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $opportunityId;
        final /* synthetic */ String $placement;
        final /* synthetic */ UnityAdsShowOptions $showOptions;
        final /* synthetic */ f $startTime;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        /* synthetic */ Object L$3;
        /* synthetic */ Object L$4;
        int label;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01981 extends AbstractC3343n implements tf.a {
            final /* synthetic */ Listeners $listeners;
            final /* synthetic */ String $message;
            final /* synthetic */ String $placement;
            final /* synthetic */ UnityAds.UnityAdsShowError $reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01981(Listeners listeners, String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
                super(0);
                this.$listeners = listeners;
                this.$placement = str;
                this.$reason = unityAdsShowError;
                this.$message = str2;
            }

            @Override // tf.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m274invoke();
                return C2515C.f34653a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m274invoke() {
                this.$listeners.onError(this.$placement, this.$reason, this.$message);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23131(String str, f fVar, UnityAdsShowOptions unityAdsShowOptions, Listeners listeners, String str2, InterfaceC3103c<? super C23131> interfaceC3103c) {
            super(6, interfaceC3103c);
            this.$opportunityId = str;
            this.$startTime = fVar;
            this.$showOptions = unityAdsShowOptions;
            this.$listeners = listeners;
            this.$placement = str2;
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kf.a aVar = kf.a.f39711a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            String str = (String) this.L$0;
            UnityAds.UnityAdsShowError unityAdsShowError = (UnityAds.UnityAdsShowError) this.L$1;
            String str2 = (String) this.L$2;
            Integer num = (Integer) this.L$3;
            String str3 = (String) this.L$4;
            Logger.DefaultImpls.error$default(LegacyShowUseCase.this.logger, "Failed to show ad " + LegacyShowUseCase.this.getAdInfoString() + ", error: " + str2, null, 2, null);
            AdObject tmpAdObject = LegacyShowUseCase.this.adObject;
            if (tmpAdObject == null) {
                tmpAdObject = LegacyShowUseCase.this.getTmpAdObject(this.$opportunityId);
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(LegacyShowUseCase.this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME, new Double(TimeExtensionsKt.elapsedMillis(this.$startTime)), LegacyShowUseCase.this.getTags(str, num, str3, this.$showOptions), (Map) null, tmpAdObject, (Integer) null, 40, (Object) null);
            LegacyShowUseCase.this.safeCallbackInvoke.invoke(new C01981(this.$listeners, this.$placement, unityAdsShowError, str2));
            return C2515C.f34653a;
        }

        @Override // tf.t
        @Nullable
        public final Object invoke(@NotNull String str, @NotNull UnityAds.UnityAdsShowError unityAdsShowError, @NotNull String str2, @Nullable Integer num, @Nullable String str3, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            C23131 c23131 = LegacyShowUseCase.this.new C23131(this.$opportunityId, this.$startTime, this.$showOptions, this.$listeners, this.$placement, interfaceC3103c);
            c23131.L$0 = str;
            c23131.L$1 = unityAdsShowError;
            c23131.L$2 = str2;
            c23131.L$3 = num;
            c23131.L$4 = str3;
            return c23131.invokeSuspend(C2515C.f34653a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showReceivedReward$1, reason: invalid class name and case insensitive filesystem */
    public static final class C23141 extends AbstractC3343n implements tf.a {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23141(Listeners listeners, String str) {
            super(0);
            this.$listeners = listeners;
            this.$placement = str;
        }

        @Override // tf.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m275invoke();
            return C2515C.f34653a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m275invoke() {
            this.$listeners.onRewarded(this.$placement);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showStarted$1, reason: invalid class name and case insensitive filesystem */
    public static final class C23151 extends AbstractC3343n implements tf.a {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23151(Listeners listeners, String str) {
            super(0);
            this.$listeners = listeners;
            this.$placement = str;
        }

        @Override // tf.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m276invoke();
            return C2515C.f34653a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m276invoke() {
            this.$listeners.onStart(this.$placement);
        }
    }

    public LegacyShowUseCase(@NotNull Show show, @NotNull AdRepository adRepository, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull GetOperativeEventApi getOperativeEventApi, @NotNull GetInitializationState getInitializationState, @NotNull SessionRepository sessionRepository, @NotNull SafeCallbackInvoke safeCallbackInvoke, @NotNull Logger logger) {
        AbstractC3340k.e(show, "show");
        AbstractC3340k.e(adRepository, "adRepository");
        AbstractC3340k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        AbstractC3340k.e(getOperativeEventApi, "getOperativeEventApi");
        AbstractC3340k.e(getInitializationState, "getInitializationState");
        AbstractC3340k.e(sessionRepository, "sessionRepository");
        AbstractC3340k.e(safeCallbackInvoke, "safeCallbackInvoke");
        AbstractC3340k.e(logger, "logger");
        this.show = show;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getInitializationState = getInitializationState;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.logger = logger;
        Boolean bool = Boolean.FALSE;
        this.hasStarted = k0.c(bool);
        this.timeoutCancellationRequested = k0.c(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bannerLeftApplication(f startTime, String placement, Listeners listeners) {
        this.logger.info("Left app while showing ad " + getAdInfoString());
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), (Map) null, (Map) null, this.adObject, (Integer) null, 44, (Object) null);
        this.safeCallbackInvoke.invoke(new AnonymousClass1(listeners, placement));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTimeout(f startTime) {
        InterfaceC0592c0 interfaceC0592c0 = this.timeoutCancellationRequested;
        Boolean bool = Boolean.TRUE;
        x0 x0Var = (x0) interfaceC0592c0;
        x0Var.getClass();
        x0Var.k(null, bool);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_cancel_timeout", Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), (Map) null, (Map) null, this.adObject, (Integer) null, 44, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAdInfoString() {
        ByteString opportunityId;
        StringBuilder sb2 = new StringBuilder("for placement ");
        AdObject adObject = this.adObject;
        UUID uuid = null;
        sb2.append(adObject != null ? adObject.getPlacementId() : null);
        sb2.append(" with instance id ");
        AdObject adObject2 = this.adObject;
        if (adObject2 != null && (opportunityId = adObject2.getOpportunityId()) != null) {
            uuid = ProtobufExtensionsKt.toUUID(opportunityId);
        }
        sb2.append(uuid);
        return sb2.toString();
    }

    private final String getOpportunityId(UnityAdsShowOptions unityAdsShowOptions) throws IllegalArgumentException {
        Object objOpt;
        String string;
        JSONObject data = unityAdsShowOptions.getData();
        if (data == null || (objOpt = data.opt("objectId")) == null || (string = objOpt.toString()) == null) {
            return null;
        }
        return UUID.fromString(string).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getTags(String diagnosticReason, Integer code, String debugMessage, UnityAdsShowOptions showOptions) {
        LinkedHashMap linkedHashMapS = AbstractC2640A.S(new C2527k("operation", OperationType.SHOW.toString()), new C2527k("reason", diagnosticReason), new C2527k("new_api", String.valueOf((showOptions != null ? showOptions.showConfiguration : null) != null)));
        if (code != null) {
        }
        if (debugMessage != null) {
            linkedHashMapS.put("reason_debug", debugMessage);
        }
        return linkedHashMapS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getTmpAdObject(String opportunityId) {
        UUID uuidFromString = UUID.fromString(opportunityId);
        AbstractC3340k.d(uuidFromString, "fromString(opportunityId)");
        AdObject ad2 = this.adRepository.getAd(ProtobufExtensionsKt.toByteString(uuidFromString));
        if (ad2 != null) {
            return ad2;
        }
        SendDiagnosticEvent.Companion companion = SendDiagnosticEvent.INSTANCE;
        UUID uuidFromString2 = UUID.fromString(opportunityId);
        AbstractC3340k.d(uuidFromString2, "fromString(opportunityId)");
        ByteString byteString = ProtobufExtensionsKt.toByteString(uuidFromString2);
        String str = this.placement;
        if (str == null) {
            str = "";
        }
        return SendDiagnosticEvent.Companion.getTmpAdObjectForEventSending$default(companion, byteString, str, false, null, null, false, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendOperativeError(OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType, String str, AdObject adObject, InterfaceC3103c<? super C2515C> interfaceC3103c) {
        OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.INSTANCE;
        OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builderNewBuilder = OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
        AbstractC3340k.d(builderNewBuilder, "newBuilder()");
        OperativeEventErrorDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setErrorType(operativeEventErrorType);
        dsl_create.setMessage(str);
        OperativeEventRequestOuterClass.OperativeEventErrorData operativeEventErrorData_build = dsl_create._build();
        GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
        OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SHOW_ERROR;
        ByteString byteString = operativeEventErrorData_build.toByteString();
        AbstractC3340k.d(byteString, "errorData.toByteString()");
        Object objInvoke = getOperativeEventApi.invoke(operativeEventType, adObject, byteString, interfaceC3103c);
        return objInvoke == kf.a.f39711a ? objInvoke : C2515C.f34653a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showClicked(f startTime, String placement, Listeners listeners) {
        this.logger.info("Clicked on ad " + getAdInfoString());
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), (Map) null, (Map) null, this.adObject, (Integer) null, 44, (Object) null);
        this.safeCallbackInvoke.invoke(new C23111(listeners, placement));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCompleted(f startTime, String placement, ShowStatus status, Listeners listeners, String reason, String reasonDebug, UnityAdsShowOptions showOptions) {
        this.logger.info("Finished showing ad " + getAdInfoString());
        C2759f c2759f = new C2759f();
        if (reason != null) {
        }
        if (reasonDebug != null) {
        }
        String.valueOf((showOptions != null ? showOptions.showConfiguration : null) != null);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_SUCCESS_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), c2759f.c(), (Map) null, this.adObject, (Integer) null, 40, (Object) null);
        this.safeCallbackInvoke.invoke(new C23121(listeners, placement, status, this));
    }

    public static /* synthetic */ void showCompleted$default(LegacyShowUseCase legacyShowUseCase, f fVar, String str, ShowStatus showStatus, Listeners listeners, String str2, String str3, UnityAdsShowOptions unityAdsShowOptions, int i5, Object obj) {
        if ((i5 & 16) != 0) {
            str2 = null;
        }
        if ((i5 & 32) != 0) {
            str3 = null;
        }
        legacyShowUseCase.showCompleted(fVar, str, showStatus, listeners, str2, str3, unityAdsShowOptions);
    }

    private final t showError(f startTime, String placement, String opportunityId, Listeners listeners, UnityAdsShowOptions showOptions) {
        return new C23131(opportunityId, startTime, showOptions, listeners, placement, null);
    }

    private final void showStart(String opportunityId, UnityAdsShowOptions showOptions) {
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED, (Double) null, AbstractC2641B.E(new C2527k("new_api", String.valueOf((showOptions != null ? showOptions.showConfiguration : null) != null))), (Map) null, getTmpAdObject(opportunityId), (Integer) null, 42, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showStarted(f startTime, String placement, Listeners listeners) {
        this.logger.info("Started showing ad " + getAdInfoString());
        InterfaceC0592c0 interfaceC0592c0 = this.hasStarted;
        Boolean bool = Boolean.TRUE;
        x0 x0Var = (x0) interfaceC0592c0;
        x0Var.getClass();
        x0Var.k(null, bool);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), (Map) null, (Map) null, this.adObject, (Integer) null, 44, (Object) null);
        this.safeCallbackInvoke.invoke(new C23151(listeners, placement));
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0209, code lost:
    
        if (r2.invoke("ad_player_scope_not_active", r12, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_AD_PLAYER_UNAVAILABLE, null, null, r10) == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x022b, code lost:
    
        if (r2.invoke("already_showing", r12, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_ALREADY_SHOWING, null, null, r10) == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x025b, code lost:
    
        if (r2.invoke("placement_validation", r12, com.unity3d.ads.core.domain.LegacyShowUseCase.MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING, null, null, r10) == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011d, code lost:
    
        if (r2.invoke("not_initialized", r12, com.unity3d.ads.core.data.model.LoadResult.MSG_NOT_INITIALIZED, null, null, r10) == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0138, code lost:
    
        if (r2.invoke("placement_null", r12, com.unity3d.ads.core.data.model.LoadResult.MSG_PLACEMENT_NULL, null, null, r10) == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0162, code lost:
    
        if (r2.invoke("no_opportunity_id", r12, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_OPPORTUNITY_ID, null, r14, r10) == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0184, code lost:
    
        if (r2.invoke("placement_not_loaded", r12, r13, null, null, r10) == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b3, code lost:
    
        if (r2.invoke("ad_object_not_found", r12, r13, null, null, r10) == r2) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.String r27, @org.jetbrains.annotations.Nullable com.unity3d.ads.UnityAdsShowOptions r28, @org.jetbrains.annotations.NotNull com.unity3d.ads.core.data.model.Listeners r29, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super ef.C2515C> r30) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.invoke(java.lang.String, com.unity3d.ads.UnityAdsShowOptions, com.unity3d.ads.core.data.model.Listeners, jf.c):java.lang.Object");
    }

    public final void showReceivedReward(@NotNull f startTime, @NotNull String placement, @NotNull Listeners listeners) {
        AbstractC3340k.e(startTime, "startTime");
        AbstractC3340k.e(placement, "placement");
        AbstractC3340k.e(listeners, "listeners");
        this.logger.info("Rewarding ad " + getAdInfoString());
        InterfaceC0592c0 interfaceC0592c0 = this.hasStarted;
        Boolean bool = Boolean.TRUE;
        x0 x0Var = (x0) interfaceC0592c0;
        x0Var.getClass();
        x0Var.k(null, bool);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), (Map) null, (Map) null, this.adObject, (Integer) null, 44, (Object) null);
        this.safeCallbackInvoke.invoke(new C23141(listeners, placement));
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/unity3d/ads/core/data/model/ShowEvent;", "it", "Lef/C;", "emit", "(Lcom/unity3d/ads/core/data/model/ShowEvent;Ljf/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4, reason: invalid class name */
    public static final class AnonymousClass4<T> implements InterfaceC0603m {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;
        final /* synthetic */ t $reportShowError;
        final /* synthetic */ long $startTime;
        final /* synthetic */ UnityAdsShowOptions $unityAdsShowOptions;

        public AnonymousClass4(long j8, String str, Listeners listeners, UnityAdsShowOptions unityAdsShowOptions, AdObject adObject, t tVar) {
            this.$startTime = j8;
            this.$placement = str;
            this.$listeners = listeners;
            this.$unityAdsShowOptions = unityAdsShowOptions;
            this.$adObject = adObject;
            this.$reportShowError = tVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x0164, code lost:
        
            if (r4.invoke(r6, r6, r8, r8, r9, r10) != r3) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x01a8, code lost:
        
            if (r4.invoke("uncaught_exception", r6, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, r9, r10) != r3) goto L64;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /* JADX WARN: Type inference failed for: r4v0, types: [int] */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v9 */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(@org.jetbrains.annotations.NotNull com.unity3d.ads.core.data.model.ShowEvent r23, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super ef.C2515C> r24) {
            /*
                Method dump skipped, instructions count: 430
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass4.emit(com.unity3d.ads.core.data.model.ShowEvent, jf.c):java.lang.Object");
        }

        @Override // Hf.InterfaceC0603m
        public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC3103c interfaceC3103c) {
            return emit((ShowEvent) obj, (InterfaceC3103c<? super C2515C>) interfaceC3103c);
        }
    }
}
