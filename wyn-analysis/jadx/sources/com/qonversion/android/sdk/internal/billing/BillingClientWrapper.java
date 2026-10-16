package com.qonversion.android.sdk.internal.billing;

import R8.v;
import android.app.Activity;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchaseHistoryParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.applovin.sdk.AppLovinEventTypes;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.dto.products.QProductOfferDetails;
import com.qonversion.android.sdk.dto.products.QProductStoreDetails;
import com.qonversion.android.sdk.internal.dto.ProductStoreId;
import com.qonversion.android.sdk.internal.dto.QStoreProductType;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge;
import ef.C2515C;
import ff.AbstractC2640A;
import ff.AbstractC2641B;
import ff.o;
import ff.p;
import ff.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r7.AbstractC3935e;
import tf.l;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJK\u0010\u0013\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014JS\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001b\u001a\u00020\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u001d*\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!J?\u0010%\u001a\u00020\u00102\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100#H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010\u00042\u0006\u0010'\u001a\u00020\u0003H\u0016¢\u0006\u0004\b(\u0010)JQ\u00102\u001a\u00020\u00102\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\b\u0010.\u001a\u0004\u0018\u00010\f2\b\u0010 \u001a\u0004\u0018\u00010/2\b\u00101\u001a\u0004\u0018\u0001002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0016¢\u0006\u0004\b2\u00103J3\u00107\u001a\u00020\u00102\u0006\u0010-\u001a\u00020,2\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u000205\u0012\u0006\u0012\u0004\u0018\u000106\u0012\u0004\u0012\u00020\u001004H\u0016¢\u0006\u0004\b7\u00108J9\u0010:\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u0002092 \u0010\u0012\u001a\u001c\u0012\u0004\u0012\u000205\u0012\f\u0012\n\u0012\u0004\u0012\u000206\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u001004H\u0016¢\u0006\u0004\b:\u0010;J=\u0010=\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\u000b\u0012\u0004\u0012\u00020\u00100\u000eH\u0016¢\u0006\u0004\b=\u0010>J?\u0010@\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u00100\u000eH\u0016¢\u0006\u0004\b@\u0010AR\"\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;", "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;", "Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;", "Lcom/qonversion/android/sdk/internal/dto/ProductStoreId;", "Lcom/android/billingclient/api/ProductDetails;", "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;", "billingClientHolder", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "logger", "<init>", "(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/logger/Logger;)V", "", "", "productIds", "Lkotlin/Function1;", "Lcom/qonversion/android/sdk/internal/billing/BillingError;", "Lef/C;", "onFailed", "onCompleted", "loadProducts", "(Ljava/util/List;Ltf/l;Ltf/l;)V", "productType", "onQuerySkuCompleted", "onQuerySkuFailed", BillingClientBridge.QUERY_PRODUCT_DETAILS_ASYNC_METHOD, "(Ljava/lang/String;Ljava/util/List;Ltf/l;Ltf/l;)V", "productDetailsList", "logProductDetails", "(Ljava/util/List;Ljava/util/List;)V", "Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;", "Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;", "offer", "applyOffer", "(Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;)Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;", "storeIds", "Lkotlin/Function0;", "onReady", "withStoreDataLoaded", "(Ljava/util/List;Ltf/l;Ltf/a;)V", "storeId", "getStoreData", "(Lcom/qonversion/android/sdk/internal/dto/ProductStoreId;)Lcom/android/billingclient/api/ProductDetails;", "Landroid/app/Activity;", "activity", "Lcom/qonversion/android/sdk/dto/products/QProduct;", AppLovinEventTypes.USER_VIEWED_PRODUCT, "offerId", "", "Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;", "updatePurchaseInfo", "makePurchase", "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;Ltf/l;)V", "Lkotlin/Function2;", "Lcom/android/billingclient/api/BillingResult;", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "queryPurchaseHistoryForProduct", "(Lcom/qonversion/android/sdk/dto/products/QProduct;Ltf/p;)V", "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;", "queryPurchaseHistory", "(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ltf/p;)V", "Lcom/android/billingclient/api/Purchase;", "queryPurchases", "(Ltf/l;Ltf/l;)V", "onSuccess", "getStoreProductType", "(Ljava/lang/String;Ltf/l;Ltf/l;)V", "", "productDetails", "Ljava/util/Map;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BillingClientWrapper extends BillingClientWrapperBase implements IBillingClientWrapper<ProductStoreId, ProductDetails> {

    @NotNull
    private Map<String, ProductDetails> productDetails;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/android/billingclient/api/ProductDetails;", "details", "Lef/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.BillingClientWrapper$getStoreProductType$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3343n implements l {
        final /* synthetic */ l $onFailed;
        final /* synthetic */ l $onSuccess;
        final /* synthetic */ String $storeId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(l lVar, String str, l lVar2) {
            super(1);
            this.$onFailed = lVar;
            this.$storeId = str;
            this.$onSuccess = lVar2;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<ProductDetails>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull List<ProductDetails> details) {
            AbstractC3340k.e(details, "details");
            ProductDetails productDetails = (ProductDetails) o.s0(details);
            C2515C c2515c = null;
            if (productDetails != null) {
                if (!AbstractC3340k.a(productDetails.getProductId(), this.$storeId)) {
                    productDetails = null;
                }
                if (productDetails != null) {
                    l lVar = this.$onSuccess;
                    QStoreProductType.Companion companion = QStoreProductType.INSTANCE;
                    String productType = productDetails.getProductType();
                    AbstractC3340k.d(productType, "getProductType(...)");
                    lVar.invoke(companion.fromProductType(productType));
                    c2515c = C2515C.f34653a;
                }
            }
            if (c2515c == null) {
                this.$onFailed.invoke(new BillingError(4, "Product not found"));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/android/billingclient/api/ProductDetails;", "subscriptionProductDetails", "Lef/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.BillingClientWrapper$loadProducts$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements l {
        final /* synthetic */ l $onCompleted;
        final /* synthetic */ l $onFailed;
        final /* synthetic */ List<String> $productIds;
        final /* synthetic */ BillingClientWrapper this$0;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/android/billingclient/api/ProductDetails;", "inAppProductDetails", "Lef/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.billing.BillingClientWrapper$loadProducts$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01691 extends AbstractC3343n implements l {
            final /* synthetic */ l $onCompleted;
            final /* synthetic */ List<ProductDetails> $subscriptionProductDetails;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01691(l lVar, List<ProductDetails> list) {
                super(1);
                this.$onCompleted = lVar;
                this.$subscriptionProductDetails = list;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<ProductDetails>) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull List<ProductDetails> inAppProductDetails) {
                AbstractC3340k.e(inAppProductDetails, "inAppProductDetails");
                this.$onCompleted.invoke(o.E0(inAppProductDetails, this.$subscriptionProductDetails));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<String> list, BillingClientWrapper billingClientWrapper, l lVar, l lVar2) {
            super(1);
            this.$productIds = list;
            this.this$0 = billingClientWrapper;
            this.$onFailed = lVar;
            this.$onCompleted = lVar2;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<ProductDetails>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull List<ProductDetails> subscriptionProductDetails) {
            AbstractC3340k.e(subscriptionProductDetails, "subscriptionProductDetails");
            List<ProductDetails> list = subscriptionProductDetails;
            ArrayList arrayList = new ArrayList(p.a0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ProductDetails) it.next()).getProductId());
            }
            List listB0 = o.B0(this.$productIds, o.X0(arrayList));
            if (listB0.isEmpty()) {
                this.$onCompleted.invoke(subscriptionProductDetails);
            } else {
                this.this$0.queryProductDetailsAsync("inapp", listB0, new C01691(this.$onCompleted, subscriptionProductDetails), this.$onFailed);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/BillingClient;", "Lef/C;", "invoke", "(Lcom/android/billingclient/api/BillingClient;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.BillingClientWrapper$queryProductDetailsAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21811 extends AbstractC3343n implements l {
        final /* synthetic */ l $onQuerySkuCompleted;
        final /* synthetic */ l $onQuerySkuFailed;
        final /* synthetic */ QueryProductDetailsParams $params;
        final /* synthetic */ List<String> $productIds;
        final /* synthetic */ BillingClientWrapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21811(QueryProductDetailsParams queryProductDetailsParams, BillingClientWrapper billingClientWrapper, List<String> list, l lVar, l lVar2) {
            super(1);
            this.$params = queryProductDetailsParams;
            this.this$0 = billingClientWrapper;
            this.$productIds = list;
            this.$onQuerySkuCompleted = lVar;
            this.$onQuerySkuFailed = lVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(BillingClientWrapper this$0, List productIds, l onQuerySkuCompleted, l onQuerySkuFailed, BillingResult billingResult, List productDetailsList) {
            AbstractC3340k.e(this$0, "this$0");
            AbstractC3340k.e(productIds, "$productIds");
            AbstractC3340k.e(onQuerySkuCompleted, "$onQuerySkuCompleted");
            AbstractC3340k.e(onQuerySkuFailed, "$onQuerySkuFailed");
            AbstractC3340k.e(billingResult, "billingResult");
            AbstractC3340k.e(productDetailsList, "productDetailsList");
            if (!UtilsKt.isOk(billingResult)) {
                onQuerySkuFailed.invoke(new BillingError(billingResult.getResponseCode(), v.f("Failed to fetch products. ", UtilsKt.getDescription(billingResult))));
            } else {
                this$0.logProductDetails(productDetailsList, productIds);
                onQuerySkuCompleted.invoke(productDetailsList);
            }
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingClient) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull BillingClient withReadyClient) {
            AbstractC3340k.e(withReadyClient, "$this$withReadyClient");
            withReadyClient.queryProductDetailsAsync(this.$params, new b(this.this$0, this.$productIds, this.$onQuerySkuCompleted, this.$onQuerySkuFailed, 0));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/BillingClient;", "Lef/C;", "invoke", "(Lcom/android/billingclient/api/BillingClient;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.BillingClientWrapper$queryPurchaseHistory$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21821 extends AbstractC3343n implements l {
        final /* synthetic */ tf.p $onCompleted;
        final /* synthetic */ QStoreProductType $productType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21821(QStoreProductType qStoreProductType, tf.p pVar) {
            super(1);
            this.$productType = qStoreProductType;
            this.$onCompleted = pVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(tf.p tmp0, BillingResult p02, List list) {
            AbstractC3340k.e(tmp0, "$tmp0");
            AbstractC3340k.e(p02, "p0");
            tmp0.invoke(p02, list);
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingClient) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull BillingClient withReadyClient) {
            AbstractC3340k.e(withReadyClient, "$this$withReadyClient");
            QueryPurchaseHistoryParams queryPurchaseHistoryParamsBuild = QueryPurchaseHistoryParams.newBuilder().setProductType(this.$productType.toProductType()).build();
            AbstractC3340k.d(queryPurchaseHistoryParamsBuild, "build(...)");
            withReadyClient.queryPurchaseHistoryAsync(queryPurchaseHistoryParamsBuild, new c(this.$onCompleted, 0));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/BillingClient;", "Lef/C;", "invoke", "(Lcom/android/billingclient/api/BillingClient;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.BillingClientWrapper$queryPurchaseHistoryForProduct$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21831 extends AbstractC3343n implements l {
        final /* synthetic */ tf.p $onCompleted;
        final /* synthetic */ String $productType;
        final /* synthetic */ QProductStoreDetails $storeDetails;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21831(QProductStoreDetails qProductStoreDetails, String str, tf.p pVar) {
            super(1);
            this.$storeDetails = qProductStoreDetails;
            this.$productType = str;
            this.$onCompleted = pVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$1(tf.p onCompleted, QProductStoreDetails storeDetails, BillingResult billingResult, List list) {
            AbstractC3340k.e(onCompleted, "$onCompleted");
            AbstractC3340k.e(storeDetails, "$storeDetails");
            AbstractC3340k.e(billingResult, "billingResult");
            Object obj = null;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) next;
                    String productId = storeDetails.getProductId();
                    AbstractC3340k.b(purchaseHistoryRecord);
                    if (AbstractC3340k.a(productId, UtilsKt.getProductId(purchaseHistoryRecord))) {
                        obj = next;
                        break;
                    }
                }
                obj = (PurchaseHistoryRecord) obj;
            }
            onCompleted.invoke(billingResult, obj);
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingClient) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull BillingClient withReadyClient) {
            AbstractC3340k.e(withReadyClient, "$this$withReadyClient");
            BillingClientWrapper.this.getLogger().debug("queryPurchaseHistoryForProduct() -> Querying purchase history for " + this.$storeDetails.getProductId() + " with type " + this.$productType);
            QueryPurchaseHistoryParams queryPurchaseHistoryParamsBuild = QueryPurchaseHistoryParams.newBuilder().setProductType(this.$productType).build();
            AbstractC3340k.d(queryPurchaseHistoryParamsBuild, "build(...)");
            withReadyClient.queryPurchaseHistoryAsync(queryPurchaseHistoryParamsBuild, new d(0, this.$onCompleted, this.$storeDetails));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/BillingClient;", "Lef/C;", "invoke", "(Lcom/android/billingclient/api/BillingClient;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.BillingClientWrapper$queryPurchases$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21841 extends AbstractC3343n implements l {
        final /* synthetic */ l $onCompleted;
        final /* synthetic */ l $onFailed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21841(l lVar, l lVar2) {
            super(1);
            this.$onFailed = lVar;
            this.$onCompleted = lVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$3(BillingClientWrapper this$0, l onFailed, BillingClient this_withReadyClient, l onCompleted, BillingResult subsResult, List activeSubs) {
            AbstractC3340k.e(this$0, "this$0");
            AbstractC3340k.e(onFailed, "$onFailed");
            AbstractC3340k.e(this_withReadyClient, "$this_withReadyClient");
            AbstractC3340k.e(onCompleted, "$onCompleted");
            AbstractC3340k.e(subsResult, "subsResult");
            AbstractC3340k.e(activeSubs, "activeSubs");
            if (!UtilsKt.isOk(subsResult)) {
                this$0.handlePurchasesQueryError(subsResult, "subscription", onFailed);
                return;
            }
            QueryPurchasesParams queryPurchasesParamsBuild = QueryPurchasesParams.newBuilder().setProductType("inapp").build();
            AbstractC3340k.d(queryPurchasesParamsBuild, "build(...)");
            this_withReadyClient.queryPurchasesAsync(queryPurchasesParamsBuild, new e(this$0, subsResult, onFailed, activeSubs, onCompleted, 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$3$lambda$2(BillingClientWrapper this$0, BillingResult subsResult, l onFailed, List activeSubs, l onCompleted, BillingResult inAppsResult, List unconsumedInApp) {
            AbstractC3340k.e(this$0, "this$0");
            AbstractC3340k.e(subsResult, "$subsResult");
            AbstractC3340k.e(onFailed, "$onFailed");
            AbstractC3340k.e(activeSubs, "$activeSubs");
            AbstractC3340k.e(onCompleted, "$onCompleted");
            AbstractC3340k.e(inAppsResult, "inAppsResult");
            AbstractC3340k.e(unconsumedInApp, "unconsumedInApp");
            if (!UtilsKt.isOk(inAppsResult)) {
                this$0.handlePurchasesQueryError(subsResult, "in-app", onFailed);
                return;
            }
            ArrayList<Purchase> arrayListE0 = o.E0(unconsumedInApp, activeSubs);
            onCompleted.invoke(arrayListE0);
            C2515C c2515c = null;
            if (arrayListE0.isEmpty()) {
                arrayListE0 = null;
            }
            if (arrayListE0 != null) {
                for (Purchase purchase : arrayListE0) {
                    Logger logger = this$0.getLogger();
                    AbstractC3340k.b(purchase);
                    com.google.android.gms.internal.consent_sdk.a.z("queryPurchases() -> purchases cache is retrieved ", UtilsKt.getDescription(purchase), logger);
                }
                c2515c = C2515C.f34653a;
            }
            if (c2515c == null) {
                this$0.getLogger().release("queryPurchases() -> purchases cache is empty.");
            }
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingClient) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull BillingClient withReadyClient) {
            AbstractC3340k.e(withReadyClient, "$this$withReadyClient");
            QueryPurchasesParams queryPurchasesParamsBuild = QueryPurchasesParams.newBuilder().setProductType("subs").build();
            AbstractC3340k.d(queryPurchasesParamsBuild, "build(...)");
            withReadyClient.queryPurchasesAsync(queryPurchasesParamsBuild, new b(BillingClientWrapper.this, this.$onFailed, withReadyClient, this.$onCompleted, 1));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/android/billingclient/api/ProductDetails;", "details", "Lef/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.BillingClientWrapper$withStoreDataLoaded$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21851 extends AbstractC3343n implements l {
        final /* synthetic */ tf.a $onReady;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21851(tf.a aVar) {
            super(1);
            this.$onReady = aVar;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<ProductDetails>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull List<ProductDetails> details) {
            AbstractC3340k.e(details, "details");
            List<ProductDetails> list = details;
            int iD = AbstractC2641B.D(p.a0(list, 10));
            if (iD < 16) {
                iD = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iD);
            for (Object obj : list) {
                linkedHashMap.put(((ProductDetails) obj).getProductId(), obj);
            }
            BillingClientWrapper billingClientWrapper = BillingClientWrapper.this;
            billingClientWrapper.productDetails = AbstractC2640A.T(billingClientWrapper.productDetails, AbstractC2640A.a0(linkedHashMap));
            this.$onReady.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingClientWrapper(@NotNull BillingClientHolder billingClientHolder, @NotNull Logger logger) {
        super(billingClientHolder, logger);
        AbstractC3340k.e(billingClientHolder, "billingClientHolder");
        AbstractC3340k.e(logger, "logger");
        this.productDetails = w.f35433a;
    }

    private final BillingFlowParams.ProductDetailsParams.Builder applyOffer(BillingFlowParams.ProductDetailsParams.Builder builder, QProductOfferDetails qProductOfferDetails) {
        if (qProductOfferDetails != null) {
            builder.setOfferToken(qProductOfferDetails.getOfferToken());
        }
        return builder;
    }

    private final void loadProducts(List<String> productIds, l onFailed, l onCompleted) {
        queryProductDetailsAsync("subs", productIds, new AnonymousClass1(productIds, this, onFailed, onCompleted), onFailed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logProductDetails(List<ProductDetails> productDetailsList, List<String> productIds) {
        C2515C c2515c = null;
        if (productDetailsList.isEmpty()) {
            productDetailsList = null;
        }
        if (productDetailsList != null) {
            for (ProductDetails productDetails : productDetailsList) {
                getLogger().debug("queryProductDetailsAsync() -> " + productDetails);
            }
            c2515c = C2515C.f34653a;
        }
        if (c2515c == null) {
            getLogger().warn("queryProductDetailsAsync() -> ProductDetails list for " + productIds + " is empty.");
        }
    }

    private static final void makePurchase$fireError(l lVar, String str) {
        lVar.invoke(new BillingError(4, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryProductDetailsAsync(String productType, List<String> productIds, l onQuerySkuCompleted, l onQuerySkuFailed) {
        List<String> list = productIds;
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType(productType).build());
        }
        QueryProductDetailsParams queryProductDetailsParamsBuild = QueryProductDetailsParams.newBuilder().setProductList(arrayList).build();
        AbstractC3340k.d(queryProductDetailsParamsBuild, "build(...)");
        getBillingClientHolder().withReadyClient(new C21811(queryProductDetailsParamsBuild, this, productIds, onQuerySkuCompleted, onQuerySkuFailed));
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    public void getStoreProductType(@NotNull String storeId, @NotNull l onFailed, @NotNull l onSuccess) {
        AbstractC3340k.e(storeId, "storeId");
        AbstractC3340k.e(onFailed, "onFailed");
        AbstractC3340k.e(onSuccess, "onSuccess");
        ProductDetails productDetails = this.productDetails.get(storeId);
        if (productDetails == null) {
            loadProducts(AbstractC3935e.C(storeId), onFailed, new AnonymousClass2(onFailed, storeId, onSuccess));
            return;
        }
        QStoreProductType.Companion companion = QStoreProductType.INSTANCE;
        String productType = productDetails.getProductType();
        AbstractC3340k.d(productType, "getProductType(...)");
        onSuccess.invoke(companion.fromProductType(productType));
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    public void makePurchase(@NotNull Activity activity, @NotNull QProduct product, @Nullable String offerId, @Nullable Boolean applyOffer, @Nullable UpdatePurchaseInfo updatePurchaseInfo, @NotNull l onFailed) {
        QProductOfferDetails defaultSubscriptionOfferDetails;
        QProductOfferDetails qProductOfferDetails;
        AbstractC3340k.e(activity, "activity");
        AbstractC3340k.e(product, "product");
        AbstractC3340k.e(onFailed, "onFailed");
        QProductStoreDetails storeDetails = product.getStoreDetails();
        if (storeDetails == null) {
            onFailed.invoke(new BillingError(4, "Store details not found for purchase"));
            return;
        }
        getLogger().debug("makePurchase() -> Purchasing the product: " + storeDetails.getProductId());
        if (storeDetails.getIsInApp()) {
            qProductOfferDetails = null;
        } else {
            if (AbstractC3340k.a(applyOffer, Boolean.FALSE)) {
                defaultSubscriptionOfferDetails = storeDetails.getBasePlanSubscriptionOfferDetails();
                if (defaultSubscriptionOfferDetails == null) {
                    makePurchase$fireError(onFailed, v.f("Failed to find base plan offer for Qonversion product ", product.getQonversionID()));
                    return;
                }
            } else if (offerId == null || offerId.length() <= 0) {
                defaultSubscriptionOfferDetails = storeDetails.getDefaultSubscriptionOfferDetails();
                if (defaultSubscriptionOfferDetails == null) {
                    makePurchase$fireError(onFailed, v.f("No offer found for purchasing Qonversion subscription product ", product.getQonversionID()));
                    return;
                }
            } else {
                QProductOfferDetails qProductOfferDetailsFindOffer = storeDetails.findOffer(offerId);
                if (qProductOfferDetailsFindOffer == null) {
                    makePurchase$fireError(onFailed, N0.a.h("Failed to find offer ", offerId, " for Qonversion product ", product.getQonversionID()));
                    return;
                }
                qProductOfferDetails = qProductOfferDetailsFindOffer;
            }
            qProductOfferDetails = defaultSubscriptionOfferDetails;
        }
        BillingFlowParams.ProductDetailsParams.Builder productDetails = BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(storeDetails.getOriginalProductDetails());
        AbstractC3340k.d(productDetails, "setProductDetails(...)");
        BillingFlowParams.ProductDetailsParams productDetailsParamsBuild = applyOffer(productDetails, qProductOfferDetails).build();
        AbstractC3340k.d(productDetailsParamsBuild, "build(...)");
        BillingFlowParams.Builder productDetailsParamsList = BillingFlowParams.newBuilder().setProductDetailsParamsList(AbstractC3935e.C(productDetailsParamsBuild));
        AbstractC3340k.d(productDetailsParamsList, "setProductDetailsParamsList(...)");
        BillingFlowParams billingFlowParamsBuild = setSubscriptionUpdateParams(productDetailsParamsList, updatePurchaseInfo).build();
        AbstractC3340k.d(billingFlowParamsBuild, "build(...)");
        launchBillingFlow(activity, billingFlowParamsBuild);
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    public void queryPurchaseHistory(@NotNull QStoreProductType productType, @NotNull tf.p onCompleted) {
        AbstractC3340k.e(productType, "productType");
        AbstractC3340k.e(onCompleted, "onCompleted");
        getBillingClientHolder().withReadyClient(new C21821(productType, onCompleted));
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    public void queryPurchaseHistoryForProduct(@NotNull QProduct product, @NotNull tf.p onCompleted) {
        AbstractC3340k.e(product, "product");
        AbstractC3340k.e(onCompleted, "onCompleted");
        QProductStoreDetails storeDetails = product.getStoreDetails();
        if (storeDetails == null) {
            return;
        }
        String productType = storeDetails.getOriginalProductDetails().getProductType();
        AbstractC3340k.d(productType, "getProductType(...)");
        getBillingClientHolder().withReadyClient(new C21831(storeDetails, productType, onCompleted));
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    public void queryPurchases(@NotNull l onFailed, @NotNull l onCompleted) {
        AbstractC3340k.e(onFailed, "onFailed");
        AbstractC3340k.e(onCompleted, "onCompleted");
        getBillingClientHolder().withReadyClient(new C21841(onFailed, onCompleted));
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    public void withStoreDataLoaded(@NotNull List<? extends ProductStoreId> storeIds, @NotNull l onFailed, @NotNull tf.a onReady) {
        AbstractC3340k.e(storeIds, "storeIds");
        AbstractC3340k.e(onFailed, "onFailed");
        AbstractC3340k.e(onReady, "onReady");
        List<? extends ProductStoreId> list = storeIds;
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProductStoreId) it.next()).getProductId());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!this.productDetails.containsKey((String) obj)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            onReady.invoke();
        } else {
            loadProducts(arrayList2, onFailed, new C21851(onReady));
        }
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    @Nullable
    public ProductDetails getStoreData(@NotNull ProductStoreId storeId) {
        AbstractC3340k.e(storeId, "storeId");
        return this.productDetails.get(storeId.getProductId());
    }
}
