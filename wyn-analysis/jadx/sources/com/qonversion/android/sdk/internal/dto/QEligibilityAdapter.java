package com.qonversion.android.sdk.internal.dto;

import com.qonversion.android.sdk.dto.eligibility.QEligibility;
import com.qonversion.android.sdk.internal.dto.eligibility.ProductEligibility;
import ff.v;
import hb.InterfaceC2811n;
import hb.Q;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¨\u0006\u000b"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/QEligibilityAdapter;", "", "()V", "fromJson", "", "", "Lcom/qonversion/android/sdk/dto/eligibility/QEligibility;", "eligibilities", "", "Lcom/qonversion/android/sdk/internal/dto/eligibility/ProductEligibility;", "toJson", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QEligibilityAdapter {
    @Q
    private final List<ProductEligibility> toJson(Map<String, QEligibility> eligibilities) {
        return v.f35432a;
    }

    @InterfaceC2811n
    @NotNull
    public final Map<String, QEligibility> fromJson(@NotNull List<ProductEligibility> eligibilities) {
        AbstractC3340k.e(eligibilities, "eligibilities");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ProductEligibility productEligibility : eligibilities) {
            linkedHashMap.put(productEligibility.getProduct().getQonversionID(), new QEligibility(productEligibility.getEligibilityStatus()));
        }
        return linkedHashMap;
    }
}
