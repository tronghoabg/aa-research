package com.unity3d.ads;

import E5.Q;
import Ef.E;
import Ef.H;
import Fe.e;
import android.app.Activity;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.ShowConfigurationInternal;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.di.ServiceKey;
import com.unity3d.services.core.di.ServiceProvider;
import ef.C2515C;
import ff.w;
import gatewayprotocol.v1.ErrorOuterClass;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import tf.p;

@UnityAdsExperimental
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/unity3d/ads/InterstitialAd;", "", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "safeCallbackInvoke", "<init>", "(Lcom/unity3d/ads/core/data/model/AdObject;Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;)V", "Landroid/app/Activity;", "activity", "Lcom/unity3d/ads/ShowConfiguration;", "configuration", "Lcom/unity3d/ads/InterstitialShowListener;", "listener", "Lef/C;", "show", "(Landroid/app/Activity;Lcom/unity3d/ads/ShowConfiguration;Lcom/unity3d/ads/InterstitialShowListener;)V", "Lcom/unity3d/ads/core/data/model/AdObject;", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "Lcom/unity3d/ads/AdExpiredListener;", "onAdExpired", "Lcom/unity3d/ads/AdExpiredListener;", "getOnAdExpired", "()Lcom/unity3d/ads/AdExpiredListener;", "setOnAdExpired", "(Lcom/unity3d/ads/AdExpiredListener;)V", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InterstitialAd {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AdObject adObject;

    @Nullable
    private AdExpiredListener<InterstitialAd> onAdExpired;

    @NotNull
    private final SafeCallbackInvoke safeCallbackInvoke;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/InterstitialAd$Companion;", "", "<init>", "()V", "Lcom/unity3d/ads/LoadConfiguration;", "configuration", "Lcom/unity3d/ads/LoadListener;", "Lcom/unity3d/ads/InterstitialAd;", "listener", "Lef/C;", "load", "(Lcom/unity3d/ads/LoadConfiguration;Lcom/unity3d/ads/LoadListener;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void load(@NotNull LoadConfiguration configuration, @NotNull LoadListener<InterstitialAd> listener) {
            AbstractC3340k.e(configuration, "configuration");
            AbstractC3340k.e(listener, "listener");
            H.D((E) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(E.class))), null, new InterstitialAd$Companion$load$1(configuration, listener, null), 3);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.InterstitialAd$show$1", f = "InterstitialAd.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.InterstitialAd$show$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3471j implements p {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ ShowConfiguration $configuration;
        final /* synthetic */ InterstitialShowListener $listener;
        int label;
        final /* synthetic */ InterstitialAd this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShowConfiguration showConfiguration, InterstitialAd interstitialAd, Activity activity, InterstitialShowListener interstitialShowListener, InterfaceC3103c<? super AnonymousClass1> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$configuration = showConfiguration;
            this.this$0 = interstitialAd;
            this.$activity = activity;
            this.$listener = interstitialShowListener;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return new AnonymousClass1(this.$configuration, this.this$0, this.$activity, this.$listener, interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass1) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws JSONException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Map<String, String> extras;
            Map<String, String> extras2;
            kf.a aVar = kf.a.f39711a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            ShowConfiguration showConfiguration = this.$configuration;
            IServiceProvider iServiceProvider = null;
            Object[] objArr = 0;
            String customRewardString = showConfiguration != null ? showConfiguration.getCustomRewardString() : null;
            ShowConfiguration showConfiguration2 = this.$configuration;
            if (showConfiguration2 == null || (extras = showConfiguration2.getExtras()) == null) {
                extras = w.f35433a;
            }
            ShowConfigurationInternal showConfigurationInternal = new ShowConfigurationInternal(customRewardString, extras);
            UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
            unityAdsShowOptions.setObjectId(ProtobufExtensionsKt.toUUID(this.this$0.adObject.getOpportunityId()).toString());
            unityAdsShowOptions.showConfiguration = showConfigurationInternal;
            MetaData metaData = new MetaData(this.$activity);
            ShowConfiguration showConfiguration3 = this.$configuration;
            if (showConfiguration3 != null && (extras2 = showConfiguration3.getExtras()) != null) {
                for (Map.Entry<String, String> entry : extras2.entrySet()) {
                    metaData.set(entry.getKey(), entry.getValue());
                }
            }
            metaData.commit();
            this.this$0.adObject.setShowConfiguration(this.$configuration);
            AdObject adObject = this.this$0.adObject;
            ShowConfiguration showConfiguration4 = this.$configuration;
            adObject.setPlayerServerId(showConfiguration4 != null ? showConfiguration4.getCustomRewardString() : null);
            this.this$0.adObject.setActivity(new WeakReference<>(this.$activity));
            UnityAdsSDK unityAdsSDK = new UnityAdsSDK(iServiceProvider, 1, objArr == true ? 1 : 0);
            String placementId = this.this$0.adObject.getPlacementId();
            final InterstitialShowListener interstitialShowListener = this.$listener;
            final InterstitialAd interstitialAd = this.this$0;
            unityAdsSDK.show(placementId, unityAdsShowOptions, new Listeners() { // from class: com.unity3d.ads.InterstitialAd.show.1.2

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.InterstitialAd$show$1$2$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

                    static {
                        int[] iArr = new int[UnityAds.UnityAdsShowError.values().length];
                        try {
                            iArr[UnityAds.UnityAdsShowError.TIMEOUT.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[UnityAds.UnityAdsShowError.EXPIRED.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[UnityAds.UnityAdsShowError.ALREADY_SHOWING.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                        int[] iArr2 = new int[UnityAds.UnityAdsShowCompletionState.values().length];
                        try {
                            iArr2[UnityAds.UnityAdsShowCompletionState.COMPLETED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr2[UnityAds.UnityAdsShowCompletionState.SKIPPED.ordinal()] = 2;
                        } catch (NoSuchFieldError unused5) {
                        }
                        $EnumSwitchMapping$1 = iArr2;
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onClick(@NotNull String placementId2) {
                    AbstractC3340k.e(placementId2, "placementId");
                    InterstitialShowListener interstitialShowListener2 = interstitialShowListener;
                    if (interstitialShowListener2 != null) {
                        interstitialShowListener2.onClicked(interstitialAd);
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onComplete(@NotNull String placementId2, @NotNull UnityAds.UnityAdsShowCompletionState state) {
                    ShowFinishState showFinishState;
                    AbstractC3340k.e(placementId2, "placementId");
                    AbstractC3340k.e(state, "state");
                    InterstitialShowListener interstitialShowListener2 = interstitialShowListener;
                    if (interstitialShowListener2 != null) {
                        InterstitialAd interstitialAd2 = interstitialAd;
                        int i5 = WhenMappings.$EnumSwitchMapping$1[state.ordinal()];
                        if (i5 == 1) {
                            showFinishState = ShowFinishState.COMPLETED;
                        } else {
                            if (i5 != 2) {
                                throw new Q((byte) 0, 9);
                            }
                            showFinishState = ShowFinishState.SKIPPED;
                        }
                        interstitialShowListener2.onCompleted(interstitialAd2, showFinishState);
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onError(@NotNull String placementId2, @NotNull UnityAds.UnityAdsShowError error, @NotNull String message) {
                    AbstractC3340k.e(placementId2, "placementId");
                    AbstractC3340k.e(error, "error");
                    AbstractC3340k.e(message, "message");
                    int i5 = WhenMappings.$EnumSwitchMapping$0[error.ordinal()];
                    ErrorOuterClass.PublicErrorCode publicErrorCode = i5 != 1 ? i5 != 2 ? i5 != 3 ? ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_INTERNAL : ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_ALREADY_SHOWN : ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_EXPIRED : ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT;
                    InterstitialShowListener interstitialShowListener2 = interstitialShowListener;
                    if (interstitialShowListener2 != null) {
                        interstitialShowListener2.onFailed(interstitialAd, new UnityAdsError(publicErrorCode.getNumber(), UnityAdsErrorKt.getShowErrorMsg(publicErrorCode)));
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onLeftApplication(@NotNull String placementId2) {
                    AbstractC3340k.e(placementId2, "placementId");
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onRewarded(@NotNull String str) {
                    Listeners.DefaultImpls.onRewarded(this, str);
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onStart(@NotNull String placementId2) {
                    AbstractC3340k.e(placementId2, "placementId");
                    InterstitialShowListener interstitialShowListener2 = interstitialShowListener;
                    if (interstitialShowListener2 != null) {
                        interstitialShowListener2.onStarted(interstitialAd);
                    }
                }
            });
            return C2515C.f34653a;
        }
    }

    public InterstitialAd(@NotNull AdObject adObject, @NotNull SafeCallbackInvoke safeCallbackInvoke) {
        E scope;
        AbstractC3340k.e(adObject, "adObject");
        AbstractC3340k.e(safeCallbackInvoke, "safeCallbackInvoke");
        this.adObject = adObject;
        this.safeCallbackInvoke = safeCallbackInvoke;
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (scope = adPlayer.getScope()) == null) {
            return;
        }
        H.D(scope, null, new InterstitialAd$1$1(this, null), 3);
    }

    public static final void load(@NotNull LoadConfiguration loadConfiguration, @NotNull LoadListener<InterstitialAd> loadListener) {
        INSTANCE.load(loadConfiguration, loadListener);
    }

    public static /* synthetic */ void show$default(InterstitialAd interstitialAd, Activity activity, ShowConfiguration showConfiguration, InterstitialShowListener interstitialShowListener, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            showConfiguration = null;
        }
        if ((i5 & 4) != 0) {
            interstitialShowListener = null;
        }
        interstitialAd.show(activity, showConfiguration, interstitialShowListener);
    }

    @Nullable
    public final AdExpiredListener<InterstitialAd> getOnAdExpired() {
        return this.onAdExpired;
    }

    public final void setOnAdExpired(@Nullable AdExpiredListener<InterstitialAd> adExpiredListener) {
        this.onAdExpired = adExpiredListener;
    }

    public final void show(@NotNull Activity activity, @Nullable ShowConfiguration configuration, @Nullable InterstitialShowListener listener) {
        AbstractC3340k.e(activity, "activity");
        H.D((E) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_SHOW_SCOPE, kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(E.class))), null, new AnonymousClass1(configuration, this, activity, listener, null), 3);
    }
}
