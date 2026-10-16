package com.unity3d.ads.core.data.model;

import Ef.E;
import Hf.InterfaceC0592c0;
import N0.a;
import android.app.Activity;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.google.protobuf.ByteString;
import com.unity3d.ads.LoadConfiguration;
import com.unity3d.ads.ShowConfiguration;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0002\b;\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0086\u0001Bö\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b.\u0010+J\u0010\u0010/\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b1\u0010-J\u0012\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b2\u0010-J\u0012\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b3\u0010-J\u0010\u00104\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b4\u00100J\u0012\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b5\u0010-J\u0012\u00106\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b8\u0010-J\u0010\u00109\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b;\u00100J\u0010\u0010<\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b<\u0010=J\u001b\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018HÆ\u0003ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018HÆ\u0003¢\u0006\u0004\b@\u0010?J\u0012\u0010A\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0018\u0010E\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u008d\u0002\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00182\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00182\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$HÆ\u0001ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bK\u0010-J\u0010\u0010M\u001a\u00020LHÖ\u0001¢\u0006\u0004\bM\u0010NJ\u001a\u0010P\u001a\u00020\t2\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bP\u0010QR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010R\u001a\u0004\bS\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010T\u001a\u0004\bU\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010V\u001a\u0004\bW\u0010-R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010T\u001a\u0004\bX\u0010+\"\u0004\bY\u0010ZR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010[\u001a\u0004\b\n\u00100\"\u0004\b\\\u0010]R$\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010V\u001a\u0004\b^\u0010-\"\u0004\b_\u0010`R$\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010V\u001a\u0004\ba\u0010-\"\u0004\bb\u0010`R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010V\u001a\u0004\bc\u0010-\"\u0004\bd\u0010`R\"\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010[\u001a\u0004\b\u000e\u00100\"\u0004\be\u0010]R$\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010V\u001a\u0004\bf\u0010-\"\u0004\bg\u0010`R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010h\u001a\u0004\bi\u00107R$\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010V\u001a\u0004\bj\u0010-\"\u0004\bk\u0010`R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010l\u001a\u0004\bm\u0010:R\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010[\u001a\u0004\b\u0015\u00100R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010n\u001a\u0004\bo\u0010=R-\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0006@\u0006X\u0086\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b\u001a\u0010p\u001a\u0004\bq\u0010?\"\u0004\br\u0010sR(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010p\u001a\u0004\bt\u0010?\"\u0004\bu\u0010sR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010v\u001a\u0004\bw\u0010B\"\u0004\bx\u0010yR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010z\u001a\u0004\b{\u0010D\"\u0004\b|\u0010}R,\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b#\u0010~\u001a\u0004\b\u007f\u0010F\"\u0006\b\u0080\u0001\u0010\u0081\u0001R(\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b%\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010H\"\u0006\b\u0084\u0001\u0010\u0085\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0087\u0001"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdObject;", "", "LEf/E;", "adScope", "Lcom/google/protobuf/ByteString;", "opportunityId", "", HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID, HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, "", "isScarAd", "scarQueryId", "scarAdUnitId", "scarAdString", "isOfferwallAd", "offerwallPlacementName", "Lcom/unity3d/ads/adplayer/AdPlayer;", "adPlayer", "playerServerId", "Lcom/unity3d/ads/UnityAdsLoadOptions;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "adType", "LHf/c0;", "LCf/a;", "ttl", "Lcom/unity3d/ads/core/data/model/AdObjectState;", "state", "Lcom/unity3d/ads/LoadConfiguration;", "loadConfiguration", "Lcom/unity3d/ads/ShowConfiguration;", "showConfiguration", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "activity", "Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;", "webViewLessLoadingRequiredData", "<init>", "(LEf/E;Lcom/google/protobuf/ByteString;Ljava/lang/String;Lcom/google/protobuf/ByteString;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/unity3d/ads/adplayer/AdPlayer;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;ZLgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;LHf/c0;LHf/c0;Lcom/unity3d/ads/LoadConfiguration;Lcom/unity3d/ads/ShowConfiguration;Ljava/lang/ref/WeakReference;Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;)V", "component1", "()LEf/E;", "component2", "()Lcom/google/protobuf/ByteString;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Z", "component6", "component7", "component8", "component9", "component10", "component11", "()Lcom/unity3d/ads/adplayer/AdPlayer;", "component12", "component13", "()Lcom/unity3d/ads/UnityAdsLoadOptions;", "component14", "component15", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "component16", "()LHf/c0;", "component17", "component18", "()Lcom/unity3d/ads/LoadConfiguration;", "component19", "()Lcom/unity3d/ads/ShowConfiguration;", "component20", "()Ljava/lang/ref/WeakReference;", "component21", "()Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;", "copy", "(LEf/E;Lcom/google/protobuf/ByteString;Ljava/lang/String;Lcom/google/protobuf/ByteString;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/unity3d/ads/adplayer/AdPlayer;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;ZLgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;LHf/c0;LHf/c0;Lcom/unity3d/ads/LoadConfiguration;Lcom/unity3d/ads/ShowConfiguration;Ljava/lang/ref/WeakReference;Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;)Lcom/unity3d/ads/core/data/model/AdObject;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LEf/E;", "getAdScope", "Lcom/google/protobuf/ByteString;", "getOpportunityId", "Ljava/lang/String;", "getPlacementId", "getTrackingToken", "setTrackingToken", "(Lcom/google/protobuf/ByteString;)V", "Z", "setScarAd", "(Z)V", "getScarQueryId", "setScarQueryId", "(Ljava/lang/String;)V", "getScarAdUnitId", "setScarAdUnitId", "getScarAdString", "setScarAdString", "setOfferwallAd", "getOfferwallPlacementName", "setOfferwallPlacementName", "Lcom/unity3d/ads/adplayer/AdPlayer;", "getAdPlayer", "getPlayerServerId", "setPlayerServerId", "Lcom/unity3d/ads/UnityAdsLoadOptions;", "getLoadOptions", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "getAdType", "LHf/c0;", "getTtl", "setTtl", "(LHf/c0;)V", "getState", "setState", "Lcom/unity3d/ads/LoadConfiguration;", "getLoadConfiguration", "setLoadConfiguration", "(Lcom/unity3d/ads/LoadConfiguration;)V", "Lcom/unity3d/ads/ShowConfiguration;", "getShowConfiguration", "setShowConfiguration", "(Lcom/unity3d/ads/ShowConfiguration;)V", "Ljava/lang/ref/WeakReference;", "getActivity", "setActivity", "(Ljava/lang/ref/WeakReference;)V", "Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;", "getWebViewLessLoadingRequiredData", "setWebViewLessLoadingRequiredData", "(Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;)V", "WebViewLessLoadingRequiredData", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AdObject {

    @Nullable
    private WeakReference<Activity> activity;

    @Nullable
    private final AdPlayer adPlayer;

    @NotNull
    private final E adScope;

    @NotNull
    private final DiagnosticEventRequestOuterClass.DiagnosticAdType adType;
    private final boolean isHeaderBidding;
    private boolean isOfferwallAd;
    private boolean isScarAd;

    @Nullable
    private LoadConfiguration loadConfiguration;

    @NotNull
    private final UnityAdsLoadOptions loadOptions;

    @Nullable
    private String offerwallPlacementName;

    @NotNull
    private final ByteString opportunityId;

    @NotNull
    private final String placementId;

    @Nullable
    private String playerServerId;

    @Nullable
    private String scarAdString;

    @Nullable
    private String scarAdUnitId;

    @Nullable
    private String scarQueryId;

    @Nullable
    private ShowConfiguration showConfiguration;

    @NotNull
    private InterfaceC0592c0 state;

    @NotNull
    private ByteString trackingToken;

    @NotNull
    private InterfaceC0592c0 ttl;

    @Nullable
    private WebViewLessLoadingRequiredData webViewLessLoadingRequiredData;

    public AdObject(@NotNull E adScope, @NotNull ByteString opportunityId, @NotNull String placementId, @NotNull ByteString trackingToken, boolean z2, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z10, @Nullable String str4, @Nullable AdPlayer adPlayer, @Nullable String str5, @NotNull UnityAdsLoadOptions loadOptions, boolean z11, @NotNull DiagnosticEventRequestOuterClass.DiagnosticAdType adType, @NotNull InterfaceC0592c0 ttl, @NotNull InterfaceC0592c0 state, @Nullable LoadConfiguration loadConfiguration, @Nullable ShowConfiguration showConfiguration, @Nullable WeakReference<Activity> weakReference, @Nullable WebViewLessLoadingRequiredData webViewLessLoadingRequiredData) {
        AbstractC3340k.e(adScope, "adScope");
        AbstractC3340k.e(opportunityId, "opportunityId");
        AbstractC3340k.e(placementId, "placementId");
        AbstractC3340k.e(trackingToken, "trackingToken");
        AbstractC3340k.e(loadOptions, "loadOptions");
        AbstractC3340k.e(adType, "adType");
        AbstractC3340k.e(ttl, "ttl");
        AbstractC3340k.e(state, "state");
        this.adScope = adScope;
        this.opportunityId = opportunityId;
        this.placementId = placementId;
        this.trackingToken = trackingToken;
        this.isScarAd = z2;
        this.scarQueryId = str;
        this.scarAdUnitId = str2;
        this.scarAdString = str3;
        this.isOfferwallAd = z10;
        this.offerwallPlacementName = str4;
        this.adPlayer = adPlayer;
        this.playerServerId = str5;
        this.loadOptions = loadOptions;
        this.isHeaderBidding = z11;
        this.adType = adType;
        this.ttl = ttl;
        this.state = state;
        this.loadConfiguration = loadConfiguration;
        this.showConfiguration = showConfiguration;
        this.activity = weakReference;
        this.webViewLessLoadingRequiredData = webViewLessLoadingRequiredData;
    }

    public static /* synthetic */ AdObject copy$default(AdObject adObject, E e7, ByteString byteString, String str, ByteString byteString2, boolean z2, String str2, String str3, String str4, boolean z10, String str5, AdPlayer adPlayer, String str6, UnityAdsLoadOptions unityAdsLoadOptions, boolean z11, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, InterfaceC0592c0 interfaceC0592c0, InterfaceC0592c0 interfaceC0592c02, LoadConfiguration loadConfiguration, ShowConfiguration showConfiguration, WeakReference weakReference, WebViewLessLoadingRequiredData webViewLessLoadingRequiredData, int i5, Object obj) {
        WebViewLessLoadingRequiredData webViewLessLoadingRequiredData2;
        WeakReference weakReference2;
        E e10 = (i5 & 1) != 0 ? adObject.adScope : e7;
        ByteString byteString3 = (i5 & 2) != 0 ? adObject.opportunityId : byteString;
        String str7 = (i5 & 4) != 0 ? adObject.placementId : str;
        ByteString byteString4 = (i5 & 8) != 0 ? adObject.trackingToken : byteString2;
        boolean z12 = (i5 & 16) != 0 ? adObject.isScarAd : z2;
        String str8 = (i5 & 32) != 0 ? adObject.scarQueryId : str2;
        String str9 = (i5 & 64) != 0 ? adObject.scarAdUnitId : str3;
        String str10 = (i5 & 128) != 0 ? adObject.scarAdString : str4;
        boolean z13 = (i5 & 256) != 0 ? adObject.isOfferwallAd : z10;
        String str11 = (i5 & 512) != 0 ? adObject.offerwallPlacementName : str5;
        AdPlayer adPlayer2 = (i5 & Segment.SHARE_MINIMUM) != 0 ? adObject.adPlayer : adPlayer;
        String str12 = (i5 & 2048) != 0 ? adObject.playerServerId : str6;
        UnityAdsLoadOptions unityAdsLoadOptions2 = (i5 & 4096) != 0 ? adObject.loadOptions : unityAdsLoadOptions;
        boolean z14 = (i5 & Segment.SIZE) != 0 ? adObject.isHeaderBidding : z11;
        E e11 = e10;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2 = (i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? adObject.adType : diagnosticAdType;
        InterfaceC0592c0 interfaceC0592c03 = (i5 & 32768) != 0 ? adObject.ttl : interfaceC0592c0;
        InterfaceC0592c0 interfaceC0592c04 = (i5 & 65536) != 0 ? adObject.state : interfaceC0592c02;
        LoadConfiguration loadConfiguration2 = (i5 & 131072) != 0 ? adObject.loadConfiguration : loadConfiguration;
        ShowConfiguration showConfiguration2 = (i5 & 262144) != 0 ? adObject.showConfiguration : showConfiguration;
        WeakReference weakReference3 = (i5 & 524288) != 0 ? adObject.activity : weakReference;
        if ((i5 & 1048576) != 0) {
            weakReference2 = weakReference3;
            webViewLessLoadingRequiredData2 = adObject.webViewLessLoadingRequiredData;
        } else {
            webViewLessLoadingRequiredData2 = webViewLessLoadingRequiredData;
            weakReference2 = weakReference3;
        }
        return adObject.copy(e11, byteString3, str7, byteString4, z12, str8, str9, str10, z13, str11, adPlayer2, str12, unityAdsLoadOptions2, z14, diagnosticAdType2, interfaceC0592c03, interfaceC0592c04, loadConfiguration2, showConfiguration2, weakReference2, webViewLessLoadingRequiredData2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final E getAdScope() {
        return this.adScope;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getPlayerServerId() {
        return this.playerServerId;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsHeaderBidding() {
        return this.isHeaderBidding;
    }

    @NotNull
    /* renamed from: component15, reason: from getter */
    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    @NotNull
    /* renamed from: component16, reason: from getter */
    public final InterfaceC0592c0 getTtl() {
        return this.ttl;
    }

    @NotNull
    /* renamed from: component17, reason: from getter */
    public final InterfaceC0592c0 getState() {
        return this.state;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final LoadConfiguration getLoadConfiguration() {
        return this.loadConfiguration;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final ShowConfiguration getShowConfiguration() {
        return this.showConfiguration;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    @Nullable
    public final WeakReference<Activity> component20() {
        return this.activity;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final WebViewLessLoadingRequiredData getWebViewLessLoadingRequiredData() {
        return this.webViewLessLoadingRequiredData;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsScarAd() {
        return this.isScarAd;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getScarAdString() {
        return this.scarAdString;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsOfferwallAd() {
        return this.isOfferwallAd;
    }

    @NotNull
    public final AdObject copy(@NotNull E adScope, @NotNull ByteString opportunityId, @NotNull String placementId, @NotNull ByteString trackingToken, boolean isScarAd, @Nullable String scarQueryId, @Nullable String scarAdUnitId, @Nullable String scarAdString, boolean isOfferwallAd, @Nullable String offerwallPlacementName, @Nullable AdPlayer adPlayer, @Nullable String playerServerId, @NotNull UnityAdsLoadOptions loadOptions, boolean isHeaderBidding, @NotNull DiagnosticEventRequestOuterClass.DiagnosticAdType adType, @NotNull InterfaceC0592c0 ttl, @NotNull InterfaceC0592c0 state, @Nullable LoadConfiguration loadConfiguration, @Nullable ShowConfiguration showConfiguration, @Nullable WeakReference<Activity> activity, @Nullable WebViewLessLoadingRequiredData webViewLessLoadingRequiredData) {
        AbstractC3340k.e(adScope, "adScope");
        AbstractC3340k.e(opportunityId, "opportunityId");
        AbstractC3340k.e(placementId, "placementId");
        AbstractC3340k.e(trackingToken, "trackingToken");
        AbstractC3340k.e(loadOptions, "loadOptions");
        AbstractC3340k.e(adType, "adType");
        AbstractC3340k.e(ttl, "ttl");
        AbstractC3340k.e(state, "state");
        return new AdObject(adScope, opportunityId, placementId, trackingToken, isScarAd, scarQueryId, scarAdUnitId, scarAdString, isOfferwallAd, offerwallPlacementName, adPlayer, playerServerId, loadOptions, isHeaderBidding, adType, ttl, state, loadConfiguration, showConfiguration, activity, webViewLessLoadingRequiredData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdObject)) {
            return false;
        }
        AdObject adObject = (AdObject) other;
        return AbstractC3340k.a(this.adScope, adObject.adScope) && AbstractC3340k.a(this.opportunityId, adObject.opportunityId) && AbstractC3340k.a(this.placementId, adObject.placementId) && AbstractC3340k.a(this.trackingToken, adObject.trackingToken) && this.isScarAd == adObject.isScarAd && AbstractC3340k.a(this.scarQueryId, adObject.scarQueryId) && AbstractC3340k.a(this.scarAdUnitId, adObject.scarAdUnitId) && AbstractC3340k.a(this.scarAdString, adObject.scarAdString) && this.isOfferwallAd == adObject.isOfferwallAd && AbstractC3340k.a(this.offerwallPlacementName, adObject.offerwallPlacementName) && AbstractC3340k.a(this.adPlayer, adObject.adPlayer) && AbstractC3340k.a(this.playerServerId, adObject.playerServerId) && AbstractC3340k.a(this.loadOptions, adObject.loadOptions) && this.isHeaderBidding == adObject.isHeaderBidding && this.adType == adObject.adType && AbstractC3340k.a(this.ttl, adObject.ttl) && AbstractC3340k.a(this.state, adObject.state) && AbstractC3340k.a(this.loadConfiguration, adObject.loadConfiguration) && AbstractC3340k.a(this.showConfiguration, adObject.showConfiguration) && AbstractC3340k.a(this.activity, adObject.activity) && AbstractC3340k.a(this.webViewLessLoadingRequiredData, adObject.webViewLessLoadingRequiredData);
    }

    @Nullable
    public final WeakReference<Activity> getActivity() {
        return this.activity;
    }

    @Nullable
    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    @NotNull
    public final E getAdScope() {
        return this.adScope;
    }

    @NotNull
    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    @Nullable
    public final LoadConfiguration getLoadConfiguration() {
        return this.loadConfiguration;
    }

    @NotNull
    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    @Nullable
    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    @NotNull
    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    public final String getPlayerServerId() {
        return this.playerServerId;
    }

    @Nullable
    public final String getScarAdString() {
        return this.scarAdString;
    }

    @Nullable
    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    @Nullable
    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    @Nullable
    public final ShowConfiguration getShowConfiguration() {
        return this.showConfiguration;
    }

    @NotNull
    public final InterfaceC0592c0 getState() {
        return this.state;
    }

    @NotNull
    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    @NotNull
    public final InterfaceC0592c0 getTtl() {
        return this.ttl;
    }

    @Nullable
    public final WebViewLessLoadingRequiredData getWebViewLessLoadingRequiredData() {
        return this.webViewLessLoadingRequiredData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = (this.trackingToken.hashCode() + a.c((this.opportunityId.hashCode() + (this.adScope.hashCode() * 31)) * 31, 31, this.placementId)) * 31;
        boolean z2 = this.isScarAd;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int i10 = (iHashCode + i5) * 31;
        String str = this.scarQueryId;
        int iHashCode2 = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scarAdUnitId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scarAdString;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z10 = this.isOfferwallAd;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = (iHashCode4 + i11) * 31;
        String str4 = this.offerwallPlacementName;
        int iHashCode5 = (i12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AdPlayer adPlayer = this.adPlayer;
        int iHashCode6 = (iHashCode5 + (adPlayer == null ? 0 : adPlayer.hashCode())) * 31;
        String str5 = this.playerServerId;
        int iHashCode7 = (this.loadOptions.hashCode() + ((iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        boolean z11 = this.isHeaderBidding;
        int iHashCode8 = (this.state.hashCode() + ((this.ttl.hashCode() + ((this.adType.hashCode() + ((iHashCode7 + (z11 ? 1 : z11 ? 1 : 0)) * 31)) * 31)) * 31)) * 31;
        LoadConfiguration loadConfiguration = this.loadConfiguration;
        int iHashCode9 = (iHashCode8 + (loadConfiguration == null ? 0 : loadConfiguration.hashCode())) * 31;
        ShowConfiguration showConfiguration = this.showConfiguration;
        int iHashCode10 = (iHashCode9 + (showConfiguration == null ? 0 : showConfiguration.hashCode())) * 31;
        WeakReference<Activity> weakReference = this.activity;
        int iHashCode11 = (iHashCode10 + (weakReference == null ? 0 : weakReference.hashCode())) * 31;
        WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = this.webViewLessLoadingRequiredData;
        return iHashCode11 + (webViewLessLoadingRequiredData != null ? webViewLessLoadingRequiredData.hashCode() : 0);
    }

    public final boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    public final void setActivity(@Nullable WeakReference<Activity> weakReference) {
        this.activity = weakReference;
    }

    public final void setLoadConfiguration(@Nullable LoadConfiguration loadConfiguration) {
        this.loadConfiguration = loadConfiguration;
    }

    public final void setOfferwallAd(boolean z2) {
        this.isOfferwallAd = z2;
    }

    public final void setOfferwallPlacementName(@Nullable String str) {
        this.offerwallPlacementName = str;
    }

    public final void setPlayerServerId(@Nullable String str) {
        this.playerServerId = str;
    }

    public final void setScarAd(boolean z2) {
        this.isScarAd = z2;
    }

    public final void setScarAdString(@Nullable String str) {
        this.scarAdString = str;
    }

    public final void setScarAdUnitId(@Nullable String str) {
        this.scarAdUnitId = str;
    }

    public final void setScarQueryId(@Nullable String str) {
        this.scarQueryId = str;
    }

    public final void setShowConfiguration(@Nullable ShowConfiguration showConfiguration) {
        this.showConfiguration = showConfiguration;
    }

    public final void setState(@NotNull InterfaceC0592c0 interfaceC0592c0) {
        AbstractC3340k.e(interfaceC0592c0, "<set-?>");
        this.state = interfaceC0592c0;
    }

    public final void setTrackingToken(@NotNull ByteString byteString) {
        AbstractC3340k.e(byteString, "<set-?>");
        this.trackingToken = byteString;
    }

    public final void setTtl(@NotNull InterfaceC0592c0 interfaceC0592c0) {
        AbstractC3340k.e(interfaceC0592c0, "<set-?>");
        this.ttl = interfaceC0592c0;
    }

    public final void setWebViewLessLoadingRequiredData(@Nullable WebViewLessLoadingRequiredData webViewLessLoadingRequiredData) {
        this.webViewLessLoadingRequiredData = webViewLessLoadingRequiredData;
    }

    @NotNull
    public String toString() {
        return "AdObject(adScope=" + this.adScope + ", opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", trackingToken=" + this.trackingToken + ", isScarAd=" + this.isScarAd + ", scarQueryId=" + this.scarQueryId + ", scarAdUnitId=" + this.scarAdUnitId + ", scarAdString=" + this.scarAdString + ", isOfferwallAd=" + this.isOfferwallAd + ", offerwallPlacementName=" + this.offerwallPlacementName + ", adPlayer=" + this.adPlayer + ", playerServerId=" + this.playerServerId + ", loadOptions=" + this.loadOptions + ", isHeaderBidding=" + this.isHeaderBidding + ", adType=" + this.adType + ", ttl=" + this.ttl + ", state=" + this.state + ", loadConfiguration=" + this.loadConfiguration + ", showConfiguration=" + this.showConfiguration + ", activity=" + this.activity + ", webViewLessLoadingRequiredData=" + this.webViewLessLoadingRequiredData + ')';
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;", "", "webviewUrl", "", "adResponse", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "adRefreshState", "Lcom/unity3d/ads/core/data/model/AdRefreshState;", "(Ljava/lang/String;Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Lcom/unity3d/ads/core/data/model/AdRefreshState;)V", "getAdRefreshState", "()Lcom/unity3d/ads/core/data/model/AdRefreshState;", "setAdRefreshState", "(Lcom/unity3d/ads/core/data/model/AdRefreshState;)V", "getAdResponse", "()Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "setAdResponse", "(Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;)V", "getWebviewUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class WebViewLessLoadingRequiredData {

        @Nullable
        private AdRefreshState adRefreshState;

        @NotNull
        private AdResponseOuterClass.AdResponse adResponse;

        @NotNull
        private final String webviewUrl;

        public WebViewLessLoadingRequiredData(@NotNull String webviewUrl, @NotNull AdResponseOuterClass.AdResponse adResponse, @Nullable AdRefreshState adRefreshState) {
            AbstractC3340k.e(webviewUrl, "webviewUrl");
            AbstractC3340k.e(adResponse, "adResponse");
            this.webviewUrl = webviewUrl;
            this.adResponse = adResponse;
            this.adRefreshState = adRefreshState;
        }

        public static /* synthetic */ WebViewLessLoadingRequiredData copy$default(WebViewLessLoadingRequiredData webViewLessLoadingRequiredData, String str, AdResponseOuterClass.AdResponse adResponse, AdRefreshState adRefreshState, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = webViewLessLoadingRequiredData.webviewUrl;
            }
            if ((i5 & 2) != 0) {
                adResponse = webViewLessLoadingRequiredData.adResponse;
            }
            if ((i5 & 4) != 0) {
                adRefreshState = webViewLessLoadingRequiredData.adRefreshState;
            }
            return webViewLessLoadingRequiredData.copy(str, adResponse, adRefreshState);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getWebviewUrl() {
            return this.webviewUrl;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AdResponseOuterClass.AdResponse getAdResponse() {
            return this.adResponse;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final AdRefreshState getAdRefreshState() {
            return this.adRefreshState;
        }

        @NotNull
        public final WebViewLessLoadingRequiredData copy(@NotNull String webviewUrl, @NotNull AdResponseOuterClass.AdResponse adResponse, @Nullable AdRefreshState adRefreshState) {
            AbstractC3340k.e(webviewUrl, "webviewUrl");
            AbstractC3340k.e(adResponse, "adResponse");
            return new WebViewLessLoadingRequiredData(webviewUrl, adResponse, adRefreshState);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebViewLessLoadingRequiredData)) {
                return false;
            }
            WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = (WebViewLessLoadingRequiredData) other;
            return AbstractC3340k.a(this.webviewUrl, webViewLessLoadingRequiredData.webviewUrl) && AbstractC3340k.a(this.adResponse, webViewLessLoadingRequiredData.adResponse) && this.adRefreshState == webViewLessLoadingRequiredData.adRefreshState;
        }

        @Nullable
        public final AdRefreshState getAdRefreshState() {
            return this.adRefreshState;
        }

        @NotNull
        public final AdResponseOuterClass.AdResponse getAdResponse() {
            return this.adResponse;
        }

        @NotNull
        public final String getWebviewUrl() {
            return this.webviewUrl;
        }

        public int hashCode() {
            int iHashCode = (this.adResponse.hashCode() + (this.webviewUrl.hashCode() * 31)) * 31;
            AdRefreshState adRefreshState = this.adRefreshState;
            return iHashCode + (adRefreshState == null ? 0 : adRefreshState.hashCode());
        }

        public final void setAdRefreshState(@Nullable AdRefreshState adRefreshState) {
            this.adRefreshState = adRefreshState;
        }

        public final void setAdResponse(@NotNull AdResponseOuterClass.AdResponse adResponse) {
            AbstractC3340k.e(adResponse, "<set-?>");
            this.adResponse = adResponse;
        }

        @NotNull
        public String toString() {
            return "WebViewLessLoadingRequiredData(webviewUrl=" + this.webviewUrl + ", adResponse=" + this.adResponse + ", adRefreshState=" + this.adRefreshState + ')';
        }

        public /* synthetic */ WebViewLessLoadingRequiredData(String str, AdResponseOuterClass.AdResponse adResponse, AdRefreshState adRefreshState, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, adResponse, (i5 & 4) != 0 ? null : adRefreshState);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ AdObject(Ef.E r26, com.google.protobuf.ByteString r27, java.lang.String r28, com.google.protobuf.ByteString r29, boolean r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, boolean r34, java.lang.String r35, com.unity3d.ads.adplayer.AdPlayer r36, java.lang.String r37, com.unity3d.ads.UnityAdsLoadOptions r38, boolean r39, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType r40, Hf.InterfaceC0592c0 r41, Hf.InterfaceC0592c0 r42, com.unity3d.ads.LoadConfiguration r43, com.unity3d.ads.ShowConfiguration r44, java.lang.ref.WeakReference r45, com.unity3d.ads.core.data.model.AdObject.WebViewLessLoadingRequiredData r46, int r47, kotlin.jvm.internal.DefaultConstructorMarker r48) {
        /*
            r25 = this;
            r0 = r47
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L9
            r8 = r2
            goto Lb
        L9:
            r8 = r30
        Lb:
            r1 = r0 & 32
            r3 = 0
            if (r1 == 0) goto L12
            r9 = r3
            goto L14
        L12:
            r9 = r31
        L14:
            r1 = r0 & 64
            if (r1 == 0) goto L1a
            r10 = r3
            goto L1c
        L1a:
            r10 = r32
        L1c:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L22
            r11 = r3
            goto L24
        L22:
            r11 = r33
        L24:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L2a
            r12 = r2
            goto L2c
        L2a:
            r12 = r34
        L2c:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L32
            r13 = r3
            goto L34
        L32:
            r13 = r35
        L34:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L3a
            r14 = r3
            goto L3c
        L3a:
            r14 = r36
        L3c:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L42
            r15 = r3
            goto L44
        L42:
            r15 = r37
        L44:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L51
            Hf.x0 r1 = Hf.k0.c(r3)
            r19 = r1
            goto L53
        L51:
            r19 = r41
        L53:
            r1 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L61
            com.unity3d.ads.core.data.model.AdObjectState r1 = com.unity3d.ads.core.data.model.AdObjectState.INIT
            Hf.x0 r1 = Hf.k0.c(r1)
            r20 = r1
            goto L63
        L61:
            r20 = r42
        L63:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L6b
            r21 = r3
            goto L6d
        L6b:
            r21 = r43
        L6d:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L75
            r22 = r3
            goto L77
        L75:
            r22 = r44
        L77:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L7f
            r23 = r3
            goto L81
        L7f:
            r23 = r45
        L81:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L99
            r24 = r3
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r16 = r38
            r17 = r39
            r18 = r40
            r3 = r25
            goto Lab
        L99:
            r24 = r46
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r16 = r38
            r17 = r39
            r18 = r40
        Lab:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.model.AdObject.<init>(Ef.E, com.google.protobuf.ByteString, java.lang.String, com.google.protobuf.ByteString, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, com.unity3d.ads.adplayer.AdPlayer, java.lang.String, com.unity3d.ads.UnityAdsLoadOptions, boolean, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, Hf.c0, Hf.c0, com.unity3d.ads.LoadConfiguration, com.unity3d.ads.ShowConfiguration, java.lang.ref.WeakReference, com.unity3d.ads.core.data.model.AdObject$WebViewLessLoadingRequiredData, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
