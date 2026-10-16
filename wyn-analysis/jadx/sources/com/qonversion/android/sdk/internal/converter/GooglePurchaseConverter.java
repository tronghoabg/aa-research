package com.qonversion.android.sdk.internal.converter;

import com.qonversion.android.sdk.dto.QPurchaseOptions;
import com.qonversion.android.sdk.internal.ExtensionsKt;
import com.qonversion.android.sdk.internal.billing.UtilsKt;
import com.qonversion.android.sdk.internal.purchase.Purchase;
import ff.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J2\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0018\u00010\fH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¨\u0006\u0010"}, d2 = {"Lcom/qonversion/android/sdk/internal/converter/GooglePurchaseConverter;", "Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;", "()V", "convertPurchase", "Lcom/qonversion/android/sdk/internal/purchase/Purchase;", "purchase", "Lcom/android/billingclient/api/Purchase;", "options", "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;", "convertPurchases", "", "purchases", "", "", "formatOriginalTransactionId", "transactionId", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GooglePurchaseConverter implements PurchaseConverter {
    private final String formatOriginalTransactionId(String transactionId) {
        Pattern patternCompile = Pattern.compile("\\.{2}.*");
        AbstractC3340k.d(patternCompile, "compile(...)");
        AbstractC3340k.e(transactionId, "input");
        String strReplaceAll = patternCompile.matcher(transactionId).replaceAll("");
        AbstractC3340k.d(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    @Override // com.qonversion.android.sdk.internal.converter.PurchaseConverter
    @NotNull
    public Purchase convertPurchase(@NotNull com.android.billingclient.api.Purchase purchase, @Nullable QPurchaseOptions options) {
        AbstractC3340k.e(purchase, "purchase");
        String productId = UtilsKt.getProductId(purchase);
        String orderId = purchase.getOrderId();
        if (orderId == null) {
            orderId = "";
        }
        String orderId2 = purchase.getOrderId();
        String originalTransactionId = formatOriginalTransactionId(orderId2 != null ? orderId2 : "");
        long jMilliSecondsToSeconds = ExtensionsKt.milliSecondsToSeconds(purchase.getPurchaseTime());
        String purchaseToken = purchase.getPurchaseToken();
        AbstractC3340k.d(purchaseToken, "getPurchaseToken(...)");
        return new Purchase(productId, orderId, originalTransactionId, jMilliSecondsToSeconds, purchaseToken, options != null ? options.getContextKeys$sdk_release() : null, options != null ? options.getScreenUid() : null);
    }

    @Override // com.qonversion.android.sdk.internal.converter.PurchaseConverter
    @NotNull
    public List<Purchase> convertPurchases(@NotNull List<? extends com.android.billingclient.api.Purchase> purchases, @Nullable Map<String, QPurchaseOptions> options) {
        AbstractC3340k.e(purchases, "purchases");
        List<? extends com.android.billingclient.api.Purchase> list = purchases;
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        for (com.android.billingclient.api.Purchase purchase : list) {
            arrayList.add(convertPurchase(purchase, options != null ? options.get(UtilsKt.getProductId(purchase)) : null));
        }
        return arrayList;
    }
}
