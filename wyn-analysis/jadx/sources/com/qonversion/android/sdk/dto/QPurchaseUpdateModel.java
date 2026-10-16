package com.qonversion.android.sdk.dto;

import A7.AbstractC0279p0;
import N0.a;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0006\u0010#\u001a\u00020\u0000J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\t\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006%"}, d2 = {"Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;", "", InAppPurchaseMetaData.KEY_PRODUCT_ID, "", "oldProductId", "updatePolicy", "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;", "offerId", "(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Ljava/lang/String;)V", "applyOffer", "", "getApplyOffer$sdk_release", "()Z", "setApplyOffer$sdk_release", "(Z)V", "getOfferId", "()Ljava/lang/String;", "setOfferId", "(Ljava/lang/String;)V", "getOldProductId", "setOldProductId", "getProductId", "getUpdatePolicy", "()Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;", "setUpdatePolicy", "(Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "removeOffer", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class QPurchaseUpdateModel {
    private boolean applyOffer;

    @Nullable
    private String offerId;

    @NotNull
    private String oldProductId;

    @NotNull
    private final String productId;

    @Nullable
    private QPurchaseUpdatePolicy updatePolicy;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QPurchaseUpdateModel(@NotNull String productId, @NotNull String oldProductId) {
        this(productId, oldProductId, null, null, 12, null);
        AbstractC3340k.e(productId, "productId");
        AbstractC3340k.e(oldProductId, "oldProductId");
    }

    public static /* synthetic */ QPurchaseUpdateModel copy$default(QPurchaseUpdateModel qPurchaseUpdateModel, String str, String str2, QPurchaseUpdatePolicy qPurchaseUpdatePolicy, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = qPurchaseUpdateModel.productId;
        }
        if ((i5 & 2) != 0) {
            str2 = qPurchaseUpdateModel.oldProductId;
        }
        if ((i5 & 4) != 0) {
            qPurchaseUpdatePolicy = qPurchaseUpdateModel.updatePolicy;
        }
        if ((i5 & 8) != 0) {
            str3 = qPurchaseUpdateModel.offerId;
        }
        return qPurchaseUpdateModel.copy(str, str2, qPurchaseUpdatePolicy, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getOldProductId() {
        return this.oldProductId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final QPurchaseUpdatePolicy getUpdatePolicy() {
        return this.updatePolicy;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    @NotNull
    public final QPurchaseUpdateModel copy(@NotNull String productId, @NotNull String oldProductId, @Nullable QPurchaseUpdatePolicy updatePolicy, @Nullable String offerId) {
        AbstractC3340k.e(productId, "productId");
        AbstractC3340k.e(oldProductId, "oldProductId");
        return new QPurchaseUpdateModel(productId, oldProductId, updatePolicy, offerId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QPurchaseUpdateModel)) {
            return false;
        }
        QPurchaseUpdateModel qPurchaseUpdateModel = (QPurchaseUpdateModel) other;
        return AbstractC3340k.a(this.productId, qPurchaseUpdateModel.productId) && AbstractC3340k.a(this.oldProductId, qPurchaseUpdateModel.oldProductId) && this.updatePolicy == qPurchaseUpdateModel.updatePolicy && AbstractC3340k.a(this.offerId, qPurchaseUpdateModel.offerId);
    }

    /* renamed from: getApplyOffer$sdk_release, reason: from getter */
    public final boolean getApplyOffer() {
        return this.applyOffer;
    }

    @Nullable
    public final String getOfferId() {
        return this.offerId;
    }

    @NotNull
    public final String getOldProductId() {
        return this.oldProductId;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    @Nullable
    public final QPurchaseUpdatePolicy getUpdatePolicy() {
        return this.updatePolicy;
    }

    public int hashCode() {
        int iC = a.c(this.productId.hashCode() * 31, 31, this.oldProductId);
        QPurchaseUpdatePolicy qPurchaseUpdatePolicy = this.updatePolicy;
        int iHashCode = (iC + (qPurchaseUpdatePolicy == null ? 0 : qPurchaseUpdatePolicy.hashCode())) * 31;
        String str = this.offerId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final QPurchaseUpdateModel removeOffer() {
        this.applyOffer = false;
        return this;
    }

    public final void setApplyOffer$sdk_release(boolean z2) {
        this.applyOffer = z2;
    }

    public final void setOfferId(@Nullable String str) {
        this.offerId = str;
    }

    public final void setOldProductId(@NotNull String str) {
        AbstractC3340k.e(str, "<set-?>");
        this.oldProductId = str;
    }

    public final void setUpdatePolicy(@Nullable QPurchaseUpdatePolicy qPurchaseUpdatePolicy) {
        this.updatePolicy = qPurchaseUpdatePolicy;
    }

    @NotNull
    public String toString() {
        String str = this.productId;
        String str2 = this.oldProductId;
        QPurchaseUpdatePolicy qPurchaseUpdatePolicy = this.updatePolicy;
        String str3 = this.offerId;
        StringBuilder sbR = AbstractC0279p0.r("QPurchaseUpdateModel(productId=", str, ", oldProductId=", str2, ", updatePolicy=");
        sbR.append(qPurchaseUpdatePolicy);
        sbR.append(", offerId=");
        sbR.append(str3);
        sbR.append(")");
        return sbR.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QPurchaseUpdateModel(@NotNull String productId, @NotNull String oldProductId, @Nullable QPurchaseUpdatePolicy qPurchaseUpdatePolicy) {
        this(productId, oldProductId, qPurchaseUpdatePolicy, null, 8, null);
        AbstractC3340k.e(productId, "productId");
        AbstractC3340k.e(oldProductId, "oldProductId");
    }

    public QPurchaseUpdateModel(@NotNull String productId, @NotNull String oldProductId, @Nullable QPurchaseUpdatePolicy qPurchaseUpdatePolicy, @Nullable String str) {
        AbstractC3340k.e(productId, "productId");
        AbstractC3340k.e(oldProductId, "oldProductId");
        this.productId = productId;
        this.oldProductId = oldProductId;
        this.updatePolicy = qPurchaseUpdatePolicy;
        this.offerId = str;
        this.applyOffer = true;
    }

    public /* synthetic */ QPurchaseUpdateModel(String str, String str2, QPurchaseUpdatePolicy qPurchaseUpdatePolicy, String str3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i5 & 4) != 0 ? null : qPurchaseUpdatePolicy, (i5 & 8) != 0 ? null : str3);
    }
}
