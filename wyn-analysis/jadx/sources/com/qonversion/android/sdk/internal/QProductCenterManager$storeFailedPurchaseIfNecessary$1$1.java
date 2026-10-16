package com.qonversion.android.sdk.internal;

import com.qonversion.android.sdk.internal.billing.BillingError;
import com.qonversion.android.sdk.internal.purchase.Purchase;
import ef.C2515C;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingError;", "it", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class QProductCenterManager$storeFailedPurchaseIfNecessary$1$1 extends AbstractC3343n implements l {
    final /* synthetic */ Purchase $purchaseInfo;
    final /* synthetic */ QProductCenterManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QProductCenterManager$storeFailedPurchaseIfNecessary$1$1(QProductCenterManager qProductCenterManager, Purchase purchase) {
        super(1);
        this.this$0 = qProductCenterManager;
        this.$purchaseInfo = purchase;
    }

    @Override // tf.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BillingError) obj);
        return C2515C.f34653a;
    }

    public final void invoke(@NotNull BillingError it) {
        AbstractC3340k.e(it, "it");
        QProductCenterManager.storeFailedPurchaseIfNecessary$storePurchase(this.this$0, this.$purchaseInfo);
    }
}
