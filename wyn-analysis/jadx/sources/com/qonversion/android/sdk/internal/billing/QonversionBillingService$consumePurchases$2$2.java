package com.qonversion.android.sdk.internal.billing;

import com.android.billingclient.api.Purchase;
import com.qonversion.android.sdk.internal.dto.QStoreProductType;
import ef.C2515C;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;", "productType", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class QonversionBillingService$consumePurchases$2$2 extends AbstractC3343n implements l {
    final /* synthetic */ Purchase $purchase;
    final /* synthetic */ QonversionBillingService this$0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QonversionBillingService$consumePurchases$2$2(QonversionBillingService qonversionBillingService, Purchase purchase) {
        super(1);
        this.this$0 = qonversionBillingService;
        this.$purchase = purchase;
    }

    @Override // tf.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((QStoreProductType) obj);
        return C2515C.f34653a;
    }

    public final void invoke(@NotNull QStoreProductType productType) {
        AbstractC3340k.e(productType, "productType");
        int i5 = WhenMappings.$EnumSwitchMapping$0[productType.ordinal()];
        if (i5 == 1) {
            QonversionBillingService qonversionBillingService = this.this$0;
            String purchaseToken = this.$purchase.getPurchaseToken();
            AbstractC3340k.d(purchaseToken, "getPurchaseToken(...)");
            qonversionBillingService.consume(purchaseToken);
            return;
        }
        if (i5 == 2 && !this.$purchase.isAcknowledged()) {
            QonversionBillingService qonversionBillingService2 = this.this$0;
            String purchaseToken2 = this.$purchase.getPurchaseToken();
            AbstractC3340k.d(purchaseToken2, "getPurchaseToken(...)");
            qonversionBillingService2.acknowledge(purchaseToken2);
        }
    }
}
