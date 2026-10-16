package com.qonversion.android.sdk.internal.dto.purchase;

import A7.AbstractC0279p0;
import N0.a;
import Va.M6;
import com.applovin.sdk.AppLovinEventTypes;
import hb.InterfaceC2812o;
import hb.s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/purchase/History;", "", AppLovinEventTypes.USER_VIEWED_PRODUCT, "", "purchaseToken", "purchaseTime", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getProduct", "()Ljava/lang/String;", "getPurchaseTime", "()J", "getPurchaseToken", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class History {

    @NotNull
    private final String product;
    private final long purchaseTime;

    @NotNull
    private final String purchaseToken;

    public History(@InterfaceC2812o(name = AppLovinEventTypes.USER_VIEWED_PRODUCT) @NotNull String product, @InterfaceC2812o(name = "purchase_token") @NotNull String purchaseToken, @InterfaceC2812o(name = "purchase_time") long j8) {
        AbstractC3340k.e(product, "product");
        AbstractC3340k.e(purchaseToken, "purchaseToken");
        this.product = product;
        this.purchaseToken = purchaseToken;
        this.purchaseTime = j8;
    }

    public static /* synthetic */ History copy$default(History history, String str, String str2, long j8, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = history.product;
        }
        if ((i5 & 2) != 0) {
            str2 = history.purchaseToken;
        }
        if ((i5 & 4) != 0) {
            j8 = history.purchaseTime;
        }
        return history.copy(str, str2, j8);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* renamed from: component3, reason: from getter */
    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    @NotNull
    public final History copy(@InterfaceC2812o(name = AppLovinEventTypes.USER_VIEWED_PRODUCT) @NotNull String product, @InterfaceC2812o(name = "purchase_token") @NotNull String purchaseToken, @InterfaceC2812o(name = "purchase_time") long purchaseTime) {
        AbstractC3340k.e(product, "product");
        AbstractC3340k.e(purchaseToken, "purchaseToken");
        return new History(product, purchaseToken, purchaseTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof History)) {
            return false;
        }
        History history = (History) other;
        return AbstractC3340k.a(this.product, history.product) && AbstractC3340k.a(this.purchaseToken, history.purchaseToken) && this.purchaseTime == history.purchaseTime;
    }

    @NotNull
    public final String getProduct() {
        return this.product;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    @NotNull
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public int hashCode() {
        int iC = a.c(this.product.hashCode() * 31, 31, this.purchaseToken);
        long j8 = this.purchaseTime;
        return iC + ((int) (j8 ^ (j8 >>> 32)));
    }

    @NotNull
    public String toString() {
        String str = this.product;
        String str2 = this.purchaseToken;
        return M6.s(AbstractC0279p0.r("History(product=", str, ", purchaseToken=", str2, ", purchaseTime="), this.purchaseTime, ")");
    }
}
