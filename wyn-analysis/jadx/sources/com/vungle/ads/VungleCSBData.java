package com.vungle.ads;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001)J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u001e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R%\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/vungle/ads/VungleCSBData;", "Ljava/io/Serializable;", "", "other", "", "equals", "", "hashCode", "", "a", "D", "getBidFloor", "()D", "bidFloor", "", "b", "Ljava/lang/String;", "getAuctionId", "()Ljava/lang/String;", "auctionId", "c", "getCreativeId", "creativeId", "d", "getAdUnitId", HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID, "e", "I", "getPhase", "()I", "phase", "f", "Z", "isVXWinner", "()Z", "", "g", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "Builder", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes5.dex */
public final class VungleCSBData implements Serializable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final double bidFloor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String auctionId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String creativeId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String adUnitId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int phase;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean isVXWinner;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final Map extras;

    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006J\u001c\u0010\u000b\u001a\u00020\u00002\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tJ\u0006\u0010\r\u001a\u00020\f¨\u0006\u0012"}, d2 = {"Lcom/vungle/ads/VungleCSBData$Builder;", "", "", "auctionId", "creativeId", HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID, "", "isPriorityAccess", "isVXWinner", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "putExtras", "Lcom/vungle/ads/VungleCSBData;", "build", "", "bidFloor", "<init>", "(D)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final double f32861a;

        /* renamed from: b, reason: collision with root package name */
        public String f32862b;

        /* renamed from: c, reason: collision with root package name */
        public String f32863c;

        /* renamed from: d, reason: collision with root package name */
        public String f32864d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f32865e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f32866f;

        /* renamed from: g, reason: collision with root package name */
        public Map f32867g;

        public Builder(double d3) {
            this.f32861a = d3;
        }

        @NotNull
        public final Builder adUnitId(@Nullable String adUnitId) {
            this.f32864d = adUnitId;
            return this;
        }

        @NotNull
        public final Builder auctionId(@Nullable String auctionId) {
            this.f32862b = auctionId;
            return this;
        }

        @NotNull
        public final VungleCSBData build() {
            double d3 = this.f32861a;
            String str = this.f32862b;
            if (str == null) {
                str = "";
            }
            String str2 = this.f32863c;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = this.f32864d;
            return new VungleCSBData(d3, str, str2, str3 != null ? str3 : "", this.f32866f ? 2 : 1, this.f32865e, this.f32867g, null);
        }

        @NotNull
        public final Builder creativeId(@Nullable String creativeId) {
            this.f32863c = creativeId;
            return this;
        }

        @NotNull
        public final Builder isPriorityAccess(boolean isPriorityAccess) {
            this.f32866f = isPriorityAccess;
            return this;
        }

        @NotNull
        public final Builder isVXWinner(boolean isVXWinner) {
            this.f32865e = isVXWinner;
            return this;
        }

        @NotNull
        public final Builder putExtras(@Nullable Map<String, String> extras) {
            this.f32867g = extras;
            return this;
        }
    }

    public /* synthetic */ VungleCSBData(double d3, String str, String str2, String str3, int i5, boolean z2, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(d3, str, str2, str3, i5, z2, map);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VungleCSBData)) {
            return false;
        }
        VungleCSBData vungleCSBData = (VungleCSBData) other;
        return Double.compare(this.bidFloor, vungleCSBData.bidFloor) == 0 && AbstractC3340k.a(this.auctionId, vungleCSBData.auctionId) && AbstractC3340k.a(this.creativeId, vungleCSBData.creativeId) && AbstractC3340k.a(this.adUnitId, vungleCSBData.adUnitId) && this.phase == vungleCSBData.phase && this.isVXWinner == vungleCSBData.isVXWinner && AbstractC3340k.a(this.extras, vungleCSBData.extras);
    }

    @NotNull
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @NotNull
    public final String getAuctionId() {
        return this.auctionId;
    }

    public final double getBidFloor() {
        return this.bidFloor;
    }

    @NotNull
    public final String getCreativeId() {
        return this.creativeId;
    }

    @Nullable
    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final int getPhase() {
        return this.phase;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.bidFloor);
        int iC = ((this.isVXWinner ? 1231 : 1237) + ((N0.a.c(N0.a.c(N0.a.c(((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31, 31, this.auctionId), 31, this.creativeId), 31, this.adUnitId) + this.phase) * 31)) * 31;
        Map map = this.extras;
        return iC + (map != null ? map.hashCode() : 0);
    }

    /* renamed from: isVXWinner, reason: from getter */
    public final boolean getIsVXWinner() {
        return this.isVXWinner;
    }

    public VungleCSBData(double d3, String str, String str2, String str3, int i5, boolean z2, Map map) {
        this.bidFloor = d3;
        this.auctionId = str;
        this.creativeId = str2;
        this.adUnitId = str3;
        this.phase = i5;
        this.isVXWinner = z2;
        this.extras = map;
    }
}
