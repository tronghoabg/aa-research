package com.qonversion.android.sdk.dto;

import R8.v;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0006\u0010\u0018\u001a\u00020\u0000J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/qonversion/android/sdk/dto/QPurchaseModel;", "", InAppPurchaseMetaData.KEY_PRODUCT_ID, "", "offerId", "(Ljava/lang/String;Ljava/lang/String;)V", "applyOffer", "", "getApplyOffer$sdk_release", "()Z", "setApplyOffer$sdk_release", "(Z)V", "getOfferId", "()Ljava/lang/String;", "setOfferId", "(Ljava/lang/String;)V", "getProductId", "component1", "component2", "copy", "equals", "other", "hashCode", "", "removeOffer", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class QPurchaseModel {
    private boolean applyOffer;

    @Nullable
    private String offerId;

    @NotNull
    private final String productId;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QPurchaseModel(@NotNull String productId) {
        this(productId, null, 2, 0 == true ? 1 : 0);
        AbstractC3340k.e(productId, "productId");
    }

    public static /* synthetic */ QPurchaseModel copy$default(QPurchaseModel qPurchaseModel, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = qPurchaseModel.productId;
        }
        if ((i5 & 2) != 0) {
            str2 = qPurchaseModel.offerId;
        }
        return qPurchaseModel.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    @NotNull
    public final QPurchaseModel copy(@NotNull String productId, @Nullable String offerId) {
        AbstractC3340k.e(productId, "productId");
        return new QPurchaseModel(productId, offerId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QPurchaseModel)) {
            return false;
        }
        QPurchaseModel qPurchaseModel = (QPurchaseModel) other;
        return AbstractC3340k.a(this.productId, qPurchaseModel.productId) && AbstractC3340k.a(this.offerId, qPurchaseModel.offerId);
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
    public final String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        int iHashCode = this.productId.hashCode() * 31;
        String str = this.offerId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final QPurchaseModel removeOffer() {
        this.applyOffer = false;
        return this;
    }

    public final void setApplyOffer$sdk_release(boolean z2) {
        this.applyOffer = z2;
    }

    public final void setOfferId(@Nullable String str) {
        this.offerId = str;
    }

    @NotNull
    public String toString() {
        return v.g("QPurchaseModel(productId=", this.productId, ", offerId=", this.offerId, ")");
    }

    public QPurchaseModel(@NotNull String productId, @Nullable String str) {
        AbstractC3340k.e(productId, "productId");
        this.productId = productId;
        this.offerId = str;
        this.applyOffer = true;
    }

    public /* synthetic */ QPurchaseModel(String str, String str2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i5 & 2) != 0 ? null : str2);
    }
}
