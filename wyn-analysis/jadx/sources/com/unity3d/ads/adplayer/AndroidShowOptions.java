package com.unity3d.ads.adplayer;

import A7.AbstractC0279p0;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003Js\u0010 \u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidShowOptions;", "Lcom/unity3d/ads/adplayer/ShowOptions;", "unityAdsShowOptions", "", "", "", HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID, "isScarAd", "", "scarQueryId", "scarAdString", "scarAdUnitId", "isOfferwallAd", "offerwallPlacementName", "(Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "()Z", "getOfferwallPlacementName", "()Ljava/lang/String;", "getPlacementId", "getScarAdString", "getScarAdUnitId", "getScarQueryId", "getUnityAdsShowOptions", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AndroidShowOptions implements ShowOptions {
    private final boolean isOfferwallAd;
    private final boolean isScarAd;

    @Nullable
    private final String offerwallPlacementName;

    @Nullable
    private final String placementId;

    @Nullable
    private final String scarAdString;

    @Nullable
    private final String scarAdUnitId;

    @Nullable
    private final String scarQueryId;

    @Nullable
    private final Map<String, Object> unityAdsShowOptions;

    public AndroidShowOptions(@Nullable Map<String, ? extends Object> map, @Nullable String str, boolean z2, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z10, @Nullable String str5) {
        this.unityAdsShowOptions = map;
        this.placementId = str;
        this.isScarAd = z2;
        this.scarQueryId = str2;
        this.scarAdString = str3;
        this.scarAdUnitId = str4;
        this.isOfferwallAd = z10;
        this.offerwallPlacementName = str5;
    }

    public static /* synthetic */ AndroidShowOptions copy$default(AndroidShowOptions androidShowOptions, Map map, String str, boolean z2, String str2, String str3, String str4, boolean z10, String str5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            map = androidShowOptions.unityAdsShowOptions;
        }
        if ((i5 & 2) != 0) {
            str = androidShowOptions.placementId;
        }
        if ((i5 & 4) != 0) {
            z2 = androidShowOptions.isScarAd;
        }
        if ((i5 & 8) != 0) {
            str2 = androidShowOptions.scarQueryId;
        }
        if ((i5 & 16) != 0) {
            str3 = androidShowOptions.scarAdString;
        }
        if ((i5 & 32) != 0) {
            str4 = androidShowOptions.scarAdUnitId;
        }
        if ((i5 & 64) != 0) {
            z10 = androidShowOptions.isOfferwallAd;
        }
        if ((i5 & 128) != 0) {
            str5 = androidShowOptions.offerwallPlacementName;
        }
        boolean z11 = z10;
        String str6 = str5;
        String str7 = str3;
        String str8 = str4;
        return androidShowOptions.copy(map, str, z2, str2, str7, str8, z11, str6);
    }

    @Nullable
    public final Map<String, Object> component1() {
        return this.unityAdsShowOptions;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsScarAd() {
        return this.isScarAd;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getScarAdString() {
        return this.scarAdString;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsOfferwallAd() {
        return this.isOfferwallAd;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    @NotNull
    public final AndroidShowOptions copy(@Nullable Map<String, ? extends Object> unityAdsShowOptions, @Nullable String placementId, boolean isScarAd, @Nullable String scarQueryId, @Nullable String scarAdString, @Nullable String scarAdUnitId, boolean isOfferwallAd, @Nullable String offerwallPlacementName) {
        return new AndroidShowOptions(unityAdsShowOptions, placementId, isScarAd, scarQueryId, scarAdString, scarAdUnitId, isOfferwallAd, offerwallPlacementName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidShowOptions)) {
            return false;
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) other;
        return AbstractC3340k.a(this.unityAdsShowOptions, androidShowOptions.unityAdsShowOptions) && AbstractC3340k.a(this.placementId, androidShowOptions.placementId) && this.isScarAd == androidShowOptions.isScarAd && AbstractC3340k.a(this.scarQueryId, androidShowOptions.scarQueryId) && AbstractC3340k.a(this.scarAdString, androidShowOptions.scarAdString) && AbstractC3340k.a(this.scarAdUnitId, androidShowOptions.scarAdUnitId) && this.isOfferwallAd == androidShowOptions.isOfferwallAd && AbstractC3340k.a(this.offerwallPlacementName, androidShowOptions.offerwallPlacementName);
    }

    @Nullable
    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    @Nullable
    public final String getPlacementId() {
        return this.placementId;
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
    public final Map<String, Object> getUnityAdsShowOptions() {
        return this.unityAdsShowOptions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Map<String, Object> map = this.unityAdsShowOptions;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.placementId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z2 = this.isScarAd;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int i10 = (iHashCode2 + i5) * 31;
        String str2 = this.scarQueryId;
        int iHashCode3 = (i10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scarAdString;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scarAdUnitId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z10 = this.isOfferwallAd;
        int i11 = (iHashCode5 + (z10 ? 1 : z10 ? 1 : 0)) * 31;
        String str5 = this.offerwallPlacementName;
        return i11 + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidShowOptions(unityAdsShowOptions=");
        sb2.append(this.unityAdsShowOptions);
        sb2.append(", placementId=");
        sb2.append(this.placementId);
        sb2.append(", isScarAd=");
        sb2.append(this.isScarAd);
        sb2.append(", scarQueryId=");
        sb2.append(this.scarQueryId);
        sb2.append(", scarAdString=");
        sb2.append(this.scarAdString);
        sb2.append(", scarAdUnitId=");
        sb2.append(this.scarAdUnitId);
        sb2.append(", isOfferwallAd=");
        sb2.append(this.isOfferwallAd);
        sb2.append(", offerwallPlacementName=");
        return AbstractC0279p0.n(sb2, this.offerwallPlacementName, ')');
    }

    public /* synthetic */ AndroidShowOptions(Map map, String str, boolean z2, String str2, String str3, String str4, boolean z10, String str5, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i5 & 2) != 0 ? null : str, (i5 & 4) != 0 ? false : z2, (i5 & 8) != 0 ? null : str2, (i5 & 16) != 0 ? null : str3, (i5 & 32) != 0 ? null : str4, (i5 & 64) != 0 ? false : z10, (i5 & 128) != 0 ? null : str5);
    }
}
