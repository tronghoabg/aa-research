package com.qonversion.android.sdk.internal.converter;

import com.qonversion.android.sdk.dto.QPurchaseOptions;
import com.qonversion.android.sdk.internal.purchase.Purchase;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J2\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bH&¨\u0006\r"}, d2 = {"Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;", "", "convertPurchase", "Lcom/qonversion/android/sdk/internal/purchase/Purchase;", "purchase", "Lcom/android/billingclient/api/Purchase;", "options", "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;", "convertPurchases", "", "purchases", "", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PurchaseConverter {
    @NotNull
    Purchase convertPurchase(@NotNull com.android.billingclient.api.Purchase purchase, @Nullable QPurchaseOptions options);

    @NotNull
    List<Purchase> convertPurchases(@NotNull List<? extends com.android.billingclient.api.Purchase> purchases, @Nullable Map<String, QPurchaseOptions> options);
}
