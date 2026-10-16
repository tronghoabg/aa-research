package com.qonversion.android.sdk.internal.billing;

import ef.C2515C;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingError;", "error", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class QonversionBillingService$consumePurchases$2$1 extends AbstractC3343n implements l {
    final /* synthetic */ String $productId;
    final /* synthetic */ QonversionBillingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QonversionBillingService$consumePurchases$2$1(QonversionBillingService qonversionBillingService, String str) {
        super(1);
        this.this$0 = qonversionBillingService;
        this.$productId = str;
    }

    @Override // tf.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BillingError) obj);
        return C2515C.f34653a;
    }

    public final void invoke(@NotNull BillingError error) {
        AbstractC3340k.e(error, "error");
        this.this$0.logger.error("Failed to fetch product type for purchase " + this.$productId + " - " + error.getMessage());
    }
}
