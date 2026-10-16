package com.qonversion.android.sdk.internal.billing;

import android.app.Activity;
import com.applovin.sdk.AppLovinEventTypes;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.internal.dto.QStoreProductType;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;
import tf.p;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003J?\u0010\f\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH&¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000e\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010JS\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H&¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010!\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u001a\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\b0\u001dH&¢\u0006\u0004\b!\u0010\"J9\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2 \u0010 \u001a\u001c\u0012\u0004\u0012\u00020\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0004\u0012\u0004\u0012\u00020\b0\u001dH&¢\u0006\u0004\b%\u0010&J=\u0010(\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0018\u0010 \u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u0004\u0012\u0004\u0012\u00020\b0\u0006H&¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u0015H&¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u0015H&¢\u0006\u0004\b-\u0010,J?\u0010/\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00152\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b0\u0006H&¢\u0006\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;", "StoreId", "StoreData", "", "", "storeIds", "Lkotlin/Function1;", "Lcom/qonversion/android/sdk/internal/billing/BillingError;", "Lef/C;", "onFailed", "Lkotlin/Function0;", "onReady", "withStoreDataLoaded", "(Ljava/util/List;Ltf/l;Ltf/a;)V", "storeId", "getStoreData", "(Ljava/lang/Object;)Ljava/lang/Object;", "Landroid/app/Activity;", "activity", "Lcom/qonversion/android/sdk/dto/products/QProduct;", AppLovinEventTypes.USER_VIEWED_PRODUCT, "", "offerId", "", "applyOffer", "Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;", "updatePurchaseInfo", "makePurchase", "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;Ltf/l;)V", "Lkotlin/Function2;", "Lcom/android/billingclient/api/BillingResult;", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "onCompleted", "queryPurchaseHistoryForProduct", "(Lcom/qonversion/android/sdk/dto/products/QProduct;Ltf/p;)V", "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;", "productType", "queryPurchaseHistory", "(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ltf/p;)V", "Lcom/android/billingclient/api/Purchase;", "queryPurchases", "(Ltf/l;Ltf/l;)V", "purchaseToken", "consume", "(Ljava/lang/String;)V", "acknowledge", "onSuccess", "getStoreProductType", "(Ljava/lang/String;Ltf/l;Ltf/l;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IBillingClientWrapper<StoreId, StoreData> {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void makePurchase$default(IBillingClientWrapper iBillingClientWrapper, Activity activity, QProduct qProduct, String str, Boolean bool, UpdatePurchaseInfo updatePurchaseInfo, l lVar, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makePurchase");
            }
            if ((i5 & 8) != 0) {
                bool = Boolean.TRUE;
            }
            iBillingClientWrapper.makePurchase(activity, qProduct, str, bool, updatePurchaseInfo, lVar);
        }
    }

    void acknowledge(@NotNull String purchaseToken);

    void consume(@NotNull String purchaseToken);

    @Nullable
    StoreData getStoreData(StoreId storeId);

    void getStoreProductType(@NotNull String storeId, @NotNull l onFailed, @NotNull l onSuccess);

    void makePurchase(@NotNull Activity activity, @NotNull QProduct product, @Nullable String offerId, @Nullable Boolean applyOffer, @Nullable UpdatePurchaseInfo updatePurchaseInfo, @NotNull l onFailed);

    void queryPurchaseHistory(@NotNull QStoreProductType productType, @NotNull p onCompleted);

    void queryPurchaseHistoryForProduct(@NotNull QProduct product, @NotNull p onCompleted);

    void queryPurchases(@NotNull l onFailed, @NotNull l onCompleted);

    void withStoreDataLoaded(@NotNull List<? extends StoreId> storeIds, @NotNull l onFailed, @NotNull tf.a onReady);
}
