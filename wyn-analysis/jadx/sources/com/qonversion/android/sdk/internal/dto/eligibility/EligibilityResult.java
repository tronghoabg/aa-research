package com.qonversion.android.sdk.internal.dto.eligibility;

import com.qonversion.android.sdk.dto.eligibility.QEligibility;
import hb.InterfaceC2812o;
import hb.s;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\b\u0001\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/eligibility/EligibilityResult;", "", "productsEligibility", "", "", "Lcom/qonversion/android/sdk/dto/eligibility/QEligibility;", "(Ljava/util/Map;)V", "getProductsEligibility", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EligibilityResult {

    @NotNull
    private final Map<String, QEligibility> productsEligibility;

    public EligibilityResult(@InterfaceC2812o(name = "products_enriched") @NotNull Map<String, QEligibility> productsEligibility) {
        AbstractC3340k.e(productsEligibility, "productsEligibility");
        this.productsEligibility = productsEligibility;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EligibilityResult copy$default(EligibilityResult eligibilityResult, Map map, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            map = eligibilityResult.productsEligibility;
        }
        return eligibilityResult.copy(map);
    }

    @NotNull
    public final Map<String, QEligibility> component1() {
        return this.productsEligibility;
    }

    @NotNull
    public final EligibilityResult copy(@InterfaceC2812o(name = "products_enriched") @NotNull Map<String, QEligibility> productsEligibility) {
        AbstractC3340k.e(productsEligibility, "productsEligibility");
        return new EligibilityResult(productsEligibility);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EligibilityResult) && AbstractC3340k.a(this.productsEligibility, ((EligibilityResult) other).productsEligibility);
    }

    @NotNull
    public final Map<String, QEligibility> getProductsEligibility() {
        return this.productsEligibility;
    }

    public int hashCode() {
        return this.productsEligibility.hashCode();
    }

    @NotNull
    public String toString() {
        return "EligibilityResult(productsEligibility=" + this.productsEligibility + ")";
    }
}
