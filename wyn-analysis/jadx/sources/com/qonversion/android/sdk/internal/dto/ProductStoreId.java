package com.qonversion.android.sdk.internal.dto;

import A7.AbstractC0279p0;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wg.b;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/ProductStoreId;", "", InAppPurchaseMetaData.KEY_PRODUCT_ID, "", "basePlanId", "offerId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBasePlanId", "()Ljava/lang/String;", "getOfferId", "getProductId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductStoreId {

    @Nullable
    private final String basePlanId;

    @Nullable
    private final String offerId;

    @NotNull
    private final String productId;

    public ProductStoreId(@NotNull String productId, @Nullable String str, @Nullable String str2) {
        AbstractC3340k.e(productId, "productId");
        this.productId = productId;
        this.basePlanId = str;
        this.offerId = str2;
    }

    public static /* synthetic */ ProductStoreId copy$default(ProductStoreId productStoreId, String str, String str2, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = productStoreId.productId;
        }
        if ((i5 & 2) != 0) {
            str2 = productStoreId.basePlanId;
        }
        if ((i5 & 4) != 0) {
            str3 = productStoreId.offerId;
        }
        return productStoreId.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    @NotNull
    public final ProductStoreId copy(@NotNull String productId, @Nullable String basePlanId, @Nullable String offerId) {
        AbstractC3340k.e(productId, "productId");
        return new ProductStoreId(productId, basePlanId, offerId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductStoreId)) {
            return false;
        }
        ProductStoreId productStoreId = (ProductStoreId) other;
        return AbstractC3340k.a(this.productId, productStoreId.productId) && AbstractC3340k.a(this.basePlanId, productStoreId.basePlanId) && AbstractC3340k.a(this.offerId, productStoreId.offerId);
    }

    @Nullable
    public final String getBasePlanId() {
        return this.basePlanId;
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
        String str = this.basePlanId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.offerId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.productId;
        String str2 = this.basePlanId;
        return b.c(AbstractC0279p0.r("ProductStoreId(productId=", str, ", basePlanId=", str2, ", offerId="), this.offerId, ")");
    }

    public /* synthetic */ ProductStoreId(String str, String str2, String str3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i5 & 4) != 0 ? null : str3);
    }
}
