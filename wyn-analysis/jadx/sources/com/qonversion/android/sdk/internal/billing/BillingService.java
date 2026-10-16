package com.qonversion.android.sdk.internal.billing;

import android.app.Activity;
import com.android.billingclient.api.Purchase;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.internal.dto.purchase.PurchaseModelInternalEnriched;
import com.qonversion.android.sdk.internal.purchase.PurchaseHistory;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tf.l;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001JK\u0010\n\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0002H&¢\u0006\u0004\b\u0016\u0010\rJ\u001d\u0010\u0019\u001a\u00020\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0002H&¢\u0006\u0004\b\u0019\u0010\rJ=\u0010\u001b\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0018\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0002\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\u001b\u0010\u001cJ=\u0010\u001d\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0018\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0002\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\u001d\u0010\u001cJ?\u0010\"\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingService;", "", "", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "products", "Lkotlin/Function1;", "Lcom/qonversion/android/sdk/internal/billing/BillingError;", "Lef/C;", "onFailed", "onEnriched", "enrichStoreDataAsync", "(Ljava/util/List;Ltf/l;Ltf/l;)V", "enrichStoreData", "(Ljava/util/List;)V", "Landroid/app/Activity;", "activity", "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;", "purchaseModel", "purchase", "(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;)V", "Lcom/android/billingclient/api/Purchase;", "purchases", "consumePurchases", "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;", "historyRecords", "consumeHistoryRecords", "onCompleted", "queryPurchasesHistory", "(Ltf/l;Ltf/l;)V", "queryPurchases", "", "storeId", "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;", "onSuccess", "getStoreProductType", "(Ljava/lang/String;Ltf/l;Ltf/l;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface BillingService {
    void consumeHistoryRecords(@NotNull List<PurchaseHistory> historyRecords);

    void consumePurchases(@NotNull List<? extends Purchase> purchases);

    void enrichStoreData(@NotNull List<QProduct> products);

    void enrichStoreDataAsync(@NotNull List<QProduct> products, @NotNull l onFailed, @NotNull l onEnriched);

    void getStoreProductType(@NotNull String storeId, @NotNull l onFailed, @NotNull l onSuccess);

    void purchase(@NotNull Activity activity, @NotNull PurchaseModelInternalEnriched purchaseModel);

    void queryPurchases(@NotNull l onFailed, @NotNull l onCompleted);

    void queryPurchasesHistory(@NotNull l onFailed, @NotNull l onCompleted);
}
