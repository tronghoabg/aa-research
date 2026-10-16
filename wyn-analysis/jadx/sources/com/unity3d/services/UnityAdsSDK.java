package com.unity3d.services;

import Cf.g;
import Ef.C0505o0;
import Ef.E;
import Ef.H;
import Ef.H0;
import Ef.InterfaceC0501m0;
import Fe.c;
import Fe.e;
import R8.v;
import android.content.Context;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.InitializationConfiguration;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.ForceAlternativeFlow;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.InternalLoadListener;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import com.unity3d.ads.core.domain.ValidateExtrasSize;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.LogLevelKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.di.IServicesRegistry;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.task.InitializeSDK;
import ef.C2515C;
import ef.C2527k;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import ff.AbstractC2640A;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gf.C2759f;
import java.util.Map;
import jf.C3109i;
import jf.InterfaceC3103c;
import kf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.I;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0017\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001c\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0014\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u001e\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001e\u0010!J!\u0010\u001e\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u0014\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001e\u0010$J\u0015\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020\b¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u0004\u0018\u00010\b2\u0006\u0010+\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006S²\u0006\f\u00102\u001a\u0002018\nX\u008a\u0084\u0002²\u0006\f\u00104\u001a\u0002038\nX\u008a\u0084\u0002²\u0006\f\u00106\u001a\u0002058\nX\u008a\u0084\u0002²\u0006\f\u00108\u001a\u0002078\nX\u008a\u0084\u0002²\u0006\f\u0010:\u001a\u0002098\nX\u008a\u0084\u0002²\u0006\f\u0010<\u001a\u00020;8\nX\u008a\u0084\u0002²\u0006\f\u0010>\u001a\u00020=8\nX\u008a\u0084\u0002²\u0006\f\u0010@\u001a\u00020?8\nX\u008a\u0084\u0002²\u0006\f\u0010B\u001a\u00020A8\nX\u008a\u0084\u0002²\u0006\f\u0010D\u001a\u00020C8\nX\u008a\u0084\u0002²\u0006\f\u0010B\u001a\u00020A8\nX\u008a\u0084\u0002²\u0006\f\u0010F\u001a\u00020E8\nX\u008a\u0084\u0002²\u0006\f\u0010H\u001a\u00020G8\nX\u008a\u0084\u0002²\u0006\f\u0010F\u001a\u00020E8\nX\u008a\u0084\u0002²\u0006\f\u0010J\u001a\u00020I8\nX\u008a\u0084\u0002²\u0006\f\u0010L\u001a\u00020K8\nX\u008a\u0084\u0002²\u0006\f\u0010N\u001a\u00020M8\nX\u008a\u0084\u0002²\u0006\f\u0010:\u001a\u0002098\nX\u008a\u0084\u0002²\u0006\f\u0010<\u001a\u00020;8\nX\u008a\u0084\u0002²\u0006\f\u0010P\u001a\u00020O8\nX\u008a\u0084\u0002²\u0006\f\u0010R\u001a\u00020Q8\nX\u008a\u0084\u0002²\u0006\f\u0010<\u001a\u00020;8\nX\u008a\u0084\u0002²\u0006\f\u0010N\u001a\u00020M8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/unity3d/services/UnityAdsSDK;", "Lcom/unity3d/services/core/di/IServiceComponent;", "Lcom/unity3d/services/core/di/IServiceProvider;", "serviceProvider", "<init>", "(Lcom/unity3d/services/core/di/IServiceProvider;)V", "getServiceProvider", "()Lcom/unity3d/services/core/di/IServiceProvider;", "", AndroidGetAdPlayerContext.KEY_GAME_ID, "source", "Lcom/unity3d/ads/InitializationConfiguration;", "initializationConfiguration", "LEf/m0;", MobileAdsBridgeBase.initializeMethodName, "(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/InitializationConfiguration;)LEf/m0;", HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID, "Lcom/unity3d/ads/UnityAdsLoadOptions;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/core/domain/InternalLoadListener;", "listener", "Lcom/unity3d/services/banners/UnityBannerSize;", "bannerSize", "load", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;Lcom/unity3d/ads/core/domain/InternalLoadListener;Lcom/unity3d/services/banners/UnityBannerSize;)LEf/m0;", "Lcom/unity3d/ads/UnityAdsShowOptions;", "showOptions", "Lcom/unity3d/ads/core/data/model/Listeners;", "show", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;Lcom/unity3d/ads/core/data/model/Listeners;)LEf/m0;", "getToken", "()Ljava/lang/String;", "Lcom/unity3d/ads/IUnityAdsTokenListener;", "(Lcom/unity3d/ads/IUnityAdsTokenListener;)LEf/m0;", "Lcom/unity3d/ads/TokenConfiguration;", "tokenConfiguration", "(Lcom/unity3d/ads/TokenConfiguration;Lcom/unity3d/ads/IUnityAdsTokenListener;)LEf/m0;", "opportunityId", "finishOMIDSession", "(Ljava/lang/String;)LEf/m0;", "Lef/C;", "sendBannerDestroyed", "()V", "sync", "fetchToken", "(Ljava/lang/String;Ljf/c;)Ljava/lang/Object;", "Lcom/unity3d/services/core/di/IServiceProvider;", "initializationJob", "LEf/m0;", "Lcom/unity3d/ads/core/domain/ShouldAllowInitialization;", "shouldAllowInitialization", "Lcom/unity3d/ads/core/configuration/ForceAlternativeFlow;", "forceAlternativeFlow", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/domain/ValidateExtrasSize;", "validateExtrasSize", "Lcom/unity3d/ads/core/log/Logger;", "logger", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "alternativeFlowReader", "Lcom/unity3d/services/core/domain/task/InitializeSDK;", "initializeSDK", "Lcom/unity3d/ads/core/domain/InitializeBoldSDK;", "initializeBoldSDK", "Lcom/unity3d/ads/core/domain/GetGameId;", "getGameId", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/core/domain/TokenNumberProvider;", "tokenNumberProvider", "Lcom/unity3d/ads/core/domain/GetAsyncHeaderBiddingToken;", "getAsyncHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "getHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "getInitializationState", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/GetAdObject;", "getAdObject", "Lcom/unity3d/ads/core/domain/om/OmFinishSession;", "omFinishSession", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UnityAdsSDK implements IServiceComponent {

    @Nullable
    private InterfaceC0501m0 initializationJob;

    @NotNull
    private final IServiceProvider serviceProvider;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.services.UnityAdsSDK$finishOMIDSession$2", f = "UnityAdsSDK.kt", l = {266}, m = "invokeSuspend")
    /* renamed from: com.unity3d.services.UnityAdsSDK$finishOMIDSession$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3471j implements p {
        final /* synthetic */ InterfaceC2525i $getAdObject$delegate;
        final /* synthetic */ InterfaceC2525i $omFinishSession$delegate;
        final /* synthetic */ E $omidScope;
        final /* synthetic */ String $opportunityId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, E e7, InterfaceC2525i interfaceC2525i, InterfaceC2525i interfaceC2525i2, InterfaceC3103c<? super AnonymousClass2> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$opportunityId = str;
            this.$omidScope = e7;
            this.$getAdObject$delegate = interfaceC2525i;
            this.$omFinishSession$delegate = interfaceC2525i2;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return new AnonymousClass2(this.$opportunityId, this.$omidScope, this.$getAdObject$delegate, this.$omFinishSession$delegate, interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass2) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.f39711a;
            int i5 = this.label;
            if (i5 == 0) {
                e.U(obj);
                AdObject adObjectInvoke = UnityAdsSDK.finishOMIDSession$lambda$26(this.$getAdObject$delegate).invoke(this.$opportunityId);
                if (adObjectInvoke != null) {
                    OmFinishSession omFinishSessionFinishOMIDSession$lambda$27 = UnityAdsSDK.finishOMIDSession$lambda$27(this.$omFinishSession$delegate);
                    this.label = 1;
                    if (omFinishSessionFinishOMIDSession$lambda$27.invoke(adObjectInvoke, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.U(obj);
            }
            H.j(this.$omidScope, null);
            return C2515C.f34653a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "", "<anonymous>", "(LEf/E;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.services.UnityAdsSDK$getToken$1", f = "UnityAdsSDK.kt", l = {184}, m = "invokeSuspend")
    /* renamed from: com.unity3d.services.UnityAdsSDK$getToken$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3471j implements p {
        int label;

        public AnonymousClass1(InterfaceC3103c<? super AnonymousClass1> interfaceC3103c) {
            super(2, interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return UnityAdsSDK.this.new AnonymousClass1(interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super String> interfaceC3103c) {
            return ((AnonymousClass1) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
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
            UnityAdsSDK unityAdsSDK = UnityAdsSDK.this;
            this.label = 1;
            Object objFetchToken = unityAdsSDK.fetchToken("true", this);
            return objFetchToken == aVar ? aVar : objFetchToken;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.services.UnityAdsSDK$getToken$2", f = "UnityAdsSDK.kt", l = {200}, m = "invokeSuspend")
    /* renamed from: com.unity3d.services.UnityAdsSDK$getToken$2, reason: invalid class name and case insensitive filesystem */
    public static final class C23682 extends AbstractC3471j implements p {
        final /* synthetic */ InterfaceC2525i $getAsyncHeaderBiddingToken$delegate;
        final /* synthetic */ E $getTokenScope;
        final /* synthetic */ IUnityAdsTokenListener $listener;
        final /* synthetic */ TokenConfiguration $tokenConfiguration;
        final /* synthetic */ InterfaceC2525i $tokenNumberProvider$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23682(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener, E e7, InterfaceC2525i interfaceC2525i, InterfaceC2525i interfaceC2525i2, InterfaceC3103c<? super C23682> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$tokenConfiguration = tokenConfiguration;
            this.$listener = iUnityAdsTokenListener;
            this.$getTokenScope = e7;
            this.$getAsyncHeaderBiddingToken$delegate = interfaceC2525i;
            this.$tokenNumberProvider$delegate = interfaceC2525i2;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return new C23682(this.$tokenConfiguration, this.$listener, this.$getTokenScope, this.$getAsyncHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((C23682) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.f39711a;
            int i5 = this.label;
            if (i5 == 0) {
                e.U(obj);
                GetAsyncHeaderBiddingToken token$lambda$15 = UnityAdsSDK.getToken$lambda$15(this.$getAsyncHeaderBiddingToken$delegate);
                int iInvoke = UnityAdsSDK.getToken$lambda$14(this.$tokenNumberProvider$delegate).invoke();
                TokenConfiguration tokenConfiguration = this.$tokenConfiguration;
                IUnityAdsTokenListener iUnityAdsTokenListener = this.$listener;
                this.label = 1;
                if (token$lambda$15.invoke(iInvoke, tokenConfiguration, iUnityAdsTokenListener, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.U(obj);
            }
            H.j(this.$getTokenScope, null);
            return C2515C.f34653a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.services.UnityAdsSDK$load$1", f = "UnityAdsSDK.kt", l = {164}, m = "invokeSuspend")
    /* renamed from: com.unity3d.services.UnityAdsSDK$load$1, reason: invalid class name and case insensitive filesystem */
    public static final class C23691 extends AbstractC3471j implements p {
        final /* synthetic */ UnityBannerSize $bannerSize;
        final /* synthetic */ InterfaceC2525i $context$delegate;
        final /* synthetic */ InternalLoadListener $listener;
        final /* synthetic */ UnityAdsLoadOptions $loadOptions;
        final /* synthetic */ E $loadScope;
        final /* synthetic */ String $placementId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23691(String str, UnityAdsLoadOptions unityAdsLoadOptions, InternalLoadListener internalLoadListener, UnityBannerSize unityBannerSize, E e7, InterfaceC2525i interfaceC2525i, InterfaceC3103c<? super C23691> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$placementId = str;
            this.$loadOptions = unityAdsLoadOptions;
            this.$listener = internalLoadListener;
            this.$bannerSize = unityBannerSize;
            this.$loadScope = e7;
            this.$context$delegate = interfaceC2525i;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return UnityAdsSDK.this.new C23691(this.$placementId, this.$loadOptions, this.$listener, this.$bannerSize, this.$loadScope, this.$context$delegate, interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((C23691) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C23691 c23691;
            a aVar = a.f39711a;
            int i5 = this.label;
            if (i5 == 0) {
                e.U(obj);
                LegacyLoadUseCase legacyLoadUseCase = (LegacyLoadUseCase) UnityAdsSDK.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(LegacyLoadUseCase.class));
                Context contextLoad$lambda$12 = UnityAdsSDK.load$lambda$12(this.$context$delegate);
                String str = this.$placementId;
                UnityAdsLoadOptions unityAdsLoadOptions = this.$loadOptions;
                InternalLoadListener internalLoadListener = this.$listener;
                UnityBannerSize unityBannerSize = this.$bannerSize;
                this.label = 1;
                c23691 = this;
                if (legacyLoadUseCase.invoke(contextLoad$lambda$12, str, unityAdsLoadOptions, internalLoadListener, unityBannerSize, c23691) == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.U(obj);
                c23691 = this;
            }
            H.j(c23691.$loadScope, null);
            return C2515C.f34653a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.services.UnityAdsSDK$show$1", f = "UnityAdsSDK.kt", l = {174}, m = "invokeSuspend")
    /* renamed from: com.unity3d.services.UnityAdsSDK$show$1, reason: invalid class name and case insensitive filesystem */
    public static final class C23701 extends AbstractC3471j implements p {
        final /* synthetic */ Listeners $listener;
        final /* synthetic */ String $placementId;
        final /* synthetic */ LegacyShowUseCase $showBoldSDK;
        final /* synthetic */ UnityAdsShowOptions $showOptions;
        final /* synthetic */ E $showScope;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23701(LegacyShowUseCase legacyShowUseCase, String str, UnityAdsShowOptions unityAdsShowOptions, Listeners listeners, E e7, InterfaceC3103c<? super C23701> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$showBoldSDK = legacyShowUseCase;
            this.$placementId = str;
            this.$showOptions = unityAdsShowOptions;
            this.$listener = listeners;
            this.$showScope = e7;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return new C23701(this.$showBoldSDK, this.$placementId, this.$showOptions, this.$listener, this.$showScope, interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((C23701) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.f39711a;
            int i5 = this.label;
            if (i5 == 0) {
                e.U(obj);
                LegacyShowUseCase legacyShowUseCase = this.$showBoldSDK;
                String str = this.$placementId;
                UnityAdsShowOptions unityAdsShowOptions = this.$showOptions;
                Listeners listeners = this.$listener;
                this.label = 1;
                if (legacyShowUseCase.invoke(str, unityAdsShowOptions, listeners, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.U(obj);
            }
            H.j(this.$showScope, null);
            return C2515C.f34653a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnityAdsSDK() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchToken(String str, InterfaceC3103c<? super String> interfaceC3103c) {
        String str2;
        String str3;
        String str4;
        EnumC2526j enumC2526j = EnumC2526j.f34669c;
        InterfaceC2525i interfaceC2525iY = c.y(enumC2526j, new UnityAdsSDK$fetchToken$$inlined$inject$default$1(this, ""));
        InterfaceC2525i interfaceC2525iY2 = c.y(enumC2526j, new UnityAdsSDK$fetchToken$$inlined$inject$default$2(this, ""));
        InterfaceC2525i interfaceC2525iY3 = c.y(enumC2526j, new UnityAdsSDK$fetchToken$$inlined$inject$default$3(this, ""));
        InterfaceC2525i interfaceC2525iY4 = c.y(enumC2526j, new UnityAdsSDK$fetchToken$$inlined$inject$default$4(this, ""));
        InterfaceC2525i interfaceC2525iY5 = c.y(enumC2526j, new UnityAdsSDK$fetchToken$$inlined$inject$default$5(this, ""));
        long jB = Cf.e.b();
        SendDiagnosticEvent.DefaultImpls.invoke$default(fetchToken$lambda$19(interfaceC2525iY4), DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_STARTED, (Double) null, AbstractC2640A.R(new C2527k("sync", str), new C2527k("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$18(interfaceC2525iY3), false, 1, null).toString())), (Map) null, (AdObject) null, (Integer) null, 58, (Object) null);
        if (GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$18(interfaceC2525iY3), false, 1, null) != InitializationState.INITIALIZED) {
            str2 = "not_initialized";
            str3 = null;
            str4 = null;
        } else {
            try {
                str4 = (String) H.I(C3109i.f38759a, new UnityAdsSDK$fetchToken$token$1(interfaceC2525iY2, interfaceC2525iY, null));
                str2 = null;
                str3 = null;
            } catch (Exception e7) {
                String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(e7, 0, 1, null);
                str2 = "uncaught_exception";
                str3 = shortenedStackTrace$default;
                str4 = null;
            }
        }
        SendDiagnosticEvent sendDiagnosticEventFetchToken$lambda$19 = fetchToken$lambda$19(interfaceC2525iY4);
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = str4 == null ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_FAILURE_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_SUCCESS_TIME;
        Double d3 = new Double(TimeExtensionsKt.elapsedMillis(new g(jB)));
        C2759f c2759f = new C2759f();
        c2759f.put("sync", str);
        c2759f.put("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$18(interfaceC2525iY3), false, 1, null).toString());
        if (str2 != null) {
        }
        if (str3 != null) {
            c2759f.put("reason_debug", str3);
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEventFetchToken$lambda$19, diagnosticEventType, d3, c2759f.c(), (Map) null, (AdObject) null, new Integer(fetchToken$lambda$16(interfaceC2525iY).invoke()), 24, (Object) null);
        if (str4 == null) {
            Logger.DefaultImpls.error$default(fetchToken$lambda$20(interfaceC2525iY5), v.f("Returned nil token due to: ", str2), null, 2, null);
        } else {
            fetchToken$lambda$20(interfaceC2525iY5).info("Generated a valid token.");
        }
        return str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TokenNumberProvider fetchToken$lambda$16(InterfaceC2525i interfaceC2525i) {
        return (TokenNumberProvider) interfaceC2525i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetHeaderBiddingToken fetchToken$lambda$17(InterfaceC2525i interfaceC2525i) {
        return (GetHeaderBiddingToken) interfaceC2525i.getValue();
    }

    private static final GetInitializationState fetchToken$lambda$18(InterfaceC2525i interfaceC2525i) {
        return (GetInitializationState) interfaceC2525i.getValue();
    }

    private static final SendDiagnosticEvent fetchToken$lambda$19(InterfaceC2525i interfaceC2525i) {
        return (SendDiagnosticEvent) interfaceC2525i.getValue();
    }

    private static final Logger fetchToken$lambda$20(InterfaceC2525i interfaceC2525i) {
        return (Logger) interfaceC2525i.getValue();
    }

    private static final AlternativeFlowReader finishOMIDSession$lambda$24(InterfaceC2525i interfaceC2525i) {
        return (AlternativeFlowReader) interfaceC2525i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAdObject finishOMIDSession$lambda$26(InterfaceC2525i interfaceC2525i) {
        return (GetAdObject) interfaceC2525i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OmFinishSession finishOMIDSession$lambda$27(InterfaceC2525i interfaceC2525i) {
        return (OmFinishSession) interfaceC2525i.getValue();
    }

    private static final GetGameId getToken$lambda$13(InterfaceC2525i interfaceC2525i) {
        return (GetGameId) interfaceC2525i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TokenNumberProvider getToken$lambda$14(InterfaceC2525i interfaceC2525i) {
        return (TokenNumberProvider) interfaceC2525i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAsyncHeaderBiddingToken getToken$lambda$15(InterfaceC2525i interfaceC2525i) {
        return (GetAsyncHeaderBiddingToken) interfaceC2525i.getValue();
    }

    public static /* synthetic */ InterfaceC0501m0 initialize$default(UnityAdsSDK unityAdsSDK, String str, String str2, InitializationConfiguration initializationConfiguration, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str2 = "api";
        }
        if ((i5 & 4) != 0) {
            initializationConfiguration = null;
        }
        return unityAdsSDK.initialize(str, str2, initializationConfiguration);
    }

    private static final ShouldAllowInitialization initialize$lambda$10$lambda$0(InterfaceC2525i interfaceC2525i) {
        return (ShouldAllowInitialization) interfaceC2525i.getValue();
    }

    private static final ForceAlternativeFlow initialize$lambda$10$lambda$2$lambda$1(InterfaceC2525i interfaceC2525i) {
        return (ForceAlternativeFlow) interfaceC2525i.getValue();
    }

    private static final SessionRepository initialize$lambda$10$lambda$6$lambda$3(InterfaceC2525i interfaceC2525i) {
        return (SessionRepository) interfaceC2525i.getValue();
    }

    private static final ValidateExtrasSize initialize$lambda$10$lambda$6$lambda$4(InterfaceC2525i interfaceC2525i) {
        return (ValidateExtrasSize) interfaceC2525i.getValue();
    }

    private static final Logger initialize$lambda$10$lambda$6$lambda$5(InterfaceC2525i interfaceC2525i) {
        return (Logger) interfaceC2525i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlternativeFlowReader initialize$lambda$10$lambda$7(InterfaceC2525i interfaceC2525i) {
        return (AlternativeFlowReader) interfaceC2525i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializeSDK initialize$lambda$10$lambda$8(InterfaceC2525i interfaceC2525i) {
        return (InitializeSDK) interfaceC2525i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializeBoldSDK initialize$lambda$10$lambda$9(InterfaceC2525i interfaceC2525i) {
        return (InitializeBoldSDK) interfaceC2525i.getValue();
    }

    public static /* synthetic */ InterfaceC0501m0 load$default(UnityAdsSDK unityAdsSDK, String str, UnityAdsLoadOptions unityAdsLoadOptions, InternalLoadListener internalLoadListener, UnityBannerSize unityBannerSize, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            unityBannerSize = null;
        }
        return unityAdsSDK.load(str, unityAdsLoadOptions, internalLoadListener, unityBannerSize);
    }

    private static final GetGameId load$lambda$11(InterfaceC2525i interfaceC2525i) {
        return (GetGameId) interfaceC2525i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context load$lambda$12(InterfaceC2525i interfaceC2525i) {
        return (Context) interfaceC2525i.getValue();
    }

    private static final AlternativeFlowReader sendBannerDestroyed$lambda$28(InterfaceC2525i interfaceC2525i) {
        return (AlternativeFlowReader) interfaceC2525i.getValue();
    }

    private static final SendDiagnosticEvent sendBannerDestroyed$lambda$29(InterfaceC2525i interfaceC2525i) {
        return (SendDiagnosticEvent) interfaceC2525i.getValue();
    }

    @NotNull
    public final InterfaceC0501m0 finishOMIDSession(@NotNull String opportunityId) {
        AbstractC3340k.e(opportunityId, "opportunityId");
        EnumC2526j enumC2526j = EnumC2526j.f34669c;
        if (!finishOMIDSession$lambda$24(c.y(enumC2526j, new UnityAdsSDK$finishOMIDSession$$inlined$inject$default$1(this, ""))).invoke()) {
            C0505o0 c0505o0D = H.d();
            c0505o0D.Y();
            return c0505o0D;
        }
        InterfaceC2525i interfaceC2525iY = c.y(enumC2526j, new UnityAdsSDK$finishOMIDSession$$inlined$inject$default$2(this, ""));
        InterfaceC2525i interfaceC2525iY2 = c.y(enumC2526j, new UnityAdsSDK$finishOMIDSession$$inlined$inject$default$3(this, ""));
        E e7 = (E) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_OMID_SCOPE, kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(E.class));
        return H.D(e7, null, new AnonymousClass2(opportunityId, e7, interfaceC2525iY, interfaceC2525iY2, null), 3);
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    @NotNull
    public IServiceProvider getServiceProvider() {
        return this.serviceProvider;
    }

    @Nullable
    public final String getToken() {
        return (String) H.I(C3109i.f38759a, new AnonymousClass1(null));
    }

    @NotNull
    public final InterfaceC0501m0 initialize(@Nullable String gameId, @NotNull String source, @Nullable InitializationConfiguration initializationConfiguration) {
        AbstractC3340k.e(source, "source");
        synchronized (this) {
            InterfaceC0501m0 interfaceC0501m0 = this.initializationJob;
            if (interfaceC0501m0 != null && interfaceC0501m0.isActive()) {
                return interfaceC0501m0;
            }
            EnumC2526j enumC2526j = EnumC2526j.f34669c;
            InterfaceC2525i interfaceC2525iY = c.y(enumC2526j, new UnityAdsSDK$initialize$lambda$10$$inlined$inject$default$1(this, ""));
            if (initializationConfiguration != null) {
                initialize$lambda$10$lambda$2$lambda$1(c.y(enumC2526j, new UnityAdsSDK$initialize$lambda$10$lambda$2$$inlined$inject$default$1(this, ""))).invoke(true);
            }
            if (!initialize$lambda$10$lambda$0(interfaceC2525iY).invoke(gameId)) {
                return H.d();
            }
            if (initializationConfiguration != null) {
                InterfaceC2525i interfaceC2525iY2 = c.y(enumC2526j, new UnityAdsSDK$initialize$lambda$10$lambda$6$$inlined$inject$default$1(this, ""));
                ValidateExtrasSize.invoke$default(initialize$lambda$10$lambda$6$lambda$4(c.y(enumC2526j, new UnityAdsSDK$initialize$lambda$10$lambda$6$$inlined$inject$default$2(this, ""))), initializationConfiguration.getExtras(), "init", null, 4, null);
                initialize$lambda$10$lambda$6$lambda$3(interfaceC2525iY2).setInitializationConfiguration(new InitializationConfigurationInternal(initializationConfiguration.getGameId(), initializationConfiguration.getIsTestModeEnabled(), initializationConfiguration.getLogLevel(), initializationConfiguration.getExtras(), initializationConfiguration.getMediationInfo()));
                initialize$lambda$10$lambda$6$lambda$5(c.y(enumC2526j, new UnityAdsSDK$initialize$lambda$10$lambda$6$$inlined$inject$default$3(this, ""))).setLogLevel(LogLevelKt.toLogLevelInternal(initializationConfiguration.getLogLevel()));
            }
            InterfaceC2525i interfaceC2525iY3 = c.y(enumC2526j, new UnityAdsSDK$initialize$lambda$10$$inlined$inject$default$2(this, ""));
            InterfaceC2525i interfaceC2525iY4 = c.y(enumC2526j, new UnityAdsSDK$initialize$lambda$10$$inlined$inject$default$3(this, ""));
            InterfaceC2525i interfaceC2525iY5 = c.y(enumC2526j, new UnityAdsSDK$initialize$lambda$10$$inlined$inject$default$4(this, ""));
            E e7 = (E) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_INIT_SCOPE, kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(E.class));
            H0 h0D = H.D(e7, null, new UnityAdsSDK$initialize$1$newInitializationJob$1(source, gameId, e7, interfaceC2525iY3, interfaceC2525iY5, interfaceC2525iY4, null), 3);
            this.initializationJob = h0D;
            return h0D;
        }
    }

    @NotNull
    public final InterfaceC0501m0 load(@Nullable String placementId, @NotNull UnityAdsLoadOptions loadOptions, @Nullable InternalLoadListener listener, @Nullable UnityBannerSize bannerSize) {
        AbstractC3340k.e(loadOptions, "loadOptions");
        EnumC2526j enumC2526j = EnumC2526j.f34669c;
        initialize$default(this, load$lambda$11(c.y(enumC2526j, new UnityAdsSDK$load$$inlined$inject$default$1(this, ""))).invoke(), "load", null, 4, null);
        E e7 = (E) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_LOAD_SCOPE, kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(E.class));
        return H.D(e7, null, new C23691(placementId, loadOptions, listener, bannerSize, e7, c.y(enumC2526j, new UnityAdsSDK$load$$inlined$inject$default$2(this, "")), null), 3);
    }

    public final void sendBannerDestroyed() {
        EnumC2526j enumC2526j = EnumC2526j.f34669c;
        if (sendBannerDestroyed$lambda$28(c.y(enumC2526j, new UnityAdsSDK$sendBannerDestroyed$$inlined$inject$default$1(this, ""))).invoke()) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendBannerDestroyed$lambda$29(c.y(enumC2526j, new UnityAdsSDK$sendBannerDestroyed$$inlined$inject$default$2(this, ""))), "native_banner_destroyed", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, 62, (Object) null);
        }
    }

    @NotNull
    public final InterfaceC0501m0 show(@Nullable String placementId, @Nullable UnityAdsShowOptions showOptions, @NotNull Listeners listener) {
        AbstractC3340k.e(listener, "listener");
        IServicesRegistry registry = getServiceProvider().getRegistry();
        I i5 = kotlin.jvm.internal.H.f39741a;
        E e7 = (E) registry.getService(ServiceProvider.NAMED_SHOW_SCOPE, i5.getOrCreateKotlinClass(E.class));
        return H.D(e7, null, new C23701((LegacyShowUseCase) getServiceProvider().getRegistry().getService("", i5.getOrCreateKotlinClass(LegacyShowUseCase.class)), placementId, showOptions, listener, e7, null), 3);
    }

    public UnityAdsSDK(@NotNull IServiceProvider serviceProvider) {
        AbstractC3340k.e(serviceProvider, "serviceProvider");
        this.serviceProvider = serviceProvider;
    }

    public /* synthetic */ UnityAdsSDK(IServiceProvider iServiceProvider, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? ServiceProvider.INSTANCE : iServiceProvider);
    }

    @NotNull
    public final InterfaceC0501m0 getToken(@Nullable IUnityAdsTokenListener listener) {
        return getToken(null, listener);
    }

    @NotNull
    public final InterfaceC0501m0 getToken(@Nullable TokenConfiguration tokenConfiguration, @Nullable IUnityAdsTokenListener listener) {
        EnumC2526j enumC2526j = EnumC2526j.f34669c;
        initialize$default(this, getToken$lambda$13(c.y(enumC2526j, new UnityAdsSDK$getToken$$inlined$inject$default$1(this, ""))).invoke(), "get_token", null, 4, null);
        InterfaceC2525i interfaceC2525iY = c.y(enumC2526j, new UnityAdsSDK$getToken$$inlined$inject$default$2(this, ""));
        InterfaceC2525i interfaceC2525iY2 = c.y(enumC2526j, new UnityAdsSDK$getToken$$inlined$inject$default$3(this, ""));
        E e7 = (E) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_GET_TOKEN_SCOPE, kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(E.class));
        return H.D(e7, null, new C23682(tokenConfiguration, listener, e7, interfaceC2525iY2, interfaceC2525iY, null), 3);
    }
}
