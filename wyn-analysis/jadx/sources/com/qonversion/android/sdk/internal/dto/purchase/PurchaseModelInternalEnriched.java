package com.qonversion.android.sdk.internal.dto.purchase;

import com.applovin.sdk.AppLovinEventTypes;
import com.qonversion.android.sdk.dto.QPurchaseOptions;
import com.qonversion.android.sdk.dto.QPurchaseUpdatePolicy;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B3\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;", "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;", "purchaseModel", AppLovinEventTypes.USER_VIEWED_PRODUCT, "Lcom/qonversion/android/sdk/dto/products/QProduct;", "(Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/dto/products/QProduct;)V", InAppPurchaseMetaData.KEY_PRODUCT_ID, "", "oldProduct", "updatePolicy", "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;", "options", "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;", "(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)V", "getOldProduct", "()Lcom/qonversion/android/sdk/dto/products/QProduct;", "getProduct", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PurchaseModelInternalEnriched extends PurchaseModelInternal {

    @Nullable
    private final QProduct oldProduct;

    @NotNull
    private final QProduct product;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseModelInternalEnriched(@NotNull String productId, @NotNull QProduct product, @Nullable QProduct qProduct, @Nullable QPurchaseUpdatePolicy qPurchaseUpdatePolicy, @Nullable QPurchaseOptions qPurchaseOptions) {
        super(productId, qProduct != null ? qProduct.getQonversionID() : null, qPurchaseUpdatePolicy, qPurchaseOptions);
        AbstractC3340k.e(productId, "productId");
        AbstractC3340k.e(product, "product");
        this.product = product;
        this.oldProduct = qProduct;
    }

    @Nullable
    public final QProduct getOldProduct() {
        return this.oldProduct;
    }

    @NotNull
    public final QProduct getProduct() {
        return this.product;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PurchaseModelInternalEnriched(@NotNull PurchaseModelInternal purchaseModel, @NotNull QProduct product) {
        AbstractC3340k.e(purchaseModel, "purchaseModel");
        AbstractC3340k.e(product, "product");
        String productId = purchaseModel.getProductId();
        QPurchaseOptions options = purchaseModel.getOptions();
        this(productId, product, options != null ? options.getOldProduct() : null, purchaseModel.getUpdatePolicy(), purchaseModel.getOptions());
    }
}
