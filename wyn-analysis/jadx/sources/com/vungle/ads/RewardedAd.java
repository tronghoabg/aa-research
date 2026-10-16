package com.vungle.ads;

import android.content.Context;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.internal.s;
import com.vungle.ads.internal.u1;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0011J\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0011J\u0015\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/vungle/ads/RewardedAd;", "Lcom/vungle/ads/BaseFullscreenAd;", "Landroid/content/Context;", "context", "", HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID, "Lcom/vungle/ads/AdConfig;", "adConfig", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/AdConfig;)V", "Lcom/vungle/ads/internal/u1;", "constructAdInternal$vungle_ads_release", "(Landroid/content/Context;)Lcom/vungle/ads/internal/u1;", "constructAdInternal", "userId", "Lef/C;", "setUserId", "(Ljava/lang/String;)V", "titleText", "setAlertTitleText", "bodyText", "setAlertBodyText", "closeButtonText", "setAlertCloseButtonText", "continueButtonText", "setAlertContinueButtonText", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes5.dex */
public final class RewardedAd extends BaseFullscreenAd {
    public /* synthetic */ RewardedAd(Context context, String str, AdConfig adConfig, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i5 & 4) != 0 ? new AdConfig() : adConfig);
    }

    public final void setAlertBodyText(@NotNull String bodyText) {
        AbstractC3340k.e(bodyText, "bodyText");
        s adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        AbstractC3340k.c(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.RewardedAdInternal");
        ((u1) adInternal$vungle_ads_release).a(bodyText);
    }

    public final void setAlertCloseButtonText(@NotNull String closeButtonText) {
        AbstractC3340k.e(closeButtonText, "closeButtonText");
        s adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        AbstractC3340k.c(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.RewardedAdInternal");
        ((u1) adInternal$vungle_ads_release).b(closeButtonText);
    }

    public final void setAlertContinueButtonText(@NotNull String continueButtonText) {
        AbstractC3340k.e(continueButtonText, "continueButtonText");
        s adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        AbstractC3340k.c(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.RewardedAdInternal");
        ((u1) adInternal$vungle_ads_release).c(continueButtonText);
    }

    public final void setAlertTitleText(@NotNull String titleText) {
        AbstractC3340k.e(titleText, "titleText");
        s adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        AbstractC3340k.c(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.RewardedAdInternal");
        ((u1) adInternal$vungle_ads_release).d(titleText);
    }

    public final void setUserId(@NotNull String userId) {
        AbstractC3340k.e(userId, "userId");
        s adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        AbstractC3340k.c(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.RewardedAdInternal");
        ((u1) adInternal$vungle_ads_release).e(userId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardedAd(@NotNull Context context, @NotNull String placementId, @NotNull AdConfig adConfig) {
        super(context, placementId, adConfig);
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(placementId, "placementId");
        AbstractC3340k.e(adConfig, "adConfig");
    }

    @Override // com.vungle.ads.BaseAd
    @NotNull
    public u1 constructAdInternal$vungle_ads_release(@NotNull Context context) {
        AbstractC3340k.e(context, "context");
        return new u1(context);
    }
}
