package com.vungle.ads;

import Fe.c;
import android.content.Context;
import android.os.Handler;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.l;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.j;
import com.vungle.ads.internal.signals.m;
import com.vungle.ads.internal.t1;
import com.vungle.ads.internal.util.s;
import com.vungle.ads.internal.util.y;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H ¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010$\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 H\u0010¢\u0006\u0004\b\"\u0010#J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b\u0013\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0012¢\u0006\u0004\b+\u0010\u0014J\r\u0010,\u001a\u00020\u0012¢\u0006\u0004\b,\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R$\u0010@\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020\u000b8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020F8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bG\u0010B\u001a\u0004\bH\u0010IR\u001a\u0010P\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001a\u0010V\u001a\u00020Q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010Y\u001a\u00020Q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u0010S\u001a\u0004\bX\u0010UR\u001a\u0010\\\u001a\u00020Q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010S\u001a\u0004\b[\u0010UR\u001a\u0010_\u001a\u00020Q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b]\u0010S\u001a\u0004\b^\u0010UR\u001a\u0010e\u001a\u00020`8\u0000X\u0080\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001a\u0010h\u001a\u00020`8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bf\u0010b\u001a\u0004\bg\u0010dR\u001a\u0010k\u001a\u00020Q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bi\u0010S\u001a\u0004\bj\u0010UR$\u0010s\u001a\u0004\u0018\u00010l8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR(\u0010w\u001a\u0004\u0018\u00010\u00052\b\u0010t\u001a\u0004\u0018\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bu\u00102\u001a\u0004\bv\u00104R(\u0010z\u001a\u0004\u0018\u00010\u00052\b\u0010t\u001a\u0004\u0018\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bx\u00102\u001a\u0004\by\u00104R.\u0010\u007f\u001a\u0004\u0018\u00010\u00052\b\u0010{\u001a\u0004\u0018\u00010\u00058\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b|\u00102\u001a\u0004\b}\u00104\"\u0004\b~\u0010\u0016¨\u0006\u0080\u0001"}, d2 = {"Lcom/vungle/ads/BaseAd;", "Lcom/vungle/ads/Ad;", "Lcom/vungle/ads/VungleAdType;", "Landroid/content/Context;", "context", "", HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID, "Lcom/vungle/ads/AdConfig;", "adConfig", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/AdConfig;)V", "Lcom/vungle/ads/internal/s;", "constructAdInternal$vungle_ads_release", "(Landroid/content/Context;)Lcom/vungle/ads/internal/s;", "constructAdInternal", "", "canPlayAd", "()Ljava/lang/Boolean;", "Lef/C;", "load", "()V", LegacyLoadUseCase.KEY_AD_MARKUP, "(Ljava/lang/String;)V", "Lcom/vungle/ads/internal/model/h0;", "advertisement", "onAdLoaded$vungle_ads_release", "(Lcom/vungle/ads/internal/model/h0;)V", "onAdLoaded", "baseAd", "onLoadSuccess$vungle_ads_release", "(Lcom/vungle/ads/BaseAd;Ljava/lang/String;)V", "onLoadSuccess", "Lcom/vungle/ads/VungleError;", "vungleError", "onLoadFailure$vungle_ads_release", "(Lcom/vungle/ads/BaseAd;Lcom/vungle/ads/VungleError;)V", "onLoadFailure", "Lcom/vungle/ads/VungleCSBData;", "csbData", "(Lcom/vungle/ads/VungleCSBData;)V", "", "getWinningPrice", "()D", "sendWinURL", "sendLossURL", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/lang/String;", "getPlacementId", "()Ljava/lang/String;", "c", "Lcom/vungle/ads/AdConfig;", "getAdConfig", "()Lcom/vungle/ads/AdConfig;", "Lcom/vungle/ads/BaseAdListener;", "d", "Lcom/vungle/ads/BaseAdListener;", "getAdListener", "()Lcom/vungle/ads/BaseAdListener;", "setAdListener", "(Lcom/vungle/ads/BaseAdListener;)V", "adListener", "e", "Lef/i;", "getAdInternal$vungle_ads_release", "()Lcom/vungle/ads/internal/s;", "adInternal", "Lcom/vungle/ads/internal/signals/j;", "f", "getSignalManager$vungle_ads_release", "()Lcom/vungle/ads/internal/signals/j;", "signalManager", "Lcom/vungle/ads/internal/util/s;", "g", "Lcom/vungle/ads/internal/util/s;", "getLogEntry$vungle_ads_release", "()Lcom/vungle/ads/internal/util/s;", "logEntry", "Lcom/vungle/ads/internal/t1;", "h", "Lcom/vungle/ads/internal/t1;", "getResponseToShowMetric$vungle_ads_release", "()Lcom/vungle/ads/internal/t1;", "responseToShowMetric", "i", "getPresentToDisplayMetric$vungle_ads_release", "presentToDisplayMetric", "j", "getShowToFailMetric$vungle_ads_release", "showToFailMetric", "k", "getDisplayToClickMetric$vungle_ads_release", "displayToClickMetric", "Lcom/vungle/ads/internal/m2;", "l", "Lcom/vungle/ads/internal/m2;", "getLeaveApplicationMetric$vungle_ads_release", "()Lcom/vungle/ads/internal/m2;", "leaveApplicationMetric", "m", "getRewardedMetric$vungle_ads_release", "rewardedMetric", "n", "getShowToCloseMetric$vungle_ads_release", "showToCloseMetric", "Lcom/vungle/ads/internal/signals/m;", "o", "Lcom/vungle/ads/internal/signals/m;", "getSignaledAd$vungle_ads_release", "()Lcom/vungle/ads/internal/signals/m;", "setSignaledAd$vungle_ads_release", "(Lcom/vungle/ads/internal/signals/m;)V", "signaledAd", "<set-?>", "p", "getCreativeId", "creativeId", "q", "getEventId", "eventId", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "getAdapterAdFormat", "setAdapterAdFormat", "adapterAdFormat", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes5.dex */
public abstract class BaseAd implements Ad, VungleAdType {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String placementId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final AdConfig adConfig;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public BaseAdListener adListener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC2525i adInternal;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC2525i signalManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final s logEntry;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final t1 responseToShowMetric;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final t1 presentToDisplayMetric;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final t1 showToFailMetric;

