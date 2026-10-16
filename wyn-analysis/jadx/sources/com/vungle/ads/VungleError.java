package com.vungle.ads;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u0011\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0005R\u0017\u0010!\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0019\u0082\u00013\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRST¨\u0006U"}, d2 = {"Lcom/vungle/ads/VungleError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "getLocalizedMessage", "()Ljava/lang/String;", "logError$vungle_ads_release", "()Lcom/vungle/ads/VungleError;", "logError", "Lef/C;", "logErrorNoReturnValue$vungle_ads_release", "()V", "logErrorNoReturnValue", "Lcom/vungle/ads/internal/util/s;", "logEntry", "setLogEntry$vungle_ads_release", "(Lcom/vungle/ads/internal/util/s;)Lcom/vungle/ads/VungleError;", "setLogEntry", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Ljava/lang/String;", "getErrorMessage", "errorMessage", "c", "I", "getCode", "code", "Lcom/vungle/ads/APIFailedStatusCodeError;", "Lcom/vungle/ads/AdCantPlayWithoutWebView;", "Lcom/vungle/ads/AdExpiredError;", "Lcom/vungle/ads/AdExpiredOnPlayError;", "Lcom/vungle/ads/AdMarkupInvalidError;", "Lcom/vungle/ads/AdMarkupJsonError;", "Lcom/vungle/ads/AdNotLoadedCantPlay;", "Lcom/vungle/ads/AdPayloadError;", "Lcom/vungle/ads/AdResponseEmptyError;", "Lcom/vungle/ads/AdRetryActiveError;", "Lcom/vungle/ads/AdRetryError;", "Lcom/vungle/ads/AssetFailedToDeleteError;", "Lcom/vungle/ads/AssetRequestError;", "Lcom/vungle/ads/AssetWriteError;", "Lcom/vungle/ads/ConcurrentPlaybackUnsupported;", "Lcom/vungle/ads/EmptyBidPayloadError;", "Lcom/vungle/ads/EvaluateJsError;", "Lcom/vungle/ads/GzipEncodeError;", "Lcom/vungle/ads/IndexHtmlError;", "Lcom/vungle/ads/InvalidAdStateError;", "Lcom/vungle/ads/InvalidAppId;", "Lcom/vungle/ads/InvalidAssetUrlError;", "Lcom/vungle/ads/InvalidBannerSizeError;", "Lcom/vungle/ads/InvalidBidPayloadError;", "Lcom/vungle/ads/InvalidCSBDataError;", "Lcom/vungle/ads/InvalidCTAUrl;", "Lcom/vungle/ads/InvalidEndpointError;", "Lcom/vungle/ads/InvalidEventIdError;", "Lcom/vungle/ads/InvalidTemplateURLError;", "Lcom/vungle/ads/JsonEncodeError;", "Lcom/vungle/ads/LinkError;", "Lcom/vungle/ads/MraidTemplateError;", "Lcom/vungle/ads/NativeAssetError;", "Lcom/vungle/ads/NativeVideoPlaybackError;", "Lcom/vungle/ads/NetworkTimeoutError;", "Lcom/vungle/ads/NetworkUnreachable;", "Lcom/vungle/ads/NoSpaceError;", "Lcom/vungle/ads/OmSdkJsError;", "Lcom/vungle/ads/OutOfMemory;", "Lcom/vungle/ads/PlacementAdTypeMismatchError;", "Lcom/vungle/ads/PlacementMismatchError;", "Lcom/vungle/ads/PlacementNotFoundError;", "Lcom/vungle/ads/PrivacyIconFallbackError;", "Lcom/vungle/ads/PrivacyUrlError;", "Lcom/vungle/ads/SdkNotInitialized;", "Lcom/vungle/ads/SdkVersionTooLow;", "Lcom/vungle/ads/TpatError;", "Lcom/vungle/ads/UserAgentError;", "Lcom/vungle/ads/WebViewError;", "Lcom/vungle/ads/WebViewRenderProcessUnresponsive;", "Lcom/vungle/ads/WebViewRenderingProcessGone;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes5.dex */
public abstract class VungleError extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final Sdk.SDKError.Reason f32868a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String errorMessage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int code;

    /* renamed from: d, reason: collision with root package name */
    public s f32871d;

    public /* synthetic */ VungleError(Sdk.SDKError.Reason reason, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(reason, str);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!getClass().equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AbstractC3340k.c(other, "null cannot be cast to non-null type com.vungle.ads.VungleError");
        VungleError vungleError = (VungleError) other;
        return this.f32868a == vungleError.f32868a && AbstractC3340k.a(this.errorMessage, vungleError.errorMessage) && AbstractC3340k.a(this.f32871d, vungleError.f32871d);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Override // java.lang.Throwable
    @Nullable
    public String getLocalizedMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        int iC = N0.a.c(this.f32868a.hashCode() * 31, 31, this.errorMessage);
        s sVar = this.f32871d;
        return iC + (sVar != null ? sVar.hashCode() : 0);
    }

    @NotNull
    public final VungleError logError$vungle_ads_release() {
        logErrorNoReturnValue$vungle_ads_release();
        return this;
    }

    public final void logErrorNoReturnValue$vungle_ads_release() {
        AnalyticsClient.INSTANCE.c(this.f32868a, this.errorMessage, this.f32871d);
    }

    @NotNull
    public final VungleError setLogEntry$vungle_ads_release(@Nullable s logEntry) {
        this.f32871d = logEntry;
        return this;
    }

    public VungleError(Sdk.SDKError.Reason reason, String str) {
        super(str);
        this.f32868a = reason;
        this.errorMessage = str;
        this.code = reason.getNumber();
    }
}
