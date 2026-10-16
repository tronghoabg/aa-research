package com.qonversion.android.sdk.internal.billing;

import android.app.Activity;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.applovin.sdk.AppLovinEventTypes;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.internal.dto.QStoreProductType;
import com.qonversion.android.sdk.internal.logger.Logger;
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
import org.apache.tika.utils.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r7.AbstractC3935e;
import tf.l;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u0002B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJO\u0010\u0013\u001a\u00020\u00102\u0010\u0010\r\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014JW\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00032\u0010\u0010\u0016\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\f2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001a\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0010\u0010\u0016\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJC\u0010 \u001a\u00020\u00102\u0010\u0010\u001c\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\f2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\u0004\u0018\u00010\u00052\n\u0010\"\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b#\u0010$JQ\u0010.\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u00010\u00032\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010-\u001a\u0004\u0018\u00010,2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0016¢\u0006\u0004\b.\u0010/J3\u00104\u001a\u00020\u00102\u0006\u0010(\u001a\u00020'2\u001a\u00103\u001a\u0016\u0012\u0004\u0012\u000201\u0012\u0006\u0012\u0004\u0018\u000102\u0012\u0004\u0012\u00020\u001000H\u0016¢\u0006\u0004\b4\u00105J9\u00107\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u0002062 \u00103\u001a\u001c\u0012\u0004\u0012\u000201\u0012\f\u0012\n\u0012\u0004\u0012\u000202\u0018\u00010\f\u0012\u0004\u0012\u00020\u001000H\u0016¢\u0006\u0004\b7\u00108J=\u0010:\u001a\u00020\u00102\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0018\u00103\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\f\u0012\u0004\u0012\u00020\u00100\u000eH\u0016¢\u0006\u0004\b:\u0010;J?\u0010=\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00032\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00100\u000eH\u0016¢\u0006\u0004\b=\u0010>R,\u0010@\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050?8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b@\u0010A\u0012\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;", "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;", "Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;", "", "Lcom/qonversion/android/sdk/internal/billing/LegacyStoreId;", "Lcom/android/billingclient/api/SkuDetails;", "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;", "billingClientHolder", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "logger", "<init>", "(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/logger/Logger;)V", "", "productIds", "Lkotlin/Function1;", "Lcom/qonversion/android/sdk/internal/billing/BillingError;", "Lef/C;", "onQuerySkuFailed", "onQuerySkuCompleted", "loadProducts", "(Ljava/util/List;Ltf/l;Ltf/l;)V", "productType", "skuList", "querySkuDetailsAsync", "(Ljava/lang/String;Ljava/util/List;Ltf/l;Ltf/l;)V", "skuDetailsList", "logSkuDetails", "(Ljava/util/List;Ljava/util/List;)V", "storeIds", "onFailed", "Lkotlin/Function0;", "onReady", "withStoreDataLoaded", "(Ljava/util/List;Ltf/l;Ltf/a;)V", "storeId", "getStoreData", "(Ljava/lang/String;)Lcom/android/billingclient/api/SkuDetails;", "Landroid/app/Activity;", "activity", "Lcom/qonversion/android/sdk/dto/products/QProduct;", AppLovinEventTypes.USER_VIEWED_PRODUCT, "offerId", "", "applyOffer", "Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;", "updatePurchaseInfo", "makePurchase", "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;Ltf/l;)V", "Lkotlin/Function2;", "Lcom/android/billingclient/api/BillingResult;", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "onCompleted", "queryPurchaseHistoryForProduct", "(Lcom/qonversion/android/sdk/dto/products/QProduct;Ltf/p;)V", "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;", "queryPurchaseHistory", "(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ltf/p;)V", "Lcom/android/billingclient/api/Purchase;", "queryPurchases", "(Ltf/l;Ltf/l;)V", "onSuccess", "getStoreProductType", "(Ljava/lang/String;Ltf/l;Ltf/l;)V", "", "skuDetails", "Ljava/util/Map;", "getSkuDetails$annotations", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LegacyBillingClientWrapper extends BillingClientWrapperBase implements IBillingClientWrapper<String, SkuDetails> {

    @NotNull
    private Map<String, ? extends SkuDetails> skuDetails;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/android/billingclient/api/SkuDetails;", "details", "Lef/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper$getStoreProductType$2, reason: invalid class name */
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
            invoke((List<? extends SkuDetails>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull List<? extends SkuDetails> details) {
            AbstractC3340k.e(details, "details");
            SkuDetails skuDetails = (SkuDetails) o.s0(details);
            C2515C c2515c = null;
            if (skuDetails != null) {
                if (!AbstractC3340k.a(skuDetails.getSku(), this.$storeId)) {
                    skuDetails = null;
                }
                if (skuDetails != null) {
                    l lVar = this.$onSuccess;
                    QStoreProductType.Companion companion = QStoreProductType.INSTANCE;
                    String type = skuDetails.getType();
                    AbstractC3340k.d(type, "getType(...)");
                    lVar.invoke(companion.fromSkuType(type));
                    c2515c = C2515C.f34653a;
                }
            }
            if (c2515c == null) {
                this.$onFailed.invoke(new BillingError(4, "Product not found"));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/android/billingclient/api/SkuDetails;", "skuDetailsSubs", "Lef/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper$loadProducts$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements l {
        final /* synthetic */ l $onQuerySkuCompleted;
        final /* synthetic */ l $onQuerySkuFailed;
        final /* synthetic */ List<String> $productIds;
        final /* synthetic */ LegacyBillingClientWrapper this$0;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/android/billingclient/api/SkuDetails;", "skuDetailsInApp", "Lef/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper$loadProducts$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01701 extends AbstractC3343n implements l {
            final /* synthetic */ l $onQuerySkuCompleted;
            final /* synthetic */ List<SkuDetails> $skuDetailsSubs;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C01701(l lVar, List<? extends SkuDetails> list) {
                super(1);
                this.$onQuerySkuCompleted = lVar;
                this.$skuDetailsSubs = list;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends SkuDetails>) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull List<? extends SkuDetails> skuDetailsInApp) {
                AbstractC3340k.e(skuDetailsInApp, "skuDetailsInApp");
                this.$onQuerySkuCompleted.invoke(o.E0(skuDetailsInApp, this.$skuDetailsSubs));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<String> list, LegacyBillingClientWrapper legacyBillingClientWrapper, l lVar, l lVar2) {
            super(1);
            this.$productIds = list;
            this.this$0 = legacyBillingClientWrapper;
            this.$onQuerySkuFailed = lVar;
            this.$onQuerySkuCompleted = lVar2;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends SkuDetails>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull List<? extends SkuDetails> skuDetailsSubs) {
            AbstractC3340k.e(skuDetailsSubs, "skuDetailsSubs");
            List<? extends SkuDetails> list = skuDetailsSubs;
            ArrayList arrayList = new ArrayList(p.a0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((SkuDetails) it.next()).getSku());
            }
            List listB0 = o.B0(this.$productIds, o.X0(arrayList));
            if (listB0.isEmpty()) {
                this.$onQuerySkuCompleted.invoke(skuDetailsSubs);
            } else {
                this.this$0.querySkuDetailsAsync("inapp", listB0, new C01701(this.$onQuerySkuCompleted, skuDetailsSubs), this.$onQuerySkuFailed);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/BillingClient;", "Lef/C;", "invoke", "(Lcom/android/billingclient/api/BillingClient;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper$queryPurchaseHistory$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21881 extends AbstractC3343n implements l {
        final /* synthetic */ tf.p $onCompleted;
        final /* synthetic */ QStoreProductType $productType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21881(QStoreProductType qStoreProductType, tf.p pVar) {
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
            withReadyClient.queryPurchaseHistoryAsync(this.$productType.toSkuType(), new c(this.$onCompleted, 1));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/BillingClient;", "Lef/C;", "invoke", "(Lcom/android/billingclient/api/BillingClient;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21891 extends AbstractC3343n implements l {
        final /* synthetic */ tf.p $onCompleted;
        final /* synthetic */ SkuDetails $skuDetails;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21891(SkuDetails skuDetails, tf.p pVar) {
            super(1);
            this.$skuDetails = skuDetails;
            this.$onCompleted = pVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$1(tf.p onCompleted, SkuDetails skuDetails, BillingResult billingResult, List list) {
            AbstractC3340k.e(onCompleted, "$onCompleted");
            AbstractC3340k.e(skuDetails, "$skuDetails");
            AbstractC3340k.e(billingResult, "billingResult");
            Object obj = null;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    String sku = skuDetails.getSku();
                    ArrayList<String> skus = ((PurchaseHistoryRecord) next).getSkus();
                    AbstractC3340k.d(skus, "getSkus(...)");
                    if (AbstractC3340k.a(sku, o.s0(skus))) {
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
            LegacyBillingClientWrapper.this.getLogger().debug("queryPurchaseHistoryForProduct() -> Querying purchase history for " + this.$skuDetails.getSku() + " with type " + this.$skuDetails.getType());
            withReadyClient.queryPurchaseHistoryAsync(this.$skuDetails.getType(), new d(2, this.$onCompleted, this.$skuDetails));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/BillingClient;", "Lef/C;", "invoke", "(Lcom/android/billingclient/api/BillingClient;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper$queryPurchases$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21901 extends AbstractC3343n implements l {
        final /* synthetic */ l $onCompleted;
        final /* synthetic */ l $onFailed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21901(l lVar, l lVar2) {
            super(1);
            this.$onFailed = lVar;
            this.$onCompleted = lVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$3(LegacyBillingClientWrapper this$0, l onFailed, BillingClient this_withReadyClient, l onCompleted, BillingResult subsResult, List activeSubs) {
            AbstractC3340k.e(this$0, "this$0");
            AbstractC3340k.e(onFailed, "$onFailed");
            AbstractC3340k.e(this_withReadyClient, "$this_withReadyClient");
            AbstractC3340k.e(onCompleted, "$onCompleted");
            AbstractC3340k.e(subsResult, "subsResult");
            AbstractC3340k.e(activeSubs, "activeSubs");
            if (UtilsKt.isOk(subsResult)) {
                this_withReadyClient.queryPurchasesAsync("inapp", new e(this$0, subsResult, onFailed, activeSubs, onCompleted, 1));
            } else {
                this$0.handlePurchasesQueryError(subsResult, "subscription", onFailed);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$3$lambda$2(LegacyBillingClientWrapper this$0, BillingResult subsResult, l onFailed, List activeSubs, l onCompleted, BillingResult inAppsResult, List unconsumedInApp) {
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
            withReadyClient.queryPurchasesAsync("subs", new b(LegacyBillingClientWrapper.this, this.$onFailed, withReadyClient, this.$onCompleted, 2));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/BillingClient;", "Lef/C;", "invoke", "(Lcom/android/billingclient/api/BillingClient;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper$querySkuDetailsAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21911 extends AbstractC3343n implements l {
        final /* synthetic */ l $onQuerySkuCompleted;
        final /* synthetic */ l $onQuerySkuFailed;
        final /* synthetic */ SkuDetailsParams $params;
        final /* synthetic */ List<String> $skuList;
        final /* synthetic */ LegacyBillingClientWrapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21911(SkuDetailsParams skuDetailsParams, LegacyBillingClientWrapper legacyBillingClientWrapper, List<String> list, l lVar, l lVar2) {
            super(1);
            this.$params = skuDetailsParams;
            this.this$0 = legacyBillingClientWrapper;
            this.$skuList = list;
            this.$onQuerySkuCompleted = lVar;
            this.$onQuerySkuFailed = lVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(LegacyBillingClientWrapper this$0, List skuList, l onQuerySkuCompleted, l onQuerySkuFailed, BillingResult billingResult, List list) {
            String str;
            AbstractC3340k.e(this$0, "this$0");
            AbstractC3340k.e(skuList, "$skuList");
            AbstractC3340k.e(onQuerySkuCompleted, "$onQuerySkuCompleted");
            AbstractC3340k.e(onQuerySkuFailed, "$onQuerySkuFailed");
            AbstractC3340k.e(billingResult, "billingResult");
            if (UtilsKt.isOk(billingResult) && list != null) {
                this$0.logSkuDetails(list, skuList);
                onQuerySkuCompleted.invoke(list);
                return;
            }
            if (list == null) {
                str = "Failed to fetch products. SkuDetails list for " + skuList + " is null. ";
            } else {
                str = "Failed to fetch products. ";
            }
            onQuerySkuFailed.invoke(new BillingError(billingResult.getResponseCode(), N0.a.g(str, StringUtils.SPACE, UtilsKt.getDescription(billingResult))));
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingClient) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull BillingClient withReadyClient) {
            AbstractC3340k.e(withReadyClient, "$this$withReadyClient");
            withReadyClient.querySkuDetailsAsync(this.$params, new b(this.this$0, this.$skuList, this.$onQuerySkuCompleted, this.$onQuerySkuFailed, 3));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/android/billingclient/api/SkuDetails;", "details", "Lef/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper$withStoreDataLoaded$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21921 extends AbstractC3343n implements l {
        final /* synthetic */ tf.a $onReady;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21921(tf.a aVar) {
            super(1);
            this.$onReady = aVar;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends SkuDetails>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull List<? extends SkuDetails> details) {
            AbstractC3340k.e(details, "details");
            List<? extends SkuDetails> list = details;
            int iD = AbstractC2641B.D(p.a0(list, 10));
            if (iD < 16) {
                iD = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iD);
            for (Object obj : list) {
                linkedHashMap.put(((SkuDetails) obj).getSku(), obj);
            }
            LegacyBillingClientWrapper legacyBillingClientWrapper = LegacyBillingClientWrapper.this;
            legacyBillingClientWrapper.skuDetails = AbstractC2640A.T(legacyBillingClientWrapper.skuDetails, AbstractC2640A.a0(linkedHashMap));
            this.$onReady.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyBillingClientWrapper(@NotNull BillingClientHolder billingClientHolder, @NotNull Logger logger) {
        super(billingClientHolder, logger);
        AbstractC3340k.e(billingClientHolder, "billingClientHolder");
        AbstractC3340k.e(logger, "logger");
        this.skuDetails = w.f35433a;
    }

    private static /* synthetic */ void getSkuDetails$annotations() {
    }

    private final void loadProducts(List<String> productIds, l onQuerySkuFailed, l onQuerySkuCompleted) {
        querySkuDetailsAsync("subs", productIds, new AnonymousClass1(productIds, this, onQuerySkuFailed, onQuerySkuCompleted), onQuerySkuFailed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logSkuDetails(List<? extends SkuDetails> skuDetailsList, List<String> skuList) {
        C2515C c2515c = null;
        if (skuDetailsList.isEmpty()) {
            skuDetailsList = null;
        }
        if (skuDetailsList != null) {
            for (SkuDetails skuDetails : skuDetailsList) {
                getLogger().debug("querySkuDetailsAsync() -> " + skuDetails);
            }
            c2515c = C2515C.f34653a;
        }
        if (c2515c == null) {
            getLogger().warn("querySkuDetailsAsync() -> SkuDetails list for " + skuList + " is empty.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void querySkuDetailsAsync(String productType, List<String> skuList, l onQuerySkuCompleted, l onQuerySkuFailed) {
        SkuDetailsParams skuDetailsParamsBuild = SkuDetailsParams.newBuilder().setType(productType).setSkusList(skuList).build();
        AbstractC3340k.d(skuDetailsParamsBuild, "build(...)");
        getBillingClientHolder().withReadyClient(new C21911(skuDetailsParamsBuild, this, skuList, onQuerySkuCompleted, onQuerySkuFailed));
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    public void getStoreProductType(@NotNull String storeId, @NotNull l onFailed, @NotNull l onSuccess) {
        AbstractC3340k.e(storeId, "storeId");
        AbstractC3340k.e(onFailed, "onFailed");
        AbstractC3340k.e(onSuccess, "onSuccess");
        SkuDetails skuDetails = this.skuDetails.get(storeId);
        if (skuDetails == null) {
            loadProducts(AbstractC3935e.C(storeId), onFailed, new AnonymousClass2(onFailed, storeId, onSuccess));
            return;
        }
        QStoreProductType.Companion companion = QStoreProductType.INSTANCE;
        String type = skuDetails.getType();
        AbstractC3340k.d(type, "getType(...)");
        onSuccess.invoke(companion.fromSkuType(type));
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    public void makePurchase(@NotNull Activity activity, @NotNull QProduct product, @Nullable String offerId, @Nullable Boolean applyOffer, @Nullable UpdatePurchaseInfo updatePurchaseInfo, @NotNull l onFailed) {
        AbstractC3340k.e(activity, "activity");
        AbstractC3340k.e(product, "product");
        AbstractC3340k.e(onFailed, "onFailed");
        SkuDetails skuDetail = product.getSkuDetail();
        if (skuDetail == null) {
            return;
        }
        getLogger().debug("makePurchase() -> Purchasing the sku: " + skuDetail.getSku());
        BillingFlowParams.Builder skuDetails = BillingFlowParams.newBuilder().setSkuDetails(skuDetail);
        AbstractC3340k.d(skuDetails, "setSkuDetails(...)");
        BillingFlowParams billingFlowParamsBuild = setSubscriptionUpdateParams(skuDetails, updatePurchaseInfo).build();
        AbstractC3340k.d(billingFlowParamsBuild, "build(...)");
        launchBillingFlow(activity, billingFlowParamsBuild);
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    public void queryPurchaseHistory(@NotNull QStoreProductType productType, @NotNull tf.p onCompleted) {
        AbstractC3340k.e(productType, "productType");
        AbstractC3340k.e(onCompleted, "onCompleted");
        getBillingClientHolder().withReadyClient(new C21881(productType, onCompleted));
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    public void queryPurchaseHistoryForProduct(@NotNull QProduct product, @NotNull tf.p onCompleted) {
        AbstractC3340k.e(product, "product");
        AbstractC3340k.e(onCompleted, "onCompleted");
        SkuDetails skuDetail = product.getSkuDetail();
        if (skuDetail == null) {
            return;
        }
        getBillingClientHolder().withReadyClient(new C21891(skuDetail, onCompleted));
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    public void queryPurchases(@NotNull l onFailed, @NotNull l onCompleted) {
        AbstractC3340k.e(onFailed, "onFailed");
        AbstractC3340k.e(onCompleted, "onCompleted");
        getBillingClientHolder().withReadyClient(new C21901(onFailed, onCompleted));
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    public void withStoreDataLoaded(@NotNull List<? extends String> storeIds, @NotNull l onFailed, @NotNull tf.a onReady) {
        AbstractC3340k.e(storeIds, "storeIds");
        AbstractC3340k.e(onFailed, "onFailed");
        AbstractC3340k.e(onReady, "onReady");
        ArrayList arrayList = new ArrayList();
        for (Object obj : storeIds) {
            if (!this.skuDetails.containsKey((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            onReady.invoke();
        } else {
            loadProducts(arrayList, onFailed, new C21921(onReady));
        }
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    @Nullable
    public SkuDetails getStoreData(@NotNull String storeId) {
        AbstractC3340k.e(storeId, "storeId");
        return this.skuDetails.get(storeId);
    }
}
