package com.qonversion.android.sdk.internal.dto.eligibility;

import com.applovin.sdk.AppLovinEventTypes;
import com.qonversion.android.sdk.dto.eligibility.QIntroEligibilityStatus;
import com.qonversion.android.sdk.dto.products.QProduct;
import hb.InterfaceC2812o;
import hb.s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/eligibility/ProductEligibility;", "", AppLovinEventTypes.USER_VIEWED_PRODUCT, "Lcom/qonversion/android/sdk/dto/products/QProduct;", "eligibilityStatus", "Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;", "(Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;)V", "getEligibilityStatus", "()Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;", "getProduct", "()Lcom/qonversion/android/sdk/dto/products/QProduct;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductEligibility {

    @NotNull
    private final QIntroEligibilityStatus eligibilityStatus;

    @NotNull
    private final QProduct product;

    public ProductEligibility(@InterfaceC2812o(name = AppLovinEventTypes.USER_VIEWED_PRODUCT) @NotNull QProduct product, @InterfaceC2812o(name = "intro_eligibility_status") @NotNull QIntroEligibilityStatus eligibilityStatus) {
        AbstractC3340k.e(product, "product");
        AbstractC3340k.e(eligibilityStatus, "eligibilityStatus");
        this.product = product;
        this.eligibilityStatus = eligibilityStatus;
    }

    public static /* synthetic */ ProductEligibility copy$default(ProductEligibility productEligibility, QProduct qProduct, QIntroEligibilityStatus qIntroEligibilityStatus, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            qProduct = productEligibility.product;
        }
        if ((i5 & 2) != 0) {
            qIntroEligibilityStatus = productEligibility.eligibilityStatus;
        }
        return productEligibility.copy(qProduct, qIntroEligibilityStatus);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final QProduct getProduct() {
        return this.product;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final QIntroEligibilityStatus getEligibilityStatus() {
        return this.eligibilityStatus;
    }

    @NotNull
    public final ProductEligibility copy(@InterfaceC2812o(name = AppLovinEventTypes.USER_VIEWED_PRODUCT) @NotNull QProduct product, @InterfaceC2812o(name = "intro_eligibility_status") @NotNull QIntroEligibilityStatus eligibilityStatus) {
        AbstractC3340k.e(product, "product");
        AbstractC3340k.e(eligibilityStatus, "eligibilityStatus");
        return new ProductEligibility(product, eligibilityStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductEligibility)) {
            return false;
        }
        ProductEligibility productEligibility = (ProductEligibility) other;
        return AbstractC3340k.a(this.product, productEligibility.product) && this.eligibilityStatus == productEligibility.eligibilityStatus;
    }

    @NotNull
    public final QIntroEligibilityStatus getEligibilityStatus() {
        return this.eligibilityStatus;
    }

    @NotNull
    public final QProduct getProduct() {
        return this.product;
    }

    public int hashCode() {
        return this.eligibilityStatus.hashCode() + (this.product.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ProductEligibility(product=" + this.product + ", eligibilityStatus=" + this.eligibilityStatus + ")";
    }
}
