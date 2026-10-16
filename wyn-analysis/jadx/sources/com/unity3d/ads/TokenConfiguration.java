package com.unity3d.ads;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import ff.w;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\u0018\u00002\u00020\u0001:\u0001'B_\b\u0013\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0002\u0010\u0010R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0013R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\r\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0013\u001a\u0004\b$\u0010%R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b&\u0010\"¨\u0006("}, d2 = {"Lcom/unity3d/ads/TokenConfiguration;", "", "adFormat", "Lcom/unity3d/ads/AdFormat;", "mediationInfo", "Lcom/unity3d/ads/MediationInfo;", HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID, "", "bannerSize", "Lcom/unity3d/ads/BannerSize;", "mediationAdUnitId", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "isNewApi", "", "(Lcom/unity3d/ads/AdFormat;Lcom/unity3d/ads/MediationInfo;Ljava/lang/String;Lcom/unity3d/ads/BannerSize;Ljava/lang/String;Ljava/util/Map;Z)V", "(Lcom/unity3d/ads/AdFormat;Ljava/util/Map;)V", "_bannerSize", "get_bannerSize$annotations", "()V", "_isNewApi", "_mediationAdUnitId", "_mediationInfo", "get_mediationInfo$annotations", "_placementId", "getAdFormat", "()Lcom/unity3d/ads/AdFormat;", "getBannerSize$annotations", "getBannerSize", "()Lcom/unity3d/ads/BannerSize;", "getExtras", "()Ljava/util/Map;", "()Z", "getMediationAdUnitId", "()Ljava/lang/String;", "getMediationInfo$annotations", "getMediationInfo", "()Lcom/unity3d/ads/MediationInfo;", "getPlacementId", "Builder", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TokenConfiguration {

    @Nullable
    private BannerSize _bannerSize;
    private boolean _isNewApi;

    @Nullable
    private String _mediationAdUnitId;

    @Nullable
    private MediationInfo _mediationInfo;

    @Nullable
    private String _placementId;

    @NotNull
    private final AdFormat adFormat;

    @NotNull
    private final Map<String, String> extras;

    @UnityAdsExperimental
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\u0011\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/TokenConfiguration$Builder;", "", "adFormat", "Lcom/unity3d/ads/AdFormat;", "(Lcom/unity3d/ads/AdFormat;)V", "bannerSize", "Lcom/unity3d/ads/BannerSize;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "", "mediationAdUnitId", "mediationInfo", "Lcom/unity3d/ads/MediationInfo;", HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID, "build", "Lcom/unity3d/ads/TokenConfiguration;", "withBannerSize", "withExtras", "withMediationAdUnitId", "withMediationInfo", "withPlacementId", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private final AdFormat adFormat;

        @Nullable
        private BannerSize bannerSize;

        @NotNull
        private Map<String, String> extras;

        @Nullable
        private String mediationAdUnitId;

        @Nullable
        private MediationInfo mediationInfo;

        @Nullable
        private String placementId;

        public Builder(@NotNull AdFormat adFormat) {
            AbstractC3340k.e(adFormat, "adFormat");
            this.adFormat = adFormat;
            this.extras = w.f35433a;
        }

        @NotNull
        public final TokenConfiguration build() {
            return new TokenConfiguration(this.adFormat, this.mediationInfo, this.placementId, this.bannerSize, this.mediationAdUnitId, this.extras, true, null);
        }

        @NotNull
        public final Builder withBannerSize(@Nullable BannerSize bannerSize) {
            this.bannerSize = bannerSize;
            return this;
        }

        @NotNull
        public final Builder withExtras(@NotNull Map<String, String> extras) {
            AbstractC3340k.e(extras, "extras");
            this.extras = extras;
            return this;
        }

        @NotNull
        public final Builder withMediationAdUnitId(@Nullable String mediationAdUnitId) {
            this.mediationAdUnitId = mediationAdUnitId;
            return this;
        }

        @NotNull
        public final Builder withMediationInfo(@Nullable MediationInfo mediationInfo) {
            this.mediationInfo = mediationInfo;
            return this;
        }

        @NotNull
        public final Builder withPlacementId(@Nullable String placementId) {
            this.placementId = placementId;
            return this;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TokenConfiguration(@NotNull AdFormat adFormat) {
        this(adFormat, null, 2, 0 == true ? 1 : 0);
        AbstractC3340k.e(adFormat, "adFormat");
    }

    @UnityAdsExperimental
    public static /* synthetic */ void getBannerSize$annotations() {
    }

    @UnityAdsExperimental
    public static /* synthetic */ void getMediationInfo$annotations() {
    }

    @UnityAdsExperimental
    private static /* synthetic */ void get_bannerSize$annotations() {
    }

    @UnityAdsExperimental
    private static /* synthetic */ void get_mediationInfo$annotations() {
    }

    @NotNull
    public final AdFormat getAdFormat() {
        return this.adFormat;
    }

    @Nullable
    /* renamed from: getBannerSize, reason: from getter */
    public final BannerSize get_bannerSize() {
        return this._bannerSize;
    }

    @NotNull
    public final Map<String, String> getExtras() {
        return this.extras;
    }

    @Nullable
    /* renamed from: getMediationAdUnitId, reason: from getter */
    public final String get_mediationAdUnitId() {
        return this._mediationAdUnitId;
    }

    @Nullable
    /* renamed from: getMediationInfo, reason: from getter */
    public final MediationInfo get_mediationInfo() {
        return this._mediationInfo;
    }

    @Nullable
    /* renamed from: getPlacementId, reason: from getter */
    public final String get_placementId() {
        return this._placementId;
    }

    /* renamed from: isNewApi, reason: from getter */
    public final boolean get_isNewApi() {
        return this._isNewApi;
    }

    public /* synthetic */ TokenConfiguration(AdFormat adFormat, MediationInfo mediationInfo, String str, BannerSize bannerSize, String str2, Map map, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormat, mediationInfo, str, bannerSize, str2, map, z2);
    }

    public TokenConfiguration(@NotNull AdFormat adFormat, @NotNull Map<String, String> extras) {
        AbstractC3340k.e(adFormat, "adFormat");
        AbstractC3340k.e(extras, "extras");
        this.adFormat = adFormat;
        this.extras = extras;
    }

    public /* synthetic */ TokenConfiguration(AdFormat adFormat, Map map, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormat, (i5 & 2) != 0 ? w.f35433a : map);
    }

    public /* synthetic */ TokenConfiguration(AdFormat adFormat, MediationInfo mediationInfo, String str, BannerSize bannerSize, String str2, Map map, boolean z2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormat, (i5 & 2) != 0 ? null : mediationInfo, (i5 & 4) != 0 ? null : str, (i5 & 8) != 0 ? null : bannerSize, (i5 & 16) != 0 ? null : str2, (i5 & 32) != 0 ? w.f35433a : map, (i5 & 64) != 0 ? false : z2);
    }

    @UnityAdsExperimental
    private TokenConfiguration(AdFormat adFormat, MediationInfo mediationInfo, String str, BannerSize bannerSize, String str2, Map<String, String> map, boolean z2) {
        this(adFormat, map);
        this._mediationInfo = mediationInfo;
        this._placementId = str;
        this._bannerSize = bannerSize;
        this._mediationAdUnitId = str2;
        this._isNewApi = z2;
    }
}
