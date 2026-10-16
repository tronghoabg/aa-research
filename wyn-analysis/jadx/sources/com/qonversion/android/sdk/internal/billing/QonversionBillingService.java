package com.qonversion.android.sdk.internal.billing;

import A7.AbstractC0279p0;
import android.app.Activity;
import android.os.Handler;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.applovin.sdk.AppLovinEventTypes;
import com.qonversion.android.sdk.dto.QPurchaseOptions;
import com.qonversion.android.sdk.dto.QPurchaseUpdatePolicy;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.dto.products.QProductStoreDetails;
import com.qonversion.android.sdk.internal.billing.BillingClientHolder;
import com.qonversion.android.sdk.internal.dto.ProductStoreId;
import com.qonversion.android.sdk.internal.dto.QStoreProductType;
import com.qonversion.android.sdk.internal.dto.purchase.PurchaseModelInternalEnriched;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.purchase.PurchaseHistory;
import ef.C2515C;
import ff.m;
import ff.o;
import ff.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.apache.tika.utils.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;
import tf.p;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001hBA\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013JK\u0010\u001c\u001a\u00020\u00192\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0018\u0010\u001b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00190\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u00192\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010(\u001a\u00020\u00192\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0014H\u0016¢\u0006\u0004\b(\u0010\u001fJ\u001d\u0010+\u001a\u00020\u00192\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0014H\u0016¢\u0006\u0004\b+\u0010\u001fJ=\u0010-\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0018\u0010,\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u0014\u0012\u0004\u0012\u00020\u00190\u0017H\u0016¢\u0006\u0004\b-\u0010.J=\u0010/\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0018\u0010,\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u0014\u0012\u0004\u0012\u00020\u00190\u0017H\u0016¢\u0006\u0004\b/\u0010.J?\u00104\u001a\u00020\u00192\u0006\u00101\u001a\u0002002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u00190\u0017H\u0016¢\u0006\u0004\b4\u00105J'\u00108\u001a\u00020\u00192\u0006\u00107\u001a\u0002062\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u0014H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0019H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u0018H\u0016¢\u0006\u0004\b=\u0010>JE\u0010E\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 2\u0006\u0010?\u001a\u00020\u00152\b\u0010@\u001a\u0004\u0018\u0001002\b\u0010A\u001a\u0004\u0018\u00010\n2\u0006\u0010B\u001a\u00020\u00152\b\u0010D\u001a\u0004\u0018\u00010CH\u0002¢\u0006\u0004\bE\u0010FJ?\u0010I\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 2\u0006\u0010?\u001a\u00020\u00152\b\u0010@\u001a\u0004\u0018\u0001002\b\u0010A\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010GH\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\u00192\u0006\u0010K\u001a\u000200H\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\u00192\u0006\u0010K\u001a\u000200H\u0002¢\u0006\u0004\bN\u0010MJE\u0010R\u001a\u00020\u00192\u0006\u0010O\u001a\u0002022\u0018\u0010P\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u0014\u0012\u0004\u0012\u00020\u00190\u00172\u0012\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0002¢\u0006\u0004\bR\u0010SJ+\u0010U\u001a\b\u0012\u0004\u0012\u00020)0\u00142\u0006\u0010O\u001a\u0002022\f\u0010*\u001a\b\u0012\u0004\u0012\u00020T0\u0014H\u0002¢\u0006\u0004\bU\u0010VJ%\u0010X\u001a\u00020\u00192\u0014\u0010W\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0002¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u0019H\u0002¢\u0006\u0004\bZ\u0010;J!\u0010\\\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010[2\u0006\u0010?\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\\\u0010]R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010^R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010_R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010`R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010cR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010dR(\u0010f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00190\u00170e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010g¨\u0006i"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$ConnectionListener;", "Lcom/qonversion/android/sdk/internal/billing/BillingService;", "Landroid/os/Handler;", "mainHandler", "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;", "purchasesListener", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "logger", "", "isAnalyticsMode", "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;", "billingClientHolder", "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;", "billingClientWrapper", "Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;", "legacyBillingClientWrapper", "<init>", "(Landroid/os/Handler;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;Lcom/qonversion/android/sdk/internal/logger/Logger;ZLcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;)V", "", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "products", "Lkotlin/Function1;", "Lcom/qonversion/android/sdk/internal/billing/BillingError;", "Lef/C;", "onFailed", "onEnriched", "enrichStoreDataAsync", "(Ljava/util/List;Ltf/l;Ltf/l;)V", "enrichStoreData", "(Ljava/util/List;)V", "Landroid/app/Activity;", "activity", "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;", "purchaseModel", "purchase", "(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;)V", "Lcom/android/billingclient/api/Purchase;", "purchases", "consumePurchases", "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;", "historyRecords", "consumeHistoryRecords", "onCompleted", "queryPurchasesHistory", "(Ltf/l;Ltf/l;)V", "queryPurchases", "", "storeId", "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;", "onSuccess", "getStoreProductType", "(Ljava/lang/String;Ltf/l;Ltf/l;)V", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "onPurchasesUpdated", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "onBillingClientConnected", "()V", "error", "onBillingClientUnavailable", "(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V", AppLovinEventTypes.USER_VIEWED_PRODUCT, "offerId", "applyOffer", "oldProduct", "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;", "updatePolicy", "updatePurchase", "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;)V", "Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;", "updatePurchaseInfo", "makePurchase", "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;)V", "purchaseToken", "consume", "(Ljava/lang/String;)V", "acknowledge", "productType", "onQueryHistoryCompleted", "onQueryHistoryFailed", "queryPurchaseHistoryAsync", "(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ltf/l;Ltf/l;)V", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "getPurchaseHistoryFromHistoryRecords", "(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ljava/util/List;)Ljava/util/List;", "request", "executeOnMainThread", "(Ltf/l;)V", "executeRequestsFromQueue", "Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;", "chooseBillingClientWrapperForProductPurchase", "(Lcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;", "Landroid/os/Handler;", "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "Z", "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;", "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;", "Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "requestsQueue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "PurchasesListener", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QonversionBillingService implements PurchasesUpdatedListener, BillingClientHolder.ConnectionListener, BillingService {

    @NotNull
    private final BillingClientHolder billingClientHolder;

    @NotNull
    private final BillingClientWrapper billingClientWrapper;
    private final boolean isAnalyticsMode;

    @NotNull
    private final LegacyBillingClientWrapper legacyBillingClientWrapper;

    @NotNull
    private final Logger logger;

    @NotNull
    private final Handler mainHandler;

    @NotNull
    private final PurchasesListener purchasesListener;

    @NotNull
    private final ConcurrentLinkedQueue<l> requestsQueue;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;", "", "", "Lcom/android/billingclient/api/Purchase;", "purchases", "Lef/C;", "onPurchasesCompleted", "(Ljava/util/List;)V", "Lcom/qonversion/android/sdk/internal/billing/BillingError;", "error", "onPurchasesFailed", "(Lcom/qonversion/android/sdk/internal/billing/BillingError;Ljava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface PurchasesListener {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ void onPurchasesFailed$default(PurchasesListener purchasesListener, BillingError billingError, List list, int i5, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onPurchasesFailed");
                }
                if ((i5 & 2) != 0) {
                    list = v.f35432a;
                }
                purchasesListener.onPurchasesFailed(billingError, list);
            }
        }

        void onPurchasesCompleted(@NotNull List<? extends Purchase> purchases);

        void onPurchasesFailed(@NotNull BillingError error, @NotNull List<? extends Purchase> purchases);
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QStoreProductType.values().length];
            try {
                iArr[QStoreProductType.InApp.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QStoreProductType.Subscription.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingError;", "billingSetupError", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.QonversionBillingService$acknowledge$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements l {
        final /* synthetic */ String $purchaseToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(1);
            this.$purchaseToken = str;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingError) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@Nullable BillingError billingError) {
            if (billingError == null) {
                QonversionBillingService.this.billingClientWrapper.acknowledge(this.$purchaseToken);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingError;", "billingSetupError", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.QonversionBillingService$consume$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21931 extends AbstractC3343n implements l {
        final /* synthetic */ String $purchaseToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21931(String str) {
            super(1);
            this.$purchaseToken = str;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingError) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@Nullable BillingError billingError) {
            if (billingError == null) {
                QonversionBillingService.this.billingClientWrapper.consume(this.$purchaseToken);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingError;", "billingSetupError", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.QonversionBillingService$enrichStoreDataAsync$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3343n implements l {
        final /* synthetic */ l $onEnriched;
        final /* synthetic */ l $onFailed;
        final /* synthetic */ List<QProduct> $products;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingError;", "it", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.billing.QonversionBillingService$enrichStoreDataAsync$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends AbstractC3343n implements l {
            final /* synthetic */ l $onEnriched;
            final /* synthetic */ l $onFailed;
            final /* synthetic */ List<QProduct> $products;
            final /* synthetic */ QonversionBillingService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(List<QProduct> list, QonversionBillingService qonversionBillingService, l lVar, l lVar2) {
                super(1);
                this.$products = list;
                this.this$0 = qonversionBillingService;
                this.$onFailed = lVar;
                this.$onEnriched = lVar2;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((BillingError) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull BillingError it) {
                AbstractC3340k.e(it, "it");
                QonversionBillingService.enrichStoreDataAsync$fetchProductDetails(this.$products, this.this$0, this.$onFailed, this.$onEnriched);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.billing.QonversionBillingService$enrichStoreDataAsync$2$2, reason: invalid class name and collision with other inner class name */
        public static final class C01712 extends AbstractC3343n implements tf.a {
            final /* synthetic */ l $onEnriched;
            final /* synthetic */ l $onFailed;
            final /* synthetic */ List<QProduct> $products;
            final /* synthetic */ QonversionBillingService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01712(List<QProduct> list, QonversionBillingService qonversionBillingService, l lVar, l lVar2) {
                super(0);
                this.$products = list;
                this.this$0 = qonversionBillingService;
                this.$onFailed = lVar;
                this.$onEnriched = lVar2;
            }

            @Override // tf.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m222invoke();
                return C2515C.f34653a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m222invoke() {
                QonversionBillingService.enrichStoreDataAsync$fetchProductDetails(this.$products, this.this$0, this.$onFailed, this.$onEnriched);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(l lVar, List<QProduct> list, l lVar2) {
            super(1);
            this.$onFailed = lVar;
            this.$products = list;
            this.$onEnriched = lVar2;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingError) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@Nullable BillingError billingError) {
            if (billingError != null) {
                QonversionBillingService.this.logger.error("enrichStoreDataAsync() -> " + billingError);
                this.$onFailed.invoke(billingError);
                return;
            }
            List<QProduct> list = this.$products;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String storeID = ((QProduct) it.next()).getStoreID();
                if (storeID != null) {
                    arrayList.add(storeID);
                }
            }
            QonversionBillingService.this.legacyBillingClientWrapper.withStoreDataLoaded(arrayList, new AnonymousClass1(this.$products, QonversionBillingService.this, this.$onFailed, this.$onEnriched), new C01712(this.$products, QonversionBillingService.this, this.$onFailed, this.$onEnriched));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingError;", "actualError", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.QonversionBillingService$getStoreProductType$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21941 extends AbstractC3343n implements l {
        final /* synthetic */ l $onFailed;
        final /* synthetic */ l $onSuccess;
        final /* synthetic */ String $storeId;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingError;", "it", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.billing.QonversionBillingService$getStoreProductType$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01721 extends AbstractC3343n implements l {
            final /* synthetic */ BillingError $actualError;
            final /* synthetic */ l $onFailed;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01721(l lVar, BillingError billingError) {
                super(1);
                this.$onFailed = lVar;
                this.$actualError = billingError;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((BillingError) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull BillingError it) {
                AbstractC3340k.e(it, "it");
                this.$onFailed.invoke(this.$actualError);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21941(String str, l lVar, l lVar2) {
            super(1);
            this.$storeId = str;
            this.$onSuccess = lVar;
            this.$onFailed = lVar2;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingError) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull BillingError actualError) {
            AbstractC3340k.e(actualError, "actualError");
            QonversionBillingService.this.legacyBillingClientWrapper.getStoreProductType(this.$storeId, new C01721(this.$onFailed, actualError), this.$onSuccess);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingError;", "billingSetupError", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.QonversionBillingService$makePurchase$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21951 extends AbstractC3343n implements l {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Boolean $applyOffer;
        final /* synthetic */ String $offerId;
        final /* synthetic */ QProduct $product;
        final /* synthetic */ UpdatePurchaseInfo $updatePurchaseInfo;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingError;", "error", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.billing.QonversionBillingService$makePurchase$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01731 extends AbstractC3343n implements l {
            final /* synthetic */ QonversionBillingService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01731(QonversionBillingService qonversionBillingService) {
                super(1);
                this.this$0 = qonversionBillingService;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((BillingError) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull BillingError error) {
                AbstractC3340k.e(error, "error");
                PurchasesListener.DefaultImpls.onPurchasesFailed$default(this.this$0.purchasesListener, error, null, 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21951(QProduct qProduct, Activity activity, String str, Boolean bool, UpdatePurchaseInfo updatePurchaseInfo) {
            super(1);
            this.$product = qProduct;
            this.$activity = activity;
            this.$offerId = str;
            this.$applyOffer = bool;
            this.$updatePurchaseInfo = updatePurchaseInfo;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingError) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@Nullable BillingError billingError) {
            if (billingError != null) {
                return;
            }
            IBillingClientWrapper iBillingClientWrapperChooseBillingClientWrapperForProductPurchase = QonversionBillingService.this.chooseBillingClientWrapperForProductPurchase(this.$product);
            if (iBillingClientWrapperChooseBillingClientWrapperForProductPurchase != null) {
                iBillingClientWrapperChooseBillingClientWrapperForProductPurchase.makePurchase(this.$activity, this.$product, this.$offerId, this.$applyOffer, this.$updatePurchaseInfo, new C01731(QonversionBillingService.this));
                return;
            }
            PurchasesListener.DefaultImpls.onPurchasesFailed$default(QonversionBillingService.this.purchasesListener, new BillingError(4, AbstractC0279p0.l("Store details for purchasing Qonversion product ", this.$product.getQonversionID(), " were not found")), null, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/android/billingclient/api/Purchase;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.qonversion.android.sdk.internal.billing.QonversionBillingService$onPurchasesUpdated$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21961 extends AbstractC3343n implements l {
        public static final C21961 INSTANCE = new C21961();

        public C21961() {
            super(1);
        }

        @Override // tf.l
        @NotNull
        public final CharSequence invoke(@NotNull Purchase it) {
            AbstractC3340k.e(it, "it");
            return UtilsKt.getDescription(it);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingError;", "error", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.QonversionBillingService$purchase$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21971 extends AbstractC3343n implements l {
        public C21971() {
            super(1);
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingError) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull BillingError error) {
            AbstractC3340k.e(error, "error");
            PurchasesListener.DefaultImpls.onPurchasesFailed$default(QonversionBillingService.this.purchasesListener, error, null, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "it", "Lef/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.QonversionBillingService$purchase$2, reason: invalid class name and case insensitive filesystem */
    public static final class C21982 extends AbstractC3343n implements l {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ PurchaseModelInternalEnriched $purchaseModel;
        final /* synthetic */ QonversionBillingService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21982(PurchaseModelInternalEnriched purchaseModelInternalEnriched, QonversionBillingService qonversionBillingService, Activity activity) {
            super(1);
            this.$purchaseModel = purchaseModelInternalEnriched;
            this.this$0 = qonversionBillingService;
            this.$activity = activity;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<QProduct>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull List<QProduct> it) {
            AbstractC3340k.e(it, "it");
            QonversionBillingService.purchase$handlePurchase(this.$purchaseModel, this.this$0, this.$activity);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingError;", "billingSetupError", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.QonversionBillingService$queryPurchaseHistoryAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21991 extends AbstractC3343n implements l {
        final /* synthetic */ l $onQueryHistoryCompleted;
        final /* synthetic */ l $onQueryHistoryFailed;
        final /* synthetic */ QStoreProductType $productType;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "purchaseHistoryRecords", "Lef/C;", "invoke", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.billing.QonversionBillingService$queryPurchaseHistoryAsync$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01741 extends AbstractC3343n implements p {
            final /* synthetic */ l $onQueryHistoryCompleted;
            final /* synthetic */ l $onQueryHistoryFailed;
            final /* synthetic */ QStoreProductType $productType;
            final /* synthetic */ QonversionBillingService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01741(QonversionBillingService qonversionBillingService, QStoreProductType qStoreProductType, l lVar, l lVar2) {
                super(2);
                this.this$0 = qonversionBillingService;
                this.$productType = qStoreProductType;
                this.$onQueryHistoryCompleted = lVar;
                this.$onQueryHistoryFailed = lVar2;
            }

            @Override // tf.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((BillingResult) obj, (List<? extends PurchaseHistoryRecord>) obj2);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull BillingResult billingResult, @Nullable List<? extends PurchaseHistoryRecord> list) {
                String str;
                AbstractC3340k.e(billingResult, "billingResult");
                if (UtilsKt.isOk(billingResult) && list != null) {
                    this.$onQueryHistoryCompleted.invoke(this.this$0.getPurchaseHistoryFromHistoryRecords(this.$productType, list));
                    return;
                }
                if (list == null) {
                    str = "Failed to retrieve purchase history. Purchase history for " + this.$productType + " is null. ";
                } else {
                    str = "Failed to retrieve purchase history. ";
                }
                this.$onQueryHistoryFailed.invoke(new BillingError(billingResult.getResponseCode(), N0.a.g(str, StringUtils.SPACE, UtilsKt.getDescription(billingResult))));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21991(QStoreProductType qStoreProductType, l lVar, l lVar2) {
            super(1);
            this.$productType = qStoreProductType;
            this.$onQueryHistoryFailed = lVar;
            this.$onQueryHistoryCompleted = lVar2;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingError) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@Nullable BillingError billingError) {
            if (billingError != null) {
                this.$onQueryHistoryFailed.invoke(billingError);
                return;
            }
            BillingClientWrapper billingClientWrapper = QonversionBillingService.this.billingClientWrapper;
            QStoreProductType qStoreProductType = this.$productType;
            billingClientWrapper.queryPurchaseHistory(qStoreProductType, new C01741(QonversionBillingService.this, qStoreProductType, this.$onQueryHistoryCompleted, this.$onQueryHistoryFailed));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingError;", "billingSetupError", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.QonversionBillingService$queryPurchases$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22001 extends AbstractC3343n implements l {
        final /* synthetic */ l $onCompleted;
        final /* synthetic */ l $onFailed;
        final /* synthetic */ QonversionBillingService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22001(l lVar, QonversionBillingService qonversionBillingService, l lVar2) {
            super(1);
            this.$onFailed = lVar;
            this.this$0 = qonversionBillingService;
            this.$onCompleted = lVar2;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingError) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@Nullable BillingError billingError) {
            if (billingError != null) {
                this.$onFailed.invoke(billingError);
            } else {
                this.this$0.billingClientWrapper.queryPurchases(this.$onFailed, this.$onCompleted);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;", "subsPurchasesList", "Lef/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.QonversionBillingService$queryPurchasesHistory$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22011 extends AbstractC3343n implements l {
        final /* synthetic */ l $onCompleted;
        final /* synthetic */ l $onFailed;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;", "inAppPurchasesList", "Lef/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.billing.QonversionBillingService$queryPurchasesHistory$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01751 extends AbstractC3343n implements l {
            final /* synthetic */ l $onCompleted;
            final /* synthetic */ List<PurchaseHistory> $subsPurchasesList;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01751(l lVar, List<PurchaseHistory> list) {
                super(1);
                this.$onCompleted = lVar;
                this.$subsPurchasesList = list;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<PurchaseHistory>) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull List<PurchaseHistory> inAppPurchasesList) {
                AbstractC3340k.e(inAppPurchasesList, "inAppPurchasesList");
                this.$onCompleted.invoke(o.E0(inAppPurchasesList, this.$subsPurchasesList));
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingError;", "error", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.billing.QonversionBillingService$queryPurchasesHistory$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends AbstractC3343n implements l {
            final /* synthetic */ l $onFailed;
            final /* synthetic */ QonversionBillingService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(l lVar, QonversionBillingService qonversionBillingService) {
                super(1);
                this.$onFailed = lVar;
                this.this$0 = qonversionBillingService;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((BillingError) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull BillingError error) {
                AbstractC3340k.e(error, "error");
                QonversionBillingService.queryPurchasesHistory$fireOnFailed(this.$onFailed, this.this$0, error);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22011(l lVar, l lVar2) {
            super(1);
            this.$onCompleted = lVar;
            this.$onFailed = lVar2;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<PurchaseHistory>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull List<PurchaseHistory> subsPurchasesList) {
            AbstractC3340k.e(subsPurchasesList, "subsPurchasesList");
            QonversionBillingService.this.queryPurchaseHistoryAsync(QStoreProductType.InApp, new C01751(this.$onCompleted, subsPurchasesList), new AnonymousClass2(this.$onFailed, QonversionBillingService.this));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingError;", "error", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.QonversionBillingService$queryPurchasesHistory$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22022 extends AbstractC3343n implements l {
        final /* synthetic */ l $onFailed;
        final /* synthetic */ QonversionBillingService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22022(l lVar, QonversionBillingService qonversionBillingService) {
            super(1);
            this.$onFailed = lVar;
            this.this$0 = qonversionBillingService;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingError) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull BillingError error) {
            AbstractC3340k.e(error, "error");
            QonversionBillingService.queryPurchasesHistory$fireOnFailed(this.$onFailed, this.this$0, error);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/android/billingclient/api/BillingResult;", "billingResult", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "purchaseHistoryRecord", "Lef/C;", "invoke", "(Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/PurchaseHistoryRecord;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.QonversionBillingService$updatePurchase$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22031 extends AbstractC3343n implements p {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Boolean $applyOffer;
        final /* synthetic */ String $offerId;
        final /* synthetic */ QProduct $oldProduct;
        final /* synthetic */ QProduct $product;
        final /* synthetic */ QPurchaseUpdatePolicy $updatePolicy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22031(Activity activity, QProduct qProduct, String str, Boolean bool, QPurchaseUpdatePolicy qPurchaseUpdatePolicy, QProduct qProduct2) {
            super(2);
            this.$activity = activity;
            this.$product = qProduct;
            this.$offerId = str;
            this.$applyOffer = bool;
            this.$updatePolicy = qPurchaseUpdatePolicy;
            this.$oldProduct = qProduct2;
        }

        @Override // tf.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((BillingResult) obj, (PurchaseHistoryRecord) obj2);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull BillingResult billingResult, @Nullable PurchaseHistoryRecord purchaseHistoryRecord) {
            AbstractC3340k.e(billingResult, "billingResult");
            if (!UtilsKt.isOk(billingResult)) {
                String strF = R8.v.f("Failed to update purchase: ", UtilsKt.getDescription(billingResult));
                PurchasesListener.DefaultImpls.onPurchasesFailed$default(QonversionBillingService.this.purchasesListener, new BillingError(billingResult.getResponseCode(), strF), null, 2, null);
                QonversionBillingService.this.logger.error("updatePurchase() -> " + strF);
                return;
            }
            if (purchaseHistoryRecord == null) {
                String strF2 = R8.v.f("No existing purchase for Qonversion product: ", this.$oldProduct.getQonversionID());
                PurchasesListener.DefaultImpls.onPurchasesFailed$default(QonversionBillingService.this.purchasesListener, new BillingError(billingResult.getResponseCode(), strF2), null, 2, null);
                QonversionBillingService.this.logger.error("updatePurchase() -> " + strF2);
                return;
            }
            com.google.android.gms.internal.consent_sdk.a.z("updatePurchase() -> Purchase was found successfully for store product: ", UtilsKt.getProductId(purchaseHistoryRecord), QonversionBillingService.this.logger);
            QonversionBillingService qonversionBillingService = QonversionBillingService.this;
            Activity activity = this.$activity;
            QProduct qProduct = this.$product;
            String str = this.$offerId;
            Boolean bool = this.$applyOffer;
            String purchaseToken = purchaseHistoryRecord.getPurchaseToken();
            AbstractC3340k.d(purchaseToken, "getPurchaseToken(...)");
            qonversionBillingService.makePurchase(activity, qProduct, str, bool, new UpdatePurchaseInfo(purchaseToken, this.$updatePolicy));
        }
    }

    public QonversionBillingService(@NotNull Handler mainHandler, @NotNull PurchasesListener purchasesListener, @NotNull Logger logger, boolean z2, @NotNull BillingClientHolder billingClientHolder, @NotNull BillingClientWrapper billingClientWrapper, @NotNull LegacyBillingClientWrapper legacyBillingClientWrapper) {
        AbstractC3340k.e(mainHandler, "mainHandler");
        AbstractC3340k.e(purchasesListener, "purchasesListener");
        AbstractC3340k.e(logger, "logger");
        AbstractC3340k.e(billingClientHolder, "billingClientHolder");
        AbstractC3340k.e(billingClientWrapper, "billingClientWrapper");
        AbstractC3340k.e(legacyBillingClientWrapper, "legacyBillingClientWrapper");
        this.mainHandler = mainHandler;
        this.purchasesListener = purchasesListener;
        this.logger = logger;
        this.isAnalyticsMode = z2;
        this.billingClientHolder = billingClientHolder;
        this.billingClientWrapper = billingClientWrapper;
        this.legacyBillingClientWrapper = legacyBillingClientWrapper;
        this.requestsQueue = new ConcurrentLinkedQueue<>();
        billingClientHolder.subscribeOnPurchasesUpdates(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void acknowledge(String purchaseToken) {
        this.logger.debug("acknowledge() -> Acknowledging purchase with token " + purchaseToken);
        executeOnMainThread(new AnonymousClass1(purchaseToken));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IBillingClientWrapper<?, ?> chooseBillingClientWrapperForProductPurchase(QProduct product) {
        QProductStoreDetails storeDetails = product.getStoreDetails();
        if (storeDetails != null && (product.getBasePlanID() != null || storeDetails.getIsInApp())) {
            return this.billingClientWrapper;
        }
        if (product.getSkuDetail() != null) {
            return this.legacyBillingClientWrapper;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void consume(String purchaseToken) {
        this.logger.debug("consume() -> Consuming purchase with token " + purchaseToken);
        executeOnMainThread(new C21931(purchaseToken));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enrichStoreDataAsync$fetchProductDetails(List<QProduct> list, QonversionBillingService qonversionBillingService, l lVar, l lVar2) {
        ArrayList<QProduct> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((QProduct) obj).getStoreID() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ff.p.a0(arrayList, 10));
        for (QProduct qProduct : arrayList) {
            String storeID = qProduct.getStoreID();
            AbstractC3340k.b(storeID);
            arrayList2.add(new ProductStoreId(storeID, qProduct.getBasePlanID(), null, 4, null));
        }
        qonversionBillingService.billingClientWrapper.withStoreDataLoaded(arrayList2, lVar, new QonversionBillingService$enrichStoreDataAsync$fetchProductDetails$1(qonversionBillingService, list, lVar2));
    }

    private final void executeOnMainThread(l request) {
        synchronized (this) {
            try {
                this.requestsQueue.add(request);
                if (this.billingClientHolder.isConnected()) {
                    executeRequestsFromQueue();
                } else {
                    this.billingClientHolder.startConnection(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void executeRequestsFromQueue() {
        synchronized (this) {
            while (this.billingClientHolder.isConnected() && !this.requestsQueue.isEmpty()) {
                this.mainHandler.post(new a(this.requestsQueue.remove(), 1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<PurchaseHistory> getPurchaseHistoryFromHistoryRecords(QStoreProductType productType, List<? extends PurchaseHistoryRecord> historyRecords) {
        ArrayList arrayList = new ArrayList();
        C2515C c2515c = null;
        if (historyRecords.isEmpty()) {
            historyRecords = null;
        }
        if (historyRecords != null) {
            for (PurchaseHistoryRecord purchaseHistoryRecord : historyRecords) {
                arrayList.add(new PurchaseHistory(productType, purchaseHistoryRecord));
                this.logger.debug("queryPurchaseHistoryAsync() -> purchase history for " + productType + " is retrieved " + UtilsKt.getDescription(purchaseHistoryRecord));
            }
            c2515c = C2515C.f34653a;
        }
        if (c2515c == null) {
            this.logger.release("queryPurchaseHistoryAsync() -> purchase history for " + productType + " is empty.");
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void makePurchase(Activity activity, QProduct product, String offerId, Boolean applyOffer, UpdatePurchaseInfo updatePurchaseInfo) {
        executeOnMainThread(new C21951(product, activity, offerId, applyOffer, updatePurchaseInfo));
    }

    public static /* synthetic */ void makePurchase$default(QonversionBillingService qonversionBillingService, Activity activity, QProduct qProduct, String str, Boolean bool, UpdatePurchaseInfo updatePurchaseInfo, int i5, Object obj) {
        if ((i5 & 16) != 0) {
            updatePurchaseInfo = null;
        }
        qonversionBillingService.makePurchase(activity, qProduct, str, bool, updatePurchaseInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBillingClientUnavailable$lambda$17$lambda$16$lambda$15(l lVar, BillingError error) {
        AbstractC3340k.e(error, "$error");
        lVar.invoke(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void purchase$handlePurchase(PurchaseModelInternalEnriched purchaseModelInternalEnriched, QonversionBillingService qonversionBillingService, Activity activity) {
        if (purchaseModelInternalEnriched.getOldProduct() == null || !UtilsKt.getHasAnyStoreDetails(purchaseModelInternalEnriched.getOldProduct())) {
            QProduct product = purchaseModelInternalEnriched.getProduct();
            QPurchaseOptions options = purchaseModelInternalEnriched.getOptions();
            String offerId$sdk_release = options != null ? options.getOfferId() : null;
            QPurchaseOptions options2 = purchaseModelInternalEnriched.getOptions();
            makePurchase$default(qonversionBillingService, activity, product, offerId$sdk_release, options2 != null ? Boolean.valueOf(options2.getApplyOffer()) : null, null, 16, null);
            return;
        }
        QProduct product2 = purchaseModelInternalEnriched.getProduct();
        QPurchaseOptions options3 = purchaseModelInternalEnriched.getOptions();
        String offerId$sdk_release2 = options3 != null ? options3.getOfferId() : null;
        QPurchaseOptions options4 = purchaseModelInternalEnriched.getOptions();
        qonversionBillingService.updatePurchase(activity, product2, offerId$sdk_release2, options4 != null ? Boolean.valueOf(options4.getApplyOffer()) : null, purchaseModelInternalEnriched.getOldProduct(), purchaseModelInternalEnriched.getUpdatePolicy());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryPurchaseHistoryAsync(QStoreProductType productType, l onQueryHistoryCompleted, l onQueryHistoryFailed) {
        this.logger.debug("queryPurchaseHistoryAsync() -> Querying purchase history for type " + QStoreProductType.INSTANCE);
        executeOnMainThread(new C21991(productType, onQueryHistoryFailed, onQueryHistoryCompleted));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryPurchasesHistory$fireOnFailed(l lVar, QonversionBillingService qonversionBillingService, BillingError billingError) {
        lVar.invoke(billingError);
        qonversionBillingService.logger.error("queryPurchasesHistory() -> " + billingError);
    }

    private final void updatePurchase(Activity activity, QProduct product, String offerId, Boolean applyOffer, QProduct oldProduct, QPurchaseUpdatePolicy updatePolicy) {
        IBillingClientWrapper<?, ?> iBillingClientWrapperChooseBillingClientWrapperForProductPurchase = chooseBillingClientWrapperForProductPurchase(product);
        if (iBillingClientWrapperChooseBillingClientWrapperForProductPurchase == null) {
            return;
        }
        iBillingClientWrapperChooseBillingClientWrapperForProductPurchase.queryPurchaseHistoryForProduct(oldProduct, new C22031(activity, product, offerId, applyOffer, updatePolicy, oldProduct));
    }

    @Override // com.qonversion.android.sdk.internal.billing.BillingService
    public void consumeHistoryRecords(@NotNull List<PurchaseHistory> historyRecords) {
        AbstractC3340k.e(historyRecords, "historyRecords");
        if (this.isAnalyticsMode) {
            return;
        }
        for (PurchaseHistory purchaseHistory : historyRecords) {
            int i5 = WhenMappings.$EnumSwitchMapping$0[purchaseHistory.getType().ordinal()];
            if (i5 == 1) {
                String purchaseToken = purchaseHistory.getHistoryRecord().getPurchaseToken();
                AbstractC3340k.d(purchaseToken, "getPurchaseToken(...)");
                consume(purchaseToken);
            } else if (i5 == 2) {
                String purchaseToken2 = purchaseHistory.getHistoryRecord().getPurchaseToken();
                AbstractC3340k.d(purchaseToken2, "getPurchaseToken(...)");
                acknowledge(purchaseToken2);
            }
        }
    }

    @Override // com.qonversion.android.sdk.internal.billing.BillingService
    public void consumePurchases(@NotNull List<? extends Purchase> purchases) {
        Purchase purchase;
        String productId;
        AbstractC3340k.e(purchases, "purchases");
        if (this.isAnalyticsMode) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : purchases) {
            if (((Purchase) obj).getPurchaseState() == 1) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && (productId = UtilsKt.getProductId((purchase = (Purchase) it.next()))) != null) {
            getStoreProductType(productId, new QonversionBillingService$consumePurchases$2$1(this, productId), new QonversionBillingService$consumePurchases$2$2(this, purchase));
        }
    }

    @Override // com.qonversion.android.sdk.internal.billing.BillingService
    public void enrichStoreData(@NotNull List<QProduct> products) {
        AbstractC3340k.e(products, "products");
        for (QProduct qProduct : products) {
            String storeID = qProduct.getStoreID();
            if (storeID != null) {
                qProduct.setSkuDetail(this.legacyBillingClientWrapper.getStoreData(storeID));
                ProductDetails storeData2 = this.billingClientWrapper.getStoreData(new ProductStoreId(storeID, qProduct.getBasePlanID(), null, 4, null));
                if (storeData2 != null) {
                    qProduct.setStoreProductDetails$sdk_release(storeData2);
                }
            }
        }
    }

    @Override // com.qonversion.android.sdk.internal.billing.BillingService
    public void enrichStoreDataAsync(@NotNull List<QProduct> products, @NotNull l onFailed, @NotNull l onEnriched) {
        AbstractC3340k.e(products, "products");
        AbstractC3340k.e(onFailed, "onFailed");
        AbstractC3340k.e(onEnriched, "onEnriched");
        List<QProduct> list = products;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((QProduct) it.next()).getStoreID() != null) {
                    executeOnMainThread(new AnonymousClass2(onFailed, products, onEnriched));
                    return;
                }
            }
        }
        onEnriched.invoke(products);
    }

    @Override // com.qonversion.android.sdk.internal.billing.BillingService
    public void getStoreProductType(@NotNull String storeId, @NotNull l onFailed, @NotNull l onSuccess) {
        AbstractC3340k.e(storeId, "storeId");
        AbstractC3340k.e(onFailed, "onFailed");
        AbstractC3340k.e(onSuccess, "onSuccess");
        this.billingClientWrapper.getStoreProductType(storeId, new C21941(storeId, onSuccess, onFailed), onSuccess);
    }

    @Override // com.qonversion.android.sdk.internal.billing.BillingClientHolder.ConnectionListener
    public void onBillingClientConnected() {
        executeRequestsFromQueue();
    }

    @Override // com.qonversion.android.sdk.internal.billing.BillingClientHolder.ConnectionListener
    public void onBillingClientUnavailable(@NotNull final BillingError error) {
        AbstractC3340k.e(error, "error");
        synchronized (this) {
            while (!this.requestsQueue.isEmpty()) {
                final l lVarRemove = this.requestsQueue.remove();
                this.mainHandler.post(new Runnable() { // from class: com.qonversion.android.sdk.internal.billing.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        QonversionBillingService.onBillingClientUnavailable$lambda$17$lambda$16$lambda$15(lVarRemove, error);
                    }
                });
            }
        }
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(@NotNull BillingResult billingResult, @Nullable List<? extends Purchase> purchases) {
        AbstractC3340k.e(billingResult, "billingResult");
        if (UtilsKt.isOk(billingResult) && purchases != null) {
            this.logger.debug("onPurchasesUpdated() -> purchases updated. " + UtilsKt.getDescription(billingResult) + StringUtils.SPACE);
            this.purchasesListener.onPurchasesCompleted(purchases);
            return;
        }
        String description = UtilsKt.getDescription(billingResult);
        this.purchasesListener.onPurchasesFailed(new BillingError(billingResult.getResponseCode(), description), purchases == null ? v.f35432a : purchases);
        this.logger.error("onPurchasesUpdated() -> failed to update purchases " + description);
        List<? extends Purchase> list = purchases;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.logger.release("Purchases: " + o.w0(purchases, ", ", null, null, C21961.INSTANCE, 30));
    }

    @Override // com.qonversion.android.sdk.internal.billing.BillingService
    public void purchase(@NotNull Activity activity, @NotNull PurchaseModelInternalEnriched purchaseModel) {
        AbstractC3340k.e(activity, "activity");
        AbstractC3340k.e(purchaseModel, "purchaseModel");
        if (UtilsKt.getHasAnyStoreDetails(purchaseModel.getProduct())) {
            purchase$handlePurchase(purchaseModel, this, activity);
        } else {
            enrichStoreDataAsync(m.s0(new QProduct[]{purchaseModel.getProduct(), purchaseModel.getOldProduct()}), new C21971(), new C21982(purchaseModel, this, activity));
        }
    }

    @Override // com.qonversion.android.sdk.internal.billing.BillingService
    public void queryPurchases(@NotNull l onFailed, @NotNull l onCompleted) {
        AbstractC3340k.e(onFailed, "onFailed");
        AbstractC3340k.e(onCompleted, "onCompleted");
        this.logger.debug("queryPurchases() -> Querying purchases from cache for subs and inapp");
        executeOnMainThread(new C22001(onFailed, this, onCompleted));
    }

    @Override // com.qonversion.android.sdk.internal.billing.BillingService
    public void queryPurchasesHistory(@NotNull l onFailed, @NotNull l onCompleted) {
        AbstractC3340k.e(onFailed, "onFailed");
        AbstractC3340k.e(onCompleted, "onCompleted");
        queryPurchaseHistoryAsync(QStoreProductType.Subscription, new C22011(onCompleted, onFailed), new C22022(onFailed, this));
    }
}
