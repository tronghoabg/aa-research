package com.qonversion.android.sdk.internal.dto.purchase;

import N0.a;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventTypes;
import hb.InterfaceC2812o;
import hb.s;
import java.util.List;
import ka.AbstractC3256n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Jc\u0010!\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006("}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;", "", "purchaseToken", "", "purchaseTime", "", "transactionId", "originalTransactionId", "storeProductId", "qProductId", "contextKeys", "", "screenUid", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getContextKeys", "()Ljava/util/List;", "getOriginalTransactionId", "()Ljava/lang/String;", "getPurchaseTime", "()J", "getPurchaseToken", "getQProductId", "getScreenUid", "getStoreProductId", "getTransactionId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PurchaseDetails {

    @Nullable
    private final List<String> contextKeys;

    @NotNull
    private final String originalTransactionId;
    private final long purchaseTime;

    @NotNull
    private final String purchaseToken;

    @NotNull
    private final String qProductId;

    @Nullable
    private final String screenUid;

    @NotNull
    private final String storeProductId;

    @NotNull
    private final String transactionId;

    public PurchaseDetails(@InterfaceC2812o(name = "purchase_token") @NotNull String purchaseToken, @InterfaceC2812o(name = "purchase_time") long j8, @InterfaceC2812o(name = AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER) @NotNull String transactionId, @InterfaceC2812o(name = "original_transaction_id") @NotNull String originalTransactionId, @InterfaceC2812o(name = AppLovinEventTypes.USER_VIEWED_PRODUCT) @NotNull String storeProductId, @InterfaceC2812o(name = "product_id") @NotNull String qProductId, @InterfaceC2812o(name = "context_keys") @Nullable List<String> list, @InterfaceC2812o(name = "screen_uid") @Nullable String str) {
        AbstractC3340k.e(purchaseToken, "purchaseToken");
        AbstractC3340k.e(transactionId, "transactionId");
        AbstractC3340k.e(originalTransactionId, "originalTransactionId");
        AbstractC3340k.e(storeProductId, "storeProductId");
        AbstractC3340k.e(qProductId, "qProductId");
        this.purchaseToken = purchaseToken;
        this.purchaseTime = j8;
        this.transactionId = transactionId;
        this.originalTransactionId = originalTransactionId;
        this.storeProductId = storeProductId;
        this.qProductId = qProductId;
        this.contextKeys = list;
        this.screenUid = str;
    }

    public static /* synthetic */ PurchaseDetails copy$default(PurchaseDetails purchaseDetails, String str, long j8, String str2, String str3, String str4, String str5, List list, String str6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = purchaseDetails.purchaseToken;
        }
        if ((i5 & 2) != 0) {
            j8 = purchaseDetails.purchaseTime;
        }
        if ((i5 & 4) != 0) {
            str2 = purchaseDetails.transactionId;
        }
        if ((i5 & 8) != 0) {
            str3 = purchaseDetails.originalTransactionId;
        }
        if ((i5 & 16) != 0) {
            str4 = purchaseDetails.storeProductId;
        }
        if ((i5 & 32) != 0) {
            str5 = purchaseDetails.qProductId;
        }
        if ((i5 & 64) != 0) {
            list = purchaseDetails.contextKeys;
        }
        if ((i5 & 128) != 0) {
            str6 = purchaseDetails.screenUid;
        }
        List list2 = list;
        String str7 = str6;
        return purchaseDetails.copy(str, j8, str2, str3, str4, str5, list2, str7);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* renamed from: component2, reason: from getter */
    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getOriginalTransactionId() {
        return this.originalTransactionId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getStoreProductId() {
        return this.storeProductId;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getQProductId() {
        return this.qProductId;
    }

    @Nullable
    public final List<String> component7() {
        return this.contextKeys;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getScreenUid() {
        return this.screenUid;
    }

    @NotNull
    public final PurchaseDetails copy(@InterfaceC2812o(name = "purchase_token") @NotNull String purchaseToken, @InterfaceC2812o(name = "purchase_time") long purchaseTime, @InterfaceC2812o(name = AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER) @NotNull String transactionId, @InterfaceC2812o(name = "original_transaction_id") @NotNull String originalTransactionId, @InterfaceC2812o(name = AppLovinEventTypes.USER_VIEWED_PRODUCT) @NotNull String storeProductId, @InterfaceC2812o(name = "product_id") @NotNull String qProductId, @InterfaceC2812o(name = "context_keys") @Nullable List<String> contextKeys, @InterfaceC2812o(name = "screen_uid") @Nullable String screenUid) {
        AbstractC3340k.e(purchaseToken, "purchaseToken");
        AbstractC3340k.e(transactionId, "transactionId");
        AbstractC3340k.e(originalTransactionId, "originalTransactionId");
        AbstractC3340k.e(storeProductId, "storeProductId");
        AbstractC3340k.e(qProductId, "qProductId");
        return new PurchaseDetails(purchaseToken, purchaseTime, transactionId, originalTransactionId, storeProductId, qProductId, contextKeys, screenUid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseDetails)) {
            return false;
        }
        PurchaseDetails purchaseDetails = (PurchaseDetails) other;
        return AbstractC3340k.a(this.purchaseToken, purchaseDetails.purchaseToken) && this.purchaseTime == purchaseDetails.purchaseTime && AbstractC3340k.a(this.transactionId, purchaseDetails.transactionId) && AbstractC3340k.a(this.originalTransactionId, purchaseDetails.originalTransactionId) && AbstractC3340k.a(this.storeProductId, purchaseDetails.storeProductId) && AbstractC3340k.a(this.qProductId, purchaseDetails.qProductId) && AbstractC3340k.a(this.contextKeys, purchaseDetails.contextKeys) && AbstractC3340k.a(this.screenUid, purchaseDetails.screenUid);
    }

    @Nullable
    public final List<String> getContextKeys() {
        return this.contextKeys;
    }

    @NotNull
    public final String getOriginalTransactionId() {
        return this.originalTransactionId;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    @NotNull
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    @NotNull
    public final String getQProductId() {
        return this.qProductId;
    }

    @Nullable
    public final String getScreenUid() {
        return this.screenUid;
    }

    @NotNull
    public final String getStoreProductId() {
        return this.storeProductId;
    }

    @NotNull
    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        int iHashCode = this.purchaseToken.hashCode() * 31;
        long j8 = this.purchaseTime;
        int iC = a.c(a.c(a.c(a.c((iHashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31, 31, this.transactionId), 31, this.originalTransactionId), 31, this.storeProductId), 31, this.qProductId);
        List<String> list = this.contextKeys;
        int iHashCode2 = (iC + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.screenUid;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.purchaseToken;
        long j8 = this.purchaseTime;
        String str2 = this.transactionId;
        String str3 = this.originalTransactionId;
        String str4 = this.storeProductId;
        String str5 = this.qProductId;
        List<String> list = this.contextKeys;
        String str6 = this.screenUid;
        StringBuilder sb2 = new StringBuilder("PurchaseDetails(purchaseToken=");
        sb2.append(str);
        sb2.append(", purchaseTime=");
        sb2.append(j8);
        AbstractC3256n.p(sb2, ", transactionId=", str2, ", originalTransactionId=", str3);
        AbstractC3256n.p(sb2, ", storeProductId=", str4, ", qProductId=", str5);
        sb2.append(", contextKeys=");
        sb2.append(list);
        sb2.append(", screenUid=");
        sb2.append(str6);
        sb2.append(")");
        return sb2.toString();
    }
}