    /* renamed from: k, reason: from kotlin metadata */
    public final t1 displayToClickMetric;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final m2 leaveApplicationMetric;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final m2 rewardedMetric;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final t1 showToCloseMetric;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public m signaledAd;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public String creativeId;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public String eventId;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public String adapterAdFormat;

    public BaseAd(@NotNull Context context, @NotNull String placementId, @NotNull AdConfig adConfig) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(placementId, "placementId");
        AbstractC3340k.e(adConfig, "adConfig");
        this.context = context;
        this.placementId = placementId;
        this.adConfig = adConfig;
        this.adInternal = c.z(new BaseAd$adInternal$2(this));
        this.signalManager = c.y(EnumC2526j.f34667a, new BaseAd$special$$inlined$inject$1(context));
        s sVar = new s();
        sVar.g(placementId);
        this.logEntry = sVar;
        this.responseToShowMetric = new t1(Sdk.SDKMetric.SDKMetricType.AD_RESPONSE_TO_SHOW_DURATION_MS);
        this.presentToDisplayMetric = new t1(Sdk.SDKMetric.SDKMetricType.AD_PRESENT_TO_DISPLAY_DURATION_MS);
        this.showToFailMetric = new t1(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_FAIL_DURATION_MS);
        this.displayToClickMetric = new t1(Sdk.SDKMetric.SDKMetricType.AD_DISPLAY_TO_CLICK_DURATION_MS);
        this.leaveApplicationMetric = new m2(Sdk.SDKMetric.SDKMetricType.AD_LEAVE_APPLICATION);
        this.rewardedMetric = new m2(Sdk.SDKMetric.SDKMetricType.AD_REWARD_USER);
        this.showToCloseMetric = new t1(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_CLOSE_DURATION_MS);
    }

    @Override // com.vungle.ads.Ad
    @NotNull
    public Boolean canPlayAd() {
        com.vungle.ads.internal.s adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        Xf.c cVar = com.vungle.ads.internal.s.f33613p;
        return Boolean.valueOf(adInternal$vungle_ads_release.a(false) == null);
    }

    @NotNull
    public abstract com.vungle.ads.internal.s constructAdInternal$vungle_ads_release(@NotNull Context context);

    @NotNull
    public final AdConfig getAdConfig() {
        return this.adConfig;
    }

    @NotNull
    public final com.vungle.ads.internal.s getAdInternal$vungle_ads_release() {
        return (com.vungle.ads.internal.s) this.adInternal.getValue();
    }

    @Nullable
    public final BaseAdListener getAdListener() {
        return this.adListener;
    }

    @Override // com.vungle.ads.VungleAdType
    @Nullable
    public String getAdapterAdFormat() {
        return this.adapterAdFormat;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final String getCreativeId() {
        return this.creativeId;
    }

    @NotNull
    /* renamed from: getDisplayToClickMetric$vungle_ads_release, reason: from getter */
    public final t1 getDisplayToClickMetric() {
        return this.displayToClickMetric;
    }

    @Nullable
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    /* renamed from: getLeaveApplicationMetric$vungle_ads_release, reason: from getter */
    public final m2 getLeaveApplicationMetric() {
        return this.leaveApplicationMetric;
    }

    @NotNull
    /* renamed from: getLogEntry$vungle_ads_release, reason: from getter */
    public final s getLogEntry() {
        return this.logEntry;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    @NotNull
    /* renamed from: getPresentToDisplayMetric$vungle_ads_release, reason: from getter */
    public final t1 getPresentToDisplayMetric() {
        return this.presentToDisplayMetric;
    }

    @NotNull
    /* renamed from: getResponseToShowMetric$vungle_ads_release, reason: from getter */
    public final t1 getResponseToShowMetric() {
        return this.responseToShowMetric;
    }

    @NotNull
    /* renamed from: getRewardedMetric$vungle_ads_release, reason: from getter */
    public final m2 getRewardedMetric() {
        return this.rewardedMetric;
    }

    @NotNull
    /* renamed from: getShowToCloseMetric$vungle_ads_release, reason: from getter */
    public final t1 getShowToCloseMetric() {
        return this.showToCloseMetric;
    }

    @NotNull
    /* renamed from: getShowToFailMetric$vungle_ads_release, reason: from getter */
    public final t1 getShowToFailMetric() {
        return this.showToFailMetric;
    }

    @NotNull
    public final j getSignalManager$vungle_ads_release() {
        return (j) this.signalManager.getValue();
    }

    @Nullable
    /* renamed from: getSignaledAd$vungle_ads_release, reason: from getter */
    public final m getSignaledAd() {
        return this.signaledAd;
    }

    public final double getWinningPrice() {
        l lVar;
        h0 h0Var = getAdInternal$vungle_ads_release().f33616c;
        if (h0Var == null) {
            return 0.0d;
        }
        com.vungle.ads.internal.model.s sVarI = h0Var.i();
        Double d3 = (sVarI == null || (lVar = sVarI.f33308c) == null) ? null : lVar.f33245a;
        if (d3 != null) {
            return d3.doubleValue();
        }
        return 0.0d;
    }

    @Override // com.vungle.ads.Ad
    public void load() {
        load((String) null);
    }

    public void onAdLoaded$vungle_ads_release(@NotNull h0 advertisement) {
        AbstractC3340k.e(advertisement, "advertisement");
        advertisement.a(this.adConfig);
        this.creativeId = advertisement.n();
        String strH = advertisement.h();
        this.eventId = strH;
        m mVar = this.signaledAd;
        if (mVar == null) {
            return;
        }
        mVar.a(strH);
    }

    public void onLoadFailure$vungle_ads_release(@NotNull BaseAd baseAd, @NotNull VungleError vungleError) {
        AbstractC3340k.e(baseAd, "baseAd");
        AbstractC3340k.e(vungleError, "vungleError");
        this.responseToShowMetric.e();
        Handler handler = y.f33878a;
        y.a(new BaseAd$onLoadFailure$1(this, vungleError));
    }

    public void onLoadSuccess$vungle_ads_release(@NotNull BaseAd baseAd, @Nullable String adMarkup) {
        AbstractC3340k.e(baseAd, "baseAd");
        this.responseToShowMetric.e();
        Handler handler = y.f33878a;
        y.a(new BaseAd$onLoadSuccess$1(this));
    }

    public final void sendLossURL() {
        getAdInternal$vungle_ads_release().k();
    }

    public final void sendWinURL() {
        getAdInternal$vungle_ads_release().l();
    }

    public final void setAdListener(@Nullable BaseAdListener baseAdListener) {
        this.adListener = baseAdListener;
    }

    @Override // com.vungle.ads.VungleAdType
    public void setAdapterAdFormat(@Nullable String str) {
        this.adapterAdFormat = str;
        this.logEntry.f33873m = str;
    }

    public final void setSignaledAd$vungle_ads_release(@Nullable m mVar) {
        this.signaledAd = mVar;
    }

    @Override // com.vungle.ads.Ad
    public void load(@Nullable final String adMarkup) {
        getAdInternal$vungle_ads_release().a(this.placementId, adMarkup, null, new com.vungle.ads.internal.load.a() { // from class: com.vungle.ads.BaseAd.load.1
            @Override // com.vungle.ads.internal.load.a
            public void onFailure(@NotNull VungleError error) {
                AbstractC3340k.e(error, "error");
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadFailure$vungle_ads_release(baseAd, error);
            }

            @Override // com.vungle.ads.internal.load.a
            public void onSuccess(@NotNull h0 advertisement) {
                AbstractC3340k.e(advertisement, "advertisement");
                BaseAd.this.onAdLoaded$vungle_ads_release(advertisement);
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadSuccess$vungle_ads_release(baseAd, adMarkup);
            }
        });
    }

    @Override // com.vungle.ads.Ad
    public void load(@NotNull VungleCSBData csbData) {
        AbstractC3340k.e(csbData, "csbData");
        getAdInternal$vungle_ads_release().a(this.placementId, null, csbData, new com.vungle.ads.internal.load.a() { // from class: com.vungle.ads.BaseAd.load.2
            @Override // com.vungle.ads.internal.load.a
            public void onFailure(@NotNull VungleError error) {
                AbstractC3340k.e(error, "error");
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadFailure$vungle_ads_release(baseAd, error);
            }

            @Override // com.vungle.ads.internal.load.a
            public void onSuccess(@NotNull h0 advertisement) {
                AbstractC3340k.e(advertisement, "advertisement");
                BaseAd.this.onAdLoaded$vungle_ads_release(advertisement);
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadSuccess$vungle_ads_release(baseAd, null);
            }
        });
    }
}
