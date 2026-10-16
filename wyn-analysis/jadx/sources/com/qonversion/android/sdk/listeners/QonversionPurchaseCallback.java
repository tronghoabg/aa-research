package com.qonversion.android.sdk.listeners;

import com.android.billingclient.api.Purchase;
import com.qonversion.android.sdk.dto.entitlements.QEntitlement;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;", "Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;", "", "", "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;", "entitlements", "Lcom/android/billingclient/api/Purchase;", "purchase", "Lef/C;", "onSuccess", "(Ljava/util/Map;Lcom/android/billingclient/api/Purchase;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface QonversionPurchaseCallback extends QonversionEntitlementsCallback {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onSuccess(@NotNull QonversionPurchaseCallback qonversionPurchaseCallback, @NotNull Map<String, QEntitlement> entitlements, @NotNull Purchase purchase) {
            AbstractC3340k.e(entitlements, "entitlements");
            AbstractC3340k.e(purchase, "purchase");
            qonversionPurchaseCallback.onSuccess(entitlements);
        }
    }

    void onSuccess(@NotNull Map<String, QEntitlement> entitlements, @NotNull Purchase purchase);
}
