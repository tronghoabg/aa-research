package com.moloco.sdk.internal.unity_bridge;

import A7.AbstractC0279p0;
import Bf.k;
import Fe.c;
import Hf.InterfaceC0592c0;
import Hf.k0;
import Hf.x0;
import android.content.Context;
import android.os.Handler;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.unity_bridge.internal.e;
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.MolocoInitStatus;
import com.moloco.sdk.publisher.MolocoInitializationListener;
import com.moloco.sdk.publisher.init.MolocoInitParams;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import ef.InterfaceC2525i;
import ic.d;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityPlugin;", "", "<init>", "()V", "", "appKey", "mediationName", "Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityInitCallback;", "callback", "Lef/C;", "initializeSdk", "(Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityInitCallback;)V", "mediation", HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID, "bidResponse", "Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityLoadCallback;", "loadInterstitial", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityLoadCallback;)V", "Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityShowCallback;", "showInterstitial", "(Ljava/lang/String;Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityShowCallback;)V", "callingMethod", "logUninitializedAccessError", "(Ljava/lang/String;)V", "LHf/c0;", "", "initState", "LHf/c0;", "Landroid/content/Context;", "context$delegate", "Lef/i;", "getContext", "()Landroid/content/Context;", "context", "Lcom/moloco/sdk/internal/unity_bridge/internal/e;", "adManager$delegate", "getAdManager", "()Lcom/moloco/sdk/internal/unity_bridge/internal/e;", "adManager", "TAG", "Ljava/lang/String;", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class MolocoUnityPlugin {

    @NotNull
    private static final String TAG = "MolocoUnityPlugin";

    @NotNull
    public static final MolocoUnityPlugin INSTANCE = new MolocoUnityPlugin();

    @NotNull
    private static final InterfaceC0592c0 initState = k0.c(Boolean.FALSE);

    /* renamed from: context$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC2525i context = c.z(new com.moloco.sdk.internal.services.encryption.a(1));

    /* renamed from: adManager$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC2525i adManager = c.z(new com.moloco.sdk.internal.services.encryption.a(2));
    public static final int $stable = 8;

    private MolocoUnityPlugin() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e adManager_delegate$lambda$1() {
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context context_delegate$lambda$0() {
        return d.e(null);
    }

    private final e getAdManager() {
        return (e) adManager.getValue();
    }

    private final Context getContext() {
        return (Context) context.getValue();
    }

    public static final void initializeSdk(@NotNull final String appKey, @NotNull final String mediationName, @NotNull final MolocoUnityInitCallback callback) {
        AbstractC3340k.e(appKey, "appKey");
        AbstractC3340k.e(mediationName, "mediationName");
        AbstractC3340k.e(callback, "callback");
        Moloco.initialize(new MolocoInitParams(INSTANCE.getContext(), appKey, new MediationInfo(mediationName)), new MolocoInitializationListener() { // from class: com.moloco.sdk.internal.unity_bridge.a
            @Override // com.moloco.sdk.publisher.MolocoInitializationListener
            public final void onMolocoInitializationStatus(MolocoInitStatus molocoInitStatus) {
                MolocoUnityPlugin.initializeSdk$lambda$3(appKey, mediationName, callback, molocoInitStatus);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeSdk$lambda$3(String str, String str2, MolocoUnityInitCallback molocoUnityInitCallback, MolocoInitStatus initStatus) {
        AbstractC3340k.e(initStatus, "initStatus");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, TAG, "initialized " + str + ' ' + str2 + ' ' + initStatus.getInitialization(), null, false, 12, null);
        boolean z2 = initStatus.getInitialization() == Initialization.SUCCESS;
        InterfaceC0592c0 interfaceC0592c0 = initState;
        Boolean boolValueOf = Boolean.valueOf(z2);
        x0 x0Var = (x0) interfaceC0592c0;
        x0Var.getClass();
        x0Var.k(null, boolValueOf);
        molocoUnityInitCallback.onInitialized(z2);
    }

    public static final void loadInterstitial(@NotNull String mediation, @NotNull String adUnitId, @NotNull String bidResponse, @NotNull MolocoUnityLoadCallback callback) {
        AbstractC3340k.e(mediation, "mediation");
        AbstractC3340k.e(adUnitId, "adUnitId");
        AbstractC3340k.e(bidResponse, "bidResponse");
        AbstractC3340k.e(callback, "callback");
        if (!((Boolean) ((x0) initState).getValue()).booleanValue()) {
            INSTANCE.logUninitializedAccessError("loadInterstitial");
            return;
        }
        e adManager2 = INSTANCE.getAdManager();
        String mediation2 = k.V0(mediation).toString();
        String adUnitId2 = k.V0(adUnitId).toString();
        adManager2.getClass();
        AbstractC3340k.e(mediation2, "mediation");
        AbstractC3340k.e(adUnitId2, "adUnitId");
        Moloco.createInterstitial$default(new MediationInfo(mediation2), adUnitId2, null, new com.applovin.mediation.adapters.c(e.a(), adManager2, adUnitId2, bidResponse, callback, 1), 4, null);
    }

    private final void logUninitializedAccessError(String callingMethod) {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, TAG, AbstractC0279p0.l("ERROR: Failed to execute ", callingMethod, "() - please ensure the Moloco Unity Plugin has been initialized by calling 'MolocoSdk.InitializeSdk();'!"), null, false, 12, null);
    }

    public static final void showInterstitial(@NotNull String adUnitId, @NotNull MolocoUnityShowCallback callback) {
        AbstractC3340k.e(adUnitId, "adUnitId");
        AbstractC3340k.e(callback, "callback");
        if (!((Boolean) ((x0) initState).getValue()).booleanValue()) {
            INSTANCE.logUninitializedAccessError("showInterstitial");
            return;
        }
        e adManager2 = INSTANCE.getAdManager();
        String adUnitId2 = k.V0(adUnitId).toString();
        adManager2.getClass();
        AbstractC3340k.e(adUnitId2, "adUnitId");
        Handler handlerA = e.a();
        InterstitialAd interstitialAd = (InterstitialAd) adManager2.f29769a.f9453a.get(adUnitId2);
        if (interstitialAd != null && interstitialAd.isLoaded()) {
            interstitialAd.show(new com.moloco.sdk.internal.unity_bridge.internal.d(handlerA, callback));
            return;
        }
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        handlerA.post(new com.applovin.impl.sdk.nativeAd.e(3, callback, adUnitId2));
    }
}
