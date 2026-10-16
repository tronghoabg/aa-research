package com.qonversion.android.sdk.internal.purchase;

import A7.AbstractC0279p0;
import N0.a;
import Va.M6;
import hb.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J[\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006%"}, d2 = {"Lcom/qonversion/android/sdk/internal/purchase/Purchase;", "", "storeProductId", "", "orderId", "originalOrderId", "purchaseTime", "", "purchaseToken", "contextKeys", "", "screenUid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getContextKeys", "()Ljava/util/List;", "getOrderId", "()Ljava/lang/String;", "getOriginalOrderId", "getPurchaseTime", "()J", "getPurchaseToken", "getScreenUid", "getStoreProductId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Purchase {

    @Nullable
    private final List<String> contextKeys;

    @NotNull
    private final String orderId;

    @NotNull
    private final String originalOrderId;
    private final long purchaseTime;

    @NotNull
    private final String purchaseToken;

    @Nullable
    private final String screenUid;

    @Nullable
    private final String storeProductId;

    public Purchase(@Nullable String str, @NotNull String orderId, @NotNull String originalOrderId, long j8, @NotNull String purchaseToken, @Nullable List<String> list, @Nullable String str2) {
        AbstractC3340k.e(orderId, "orderId");
        AbstractC3340k.e(originalOrderId, "originalOrderId");
        AbstractC3340k.e(purchaseToken, "purchaseToken");
        this.storeProductId = str;
        this.orderId = orderId;
        this.originalOrderId = originalOrderId;
        this.purchaseTime = j8;
        this.purchaseToken = purchaseToken;
        this.contextKeys = list;
        this.screenUid = str2;
    }

    public static /* synthetic */ Purchase copy$default(Purchase purchase, String str, String str2, String str3, long j8, String str4, List list, String str5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = purchase.storeProductId;
        }
        if ((i5 & 2) != 0) {
            str2 = purchase.orderId;
        }
        if ((i5 & 4) != 0) {
            str3 = purchase.originalOrderId;
        }
        if ((i5 & 8) != 0) {
            j8 = purchase.purchaseTime;
        }
        if ((i5 & 16) != 0) {
            str4 = purchase.purchaseToken;
        }
        if ((i5 & 32) != 0) {
            list = purchase.contextKeys;
        }
        if ((i5 & 64) != 0) {
            str5 = purchase.screenUid;
        }
        String str6 = str5;
        String str7 = str4;
        long j10 = j8;
        String str8 = str3;
        return purchase.copy(str, str2, str8, j10, str7, list, str6);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getStoreProductId() {
        return this.storeProductId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getOriginalOrderId() {
        return this.originalOrderId;
    }

    /* renamed from: component4, reason: from getter */
    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    @Nullable
    public final List<String> component6() {
        return this.contextKeys;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getScreenUid() {
        return this.screenUid;
    }

    @NotNull
    public final Purchase copy(@Nullable String storeProductId, @NotNull String orderId, @NotNull String originalOrderId, long purchaseTime, @NotNull String purchaseToken, @Nullable List<String> contextKeys, @Nullable String screenUid) {
        AbstractC3340k.e(orderId, "orderId");
        AbstractC3340k.e(originalOrderId, "originalOrderId");
        AbstractC3340k.e(purchaseToken, "purchaseToken");
        return new Purchase(storeProductId, orderId, originalOrderId, purchaseTime, purchaseToken, contextKeys, screenUid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) other;
        return AbstractC3340k.a(this.storeProductId, purchase.storeProductId) && AbstractC3340k.a(this.orderId, purchase.orderId) && AbstractC3340k.a(this.originalOrderId, purchase.originalOrderId) && this.purchaseTime == purchase.purchaseTime && AbstractC3340k.a(this.purchaseToken, purchase.purchaseToken) && AbstractC3340k.a(this.contextKeys, purchase.contextKeys) && AbstractC3340k.a(this.screenUid, purchase.screenUid);
    }

    @Nullable
    public final List<String> getContextKeys() {
        return this.contextKeys;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getOriginalOrderId() {
        return this.originalOrderId;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    @NotNull
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    @Nullable
    public final String getScreenUid() {
        return this.screenUid;
    }

    @Nullable
    public final String getStoreProductId() {
        return this.storeProductId;
    }

    public int hashCode() {
        String str = this.storeProductId;
        int iC = a.c(a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.orderId), 31, this.originalOrderId);
        long j8 = this.purchaseTime;
        int iC2 = a.c((iC + ((int) (j8 ^ (j8 >>> 32)))) * 31, 31, this.purchaseToken);
        List<String> list = this.contextKeys;
        int iHashCode = (iC2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.screenUid;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.storeProductId;
        String str2 = this.orderId;
        String str3 = this.originalOrderId;
        long j8 = this.purchaseTime;
        String str4 = this.purchaseToken;
        List<String> list = this.contextKeys;
        String str5 = this.screenUid;
        StringBuilder sbR = AbstractC0279p0.r("Purchase(storeProductId=", str, ", orderId=", str2, ", originalOrderId=");
        sbR.append(str3);
        sbR.append(", purchaseTime=");
        sbR.append(j8);
        sbR.append(", purchaseToken=");
        sbR.append(str4);
        sbR.append(", contextKeys=");
        sbR.append(list);
        return M6.t(sbR, ", screenUid=", str5, ")");
    }
}
